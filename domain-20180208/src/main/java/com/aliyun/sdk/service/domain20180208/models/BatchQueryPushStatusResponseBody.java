// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link BatchQueryPushStatusResponseBody} extends {@link TeaModel}
 *
 * <p>BatchQueryPushStatusResponseBody</p>
 */
public class BatchQueryPushStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllowRetry")
    private Boolean allowRetry;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private BatchQueryPushStatusResponseBody(Builder builder) {
        this.allowRetry = builder.allowRetry;
        this.httpStatusCode = builder.httpStatusCode;
        this.maxResults = builder.maxResults;
        this.module = builder.module;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchQueryPushStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowRetry
     */
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    /**
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private Boolean allowRetry; 
        private Long httpStatusCode; 
        private Integer maxResults; 
        private Module module; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(BatchQueryPushStatusResponseBody model) {
            this.allowRetry = model.allowRetry;
            this.httpStatusCode = model.httpStatusCode;
            this.maxResults = model.maxResults;
            this.module = model.module;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AllowRetry.
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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

        public BatchQueryPushStatusResponseBody build() {
            return new BatchQueryPushStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchQueryPushStatusResponseBody} extends {@link TeaModel}
     *
     * <p>BatchQueryPushStatusResponseBody</p>
     */
    public static class PushResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OutBizId")
        private String outBizId;

        @com.aliyun.core.annotation.NameInMap("PushNo")
        private String pushNo;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusDesc")
        private String statusDesc;

        private PushResults(Builder builder) {
            this.outBizId = builder.outBizId;
            this.pushNo = builder.pushNo;
            this.status = builder.status;
            this.statusDesc = builder.statusDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushResults create() {
            return builder().build();
        }

        /**
         * @return outBizId
         */
        public String getOutBizId() {
            return this.outBizId;
        }

        /**
         * @return pushNo
         */
        public String getPushNo() {
            return this.pushNo;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public static final class Builder {
            private String outBizId; 
            private String pushNo; 
            private String status; 
            private String statusDesc; 

            private Builder() {
            } 

            private Builder(PushResults model) {
                this.outBizId = model.outBizId;
                this.pushNo = model.pushNo;
                this.status = model.status;
                this.statusDesc = model.statusDesc;
            } 

            /**
             * OutBizId.
             */
            public Builder outBizId(String outBizId) {
                this.outBizId = outBizId;
                return this;
            }

            /**
             * PushNo.
             */
            public Builder pushNo(String pushNo) {
                this.pushNo = pushNo;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StatusDesc.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            public PushResults build() {
                return new PushResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchQueryPushStatusResponseBody} extends {@link TeaModel}
     *
     * <p>BatchQueryPushStatusResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PushResults")
        private java.util.List<PushResults> pushResults;

        private Module(Builder builder) {
            this.pushResults = builder.pushResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return pushResults
         */
        public java.util.List<PushResults> getPushResults() {
            return this.pushResults;
        }

        public static final class Builder {
            private java.util.List<PushResults> pushResults; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.pushResults = model.pushResults;
            } 

            /**
             * PushResults.
             */
            public Builder pushResults(java.util.List<PushResults> pushResults) {
                this.pushResults = pushResults;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
