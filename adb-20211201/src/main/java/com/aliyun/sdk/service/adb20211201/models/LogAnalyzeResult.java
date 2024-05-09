// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LogAnalyzeResult} extends {@link TeaModel}
 *
 * <p>LogAnalyzeResult</p>
 */
public class LogAnalyzeResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppErrorAdvice")
    private String appErrorAdvice;

    @com.aliyun.core.annotation.NameInMap("AppErrorCode")
    private String appErrorCode;

    @com.aliyun.core.annotation.NameInMap("AppErrorLog")
    private String appErrorLog;

    private LogAnalyzeResult(Builder builder) {
        this.appErrorAdvice = builder.appErrorAdvice;
        this.appErrorCode = builder.appErrorCode;
        this.appErrorLog = builder.appErrorLog;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogAnalyzeResult create() {
        return builder().build();
    }

    /**
     * @return appErrorAdvice
     */
    public String getAppErrorAdvice() {
        return this.appErrorAdvice;
    }

    /**
     * @return appErrorCode
     */
    public String getAppErrorCode() {
        return this.appErrorCode;
    }

    /**
     * @return appErrorLog
     */
    public String getAppErrorLog() {
        return this.appErrorLog;
    }

    public static final class Builder {
        private String appErrorAdvice; 
        private String appErrorCode; 
        private String appErrorLog; 

        /**
         * AppErrorAdvice.
         */
        public Builder appErrorAdvice(String appErrorAdvice) {
            this.appErrorAdvice = appErrorAdvice;
            return this;
        }

        /**
         * AppErrorCode.
         */
        public Builder appErrorCode(String appErrorCode) {
            this.appErrorCode = appErrorCode;
            return this;
        }

        /**
         * AppErrorLog.
         */
        public Builder appErrorLog(String appErrorLog) {
            this.appErrorLog = appErrorLog;
            return this;
        }

        public LogAnalyzeResult build() {
            return new LogAnalyzeResult(this);
        } 

    } 

}
