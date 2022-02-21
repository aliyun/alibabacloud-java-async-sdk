// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicationMonitorRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationMonitorRequest</p>
 */
public class CreateApplicationMonitorRequest extends Request {
    @Query
    @NameInMap("AcceleratorId")
    @Validation(required = true)
    private String acceleratorId;

    @Query
    @NameInMap("Address")
    @Validation(required = true)
    private String address;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DetectThreshold")
    @Validation(maximum = 100)
    private Integer detectThreshold;

    @Query
    @NameInMap("ListenerId")
    @Validation(required = true)
    private String listenerId;

    @Query
    @NameInMap("OptionsJson")
    private String optionsJson;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TaskName")
    @Validation(required = true)
    private String taskName;

    private CreateApplicationMonitorRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.address = builder.address;
        this.clientToken = builder.clientToken;
        this.detectThreshold = builder.detectThreshold;
        this.listenerId = builder.listenerId;
        this.optionsJson = builder.optionsJson;
        this.regionId = builder.regionId;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationMonitorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
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
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<CreateApplicationMonitorRequest, Builder> {
        private String acceleratorId; 
        private String address; 
        private String clientToken; 
        private Integer detectThreshold; 
        private String listenerId; 
        private String optionsJson; 
        private String regionId; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationMonitorRequest response) {
            super(response);
            this.acceleratorId = response.acceleratorId;
            this.address = response.address;
            this.clientToken = response.clientToken;
            this.detectThreshold = response.detectThreshold;
            this.listenerId = response.listenerId;
            this.optionsJson = response.optionsJson;
            this.regionId = response.regionId;
            this.taskName = response.taskName;
        } 

        /**
         * AcceleratorId.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
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
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public CreateApplicationMonitorRequest build() {
            return new CreateApplicationMonitorRequest(this);
        } 

    } 

}
