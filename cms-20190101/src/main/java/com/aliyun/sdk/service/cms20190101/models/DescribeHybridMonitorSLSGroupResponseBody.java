// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p>The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The queried Logstore groups.</p>
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>NotFound.SLSGroup</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>66683237-7126-50F8-BBF8-D67ACC919A17</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeHybridMonitorSLSGroupResponseBody build() {
            return new DescribeHybridMonitorSLSGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHybridMonitorSLSGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridMonitorSLSGroupResponseBody</p>
     */
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
             * <p>The Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>Logstore-aliyun-all</p>
             */
            public Builder SLSLogstore(String SLSLogstore) {
                this.SLSLogstore = SLSLogstore;
                return this;
            }

            /**
             * <p>The Simple Log Service project.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun-project</p>
             */
            public Builder SLSProject(String SLSProject) {
                this.SLSProject = SLSProject;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder SLSRegion(String SLSRegion) {
                this.SLSRegion = SLSRegion;
                return this;
            }

            /**
             * <p>The member ID.</p>
             * <p><strong>Description</strong> This parameter is returned when you call the operation by using an administrative account.</p>
             * 
             * <strong>example:</strong>
             * <p>120886317861****</p>
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
    /**
     * 
     * {@link DescribeHybridMonitorSLSGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridMonitorSLSGroupResponseBody</p>
     */
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
             * <p>The time when the Logstore group was created.</p>
             * <p>Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1652845630000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The configurations of the Logstore group.</p>
             */
            public Builder SLSGroupConfig(java.util.List < SLSGroupConfig> SLSGroupConfig) {
                this.SLSGroupConfig = SLSGroupConfig;
                return this;
            }

            /**
             * <p>The description of the Logstore group.</p>
             */
            public Builder SLSGroupDescription(String SLSGroupDescription) {
                this.SLSGroupDescription = SLSGroupDescription;
                return this;
            }

            /**
             * <p>The name of the Logstore group.</p>
             * 
             * <strong>example:</strong>
             * <p>Logstore_test</p>
             */
            public Builder SLSGroupName(String SLSGroupName) {
                this.SLSGroupName = SLSGroupName;
                return this;
            }

            /**
             * <p>The time when the Logstore group was modified.</p>
             * <p>Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1652845630000</p>
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
