// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeInstanceConfigResponseBody model) {
            this.config = model.config;
            this.paramNoLooseSentinelEnabled = model.paramNoLooseSentinelEnabled;
            this.paramNoLooseSentinelPasswordFreeAccess = model.paramNoLooseSentinelPasswordFreeAccess;
            this.paramNoLooseSentinelPasswordFreeCommands = model.paramNoLooseSentinelPasswordFreeCommands;
            this.paramReplMode = model.paramReplMode;
            this.paramReplTimeout = model.paramReplTimeout;
            this.paramSentinelCompatEnable = model.paramSentinelCompatEnable;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The default configuration parameters of the instance. For more comprehensive parameter settings, call the <a href="https://help.aliyun.com/document_detail/473847.html">DescribeParameters</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;EvictionPolicy\&quot;:\&quot;volatile-lru\&quot;,\&quot;hash-max-ziplist-entries\&quot;:512,\&quot;zset-max-ziplist-entries\&quot;:128,\&quot;list-max-ziplist-entries\&quot;:512,\&quot;list-max-ziplist-value\&quot;:64,\&quot;zset-max-ziplist-value\&quot;:64,\&quot;set-max-intset-entries\&quot;:512,\&quot;hash-max-ziplist-value\&quot;:64}</p>
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The Sentinel compatibility mode. This parameter applies to non-cluster instances. Valid values:</p>
         * <ul>
         * <li><strong>no</strong> (default): disabled.</li>
         * <li><strong>yes</strong>: enabled.<blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/178911.html">Sentinel compatibility mode</a>.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>no</p>
         */
        public Builder paramNoLooseSentinelEnabled(String paramNoLooseSentinelEnabled) {
            this.paramNoLooseSentinelEnabled = paramNoLooseSentinelEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to allow password-free execution of Sentinel-related commands when Sentinel mode is enabled. Valid values:</p>
         * <ul>
         * <li><strong>no</strong> (default): disabled.</li>
         * <li><strong>yes</strong>: enabled. After this parameter is enabled, you can run Sentinel commands without a password on any connection and use the SENTINEL command to listen on the +switch-master channel.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>no</p>
         */
        public Builder paramNoLooseSentinelPasswordFreeAccess(String paramNoLooseSentinelPasswordFreeAccess) {
            this.paramNoLooseSentinelPasswordFreeAccess = paramNoLooseSentinelPasswordFreeAccess;
            return this;
        }

        /**
         * <p>After Sentinel mode and the ParamNoLooseSentinelPasswordFreeAccess parameter are enabled, you can use this parameter to add additional password-free commands to the list. The default value is empty.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder paramNoLooseSentinelPasswordFreeCommands(String paramNoLooseSentinelPasswordFreeCommands) {
            this.paramNoLooseSentinelPasswordFreeCommands = paramNoLooseSentinelPasswordFreeCommands;
            return this;
        }

        /**
         * <p>The synchronization mode. Valid values:</p>
         * <ul>
         * <li><strong>async</strong> (default): asynchronous mode.</li>
         * <li><strong>semisync</strong>: semi-synchronous mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>async</p>
         */
        public Builder paramReplMode(String paramReplMode) {
            this.paramReplMode = paramReplMode;
            return this;
        }

        /**
         * <p>The degradation threshold for semi-synchronous mode. This parameter can be configured only in semi-synchronous mode. Unit: ms. Valid values: 10 to 60000. Default value: 500.</p>
         * <blockquote>
         * <p>When the synchronization latency exceeds this threshold, the synchronization mode automatically switches to asynchronous mode. When the synchronization latency is eliminated, the synchronization mode automatically switches back to semi-synchronous mode.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder paramReplTimeout(String paramReplTimeout) {
            this.paramReplTimeout = paramReplTimeout;
            return this;
        }

        /**
         * <p>The Sentinel compatibility mode. This parameter applies to instances that use the proxy connection mode in cluster architecture or the read/write splitting architecture. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (default): disabled.</li>
         * <li><strong>1</strong>: enabled.<blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/178911.html">Sentinel compatibility mode</a>.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
