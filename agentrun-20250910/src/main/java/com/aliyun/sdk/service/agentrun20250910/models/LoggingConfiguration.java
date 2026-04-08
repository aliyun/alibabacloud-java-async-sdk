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
 * {@link LoggingConfiguration} extends {@link TeaModel}
 *
 * <p>LoggingConfiguration</p>
 */
public class LoggingConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("destinations")
    private java.util.List<LogDestination> destinations;

    private LoggingConfiguration(Builder builder) {
        this.destinations = builder.destinations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LoggingConfiguration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinations
     */
    public java.util.List<LogDestination> getDestinations() {
        return this.destinations;
    }

    public static final class Builder {
        private java.util.List<LogDestination> destinations; 

        private Builder() {
        } 

        private Builder(LoggingConfiguration model) {
            this.destinations = model.destinations;
        } 

        /**
         * <p>日志输出的目标配置列表</p>
         */
        public Builder destinations(java.util.List<LogDestination> destinations) {
            this.destinations = destinations;
            return this;
        }

        public LoggingConfiguration build() {
            return new LoggingConfiguration(this);
        } 

    } 

}
