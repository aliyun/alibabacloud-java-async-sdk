// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link ListArtifactBuildTaskLogResponseBody} extends {@link TeaModel}
 *
 * <p>ListArtifactBuildTaskLogResponseBody</p>
 */
public class ListArtifactBuildTaskLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BuildTaskLogs")
    private java.util.List<BuildTaskLogs> buildTaskLogs;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buildTaskLogs
     */
    public java.util.List<BuildTaskLogs> getBuildTaskLogs() {
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
        private java.util.List<BuildTaskLogs> buildTaskLogs; 
        private String code; 
        private Boolean isSuccess; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListArtifactBuildTaskLogResponseBody model) {
            this.buildTaskLogs = model.buildTaskLogs;
            this.code = model.code;
            this.isSuccess = model.isSuccess;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The log entries of the artifact build task.</p>
         */
        public Builder buildTaskLogs(java.util.List<BuildTaskLogs> buildTaskLogs) {
            this.buildTaskLogs = buildTaskLogs;
            return this;
        }

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the API request is successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: successful</li>
         * <li><code>false</code>: failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C4C7DD0C-C9D6-437A-A7EE-121EFD70D002</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of log entries.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListArtifactBuildTaskLogResponseBody build() {
            return new ListArtifactBuildTaskLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListArtifactBuildTaskLogResponseBody} extends {@link TeaModel}
     *
     * <p>ListArtifactBuildTaskLogResponseBody</p>
     */
    public static class BuildTaskLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LineNumber")
        private Integer lineNumber;

        @com.aliyun.core.annotation.NameInMap("Message")
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

            private Builder() {
            } 

            private Builder(BuildTaskLogs model) {
                this.lineNumber = model.lineNumber;
                this.message = model.message;
            } 

            /**
             * <p>The row number of the log entry.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder lineNumber(Integer lineNumber) {
                this.lineNumber = lineNumber;
                return this;
            }

            /**
             * <p>The log data.</p>
             * 
             * <strong>example:</strong>
             * <p>Start Build</p>
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
