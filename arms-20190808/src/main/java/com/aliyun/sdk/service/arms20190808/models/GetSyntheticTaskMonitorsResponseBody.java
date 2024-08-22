// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSyntheticTaskMonitorsResponseBody} extends {@link TeaModel}
 *
 * <p>GetSyntheticTaskMonitorsResponseBody</p>
 */
public class GetSyntheticTaskMonitorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSyntheticTaskMonitorsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSyntheticTaskMonitorsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String msg; 
        private String requestId; 

        /**
         * The status code returned.
         * <p>
         * 
         * *   1001: The request was successful.
         * *   1002: The request failed.
         * *   1003: Parameter errors occurred.
         * *   1004: Authentication failed.
         * *   1006: The task does not exist.
         * *   1099: Internal errors occurred.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the monitoring point.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The message that is returned when the request failed.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSyntheticTaskMonitorsResponseBody build() {
            return new GetSyntheticTaskMonitorsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Busy")
        private Long busy;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("CityCode")
        private Long cityCode;

        @com.aliyun.core.annotation.NameInMap("ClientType")
        private Long clientType;

        @com.aliyun.core.annotation.NameInMap("District")
        private String district;

        @com.aliyun.core.annotation.NameInMap("NetServiceId")
        private Long netServiceId;

        @com.aliyun.core.annotation.NameInMap("NetServiceName")
        private String netServiceName;

        private Data(Builder builder) {
            this.busy = builder.busy;
            this.city = builder.city;
            this.cityCode = builder.cityCode;
            this.clientType = builder.clientType;
            this.district = builder.district;
            this.netServiceId = builder.netServiceId;
            this.netServiceName = builder.netServiceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return busy
         */
        public Long getBusy() {
            return this.busy;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return cityCode
         */
        public Long getCityCode() {
            return this.cityCode;
        }

        /**
         * @return clientType
         */
        public Long getClientType() {
            return this.clientType;
        }

        /**
         * @return district
         */
        public String getDistrict() {
            return this.district;
        }

        /**
         * @return netServiceId
         */
        public Long getNetServiceId() {
            return this.netServiceId;
        }

        /**
         * @return netServiceName
         */
        public String getNetServiceName() {
            return this.netServiceName;
        }

        public static final class Builder {
            private Long busy; 
            private String city; 
            private Long cityCode; 
            private Long clientType; 
            private String district; 
            private Long netServiceId; 
            private String netServiceName; 

            /**
             * The task status.
             * <p>
             * 
             * *   0: active
             * *   1: busy
             */
            public Builder busy(Long busy) {
                this.busy = busy;
                return this;
            }

            /**
             * The name of the city to which the monitoring point belongs.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * The ID of the city to which the monitoring point belongs.
             */
            public Builder cityCode(Long cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * The client type:
             * <p>
             * 
             * *   1: IDC
             * *   2: Last mile
             */
            public Builder clientType(Long clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * The region to which the monitoring point belongs.
             */
            public Builder district(String district) {
                this.district = district;
                return this;
            }

            /**
             * The ID of the carrier.
             */
            public Builder netServiceId(Long netServiceId) {
                this.netServiceId = netServiceId;
                return this;
            }

            /**
             * The name of the carrier.
             */
            public Builder netServiceName(String netServiceName) {
                this.netServiceName = netServiceName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
