// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeInstanceConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceConfigResponseBody</p>
 */
public class DescribeInstanceConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("ParamNoLooseSentinelEnabled")
    private String paramNoLooseSentinelEnabled;

    @com.aliyun.core.annotation.NameInMap("ParamNoLooseSentinelPasswordFreeAccess")
    private String paramNoLooseSentinelPasswordFreeAccess;

    @com.aliyun.core.annotation.NameInMap("ParamNoLooseSentinelPasswordFreeCommands")
    private String paramNoLooseSentinelPasswordFreeCommands;

    @com.aliyun.core.annotation.NameInMap("ParamReplMode")
    private String paramReplMode;

    @com.aliyun.core.annotation.NameInMap("ParamReplTimeout")
    private String paramReplTimeout;

    @com.aliyun.core.annotation.NameInMap("ParamSentinelCompatEnable")
    private String paramSentinelCompatEnable;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceConfigResponseBody(Builder builder) {
        this.config = builder.config;
        this.paramNoLooseSentinelEnabled = builder.paramNoLooseSentinelEnabled;
        this.paramNoLooseSentinelPasswordFreeAccess = builder.paramNoLooseSentinelPasswordFreeAccess;
        this.paramNoLooseSentinelPasswordFreeCommands = builder.paramNoLooseSentinelPasswordFreeCommands;
        this.paramReplMode = builder.paramReplMode;
        this.paramReplTimeout = builder.paramReplTimeout;
        this.paramSentinelCompatEnable = builder.paramSentinelCompatEnable;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return paramNoLooseSentinelEnabled
     */
    public String getParamNoLooseSentinelEnabled() {
        return this.paramNoLooseSentinelEnabled;
    }

    /**
     * @return paramNoLooseSentinelPasswordFreeAccess
     */
    public String getParamNoLooseSentinelPasswordFreeAccess() {
        return this.paramNoLooseSentinelPasswordFreeAccess;
    }

    /**
     * @return paramNoLooseSentinelPasswordFreeCommands
     */
    public String getParamNoLooseSentinelPasswordFreeCommands() {
        return this.paramNoLooseSentinelPasswordFreeCommands;
    }

    /**
     * @return paramReplMode
     */
    public String getParamReplMode() {
        return this.paramReplMode;
    }

    /**
     * @return paramReplTimeout
     */
    public String getParamReplTimeout() {
        return this.paramReplTimeout;
    }

    /**
     * @return paramSentinelCompatEnable
     */
    public String getParamSentinelCompatEnable() {
        return this.paramSentinelCompatEnable;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String config; 
        private String paramNoLooseSentinelEnabled; 
        private String paramNoLooseSentinelPasswordFreeAccess; 
        private String paramNoLooseSentinelPasswordFreeCommands; 
        private String paramReplMode; 
        private String paramReplTimeout; 
        private String paramSentinelCompatEnable; 
        private String requestId; 

        /**
         * <p>The parameter settings of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/43885.html">Parameter overview and configuration guide</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;EvictionPolicy&quot;:&quot;volatile-lru&quot;,&quot;hash-max-ziplist-entries&quot;:512,&quot;zset-max-ziplist-entries&quot;:128,&quot;list-max-ziplist-entries&quot;:512,&quot;list-max-ziplist-value&quot;:64,&quot;zset-max-ziplist-value&quot;:64,&quot;set-max-intset-entries&quot;:512,&quot;hash-max-ziplist-value&quot;:64}</p>
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * ParamNoLooseSentinelEnabled.
         */
        public Builder paramNoLooseSentinelEnabled(String paramNoLooseSentinelEnabled) {
            this.paramNoLooseSentinelEnabled = paramNoLooseSentinelEnabled;
            return this;
        }

        /**
         * ParamNoLooseSentinelPasswordFreeAccess.
         */
        public Builder paramNoLooseSentinelPasswordFreeAccess(String paramNoLooseSentinelPasswordFreeAccess) {
            this.paramNoLooseSentinelPasswordFreeAccess = paramNoLooseSentinelPasswordFreeAccess;
            return this;
        }

        /**
         * ParamNoLooseSentinelPasswordFreeCommands.
         */
        public Builder paramNoLooseSentinelPasswordFreeCommands(String paramNoLooseSentinelPasswordFreeCommands) {
            this.paramNoLooseSentinelPasswordFreeCommands = paramNoLooseSentinelPasswordFreeCommands;
            return this;
        }

        /**
         * ParamReplMode.
         */
        public Builder paramReplMode(String paramReplMode) {
            this.paramReplMode = paramReplMode;
            return this;
        }

        /**
         * ParamReplTimeout.
         */
        public Builder paramReplTimeout(String paramReplTimeout) {
            this.paramReplTimeout = paramReplTimeout;
            return this;
        }

        /**
         * ParamSentinelCompatEnable.
         */
        public Builder paramSentinelCompatEnable(String paramSentinelCompatEnable) {
            this.paramSentinelCompatEnable = paramSentinelCompatEnable;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4E2C08F6-2D11-4ECD-9A4C-27EF2D3D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceConfigResponseBody build() {
            return new DescribeInstanceConfigResponseBody(this);
        } 

    } 

}
