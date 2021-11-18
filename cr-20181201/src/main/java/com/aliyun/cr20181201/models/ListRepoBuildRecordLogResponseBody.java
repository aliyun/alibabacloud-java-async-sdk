// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListRepoBuildRecordLogResponseBody} extends {@link TeaModel}
 *
 * <p>ListRepoBuildRecordLogResponseBody</p>
 */
public class ListRepoBuildRecordLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Code")
    private String code;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("TotalCount")
    private String totalCount;

    @NameInMap("BuildRecordLogs")
    private java.util.List < BuildRecordLogs> buildRecordLogs;


    private ListRepoBuildRecordLogResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.pageNo = builder.pageNo;
        this.isSuccess = builder.isSuccess;
        this.pageSize = builder.pageSize;
        this.totalCount = builder.totalCount;
        this.buildRecordLogs = builder.buildRecordLogs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRepoBuildRecordLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return buildRecordLogs
     */
    public java.util.List < BuildRecordLogs> getBuildRecordLogs() {
        return this.buildRecordLogs;
    }

    public static final class Builder {
        private String requestId; 
        private String code; 
        private Integer pageNo; 
        private Boolean isSuccess; 
        private Integer pageSize; 
        private String totalCount; 
        private java.util.List < BuildRecordLogs> buildRecordLogs; 

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Page number</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>Successful</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Number of logs displayed on one page</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Total quantity</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Build log content</p>
         */
        public Builder buildRecordLogs(java.util.List < BuildRecordLogs> buildRecordLogs) {
            this.buildRecordLogs = buildRecordLogs;
            return this;
        }

        public ListRepoBuildRecordLogResponseBody build() {
            return new ListRepoBuildRecordLogResponseBody(this);
        } 

    } 

    public static class BuildRecordLogs extends TeaModel {
        @NameInMap("LineNumber")
        private Integer lineNumber;

        @NameInMap("Message")
        private String message;

        @NameInMap("BuildStage")
        private String buildStage;


        private BuildRecordLogs(Builder builder) {
            this.lineNumber = builder.lineNumber;
            this.message = builder.message;
            this.buildStage = builder.buildStage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BuildRecordLogs create() {
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

        /**
         * @return buildStage
         */
        public String getBuildStage() {
            return this.buildStage;
        }

        public static final class Builder {
            private Integer lineNumber; 
            private String message; 
            private String buildStage; 

            /**
             * <p>Logs reside line number</p>
             */
            public Builder lineNumber(Integer lineNumber) {
                this.lineNumber = lineNumber;
                return this;
            }

            /**
             * <p>Log content</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Log phase</p>
             */
            public Builder buildStage(String buildStage) {
                this.buildStage = buildStage;
                return this;
            }

            public BuildRecordLogs build() {
                return new BuildRecordLogs(this);
            } 

        } 

    }
}
