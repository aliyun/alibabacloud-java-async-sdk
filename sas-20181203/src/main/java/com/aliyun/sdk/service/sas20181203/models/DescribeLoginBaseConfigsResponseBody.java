// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLoginBaseConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoginBaseConfigsResponseBody</p>
 */
public class DescribeLoginBaseConfigsResponseBody extends TeaModel {
    @NameInMap("BaseConfigs")
    private java.util.List < BaseConfigs> baseConfigs;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    /**
     * @return baseConfigs
     */
    public java.util.List < BaseConfigs> getBaseConfigs() {
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
        private java.util.List < BaseConfigs> baseConfigs; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * BaseConfigs.
         */
        public Builder baseConfigs(java.util.List < BaseConfigs> baseConfigs) {
            this.baseConfigs = baseConfigs;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLoginBaseConfigsResponseBody build() {
            return new DescribeLoginBaseConfigsResponseBody(this);
        } 

    } 

    public static class TargetList extends TeaModel {
        @NameInMap("Target")
        private String target;

        @NameInMap("TargetType")
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

            /**
             * Target.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * TargetType.
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
    public static class BaseConfigs extends TeaModel {
        @NameInMap("Account")
        private String account;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Location")
        private String location;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("TargetList")
        private java.util.List < TargetList> targetList;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("UuidCount")
        private Integer uuidCount;

        private BaseConfigs(Builder builder) {
            this.account = builder.account;
            this.endTime = builder.endTime;
            this.ip = builder.ip;
            this.location = builder.location;
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
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return targetList
         */
        public java.util.List < TargetList> getTargetList() {
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
            private String startTime; 
            private java.util.List < TargetList> targetList; 
            private Integer totalCount; 
            private Integer uuidCount; 

            /**
             * Account.
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TargetList.
             */
            public Builder targetList(java.util.List < TargetList> targetList) {
                this.targetList = targetList;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * UuidCount.
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
