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
 * {@link GlobalHotelSearchCityPageResponseBody} extends {@link TeaModel}
 *
 * <p>GlobalHotelSearchCityPageResponseBody</p>
 */
public class GlobalHotelSearchCityPageResponseBody extends TeaModel {
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

    private GlobalHotelSearchCityPageResponseBody(Builder builder) {
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

    public static GlobalHotelSearchCityPageResponseBody create() {
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

        private Builder(GlobalHotelSearchCityPageResponseBody model) {
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
         * <p>TraceId</p>
         * 
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        public Builder tracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }

        public GlobalHotelSearchCityPageResponseBody build() {
            return new GlobalHotelSearchCityPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GlobalHotelSearchCityPageResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelSearchCityPageResponseBody</p>
     */
    public static class Cities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CnName")
        private String cnName;

        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("Country")
        private Integer country;

        @com.aliyun.core.annotation.NameInMap("CountryCode")
        private String countryCode;

        @com.aliyun.core.annotation.NameInMap("EnName")
        private String enName;

        @com.aliyun.core.annotation.NameInMap("Level")
        private Integer level;

        @com.aliyun.core.annotation.NameInMap("ParentCode")
        private Integer parentCode;

        @com.aliyun.core.annotation.NameInMap("Region")
        private Integer region;

        private Cities(Builder builder) {
            this.cnName = builder.cnName;
            this.code = builder.code;
            this.country = builder.country;
            this.countryCode = builder.countryCode;
            this.enName = builder.enName;
            this.level = builder.level;
            this.parentCode = builder.parentCode;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cities create() {
            return builder().build();
        }

        /**
         * @return cnName
         */
        public String getCnName() {
            return this.cnName;
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return country
         */
        public Integer getCountry() {
            return this.country;
        }

        /**
         * @return countryCode
         */
        public String getCountryCode() {
            return this.countryCode;
        }

        /**
         * @return enName
         */
        public String getEnName() {
            return this.enName;
        }

        /**
         * @return level
         */
        public Integer getLevel() {
            return this.level;
        }

        /**
         * @return parentCode
         */
        public Integer getParentCode() {
            return this.parentCode;
        }

        /**
         * @return region
         */
        public Integer getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String cnName; 
            private Integer code; 
            private Integer country; 
            private String countryCode; 
            private String enName; 
            private Integer level; 
            private Integer parentCode; 
            private Integer region; 

            private Builder() {
            } 

            private Builder(Cities model) {
                this.cnName = model.cnName;
                this.code = model.code;
                this.country = model.country;
                this.countryCode = model.countryCode;
                this.enName = model.enName;
                this.level = model.level;
                this.parentCode = model.parentCode;
                this.region = model.region;
            } 

            /**
             * <p>The Chinese name of the city.</p>
             * 
             * <strong>example:</strong>
             * <p>北京市</p>
             */
            public Builder cnName(String cnName) {
                this.cnName = cnName;
                return this;
            }

            /**
             * <p>The city code.</p>
             * 
             * <strong>example:</strong>
             * <p>110100</p>
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The country code.</p>
             * 
             * <strong>example:</strong>
             * <p>156</p>
             */
            public Builder country(Integer country) {
                this.country = country;
                return this;
            }

            /**
             * <p>The country code in ISO 3166-1 alpha-2 format.</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder countryCode(String countryCode) {
                this.countryCode = countryCode;
                return this;
            }

            /**
             * <p>The English name of the city.</p>
             * 
             * <strong>example:</strong>
             * <p>Beijing</p>
             */
            public Builder enName(String enName) {
                this.enName = enName;
                return this;
            }

            /**
             * <p>The administrative level.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder level(Integer level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The parent city code.</p>
             * 
             * <strong>example:</strong>
             * <p>110000</p>
             */
            public Builder parentCode(Integer parentCode) {
                this.parentCode = parentCode;
                return this;
            }

            /**
             * <p>The region.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder region(Integer region) {
                this.region = region;
                return this;
            }

            public Cities build() {
                return new Cities(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelSearchCityPageResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelSearchCityPageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cities")
        private java.util.List<Cities> cities;

        @com.aliyun.core.annotation.NameInMap("HasNext")
        private Boolean hasNext;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.cities = builder.cities;
            this.hasNext = builder.hasNext;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cities
         */
        public java.util.List<Cities> getCities() {
            return this.cities;
        }

        /**
         * @return hasNext
         */
        public Boolean getHasNext() {
            return this.hasNext;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Cities> cities; 
            private Boolean hasNext; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cities = model.cities;
                this.hasNext = model.hasNext;
                this.total = model.total;
            } 

            /**
             * <p>The list of cities.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder cities(java.util.List<Cities> cities) {
                this.cities = cities;
                return this;
            }

            /**
             * <p>Indicates whether there is a next page.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasNext(Boolean hasNext) {
                this.hasNext = hasNext;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
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
