// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUpgradeMajorVersionPrecheckTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUpgradeMajorVersionPrecheckTaskResponseBody</p>
 */
public class DescribeUpgradeMajorVersionPrecheckTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeUpgradeMajorVersionPrecheckTaskResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUpgradeMajorVersionPrecheckTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List < Items> items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * <p>The information about the upgrade check report.</p>
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D1586777-41B5-5F9E-81E8-93DFDD379024</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries in the upgrade check report.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeUpgradeMajorVersionPrecheckTaskResponseBody build() {
            return new DescribeUpgradeMajorVersionPrecheckTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUpgradeMajorVersionPrecheckTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUpgradeMajorVersionPrecheckTaskResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckTime")
        private String checkTime;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("EffectiveTime")
        private String effectiveTime;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("SourceMajorVersion")
        private String sourceMajorVersion;

        @com.aliyun.core.annotation.NameInMap("TargetMajorVersion")
        private String targetMajorVersion;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Integer taskId;

        private Items(Builder builder) {
            this.checkTime = builder.checkTime;
            this.detail = builder.detail;
            this.effectiveTime = builder.effectiveTime;
            this.result = builder.result;
            this.sourceMajorVersion = builder.sourceMajorVersion;
            this.targetMajorVersion = builder.targetMajorVersion;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return checkTime
         */
        public String getCheckTime() {
            return this.checkTime;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return effectiveTime
         */
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return sourceMajorVersion
         */
        public String getSourceMajorVersion() {
            return this.sourceMajorVersion;
        }

        /**
         * @return targetMajorVersion
         */
        public String getTargetMajorVersion() {
            return this.targetMajorVersion;
        }

        /**
         * @return taskId
         */
        public Integer getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String checkTime; 
            private String detail; 
            private String effectiveTime; 
            private String result; 
            private String sourceMajorVersion; 
            private String targetMajorVersion; 
            private Integer taskId; 

            /**
             * <p>The time at which the upgrade check was performed.</p>
             * <p>The value of this parameter is a timestamp that follows the UNIX time format. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1635143903000</p>
             */
            public Builder checkTime(String checkTime) {
                this.checkTime = checkTime;
                return this;
            }

            /**
             * <p>The content of the upgrade check report.</p>
             * 
             * <strong>example:</strong>
             * <p>[user_check_report]User check success\n[pg_upgrade_internal.log]Performing...</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The expiration time of the upgrade check report.</p>
             * <p>The value of this parameter is a timestamp that follows the UNIX time format. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1635748703000</p>
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * <p>The result of the upgrade check.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Success</li>
             * <li>Fail</li>
             * </ul>
             * <blockquote>
             * <p> If the check result is <strong>Fail</strong>, you must check the value of the <strong>Detail</strong> parameter to obtain the information about the errors that occurred, resolve the errors, and then try again. For more information about how to resolve common errors, see <a href="https://help.aliyun.com/document_detail/218391.html">Introduction to the check report for a major engine version upgrade to an ApsaraDB RDS for PostgreSQL instance</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The original major engine version of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>11.0</p>
             */
            public Builder sourceMajorVersion(String sourceMajorVersion) {
                this.sourceMajorVersion = sourceMajorVersion;
                return this;
            }

            /**
             * <p>The new major engine version of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>12.0</p>
             */
            public Builder targetMajorVersion(String targetMajorVersion) {
                this.targetMajorVersion = targetMajorVersion;
                return this;
            }

            /**
             * <p>The ID of the upgrade check task.</p>
             * 
             * <strong>example:</strong>
             * <p>416980000</p>
             */
            public Builder taskId(Integer taskId) {
                this.taskId = taskId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
