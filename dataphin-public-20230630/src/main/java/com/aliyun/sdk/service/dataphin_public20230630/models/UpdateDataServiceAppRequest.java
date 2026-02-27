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
 * {@link UpdateDataServiceAppRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataServiceAppRequest</p>
 */
public class UpdateDataServiceAppRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateCommand updateCommand;

    private UpdateDataServiceAppRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.updateCommand = builder.updateCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataServiceAppRequest create() {
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
     * @return updateCommand
     */
    public UpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static final class Builder extends Request.Builder<UpdateDataServiceAppRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private UpdateCommand updateCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataServiceAppRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.updateCommand = request.updateCommand;
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
        public Builder updateCommand(UpdateCommand updateCommand) {
            String updateCommandShrink = shrink(updateCommand, "UpdateCommand", "json");
            this.putBodyParameter("UpdateCommand", updateCommandShrink);
            this.updateCommand = updateCommand;
            return this;
        }

        @Override
        public UpdateDataServiceAppRequest build() {
            return new UpdateDataServiceAppRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDataServiceAppRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataServiceAppRequest</p>
     */
    public static class UpdateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppGroupId")
        private Integer appGroupId;

        @com.aliyun.core.annotation.NameInMap("AppId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("OwnerIds")
        private java.util.List<String> ownerIds;

        @com.aliyun.core.annotation.NameInMap("Scenarios")
        private String scenarios;

        private UpdateCommand(Builder builder) {
            this.appGroupId = builder.appGroupId;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.ownerIds = builder.ownerIds;
            this.scenarios = builder.scenarios;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateCommand create() {
            return builder().build();
        }

        /**
         * @return appGroupId
         */
        public Integer getAppGroupId() {
            return this.appGroupId;
        }

        /**
         * @return appId
         */
        public Integer getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return ownerIds
         */
        public java.util.List<String> getOwnerIds() {
            return this.ownerIds;
        }

        /**
         * @return scenarios
         */
        public String getScenarios() {
            return this.scenarios;
        }

        public static final class Builder {
            private Integer appGroupId; 
            private Integer appId; 
            private String appName; 
            private java.util.List<String> ownerIds; 
            private String scenarios; 

            private Builder() {
            } 

            private Builder(UpdateCommand model) {
                this.appGroupId = model.appGroupId;
                this.appId = model.appId;
                this.appName = model.appName;
                this.ownerIds = model.ownerIds;
                this.scenarios = model.scenarios;
            } 

            /**
             * AppGroupId.
             */
            public Builder appGroupId(Integer appGroupId) {
                this.appGroupId = appGroupId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder appId(Integer appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * OwnerIds.
             */
            public Builder ownerIds(java.util.List<String> ownerIds) {
                this.ownerIds = ownerIds;
                return this;
            }

            /**
             * Scenarios.
             */
            public Builder scenarios(String scenarios) {
                this.scenarios = scenarios;
                return this;
            }

            public UpdateCommand build() {
                return new UpdateCommand(this);
            } 

        } 

    }
}
