// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataTasksResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDataTasksResponseBody</p>
 */
public class CreateDataTasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private CreateDataTasksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public CreateDataTasksResponseBody build() {
            return new CreateDataTasksResponseBody(this);
        } 

    } 

    public static class SinkCluster extends TeaModel {
        @NameInMap("dataSourceType")
        private String dataSourceType;

        @NameInMap("index")
        private String index;

        @NameInMap("mapping")
        private String mapping;

        @NameInMap("password")
        private String password;

        @NameInMap("routing")
        private String routing;

        @NameInMap("settings")
        private String settings;

        @NameInMap("type")
        private String type;

        @NameInMap("username")
        private String username;

        @NameInMap("vpcId")
        private String vpcId;

        @NameInMap("vpcInstanceId")
        private String vpcInstanceId;

        @NameInMap("vpcInstancePort")
        private String vpcInstancePort;

        private SinkCluster(Builder builder) {
            this.dataSourceType = builder.dataSourceType;
            this.index = builder.index;
            this.mapping = builder.mapping;
            this.password = builder.password;
            this.routing = builder.routing;
            this.settings = builder.settings;
            this.type = builder.type;
            this.username = builder.username;
            this.vpcId = builder.vpcId;
            this.vpcInstanceId = builder.vpcInstanceId;
            this.vpcInstancePort = builder.vpcInstancePort;
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
        public String getVpcInstancePort() {
            return this.vpcInstancePort;
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
            private String vpcId; 
            private String vpcInstanceId; 
            private String vpcInstancePort; 

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
            public Builder vpcInstancePort(String vpcInstancePort) {
                this.vpcInstancePort = vpcInstancePort;
                return this;
            }

            public SinkCluster build() {
                return new SinkCluster(this);
            } 

        } 

    }
    public static class SourceCluster extends TeaModel {
        @NameInMap("dataSourceType")
        private String dataSourceType;

        @NameInMap("endpoint")
        private String endpoint;

        @NameInMap("index")
        private String index;

        @NameInMap("password")
        private String password;

        @NameInMap("type")
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
    public static class Result extends TeaModel {
        @NameInMap("sinkCluster")
        private SinkCluster sinkCluster;

        @NameInMap("sourceCluster")
        private SourceCluster sourceCluster;

        private Result(Builder builder) {
            this.sinkCluster = builder.sinkCluster;
            this.sourceCluster = builder.sourceCluster;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
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
            private SinkCluster sinkCluster; 
            private SourceCluster sourceCluster; 

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

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
