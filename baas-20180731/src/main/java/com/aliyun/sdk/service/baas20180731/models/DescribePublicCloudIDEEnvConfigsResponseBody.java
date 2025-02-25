// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePublicCloudIDEEnvConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePublicCloudIDEEnvConfigsResponseBody</p>
 */
public class DescribePublicCloudIDEEnvConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    private DescribePublicCloudIDEEnvConfigsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePublicCloudIDEEnvConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public DescribePublicCloudIDEEnvConfigsResponseBody build() {
            return new DescribePublicCloudIDEEnvConfigsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bizid")
        private String bizid;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TrialAccount")
        private String trialAccount;

        @com.aliyun.core.annotation.NameInMap("TrialAccountPrivateKey")
        private String trialAccountPrivateKey;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Result(Builder builder) {
            this.bizid = builder.bizid;
            this.name = builder.name;
            this.trialAccount = builder.trialAccount;
            this.trialAccountPrivateKey = builder.trialAccountPrivateKey;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return bizid
         */
        public String getBizid() {
            return this.bizid;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return trialAccount
         */
        public String getTrialAccount() {
            return this.trialAccount;
        }

        /**
         * @return trialAccountPrivateKey
         */
        public String getTrialAccountPrivateKey() {
            return this.trialAccountPrivateKey;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String bizid; 
            private String name; 
            private String trialAccount; 
            private String trialAccountPrivateKey; 
            private String version; 

            /**
             * Bizid.
             */
            public Builder bizid(String bizid) {
                this.bizid = bizid;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * TrialAccount.
             */
            public Builder trialAccount(String trialAccount) {
                this.trialAccount = trialAccount;
                return this;
            }

            /**
             * TrialAccountPrivateKey.
             */
            public Builder trialAccountPrivateKey(String trialAccountPrivateKey) {
                this.trialAccountPrivateKey = trialAccountPrivateKey;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
