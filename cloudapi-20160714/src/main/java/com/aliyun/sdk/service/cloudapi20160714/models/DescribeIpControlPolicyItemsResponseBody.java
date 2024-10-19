// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeIpControlPolicyItemsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpControlPolicyItemsResponseBody</p>
 */
public class DescribeIpControlPolicyItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpControlPolicyItems")
    private IpControlPolicyItems ipControlPolicyItems;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The information about policies. The information is an array of IpControlPolicyItem data.</p>
         */
        public Builder ipControlPolicyItems(IpControlPolicyItems ipControlPolicyItems) {
            this.ipControlPolicyItems = ipControlPolicyItems;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ004</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeIpControlPolicyItemsResponseBody build() {
            return new DescribeIpControlPolicyItemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIpControlPolicyItemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIpControlPolicyItemsResponseBody</p>
     */
    public static class IpControlPolicyItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CidrIp")
        private String cidrIp;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("PolicyItemId")
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
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>11112</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The IP addresses or CIDR blocks.</p>
             * 
             * <strong>example:</strong>
             * <p>113.125.XX.XX;101.11.XX.XX</p>
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * <p>The time when the policy was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-01-17T06:20:08Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the policy was modified. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-01-17T06:25:13Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The ID of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>P151617000829241</p>
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
    /**
     * 
     * {@link DescribeIpControlPolicyItemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIpControlPolicyItemsResponseBody</p>
     */
    public static class IpControlPolicyItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpControlPolicyItem")
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
