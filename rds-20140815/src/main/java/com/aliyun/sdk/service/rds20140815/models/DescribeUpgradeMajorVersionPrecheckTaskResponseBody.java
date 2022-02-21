// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUpgradeMajorVersionPrecheckTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUpgradeMajorVersionPrecheckTaskResponseBody</p>
 */
public class DescribeUpgradeMajorVersionPrecheckTaskResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
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
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeUpgradeMajorVersionPrecheckTaskResponseBody build() {
            return new DescribeUpgradeMajorVersionPrecheckTaskResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("CheckTime")
        private String checkTime;

        @NameInMap("Detail")
        private String detail;

        @NameInMap("EffectiveTime")
        private String effectiveTime;

        @NameInMap("Result")
        private String result;

        @NameInMap("SourceMajorVersion")
        private String sourceMajorVersion;

        @NameInMap("TargetMajorVersion")
        private String targetMajorVersion;

        @NameInMap("TaskId")
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
             * CheckTime.
             */
            public Builder checkTime(String checkTime) {
                this.checkTime = checkTime;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * EffectiveTime.
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * SourceMajorVersion.
             */
            public Builder sourceMajorVersion(String sourceMajorVersion) {
                this.sourceMajorVersion = sourceMajorVersion;
                return this;
            }

            /**
             * TargetMajorVersion.
             */
            public Builder targetMajorVersion(String targetMajorVersion) {
                this.targetMajorVersion = targetMajorVersion;
                return this;
            }

            /**
             * TaskId.
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
