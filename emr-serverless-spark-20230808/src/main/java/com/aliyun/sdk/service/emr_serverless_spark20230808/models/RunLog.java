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

        /**
         * driverStartup.
         */
        public Builder driverStartup(String driverStartup) {
            this.driverStartup = driverStartup;
            return this;
        }

        /**
         * driverStdError.
         */
        public Builder driverStdError(String driverStdError) {
            this.driverStdError = driverStdError;
            return this;
        }

        /**
         * driverStdOut.
         */
        public Builder driverStdOut(String driverStdOut) {
            this.driverStdOut = driverStdOut;
            return this;
        }

        /**
         * driverSyslog.
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
