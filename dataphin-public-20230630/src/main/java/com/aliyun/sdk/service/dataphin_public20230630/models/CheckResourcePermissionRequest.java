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
 * {@link CheckResourcePermissionRequest} extends {@link RequestModel}
 *
 * <p>CheckResourcePermissionRequest</p>
 */
public class CheckResourcePermissionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CheckCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private CheckCommand checkCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private CheckResourcePermissionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.checkCommand = builder.checkCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckResourcePermissionRequest create() {
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
     * @return checkCommand
     */
    public CheckCommand getCheckCommand() {
        return this.checkCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<CheckResourcePermissionRequest, Builder> {
        private String regionId; 
        private CheckCommand checkCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(CheckResourcePermissionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.checkCommand = request.checkCommand;
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
        public Builder checkCommand(CheckCommand checkCommand) {
            String checkCommandShrink = shrink(checkCommand, "CheckCommand", "json");
            this.putBodyParameter("CheckCommand", checkCommandShrink);
            this.checkCommand = checkCommand;
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
        public CheckResourcePermissionRequest build() {
            return new CheckResourcePermissionRequest(this);
        } 

    } 

    /**
     * 
     * {@link CheckResourcePermissionRequest} extends {@link TeaModel}
     *
     * <p>CheckResourcePermissionRequest</p>
     */
    public static class ResourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceId")
        @com.aliyun.core.annotation.Validation(required = true)
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

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>hadoop.300000806.data_distill.behavior_gameinfor_01</p>
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
     * {@link CheckResourcePermissionRequest} extends {@link TeaModel}
     *
     * <p>CheckResourcePermissionRequest</p>
     */
    public static class CheckCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Operate")
        @com.aliyun.core.annotation.Validation(required = true)
        private String operate;

        @com.aliyun.core.annotation.NameInMap("ResourceList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<ResourceList> resourceList;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("UserId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userId;

        private CheckCommand(Builder builder) {
            this.operate = builder.operate;
            this.resourceList = builder.resourceList;
            this.resourceType = builder.resourceType;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckCommand create() {
            return builder().build();
        }

        /**
         * @return operate
         */
        public String getOperate() {
            return this.operate;
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
            private String operate; 
            private java.util.List<ResourceList> resourceList; 
            private String resourceType; 
            private String userId; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>UPDATE</p>
             */
            public Builder operate(String operate) {
                this.operate = operate;
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
             * <p>323231</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public CheckCommand build() {
                return new CheckCommand(this);
            } 

        } 

    }
}
