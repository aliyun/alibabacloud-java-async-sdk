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
 * {@link CreateDataServiceAppRequest} extends {@link RequestModel}
 *
 * <p>CreateDataServiceAppRequest</p>
 */
public class CreateDataServiceAppRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateCommand createCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private CreateDataServiceAppRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createCommand = builder.createCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataServiceAppRequest create() {
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
     * @return createCommand
     */
    public CreateCommand getCreateCommand() {
        return this.createCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<CreateDataServiceAppRequest, Builder> {
        private String regionId; 
        private CreateCommand createCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataServiceAppRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createCommand = request.createCommand;
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
        public Builder createCommand(CreateCommand createCommand) {
            String createCommandShrink = shrink(createCommand, "CreateCommand", "json");
            this.putBodyParameter("CreateCommand", createCommandShrink);
            this.createCommand = createCommand;
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
        public CreateDataServiceAppRequest build() {
            return new CreateDataServiceAppRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDataServiceAppRequest} extends {@link TeaModel}
     *
     * <p>CreateDataServiceAppRequest</p>
     */
    public static class CreateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppGroupId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer appGroupId;

        @com.aliyun.core.annotation.NameInMap("AppKey")
        @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 8)
        private String appKey;

        @com.aliyun.core.annotation.NameInMap("AppName")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 4)
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppSecret")
        @com.aliyun.core.annotation.Validation(maxLength = 127, minLength = 8)
        private String appSecret;

        @com.aliyun.core.annotation.NameInMap("OwnerIds")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> ownerIds;

        @com.aliyun.core.annotation.NameInMap("Scenarios")
        @com.aliyun.core.annotation.Validation(required = true)
        private String scenarios;

        private CreateCommand(Builder builder) {
            this.appGroupId = builder.appGroupId;
            this.appKey = builder.appKey;
            this.appName = builder.appName;
            this.appSecret = builder.appSecret;
            this.ownerIds = builder.ownerIds;
            this.scenarios = builder.scenarios;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateCommand create() {
            return builder().build();
        }

        /**
         * @return appGroupId
         */
        public Integer getAppGroupId() {
            return this.appGroupId;
        }

        /**
         * @return appKey
         */
        public String getAppKey() {
            return this.appKey;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appSecret
         */
        public String getAppSecret() {
            return this.appSecret;
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
            private String appKey; 
            private String appName; 
            private String appSecret; 
            private java.util.List<String> ownerIds; 
            private String scenarios; 

            private Builder() {
            } 

            private Builder(CreateCommand model) {
                this.appGroupId = model.appGroupId;
                this.appKey = model.appKey;
                this.appName = model.appName;
                this.appSecret = model.appSecret;
                this.ownerIds = model.ownerIds;
                this.scenarios = model.scenarios;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>200000000</p>
             */
            public Builder appGroupId(Integer appGroupId) {
                this.appGroupId = appGroupId;
                return this;
            }

            /**
             * AppKey.
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>默认应用</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * AppSecret.
             */
            public Builder appSecret(String appSecret) {
                this.appSecret = appSecret;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder ownerIds(java.util.List<String> ownerIds) {
                this.ownerIds = ownerIds;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>数据分析</p>
             */
            public Builder scenarios(String scenarios) {
                this.scenarios = scenarios;
                return this;
            }

            public CreateCommand build() {
                return new CreateCommand(this);
            } 

        } 

    }
}
