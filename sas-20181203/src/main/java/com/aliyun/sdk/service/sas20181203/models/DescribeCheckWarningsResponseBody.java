// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCheckWarningsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCheckWarningsResponseBody</p>
 */
public class DescribeCheckWarningsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckWarnings")
    private java.util.List < CheckWarnings> checkWarnings;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The information about the check item.</p>
         */
        public Builder checkWarnings(java.util.List < CheckWarnings> checkWarnings) {
            this.checkWarnings = checkWarnings;
            return this;
        }

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The number of entries returned per page. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0DFCADBA-7065-42DA-AF17-6868B9C2A8CF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCheckWarningsResponseBody build() {
            return new DescribeCheckWarningsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCheckWarningsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCheckWarningsResponseBody</p>
     */
    public static class CheckWarnings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckId")
        private Long checkId;

        @com.aliyun.core.annotation.NameInMap("CheckWarningId")
        private Long checkWarningId;

        @com.aliyun.core.annotation.NameInMap("ContainerId")
        private String containerId;

        @com.aliyun.core.annotation.NameInMap("ContainerName")
        private String containerName;

        @com.aliyun.core.annotation.NameInMap("ExecErrorMessage")
        private String execErrorMessage;

        @com.aliyun.core.annotation.NameInMap("FixStatus")
        private Integer fixStatus;

        @com.aliyun.core.annotation.NameInMap("Item")
        private String item;

        @com.aliyun.core.annotation.NameInMap("LastHandleTime")
        private Long lastHandleTime;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private CheckWarnings(Builder builder) {
            this.checkId = builder.checkId;
            this.checkWarningId = builder.checkWarningId;
            this.containerId = builder.containerId;
            this.containerName = builder.containerName;
            this.execErrorMessage = builder.execErrorMessage;
            this.fixStatus = builder.fixStatus;
            this.item = builder.item;
            this.lastHandleTime = builder.lastHandleTime;
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
         * @return containerId
         */
        public String getContainerId() {
            return this.containerId;
        }

        /**
         * @return containerName
         */
        public String getContainerName() {
            return this.containerName;
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
         * @return lastHandleTime
         */
        public Long getLastHandleTime() {
            return this.lastHandleTime;
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
            private String containerId; 
            private String containerName; 
            private String execErrorMessage; 
            private Integer fixStatus; 
            private String item; 
            private Long lastHandleTime; 
            private String level; 
            private String reason; 
            private Integer status; 
            private String type; 
            private String uuid; 

            /**
             * <p>The ID of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>2546</p>
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * <p>The ID of the alert that is generated for the baseline check result.</p>
             * 
             * <strong>example:</strong>
             * <p>212251441</p>
             */
            public Builder checkWarningId(Long checkWarningId) {
                this.checkWarningId = checkWarningId;
                return this;
            }

            /**
             * <p>The ID of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>8de456b00ff0a2009ee8ef7fc59fd0457fa44f20b8282af3e79c2a0e2492****</p>
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            /**
             * <p>The name of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>/svn-host</p>
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * <p>The error message in the check result.</p>
             * 
             * <strong>example:</strong>
             * <p>ScriptKilledOfCpuHigh</p>
             */
            public Builder execErrorMessage(String execErrorMessage) {
                this.execErrorMessage = execErrorMessage;
                return this;
            }

            /**
             * <p>Indicates whether fixing is supported. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Fixing is not supported.</li>
             * <li><strong>1</strong>: Fixing is supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder fixStatus(Integer fixStatus) {
                this.fixStatus = fixStatus;
                return this;
            }

            /**
             * <p>The name of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>passwordExpire</p>
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * <p>The timestamp of the latest processing of the check item risk of the machine. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1694692471000</p>
             */
            public Builder lastHandleTime(Long lastHandleTime) {
                this.lastHandleTime = lastHandleTime;
                return this;
            }

            /**
             * <p>The risk level of the risk item. Valid values:</p>
             * <ul>
             * <li><strong>high</strong></li>
             * <li><strong>medium</strong></li>
             * <li><strong>low</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>ignore</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The status of the check item. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: failed.</li>
             * <li><strong>2</strong>: verifying.</li>
             * <li><strong>3</strong>: passed.</li>
             * <li><strong>5</strong>: expired.</li>
             * <li><strong>6</strong>: ignored.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>hc.check.type.identity_auth</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The ID of the server on which the baseline check is performed.</p>
             * 
             * <strong>example:</strong>
             * <p>d42f938c-d962-48a0-90f9-****</p>
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
