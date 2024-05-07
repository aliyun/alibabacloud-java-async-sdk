// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBusinessLocationsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryBusinessLocationsResponseBody</p>
 */
public class QueryBusinessLocationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private QueryBusinessLocationsResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBusinessLocationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * The details of the data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The result of the request.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public QueryBusinessLocationsResponseBody build() {
            return new QueryBusinessLocationsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CnName")
        private String cnName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DistrictCnName")
        private String districtCnName;

        @com.aliyun.core.annotation.NameInMap("DistrictEnName")
        private String districtEnName;

        @com.aliyun.core.annotation.NameInMap("DistrictId")
        private String districtId;

        @com.aliyun.core.annotation.NameInMap("DistrictOrdering")
        private Integer districtOrdering;

        @com.aliyun.core.annotation.NameInMap("DistrictShowName")
        private String districtShowName;

        @com.aliyun.core.annotation.NameInMap("EnDescription")
        private String enDescription;

        @com.aliyun.core.annotation.NameInMap("EnName")
        private String enName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Ordering")
        private Integer ordering;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.cnName = builder.cnName;
            this.description = builder.description;
            this.districtCnName = builder.districtCnName;
            this.districtEnName = builder.districtEnName;
            this.districtId = builder.districtId;
            this.districtOrdering = builder.districtOrdering;
            this.districtShowName = builder.districtShowName;
            this.enDescription = builder.enDescription;
            this.enName = builder.enName;
            this.name = builder.name;
            this.ordering = builder.ordering;
            this.showName = builder.showName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cnName
         */
        public String getCnName() {
            return this.cnName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return districtCnName
         */
        public String getDistrictCnName() {
            return this.districtCnName;
        }

        /**
         * @return districtEnName
         */
        public String getDistrictEnName() {
            return this.districtEnName;
        }

        /**
         * @return districtId
         */
        public String getDistrictId() {
            return this.districtId;
        }

        /**
         * @return districtOrdering
         */
        public Integer getDistrictOrdering() {
            return this.districtOrdering;
        }

        /**
         * @return districtShowName
         */
        public String getDistrictShowName() {
            return this.districtShowName;
        }

        /**
         * @return enDescription
         */
        public String getEnDescription() {
            return this.enDescription;
        }

        /**
         * @return enName
         */
        public String getEnName() {
            return this.enName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ordering
         */
        public Integer getOrdering() {
            return this.ordering;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String cnName; 
            private String description; 
            private String districtCnName; 
            private String districtEnName; 
            private String districtId; 
            private Integer districtOrdering; 
            private String districtShowName; 
            private String enDescription; 
            private String enName; 
            private String name; 
            private Integer ordering; 
            private String showName; 
            private String type; 

            /**
             * The Chinese name of the region.
             */
            public Builder cnName(String cnName) {
                this.cnName = cnName;
                return this;
            }

            /**
             * The description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The Chinese name of the district.
             */
            public Builder districtCnName(String districtCnName) {
                this.districtCnName = districtCnName;
                return this;
            }

            /**
             * The English name of the district.
             */
            public Builder districtEnName(String districtEnName) {
                this.districtEnName = districtEnName;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder districtId(String districtId) {
                this.districtId = districtId;
                return this;
            }

            /**
             * The ordering information of the district.
             */
            public Builder districtOrdering(Integer districtOrdering) {
                this.districtOrdering = districtOrdering;
                return this;
            }

            /**
             * The display name of the district.
             */
            public Builder districtShowName(String districtShowName) {
                this.districtShowName = districtShowName;
                return this;
            }

            /**
             * The complete description of the region.
             */
            public Builder enDescription(String enDescription) {
                this.enDescription = enDescription;
                return this;
            }

            /**
             * The English name of the region.
             */
            public Builder enName(String enName) {
                this.enName = enName;
                return this;
            }

            /**
             * The name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ordering information.
             */
            public Builder ordering(Integer ordering) {
                this.ordering = ordering;
                return this;
            }

            /**
             * The display name.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * The type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
