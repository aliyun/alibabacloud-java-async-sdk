// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link GetTokenTrendResponseBody} extends {@link TeaModel}
 *
 * <p>GetTokenTrendResponseBody</p>
 */
public class GetTokenTrendResponseBody extends TeaModel {
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

    private GetTokenTrendResponseBody(Builder builder) {
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

    public static GetTokenTrendResponseBody create() {
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

        private Builder(GetTokenTrendResponseBody model) {
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
         * RequestId.
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

        public GetTokenTrendResponseBody build() {
            return new GetTokenTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTokenTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetTokenTrendResponseBody</p>
     */
    public static class Series extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<?> data;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Series(Builder builder) {
            this.data = builder.data;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Series create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<?> getData() {
            return this.data;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<?> data; 
            private String name; 

            private Builder() {
            } 

            private Builder(Series model) {
                this.data = model.data;
                this.name = model.name;
            } 

            /**
             * Data.
             */
            public Builder data(java.util.List<?> data) {
                this.data = data;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Series build() {
                return new Series(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTokenTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetTokenTrendResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupBy")
        private String groupBy;

        @com.aliyun.core.annotation.NameInMap("Series")
        private java.util.List<Series> series;

        private Data(Builder builder) {
            this.groupBy = builder.groupBy;
            this.series = builder.series;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return groupBy
         */
        public String getGroupBy() {
            return this.groupBy;
        }

        /**
         * @return series
         */
        public java.util.List<Series> getSeries() {
            return this.series;
        }

        public static final class Builder {
            private String groupBy; 
            private java.util.List<Series> series; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.groupBy = model.groupBy;
                this.series = model.series;
            } 

            /**
             * GroupBy.
             */
            public Builder groupBy(String groupBy) {
                this.groupBy = groupBy;
                return this;
            }

            /**
             * Series.
             */
            public Builder series(java.util.List<Series> series) {
                this.series = series;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
