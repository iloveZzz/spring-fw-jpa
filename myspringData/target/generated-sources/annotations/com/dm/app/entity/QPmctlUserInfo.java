package com.dm.app.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPmctlUserInfo is a Querydsl query type for PmctlUserInfo
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPmctlUserInfo extends EntityPathBase<PmctlUserInfo> {

    private static final long serialVersionUID = 4078033L;

    public static final QPmctlUserInfo pmctlUserInfo = new QPmctlUserInfo("pmctlUserInfo");

    public final StringPath areaCode = createString("areaCode");

    public final StringPath buyerLevel = createString("buyerLevel");

    public final StringPath certificateCode = createString("certificateCode");

    public final StringPath certificateType = createString("certificateType");

    public final StringPath certificateUrl = createString("certificateUrl");

    public final StringPath contactPhone = createString("contactPhone");

    public final StringPath createDate = createString("createDate");

    public final StringPath createTime = createString("createTime");

    public final StringPath field1 = createString("field1");

    public final StringPath field2 = createString("field2");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath loginName = createString("loginName");

    public final StringPath mobilePhone = createString("mobilePhone");

    public final StringPath nickName = createString("nickName");

    public final StringPath passWord = createString("passWord");

    public final StringPath realName = createString("realName");

    public final StringPath supplierLevel = createString("supplierLevel");

    public final StringPath userAddr = createString("userAddr");

    public final StringPath userCode = createString("userCode");

    public final StringPath userEmail = createString("userEmail");

    public final StringPath userState = createString("userState");

    public QPmctlUserInfo(String variable) {
        super(PmctlUserInfo.class, forVariable(variable));
    }

    public QPmctlUserInfo(Path<? extends PmctlUserInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPmctlUserInfo(PathMetadata<?> metadata) {
        super(PmctlUserInfo.class, metadata);
    }

}

