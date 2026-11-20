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
 * {@link CreateServiceRolloutRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceRolloutRequest</p>
 */
public class CreateServiceRolloutRequest extends Request {
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

    private CreateServiceRolloutRequest(Builder builder) {
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

    public static CreateServiceRolloutRequest create() {
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

    public static final class Builder extends Request.Builder<CreateServiceRolloutRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private Batch batch; 
        private Partition partition; 
        private Boolean paused; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceRolloutRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.batch = request.batch;
            this.partition = request.partition;
            this.paused = request.paused;
        } 

        /**
         * <p>The ID of the region where the service is deployed. You can call the ListServices operation to obtain a list of available regions.</p>
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
         * <p>The name of the service for which you want to create a rollout policy. The service name must be unique within the same region. You can call the DescribeService operation to obtain the service details.</p>
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
         * <p>The automatic batching configuration.</p>
         */
        public Builder batch(Batch batch) {
            this.putBodyParameter("Batch", batch);
            this.batch = batch;
            return this;
        }

        /**
         * <p>The manual batching configuration.</p>
         */
        public Builder partition(Partition partition) {
            this.putBodyParameter("Partition", partition);
            this.partition = partition;
            return this;
        }

        /**
         * <p>Specifies whether to pause the update.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder paused(Boolean paused) {
            this.putBodyParameter("Paused", paused);
            this.paused = paused;
            return this;
        }

        @Override
        public CreateServiceRolloutRequest build() {
            return new CreateServiceRolloutRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateServiceRolloutRequest} extends {@link TeaModel}
     *
     * <p>CreateServiceRolloutRequest</p>
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
             * <p>The number of instances to update in each batch.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder batchSize(String batchSize) {
                this.batchSize = batchSize;
                return this;
            }

            /**
             * <p>The wait interval after each batch update is completed.</p>
             * 
             * <strong>example:</strong>
             * <p>5m</p>
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
     * {@link CreateServiceRolloutRequest} extends {@link TeaModel}
     *
     * <p>CreateServiceRolloutRequest</p>
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
             * <p>The number of instances to update to the new version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
