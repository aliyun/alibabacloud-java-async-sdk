// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpnCrossAccountAuthorizationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpnCrossAccountAuthorizationsResponseBody</p>
 */
public class DescribeVpnCrossAccountAuthorizationsResponseBody extends TeaModel {
    @NameInMap("CrossAccountAuthorizations")
    private java.util.List < CrossAccountAuthorizations> crossAccountAuthorizations;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * CrossAccountAuthorizations.
         */
        public Builder crossAccountAuthorizations(java.util.List < CrossAccountAuthorizations> crossAccountAuthorizations) {
            this.crossAccountAuthorizations = crossAccountAuthorizations;
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
         * Id of the request
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

        public DescribeVpnCrossAccountAuthorizationsResponseBody build() {
            return new DescribeVpnCrossAccountAuthorizationsResponseBody(this);
        } 

    } 

    public static class CrossAccountAuthorizations extends TeaModel {
        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("BindInstance")
        private String bindInstance;

        @NameInMap("BindProduct")
        private String bindProduct;

        @NameInMap("BindUid")
        private Long bindUid;

        @NameInMap("CreationTime")
        private Long creationTime;

        @NameInMap("VpnConnectionId")
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
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * BindInstance.
             */
            public Builder bindInstance(String bindInstance) {
                this.bindInstance = bindInstance;
                return this;
            }

            /**
             * BindProduct.
             */
            public Builder bindProduct(String bindProduct) {
                this.bindProduct = bindProduct;
                return this;
            }

            /**
             * BindUid.
             */
            public Builder bindUid(Long bindUid) {
                this.bindUid = bindUid;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * VpnConnectionId.
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
