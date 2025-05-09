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
 * {@link DescribeVpnCrossAccountAuthorizationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpnCrossAccountAuthorizationsResponseBody</p>
 */
public class DescribeVpnCrossAccountAuthorizationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CrossAccountAuthorizations")
    private java.util.List<CrossAccountAuthorizations> crossAccountAuthorizations;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crossAccountAuthorizations
     */
    public java.util.List<CrossAccountAuthorizations> getCrossAccountAuthorizations() {
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
        private java.util.List<CrossAccountAuthorizations> crossAccountAuthorizations; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeVpnCrossAccountAuthorizationsResponseBody model) {
            this.crossAccountAuthorizations = model.crossAccountAuthorizations;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The cross-account authorization information about the IPsec-VPN connection.</p>
         */
        public Builder crossAccountAuthorizations(java.util.List<CrossAccountAuthorizations> crossAccountAuthorizations) {
            this.crossAccountAuthorizations = crossAccountAuthorizations;
            return this;
        }

        /**
         * <p>The page number.</p>
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
         * <p>DB04E39A-6F0C-36AC-BCA0-B6D371B90062</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public DescribeVpnCrossAccountAuthorizationsResponseBody build() {
            return new DescribeVpnCrossAccountAuthorizationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpnCrossAccountAuthorizationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnCrossAccountAuthorizationsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(CrossAccountAuthorizations model) {
                this.aliUid = model.aliUid;
                this.bindInstance = model.bindInstance;
                this.bindProduct = model.bindProduct;
                this.bindUid = model.bindUid;
                this.creationTime = model.creationTime;
                this.vpnConnectionId = model.vpnConnectionId;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account to which the IPsec-VPN connection belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1250123456123456</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The ID of the CEN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-vv8h0t3klfpaae****</p>
             */
            public Builder bindInstance(String bindInstance) {
                this.bindInstance = bindInstance;
                return this;
            }

            /**
             * <p>The type of resource that can be associated with the IPsec-VPN connection.</p>
             * <p>Only <strong>CEN</strong> can be returned, which indicates that the IPsec-VPN connection is authorized to be associated with the transit router of a Cloud Enterprise Network (CEN) instance that belongs to another Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>CEN</p>
             */
            public Builder bindProduct(String bindProduct) {
                this.bindProduct = bindProduct;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account whose resources the IPsec-VPN connection is authorized to be associated with.</p>
             * 
             * <strong>example:</strong>
             * <p>1210123456123456</p>
             */
            public Builder bindUid(Long bindUid) {
                this.bindUid = bindUid;
                return this;
            }

            /**
             * <p>The time when the authorization for the IPsec-VPN connection was created.</p>
             * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1658201810000</p>
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the IPsec-VPN connection.</p>
             * 
             * <strong>example:</strong>
             * <p>vco-p0w2jpkhi2eeop6q6****</p>
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
