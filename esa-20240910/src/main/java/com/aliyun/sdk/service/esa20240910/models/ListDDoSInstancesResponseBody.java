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
 * {@link ListDDoSInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDDoSInstancesResponseBody</p>
 */
public class ListDDoSInstancesResponseBody extends TeaModel {
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

    private ListDDoSInstancesResponseBody(Builder builder) {
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

    public static ListDDoSInstancesResponseBody create() {
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

        private Builder(ListDDoSInstancesResponseBody model) {
            this.instanceInfo = model.instanceInfo;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
        } 

        /**
         * InstanceInfo.
         */
        public Builder instanceInfo(java.util.List<InstanceInfo> instanceInfo) {
            this.instanceInfo = instanceInfo;
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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9F1DC265-BF10-5C9C-B607-760265C5F365</p>
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

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public ListDDoSInstancesResponseBody build() {
            return new ListDDoSInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDDoSInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDDoSInstancesResponseBody</p>
     */
    public static class InstanceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DDoSBurstableDomesticProtection")
        private String dDoSBurstableDomesticProtection;

        @com.aliyun.core.annotation.NameInMap("DDoSBurstableOverseasProtection")
        private String dDoSBurstableOverseasProtection;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ReserveReleaseTime")
        private String reserveReleaseTime;

        @com.aliyun.core.annotation.NameInMap("SiteInstanceId")
        private String siteInstanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private InstanceInfo(Builder builder) {
            this.createTime = builder.createTime;
            this.dDoSBurstableDomesticProtection = builder.dDoSBurstableDomesticProtection;
            this.dDoSBurstableOverseasProtection = builder.dDoSBurstableOverseasProtection;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dDoSBurstableDomesticProtection
         */
        public String getDDoSBurstableDomesticProtection() {
            return this.dDoSBurstableDomesticProtection;
        }

        /**
         * @return dDoSBurstableOverseasProtection
         */
        public String getDDoSBurstableOverseasProtection() {
            return this.dDoSBurstableOverseasProtection;
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
            private String createTime; 
            private String dDoSBurstableDomesticProtection; 
            private String dDoSBurstableOverseasProtection; 
            private String instanceId; 
            private String reserveReleaseTime; 
            private String siteInstanceId; 
            private String status; 

            private Builder() {
            } 

            private Builder(InstanceInfo model) {
                this.createTime = model.createTime;
                this.dDoSBurstableDomesticProtection = model.dDoSBurstableDomesticProtection;
                this.dDoSBurstableOverseasProtection = model.dDoSBurstableOverseasProtection;
                this.instanceId = model.instanceId;
                this.reserveReleaseTime = model.reserveReleaseTime;
                this.siteInstanceId = model.siteInstanceId;
                this.status = model.status;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DDoSBurstableDomesticProtection.
             */
            public Builder dDoSBurstableDomesticProtection(String dDoSBurstableDomesticProtection) {
                this.dDoSBurstableDomesticProtection = dDoSBurstableDomesticProtection;
                return this;
            }

            /**
             * DDoSBurstableOverseasProtection.
             */
            public Builder dDoSBurstableOverseasProtection(String dDoSBurstableOverseasProtection) {
                this.dDoSBurstableOverseasProtection = dDoSBurstableOverseasProtection;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ReserveReleaseTime.
             */
            public Builder reserveReleaseTime(String reserveReleaseTime) {
                this.reserveReleaseTime = reserveReleaseTime;
                return this;
            }

            /**
             * SiteInstanceId.
             */
            public Builder siteInstanceId(String siteInstanceId) {
                this.siteInstanceId = siteInstanceId;
                return this;
            }

            /**
             * Status.
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
