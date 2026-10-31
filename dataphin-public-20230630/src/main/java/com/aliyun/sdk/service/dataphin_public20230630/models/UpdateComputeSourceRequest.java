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
 * {@link UpdateComputeSourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateComputeSourceRequest</p>
 */
public class UpdateComputeSourceRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("UpdateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateCommand updateCommand;

    private UpdateComputeSourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.updateCommand = builder.updateCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateComputeSourceRequest create() {
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
     * @return updateCommand
     */
    public UpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static final class Builder extends Request.Builder<UpdateComputeSourceRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private String opUserId; 
        private UpdateCommand updateCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpdateComputeSourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
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
         * <p>The tenant ID.</p>
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
         * <p>The ID of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        /**
         * <p>The update command.</p>
         * <p>This parameter is required.</p>
         */
        public Builder updateCommand(UpdateCommand updateCommand) {
            String updateCommandShrink = shrink(updateCommand, "UpdateCommand", "json");
            this.putBodyParameter("UpdateCommand", updateCommandShrink);
            this.updateCommand = updateCommand;
            return this;
        }

        @Override
        public UpdateComputeSourceRequest build() {
            return new UpdateComputeSourceRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateComputeSourceRequest} extends {@link TeaModel}
     *
     * <p>UpdateComputeSourceRequest</p>
     */
    public static class ConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private ConfigList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigList create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(ConfigList model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The configuration item.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the configuration item.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ConfigList build() {
                return new ConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateComputeSourceRequest} extends {@link TeaModel}
     *
     * <p>UpdateComputeSourceRequest</p>
     */
    public static class UpdateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private Long clusterId;

        @com.aliyun.core.annotation.NameInMap("ConfigList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<ConfigList> configList;

        @com.aliyun.core.annotation.NameInMap("CreateType")
        private String createType;

        @com.aliyun.core.annotation.NameInMap("Description")
        @com.aliyun.core.annotation.Validation(required = true)
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("TimeZone")
        private String timeZone;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("TypeVersion")
        private String typeVersion;

        private UpdateCommand(Builder builder) {
            this.clusterId = builder.clusterId;
            this.configList = builder.configList;
            this.createType = builder.createType;
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.timeZone = builder.timeZone;
            this.type = builder.type;
            this.typeVersion = builder.typeVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateCommand create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public Long getClusterId() {
            return this.clusterId;
        }

        /**
         * @return configList
         */
        public java.util.List<ConfigList> getConfigList() {
            return this.configList;
        }

        /**
         * @return createType
         */
        public String getCreateType() {
            return this.createType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return typeVersion
         */
        public String getTypeVersion() {
            return this.typeVersion;
        }

        public static final class Builder {
            private Long clusterId; 
            private java.util.List<ConfigList> configList; 
            private String createType; 
            private String description; 
            private Long id; 
            private String name; 
            private String timeZone; 
            private String type; 
            private String typeVersion; 

            private Builder() {
            } 

            private Builder(UpdateCommand model) {
                this.clusterId = model.clusterId;
                this.configList = model.configList;
                this.createType = model.createType;
                this.description = model.description;
                this.id = model.id;
                this.name = model.name;
                this.timeZone = model.timeZone;
                this.type = model.type;
                this.typeVersion = model.typeVersion;
            } 

            /**
             * <p>The ID of the associated cluster. This parameter takes effect only when CreateType is left empty or set to COMPUTE_SOURCE, which means creating a compute source that references a cluster. This parameter is mutually exclusive with CreateType=CLUSTER.</p>
             * 
             * <strong>example:</strong>
             * <p>102311</p>
             */
            public Builder clusterId(Long clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The connection configurations.</p>
             * <p>This parameter is required.</p>
             */
            public Builder configList(java.util.List<ConfigList> configList) {
                this.configList = configList;
                return this;
            }

            /**
             * <p>The type of the entity to create. Valid values:</p>
             * <ul>
             * <li>CLUSTER: creates a cluster. You cannot specify ClusterId.</li>
             * <li>COMPUTE_SOURCE: creates a compute source. This is the default value.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CLUSTER</p>
             */
            public Builder createType(String createType) {
                this.createType = createType;
                return this;
            }

            /**
             * <p>The description.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the compute source.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>102311</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the compute source.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test1021</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The name of the time zone, such as Asia/Shanghai. If you do not specify this parameter when you update the compute source, the original value is retained.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            /**
             * <p>The type of the compute source.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>MacCompute</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The version of the compute source type.</p>
             * 
             * <strong>example:</strong>
             * <p>CDH6</p>
             */
            public Builder typeVersion(String typeVersion) {
                this.typeVersion = typeVersion;
                return this;
            }

            public UpdateCommand build() {
                return new UpdateCommand(this);
            } 

        } 

    }
}
