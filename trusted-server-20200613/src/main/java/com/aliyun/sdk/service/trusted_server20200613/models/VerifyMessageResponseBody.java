// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyMessageResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyMessageResponseBody</p>
 */
public class VerifyMessageResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private VerifyMessageResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyMessageResponseBody create() {
        return builder().build();
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

        public VerifyMessageResponseBody build() {
            return new VerifyMessageResponseBody(this);
        } 

    } 

    public static class ImaVerificationResult extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TcbObsolete")
        private java.util.List < String > tcbObsolete;

        @NameInMap("Untrusted")
        private java.util.List < String > untrusted;

        private ImaVerificationResult(Builder builder) {
            this.code = builder.code;
            this.status = builder.status;
            this.tcbObsolete = builder.tcbObsolete;
            this.untrusted = builder.untrusted;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImaVerificationResult create() {
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

        /**
         * @return tcbObsolete
         */
        public java.util.List < String > getTcbObsolete() {
            return this.tcbObsolete;
        }

        /**
         * @return untrusted
         */
        public java.util.List < String > getUntrusted() {
            return this.untrusted;
        }

        public static final class Builder {
            private String code; 
            private Integer status; 
            private java.util.List < String > tcbObsolete; 
            private java.util.List < String > untrusted; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TcbObsolete.
             */
            public Builder tcbObsolete(java.util.List < String > tcbObsolete) {
                this.tcbObsolete = tcbObsolete;
                return this;
            }

            /**
             * Untrusted.
             */
            public Builder untrusted(java.util.List < String > untrusted) {
                this.untrusted = untrusted;
                return this;
            }

            public ImaVerificationResult build() {
                return new ImaVerificationResult(this);
            } 

        } 

    }
    public static class PcrVerificationResult extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TcbObsolete")
        private java.util.List < String > tcbObsolete;

        @NameInMap("Untrusted")
        private java.util.List < String > untrusted;

        private PcrVerificationResult(Builder builder) {
            this.code = builder.code;
            this.status = builder.status;
            this.tcbObsolete = builder.tcbObsolete;
            this.untrusted = builder.untrusted;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PcrVerificationResult create() {
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

        /**
         * @return tcbObsolete
         */
        public java.util.List < String > getTcbObsolete() {
            return this.tcbObsolete;
        }

        /**
         * @return untrusted
         */
        public java.util.List < String > getUntrusted() {
            return this.untrusted;
        }

        public static final class Builder {
            private String code; 
            private Integer status; 
            private java.util.List < String > tcbObsolete; 
            private java.util.List < String > untrusted; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TcbObsolete.
             */
            public Builder tcbObsolete(java.util.List < String > tcbObsolete) {
                this.tcbObsolete = tcbObsolete;
                return this;
            }

            /**
             * Untrusted.
             */
            public Builder untrusted(java.util.List < String > untrusted) {
                this.untrusted = untrusted;
                return this;
            }

            public PcrVerificationResult build() {
                return new PcrVerificationResult(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ImaVerificationResult")
        private ImaVerificationResult imaVerificationResult;

        @NameInMap("PcrVerificationResult")
        private PcrVerificationResult pcrVerificationResult;

        private Data(Builder builder) {
            this.imaVerificationResult = builder.imaVerificationResult;
            this.pcrVerificationResult = builder.pcrVerificationResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return imaVerificationResult
         */
        public ImaVerificationResult getImaVerificationResult() {
            return this.imaVerificationResult;
        }

        /**
         * @return pcrVerificationResult
         */
        public PcrVerificationResult getPcrVerificationResult() {
            return this.pcrVerificationResult;
        }

        public static final class Builder {
            private ImaVerificationResult imaVerificationResult; 
            private PcrVerificationResult pcrVerificationResult; 

            /**
             * ImaVerificationResult.
             */
            public Builder imaVerificationResult(ImaVerificationResult imaVerificationResult) {
                this.imaVerificationResult = imaVerificationResult;
                return this;
            }

            /**
             * PcrVerificationResult.
             */
            public Builder pcrVerificationResult(PcrVerificationResult pcrVerificationResult) {
                this.pcrVerificationResult = pcrVerificationResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
