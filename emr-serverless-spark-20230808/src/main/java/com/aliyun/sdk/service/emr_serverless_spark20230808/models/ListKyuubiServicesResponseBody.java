// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListKyuubiServicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListKyuubiServicesResponseBody</p>
 */
public class ListKyuubiServicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListKyuubiServicesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKyuubiServicesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListKyuubiServicesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListKyuubiServicesResponseBody build() {
            return new ListKyuubiServicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListKyuubiServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKyuubiServicesResponseBody</p>
     */
    public static class KyuubiServices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("computeInstance")
        private String computeInstance;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("innerEndpoint")
        private String innerEndpoint;

        @com.aliyun.core.annotation.NameInMap("kyuubiConfigs")
        private String kyuubiConfigs;

        @com.aliyun.core.annotation.NameInMap("kyuubiServiceId")
        private String kyuubiServiceId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("publicEndpoint")
        private String publicEndpoint;

        @com.aliyun.core.annotation.NameInMap("queue")
        private String queue;

        @com.aliyun.core.annotation.NameInMap("releaseVersion")
        private String releaseVersion;

        @com.aliyun.core.annotation.NameInMap("replica")
        private Integer replica;

        @com.aliyun.core.annotation.NameInMap("sparkConfigs")
        private String sparkConfigs;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        private KyuubiServices(Builder builder) {
            this.computeInstance = builder.computeInstance;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.innerEndpoint = builder.innerEndpoint;
            this.kyuubiConfigs = builder.kyuubiConfigs;
            this.kyuubiServiceId = builder.kyuubiServiceId;
            this.name = builder.name;
            this.publicEndpoint = builder.publicEndpoint;
            this.queue = builder.queue;
            this.releaseVersion = builder.releaseVersion;
            this.replica = builder.replica;
            this.sparkConfigs = builder.sparkConfigs;
            this.startTime = builder.startTime;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KyuubiServices create() {
            return builder().build();
        }

        /**
         * @return computeInstance
         */
        public String getComputeInstance() {
            return this.computeInstance;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return innerEndpoint
         */
        public String getInnerEndpoint() {
            return this.innerEndpoint;
        }

        /**
         * @return kyuubiConfigs
         */
        public String getKyuubiConfigs() {
            return this.kyuubiConfigs;
        }

        /**
         * @return kyuubiServiceId
         */
        public String getKyuubiServiceId() {
            return this.kyuubiServiceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return publicEndpoint
         */
        public String getPublicEndpoint() {
            return this.publicEndpoint;
        }

        /**
         * @return queue
         */
        public String getQueue() {
            return this.queue;
        }

        /**
         * @return releaseVersion
         */
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

        /**
         * @return replica
         */
        public Integer getReplica() {
            return this.replica;
        }

        /**
         * @return sparkConfigs
         */
        public String getSparkConfigs() {
            return this.sparkConfigs;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String computeInstance; 
            private String createTime; 
            private String creator; 
            private String innerEndpoint; 
            private String kyuubiConfigs; 
            private String kyuubiServiceId; 
            private String name; 
            private String publicEndpoint; 
            private String queue; 
            private String releaseVersion; 
            private Integer replica; 
            private String sparkConfigs; 
            private String startTime; 
            private String state; 

            private Builder() {
            } 

            private Builder(KyuubiServices model) {
                this.computeInstance = model.computeInstance;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.innerEndpoint = model.innerEndpoint;
                this.kyuubiConfigs = model.kyuubiConfigs;
                this.kyuubiServiceId = model.kyuubiServiceId;
                this.name = model.name;
                this.publicEndpoint = model.publicEndpoint;
                this.queue = model.queue;
                this.releaseVersion = model.releaseVersion;
                this.replica = model.replica;
                this.sparkConfigs = model.sparkConfigs;
                this.startTime = model.startTime;
                this.state = model.state;
            } 

            /**
             * computeInstance.
             */
            public Builder computeInstance(String computeInstance) {
                this.computeInstance = computeInstance;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * innerEndpoint.
             */
            public Builder innerEndpoint(String innerEndpoint) {
                this.innerEndpoint = innerEndpoint;
                return this;
            }

            /**
             * kyuubiConfigs.
             */
            public Builder kyuubiConfigs(String kyuubiConfigs) {
                this.kyuubiConfigs = kyuubiConfigs;
                return this;
            }

            /**
             * <p>KyuubiServer ID。</p>
             * 
             * <strong>example:</strong>
             * <p>kb-070104e7631242448d12a1377c309f30</p>
             */
            public Builder kyuubiServiceId(String kyuubiServiceId) {
                this.kyuubiServiceId = kyuubiServiceId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * publicEndpoint.
             */
            public Builder publicEndpoint(String publicEndpoint) {
                this.publicEndpoint = publicEndpoint;
                return this;
            }

            /**
             * queue.
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * releaseVersion.
             */
            public Builder releaseVersion(String releaseVersion) {
                this.releaseVersion = releaseVersion;
                return this;
            }

            /**
             * replica.
             */
            public Builder replica(Integer replica) {
                this.replica = replica;
                return this;
            }

            /**
             * sparkConfigs.
             */
            public Builder sparkConfigs(String sparkConfigs) {
                this.sparkConfigs = sparkConfigs;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public KyuubiServices build() {
                return new KyuubiServices(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListKyuubiServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKyuubiServicesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("kyuubiServices")
        private java.util.List<KyuubiServices> kyuubiServices;

        private Data(Builder builder) {
            this.kyuubiServices = builder.kyuubiServices;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return kyuubiServices
         */
        public java.util.List<KyuubiServices> getKyuubiServices() {
            return this.kyuubiServices;
        }

        public static final class Builder {
            private java.util.List<KyuubiServices> kyuubiServices; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.kyuubiServices = model.kyuubiServices;
            } 

            /**
             * kyuubiServices.
             */
            public Builder kyuubiServices(java.util.List<KyuubiServices> kyuubiServices) {
                this.kyuubiServices = kyuubiServices;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
