// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link QueueMeta} extends {@link TeaModel}
 *
 * <p>QueueMeta</p>
 */
public class QueueMeta extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GmtDequeuedTime")
    private String gmtDequeuedTime;

    @com.aliyun.core.annotation.NameInMap("GmtEnqueuedTime")
    private String gmtEnqueuedTime;

    @com.aliyun.core.annotation.NameInMap("GmtPositionModifiedTime")
    private String gmtPositionModifiedTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Position")
    private String position;

    @com.aliyun.core.annotation.NameInMap("QueueStrategy")
    private String queueStrategy;

    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    @com.aliyun.core.annotation.NameInMap("Resource")
    private ResourceAmount resource;

    @com.aliyun.core.annotation.NameInMap("ScheduledResource")
    private String scheduledResource;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UseOversoldResource")
    private Boolean useOversoldResource;

    private QueueMeta(Builder builder) {
        this.gmtDequeuedTime = builder.gmtDequeuedTime;
        this.gmtEnqueuedTime = builder.gmtEnqueuedTime;
        this.gmtPositionModifiedTime = builder.gmtPositionModifiedTime;
        this.name = builder.name;
        this.position = builder.position;
        this.queueStrategy = builder.queueStrategy;
        this.quotaId = builder.quotaId;
        this.resource = builder.resource;
        this.scheduledResource = builder.scheduledResource;
        this.status = builder.status;
        this.useOversoldResource = builder.useOversoldResource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueueMeta create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gmtDequeuedTime
     */
    public String getGmtDequeuedTime() {
        return this.gmtDequeuedTime;
    }

    /**
     * @return gmtEnqueuedTime
     */
    public String getGmtEnqueuedTime() {
        return this.gmtEnqueuedTime;
    }

    /**
     * @return gmtPositionModifiedTime
     */
    public String getGmtPositionModifiedTime() {
        return this.gmtPositionModifiedTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return position
     */
    public String getPosition() {
        return this.position;
    }

    /**
     * @return queueStrategy
     */
    public String getQueueStrategy() {
        return this.queueStrategy;
    }

    /**
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * @return resource
     */
    public ResourceAmount getResource() {
        return this.resource;
    }

    /**
     * @return scheduledResource
     */
    public String getScheduledResource() {
        return this.scheduledResource;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return useOversoldResource
     */
    public Boolean getUseOversoldResource() {
        return this.useOversoldResource;
    }

    public static final class Builder {
        private String gmtDequeuedTime; 
        private String gmtEnqueuedTime; 
        private String gmtPositionModifiedTime; 
        private String name; 
        private String position; 
        private String queueStrategy; 
        private String quotaId; 
        private ResourceAmount resource; 
        private String scheduledResource; 
        private String status; 
        private Boolean useOversoldResource; 

        private Builder() {
        } 

        private Builder(QueueMeta model) {
            this.gmtDequeuedTime = model.gmtDequeuedTime;
            this.gmtEnqueuedTime = model.gmtEnqueuedTime;
            this.gmtPositionModifiedTime = model.gmtPositionModifiedTime;
            this.name = model.name;
            this.position = model.position;
            this.queueStrategy = model.queueStrategy;
            this.quotaId = model.quotaId;
            this.resource = model.resource;
            this.scheduledResource = model.scheduledResource;
            this.status = model.status;
            this.useOversoldResource = model.useOversoldResource;
        } 

        /**
         * <p>The time when the task was dequeued.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-22T00:00:00Z</p>
         */
        public Builder gmtDequeuedTime(String gmtDequeuedTime) {
            this.gmtDequeuedTime = gmtDequeuedTime;
            return this;
        }

        /**
         * <p>The time when the task was enqueued.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-22T00:00:00Z</p>
         */
        public Builder gmtEnqueuedTime(String gmtEnqueuedTime) {
            this.gmtEnqueuedTime = gmtEnqueuedTime;
            return this;
        }

        /**
         * <p>The time when the position of the task in the queue was changed.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-22T00:00:00Z</p>
         */
        public Builder gmtPositionModifiedTime(String gmtPositionModifiedTime) {
            this.gmtPositionModifiedTime = gmtPositionModifiedTime;
            return this;
        }

        /**
         * <p>The name of the task in the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>dlcxxxx</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The position of the task in the queue. This parameter takes effect only when the task is queued.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder position(String position) {
            this.position = position;
            return this;
        }

        /**
         * <p>The dequeue strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>PaiStrategyIntelligent</p>
         */
        public Builder queueStrategy(String queueStrategy) {
            this.queueStrategy = queueStrategy;
            return this;
        }

        /**
         * <p>The resource quota queue to which the task belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>quotad2kd8ljpsno</p>
         */
        public Builder quotaId(String quotaId) {
            this.quotaId = quotaId;
            return this;
        }

        /**
         * <p>The resources occupied by the task in the queue.</p>
         */
        public Builder resource(ResourceAmount resource) {
            this.resource = resource;
            return this;
        }

        /**
         * <p>The scheduled resources occupied by the task in the queue.</p>
         */
        public Builder scheduledResource(String scheduledResource) {
            this.scheduledResource = scheduledResource;
            return this;
        }

        /**
         * <p>The status of the task in the queue, such as enqueued or dequeued.</p>
         * 
         * <strong>example:</strong>
         * <p>Enqueued</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Specifies whether the task uses idle resources.</p>
         */
        public Builder useOversoldResource(Boolean useOversoldResource) {
            this.useOversoldResource = useOversoldResource;
            return this;
        }

        public QueueMeta build() {
            return new QueueMeta(this);
        } 

    } 

}
