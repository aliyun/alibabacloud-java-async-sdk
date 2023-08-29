// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutMessageResponseBody} extends {@link TeaModel}
 *
 * <p>PutMessageResponseBody</p>
 */
public class PutMessageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("data")
    private Data data;

    private PutMessageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutMessageResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    public static final class Builder {
        private String requestId; 
        private Data data; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public PutMessageResponseBody build() {
            return new PutMessageResponseBody(this);
        } 

    } 

    public static class KmoduleVerificationResult extends TeaModel {
        @NameInMap("code")
        private String code;

        @NameInMap("status")
        private Integer status;

        private KmoduleVerificationResult(Builder builder) {
            this.code = builder.code;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KmoduleVerificationResult create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String code; 
            private Integer status; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public KmoduleVerificationResult build() {
                return new KmoduleVerificationResult(this);
            } 

        } 

    }
    public static class PolicyProcResult extends TeaModel {
        @NameInMap("code")
        private String code;

        @NameInMap("procData")
        private String procData;

        private PolicyProcResult(Builder builder) {
            this.code = builder.code;
            this.procData = builder.procData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyProcResult create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return procData
         */
        public String getProcData() {
            return this.procData;
        }

        public static final class Builder {
            private String code; 
            private String procData; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * procData.
             */
            public Builder procData(String procData) {
                this.procData = procData;
                return this;
            }

            public PolicyProcResult build() {
                return new PolicyProcResult(this);
            } 

        } 

    }
    public static class ProgramVerificationResult extends TeaModel {
        @NameInMap("code")
        private String code;

        @NameInMap("status")
        private Integer status;

        private ProgramVerificationResult(Builder builder) {
            this.code = builder.code;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProgramVerificationResult create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String code; 
            private Integer status; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public ProgramVerificationResult build() {
                return new ProgramVerificationResult(this);
            } 

        } 

    }
    public static class SystemVerificationResult extends TeaModel {
        @NameInMap("code")
        private String code;

        @NameInMap("status")
        private Integer status;

        private SystemVerificationResult(Builder builder) {
            this.code = builder.code;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemVerificationResult create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String code; 
            private Integer status; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public SystemVerificationResult build() {
                return new SystemVerificationResult(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("kmoduleVerificationResult")
        private KmoduleVerificationResult kmoduleVerificationResult;

        @NameInMap("nextClientIMAIndex")
        private Long nextClientIMAIndex;

        @NameInMap("policyProcResult")
        private PolicyProcResult policyProcResult;

        @NameInMap("programVerificationResult")
        private ProgramVerificationResult programVerificationResult;

        @NameInMap("systemVerificationResult")
        private SystemVerificationResult systemVerificationResult;

        private Data(Builder builder) {
            this.kmoduleVerificationResult = builder.kmoduleVerificationResult;
            this.nextClientIMAIndex = builder.nextClientIMAIndex;
            this.policyProcResult = builder.policyProcResult;
            this.programVerificationResult = builder.programVerificationResult;
            this.systemVerificationResult = builder.systemVerificationResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return kmoduleVerificationResult
         */
        public KmoduleVerificationResult getKmoduleVerificationResult() {
            return this.kmoduleVerificationResult;
        }

        /**
         * @return nextClientIMAIndex
         */
        public Long getNextClientIMAIndex() {
            return this.nextClientIMAIndex;
        }

        /**
         * @return policyProcResult
         */
        public PolicyProcResult getPolicyProcResult() {
            return this.policyProcResult;
        }

        /**
         * @return programVerificationResult
         */
        public ProgramVerificationResult getProgramVerificationResult() {
            return this.programVerificationResult;
        }

        /**
         * @return systemVerificationResult
         */
        public SystemVerificationResult getSystemVerificationResult() {
            return this.systemVerificationResult;
        }

        public static final class Builder {
            private KmoduleVerificationResult kmoduleVerificationResult; 
            private Long nextClientIMAIndex; 
            private PolicyProcResult policyProcResult; 
            private ProgramVerificationResult programVerificationResult; 
            private SystemVerificationResult systemVerificationResult; 

            /**
             * kmoduleVerificationResult.
             */
            public Builder kmoduleVerificationResult(KmoduleVerificationResult kmoduleVerificationResult) {
                this.kmoduleVerificationResult = kmoduleVerificationResult;
                return this;
            }

            /**
             * nextClientIMAIndex.
             */
            public Builder nextClientIMAIndex(Long nextClientIMAIndex) {
                this.nextClientIMAIndex = nextClientIMAIndex;
                return this;
            }

            /**
             * policyProcResult.
             */
            public Builder policyProcResult(PolicyProcResult policyProcResult) {
                this.policyProcResult = policyProcResult;
                return this;
            }

            /**
             * programVerificationResult.
             */
            public Builder programVerificationResult(ProgramVerificationResult programVerificationResult) {
                this.programVerificationResult = programVerificationResult;
                return this;
            }

            /**
             * systemVerificationResult.
             */
            public Builder systemVerificationResult(SystemVerificationResult systemVerificationResult) {
                this.systemVerificationResult = systemVerificationResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
