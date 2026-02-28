// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link CreateEdgeInstanceMessageRoutingRequest} extends {@link RequestModel}
 *
 * <p>CreateEdgeInstanceMessageRoutingRequest</p>
 */
public class CreateEdgeInstanceMessageRoutingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceData")
    private String sourceData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetData")
    private String targetData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetIotHubQos")
    private Integer targetIotHubQos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicFilter")
    private String topicFilter;

    private CreateEdgeInstanceMessageRoutingRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.iotInstanceId = builder.iotInstanceId;
        this.name = builder.name;
        this.sourceData = builder.sourceData;
        this.sourceType = builder.sourceType;
        this.targetData = builder.targetData;
        this.targetIotHubQos = builder.targetIotHubQos;
        this.targetType = builder.targetType;
        this.topicFilter = builder.topicFilter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEdgeInstanceMessageRoutingRequest create() {
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
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sourceData
     */
    public String getSourceData() {
        return this.sourceData;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return targetData
     */
    public String getTargetData() {
        return this.targetData;
    }

    /**
     * @return targetIotHubQos
     */
    public Integer getTargetIotHubQos() {
        return this.targetIotHubQos;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    /**
     * @return topicFilter
     */
    public String getTopicFilter() {
        return this.topicFilter;
    }

    public static final class Builder extends Request.Builder<CreateEdgeInstanceMessageRoutingRequest, Builder> {
        private String instanceId; 
        private String iotInstanceId; 
        private String name; 
        private String sourceData; 
        private String sourceType; 
        private String targetData; 
        private Integer targetIotHubQos; 
        private String targetType; 
        private String topicFilter; 

        private Builder() {
            super();
        } 

        private Builder(CreateEdgeInstanceMessageRoutingRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.iotInstanceId = request.iotInstanceId;
            this.name = request.name;
            this.sourceData = request.sourceData;
            this.sourceType = request.sourceType;
            this.targetData = request.targetData;
            this.targetIotHubQos = request.targetIotHubQos;
            this.targetType = request.targetType;
            this.topicFilter = request.topicFilter;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nF9oXo7kLRWQ********</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * SourceData.
         */
        public Builder sourceData(String sourceData) {
            this.putQueryParameter("SourceData", sourceData);
            this.sourceData = sourceData;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>device</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * TargetData.
         */
        public Builder targetData(String targetData) {
            this.putQueryParameter("TargetData", targetData);
            this.targetData = targetData;
            return this;
        }

        /**
         * TargetIotHubQos.
         */
        public Builder targetIotHubQos(Integer targetIotHubQos) {
            this.putQueryParameter("TargetIotHubQos", targetIotHubQos);
            this.targetIotHubQos = targetIotHubQos;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>function</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * TopicFilter.
         */
        public Builder topicFilter(String topicFilter) {
            this.putQueryParameter("TopicFilter", topicFilter);
            this.topicFilter = topicFilter;
            return this;
        }

        @Override
        public CreateEdgeInstanceMessageRoutingRequest build() {
            return new CreateEdgeInstanceMessageRoutingRequest(this);
        } 

    } 

}
