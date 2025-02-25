// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

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
 * {@link GetBaselineSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetBaselineSummaryResponseBody</p>
 */
public class GetBaselineSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetBaselineSummaryResponseBody(Builder builder) {
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

    public static GetBaselineSummaryResponseBody create() {
        return builder().build();
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

        /**
         * <p>Interface response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data returned by the interface.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Prompt message for the returned result.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>67D61738-5E38-5164-947A-34E3850D493A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. Values: true: success; false: failure.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetBaselineSummaryResponseBody build() {
            return new GetBaselineSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBaselineSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetBaselineSummaryResponseBody</p>
     */
    public static class TrendDTOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("DealCount")
        private Long dealCount;

        @com.aliyun.core.annotation.NameInMap("FindCount")
        private Long findCount;

        private TrendDTOList(Builder builder) {
            this.date = builder.date;
            this.dealCount = builder.dealCount;
            this.findCount = builder.findCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrendDTOList create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return dealCount
         */
        public Long getDealCount() {
            return this.dealCount;
        }

        /**
         * @return findCount
         */
        public Long getFindCount() {
            return this.findCount;
        }

        public static final class Builder {
            private String date; 
            private Long dealCount; 
            private Long findCount; 

            /**
             * <p>Date point.</p>
             * 
             * <strong>example:</strong>
             * <p>202408或者20240801</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>Number of processed items.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder dealCount(Long dealCount) {
                this.dealCount = dealCount;
                return this;
            }

            /**
             * <p>Number of discovered items.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder findCount(Long findCount) {
                this.findCount = findCount;
                return this;
            }

            public TrendDTOList build() {
                return new TrendDTOList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBaselineSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetBaselineSummaryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TrendDTOList")
        private java.util.List<TrendDTOList> trendDTOList;

        private Data(Builder builder) {
            this.trendDTOList = builder.trendDTOList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return trendDTOList
         */
        public java.util.List<TrendDTOList> getTrendDTOList() {
            return this.trendDTOList;
        }

        public static final class Builder {
            private java.util.List<TrendDTOList> trendDTOList; 

            /**
             * <p>Collection of baseline statistical data.</p>
             */
            public Builder trendDTOList(java.util.List<TrendDTOList> trendDTOList) {
                this.trendDTOList = trendDTOList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
