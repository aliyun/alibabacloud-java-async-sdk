// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
 * {@link GlobalHotelSearchHotelListResponseBody} extends {@link TeaModel}
 *
 * <p>GlobalHotelSearchHotelListResponseBody</p>
 */
public class GlobalHotelSearchHotelListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TracerId")
    private String tracerId;

    private GlobalHotelSearchHotelListResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tracerId = builder.tracerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GlobalHotelSearchHotelListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return tracerId
     */
    public String getTracerId() {
        return this.tracerId;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 
        private String tracerId; 

        private Builder() {
        } 

        private Builder(GlobalHotelSearchHotelListResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.requestId = model.requestId;
            this.success = model.success;
            this.tracerId = model.tracerId;
        } 

        /**
         * <p>The business data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>CityCodeRequired</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>City code cannot be empty</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>The unique request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>260E4F99-983D-1919-834C-5C42E98E5B2B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>traceId</p>
         */
        public Builder tracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }

        public GlobalHotelSearchHotelListResponseBody build() {
            return new GlobalHotelSearchHotelListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GlobalHotelSearchHotelListResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelSearchHotelListResponseBody</p>
     */
    public static class Hotels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CityName")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("CountryName")
        private String countryName;

        @com.aliyun.core.annotation.NameInMap("HotelName")
        private String hotelName;

        @com.aliyun.core.annotation.NameInMap("StandardHotelId")
        private String standardHotelId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Hotels(Builder builder) {
            this.cityName = builder.cityName;
            this.countryName = builder.countryName;
            this.hotelName = builder.hotelName;
            this.standardHotelId = builder.standardHotelId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hotels create() {
            return builder().build();
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return countryName
         */
        public String getCountryName() {
            return this.countryName;
        }

        /**
         * @return hotelName
         */
        public String getHotelName() {
            return this.hotelName;
        }

        /**
         * @return standardHotelId
         */
        public String getStandardHotelId() {
            return this.standardHotelId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String cityName; 
            private String countryName; 
            private String hotelName; 
            private String standardHotelId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Hotels model) {
                this.cityName = model.cityName;
                this.countryName = model.countryName;
                this.hotelName = model.hotelName;
                this.standardHotelId = model.standardHotelId;
                this.status = model.status;
            } 

            /**
             * <p>The city name.</p>
             * 
             * <strong>example:</strong>
             * <p>Beijing</p>
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * <p>The country name.</p>
             * 
             * <strong>example:</strong>
             * <p>China</p>
             */
            public Builder countryName(String countryName) {
                this.countryName = countryName;
                return this;
            }

            /**
             * <p>The hotel name.</p>
             * 
             * <strong>example:</strong>
             * <p>Beijing Hotel</p>
             */
            public Builder hotelName(String hotelName) {
                this.hotelName = hotelName;
                return this;
            }

            /**
             * <p>The platform standard hotel ID.</p>
             * 
             * <strong>example:</strong>
             * <p>H001</p>
             */
            public Builder standardHotelId(String standardHotelId) {
                this.standardHotelId = standardHotelId;
                return this;
            }

            /**
             * <p>The hotel status. Valid values: ONLINE and OFFLINE.</p>
             * 
             * <strong>example:</strong>
             * <p>ONLINE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Hotels build() {
                return new Hotels(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelSearchHotelListResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelSearchHotelListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hotels")
        private java.util.List<Hotels> hotels;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.hotels = builder.hotels;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return hotels
         */
        public java.util.List<Hotels> getHotels() {
            return this.hotels;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Hotels> hotels; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.hotels = model.hotels;
                this.total = model.total;
            } 

            /**
             * <p>The list of hotels.</p>
             */
            public Builder hotels(java.util.List<Hotels> hotels) {
                this.hotels = hotels;
                return this;
            }

            /**
             * <p>The total number of hotels.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
