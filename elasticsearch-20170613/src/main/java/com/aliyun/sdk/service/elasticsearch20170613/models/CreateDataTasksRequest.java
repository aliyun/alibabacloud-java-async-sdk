// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataTasksRequest} extends {@link RequestModel}
 *
 * <p>CreateDataTasksRequest</p>
 */
public class CreateDataTasksRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("body")
    private java.util.List < CreateDataTasksRequestBody> body;

    private CreateDataTasksRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clientToken = builder.clientToken;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return body
     */
    public java.util.List < CreateDataTasksRequestBody> getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateDataTasksRequest, Builder> {
        private String instanceId; 
        private String clientToken; 
        private java.util.List < CreateDataTasksRequestBody> body; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataTasksRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.clientToken = request.clientToken;
            this.body = request.body;
        } 

        /**
         * The ID of the request.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * es-cn-n6w1o1x0w001c\*\*\*\*
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * body.
         */
        public Builder body(java.util.List < CreateDataTasksRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateDataTasksRequest build() {
            return new CreateDataTasksRequest(this);
        } 

    } 

    public static class MigrateConfig extends TeaModel {
        @NameInMap("sourceFilterParams")
        private String sourceFilterParams;

        private MigrateConfig(Builder builder) {
            this.sourceFilterParams = builder.sourceFilterParams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrateConfig create() {
            return builder().build();
        }

        /**
         * @return sourceFilterParams
         */
        public String getSourceFilterParams() {
            return this.sourceFilterParams;
        }

        public static final class Builder {
            private String sourceFilterParams; 

            /**
             * sourceFilterParams.
             */
            public Builder sourceFilterParams(String sourceFilterParams) {
                this.sourceFilterParams = sourceFilterParams;
                return this;
            }

            public MigrateConfig build() {
                return new MigrateConfig(this);
            } 

        } 

    }
    public static class SinkCluster extends TeaModel {
        @NameInMap("dataSourceType")
        @Validation(required = true)
        private String dataSourceType;

        @NameInMap("index")
        @Validation(required = true)
        private String index;

        @NameInMap("mapping")
        @Validation(required = true)
        private String mapping;

        @NameInMap("password")
        @Validation(required = true)
        private String password;

        @NameInMap("routing")
        private String routing;

        @NameInMap("settings")
        @Validation(required = true)
        private String settings;

        @NameInMap("type")
        @Validation(required = true)
        private String type;

        @NameInMap("username")
        @Validation(required = true)
        private String username;

        private SinkCluster(Builder builder) {
            this.dataSourceType = builder.dataSourceType;
            this.index = builder.index;
            this.mapping = builder.mapping;
            this.password = builder.password;
            this.routing = builder.routing;
            this.settings = builder.settings;
            this.type = builder.type;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkCluster create() {
            return builder().build();
        }

        /**
         * @return dataSourceType
         */
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return mapping
         */
        public String getMapping() {
            return this.mapping;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return routing
         */
        public String getRouting() {
            return this.routing;
        }

        /**
         * @return settings
         */
        public String getSettings() {
            return this.settings;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String dataSourceType; 
            private String index; 
            private String mapping; 
            private String password; 
            private String routing; 
            private String settings; 
            private String type; 
            private String username; 

            /**
             * dataSourceType.
             */
            public Builder dataSourceType(String dataSourceType) {
                this.dataSourceType = dataSourceType;
                return this;
            }

            /**
             * index.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * mapping.
             */
            public Builder mapping(String mapping) {
                this.mapping = mapping;
                return this;
            }

            /**
             * password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * routing.
             */
            public Builder routing(String routing) {
                this.routing = routing;
                return this;
            }

            /**
             * settings.
             */
            public Builder settings(String settings) {
                this.settings = settings;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public SinkCluster build() {
                return new SinkCluster(this);
            } 

        } 

    }
    public static class SourceCluster extends TeaModel {
        @NameInMap("dataSourceType")
        @Validation(required = true)
        private String dataSourceType;

        @NameInMap("endpoint")
        private String endpoint;

        @NameInMap("index")
        @Validation(required = true)
        private String index;

        @NameInMap("password")
        private String password;

        @NameInMap("type")
        @Validation(required = true)
        private String type;

        @NameInMap("username")
        private String username;

        @NameInMap("vpcId")
        private String vpcId;

        @NameInMap("vpcInstanceId")
        private String vpcInstanceId;

        @NameInMap("vpcInstancePort")
        private Integer vpcInstancePort;

        private SourceCluster(Builder builder) {
            this.dataSourceType = builder.dataSourceType;
            this.endpoint = builder.endpoint;
            this.index = builder.index;
            this.password = builder.password;
            this.type = builder.type;
            this.username = builder.username;
            this.vpcId = builder.vpcId;
            this.vpcInstanceId = builder.vpcInstanceId;
            this.vpcInstancePort = builder.vpcInstancePort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceCluster create() {
            return builder().build();
        }

        /**
         * @return dataSourceType
         */
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcInstanceId
         */
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        /**
         * @return vpcInstancePort
         */
        public Integer getVpcInstancePort() {
            return this.vpcInstancePort;
        }

        public static final class Builder {
            private String dataSourceType; 
            private String endpoint; 
            private String index; 
            private String password; 
            private String type; 
            private String username; 
            private String vpcId; 
            private String vpcInstanceId; 
            private Integer vpcInstancePort; 

            /**
             * dataSourceType.
             */
            public Builder dataSourceType(String dataSourceType) {
                this.dataSourceType = dataSourceType;
                return this;
            }

            /**
             * endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * index.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * vpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * vpcInstanceId.
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            /**
             * vpcInstancePort.
             */
            public Builder vpcInstancePort(Integer vpcInstancePort) {
                this.vpcInstancePort = vpcInstancePort;
                return this;
            }

            public SourceCluster build() {
                return new SourceCluster(this);
            } 

        } 

    }
    public static class CreateDataTasksRequestBody extends TeaModel {
        @NameInMap("migrateConfig")
        private MigrateConfig migrateConfig;

        @NameInMap("sinkCluster")
        private SinkCluster sinkCluster;

        @NameInMap("sourceCluster")
        private SourceCluster sourceCluster;

        private CreateDataTasksRequestBody(Builder builder) {
            this.migrateConfig = builder.migrateConfig;
            this.sinkCluster = builder.sinkCluster;
            this.sourceCluster = builder.sourceCluster;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateDataTasksRequestBody create() {
            return builder().build();
        }

        /**
         * @return migrateConfig
         */
        public MigrateConfig getMigrateConfig() {
            return this.migrateConfig;
        }

        /**
         * @return sinkCluster
         */
        public SinkCluster getSinkCluster() {
            return this.sinkCluster;
        }

        /**
         * @return sourceCluster
         */
        public SourceCluster getSourceCluster() {
            return this.sourceCluster;
        }

        public static final class Builder {
            private MigrateConfig migrateConfig; 
            private SinkCluster sinkCluster; 
            private SourceCluster sourceCluster; 

            /**
             * migrateConfig.
             */
            public Builder migrateConfig(MigrateConfig migrateConfig) {
                this.migrateConfig = migrateConfig;
                return this;
            }

            /**
             * sinkCluster.
             */
            public Builder sinkCluster(SinkCluster sinkCluster) {
                this.sinkCluster = sinkCluster;
                return this;
            }

            /**
             * sourceCluster.
             */
            public Builder sourceCluster(SourceCluster sourceCluster) {
                this.sourceCluster = sourceCluster;
                return this;
            }

            public CreateDataTasksRequestBody build() {
                return new CreateDataTasksRequestBody(this);
            } 

        } 

    }
}
