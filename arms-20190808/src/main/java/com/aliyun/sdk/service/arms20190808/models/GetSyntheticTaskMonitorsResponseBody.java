// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSyntheticTaskMonitorsResponseBody} extends {@link TeaModel}
 *
 * <p>GetSyntheticTaskMonitorsResponseBody</p>
 */
public class GetSyntheticTaskMonitorsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Msg")
    private String msg;

    @NameInMap("RequestId")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * Id of the request
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
        @NameInMap("Busy")
        private Long busy;

        @NameInMap("City")
        private String city;

        @NameInMap("CityCode")
        private Long cityCode;

        @NameInMap("ClientType")
        private Long clientType;

        @NameInMap("District")
        private String district;

        @NameInMap("NetServiceId")
        private Long netServiceId;

        @NameInMap("NetServiceName")
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
             * Busy.
             */
            public Builder busy(Long busy) {
                this.busy = busy;
                return this;
            }

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * CityCode.
             */
            public Builder cityCode(Long cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * ClientType.
             */
            public Builder clientType(Long clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * District.
             */
            public Builder district(String district) {
                this.district = district;
                return this;
            }

            /**
             * NetServiceId.
             */
            public Builder netServiceId(Long netServiceId) {
                this.netServiceId = netServiceId;
                return this;
            }

            /**
             * NetServiceName.
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
