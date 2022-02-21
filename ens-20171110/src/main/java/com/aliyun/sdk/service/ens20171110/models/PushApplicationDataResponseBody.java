// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushApplicationDataResponseBody} extends {@link TeaModel}
 *
 * <p>PushApplicationDataResponseBody</p>
 */
public class PushApplicationDataResponseBody extends TeaModel {
    @NameInMap("PushResults")
    private PushResults pushResults;

    @NameInMap("RequestId")
    private String requestId;

    private PushApplicationDataResponseBody(Builder builder) {
        this.pushResults = builder.pushResults;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushApplicationDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return pushResults
     */
    public PushResults getPushResults() {
        return this.pushResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PushResults pushResults; 
        private String requestId; 

        /**
         * PushResults.
         */
        public Builder pushResults(PushResults pushResults) {
            this.pushResults = pushResults;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PushApplicationDataResponseBody build() {
            return new PushApplicationDataResponseBody(this);
        } 

    } 

    public static class PushResult extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("ResultCode")
        private Integer resultCode;

        @NameInMap("ResultDescrip")
        private String resultDescrip;

        @NameInMap("Version")
        private String version;

        private PushResult(Builder builder) {
            this.name = builder.name;
            this.resultCode = builder.resultCode;
            this.resultDescrip = builder.resultDescrip;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushResult create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resultCode
         */
        public Integer getResultCode() {
            return this.resultCode;
        }

        /**
         * @return resultDescrip
         */
        public String getResultDescrip() {
            return this.resultDescrip;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String name; 
            private Integer resultCode; 
            private String resultDescrip; 
            private String version; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ResultCode.
             */
            public Builder resultCode(Integer resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            /**
             * ResultDescrip.
             */
            public Builder resultDescrip(String resultDescrip) {
                this.resultDescrip = resultDescrip;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public PushResult build() {
                return new PushResult(this);
            } 

        } 

    }
    public static class PushResults extends TeaModel {
        @NameInMap("PushResult")
        private java.util.List < PushResult> pushResult;

        private PushResults(Builder builder) {
            this.pushResult = builder.pushResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushResults create() {
            return builder().build();
        }

        /**
         * @return pushResult
         */
        public java.util.List < PushResult> getPushResult() {
            return this.pushResult;
        }

        public static final class Builder {
            private java.util.List < PushResult> pushResult; 

            /**
             * PushResult.
             */
            public Builder pushResult(java.util.List < PushResult> pushResult) {
                this.pushResult = pushResult;
                return this;
            }

            public PushResults build() {
                return new PushResults(this);
            } 

        } 

    }
}
