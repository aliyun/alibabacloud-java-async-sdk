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
 * {@link PublishKgSchemaRequest} extends {@link RequestModel}
 *
 * <p>PublishKgSchemaRequest</p>
 */
public class PublishKgSchemaRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PublishCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private PublishCommand publishCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private PublishKgSchemaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.publishCommand = builder.publishCommand;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishKgSchemaRequest create() {
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
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    /**
     * @return publishCommand
     */
    public PublishCommand getPublishCommand() {
        return this.publishCommand;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<PublishKgSchemaRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private String opUserId; 
        private PublishCommand publishCommand; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(PublishKgSchemaRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.publishCommand = request.publishCommand;
            this.workspaceId = request.workspaceId;
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
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder publishCommand(PublishCommand publishCommand) {
            String publishCommandShrink = shrink(publishCommand, "PublishCommand", "json");
            this.putBodyParameter("PublishCommand", publishCommandShrink);
            this.publishCommand = publishCommand;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f1d4559a4db044158305e2d89bccf81f</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public PublishKgSchemaRequest build() {
            return new PublishKgSchemaRequest(this);
        } 

    } 

    /**
     * 
     * {@link PublishKgSchemaRequest} extends {@link TeaModel}
     *
     * <p>PublishKgSchemaRequest</p>
     */
    public static class BackFillDefaultValuePolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        @com.aliyun.core.annotation.Validation(required = true)
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("PropertyCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String propertyCode;

        private BackFillDefaultValuePolicy(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.propertyCode = builder.propertyCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackFillDefaultValuePolicy create() {
            return builder().build();
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return propertyCode
         */
        public String getPropertyCode() {
            return this.propertyCode;
        }

        public static final class Builder {
            private String defaultValue; 
            private String propertyCode; 

            private Builder() {
            } 

            private Builder(BackFillDefaultValuePolicy model) {
                this.defaultValue = model.defaultValue;
                this.propertyCode = model.propertyCode;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder propertyCode(String propertyCode) {
                this.propertyCode = propertyCode;
                return this;
            }

            public BackFillDefaultValuePolicy build() {
                return new BackFillDefaultValuePolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link PublishKgSchemaRequest} extends {@link TeaModel}
     *
     * <p>PublishKgSchemaRequest</p>
     */
    public static class DataAdjustmentPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackFillDefaultValuePolicy")
        @com.aliyun.core.annotation.Validation(required = true)
        private BackFillDefaultValuePolicy backFillDefaultValuePolicy;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("TypeCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String typeCode;

        private DataAdjustmentPolicies(Builder builder) {
            this.backFillDefaultValuePolicy = builder.backFillDefaultValuePolicy;
            this.policyType = builder.policyType;
            this.type = builder.type;
            this.typeCode = builder.typeCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataAdjustmentPolicies create() {
            return builder().build();
        }

        /**
         * @return backFillDefaultValuePolicy
         */
        public BackFillDefaultValuePolicy getBackFillDefaultValuePolicy() {
            return this.backFillDefaultValuePolicy;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return typeCode
         */
        public String getTypeCode() {
            return this.typeCode;
        }

        public static final class Builder {
            private BackFillDefaultValuePolicy backFillDefaultValuePolicy; 
            private String policyType; 
            private String type; 
            private String typeCode; 

            private Builder() {
            } 

            private Builder(DataAdjustmentPolicies model) {
                this.backFillDefaultValuePolicy = model.backFillDefaultValuePolicy;
                this.policyType = model.policyType;
                this.type = model.type;
                this.typeCode = model.typeCode;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder backFillDefaultValuePolicy(BackFillDefaultValuePolicy backFillDefaultValuePolicy) {
                this.backFillDefaultValuePolicy = backFillDefaultValuePolicy;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>BackFillDefault</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ENTITY</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Product</p>
             */
            public Builder typeCode(String typeCode) {
                this.typeCode = typeCode;
                return this;
            }

            public DataAdjustmentPolicies build() {
                return new DataAdjustmentPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link PublishKgSchemaRequest} extends {@link TeaModel}
     *
     * <p>PublishKgSchemaRequest</p>
     */
    public static class PublishCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataAdjustmentPolicies")
        private java.util.List<DataAdjustmentPolicies> dataAdjustmentPolicies;

        @com.aliyun.core.annotation.NameInMap("Description")
        @com.aliyun.core.annotation.Validation(required = true)
        private String description;

        private PublishCommand(Builder builder) {
            this.dataAdjustmentPolicies = builder.dataAdjustmentPolicies;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishCommand create() {
            return builder().build();
        }

        /**
         * @return dataAdjustmentPolicies
         */
        public java.util.List<DataAdjustmentPolicies> getDataAdjustmentPolicies() {
            return this.dataAdjustmentPolicies;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private java.util.List<DataAdjustmentPolicies> dataAdjustmentPolicies; 
            private String description; 

            private Builder() {
            } 

            private Builder(PublishCommand model) {
                this.dataAdjustmentPolicies = model.dataAdjustmentPolicies;
                this.description = model.description;
            } 

            /**
             * DataAdjustmentPolicies.
             */
            public Builder dataAdjustmentPolicies(java.util.List<DataAdjustmentPolicies> dataAdjustmentPolicies) {
                this.dataAdjustmentPolicies = dataAdjustmentPolicies;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public PublishCommand build() {
                return new PublishCommand(this);
            } 

        } 

    }
}
