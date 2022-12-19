// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClientConfSetupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClientConfSetupResponseBody</p>
 */
public class DescribeClientConfSetupResponseBody extends TeaModel {
    @NameInMap("ClientConf")
    private ClientConf clientConf;

    @NameInMap("RequestId")
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
         * ClientConf.
         */
        public Builder clientConf(ClientConf clientConf) {
            this.clientConf = clientConf;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("Config")
        private String config;

        @NameInMap("StrategyTag")
        private String strategyTag;

        @NameInMap("StrategyTagValue")
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
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * StrategyTag.
             */
            public Builder strategyTag(String strategyTag) {
                this.strategyTag = strategyTag;
                return this;
            }

            /**
             * StrategyTagValue.
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
