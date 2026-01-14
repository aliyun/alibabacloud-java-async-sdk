// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link DescribeApplicationMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationMonitorResponseBody</p>
 */
public class DescribeApplicationMonitorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    private String acceleratorId;

    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("DetectEnable")
    private Boolean detectEnable;

    @com.aliyun.core.annotation.NameInMap("DetectThreshold")
    private Integer detectThreshold;

    @com.aliyun.core.annotation.NameInMap("DetectTimes")
    private Integer detectTimes;

    @com.aliyun.core.annotation.NameInMap("IspCityList")
    private java.util.List<IspCityList> ispCityList;

    @com.aliyun.core.annotation.NameInMap("ListenerId")
    private String listenerId;

    @com.aliyun.core.annotation.NameInMap("OptionsJson")
    private String optionsJson;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SilenceTime")
    private Integer silenceTime;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskName")
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
    public java.util.List<IspCityList> getIspCityList() {
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
        private java.util.List<IspCityList> ispCityList; 
        private String listenerId; 
        private String optionsJson; 
        private String regionId; 
        private String requestId; 
        private Integer silenceTime; 
        private String state; 
        private String taskId; 
        private String taskName; 

        private Builder() {
        } 

        private Builder(DescribeApplicationMonitorResponseBody model) {
            this.acceleratorId = model.acceleratorId;
            this.address = model.address;
            this.detectEnable = model.detectEnable;
            this.detectThreshold = model.detectThreshold;
            this.detectTimes = model.detectTimes;
            this.ispCityList = model.ispCityList;
            this.listenerId = model.listenerId;
            this.optionsJson = model.optionsJson;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.silenceTime = model.silenceTime;
            this.state = model.state;
            this.taskId = model.taskId;
            this.taskName = model.taskName;
        } 

        /**
         * <p>The ID of the GA instance on which the origin probing task ran.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1odcab8tmno0hdq****</p>
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * <p>The URL or IP address that was probed.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * <p>Indicates whether the automatic diagnostics feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder detectEnable(Boolean detectEnable) {
            this.detectEnable = detectEnable;
            return this;
        }

        /**
         * <p>The threshold that is used to trigger automatic diagnostics.</p>
         * <p>If the availability of the origin server drops below the specified threshold, the automatic diagnostics feature is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder detectThreshold(Integer detectThreshold) {
            this.detectThreshold = detectThreshold;
            return this;
        }

        /**
         * <p>The number of times that are required to reach the threshold before the automatic diagnostics feature is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder detectTimes(Integer detectTimes) {
            this.detectTimes = detectTimes;
            return this;
        }

        /**
         * <p>The probe points of the Internet service provider (ISP).</p>
         */
        public Builder ispCityList(java.util.List<IspCityList> ispCityList) {
            this.ispCityList = ispCityList;
            return this;
        }

        /**
         * <p>The ID of the listener on which the origin probing task ran.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-bp1bpn0kn908w4nbw****</p>
         */
        public Builder listenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }

        /**
         * <p>The extended options of the listener protocol that is used by the origin probing task. The options vary based on the listener protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;http_method&quot;: &quot;get&quot;,&quot;header&quot;: &quot;key:asd&quot;,&quot;acceptable_response_code&quot;: &quot;500&quot;,&quot;cert_verify&quot;: true }</p>
         */
        public Builder optionsJson(String optionsJson) {
            this.optionsJson = optionsJson;
            return this;
        }

        /**
         * <p>The region ID of the GA instance. Set the value to <strong>cn-hangzhou</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The silence period of the automatic diagnostics feature. This parameter indicates the interval at which the automatic diagnostics feature is triggered. If the availability rate does not return to normal after GA triggers automatic diagnostics, GA must wait until the silence period ends before GA can trigger another automatic diagnostic.</p>
         * <p>If the number of consecutive times that the availability rate drops below the automatic diagnostics threshold reaches the value of <strong>DetectTimes</strong>, the automatic diagnostics feature is triggered. The automatic diagnostics feature is not triggered again within the silence period regardless of whether the availability rate remains below the threshold. If the availability rate does not return to normal after the silence period ends, the automatic diagnostics feature is triggered again.</p>
         * <p>Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder silenceTime(Integer silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }

        /**
         * <p>The status of the origin probing task. Valid values:</p>
         * <ul>
         * <li><strong>init</strong></li>
         * <li><strong>active</strong></li>
         * <li><strong>updating</strong></li>
         * <li><strong>inactive</strong></li>
         * <li><strong>deleting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The ID of the origin probing task.</p>
         * 
         * <strong>example:</strong>
         * <p>sm-bp1fpdjfju9k8yr1y****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The name of the origin probing task.</p>
         * 
         * <strong>example:</strong>
         * <p>task1</p>
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        public DescribeApplicationMonitorResponseBody build() {
            return new DescribeApplicationMonitorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApplicationMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationMonitorResponseBody</p>
     */
    public static class IspCityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("CityName")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("IspName")
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

            private Builder() {
            } 

            private Builder(IspCityList model) {
                this.city = model.city;
                this.cityName = model.cityName;
                this.isp = model.isp;
                this.ispName = model.ispName;
            } 

            /**
             * <p>The ID of the city in which the probe point of the ISP is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>375</p>
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * <p>The name of the city in which the probe point of the ISP is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>Singapore</p>
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * <p>The probe point ID of the ISP.</p>
             * 
             * <strong>example:</strong>
             * <p>465</p>
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * <p>The probe point name of the ISP.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba</p>
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
