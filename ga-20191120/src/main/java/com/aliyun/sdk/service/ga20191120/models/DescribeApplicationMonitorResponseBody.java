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

    @NameInMap("DetectThreshold")
    private String detectThreshold;

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

    @NameInMap("TaskId")
    private String taskId;

    @NameInMap("TaskName")
    private String taskName;

    private DescribeApplicationMonitorResponseBody(Builder builder) {
        this.acceleratorId = builder.acceleratorId;
        this.address = builder.address;
        this.detectThreshold = builder.detectThreshold;
        this.ispCityList = builder.ispCityList;
        this.listenerId = builder.listenerId;
        this.optionsJson = builder.optionsJson;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
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
     * @return detectThreshold
     */
    public String getDetectThreshold() {
        return this.detectThreshold;
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
        private String detectThreshold; 
        private java.util.List < IspCityList> ispCityList; 
        private String listenerId; 
        private String optionsJson; 
        private String regionId; 
        private String requestId; 
        private String taskId; 
        private String taskName; 

        /**
         * AcceleratorId.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * Address.
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * DetectThreshold.
         */
        public Builder detectThreshold(String detectThreshold) {
            this.detectThreshold = detectThreshold;
            return this;
        }

        /**
         * IspCityList.
         */
        public Builder ispCityList(java.util.List < IspCityList> ispCityList) {
            this.ispCityList = ispCityList;
            return this;
        }

        /**
         * ListenerId.
         */
        public Builder listenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }

        /**
         * OptionsJson.
         */
        public Builder optionsJson(String optionsJson) {
            this.optionsJson = optionsJson;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskName.
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
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * CityName.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * IspName.
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
