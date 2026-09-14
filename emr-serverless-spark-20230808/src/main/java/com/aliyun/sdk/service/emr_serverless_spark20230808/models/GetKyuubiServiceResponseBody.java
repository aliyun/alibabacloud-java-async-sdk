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
 * {@link GetKyuubiServiceResponseBody} extends {@link TeaModel}
 *
 * <p>GetKyuubiServiceResponseBody</p>
 */
public class GetKyuubiServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetKyuubiServiceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKyuubiServiceResponseBody create() {
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

        private Builder(GetKyuubiServiceResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8CE06D75-E6A2-505D-9B4B-31DEE3D98A04</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetKyuubiServiceResponseBody build() {
            return new GetKyuubiServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetKyuubiServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetKyuubiServiceResponseBody</p>
     */
    public static class Data extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("publicEndpointEnabled")
        private Boolean publicEndpointEnabled;

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

        private Data(Builder builder) {
            this.computeInstance = builder.computeInstance;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.innerEndpoint = builder.innerEndpoint;
            this.kyuubiConfigs = builder.kyuubiConfigs;
            this.kyuubiReleaseVersion = builder.kyuubiReleaseVersion;
            this.kyuubiServiceId = builder.kyuubiServiceId;
            this.name = builder.name;
            this.publicEndpoint = builder.publicEndpoint;
            this.publicEndpointEnabled = builder.publicEndpointEnabled;
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

        public static Data create() {
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
         * @return publicEndpointEnabled
         */
        public Boolean getPublicEndpointEnabled() {
            return this.publicEndpointEnabled;
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
            private String kyuubiReleaseVersion; 
            private String kyuubiServiceId; 
            private String name; 
            private String publicEndpoint; 
            private Boolean publicEndpointEnabled; 
            private String queue; 
            private String releaseVersion; 
            private Integer replica; 
            private String sparkConfigs; 
            private String startTime; 
            private String state; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.computeInstance = model.computeInstance;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.innerEndpoint = model.innerEndpoint;
                this.kyuubiConfigs = model.kyuubiConfigs;
                this.kyuubiReleaseVersion = model.kyuubiReleaseVersion;
                this.kyuubiServiceId = model.kyuubiServiceId;
                this.name = model.name;
                this.publicEndpoint = model.publicEndpoint;
                this.publicEndpointEnabled = model.publicEndpointEnabled;
                this.queue = model.queue;
                this.releaseVersion = model.releaseVersion;
                this.replica = model.replica;
                this.sparkConfigs = model.sparkConfigs;
                this.startTime = model.startTime;
                this.state = model.state;
            } 

            /**
             * <p>The specifications of the Kyuubi service.</p>
             * 
             * <strong>example:</strong>
             * <p>2c8g</p>
             */
            public Builder computeInstance(String computeInstance) {
                this.computeInstance = computeInstance;
                return this;
            }

            /**
             * <p>The timestamp when the service was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1749456094000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The UID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>150978934701****</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The internal same-region endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>kyuubi-cn-beijing-internal.spark.emr.aliyuncs.com</p>
             */
            public Builder innerEndpoint(String innerEndpoint) {
                this.innerEndpoint = innerEndpoint;
                return this;
            }

            /**
             * <p>The configuration of the Kyuubi service.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder kyuubiConfigs(String kyuubiConfigs) {
                this.kyuubiConfigs = kyuubiConfigs;
                return this;
            }

            /**
             * <p>The Kyuubi service engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.9.2-0.0.2</p>
             */
            public Builder kyuubiReleaseVersion(String kyuubiReleaseVersion) {
                this.kyuubiReleaseVersion = kyuubiReleaseVersion;
                return this;
            }

            /**
             * <p>The ID of the Kyuubi service.</p>
             * 
             * <strong>example:</strong>
             * <p>kb-4e209b04588***95f04ad3538ae4</p>
             */
            public Builder kyuubiServiceId(String kyuubiServiceId) {
                this.kyuubiServiceId = kyuubiServiceId;
                return this;
            }

            /**
             * <p>The name of the Kyuubi service.</p>
             * 
             * <strong>example:</strong>
             * <p>dev_serverless_spark</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The public domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>emr-spark-kyuubi-gateway-cn-beijing.aliyuncs.com</p>
             */
            public Builder publicEndpoint(String publicEndpoint) {
                this.publicEndpoint = publicEndpoint;
                return this;
            }

            /**
             * <p>Indicates whether public network access is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder publicEndpointEnabled(Boolean publicEndpointEnabled) {
                this.publicEndpointEnabled = publicEndpointEnabled;
                return this;
            }

            /**
             * <p>The name of the queue.</p>
             * 
             * <strong>example:</strong>
             * <p>dev_queue</p>
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * <p>The Spark engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>esr-4.6.0 (Spark 3.5.2, Scala 2.12)</p>
             */
            public Builder releaseVersion(String releaseVersion) {
                this.releaseVersion = releaseVersion;
                return this;
            }

            /**
             * <p>The number of high-availability (HA) replicas.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder replica(Integer replica) {
                this.replica = replica;
                return this;
            }

            /**
             * <p>The Spark configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder sparkConfigs(String sparkConfigs) {
                this.sparkConfigs = sparkConfigs;
                return this;
            }

            /**
             * <p>The timestamp when the service was started.</p>
             * 
             * <strong>example:</strong>
             * <p>1749456094000</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The state of the Kyuubi service.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
