// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeProcessTaskCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeProcessTaskCountRequest</p>
 */
public class DescribeProcessTaskCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityUuidList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > entityUuidList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private String roleType;

    private DescribeProcessTaskCountRequest(Builder builder) {
        super(builder);
        this.entityUuidList = builder.entityUuidList;
        this.lang = builder.lang;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProcessTaskCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entityUuidList
     */
    public java.util.List < String > getEntityUuidList() {
        return this.entityUuidList;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public String getRoleType() {
        return this.roleType;
    }

    public static final class Builder extends Request.Builder<DescribeProcessTaskCountRequest, Builder> {
        private java.util.List < String > entityUuidList; 
        private String lang; 
        private Long roleFor; 
        private String roleType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeProcessTaskCountRequest request) {
            super(request);
            this.entityUuidList = request.entityUuidList;
            this.lang = request.lang;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder entityUuidList(java.util.List < String > entityUuidList) {
            this.putQueryParameter("EntityUuidList", entityUuidList);
            this.entityUuidList = entityUuidList;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putQueryParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * RoleType.
         */
        public Builder roleType(String roleType) {
            this.putQueryParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        @Override
        public DescribeProcessTaskCountRequest build() {
            return new DescribeProcessTaskCountRequest(this);
        } 

    } 

}
