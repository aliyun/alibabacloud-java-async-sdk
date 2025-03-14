// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeLoginBaseConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoginBaseConfigsResponseBody</p>
 */
public class DescribeLoginBaseConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BaseConfigs")
    private java.util.List<BaseConfigs> baseConfigs;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeLoginBaseConfigsResponseBody(Builder builder) {
        this.baseConfigs = builder.baseConfigs;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoginBaseConfigsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseConfigs
     */
    public java.util.List<BaseConfigs> getBaseConfigs() {
        return this.baseConfigs;
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
        private java.util.List<BaseConfigs> baseConfigs; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeLoginBaseConfigsResponseBody model) {
            this.baseConfigs = model.baseConfigs;
            this.currentPage = model.currentPage;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The description of the configuration.</p>
         */
        public Builder baseConfigs(java.util.List<BaseConfigs> baseConfigs) {
            this.baseConfigs = baseConfigs;
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
         * <p>2C2D4B3C-0524-17B1-93D2-DA50119F4E1E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLoginBaseConfigsResponseBody build() {
            return new DescribeLoginBaseConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLoginBaseConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoginBaseConfigsResponseBody</p>
     */
    public static class TargetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        private TargetList(Builder builder) {
            this.target = builder.target;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetList create() {
            return builder().build();
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String target; 
            private String targetType; 

            private Builder() {
            } 

            private Builder(TargetList model) {
                this.target = model.target;
                this.targetType = model.targetType;
            } 

            /**
             * <p>The UUID or group ID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>0011ea53-738c-4bff-93be-ce6a1cc9****</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The type of the server to which the configuration is applied. Valid values:</p>
             * <ul>
             * <li><strong>uuid</strong>: a server</li>
             * <li><strong>groupId</strong>: a server group</li>
             * <li><strong>global</strong>: all servers</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>uuid</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public TargetList build() {
                return new TargetList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoginBaseConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoginBaseConfigsResponseBody</p>
     */
    public static class BaseConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        private String account;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("TargetList")
        private java.util.List<TargetList> targetList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("UuidCount")
        private Integer uuidCount;

        private BaseConfigs(Builder builder) {
            this.account = builder.account;
            this.endTime = builder.endTime;
            this.ip = builder.ip;
            this.location = builder.location;
            this.remark = builder.remark;
            this.startTime = builder.startTime;
            this.targetList = builder.targetList;
            this.totalCount = builder.totalCount;
            this.uuidCount = builder.uuidCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaseConfigs create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public String getAccount() {
            return this.account;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return targetList
         */
        public java.util.List<TargetList> getTargetList() {
            return this.targetList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return uuidCount
         */
        public Integer getUuidCount() {
            return this.uuidCount;
        }

        public static final class Builder {
            private String account; 
            private String endTime; 
            private String ip; 
            private String location; 
            private String remark; 
            private String startTime; 
            private java.util.List<TargetList> targetList; 
            private Integer totalCount; 
            private Integer uuidCount; 

            private Builder() {
            } 

            private Builder(BaseConfigs model) {
                this.account = model.account;
                this.endTime = model.endTime;
                this.ip = model.ip;
                this.location = model.location;
                this.remark = model.remark;
                this.startTime = model.startTime;
                this.targetList = model.targetList;
                this.totalCount = model.totalCount;
                this.uuidCount = model.uuidCount;
            } 

            /**
             * <p>The common logon account.</p>
             * 
             * <strong>example:</strong>
             * <p>1582318****</p>
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * <p>The end time of the common logon time range.</p>
             * 
             * <strong>example:</strong>
             * <p>07:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The common logon IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The common logon location.</p>
             * 
             * <strong>example:</strong>
             * <p>Montenegro</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>Corresponding configuration remark information.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The start time of the common logon time range.</p>
             * 
             * <strong>example:</strong>
             * <p>08:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The details of the servers to which the configuration is applied.</p>
             */
            public Builder targetList(java.util.List<TargetList> targetList) {
                this.targetList = targetList;
                return this;
            }

            /**
             * <p>The total number of servers.</p>
             * 
             * <strong>example:</strong>
             * <p>172</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The number of servers to which the configuration is applied.</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder uuidCount(Integer uuidCount) {
                this.uuidCount = uuidCount;
                return this;
            }

            public BaseConfigs build() {
                return new BaseConfigs(this);
            } 

        } 

    }
}
