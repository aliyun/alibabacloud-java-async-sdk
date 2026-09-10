// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeGatewayListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewayListResponseBody</p>
 */
public class DescribeGatewayListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private String pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private String totalRecordCount;

    private DescribeGatewayListResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
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
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private String pageNumber; 
        private String pageRecordCount; 
        private String pageSize; 
        private String requestId; 
        private String totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeGatewayListResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>A list of gateway instances.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageRecordCount(String pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <ul>
         * <li><p><strong>30</strong></p>
         * </li>
         * <li><p><strong>50</strong></p>
         * </li>
         * <li><p><strong>100</strong></p>
         * </li>
         * </ul>
         * <p>Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CED079B7-A408-41A1-BFF1-EC608E******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(String totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeGatewayListResponseBody build() {
            return new DescribeGatewayListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGatewayListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGatewayListResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private Boolean expired;

        @com.aliyun.core.annotation.NameInMap("GwClusterId")
        private String gwClusterId;

        @com.aliyun.core.annotation.NameInMap("GwDescription")
        private String gwDescription;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Items(Builder builder) {
            this.createTime = builder.createTime;
            this.dbType = builder.dbType;
            this.expireTime = builder.expireTime;
            this.expired = builder.expired;
            this.gwClusterId = builder.gwClusterId;
            this.gwDescription = builder.gwDescription;
            this.modifyTime = builder.modifyTime;
            this.payType = builder.payType;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return expired
         */
        public Boolean getExpired() {
            return this.expired;
        }

        /**
         * @return gwClusterId
         */
        public String getGwClusterId() {
            return this.gwClusterId;
        }

        /**
         * @return gwDescription
         */
        public String getGwDescription() {
            return this.gwDescription;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String createTime; 
            private String dbType; 
            private String expireTime; 
            private Boolean expired; 
            private String gwClusterId; 
            private String gwDescription; 
            private String modifyTime; 
            private String payType; 
            private String regionId; 
            private String status; 
            private String vSwitchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.createTime = model.createTime;
                this.dbType = model.dbType;
                this.expireTime = model.expireTime;
                this.expired = model.expired;
                this.gwClusterId = model.gwClusterId;
                this.gwDescription = model.gwDescription;
                this.modifyTime = model.modifyTime;
                this.payType = model.payType;
                this.regionId = model.regionId;
                this.status = model.status;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The time when the gateway instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-08-14T05:58:42Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The database type.</p>
             * 
             * <strong>example:</strong>
             * <p>polardb_mysql</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * <p>The expiration time of the gateway instance.</p>
             * <ul>
             * <li><p>For subscription instances, this parameter indicates the expiration time.</p>
             * </li>
             * <li><p>This parameter is empty for pay-as-you-go instances.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2028-09-01T16:00:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>Indicates whether the gateway instance has expired. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong></p>
             * </li>
             * <li><p><strong>false</strong></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>The gateway instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pg-xxxxxxx</p>
             */
            public Builder gwClusterId(String gwClusterId) {
                this.gwClusterId = gwClusterId;
                return this;
            }

            /**
             * <p>The description of the gateway instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pg-xxxxxx</p>
             */
            public Builder gwDescription(String gwDescription) {
                this.gwDescription = gwDescription;
                return this;
            }

            /**
             * <p>The time when the gateway instance was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-29T09:31:37Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li><p><strong>Postpaid</strong>: pay-as-you-go</p>
             * </li>
             * <li><p><strong>Prepaid</strong>: subscription</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Postpaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The status of the gateway instance. Valid values:</p>
             * <ul>
             * <li><p><strong>CREATE</strong>: creating</p>
             * </li>
             * <li><p><strong>ACTIVATION</strong>: running</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACTIVATION</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-wz9u0v2yuskt1gth3uuju</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-****************</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
