// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApplicationMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationMonitorResponseBody</p>
 */
public class DescribeApplicationMonitorResponseBody extends TeaModel {
    @NameInMap("AcceleratorId")
    private String acceleratorId;

    @NameInMap("Address")
    private String address;

    @NameInMap("DetectEnable")
    private Boolean detectEnable;

    @NameInMap("DetectThreshold")
    private Integer detectThreshold;

    @NameInMap("DetectTimes")
    private Integer detectTimes;

    @NameInMap("IspCityList")
    private java.util.List < IspCityList> ispCityList;

    @NameInMap("ListenerId")
    private String listenerId;

    @NameInMap("OptionsJson")
    private String optionsJson;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SilenceTime")
    private Integer silenceTime;

    @NameInMap("State")
    private String state;

    @NameInMap("TaskId")
    private String taskId;

    @NameInMap("TaskName")
    private String taskName;

    private DescribeApplicationMonitorResponseBody(Builder builder) {
        this.acceleratorId = builder.acceleratorId;
        this.address = builder.address;
        this.detectEnable = builder.detectEnable;
        this.detectThreshold = builder.detectThreshold;
        this.detectTimes = builder.detectTimes;
        this.ispCityList = builder.ispCityList;
        this.listenerId = builder.listenerId;
        this.optionsJson = builder.optionsJson;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.silenceTime = builder.silenceTime;
        this.state = builder.state;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationMonitorResponseBody create() {
        return builder().build();
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
     * @return ispCityList
     */
    public java.util.List < IspCityList> getIspCityList() {
        return this.ispCityList;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return silenceTime
     */
    public Integer getSilenceTime() {
        return this.silenceTime;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
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

    public static final class Builder {
        private String acceleratorId; 
        private String address; 
        private Boolean detectEnable; 
        private Integer detectThreshold; 
        private Integer detectTimes; 
        private java.util.List < IspCityList> ispCityList; 
        private String listenerId; 
        private String optionsJson; 
        private String regionId; 
        private String requestId; 
        private Integer silenceTime; 
        private String state; 
        private String taskId; 
        private String taskName; 

        /**
         * The ID of the GA instance on which the origin probing task ran.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The URL or IP address that was probed.
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * Indicates whether the automatic diagnostics feature is enabled. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder detectEnable(Boolean detectEnable) {
            this.detectEnable = detectEnable;
            return this;
        }

        /**
         * The threshold that is used to trigger automatic diagnostics.
         * <p>
         * 
         * If the availability of the origin server drops below the specified threshold, the automatic diagnostics feature is triggered.
         */
        public Builder detectThreshold(Integer detectThreshold) {
            this.detectThreshold = detectThreshold;
            return this;
        }

        /**
         * The number of times that are required to reach the threshold before the automatic diagnostics feature is triggered.
         */
        public Builder detectTimes(Integer detectTimes) {
            this.detectTimes = detectTimes;
            return this;
        }

        /**
         * The probe points of the Internet service provider (ISP).
         */
        public Builder ispCityList(java.util.List < IspCityList> ispCityList) {
            this.ispCityList = ispCityList;
            return this;
        }

        /**
         * The ID of the listener on which the origin probing task ran.
         */
        public Builder listenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }

        /**
         * The extended options of the listener protocol that is used by the origin probing task. The options vary based on the listener protocol.
         */
        public Builder optionsJson(String optionsJson) {
            this.optionsJson = optionsJson;
            return this;
        }

        /**
         * The region ID of the GA instance. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The silence period of the automatic diagnostics feature. This parameter indicates the interval at which the automatic diagnostics feature is triggered. If the availability rate does not return to normal after GA triggers automatic diagnostics, GA must wait until the silence period ends before GA can trigger another automatic diagnostic.
         * <p>
         * 
         * If the number of consecutive times that the availability rate drops below the automatic diagnostics threshold reaches the value of **DetectTimes**, the automatic diagnostics feature is triggered. The automatic diagnostics feature is not triggered again within the silence period regardless of whether the availability rate remains below the threshold. If the availability rate does not return to normal after the silence period ends, the automatic diagnostics feature is triggered again.
         * 
         * Unit: seconds.
         */
        public Builder silenceTime(Integer silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }

        /**
         * The state of the application monitor task. Valid values:
         * <p>
         * 
         * - **init**
         * 
         * - **active**
         * 
         * - **updating**
         * 
         * - **inactive**
         * 
         * - **deleting**
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * The ID of the origin probing task.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * The name of the origin probing task.
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        public DescribeApplicationMonitorResponseBody build() {
            return new DescribeApplicationMonitorResponseBody(this);
        } 

    } 

    public static class IspCityList extends TeaModel {
        @NameInMap("City")
        private String city;

        @NameInMap("CityName")
        private String cityName;

        @NameInMap("Isp")
        private String isp;

        @NameInMap("IspName")
        private String ispName;

        private IspCityList(Builder builder) {
            this.city = builder.city;
            this.cityName = builder.cityName;
            this.isp = builder.isp;
            this.ispName = builder.ispName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IspCityList create() {
            return builder().build();
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return ispName
         */
        public String getIspName() {
            return this.ispName;
        }

        public static final class Builder {
            private String city; 
            private String cityName; 
            private String isp; 
            private String ispName; 

            /**
             * The ID of the city where the probe point of the ISP is deployed.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * The name of the city where the probe point of the ISP is deployed.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * The probe point ID of the ISP.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * The probe point name of the ISP.
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            public IspCityList build() {
                return new IspCityList(this);
            } 

        } 

    }
}
