// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunLog} extends {@link TeaModel}
 *
 * <p>RunLog</p>
 */
public class RunLog extends TeaModel {
    @NameInMap("driverStdError")
    private String driverStdError;

    @NameInMap("driverStdOut")
    private String driverStdOut;

    private RunLog(Builder builder) {
        this.driverStdError = builder.driverStdError;
        this.driverStdOut = builder.driverStdOut;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunLog create() {
        return builder().build();
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

    public static final class Builder {
        private String driverStdError; 
        private String driverStdOut; 

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

        public RunLog build() {
            return new RunLog(this);
        } 

    } 

}
