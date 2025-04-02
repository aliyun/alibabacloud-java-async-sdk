// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link QueryBusinessLocationsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryBusinessLocationsResponseBody</p>
 */
public class QueryBusinessLocationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(QueryBusinessLocationsResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details of the data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-100-000</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The parameter is invalid.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3369AD10-F1A6-4E6F-B99E-20F51826****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public QueryBusinessLocationsResponseBody build() {
            return new QueryBusinessLocationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryBusinessLocationsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBusinessLocationsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.cnName = model.cnName;
                this.description = model.description;
                this.districtCnName = model.districtCnName;
                this.districtEnName = model.districtEnName;
                this.districtId = model.districtId;
                this.districtOrdering = model.districtOrdering;
                this.districtShowName = model.districtShowName;
                this.enDescription = model.enDescription;
                this.enName = model.enName;
                this.name = model.name;
                this.ordering = model.ordering;
                this.showName = model.showName;
                this.type = model.type;
            } 

            /**
             * <p>The Chinese name of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>China (Shanghai)</p>
             */
            public Builder cnName(String cnName) {
                this.cnName = cnName;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>China (Shanghai)</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The Chinese name of the district.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia Pacific</p>
             */
            public Builder districtCnName(String districtCnName) {
                this.districtCnName = districtCnName;
                return this;
            }

            /**
             * <p>The English name of the district.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia Pacific</p>
             */
            public Builder districtEnName(String districtEnName) {
                this.districtEnName = districtEnName;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>asia-pacific</p>
             */
            public Builder districtId(String districtId) {
                this.districtId = districtId;
                return this;
            }

            /**
             * <p>The ordering information of the district.</p>
             * 
             * <strong>example:</strong>
             * <p>101</p>
             */
            public Builder districtOrdering(Integer districtOrdering) {
                this.districtOrdering = districtOrdering;
                return this;
            }

            /**
             * <p>The display name of the district.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia Pacific</p>
             */
            public Builder districtShowName(String districtShowName) {
                this.districtShowName = districtShowName;
                return this;
            }

            /**
             * <p>The complete description of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>China East 2 (Shanghai)</p>
             */
            public Builder enDescription(String enDescription) {
                this.enDescription = enDescription;
                return this;
            }

            /**
             * <p>The English name of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>China (Shanghai)</p>
             */
            public Builder enName(String enName) {
                this.enName = enName;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ordering information.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder ordering(Integer ordering) {
                this.ordering = ordering;
                return this;
            }

            /**
             * <p>The display name.</p>
             * 
             * <strong>example:</strong>
             * <p>China (Shanghai)</p>
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * <p>The type.</p>
             * 
             * <strong>example:</strong>
             * <p>region</p>
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
