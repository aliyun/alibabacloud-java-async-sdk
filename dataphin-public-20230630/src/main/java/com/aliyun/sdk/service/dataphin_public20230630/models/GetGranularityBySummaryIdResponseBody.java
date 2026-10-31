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
 * {@link GetGranularityBySummaryIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetGranularityBySummaryIdResponseBody</p>
 */
public class GetGranularityBySummaryIdResponseBody extends TeaModel {
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

    private GetGranularityBySummaryIdResponseBody(Builder builder) {
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

    public static GetGranularityBySummaryIdResponseBody create() {
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

        private Builder(GetGranularityBySummaryIdResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. OK indicates that the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
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

        public GetGranularityBySummaryIdResponseBody build() {
            return new GetGranularityBySummaryIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGranularityBySummaryIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetGranularityBySummaryIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DimIds")
        private java.util.List<Long> dimIds;

        @com.aliyun.core.annotation.NameInMap("GranularityId")
        private Long granularityId;

        @com.aliyun.core.annotation.NameInMap("SummaryId")
        private Long summaryId;

        private Data(Builder builder) {
            this.dimIds = builder.dimIds;
            this.granularityId = builder.granularityId;
            this.summaryId = builder.summaryId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dimIds
         */
        public java.util.List<Long> getDimIds() {
            return this.dimIds;
        }

        /**
         * @return granularityId
         */
        public Long getGranularityId() {
            return this.granularityId;
        }

        /**
         * @return summaryId
         */
        public Long getSummaryId() {
            return this.summaryId;
        }

        public static final class Builder {
            private java.util.List<Long> dimIds; 
            private Long granularityId; 
            private Long summaryId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dimIds = model.dimIds;
                this.granularityId = model.granularityId;
                this.summaryId = model.summaryId;
            } 

            /**
             * <p>DimIds</p>
             */
            public Builder dimIds(java.util.List<Long> dimIds) {
                this.dimIds = dimIds;
                return this;
            }

            /**
             * <p>GranularityId</p>
             * 
             * <strong>example:</strong>
             * <p>122</p>
             */
            public Builder granularityId(Long granularityId) {
                this.granularityId = granularityId;
                return this;
            }

            /**
             * <p>SummaryId</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder summaryId(Long summaryId) {
                this.summaryId = summaryId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
