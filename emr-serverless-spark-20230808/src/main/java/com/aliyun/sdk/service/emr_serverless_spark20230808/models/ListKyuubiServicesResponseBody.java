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
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
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

        @com.aliyun.core.annotation.NameInMap("kyuubiReleaseVersion")
        private String kyuubiReleaseVersion;

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

        @com.aliyun.core.annotation.NameInMap("webUi")
        private String webUi;

        private KyuubiServices(Builder builder) {
            this.computeInstance = builder.computeInstance;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.innerEndpoint = builder.innerEndpoint;
            this.kyuubiConfigs = builder.kyuubiConfigs;
            this.kyuubiReleaseVersion = builder.kyuubiReleaseVersion;
            this.kyuubiServiceId = builder.kyuubiServiceId;
            this.name = builder.name;
            this.publicEndpoint = builder.publicEndpoint;
            this.queue = builder.queue;
            this.releaseVersion = builder.releaseVersion;
            this.replica = builder.replica;
            this.sparkConfigs = builder.sparkConfigs;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.webUi = builder.webUi;
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
         * @return kyuubiReleaseVersion
         */
        public String getKyuubiReleaseVersion() {
            return this.kyuubiReleaseVersion;
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

        /**
         * @return webUi
         */
        public String getWebUi() {
            return this.webUi;
        }

        public static final class Builder {
            private String computeInstance; 
            private String createTime; 
            private String creator; 
            private String innerEndpoint; 
            private String kyuubiConfigs; 
            private String kyuubiReleaseVersion; 
            private String kyuubiServiceId; 
            private String name; 
            private String publicEndpoint; 
            private String queue; 
            private String releaseVersion; 
            private Integer replica; 
            private String sparkConfigs; 
            private String startTime; 
            private String state; 
            private String webUi; 

            private Builder() {
            } 

            private Builder(KyuubiServices model) {
                this.computeInstance = model.computeInstance;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.innerEndpoint = model.innerEndpoint;
                this.kyuubiConfigs = model.kyuubiConfigs;
                this.kyuubiReleaseVersion = model.kyuubiReleaseVersion;
                this.kyuubiServiceId = model.kyuubiServiceId;
                this.name = model.name;
                this.publicEndpoint = model.publicEndpoint;
                this.queue = model.queue;
                this.releaseVersion = model.releaseVersion;
                this.replica = model.replica;
                this.sparkConfigs = model.sparkConfigs;
                this.startTime = model.startTime;
                this.state = model.state;
                this.webUi = model.webUi;
            } 

            /**
             * <p>The KyuubiServer instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>4C16G</p>
             */
            public Builder computeInstance(String computeInstance) {
                this.computeInstance = computeInstance;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-11T08:21:58Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The UID of the user who created the KyuubiServer.</p>
             * 
             * <strong>example:</strong>
             * <p>103*******</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The internal network endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>kyuubi-cn-hangzhou-internal.spark.emr.aliyuncs.com</p>
             */
            public Builder innerEndpoint(String innerEndpoint) {
                this.innerEndpoint = innerEndpoint;
                return this;
            }

            /**
             * <p>The KyuubiServer configurations.</p>
             * 
             * <strong>example:</strong>
             * <p>kyuubi.conf.key=value1
             * kyuubi.conf.key1=value2</p>
             */
            public Builder kyuubiConfigs(String kyuubiConfigs) {
                this.kyuubiConfigs = kyuubiConfigs;
                return this;
            }

            /**
             * <p>The KyuubiServer version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.9.2-0.0.1</p>
             */
            public Builder kyuubiReleaseVersion(String kyuubiReleaseVersion) {
                this.kyuubiReleaseVersion = kyuubiReleaseVersion;
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
             * <p>The KyuubiServer name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The public domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>emr-spark-kyuubi-gateway-cn-hangzhou.aliyuncs.com</p>
             */
            public Builder publicEndpoint(String publicEndpoint) {
                this.publicEndpoint = publicEndpoint;
                return this;
            }

            /**
             * <p>The queue name.</p>
             * 
             * <strong>example:</strong>
             * <p>dev_queue</p>
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * <p>The Spark DPI engine database engine version number.</p>
             * 
             * <strong>example:</strong>
             * <p>esr-4.2.0 (Spark 3.5.2, Scala 2.12)</p>
             */
            public Builder releaseVersion(String releaseVersion) {
                this.releaseVersion = releaseVersion;
                return this;
            }

            /**
             * <p>The number of KyuubiServer replicas.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder replica(Integer replica) {
                this.replica = replica;
                return this;
            }

            /**
             * <p>The default configurations for Spark applications started by KyuubiServer.</p>
             * 
             * <strong>example:</strong>
             * <p>spark.conf.key=value1
             * spark.conf.key1=value2</p>
             */
            public Builder sparkConfigs(String sparkConfigs) {
                this.sparkConfigs = sparkConfigs;
                return this;
            }

            /**
             * <p>The most recent start time of KyuubiServer.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-23 09:22:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The KyuubiServer status.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The WebUI of the Kyuubi Gateway.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://pre-1-emr-spark-kyuubi-gateway-cn-hangzhou.data.aliyun.com/ui/?token=NkVTWG1LSWRYSExiZ1VrTTQreVZ0aFhmYW1BWEJHTW8vN3VEY0MrZzVrQUdXWWY1Rm41Zi9mUkNMRzhPL3o1dDJNbXkrd3cvUmRqck9OMmFlQ21JL002bFhQK1lSa29hZ2tvT0hhNVk3WU9tWHhINFAxL3BscURkUUpFd2E2QTdCUWpDSkVvcERUUlhhaGhlOXdxdWFYaEpwSU9STXVRaGJ6ZUg0d0dDeWhIVVRsRW9ucStZbkt0U3BrbmdsNys1N3ZNRU1qaTZ2aktvN1M1K1d0YU5TemkwRmwvNkdCOHR2LzVWZWNLNkJPND">http://pre-1-emr-spark-kyuubi-gateway-cn-hangzhou.data.aliyun.com/ui/?token=NkVTWG1LSWRYSExiZ1VrTTQreVZ0aFhmYW1BWEJHTW8vN3VEY0MrZzVrQUdXWWY1Rm41Zi9mUkNMRzhPL3o1dDJNbXkrd3cvUmRqck9OMmFlQ21JL002bFhQK1lSa29hZ2tvT0hhNVk3WU9tWHhINFAxL3BscURkUUpFd2E2QTdCUWpDSkVvcERUUlhhaGhlOXdxdWFYaEpwSU9STXVRaGJ6ZUg0d0dDeWhIVVRsRW9ucStZbkt0U3BrbmdsNys1N3ZNRU1qaTZ2aktvN1M1K1d0YU5TemkwRmwvNkdCOHR2LzVWZWNLNkJPND</a></p>
             */
            public Builder webUi(String webUi) {
                this.webUi = webUi;
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
             * <p>The list of KyuubiServer instances.</p>
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
