// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link RunLog} extends {@link TeaModel}
 *
 * <p>RunLog</p>
 */
public class RunLog extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("driverStartup")
    private String driverStartup;

    @com.aliyun.core.annotation.NameInMap("driverStdError")
    private String driverStdError;

    @com.aliyun.core.annotation.NameInMap("driverStdOut")
    private String driverStdOut;

    @com.aliyun.core.annotation.NameInMap("driverSyslog")
    private String driverSyslog;

    private RunLog(Builder builder) {
        this.driverStartup = builder.driverStartup;
        this.driverStdError = builder.driverStdError;
        this.driverStdOut = builder.driverStdOut;
        this.driverSyslog = builder.driverSyslog;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunLog create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return driverStartup
     */
    public String getDriverStartup() {
        return this.driverStartup;
    }

    /**
     * @return driverStdError
     */
    public String getDriverStdError() {
        return this.driverStdError;
    }

    /**
     * @return driverStdOut
     */
    public String getDriverStdOut() {
        return this.driverStdOut;
    }

    /**
     * @return driverSyslog
     */
    public String getDriverSyslog() {
        return this.driverSyslog;
    }

    public static final class Builder {
        private String driverStartup; 
        private String driverStdError; 
        private String driverStdOut; 
        private String driverSyslog; 

        private Builder() {
        } 

        private Builder(RunLog model) {
            this.driverStartup = model.driverStartup;
            this.driverStdError = model.driverStdError;
            this.driverStdOut = model.driverStdOut;
            this.driverSyslog = model.driverSyslog;
        } 

        /**
         * <p>The path of the startup file.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/startup</p>
         */
        public Builder driverStartup(String driverStartup) {
            this.driverStartup = driverStartup;
            return this;
        }

        /**
         * <p>The path of the stderr file.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/stderr</p>
         */
        public Builder driverStdError(String driverStdError) {
            this.driverStdError = driverStdError;
            return this;
        }

        /**
         * <p>The path of the stdout file.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/stdout</p>
         */
        public Builder driverStdOut(String driverStdOut) {
            this.driverStdOut = driverStdOut;
            return this;
        }

        /**
         * <p>The path of the syslog file.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/syslog</p>
         */
        public Builder driverSyslog(String driverSyslog) {
            this.driverSyslog = driverSyslog;
            return this;
        }

        public RunLog build() {
            return new RunLog(this);
        } 

    } 

}
