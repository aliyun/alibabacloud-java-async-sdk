// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Report} extends {@link TeaModel}
 *
 * <p>Report</p>
 */
public class Report extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedFiles")
    private String failedFiles;

    @com.aliyun.core.annotation.NameInMap("SkippedFiles")
    private String skippedFiles;

    @com.aliyun.core.annotation.NameInMap("SuccessFiles")
    private String successFiles;

    @com.aliyun.core.annotation.NameInMap("TotalFiles")
    private String totalFiles;

    private Report(Builder builder) {
        this.failedFiles = builder.failedFiles;
        this.skippedFiles = builder.skippedFiles;
        this.successFiles = builder.successFiles;
        this.totalFiles = builder.totalFiles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Report create() {
        return builder().build();
    }

    /**
     * @return failedFiles
     */
    public String getFailedFiles() {
        return this.failedFiles;
    }

    /**
     * @return skippedFiles
     */
    public String getSkippedFiles() {
        return this.skippedFiles;
    }

    /**
     * @return successFiles
     */
    public String getSuccessFiles() {
        return this.successFiles;
    }

    /**
     * @return totalFiles
     */
    public String getTotalFiles() {
        return this.totalFiles;
    }

    public static final class Builder {
        private String failedFiles; 
        private String skippedFiles; 
        private String successFiles; 
        private String totalFiles; 

        /**
         * FailedFiles.
         */
        public Builder failedFiles(String failedFiles) {
            this.failedFiles = failedFiles;
            return this;
        }

        /**
         * SkippedFiles.
         */
        public Builder skippedFiles(String skippedFiles) {
            this.skippedFiles = skippedFiles;
            return this;
        }

        /**
         * SuccessFiles.
         */
        public Builder successFiles(String successFiles) {
            this.successFiles = successFiles;
            return this;
        }

        /**
         * TotalFiles.
         */
        public Builder totalFiles(String totalFiles) {
            this.totalFiles = totalFiles;
            return this;
        }

        public Report build() {
            return new Report(this);
        } 

    } 

}
