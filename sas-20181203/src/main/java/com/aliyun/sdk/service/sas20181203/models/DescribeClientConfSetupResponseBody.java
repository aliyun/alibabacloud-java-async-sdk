// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClientConfSetupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClientConfSetupResponseBody</p>
 */
public class DescribeClientConfSetupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClientConf")
    private ClientConf clientConf;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClientConfSetupResponseBody(Builder builder) {
        this.clientConf = builder.clientConf;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClientConfSetupResponseBody create() {
        return builder().build();
    }

    /**
     * @return clientConf
     */
    public ClientConf getClientConf() {
        return this.clientConf;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ClientConf clientConf; 
        private String requestId; 

        /**
         * The configurations of the Security Center agent.
         */
        public Builder clientConf(ClientConf clientConf) {
            this.clientConf = clientConf;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClientConfSetupResponseBody build() {
            return new DescribeClientConfSetupResponseBody(this);
        } 

    } 

    public static class ClientConf extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("StrategyTag")
        private String strategyTag;

        @com.aliyun.core.annotation.NameInMap("StrategyTagValue")
        private String strategyTagValue;

        private ClientConf(Builder builder) {
            this.config = builder.config;
            this.strategyTag = builder.strategyTag;
            this.strategyTagValue = builder.strategyTagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientConf create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return strategyTag
         */
        public String getStrategyTag() {
            return this.strategyTag;
        }

        /**
         * @return strategyTagValue
         */
        public String getStrategyTagValue() {
            return this.strategyTagValue;
        }

        public static final class Builder {
            private String config; 
            private String strategyTag; 
            private String strategyTagValue; 

            /**
             * The configurations of the usage for the Security Center agent.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * The tag that is added to the configuration.
             */
            public Builder strategyTag(String strategyTag) {
                this.strategyTag = strategyTag;
                return this;
            }

            /**
             * The value of the tag. Valid values:
             * <p>
             * 
             * *   major
             * *   advanced
             * *   basic
             */
            public Builder strategyTagValue(String strategyTagValue) {
                this.strategyTagValue = strategyTagValue;
                return this;
            }

            public ClientConf build() {
                return new ClientConf(this);
            } 

        } 

    }
}
