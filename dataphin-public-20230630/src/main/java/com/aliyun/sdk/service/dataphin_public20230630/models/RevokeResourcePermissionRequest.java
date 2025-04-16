// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link RevokeResourcePermissionRequest} extends {@link RequestModel}
 *
 * <p>RevokeResourcePermissionRequest</p>
 */
public class RevokeResourcePermissionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RevokeCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private RevokeCommand revokeCommand;

    private RevokeResourcePermissionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.revokeCommand = builder.revokeCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeResourcePermissionRequest create() {
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
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return revokeCommand
     */
    public RevokeCommand getRevokeCommand() {
        return this.revokeCommand;
    }

    public static final class Builder extends Request.Builder<RevokeResourcePermissionRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private RevokeCommand revokeCommand; 

        private Builder() {
            super();
        } 

        private Builder(RevokeResourcePermissionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.revokeCommand = request.revokeCommand;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder revokeCommand(RevokeCommand revokeCommand) {
            String revokeCommandShrink = shrink(revokeCommand, "RevokeCommand", "json");
            this.putBodyParameter("RevokeCommand", revokeCommandShrink);
            this.revokeCommand = revokeCommand;
            return this;
        }

        @Override
        public RevokeResourcePermissionRequest build() {
            return new RevokeResourcePermissionRequest(this);
        } 

    } 

    /**
     * 
     * {@link RevokeResourcePermissionRequest} extends {@link TeaModel}
     *
     * <p>RevokeResourcePermissionRequest</p>
     */
    public static class ResourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        private ResourceList(Builder builder) {
            this.resourceId = builder.resourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceList create() {
            return builder().build();
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        public static final class Builder {
            private String resourceId; 

            private Builder() {
            } 

            private Builder(ResourceList model) {
                this.resourceId = model.resourceId;
            } 

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            public ResourceList build() {
                return new ResourceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link RevokeResourcePermissionRequest} extends {@link TeaModel}
     *
     * <p>RevokeResourcePermissionRequest</p>
     */
    public static class RevokeCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperateList")
        private java.util.List<String> operateList;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("ResourceList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<ResourceList> resourceList;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("UserId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userId;

        private RevokeCommand(Builder builder) {
            this.operateList = builder.operateList;
            this.reason = builder.reason;
            this.resourceList = builder.resourceList;
            this.resourceType = builder.resourceType;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RevokeCommand create() {
            return builder().build();
        }

        /**
         * @return operateList
         */
        public java.util.List<String> getOperateList() {
            return this.operateList;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return resourceList
         */
        public java.util.List<ResourceList> getResourceList() {
            return this.resourceList;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List<String> operateList; 
            private String reason; 
            private java.util.List<ResourceList> resourceList; 
            private String resourceType; 
            private String userId; 

            private Builder() {
            } 

            private Builder(RevokeCommand model) {
                this.operateList = model.operateList;
                this.reason = model.reason;
                this.resourceList = model.resourceList;
                this.resourceType = model.resourceType;
                this.userId = model.userId;
            } 

            /**
             * OperateList.
             */
            public Builder operateList(java.util.List<String> operateList) {
                this.operateList = operateList;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder resourceList(java.util.List<ResourceList> resourceList) {
                this.resourceList = resourceList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PHYSICAL_TABLE</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>13131</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public RevokeCommand build() {
                return new RevokeCommand(this);
            } 

        } 

    }
}
