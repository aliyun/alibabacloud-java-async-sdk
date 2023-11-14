// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCheckWarningsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCheckWarningsResponseBody</p>
 */
public class DescribeCheckWarningsResponseBody extends TeaModel {
    @NameInMap("CheckWarnings")
    private java.util.List < CheckWarnings> checkWarnings;

    @NameInMap("Count")
    private Integer count;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCheckWarningsResponseBody(Builder builder) {
        this.checkWarnings = builder.checkWarnings;
        this.count = builder.count;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCheckWarningsResponseBody create() {
        return builder().build();
    }

    /**
     * @return checkWarnings
     */
    public java.util.List < CheckWarnings> getCheckWarnings() {
        return this.checkWarnings;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < CheckWarnings> checkWarnings; 
        private Integer count; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information about the check item.
         */
        public Builder checkWarnings(java.util.List < CheckWarnings> checkWarnings) {
            this.checkWarnings = checkWarnings;
            return this;
        }

        /**
         * The number of entries returned on the current page.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The number of entries returned per page. Default value: **20**.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCheckWarningsResponseBody build() {
            return new DescribeCheckWarningsResponseBody(this);
        } 

    } 

    public static class CheckWarnings extends TeaModel {
        @NameInMap("CheckId")
        private Long checkId;

        @NameInMap("CheckWarningId")
        private Long checkWarningId;

        @NameInMap("ExecErrorMessage")
        private String execErrorMessage;

        @NameInMap("FixStatus")
        private Integer fixStatus;

        @NameInMap("Item")
        private String item;

        @NameInMap("Level")
        private String level;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Type")
        private String type;

        @NameInMap("Uuid")
        private String uuid;

        private CheckWarnings(Builder builder) {
            this.checkId = builder.checkId;
            this.checkWarningId = builder.checkWarningId;
            this.execErrorMessage = builder.execErrorMessage;
            this.fixStatus = builder.fixStatus;
            this.item = builder.item;
            this.level = builder.level;
            this.reason = builder.reason;
            this.status = builder.status;
            this.type = builder.type;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckWarnings create() {
            return builder().build();
        }

        /**
         * @return checkId
         */
        public Long getCheckId() {
            return this.checkId;
        }

        /**
         * @return checkWarningId
         */
        public Long getCheckWarningId() {
            return this.checkWarningId;
        }

        /**
         * @return execErrorMessage
         */
        public String getExecErrorMessage() {
            return this.execErrorMessage;
        }

        /**
         * @return fixStatus
         */
        public Integer getFixStatus() {
            return this.fixStatus;
        }

        /**
         * @return item
         */
        public String getItem() {
            return this.item;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Long checkId; 
            private Long checkWarningId; 
            private String execErrorMessage; 
            private Integer fixStatus; 
            private String item; 
            private String level; 
            private String reason; 
            private Integer status; 
            private String type; 
            private String uuid; 

            /**
             * The ID of the check item.
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * The ID of the alert that is triggered by the check item.
             */
            public Builder checkWarningId(Long checkWarningId) {
                this.checkWarningId = checkWarningId;
                return this;
            }

            /**
             * The error message in the check result.
             */
            public Builder execErrorMessage(String execErrorMessage) {
                this.execErrorMessage = execErrorMessage;
                return this;
            }

            /**
             * Indicates whether the fix is supported. Valid values:
             * <p>
             * 
             * *   **0**: The fix is not supported.
             * *   **1**: The fix is supported.
             */
            public Builder fixStatus(Integer fixStatus) {
                this.fixStatus = fixStatus;
                return this;
            }

            /**
             * The name of the check item.
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * The severity level of a risk item. Valid values:
             * <p>
             * 
             * *   **high**
             * *   **medium**
             * *   **low**
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The remarks.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The status of the check item. Valid values:
             * <p>
             * 
             * *   **1**: failed
             * *   **2**: verifying
             * *   **3**: passed
             * *   **5**: expired
             * *   **6**: ignored
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the check item.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The UUID of the server on which the baseline check is performed.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public CheckWarnings build() {
                return new CheckWarnings(this);
            } 

        } 

    }
}
