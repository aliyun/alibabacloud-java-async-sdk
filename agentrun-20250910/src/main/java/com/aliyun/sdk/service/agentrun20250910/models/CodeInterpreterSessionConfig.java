// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link CodeInterpreterSessionConfig} extends {@link TeaModel}
 *
 * <p>CodeInterpreterSessionConfig</p>
 */
public class CodeInterpreterSessionConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("environment")
    private java.util.Map<String, String> environment;

    @com.aliyun.core.annotation.NameInMap("timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.NameInMap("workingDirectory")
    private String workingDirectory;

    private CodeInterpreterSessionConfig(Builder builder) {
        this.environment = builder.environment;
        this.timeout = builder.timeout;
        this.workingDirectory = builder.workingDirectory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CodeInterpreterSessionConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return environment
     */
    public java.util.Map<String, String> getEnvironment() {
        return this.environment;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return workingDirectory
     */
    public String getWorkingDirectory() {
        return this.workingDirectory;
    }

    public static final class Builder {
        private java.util.Map<String, String> environment; 
        private Integer timeout; 
        private String workingDirectory; 

        private Builder() {
        } 

        private Builder(CodeInterpreterSessionConfig model) {
            this.environment = model.environment;
            this.timeout = model.timeout;
            this.workingDirectory = model.workingDirectory;
        } 

        /**
         * <p>代码解释器会话的环境变量配置</p>
         * 
         * <strong>example:</strong>
         * <p>PYTHONPATH=/app,DEBUG=true</p>
         */
        public Builder environment(java.util.Map<String, String> environment) {
            this.environment = environment;
            return this;
        }

        /**
         * <p>代码解释器会话的超时时间，单位为秒</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>代码解释器会话的工作目录路径</p>
         * 
         * <strong>example:</strong>
         * <p>/app</p>
         */
        public Builder workingDirectory(String workingDirectory) {
            this.workingDirectory = workingDirectory;
            return this;
        }

        public CodeInterpreterSessionConfig build() {
            return new CodeInterpreterSessionConfig(this);
        } 

    } 

}
