// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListBotInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListBotInstancesResponseBody</p>
 */
public class ListBotInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceInfo")
    private java.util.List<InstanceInfo> instanceInfo;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private ListBotInstancesResponseBody(Builder builder) {
        this.instanceInfo = builder.instanceInfo;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBotInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceInfo
     */
    public java.util.List<InstanceInfo> getInstanceInfo() {
        return this.instanceInfo;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private java.util.List<InstanceInfo> instanceInfo; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(ListBotInstancesResponseBody model) {
            this.instanceInfo = model.instanceInfo;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The instances that match the specified conditions under the current account.</p>
         */
        public Builder instanceInfo(java.util.List<InstanceInfo> instanceInfo) {
            this.instanceInfo = instanceInfo;
            return this;
        }

        /**
         * <p>The current page number, which is the same as the PageNumber request parameter.</p>
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
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>509FD5AF-AB5B-55A9-9568-38D98668E3AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public ListBotInstancesResponseBody build() {
            return new ListBotInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBotInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListBotInstancesResponseBody</p>
     */
    public static class InstanceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BotInstanceLevel")
        private String botInstanceLevel;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ReserveReleaseTime")
        private String reserveReleaseTime;

        @com.aliyun.core.annotation.NameInMap("SiteInstanceId")
        private String siteInstanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private InstanceInfo(Builder builder) {
            this.botInstanceLevel = builder.botInstanceLevel;
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.reserveReleaseTime = builder.reserveReleaseTime;
            this.siteInstanceId = builder.siteInstanceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceInfo create() {
            return builder().build();
        }

        /**
         * @return botInstanceLevel
         */
        public String getBotInstanceLevel() {
            return this.botInstanceLevel;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return reserveReleaseTime
         */
        public String getReserveReleaseTime() {
            return this.reserveReleaseTime;
        }

        /**
         * @return siteInstanceId
         */
        public String getSiteInstanceId() {
            return this.siteInstanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String botInstanceLevel; 
            private String createTime; 
            private String instanceId; 
            private String reserveReleaseTime; 
            private String siteInstanceId; 
            private String status; 

            private Builder() {
            } 

            private Builder(InstanceInfo model) {
                this.botInstanceLevel = model.botInstanceLevel;
                this.createTime = model.createTime;
                this.instanceId = model.instanceId;
                this.reserveReleaseTime = model.reserveReleaseTime;
                this.siteInstanceId = model.siteInstanceId;
                this.status = model.status;
            } 

            /**
             * <p>The Bot protection instance level. If this parameter is empty, the plan does not include a Bot protection instance. If a value is returned, the plan includes a Bot protection instance. Valid values:</p>
             * <ul>
             * <li><p>enterprise_bot: web edition.</p>
             * </li>
             * <li><p>enterprise_bot_with_app: app edition.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enterprise_bot</p>
             */
            public Builder botInstanceLevel(String botInstanceLevel) {
                this.botInstanceLevel = botInstanceLevel;
                return this;
            }

            /**
             * <p>The time when the instance was purchased. The time is in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-12T05:41:51Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-xcdn-96wblslz****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The scheduled release time. The time is in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-25T16:00:00Z</p>
             */
            public Builder reserveReleaseTime(String reserveReleaseTime) {
                this.reserveReleaseTime = reserveReleaseTime;
                return this;
            }

            /**
             * <p>The ID of the associated site plan instance.</p>
             * 
             * <strong>example:</strong>
             * <p>esa-site-b0s6kmx0r0n4</p>
             */
            public Builder siteInstanceId(String siteInstanceId) {
                this.siteInstanceId = siteInstanceId;
                return this;
            }

            /**
             * <p>The instance status. Valid values:</p>
             * <ul>
             * <li><strong>online</strong>: The instance is running normally.</li>
             * <li><strong>offline</strong>: The instance has expired but has not exceeded the retention period and is unavailable.</li>
             * <li><strong>disable</strong>: The instance has been released.</li>
             * <li><strong>overdue</strong>: The instance has been stopped due to an overdue payment.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public InstanceInfo build() {
                return new InstanceInfo(this);
            } 

        } 

    }
}
