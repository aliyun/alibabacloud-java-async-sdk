// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpnCrossAccountAuthorizationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpnCrossAccountAuthorizationsResponseBody</p>
 */
public class DescribeVpnCrossAccountAuthorizationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CrossAccountAuthorizations")
    private java.util.List < CrossAccountAuthorizations> crossAccountAuthorizations;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeVpnCrossAccountAuthorizationsResponseBody(Builder builder) {
        this.crossAccountAuthorizations = builder.crossAccountAuthorizations;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpnCrossAccountAuthorizationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return crossAccountAuthorizations
     */
    public java.util.List < CrossAccountAuthorizations> getCrossAccountAuthorizations() {
        return this.crossAccountAuthorizations;
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
        private java.util.List < CrossAccountAuthorizations> crossAccountAuthorizations; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The cross-account authorization information about the IPsec-VPN connection.
         */
        public Builder crossAccountAuthorizations(java.util.List < CrossAccountAuthorizations> crossAccountAuthorizations) {
            this.crossAccountAuthorizations = crossAccountAuthorizations;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeVpnCrossAccountAuthorizationsResponseBody build() {
            return new DescribeVpnCrossAccountAuthorizationsResponseBody(this);
        } 

    } 

    public static class CrossAccountAuthorizations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("BindInstance")
        private String bindInstance;

        @com.aliyun.core.annotation.NameInMap("BindProduct")
        private String bindProduct;

        @com.aliyun.core.annotation.NameInMap("BindUid")
        private Long bindUid;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private Long creationTime;

        @com.aliyun.core.annotation.NameInMap("VpnConnectionId")
        private String vpnConnectionId;

        private CrossAccountAuthorizations(Builder builder) {
            this.aliUid = builder.aliUid;
            this.bindInstance = builder.bindInstance;
            this.bindProduct = builder.bindProduct;
            this.bindUid = builder.bindUid;
            this.creationTime = builder.creationTime;
            this.vpnConnectionId = builder.vpnConnectionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CrossAccountAuthorizations create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return bindInstance
         */
        public String getBindInstance() {
            return this.bindInstance;
        }

        /**
         * @return bindProduct
         */
        public String getBindProduct() {
            return this.bindProduct;
        }

        /**
         * @return bindUid
         */
        public Long getBindUid() {
            return this.bindUid;
        }

        /**
         * @return creationTime
         */
        public Long getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return vpnConnectionId
         */
        public String getVpnConnectionId() {
            return this.vpnConnectionId;
        }

        public static final class Builder {
            private Long aliUid; 
            private String bindInstance; 
            private String bindProduct; 
            private Long bindUid; 
            private Long creationTime; 
            private String vpnConnectionId; 

            /**
             * The ID of the Alibaba Cloud account to which the IPsec-VPN connection belongs.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * The ID of the CEN instance.
             */
            public Builder bindInstance(String bindInstance) {
                this.bindInstance = bindInstance;
                return this;
            }

            /**
             * The resource type of the authorization.
             * <p>
             * 
             * The value is set to **CEN**, which indicates that the IPsec-VPN connection can be associated with a transit router of a Cloud Enterprise Network (CEN) instance that belongs to another Alibaba Cloud account.
             */
            public Builder bindProduct(String bindProduct) {
                this.bindProduct = bindProduct;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account whose resource the IPsec-VPN connection can be associated with.
             */
            public Builder bindUid(Long bindUid) {
                this.bindUid = bindUid;
                return this;
            }

            /**
             * The timestamp when the authorization for the IPsec-VPN connection was created.
             * <p>
             * 
             * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The ID of the IPsec-VPN connection.
             */
            public Builder vpnConnectionId(String vpnConnectionId) {
                this.vpnConnectionId = vpnConnectionId;
                return this;
            }

            public CrossAccountAuthorizations build() {
                return new CrossAccountAuthorizations(this);
            } 

        } 

    }
}
