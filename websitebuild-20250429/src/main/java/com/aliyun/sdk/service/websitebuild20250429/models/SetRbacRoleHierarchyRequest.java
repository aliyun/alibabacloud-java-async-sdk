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
 * {@link SetRbacRoleHierarchyRequest} extends {@link RequestModel}
 *
 * <p>SetRbacRoleHierarchyRequest</p>
 */
public class SetRbacRoleHierarchyRequest extends Request {
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

    private SetRbacRoleHierarchyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.childRoleId = builder.childRoleId;
        this.parentRoleId = builder.parentRoleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetRbacRoleHierarchyRequest create() {
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

    public static final class Builder extends Request.Builder<SetRbacRoleHierarchyRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String childRoleId; 
        private String parentRoleId; 

        private Builder() {
            super();
        } 

        private Builder(SetRbacRoleHierarchyRequest request) {
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
         * <p>The business ID.</p>
         * 
         * <strong>example:</strong>
         * <p>WD20250703155602000001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>The child role ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fc94cc51-310f-4485-adb2-ed8c706aff3b</p>
         */
        public Builder childRoleId(String childRoleId) {
            this.putQueryParameter("ChildRoleId", childRoleId);
            this.childRoleId = childRoleId;
            return this;
        }

        /**
         * <p>The parent role ID.</p>
         * 
         * <strong>example:</strong>
         * <p>71e07711-9a17-49f4-9f83-387a60ee5b64</p>
         */
        public Builder parentRoleId(String parentRoleId) {
            this.putQueryParameter("ParentRoleId", parentRoleId);
            this.parentRoleId = parentRoleId;
            return this;
        }

        @Override
        public SetRbacRoleHierarchyRequest build() {
            return new SetRbacRoleHierarchyRequest(this);
        } 

    } 

}
