// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DescribeSslVpnClientCertsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSslVpnClientCertsResponseBody</p>
 */
public class DescribeSslVpnClientCertsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SslVpnClientCertKeys")
    private SslVpnClientCertKeys sslVpnClientCertKeys;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSslVpnClientCertsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.sslVpnClientCertKeys = builder.sslVpnClientCertKeys;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSslVpnClientCertsResponseBody create() {
        return builder().build();
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
     * @return sslVpnClientCertKeys
     */
    public SslVpnClientCertKeys getSslVpnClientCertKeys() {
        return this.sslVpnClientCertKeys;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private SslVpnClientCertKeys sslVpnClientCertKeys; 
        private Integer totalCount; 

        /**
         * <p>The number of the page to return.</p>
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
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5BE01CD7-5A50-472D-AC14-CA181C5C03BE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the SSL client certificates.</p>
         */
        public Builder sslVpnClientCertKeys(SslVpnClientCertKeys sslVpnClientCertKeys) {
            this.sslVpnClientCertKeys = sslVpnClientCertKeys;
            return this;
        }

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSslVpnClientCertsResponseBody build() {
            return new DescribeSslVpnClientCertsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSslVpnClientCertsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSslVpnClientCertsResponseBody</p>
     */
    public static class SslVpnClientCertKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SslVpnClientCertId")
        private String sslVpnClientCertId;

        @com.aliyun.core.annotation.NameInMap("SslVpnServerId")
        private String sslVpnServerId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private SslVpnClientCertKey(Builder builder) {
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.sslVpnClientCertId = builder.sslVpnClientCertId;
            this.sslVpnServerId = builder.sslVpnServerId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SslVpnClientCertKey create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return sslVpnClientCertId
         */
        public String getSslVpnClientCertId() {
            return this.sslVpnClientCertId;
        }

        /**
         * @return sslVpnServerId
         */
        public String getSslVpnServerId() {
            return this.sslVpnServerId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long createTime; 
            private Long endTime; 
            private String name; 
            private String regionId; 
            private String resourceGroupId; 
            private String sslVpnClientCertId; 
            private String sslVpnServerId; 
            private String status; 

            /**
             * <p>The timestamp that indicates when the SSL client certificate was created. Unit: millisecond.</p>
             * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1492747187000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The timestamp that indicates when the SSL client certificate expires. Unit: millisecond.</p>
             * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1494966335000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The name of the SSL client certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>cert1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The region where the SSL client certificate is created.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the SSL client certificate belongs.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query the resource group information.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmzs372yg****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the SSL client certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>vsc-bp1n8wcf134yl0osr****</p>
             */
            public Builder sslVpnClientCertId(String sslVpnClientCertId) {
                this.sslVpnClientCertId = sslVpnClientCertId;
                return this;
            }

            /**
             * <p>The ID of the SSL server.</p>
             * 
             * <strong>example:</strong>
             * <p>vss-bp18q7hzj6largv4v****</p>
             */
            public Builder sslVpnServerId(String sslVpnServerId) {
                this.sslVpnServerId = sslVpnServerId;
                return this;
            }

            /**
             * <p>The status of the SSL client certificate. Valid values:</p>
             * <ul>
             * <li><strong>expiring-soon</strong></li>
             * <li><strong>normal</strong></li>
             * <li><strong>expired</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SslVpnClientCertKey build() {
                return new SslVpnClientCertKey(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSslVpnClientCertsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSslVpnClientCertsResponseBody</p>
     */
    public static class SslVpnClientCertKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SslVpnClientCertKey")
        private java.util.List<SslVpnClientCertKey> sslVpnClientCertKey;

        private SslVpnClientCertKeys(Builder builder) {
            this.sslVpnClientCertKey = builder.sslVpnClientCertKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SslVpnClientCertKeys create() {
            return builder().build();
        }

        /**
         * @return sslVpnClientCertKey
         */
        public java.util.List<SslVpnClientCertKey> getSslVpnClientCertKey() {
            return this.sslVpnClientCertKey;
        }

        public static final class Builder {
            private java.util.List<SslVpnClientCertKey> sslVpnClientCertKey; 

            /**
             * SslVpnClientCertKey.
             */
            public Builder sslVpnClientCertKey(java.util.List<SslVpnClientCertKey> sslVpnClientCertKey) {
                this.sslVpnClientCertKey = sslVpnClientCertKey;
                return this;
            }

            public SslVpnClientCertKeys build() {
                return new SslVpnClientCertKeys(this);
            } 

        } 

    }
}
