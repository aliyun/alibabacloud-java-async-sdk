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
    @NameInMap("DetectEnable")
    private Boolean detectEnable;

    @Query
    @NameInMap("DetectThreshold")
    @Validation(maximum = 100)
    private Integer detectThreshold;

    @Query
    @NameInMap("DetectTimes")
    private Integer detectTimes;

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
    @NameInMap("SilenceTime")
    private Integer silenceTime;

    @Query
    @NameInMap("TaskName")
    @Validation(required = true)
    private String taskName;

    private CreateApplicationMonitorRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.address = builder.address;
        this.clientToken = builder.clientToken;
        this.detectEnable = builder.detectEnable;
        this.detectThreshold = builder.detectThreshold;
        this.detectTimes = builder.detectTimes;
        this.listenerId = builder.listenerId;
        this.optionsJson = builder.optionsJson;
        this.regionId = builder.regionId;
        this.silenceTime = builder.silenceTime;
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
     * @return detectEnable
     */
    public Boolean getDetectEnable() {
        return this.detectEnable;
    }

    /**
     * @return detectThreshold
     */
    public Integer getDetectThreshold() {
        return this.detectThreshold;
    }

    /**
     * @return detectTimes
     */
    public Integer getDetectTimes() {
        return this.detectTimes;
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
     * @return silenceTime
     */
    public Integer getSilenceTime() {
        return this.silenceTime;
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
        private Boolean detectEnable; 
        private Integer detectThreshold; 
        private Integer detectTimes; 
        private String listenerId; 
        private String optionsJson; 
        private String regionId; 
        private Integer silenceTime; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationMonitorRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.address = request.address;
            this.clientToken = request.clientToken;
            this.detectEnable = request.detectEnable;
            this.detectThreshold = request.detectThreshold;
            this.detectTimes = request.detectTimes;
            this.listenerId = request.listenerId;
            this.optionsJson = request.optionsJson;
            this.regionId = request.regionId;
            this.silenceTime = request.silenceTime;
            this.taskName = request.taskName;
        } 

        /**
         * The ID of the GA instance on which to execute the origin probing task.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The URL or IP address that you want to probe.
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.
         * 
         * >  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** may be different for each API request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to enable the automatic diagnostics feature. Default value: false. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder detectEnable(Boolean detectEnable) {
            this.putQueryParameter("DetectEnable", detectEnable);
            this.detectEnable = detectEnable;
            return this;
        }

        /**
         * The threshold that is used to trigger the automatic diagnostics feature. Unit: %.
         * <p>
         * 
         * Valid values: **0** to **100**.
         * 
         * The default value is **0**, which indicates that the automatic diagnostics feature is not triggered.
         */
        public Builder detectThreshold(Integer detectThreshold) {
            this.putQueryParameter("DetectThreshold", detectThreshold);
            this.detectThreshold = detectThreshold;
            return this;
        }

        /**
         * The number of times that are required to reach the threshold before the automatic diagnostics feature can be triggered.
         * <p>
         * 
         * Valid values: **1** to **20**. Default value: **1**.
         */
        public Builder detectTimes(Integer detectTimes) {
            this.putQueryParameter("DetectTimes", detectTimes);
            this.detectTimes = detectTimes;
            return this;
        }

        /**
         * The ID of the listener on which to execute the origin probing task.
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        /**
         * The extended options of the listener protocol that is used by the origin probing task. The options vary based on the listener protocol.
         */
        public Builder optionsJson(String optionsJson) {
            this.putQueryParameter("OptionsJson", optionsJson);
            this.optionsJson = optionsJson;
            return this;
        }

        /**
         * The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The silence period of the automatic diagnostics feature. This parameter specifies the interval at which the automatic diagnostics feature is triggered. If the availability rate does not return to normal after GA triggers an automatic diagnostic, GA must wait until the silence period ends before GA can trigger another automatic diagnostic.
         * <p>
         * 
         * If the number of consecutive times that the availability rate drops below the threshold of automatic diagnostics reaches the value of the **DetectTimes** parameter, the automatic diagnostics feature is triggered. The automatic diagnostics feature is not triggered again within the silence period even if the availability rate stays below the threshold. If the availability rate does not return to normal after the silence period ends, the automatic diagnostics feature is triggered again.
         * 
         * Unit: seconds. Valid values: **300** to **86400**. Default value: **300**.
         */
        public Builder silenceTime(Integer silenceTime) {
            this.putQueryParameter("SilenceTime", silenceTime);
            this.silenceTime = silenceTime;
            return this;
        }

        /**
         * The name of the origin probing task.
         * <p>
         * 
         * The name must be 4 to 100 characters in length, and can contain digits, underscores (\_), and hyphens (-). It must start with a letter.
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
