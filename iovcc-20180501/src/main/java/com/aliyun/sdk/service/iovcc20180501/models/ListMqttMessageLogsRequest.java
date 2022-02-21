// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMqttMessageLogsRequest} extends {@link RequestModel}
 *
 * <p>ListMqttMessageLogsRequest</p>
 */
public class ListMqttMessageLogsRequest extends Request {
    @Query
    @NameInMap("AppKey")
    @Validation(required = true)
    private String appKey;

    @Query
    @NameInMap("ClientId")
    private String clientId;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true, maximum = 2147483647)
    private Integer endTime;

    @Query
    @NameInMap("Mid")
    private String mid;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true, maximum = 2147483647)
    private Integer startTime;

    @Query
    @NameInMap("Topic")
    private String topic;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private ListMqttMessageLogsRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.clientId = builder.clientId;
        this.endTime = builder.endTime;
        this.mid = builder.mid;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
        this.topic = builder.topic;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMqttMessageLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return endTime
     */
    public Integer getEndTime() {
        return this.endTime;
    }

    /**
     * @return mid
     */
    public String getMid() {
        return this.mid;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public Integer getStartTime() {
        return this.startTime;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListMqttMessageLogsRequest, Builder> {
        private String appKey; 
        private String clientId; 
        private Integer endTime; 
        private String mid; 
        private String projectId; 
        private String regionId; 
        private Integer startTime; 
        private String topic; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListMqttMessageLogsRequest response) {
            super(response);
            this.appKey = response.appKey;
            this.clientId = response.clientId;
            this.endTime = response.endTime;
            this.mid = response.mid;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.startTime = response.startTime;
            this.topic = response.topic;
            this.type = response.type;
        } 

        /**
         * AppKey.
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Integer endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Mid.
         */
        public Builder mid(String mid) {
            this.putQueryParameter("Mid", mid);
            this.mid = mid;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
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
         * StartTime.
         */
        public Builder startTime(Integer startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Topic.
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListMqttMessageLogsRequest build() {
            return new ListMqttMessageLogsRequest(this);
        } 

    } 

}
