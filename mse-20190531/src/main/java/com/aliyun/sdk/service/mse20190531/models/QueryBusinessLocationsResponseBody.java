// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBusinessLocationsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryBusinessLocationsResponseBody</p>
 */
public class QueryBusinessLocationsResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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
         * Success.
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
        @NameInMap("CnName")
        private String cnName;

        @NameInMap("Description")
        private String description;

        @NameInMap("DistrictCnName")
        private String districtCnName;

        @NameInMap("DistrictEnName")
        private String districtEnName;

        @NameInMap("DistrictId")
        private String districtId;

        @NameInMap("DistrictOrdering")
        private Integer districtOrdering;

        @NameInMap("DistrictShowName")
        private String districtShowName;

        @NameInMap("EnDescription")
        private String enDescription;

        @NameInMap("EnName")
        private String enName;

        @NameInMap("Name")
        private String name;

        @NameInMap("Ordering")
        private Integer ordering;

        @NameInMap("ShowName")
        private String showName;

        @NameInMap("Type")
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
             * CnName.
             */
            public Builder cnName(String cnName) {
                this.cnName = cnName;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DistrictCnName.
             */
            public Builder districtCnName(String districtCnName) {
                this.districtCnName = districtCnName;
                return this;
            }

            /**
             * DistrictEnName.
             */
            public Builder districtEnName(String districtEnName) {
                this.districtEnName = districtEnName;
                return this;
            }

            /**
             * DistrictId.
             */
            public Builder districtId(String districtId) {
                this.districtId = districtId;
                return this;
            }

            /**
             * DistrictOrdering.
             */
            public Builder districtOrdering(Integer districtOrdering) {
                this.districtOrdering = districtOrdering;
                return this;
            }

            /**
             * DistrictShowName.
             */
            public Builder districtShowName(String districtShowName) {
                this.districtShowName = districtShowName;
                return this;
            }

            /**
             * EnDescription.
             */
            public Builder enDescription(String enDescription) {
                this.enDescription = enDescription;
                return this;
            }

            /**
             * EnName.
             */
            public Builder enName(String enName) {
                this.enName = enName;
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
             * Ordering.
             */
            public Builder ordering(Integer ordering) {
                this.ordering = ordering;
                return this;
            }

            /**
             * ShowName.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * Type.
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
