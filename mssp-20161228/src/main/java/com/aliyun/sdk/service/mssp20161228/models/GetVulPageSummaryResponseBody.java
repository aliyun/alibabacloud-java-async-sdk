// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetVulPageSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetVulPageSummaryResponseBody</p>
 */
public class GetVulPageSummaryResponseBody extends TeaModel {
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

    private GetVulPageSummaryResponseBody(Builder builder) {
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

    public static GetVulPageSummaryResponseBody create() {
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
         * <p>Interface return code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data query result.</p>
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
         * <p>Return message.</p>
         * 
         * <strong>example:</strong>
         * <p>operation success</p>
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
         * <p>A3A575C8-80F9-5F04-AA24-CCAC246884A3</p>
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

        public GetVulPageSummaryResponseBody build() {
            return new GetVulPageSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVulPageSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetVulPageSummaryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompletedCount")
        private Long completedCount;

        @com.aliyun.core.annotation.NameInMap("HandingCount")
        private Long handingCount;

        @com.aliyun.core.annotation.NameInMap("HighCount")
        private Long highCount;

        @com.aliyun.core.annotation.NameInMap("LowCount")
        private Long lowCount;

        @com.aliyun.core.annotation.NameInMap("MediumCount")
        private Long mediumCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("WaitHandleCount")
        private Long waitHandleCount;

        private Data(Builder builder) {
            this.completedCount = builder.completedCount;
            this.handingCount = builder.handingCount;
            this.highCount = builder.highCount;
            this.lowCount = builder.lowCount;
            this.mediumCount = builder.mediumCount;
            this.totalCount = builder.totalCount;
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
         * @return handingCount
         */
        public Long getHandingCount() {
            return this.handingCount;
        }

        /**
         * @return highCount
         */
        public Long getHighCount() {
            return this.highCount;
        }

        /**
         * @return lowCount
         */
        public Long getLowCount() {
            return this.lowCount;
        }

        /**
         * @return mediumCount
         */
        public Long getMediumCount() {
            return this.mediumCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return waitHandleCount
         */
        public Long getWaitHandleCount() {
            return this.waitHandleCount;
        }

        public static final class Builder {
            private Long completedCount; 
            private Long handingCount; 
            private Long highCount; 
            private Long lowCount; 
            private Long mediumCount; 
            private Long totalCount; 
            private Long waitHandleCount; 

            /**
             * <p>Number of completed items.</p>
             * 
             * <strong>example:</strong>
             * <p>1990</p>
             */
            public Builder completedCount(Long completedCount) {
                this.completedCount = completedCount;
                return this;
            }

            /**
             * <p>Number of items being handled.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder handingCount(Long handingCount) {
                this.handingCount = handingCount;
                return this;
            }

            /**
             * <p>Number of high-risk items.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder highCount(Long highCount) {
                this.highCount = highCount;
                return this;
            }

            /**
             * <p>Number of low-risk items.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder lowCount(Long lowCount) {
                this.lowCount = lowCount;
                return this;
            }

            /**
             * <p>Number of medium-risk items.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder mediumCount(Long mediumCount) {
                this.mediumCount = mediumCount;
                return this;
            }

            /**
             * <p>Total number of items.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>Number of unhandled items.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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
