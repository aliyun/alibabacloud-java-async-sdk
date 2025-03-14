// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeClientConfSetupResponseBody model) {
            this.clientConf = model.clientConf;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The configurations of the Security Center agent.</p>
         */
        public Builder clientConf(ClientConf clientConf) {
            this.clientConf = clientConf;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>151F6EB6-D5F3-417A-AF7B-4D84975D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClientConfSetupResponseBody build() {
            return new DescribeClientConfSetupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClientConfSetupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClientConfSetupResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ClientConf model) {
                this.config = model.config;
                this.strategyTag = model.strategyTag;
                this.strategyTagValue = model.strategyTagValue;
            } 

            /**
             * <p>The configurations of the usage for the Security Center agent.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;mem&quot;:&quot;200&quot;,&quot;cpu&quot;:&quot;10&quot;,&quot;cpu_all&quot;:&quot;0&quot;}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The tag that is added to the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>machineResource</p>
             */
            public Builder strategyTag(String strategyTag) {
                this.strategyTag = strategyTag;
                return this;
            }

            /**
             * <p>The value of the tag. Valid values:</p>
             * <ul>
             * <li>major</li>
             * <li>advanced</li>
             * <li>basic</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>major</p>
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
