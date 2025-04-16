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
 * {@link GrantResourcePermissionRequest} extends {@link RequestModel}
 *
 * <p>GrantResourcePermissionRequest</p>
 */
public class GrantResourcePermissionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GrantCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private GrantCommand grantCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private GrantResourcePermissionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.grantCommand = builder.grantCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantResourcePermissionRequest create() {
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
     * @return grantCommand
     */
    public GrantCommand getGrantCommand() {
        return this.grantCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<GrantResourcePermissionRequest, Builder> {
        private String regionId; 
        private GrantCommand grantCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(GrantResourcePermissionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.grantCommand = request.grantCommand;
            this.opTenantId = request.opTenantId;
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
         */
        public Builder grantCommand(GrantCommand grantCommand) {
            String grantCommandShrink = shrink(grantCommand, "GrantCommand", "json");
            this.putBodyParameter("GrantCommand", grantCommandShrink);
            this.grantCommand = grantCommand;
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

        @Override
        public GrantResourcePermissionRequest build() {
            return new GrantResourcePermissionRequest(this);
        } 

    } 

    /**
     * 
     * {@link GrantResourcePermissionRequest} extends {@link TeaModel}
     *
     * <p>GrantResourcePermissionRequest</p>
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
     * {@link GrantResourcePermissionRequest} extends {@link TeaModel}
     *
     * <p>GrantResourcePermissionRequest</p>
     */
    public static class GrantCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EffectiveEnd")
        @com.aliyun.core.annotation.Validation(required = true)
        private String effectiveEnd;

        @com.aliyun.core.annotation.NameInMap("OperateList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> operateList;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("ResourceList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<ResourceList> resourceList;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("UserIdList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> userIdList;

        private GrantCommand(Builder builder) {
            this.effectiveEnd = builder.effectiveEnd;
            this.operateList = builder.operateList;
            this.reason = builder.reason;
            this.resourceList = builder.resourceList;
            this.resourceType = builder.resourceType;
            this.userIdList = builder.userIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GrantCommand create() {
            return builder().build();
        }

        /**
         * @return effectiveEnd
         */
        public String getEffectiveEnd() {
            return this.effectiveEnd;
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
         * @return userIdList
         */
        public java.util.List<String> getUserIdList() {
            return this.userIdList;
        }

        public static final class Builder {
            private String effectiveEnd; 
            private java.util.List<String> operateList; 
            private String reason; 
            private java.util.List<ResourceList> resourceList; 
            private String resourceType; 
            private java.util.List<String> userIdList; 

            private Builder() {
            } 

            private Builder(GrantCommand model) {
                this.effectiveEnd = model.effectiveEnd;
                this.operateList = model.operateList;
                this.reason = model.reason;
                this.resourceList = model.resourceList;
                this.resourceType = model.resourceType;
                this.userIdList = model.userIdList;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1717343597000</p>
             */
            public Builder effectiveEnd(String effectiveEnd) {
                this.effectiveEnd = effectiveEnd;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
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
             */
            public Builder userIdList(java.util.List<String> userIdList) {
                this.userIdList = userIdList;
                return this;
            }

            public GrantCommand build() {
                return new GrantCommand(this);
            } 

        } 

    }
}
