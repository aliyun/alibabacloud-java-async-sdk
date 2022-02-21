// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEdgeInstanceMessageRoutingRequest} extends {@link RequestModel}
 *
 * <p>UpdateEdgeInstanceMessageRoutingRequest</p>
 */
public class UpdateEdgeInstanceMessageRoutingRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("RouteId")
    @Validation(required = true)
    private Long routeId;

    @Query
    @NameInMap("SourceData")
    private String sourceData;

    @Query
    @NameInMap("SourceType")
    @Validation(required = true)
    private String sourceType;

    @Query
    @NameInMap("TargetData")
    private String targetData;

    @Query
    @NameInMap("TargetIotHubQos")
    private Integer targetIotHubQos;

    @Query
    @NameInMap("TargetType")
    @Validation(required = true)
    private String targetType;

    @Query
    @NameInMap("TopicFilter")
    private String topicFilter;

    private UpdateEdgeInstanceMessageRoutingRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.iotInstanceId = builder.iotInstanceId;
        this.name = builder.name;
        this.routeId = builder.routeId;
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

    public static UpdateEdgeInstanceMessageRoutingRequest create() {
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
     * @return routeId
     */
    public Long getRouteId() {
        return this.routeId;
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

    public static final class Builder extends Request.Builder<UpdateEdgeInstanceMessageRoutingRequest, Builder> {
        private String instanceId; 
        private String iotInstanceId; 
        private String name; 
        private Long routeId; 
        private String sourceData; 
        private String sourceType; 
        private String targetData; 
        private Integer targetIotHubQos; 
        private String targetType; 
        private String topicFilter; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEdgeInstanceMessageRoutingRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.iotInstanceId = response.iotInstanceId;
            this.name = response.name;
            this.routeId = response.routeId;
            this.sourceData = response.sourceData;
            this.sourceType = response.sourceType;
            this.targetData = response.targetData;
            this.targetIotHubQos = response.targetIotHubQos;
            this.targetType = response.targetType;
            this.topicFilter = response.topicFilter;
        } 

        /**
         * InstanceId.
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
         * RouteId.
         */
        public Builder routeId(Long routeId) {
            this.putQueryParameter("RouteId", routeId);
            this.routeId = routeId;
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
         * SourceType.
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
         * TargetType.
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
        public UpdateEdgeInstanceMessageRoutingRequest build() {
            return new UpdateEdgeInstanceMessageRoutingRequest(this);
        } 

    } 

}
