// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link CreateSampleConsistencyJobRequest} extends {@link RequestModel}
 *
 * <p>CreateSampleConsistencyJobRequest</p>
 */
public class CreateSampleConsistencyJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Duration")
    private String duration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EasModelServiceName")
    private String easModelServiceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FeatureSaveResourceId")
    private String featureSaveResourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemIdField")
    private String itemIdField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PartitionField")
    private String partitionField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PartitionFieldFormat")
    private String partitionFieldFormat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequestIdField")
    private String requestIdField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SampleRate")
    private String sampleRate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SampleTableName")
    private String sampleTableName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneId")
    private String sceneId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserIdField")
    private String userIdField;

    private CreateSampleConsistencyJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.duration = builder.duration;
        this.easModelServiceName = builder.easModelServiceName;
        this.featureSaveResourceId = builder.featureSaveResourceId;
        this.instanceId = builder.instanceId;
        this.itemIdField = builder.itemIdField;
        this.name = builder.name;
        this.partitionField = builder.partitionField;
        this.partitionFieldFormat = builder.partitionFieldFormat;
        this.requestIdField = builder.requestIdField;
        this.sampleRate = builder.sampleRate;
        this.sampleTableName = builder.sampleTableName;
        this.sceneId = builder.sceneId;
        this.userIdField = builder.userIdField;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSampleConsistencyJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return duration
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * @return easModelServiceName
     */
    public String getEasModelServiceName() {
        return this.easModelServiceName;
    }

    /**
     * @return featureSaveResourceId
     */
    public String getFeatureSaveResourceId() {
        return this.featureSaveResourceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return itemIdField
     */
    public String getItemIdField() {
        return this.itemIdField;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return partitionField
     */
    public String getPartitionField() {
        return this.partitionField;
    }

    /**
     * @return partitionFieldFormat
     */
    public String getPartitionFieldFormat() {
        return this.partitionFieldFormat;
    }

    /**
     * @return requestIdField
     */
    public String getRequestIdField() {
        return this.requestIdField;
    }

    /**
     * @return sampleRate
     */
    public String getSampleRate() {
        return this.sampleRate;
    }

    /**
     * @return sampleTableName
     */
    public String getSampleTableName() {
        return this.sampleTableName;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return userIdField
     */
    public String getUserIdField() {
        return this.userIdField;
    }

    public static final class Builder extends Request.Builder<CreateSampleConsistencyJobRequest, Builder> {
        private String regionId; 
        private String duration; 
        private String easModelServiceName; 
        private String featureSaveResourceId; 
        private String instanceId; 
        private String itemIdField; 
        private String name; 
        private String partitionField; 
        private String partitionFieldFormat; 
        private String requestIdField; 
        private String sampleRate; 
        private String sampleTableName; 
        private String sceneId; 
        private String userIdField; 

        private Builder() {
            super();
        } 

        private Builder(CreateSampleConsistencyJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.duration = request.duration;
            this.easModelServiceName = request.easModelServiceName;
            this.featureSaveResourceId = request.featureSaveResourceId;
            this.instanceId = request.instanceId;
            this.itemIdField = request.itemIdField;
            this.name = request.name;
            this.partitionField = request.partitionField;
            this.partitionFieldFormat = request.partitionFieldFormat;
            this.requestIdField = request.requestIdField;
            this.sampleRate = request.sampleRate;
            this.sampleTableName = request.sampleTableName;
            this.sceneId = request.sceneId;
            this.userIdField = request.userIdField;
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
         * Duration.
         */
        public Builder duration(String duration) {
            this.putBodyParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * EasModelServiceName.
         */
        public Builder easModelServiceName(String easModelServiceName) {
            this.putBodyParameter("EasModelServiceName", easModelServiceName);
            this.easModelServiceName = easModelServiceName;
            return this;
        }

        /**
         * FeatureSaveResourceId.
         */
        public Builder featureSaveResourceId(String featureSaveResourceId) {
            this.putBodyParameter("FeatureSaveResourceId", featureSaveResourceId);
            this.featureSaveResourceId = featureSaveResourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ItemIdField.
         */
        public Builder itemIdField(String itemIdField) {
            this.putBodyParameter("ItemIdField", itemIdField);
            this.itemIdField = itemIdField;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PartitionField.
         */
        public Builder partitionField(String partitionField) {
            this.putBodyParameter("PartitionField", partitionField);
            this.partitionField = partitionField;
            return this;
        }

        /**
         * PartitionFieldFormat.
         */
        public Builder partitionFieldFormat(String partitionFieldFormat) {
            this.putBodyParameter("PartitionFieldFormat", partitionFieldFormat);
            this.partitionFieldFormat = partitionFieldFormat;
            return this;
        }

        /**
         * RequestIdField.
         */
        public Builder requestIdField(String requestIdField) {
            this.putBodyParameter("RequestIdField", requestIdField);
            this.requestIdField = requestIdField;
            return this;
        }

        /**
         * SampleRate.
         */
        public Builder sampleRate(String sampleRate) {
            this.putBodyParameter("SampleRate", sampleRate);
            this.sampleRate = sampleRate;
            return this;
        }

        /**
         * SampleTableName.
         */
        public Builder sampleTableName(String sampleTableName) {
            this.putBodyParameter("SampleTableName", sampleTableName);
            this.sampleTableName = sampleTableName;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putBodyParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * UserIdField.
         */
        public Builder userIdField(String userIdField) {
            this.putBodyParameter("UserIdField", userIdField);
            this.userIdField = userIdField;
            return this;
        }

        @Override
        public CreateSampleConsistencyJobRequest build() {
            return new CreateSampleConsistencyJobRequest(this);
        } 

    } 

}
