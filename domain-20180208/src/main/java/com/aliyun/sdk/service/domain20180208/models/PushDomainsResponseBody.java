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
 * {@link PushDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>PushDomainsResponseBody</p>
 */
public class PushDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PushDomainsResponseBody(Builder builder) {
        this.module = builder.module;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushDomainsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Module module; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PushDomainsResponseBody model) {
            this.module = model.module;
            this.requestId = model.requestId;
        } 

        /**
         * Module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PushDomainsResponseBody build() {
            return new PushDomainsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PushDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>PushDomainsResponseBody</p>
     */
    public static class FailedResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        private FailedResults(Builder builder) {
            this.domainName = builder.domainName;
            this.errorCode = builder.errorCode;
            this.errorMsg = builder.errorMsg;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedResults create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public static final class Builder {
            private String domainName; 
            private String errorCode; 
            private String errorMsg; 

            private Builder() {
            } 

            private Builder(FailedResults model) {
                this.domainName = model.domainName;
                this.errorCode = model.errorCode;
                this.errorMsg = model.errorMsg;
            } 

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
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
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            public FailedResults build() {
                return new FailedResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link PushDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>PushDomainsResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedResults")
        private java.util.List<FailedResults> failedResults;

        @com.aliyun.core.annotation.NameInMap("OutBizId")
        private String outBizId;

        @com.aliyun.core.annotation.NameInMap("PushNo")
        private String pushNo;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("SuccessDomains")
        private java.util.List<String> successDomains;

        private Module(Builder builder) {
            this.failedResults = builder.failedResults;
            this.outBizId = builder.outBizId;
            this.pushNo = builder.pushNo;
            this.success = builder.success;
            this.successDomains = builder.successDomains;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return failedResults
         */
        public java.util.List<FailedResults> getFailedResults() {
            return this.failedResults;
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
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return successDomains
         */
        public java.util.List<String> getSuccessDomains() {
            return this.successDomains;
        }

        public static final class Builder {
            private java.util.List<FailedResults> failedResults; 
            private String outBizId; 
            private String pushNo; 
            private Boolean success; 
            private java.util.List<String> successDomains; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.failedResults = model.failedResults;
                this.outBizId = model.outBizId;
                this.pushNo = model.pushNo;
                this.success = model.success;
                this.successDomains = model.successDomains;
            } 

            /**
             * FailedResults.
             */
            public Builder failedResults(java.util.List<FailedResults> failedResults) {
                this.failedResults = failedResults;
                return this;
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
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * SuccessDomains.
             */
            public Builder successDomains(java.util.List<String> successDomains) {
                this.successDomains = successDomains;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
