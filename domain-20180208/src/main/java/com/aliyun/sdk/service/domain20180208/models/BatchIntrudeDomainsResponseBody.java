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
 * {@link BatchIntrudeDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>BatchIntrudeDomainsResponseBody</p>
 */
public class BatchIntrudeDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BatchIntrudeDomainsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchIntrudeDomainsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(BatchIntrudeDomainsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchIntrudeDomainsResponseBody build() {
            return new BatchIntrudeDomainsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchIntrudeDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>BatchIntrudeDomainsResponseBody</p>
     */
    public static class FailureList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private FailureList(Builder builder) {
            this.domainName = builder.domainName;
            this.errorCode = builder.errorCode;
            this.errorMsg = builder.errorMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailureList create() {
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

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String domainName; 
            private String errorCode; 
            private String errorMsg; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(FailureList model) {
                this.domainName = model.domainName;
                this.errorCode = model.errorCode;
                this.errorMsg = model.errorMsg;
                this.success = model.success;
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

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public FailureList build() {
                return new FailureList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchIntrudeDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>BatchIntrudeDomainsResponseBody</p>
     */
    public static class SuccessList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private SuccessList(Builder builder) {
            this.domainName = builder.domainName;
            this.errorCode = builder.errorCode;
            this.errorMsg = builder.errorMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessList create() {
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

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String domainName; 
            private String errorCode; 
            private String errorMsg; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(SuccessList model) {
                this.domainName = model.domainName;
                this.errorCode = model.errorCode;
                this.errorMsg = model.errorMsg;
                this.success = model.success;
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

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public SuccessList build() {
                return new SuccessList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchIntrudeDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>BatchIntrudeDomainsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailureCount")
        private Integer failureCount;

        @com.aliyun.core.annotation.NameInMap("FailureList")
        private java.util.List<FailureList> failureList;

        @com.aliyun.core.annotation.NameInMap("SuccessCount")
        private Integer successCount;

        @com.aliyun.core.annotation.NameInMap("SuccessList")
        private java.util.List<SuccessList> successList;

        private Data(Builder builder) {
            this.failureCount = builder.failureCount;
            this.failureList = builder.failureList;
            this.successCount = builder.successCount;
            this.successList = builder.successList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failureCount
         */
        public Integer getFailureCount() {
            return this.failureCount;
        }

        /**
         * @return failureList
         */
        public java.util.List<FailureList> getFailureList() {
            return this.failureList;
        }

        /**
         * @return successCount
         */
        public Integer getSuccessCount() {
            return this.successCount;
        }

        /**
         * @return successList
         */
        public java.util.List<SuccessList> getSuccessList() {
            return this.successList;
        }

        public static final class Builder {
            private Integer failureCount; 
            private java.util.List<FailureList> failureList; 
            private Integer successCount; 
            private java.util.List<SuccessList> successList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.failureCount = model.failureCount;
                this.failureList = model.failureList;
                this.successCount = model.successCount;
                this.successList = model.successList;
            } 

            /**
             * FailureCount.
             */
            public Builder failureCount(Integer failureCount) {
                this.failureCount = failureCount;
                return this;
            }

            /**
             * FailureList.
             */
            public Builder failureList(java.util.List<FailureList> failureList) {
                this.failureList = failureList;
                return this;
            }

            /**
             * SuccessCount.
             */
            public Builder successCount(Integer successCount) {
                this.successCount = successCount;
                return this;
            }

            /**
             * SuccessList.
             */
            public Builder successList(java.util.List<SuccessList> successList) {
                this.successList = successList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
