// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RemoveRbacRoleHierarchyRequest} extends {@link RequestModel}
 *
 * <p>RemoveRbacRoleHierarchyRequest</p>
 */
public class RemoveRbacRoleHierarchyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChildRoleId")
    private String childRoleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentRoleId")
    private String parentRoleId;

    private RemoveRbacRoleHierarchyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.childRoleId = builder.childRoleId;
        this.parentRoleId = builder.parentRoleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveRbacRoleHierarchyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return childRoleId
     */
    public String getChildRoleId() {
        return this.childRoleId;
    }

    /**
     * @return parentRoleId
     */
    public String getParentRoleId() {
        return this.parentRoleId;
    }

    public static final class Builder extends Request.Builder<RemoveRbacRoleHierarchyRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String childRoleId; 
        private String parentRoleId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveRbacRoleHierarchyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.childRoleId = request.childRoleId;
            this.parentRoleId = request.parentRoleId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * ChildRoleId.
         */
        public Builder childRoleId(String childRoleId) {
            this.putQueryParameter("ChildRoleId", childRoleId);
            this.childRoleId = childRoleId;
            return this;
        }

        /**
         * ParentRoleId.
         */
        public Builder parentRoleId(String parentRoleId) {
            this.putQueryParameter("ParentRoleId", parentRoleId);
            this.parentRoleId = parentRoleId;
            return this;
        }

        @Override
        public RemoveRbacRoleHierarchyRequest build() {
            return new RemoveRbacRoleHierarchyRequest(this);
        } 

    } 

}
