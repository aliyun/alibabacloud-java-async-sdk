// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link ETLConfiguration} extends {@link TeaModel}
 *
 * <p>ETLConfiguration</p>
 */
public class ETLConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accessKeyId")
    @Deprecated
    private String accessKeyId;

    @com.aliyun.core.annotation.NameInMap("accessKeySecret")
    @Deprecated
    private String accessKeySecret;

    @com.aliyun.core.annotation.NameInMap("fromTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long fromTime;

    @com.aliyun.core.annotation.NameInMap("lang")
    private String lang;

    @com.aliyun.core.annotation.NameInMap("logstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstore;

    @com.aliyun.core.annotation.NameInMap("parameters")
    private java.util.Map<String, ?> parameters;

    @com.aliyun.core.annotation.NameInMap("roleArn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleArn;

    @com.aliyun.core.annotation.NameInMap("script")
    @com.aliyun.core.annotation.Validation(required = true)
    private String script;

    @com.aliyun.core.annotation.NameInMap("sinks")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ETLConfigurationSink> sinks;

    @com.aliyun.core.annotation.NameInMap("toTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long toTime;

    private ETLConfiguration(Builder builder) {
        this.accessKeyId = builder.accessKeyId;
        this.accessKeySecret = builder.accessKeySecret;
        this.fromTime = builder.fromTime;
        this.lang = builder.lang;
        this.logstore = builder.logstore;
        this.parameters = builder.parameters;
        this.roleArn = builder.roleArn;
        this.script = builder.script;
        this.sinks = builder.sinks;
        this.toTime = builder.toTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ETLConfiguration create() {
        return builder().build();
    }

    /**
     * @return accessKeyId
     */
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * @return accessKeySecret
     */
    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    /**
     * @return fromTime
     */
    public Long getFromTime() {
        return this.fromTime;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return parameters
     */
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return script
     */
    public String getScript() {
        return this.script;
    }

    /**
     * @return sinks
     */
    public java.util.List<ETLConfigurationSink> getSinks() {
        return this.sinks;
    }

    /**
     * @return toTime
     */
    public Long getToTime() {
        return this.toTime;
    }

    public static final class Builder {
        private String accessKeyId; 
        private String accessKeySecret; 
        private Long fromTime; 
        private String lang; 
        private String logstore; 
        private java.util.Map<String, ?> parameters; 
        private String roleArn; 
        private String script; 
        private java.util.List<ETLConfigurationSink> sinks; 
        private Long toTime; 

        /**
         * accessKeyId.
         */
        public Builder accessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * accessKeySecret.
         */
        public Builder accessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1714274900</p>
         */
        public Builder fromTime(Long fromTime) {
            this.fromTime = fromTime;
            return this;
        }

        /**
         * lang.
         */
        public Builder lang(String lang) {
            this.lang = lang;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-logstore</p>
         */
        public Builder logstore(String logstore) {
            this.logstore = logstore;
            return this;
        }

        /**
         * parameters.
         */
        public Builder parameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::13234:role/logtarget</p>
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e_set(&quot;key&quot;,&quot;value&quot;)</p>
         */
        public Builder script(String script) {
            this.script = script;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sinks(java.util.List<ETLConfigurationSink> sinks) {
            this.sinks = sinks;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1714274970</p>
         */
        public Builder toTime(Long toTime) {
            this.toTime = toTime;
            return this;
        }

        public ETLConfiguration build() {
            return new ETLConfiguration(this);
        } 

    } 

}
