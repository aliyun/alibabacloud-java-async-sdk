// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAllCitiesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAllCitiesResponseBody</p>
 */
public class QueryAllCitiesResponseBody extends TeaModel {
    @NameInMap("Cities")
    private Cities cities;

    @NameInMap("Code")
    private String code;

    @NameInMap("LogsId")
    private String logsId;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubCode")
    private String subCode;

    @NameInMap("SubMessage")
    private String subMessage;

    @NameInMap("Success")
    private Boolean success;

    private QueryAllCitiesResponseBody(Builder builder) {
        this.cities = builder.cities;
        this.code = builder.code;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAllCitiesResponseBody create() {
        return builder().build();
    }

    /**
     * @return cities
     */
    public Cities getCities() {
        return this.cities;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return logsId
     */
    public String getLogsId() {
        return this.logsId;
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

    /**
     * @return subCode
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * @return subMessage
     */
    public String getSubMessage() {
        return this.subMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Cities cities; 
        private String code; 
        private String logsId; 
        private String message; 
        private String requestId; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 

        /**
         * Cities.
         */
        public Builder cities(Cities cities) {
            this.cities = cities;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LogsId.
         */
        public Builder logsId(String logsId) {
            this.logsId = logsId;
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

        /**
         * SubCode.
         */
        public Builder subCode(String subCode) {
            this.subCode = subCode;
            return this;
        }

        /**
         * SubMessage.
         */
        public Builder subMessage(String subMessage) {
            this.subMessage = subMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryAllCitiesResponseBody build() {
            return new QueryAllCitiesResponseBody(this);
        } 

    } 

    public static class City extends TeaModel {
        @NameInMap("CityCode")
        private Long cityCode;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("ParentId")
        private Long parentId;

        @NameInMap("PinYin")
        private String pinYin;

        private City(Builder builder) {
            this.cityCode = builder.cityCode;
            this.id = builder.id;
            this.name = builder.name;
            this.parentId = builder.parentId;
            this.pinYin = builder.pinYin;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static City create() {
            return builder().build();
        }

        /**
         * @return cityCode
         */
        public Long getCityCode() {
            return this.cityCode;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        /**
         * @return pinYin
         */
        public String getPinYin() {
            return this.pinYin;
        }

        public static final class Builder {
            private Long cityCode; 
            private Long id; 
            private String name; 
            private Long parentId; 
            private String pinYin; 

            /**
             * CityCode.
             */
            public Builder cityCode(Long cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * PinYin.
             */
            public Builder pinYin(String pinYin) {
                this.pinYin = pinYin;
                return this;
            }

            public City build() {
                return new City(this);
            } 

        } 

    }
    public static class Cities extends TeaModel {
        @NameInMap("City")
        private java.util.List < City> city;

        private Cities(Builder builder) {
            this.city = builder.city;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cities create() {
            return builder().build();
        }

        /**
         * @return city
         */
        public java.util.List < City> getCity() {
            return this.city;
        }

        public static final class Builder {
            private java.util.List < City> city; 

            /**
             * City.
             */
            public Builder city(java.util.List < City> city) {
                this.city = city;
                return this;
            }

            public Cities build() {
                return new Cities(this);
            } 

        } 

    }
}
