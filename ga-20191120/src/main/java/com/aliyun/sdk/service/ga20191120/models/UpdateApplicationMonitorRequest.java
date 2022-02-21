// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateApplicationMonitorRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationMonitorRequest</p>
 */
public class UpdateApplicationMonitorRequest extends Request {
    @Query
    @NameInMap("Address")
    private String address;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DetectThreshold")
    private Integer detectThreshold;

    @Query
    @NameInMap("ListenerId")
    private String listenerId;

    @Query
    @NameInMap("OptionsJson")
    private String optionsJson;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    @Query
    @NameInMap("TaskName")
    private String taskName;

    private UpdateApplicationMonitorRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.clientToken = builder.clientToken;
        this.detectThreshold = builder.detectThreshold;
        this.listenerId = builder.listenerId;
        this.optionsJson = builder.optionsJson;
        this.regionId = builder.regionId;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationMonitorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return detectThreshold
     */
    public Integer getDetectThreshold() {
        return this.detectThreshold;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    /**
     * @return optionsJson
     */
    public String getOptionsJson() {
        return this.optionsJson;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<UpdateApplicationMonitorRequest, Builder> {
        private String address; 
        private String clientToken; 
        private Integer detectThreshold; 
        private String listenerId; 
        private String optionsJson; 
        private String regionId; 
        private String taskId; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationMonitorRequest response) {
            super(response);
            this.address = response.address;
            this.clientToken = response.clientToken;
            this.detectThreshold = response.detectThreshold;
            this.listenerId = response.listenerId;
            this.optionsJson = response.optionsJson;
            this.regionId = response.regionId;
            this.taskId = response.taskId;
            this.taskName = response.taskName;
        } 

        /**
         * Address.
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DetectThreshold.
         */
        public Builder detectThreshold(Integer detectThreshold) {
            this.putQueryParameter("DetectThreshold", detectThreshold);
            this.detectThreshold = detectThreshold;
            return this;
        }

        /**
         * ListenerId.
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        /**
         * OptionsJson.
         */
        public Builder optionsJson(String optionsJson) {
            this.putQueryParameter("OptionsJson", optionsJson);
            this.optionsJson = optionsJson;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public UpdateApplicationMonitorRequest build() {
            return new UpdateApplicationMonitorRequest(this);
        } 

    } 

}
