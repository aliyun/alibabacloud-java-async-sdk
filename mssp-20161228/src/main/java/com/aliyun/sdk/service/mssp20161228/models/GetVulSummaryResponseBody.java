// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetVulSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetVulSummaryResponseBody</p>
 */
public class GetVulSummaryResponseBody extends TeaModel {
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

    private GetVulSummaryResponseBody(Builder builder) {
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

    public static GetVulSummaryResponseBody create() {
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
         * <p>OK</p>
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
         * <p>Prompt message for the response result.</p>
         * 
         * <strong>example:</strong>
         * <p>system error</p>
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
         * <p>EF801DD1-D934-51B3-92D4-776CE17B184F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether the call was successful. - <strong>true</strong>: The call was successful. - <strong>false</strong>: The call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetVulSummaryResponseBody build() {
            return new GetVulSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVulSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetVulSummaryResponseBody</p>
     */
    public static class TrendList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("DealCount")
        private Long dealCount;

        @com.aliyun.core.annotation.NameInMap("FindCount")
        private Long findCount;

        private TrendList(Builder builder) {
            this.date = builder.date;
            this.dealCount = builder.dealCount;
            this.findCount = builder.findCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrendList create() {
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
             * <p>Time point.</p>
             * 
             * <strong>example:</strong>
             * <p>202407或者20240701</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>Number of handled items.</p>
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
             * <p>15</p>
             */
            public Builder findCount(Long findCount) {
                this.findCount = findCount;
                return this;
            }

            public TrendList build() {
                return new TrendList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVulSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetVulSummaryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompletedCount")
        private Long completedCount;

        @com.aliyun.core.annotation.NameInMap("DealRate")
        private String dealRate;

        @com.aliyun.core.annotation.NameInMap("TrendList")
        private java.util.List < TrendList> trendList;

        @com.aliyun.core.annotation.NameInMap("WaitHandleCount")
        private Long waitHandleCount;

        private Data(Builder builder) {
            this.completedCount = builder.completedCount;
            this.dealRate = builder.dealRate;
            this.trendList = builder.trendList;
            this.waitHandleCount = builder.waitHandleCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return completedCount
         */
        public Long getCompletedCount() {
            return this.completedCount;
        }

        /**
         * @return dealRate
         */
        public String getDealRate() {
            return this.dealRate;
        }

        /**
         * @return trendList
         */
        public java.util.List < TrendList> getTrendList() {
            return this.trendList;
        }

        /**
         * @return waitHandleCount
         */
        public Long getWaitHandleCount() {
            return this.waitHandleCount;
        }

        public static final class Builder {
            private Long completedCount; 
            private String dealRate; 
            private java.util.List < TrendList> trendList; 
            private Long waitHandleCount; 

            /**
             * <p>Number of completed items.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder completedCount(Long completedCount) {
                this.completedCount = completedCount;
                return this;
            }

            /**
             * <p>Risk convergence rate.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder dealRate(String dealRate) {
                this.dealRate = dealRate;
                return this;
            }

            /**
             * <p>Collection of vulnerability trend nodes.</p>
             */
            public Builder trendList(java.util.List < TrendList> trendList) {
                this.trendList = trendList;
                return this;
            }

            /**
             * <p>Number of unhandled items.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder waitHandleCount(Long waitHandleCount) {
                this.waitHandleCount = waitHandleCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
