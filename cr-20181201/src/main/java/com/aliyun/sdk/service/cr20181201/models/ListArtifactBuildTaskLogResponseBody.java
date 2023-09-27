// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListArtifactBuildTaskLogResponseBody} extends {@link TeaModel}
 *
 * <p>ListArtifactBuildTaskLogResponseBody</p>
 */
public class ListArtifactBuildTaskLogResponseBody extends TeaModel {
    @NameInMap("BuildTaskLogs")
    private java.util.List < BuildTaskLogs> buildTaskLogs;

    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListArtifactBuildTaskLogResponseBody(Builder builder) {
        this.buildTaskLogs = builder.buildTaskLogs;
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListArtifactBuildTaskLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return buildTaskLogs
     */
    public java.util.List < BuildTaskLogs> getBuildTaskLogs() {
        return this.buildTaskLogs;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < BuildTaskLogs> buildTaskLogs; 
        private String code; 
        private Boolean isSuccess; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The log entries of the artifact build task.
         */
        public Builder buildTaskLogs(java.util.List < BuildTaskLogs> buildTaskLogs) {
            this.buildTaskLogs = buildTaskLogs;
            return this;
        }

        /**
         * The response code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Indicates whether the API call is successful.
         * <p>
         * 
         * *   `true`: successful
         * *   `false`: failed
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of log entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListArtifactBuildTaskLogResponseBody build() {
            return new ListArtifactBuildTaskLogResponseBody(this);
        } 

    } 

    public static class BuildTaskLogs extends TeaModel {
        @NameInMap("LineNumber")
        private Integer lineNumber;

        @NameInMap("Message")
        private String message;

        private BuildTaskLogs(Builder builder) {
            this.lineNumber = builder.lineNumber;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BuildTaskLogs create() {
            return builder().build();
        }

        /**
         * @return lineNumber
         */
        public Integer getLineNumber() {
            return this.lineNumber;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private Integer lineNumber; 
            private String message; 

            /**
             * The row number of the log entry.
             */
            public Builder lineNumber(Integer lineNumber) {
                this.lineNumber = lineNumber;
                return this;
            }

            /**
             * The content of the log entry.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public BuildTaskLogs build() {
                return new BuildTaskLogs(this);
            } 

        } 

    }
}
