// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHybridMonitorSLSGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridMonitorSLSGroupResponseBody</p>
 */
public class DescribeHybridMonitorSLSGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List < List> list;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private DescribeHybridMonitorSLSGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.list = builder.list;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridMonitorSLSGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return list
     */
    public java.util.List < List> getList() {
        return this.list;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < List> list; 
        private String message; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private String success; 
        private Long total; 

        /**
         * The HTTP status code.
         * <p>
         * 
         * > The status code 200 indicates that the request was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The queried Logstore groups.
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeHybridMonitorSLSGroupResponseBody build() {
            return new DescribeHybridMonitorSLSGroupResponseBody(this);
        } 

    } 

    public static class SLSGroupConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SLSLogstore")
        private String SLSLogstore;

        @com.aliyun.core.annotation.NameInMap("SLSProject")
        private String SLSProject;

        @com.aliyun.core.annotation.NameInMap("SLSRegion")
        private String SLSRegion;

        @com.aliyun.core.annotation.NameInMap("SLSUserId")
        private String SLSUserId;

        private SLSGroupConfig(Builder builder) {
            this.SLSLogstore = builder.SLSLogstore;
            this.SLSProject = builder.SLSProject;
            this.SLSRegion = builder.SLSRegion;
            this.SLSUserId = builder.SLSUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SLSGroupConfig create() {
            return builder().build();
        }

        /**
         * @return SLSLogstore
         */
        public String getSLSLogstore() {
            return this.SLSLogstore;
        }

        /**
         * @return SLSProject
         */
        public String getSLSProject() {
            return this.SLSProject;
        }

        /**
         * @return SLSRegion
         */
        public String getSLSRegion() {
            return this.SLSRegion;
        }

        /**
         * @return SLSUserId
         */
        public String getSLSUserId() {
            return this.SLSUserId;
        }

        public static final class Builder {
            private String SLSLogstore; 
            private String SLSProject; 
            private String SLSRegion; 
            private String SLSUserId; 

            /**
             * The Logstore.
             */
            public Builder SLSLogstore(String SLSLogstore) {
                this.SLSLogstore = SLSLogstore;
                return this;
            }

            /**
             * The Simple Log Service project.
             */
            public Builder SLSProject(String SLSProject) {
                this.SLSProject = SLSProject;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder SLSRegion(String SLSRegion) {
                this.SLSRegion = SLSRegion;
                return this;
            }

            /**
             * The member ID.
             * <p>
             * 
             * **Description** This parameter is returned when you call the operation by using an administrative account.
             */
            public Builder SLSUserId(String SLSUserId) {
                this.SLSUserId = SLSUserId;
                return this;
            }

            public SLSGroupConfig build() {
                return new SLSGroupConfig(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("SLSGroupConfig")
        private java.util.List < SLSGroupConfig> SLSGroupConfig;

        @com.aliyun.core.annotation.NameInMap("SLSGroupDescription")
        private String SLSGroupDescription;

        @com.aliyun.core.annotation.NameInMap("SLSGroupName")
        private String SLSGroupName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private List(Builder builder) {
            this.createTime = builder.createTime;
            this.SLSGroupConfig = builder.SLSGroupConfig;
            this.SLSGroupDescription = builder.SLSGroupDescription;
            this.SLSGroupName = builder.SLSGroupName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return SLSGroupConfig
         */
        public java.util.List < SLSGroupConfig> getSLSGroupConfig() {
            return this.SLSGroupConfig;
        }

        /**
         * @return SLSGroupDescription
         */
        public String getSLSGroupDescription() {
            return this.SLSGroupDescription;
        }

        /**
         * @return SLSGroupName
         */
        public String getSLSGroupName() {
            return this.SLSGroupName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private java.util.List < SLSGroupConfig> SLSGroupConfig; 
            private String SLSGroupDescription; 
            private String SLSGroupName; 
            private String updateTime; 

            /**
             * The time when the Logstore group was created.
             * <p>
             * 
             * Unit: milliseconds.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The configurations of the Logstore group.
             */
            public Builder SLSGroupConfig(java.util.List < SLSGroupConfig> SLSGroupConfig) {
                this.SLSGroupConfig = SLSGroupConfig;
                return this;
            }

            /**
             * The description of the Logstore group.
             */
            public Builder SLSGroupDescription(String SLSGroupDescription) {
                this.SLSGroupDescription = SLSGroupDescription;
                return this;
            }

            /**
             * The name of the Logstore group.
             */
            public Builder SLSGroupName(String SLSGroupName) {
                this.SLSGroupName = SLSGroupName;
                return this;
            }

            /**
             * The time when the Logstore group was modified.
             * <p>
             * 
             * Unit: milliseconds.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
