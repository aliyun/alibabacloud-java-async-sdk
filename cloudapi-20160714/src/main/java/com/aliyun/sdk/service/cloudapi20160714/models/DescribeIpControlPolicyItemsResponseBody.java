// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpControlPolicyItemsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpControlPolicyItemsResponseBody</p>
 */
public class DescribeIpControlPolicyItemsResponseBody extends TeaModel {
    @NameInMap("IpControlPolicyItems")
    private IpControlPolicyItems ipControlPolicyItems;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeIpControlPolicyItemsResponseBody(Builder builder) {
        this.ipControlPolicyItems = builder.ipControlPolicyItems;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpControlPolicyItemsResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipControlPolicyItems
     */
    public IpControlPolicyItems getIpControlPolicyItems() {
        return this.ipControlPolicyItems;
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

    public static final class Builder {
        private IpControlPolicyItems ipControlPolicyItems; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * IpControlPolicyItems.
         */
        public Builder ipControlPolicyItems(IpControlPolicyItems ipControlPolicyItems) {
            this.ipControlPolicyItems = ipControlPolicyItems;
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

        public DescribeIpControlPolicyItemsResponseBody build() {
            return new DescribeIpControlPolicyItemsResponseBody(this);
        } 

    } 

    public static class IpControlPolicyItem extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("CidrIp")
        private String cidrIp;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("PolicyItemId")
        private String policyItemId;

        private IpControlPolicyItem(Builder builder) {
            this.appId = builder.appId;
            this.cidrIp = builder.cidrIp;
            this.createTime = builder.createTime;
            this.modifiedTime = builder.modifiedTime;
            this.policyItemId = builder.policyItemId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpControlPolicyItem create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return cidrIp
         */
        public String getCidrIp() {
            return this.cidrIp;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return policyItemId
         */
        public String getPolicyItemId() {
            return this.policyItemId;
        }

        public static final class Builder {
            private String appId; 
            private String cidrIp; 
            private String createTime; 
            private String modifiedTime; 
            private String policyItemId; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * CidrIp.
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * PolicyItemId.
             */
            public Builder policyItemId(String policyItemId) {
                this.policyItemId = policyItemId;
                return this;
            }

            public IpControlPolicyItem build() {
                return new IpControlPolicyItem(this);
            } 

        } 

    }
    public static class IpControlPolicyItems extends TeaModel {
        @NameInMap("IpControlPolicyItem")
        private java.util.List < IpControlPolicyItem> ipControlPolicyItem;

        private IpControlPolicyItems(Builder builder) {
            this.ipControlPolicyItem = builder.ipControlPolicyItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpControlPolicyItems create() {
            return builder().build();
        }

        /**
         * @return ipControlPolicyItem
         */
        public java.util.List < IpControlPolicyItem> getIpControlPolicyItem() {
            return this.ipControlPolicyItem;
        }

        public static final class Builder {
            private java.util.List < IpControlPolicyItem> ipControlPolicyItem; 

            /**
             * IpControlPolicyItem.
             */
            public Builder ipControlPolicyItem(java.util.List < IpControlPolicyItem> ipControlPolicyItem) {
                this.ipControlPolicyItem = ipControlPolicyItem;
                return this;
            }

            public IpControlPolicyItems build() {
                return new IpControlPolicyItems(this);
            } 

        } 

    }
}
