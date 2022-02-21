// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepoBuildRecordLogResponseBody} extends {@link TeaModel}
 *
 * <p>ListRepoBuildRecordLogResponseBody</p>
 */
public class ListRepoBuildRecordLogResponseBody extends TeaModel {
    @NameInMap("BuildRecordLogs")
    private java.util.List < BuildRecordLogs> buildRecordLogs;

    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    /**
     * @return buildRecordLogs
     */
    public java.util.List < BuildRecordLogs> getBuildRecordLogs() {
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
        private java.util.List < BuildRecordLogs> buildRecordLogs; 
        private String code; 
        private Boolean isSuccess; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private String totalCount; 

        /**
         * BuildRecordLogs.
         */
        public Builder buildRecordLogs(java.util.List < BuildRecordLogs> buildRecordLogs) {
            this.buildRecordLogs = buildRecordLogs;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRepoBuildRecordLogResponseBody build() {
            return new ListRepoBuildRecordLogResponseBody(this);
        } 

    } 

    public static class BuildRecordLogs extends TeaModel {
        @NameInMap("BuildStage")
        private String buildStage;

        @NameInMap("LineNumber")
        private Integer lineNumber;

        @NameInMap("Message")
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

            /**
             * BuildStage.
             */
            public Builder buildStage(String buildStage) {
                this.buildStage = buildStage;
                return this;
            }

            /**
             * LineNumber.
             */
            public Builder lineNumber(Integer lineNumber) {
                this.lineNumber = lineNumber;
                return this;
            }

            /**
             * Message.
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
