// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link UpdateServiceRolloutRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceRolloutRequest</p>
 */
public class UpdateServiceRolloutRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Batch")
    private Batch batch;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Partition")
    private Partition partition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Paused")
    private Boolean paused;

    private UpdateServiceRolloutRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.batch = builder.batch;
        this.partition = builder.partition;
        this.paused = builder.paused;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceRolloutRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return batch
     */
    public Batch getBatch() {
        return this.batch;
    }

    /**
     * @return partition
     */
    public Partition getPartition() {
        return this.partition;
    }

    /**
     * @return paused
     */
    public Boolean getPaused() {
        return this.paused;
    }

    public static final class Builder extends Request.Builder<UpdateServiceRolloutRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private Batch batch; 
        private Partition partition; 
        private Boolean paused; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceRolloutRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.batch = request.batch;
            this.partition = request.partition;
            this.paused = request.paused;
        } 

        /**
         * <p><strong>ClusterId</strong>  </p>
         * <ul>
         * <li>Type: string</li>
         * <li>Required: yes</li>
         * <li>Description: The region ID. The identifier of the region where the service is located.</li>
         * <li>Example: cn-shanghai</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p><strong>ServiceName</strong>  </p>
         * <ul>
         * <li>Type: string</li>
         * <li>Required: yes</li>
         * <li>Description: The service name. The name of the service whose rollout policy is to be updated.</li>
         * <li>Example: my-service</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-service</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p><strong>Batch</strong>  </p>
         * <ul>
         * <li>Type: object</li>
         * <li>Required: no</li>
         * <li>Description: The batch rollout configuration. Used to adjust batch policy parameters. Mutually exclusive with Partition.</li>
         * </ul>
         */
        public Builder batch(Batch batch) {
            this.putBodyParameter("Batch", batch);
            this.batch = batch;
            return this;
        }

        /**
         * <p><strong>Partition</strong>  </p>
         * <ul>
         * <li>Type: object</li>
         * <li>Required: no</li>
         * <li>Description: The partition rollout configuration. Used to adjust partition policy parameters. Mutually exclusive with Batch.</li>
         * </ul>
         */
        public Builder partition(Partition partition) {
            this.putBodyParameter("Partition", partition);
            this.partition = partition;
            return this;
        }

        /**
         * <p>Specifies whether to pause the rollout. A value of true indicates that the rollout is paused. A value of false indicates that the rollout is resumed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder paused(Boolean paused) {
            this.putBodyParameter("Paused", paused);
            this.paused = paused;
            return this;
        }

        @Override
        public UpdateServiceRolloutRequest build() {
            return new UpdateServiceRolloutRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateServiceRolloutRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceRolloutRequest</p>
     */
    public static class Batch extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchSize")
        private String batchSize;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private String interval;

        private Batch(Builder builder) {
            this.batchSize = builder.batchSize;
            this.interval = builder.interval;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Batch create() {
            return builder().build();
        }

        /**
         * @return batchSize
         */
        public String getBatchSize() {
            return this.batchSize;
        }

        /**
         * @return interval
         */
        public String getInterval() {
            return this.interval;
        }

        public static final class Builder {
            private String batchSize; 
            private String interval; 

            private Builder() {
            } 

            private Builder(Batch model) {
                this.batchSize = model.batchSize;
                this.interval = model.interval;
            } 

            /**
             * <p>The batch size. The number of replicas updated per batch. Integer or percentage formats are supported. Default value: &quot;25%&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>25%</p>
             */
            public Builder batchSize(String batchSize) {
                this.batchSize = batchSize;
                return this;
            }

            /**
             * <p>The batch interval. The wait time between two rollouts. Supported units: s (seconds), m (minutes), and h (hours).</p>
             * 
             * <strong>example:</strong>
             * <p>60s</p>
             */
            public Builder interval(String interval) {
                this.interval = interval;
                return this;
            }

            public Batch build() {
                return new Batch(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateServiceRolloutRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceRolloutRequest</p>
     */
    public static class Partition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Partition")
        private String partition;

        private Partition(Builder builder) {
            this.partition = builder.partition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Partition create() {
            return builder().build();
        }

        /**
         * @return partition
         */
        public String getPartition() {
            return this.partition;
        }

        public static final class Builder {
            private String partition; 

            private Builder() {
            } 

            private Builder(Partition model) {
                this.partition = model.partition;
            } 

            /**
             * <p><strong>Partition</strong>  </p>
             * <ul>
             * <li>Type: string</li>
             * <li>Required: yes</li>
             * <li>Description: The partition value. Two formats are supported:<ol>
             * <li>Integer format: such as &quot;5&quot;, which means retaining 5 old replicas.</li>
             * <li>Percentage format: such as &quot;50%&quot;, which means retaining 50% of the old replicas.
             * Adjustment policy:</li>
             * </ol>
             * <ul>
             * <li>Increase the value: Roll back to the old version and increase the proportion of old replicas.</li>
             * <li>Decrease the value: Proceed to the new version and decrease the proportion of old replicas.</li>
             * <li>Set to &quot;0%&quot;: Complete the full update and switch all replicas to the new version.</li>
             * </ul>
             * </li>
             * <li>Example: 30%</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>30%</p>
             */
            public Builder partition(String partition) {
                this.partition = partition;
                return this;
            }

            public Partition build() {
                return new Partition(this);
            } 

        } 

    }
}
