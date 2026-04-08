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
 * {@link LogDestination} extends {@link TeaModel}
 *
 * <p>LogDestination</p>
 */
public class LogDestination extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("slsLogDestination")
    private SLSLogDestination slsLogDestination;

    private LogDestination(Builder builder) {
        this.slsLogDestination = builder.slsLogDestination;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogDestination create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return slsLogDestination
     */
    public SLSLogDestination getSlsLogDestination() {
        return this.slsLogDestination;
    }

    public static final class Builder {
        private SLSLogDestination slsLogDestination; 

        private Builder() {
        } 

        private Builder(LogDestination model) {
            this.slsLogDestination = model.slsLogDestination;
        } 

        /**
         * <p>阿里云日志服务（SLS）的日志目标配置</p>
         */
        public Builder slsLogDestination(SLSLogDestination slsLogDestination) {
            this.slsLogDestination = slsLogDestination;
            return this;
        }

        public LogDestination build() {
            return new LogDestination(this);
        } 

    } 

}
