// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link PublishFeatureViewTableRequest} extends {@link RequestModel}
 *
 * <p>PublishFeatureViewTableRequest</p>
 */
public class PublishFeatureViewTableRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("FeatureViewId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureViewId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventTime")
    private String eventTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Mode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OfflineToOnline")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean offlineToOnline;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Partitions")
    private java.util.Map<String, java.util.Map<String, ?>> partitions;

    private PublishFeatureViewTableRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.featureViewId = builder.featureViewId;
        this.regionId = builder.regionId;
        this.config = builder.config;
        this.eventTime = builder.eventTime;
        this.mode = builder.mode;
        this.offlineToOnline = builder.offlineToOnline;
        this.partitions = builder.partitions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishFeatureViewTableRequest create() {
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
     * @return featureViewId
     */
    public String getFeatureViewId() {
        return this.featureViewId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return eventTime
     */
    public String getEventTime() {
        return this.eventTime;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return offlineToOnline
     */
    public Boolean getOfflineToOnline() {
        return this.offlineToOnline;
    }

    /**
     * @return partitions
     */
    public java.util.Map<String, java.util.Map<String, ?>> getPartitions() {
        return this.partitions;
    }

    public static final class Builder extends Request.Builder<PublishFeatureViewTableRequest, Builder> {
        private String instanceId; 
        private String featureViewId; 
        private String regionId; 
        private String config; 
        private String eventTime; 
        private String mode; 
        private Boolean offlineToOnline; 
        private java.util.Map<String, java.util.Map<String, ?>> partitions; 

        private Builder() {
            super();
        } 

        private Builder(PublishFeatureViewTableRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.featureViewId = request.featureViewId;
            this.regionId = request.regionId;
            this.config = request.config;
            this.eventTime = request.eventTime;
            this.mode = request.mode;
            this.offlineToOnline = request.offlineToOnline;
            this.partitions = request.partitions;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fs-cn-********</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder featureViewId(String featureViewId) {
            this.putPathParameter("FeatureViewId", featureViewId);
            this.featureViewId = featureViewId;
            return this;
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
         * Config.
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * EventTime.
         */
        public Builder eventTime(String eventTime) {
            this.putBodyParameter("EventTime", eventTime);
            this.eventTime = eventTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Overwrite</p>
         */
        public Builder mode(String mode) {
            this.putBodyParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder offlineToOnline(Boolean offlineToOnline) {
            this.putBodyParameter("OfflineToOnline", offlineToOnline);
            this.offlineToOnline = offlineToOnline;
            return this;
        }

        /**
         * Partitions.
         */
        public Builder partitions(java.util.Map<String, java.util.Map<String, ?>> partitions) {
            this.putBodyParameter("Partitions", partitions);
            this.partitions = partitions;
            return this;
        }

        @Override
        public PublishFeatureViewTableRequest build() {
            return new PublishFeatureViewTableRequest(this);
        } 

    } 

}
