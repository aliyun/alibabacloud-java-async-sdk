// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpnCertificateAssociationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpnCertificateAssociationsResponseBody</p>
 */
public class ListVpnCertificateAssociationsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("VpnCertificateRelations")
    private java.util.List < VpnCertificateRelations> vpnCertificateRelations;

    private ListVpnCertificateAssociationsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vpnCertificateRelations = builder.vpnCertificateRelations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpnCertificateAssociationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return vpnCertificateRelations
     */
    public java.util.List < VpnCertificateRelations> getVpnCertificateRelations() {
        return this.vpnCertificateRelations;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < VpnCertificateRelations> vpnCertificateRelations; 

        /**
         * The number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If **NextToken** is empty, no next page exists.
         * *   If **NextToken** is not empty, the value indicates the token that is used for the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The association information.
         */
        public Builder vpnCertificateRelations(java.util.List < VpnCertificateRelations> vpnCertificateRelations) {
            this.vpnCertificateRelations = vpnCertificateRelations;
            return this;
        }

        public ListVpnCertificateAssociationsResponseBody build() {
            return new ListVpnCertificateAssociationsResponseBody(this);
        } 

    } 

    public static class VpnCertificateRelations extends TeaModel {
        @NameInMap("AssociationTime")
        private String associationTime;

        @NameInMap("CertificateId")
        private String certificateId;

        @NameInMap("CertificateType")
        private String certificateType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("VpnGatewayId")
        private String vpnGatewayId;

        private VpnCertificateRelations(Builder builder) {
            this.associationTime = builder.associationTime;
            this.certificateId = builder.certificateId;
            this.certificateType = builder.certificateType;
            this.regionId = builder.regionId;
            this.vpnGatewayId = builder.vpnGatewayId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpnCertificateRelations create() {
            return builder().build();
        }

        /**
         * @return associationTime
         */
        public String getAssociationTime() {
            return this.associationTime;
        }

        /**
         * @return certificateId
         */
        public String getCertificateId() {
            return this.certificateId;
        }

        /**
         * @return certificateType
         */
        public String getCertificateType() {
            return this.certificateType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return vpnGatewayId
         */
        public String getVpnGatewayId() {
            return this.vpnGatewayId;
        }

        public static final class Builder {
            private String associationTime; 
            private String certificateId; 
            private String certificateType; 
            private String regionId; 
            private String vpnGatewayId; 

            /**
             * The time when the certificate was associated.
             * <p>
             * 
             * The time follows the ISO8601 standard in the YYYY-MM-DDThh:mmZ format. The time is displayed in UTC.
             */
            public Builder associationTime(String associationTime) {
                this.associationTime = associationTime;
                return this;
            }

            /**
             * The certificate ID.
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            /**
             * The certificate type.
             * <p>
             * 
             * *   **Encryption**
             * *   **Signature**
             */
            public Builder certificateType(String certificateType) {
                this.certificateType = certificateType;
                return this;
            }

            /**
             * The ID of the region where the VPN gateway is created.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the VPN gateway.
             */
            public Builder vpnGatewayId(String vpnGatewayId) {
                this.vpnGatewayId = vpnGatewayId;
                return this;
            }

            public VpnCertificateRelations build() {
                return new VpnCertificateRelations(this);
            } 

        } 

    }
}
