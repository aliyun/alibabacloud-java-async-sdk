// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSyntheticMonitorsResponseBody} extends {@link TeaModel}
 *
 * <p>GetSyntheticMonitorsResponseBody</p>
 */
public class GetSyntheticMonitorsResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetSyntheticMonitorsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSyntheticMonitorsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(Long code) {
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSyntheticMonitorsResponseBody build() {
            return new GetSyntheticMonitorsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Available")
        private String available;

        @NameInMap("CanBeSelected")
        private Boolean canBeSelected;

        @NameInMap("City")
        private String city;

        @NameInMap("CityCode")
        private String cityCode;

        @NameInMap("ClientType")
        private Integer clientType;

        @NameInMap("Country")
        private String country;

        @NameInMap("Ipv6")
        private Integer ipv6;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("OperatorCode")
        private String operatorCode;

        @NameInMap("Region")
        private String region;

        private Data(Builder builder) {
            this.available = builder.available;
            this.canBeSelected = builder.canBeSelected;
            this.city = builder.city;
            this.cityCode = builder.cityCode;
            this.clientType = builder.clientType;
            this.country = builder.country;
            this.ipv6 = builder.ipv6;
            this.operator = builder.operator;
            this.operatorCode = builder.operatorCode;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return available
         */
        public String getAvailable() {
            return this.available;
        }

        /**
         * @return canBeSelected
         */
        public Boolean getCanBeSelected() {
            return this.canBeSelected;
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
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return clientType
         */
        public Integer getClientType() {
            return this.clientType;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return ipv6
         */
        public Integer getIpv6() {
            return this.ipv6;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return operatorCode
         */
        public String getOperatorCode() {
            return this.operatorCode;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String available; 
            private Boolean canBeSelected; 
            private String city; 
            private String cityCode; 
            private Integer clientType; 
            private String country; 
            private Integer ipv6; 
            private String operator; 
            private String operatorCode; 
            private String region; 

            /**
             * Available.
             */
            public Builder available(String available) {
                this.available = available;
                return this;
            }

            /**
             * CanBeSelected.
             */
            public Builder canBeSelected(Boolean canBeSelected) {
                this.canBeSelected = canBeSelected;
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
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * ClientType.
             */
            public Builder clientType(Integer clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * Country.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * Ipv6.
             */
            public Builder ipv6(Integer ipv6) {
                this.ipv6 = ipv6;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * OperatorCode.
             */
            public Builder operatorCode(String operatorCode) {
                this.operatorCode = operatorCode;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
