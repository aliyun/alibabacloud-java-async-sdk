// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link DeleteEventAnalysisJobRequest} extends {@link RequestModel}
 *
 * <p>DeleteEventAnalysisJobRequest</p>
 */
public class DeleteEventAnalysisJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceResource")
    @com.aliyun.core.annotation.Validation(required = true)
    private SourceResource sourceResource;

    private DeleteEventAnalysisJobRequest(Builder builder) {
        super(builder);
        this.sourceResource = builder.sourceResource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEventAnalysisJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceResource
     */
    public SourceResource getSourceResource() {
        return this.sourceResource;
    }

    public static final class Builder extends Request.Builder<DeleteEventAnalysisJobRequest, Builder> {
        private SourceResource sourceResource; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEventAnalysisJobRequest request) {
            super(request);
            this.sourceResource = request.sourceResource;
        } 

        /**
         * <p>The identifier of the source resource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Kafka&quot;:{&quot;RegionId&quot;:&quot;cn-hangzhou&quot;,&quot;InstanceId&quot;:&quot;alikafka_post-cn-xxx&quot;,&quot;Topic&quot;:&quot;my_topic&quot;}}</p>
         */
        public Builder sourceResource(SourceResource sourceResource) {
            String sourceResourceShrink = shrink(sourceResource, "SourceResource", "json");
            this.putBodyParameter("SourceResource", sourceResourceShrink);
            this.sourceResource = sourceResource;
            return this;
        }

        @Override
        public DeleteEventAnalysisJobRequest build() {
            return new DeleteEventAnalysisJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteEventAnalysisJobRequest} extends {@link TeaModel}
     *
     * <p>DeleteEventAnalysisJobRequest</p>
     */
    public static class Kafka extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        private Kafka(Builder builder) {
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Kafka create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private String instanceId; 
            private String regionId; 
            private String topic; 

            private Builder() {
            } 

            private Builder(Kafka model) {
                this.instanceId = model.instanceId;
                this.regionId = model.regionId;
                this.topic = model.topic;
            } 

            /**
             * <p>The instance ID of the Kafka instance.</p>
             * 
             * <strong>example:</strong>
             * <p>alikafka_post-cn-xxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The region of the Kafka instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the Kafka topic.</p>
             * 
             * <strong>example:</strong>
             * <p>my_topic</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public Kafka build() {
                return new Kafka(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeleteEventAnalysisJobRequest} extends {@link TeaModel}
     *
     * <p>DeleteEventAnalysisJobRequest</p>
     */
    public static class RocketMQ extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        private RocketMQ(Builder builder) {
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.regionId = builder.regionId;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RocketMQ create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private String instanceId; 
            private String instanceType; 
            private String regionId; 
            private String topic; 

            private Builder() {
            } 

            private Builder(RocketMQ model) {
                this.instanceId = model.instanceId;
                this.instanceType = model.instanceType;
                this.regionId = model.regionId;
                this.topic = model.topic;
            } 

            /**
             * <p>The instance ID of the RocketMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rmq-cn-xxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The type of the RocketMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Cloud_5</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The region of the RocketMQ instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the RocketMQ topic.</p>
             * 
             * <strong>example:</strong>
             * <p>my_topic</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public RocketMQ build() {
                return new RocketMQ(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeleteEventAnalysisJobRequest} extends {@link TeaModel}
     *
     * <p>DeleteEventAnalysisJobRequest</p>
     */
    public static class SourceResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Kafka")
        private Kafka kafka;

        @com.aliyun.core.annotation.NameInMap("RocketMQ")
        private RocketMQ rocketMQ;

        private SourceResource(Builder builder) {
            this.kafka = builder.kafka;
            this.rocketMQ = builder.rocketMQ;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceResource create() {
            return builder().build();
        }

        /**
         * @return kafka
         */
        public Kafka getKafka() {
            return this.kafka;
        }

        /**
         * @return rocketMQ
         */
        public RocketMQ getRocketMQ() {
            return this.rocketMQ;
        }

        public static final class Builder {
            private Kafka kafka; 
            private RocketMQ rocketMQ; 

            private Builder() {
            } 

            private Builder(SourceResource model) {
                this.kafka = model.kafka;
                this.rocketMQ = model.rocketMQ;
            } 

            /**
             * <p>The Kafka data source.</p>
             */
            public Builder kafka(Kafka kafka) {
                this.kafka = kafka;
                return this;
            }

            /**
             * <p>The RocketMQ data source.</p>
             */
            public Builder rocketMQ(RocketMQ rocketMQ) {
                this.rocketMQ = rocketMQ;
                return this;
            }

            public SourceResource build() {
                return new SourceResource(this);
            } 

        } 

    }
}
