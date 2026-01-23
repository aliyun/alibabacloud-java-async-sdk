// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetStandardStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetStandardStatisticsResponseBody</p>
 */
public class GetStandardStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetStandardStatisticsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStandardStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetStandardStatisticsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetStandardStatisticsResponseBody build() {
            return new GetStandardStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStandardStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardStatisticsResponseBody</p>
     */
    public static class StandardTypeCountList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("StandardType")
        private String standardType;

        private StandardTypeCountList(Builder builder) {
            this.count = builder.count;
            this.standardType = builder.standardType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StandardTypeCountList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return standardType
         */
        public String getStandardType() {
            return this.standardType;
        }

        public static final class Builder {
            private Integer count; 
            private String standardType; 

            private Builder() {
            } 

            private Builder(StandardTypeCountList model) {
                this.count = model.count;
                this.standardType = model.standardType;
            } 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * StandardType.
             */
            public Builder standardType(String standardType) {
                this.standardType = standardType;
                return this;
            }

            public StandardTypeCountList build() {
                return new StandardTypeCountList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStandardStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardStatisticsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StandardTypeCountList")
        private java.util.List<StandardTypeCountList> standardTypeCountList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.standardTypeCountList = builder.standardTypeCountList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return standardTypeCountList
         */
        public java.util.List<StandardTypeCountList> getStandardTypeCountList() {
            return this.standardTypeCountList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<StandardTypeCountList> standardTypeCountList; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.standardTypeCountList = model.standardTypeCountList;
                this.totalCount = model.totalCount;
            } 

            /**
             * StandardTypeCountList.
             */
            public Builder standardTypeCountList(java.util.List<StandardTypeCountList> standardTypeCountList) {
                this.standardTypeCountList = standardTypeCountList;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
