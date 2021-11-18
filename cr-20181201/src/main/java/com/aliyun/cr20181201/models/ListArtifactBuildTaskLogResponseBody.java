// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListArtifactBuildTaskLogResponseBody} extends {@link TeaModel}
 *
 * <p>ListArtifactBuildTaskLogResponseBody</p>
 */
public class ListArtifactBuildTaskLogResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("BuildTaskLogs")
    private java.util.List < BuildTaskLogs> buildTaskLogs;


    private ListArtifactBuildTaskLogResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.buildTaskLogs = builder.buildTaskLogs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListArtifactBuildTaskLogResponseBody create() {
        return builder().build();
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

    /**
     * @return buildTaskLogs
     */
    public java.util.List < BuildTaskLogs> getBuildTaskLogs() {
        return this.buildTaskLogs;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < BuildTaskLogs> buildTaskLogs; 

        /**
         * <p>Response code</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the API is called. Valid values:

-"true": The API is called.

-"false": failed to call the API.</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total log entries</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Create a single-line log</p>
         */
        public Builder buildTaskLogs(java.util.List < BuildTaskLogs> buildTaskLogs) {
            this.buildTaskLogs = buildTaskLogs;
            return this;
        }

        public ListArtifactBuildTaskLogResponseBody build() {
            return new ListArtifactBuildTaskLogResponseBody(this);
        } 

    } 

    public static class BuildTaskLogs extends TeaModel {
        @NameInMap("Message")
        private String message;

        @NameInMap("LineNumber")
        private Integer lineNumber;


        private BuildTaskLogs(Builder builder) {
            this.message = builder.message;
            this.lineNumber = builder.lineNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BuildTaskLogs create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return lineNumber
         */
        public Integer getLineNumber() {
            return this.lineNumber;
        }

        public static final class Builder {
            private String message; 
            private Integer lineNumber; 

            /**
             * <p>Log information</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Log line number</p>
             */
            public Builder lineNumber(Integer lineNumber) {
                this.lineNumber = lineNumber;
                return this;
            }

            public BuildTaskLogs build() {
                return new BuildTaskLogs(this);
            } 

        } 

    }
}
