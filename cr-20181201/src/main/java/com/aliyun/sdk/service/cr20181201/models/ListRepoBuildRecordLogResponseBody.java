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
 * {@link ListRepoBuildRecordLogResponseBody} extends {@link TeaModel}
 *
 * <p>ListRepoBuildRecordLogResponseBody</p>
 */
public class ListRepoBuildRecordLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BuildRecordLogs")
    private java.util.List<BuildRecordLogs> buildRecordLogs;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListRepoBuildRecordLogResponseBody(Builder builder) {
        this.buildRecordLogs = builder.buildRecordLogs;
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRepoBuildRecordLogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buildRecordLogs
     */
    public java.util.List<BuildRecordLogs> getBuildRecordLogs() {
        return this.buildRecordLogs;
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
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<BuildRecordLogs> buildRecordLogs; 
        private String code; 
        private Boolean isSuccess; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListRepoBuildRecordLogResponseBody model) {
            this.buildRecordLogs = model.buildRecordLogs;
            this.code = model.code;
            this.isSuccess = model.isSuccess;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The log content of the image building record.</p>
         */
        public Builder buildRecordLogs(java.util.List<BuildRecordLogs> buildRecordLogs) {
            this.buildRecordLogs = buildRecordLogs;
            return this;
        }

        /**
         * <p>The return value.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4CE1F661-75DD-4EBD-A4AD-057B26834ABB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRepoBuildRecordLogResponseBody build() {
            return new ListRepoBuildRecordLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRepoBuildRecordLogResponseBody} extends {@link TeaModel}
     *
     * <p>ListRepoBuildRecordLogResponseBody</p>
     */
    public static class BuildRecordLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuildStage")
        private String buildStage;

        @com.aliyun.core.annotation.NameInMap("LineNumber")
        private Integer lineNumber;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private BuildRecordLogs(Builder builder) {
            this.buildStage = builder.buildStage;
            this.lineNumber = builder.lineNumber;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BuildRecordLogs create() {
            return builder().build();
        }

        /**
         * @return buildStage
         */
        public String getBuildStage() {
            return this.buildStage;
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
            private String buildStage; 
            private Integer lineNumber; 
            private String message; 

            private Builder() {
            } 

            private Builder(BuildRecordLogs model) {
                this.buildStage = model.buildStage;
                this.lineNumber = model.lineNumber;
                this.message = model.message;
            } 

            /**
             * <p>The stage of the building that is recorded in the log entry.</p>
             * 
             * <strong>example:</strong>
             * <p>GIT_CLONE</p>
             */
            public Builder buildStage(String buildStage) {
                this.buildStage = buildStage;
                return this;
            }

            /**
             * <p>The line number of the log entry.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder lineNumber(Integer lineNumber) {
                this.lineNumber = lineNumber;
                return this;
            }

            /**
             * <p>The content of the log.</p>
             * 
             * <strong>example:</strong>
             * <p>fetch stage begin</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public BuildRecordLogs build() {
                return new BuildRecordLogs(this);
            } 

        } 

    }
}
