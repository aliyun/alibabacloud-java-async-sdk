// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudDriveServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudDriveServiceResponseBody</p>
 */
public class DescribeCloudDriveServiceResponseBody extends TeaModel {
    @NameInMap("CloudDriveServices")
    private java.util.List < CloudDriveServices> cloudDriveServices;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCloudDriveServiceResponseBody(Builder builder) {
        this.cloudDriveServices = builder.cloudDriveServices;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudDriveServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return cloudDriveServices
     */
    public java.util.List < CloudDriveServices> getCloudDriveServices() {
        return this.cloudDriveServices;
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

    public static final class Builder {
        private java.util.List < CloudDriveServices> cloudDriveServices; 
        private String nextToken; 
        private String requestId; 

        /**
         * CloudDriveServices.
         */
        public Builder cloudDriveServices(java.util.List < CloudDriveServices> cloudDriveServices) {
            this.cloudDriveServices = cloudDriveServices;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCloudDriveServiceResponseBody build() {
            return new DescribeCloudDriveServiceResponseBody(this);
        } 

    } 

    public static class CloudDriveServices extends TeaModel {
        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("CdsChargeStatus")
        private String cdsChargeStatus;

        @NameInMap("CdsChargeType")
        private String cdsChargeType;

        @NameInMap("CdsId")
        private String cdsId;

        @NameInMap("CdsName")
        private String cdsName;

        @NameInMap("CdsReleaseDeadline")
        private String cdsReleaseDeadline;

        @NameInMap("CdsStatus")
        private String cdsStatus;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("MaxSize")
        private Long maxSize;

        @NameInMap("MeteredSize")
        private Long meteredSize;

        @NameInMap("PdsAdministrator")
        private String pdsAdministrator;

        @NameInMap("PdsDomainId")
        private String pdsDomainId;

        @NameInMap("PdsEndpoint")
        private String pdsEndpoint;

        @NameInMap("PdsInitToken")
        private String pdsInitToken;

        @NameInMap("PdsProductName")
        private String pdsProductName;

        @NameInMap("PdsSubdomainId")
        private String pdsSubdomainId;

        @NameInMap("PdsUrl")
        private String pdsUrl;

        @NameInMap("RegionId")
        private String regionId;

        private CloudDriveServices(Builder builder) {
            this.aliUid = builder.aliUid;
            this.cdsChargeStatus = builder.cdsChargeStatus;
            this.cdsChargeType = builder.cdsChargeType;
            this.cdsId = builder.cdsId;
            this.cdsName = builder.cdsName;
            this.cdsReleaseDeadline = builder.cdsReleaseDeadline;
            this.cdsStatus = builder.cdsStatus;
            this.createTime = builder.createTime;
            this.maxSize = builder.maxSize;
            this.meteredSize = builder.meteredSize;
            this.pdsAdministrator = builder.pdsAdministrator;
            this.pdsDomainId = builder.pdsDomainId;
            this.pdsEndpoint = builder.pdsEndpoint;
            this.pdsInitToken = builder.pdsInitToken;
            this.pdsProductName = builder.pdsProductName;
            this.pdsSubdomainId = builder.pdsSubdomainId;
            this.pdsUrl = builder.pdsUrl;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudDriveServices create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return cdsChargeStatus
         */
        public String getCdsChargeStatus() {
            return this.cdsChargeStatus;
        }

        /**
         * @return cdsChargeType
         */
        public String getCdsChargeType() {
            return this.cdsChargeType;
        }

        /**
         * @return cdsId
         */
        public String getCdsId() {
            return this.cdsId;
        }

        /**
         * @return cdsName
         */
        public String getCdsName() {
            return this.cdsName;
        }

        /**
         * @return cdsReleaseDeadline
         */
        public String getCdsReleaseDeadline() {
            return this.cdsReleaseDeadline;
        }

        /**
         * @return cdsStatus
         */
        public String getCdsStatus() {
            return this.cdsStatus;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return maxSize
         */
        public Long getMaxSize() {
            return this.maxSize;
        }

        /**
         * @return meteredSize
         */
        public Long getMeteredSize() {
            return this.meteredSize;
        }

        /**
         * @return pdsAdministrator
         */
        public String getPdsAdministrator() {
            return this.pdsAdministrator;
        }

        /**
         * @return pdsDomainId
         */
        public String getPdsDomainId() {
            return this.pdsDomainId;
        }

        /**
         * @return pdsEndpoint
         */
        public String getPdsEndpoint() {
            return this.pdsEndpoint;
        }

        /**
         * @return pdsInitToken
         */
        public String getPdsInitToken() {
            return this.pdsInitToken;
        }

        /**
         * @return pdsProductName
         */
        public String getPdsProductName() {
            return this.pdsProductName;
        }

        /**
         * @return pdsSubdomainId
         */
        public String getPdsSubdomainId() {
            return this.pdsSubdomainId;
        }

        /**
         * @return pdsUrl
         */
        public String getPdsUrl() {
            return this.pdsUrl;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private Long aliUid; 
            private String cdsChargeStatus; 
            private String cdsChargeType; 
            private String cdsId; 
            private String cdsName; 
            private String cdsReleaseDeadline; 
            private String cdsStatus; 
            private String createTime; 
            private Long maxSize; 
            private Long meteredSize; 
            private String pdsAdministrator; 
            private String pdsDomainId; 
            private String pdsEndpoint; 
            private String pdsInitToken; 
            private String pdsProductName; 
            private String pdsSubdomainId; 
            private String pdsUrl; 
            private String regionId; 

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * CdsChargeStatus.
             */
            public Builder cdsChargeStatus(String cdsChargeStatus) {
                this.cdsChargeStatus = cdsChargeStatus;
                return this;
            }

            /**
             * CdsChargeType.
             */
            public Builder cdsChargeType(String cdsChargeType) {
                this.cdsChargeType = cdsChargeType;
                return this;
            }

            /**
             * CdsId.
             */
            public Builder cdsId(String cdsId) {
                this.cdsId = cdsId;
                return this;
            }

            /**
             * CdsName.
             */
            public Builder cdsName(String cdsName) {
                this.cdsName = cdsName;
                return this;
            }

            /**
             * CdsReleaseDeadline.
             */
            public Builder cdsReleaseDeadline(String cdsReleaseDeadline) {
                this.cdsReleaseDeadline = cdsReleaseDeadline;
                return this;
            }

            /**
             * CdsStatus.
             */
            public Builder cdsStatus(String cdsStatus) {
                this.cdsStatus = cdsStatus;
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
             * MaxSize.
             */
            public Builder maxSize(Long maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * MeteredSize.
             */
            public Builder meteredSize(Long meteredSize) {
                this.meteredSize = meteredSize;
                return this;
            }

            /**
             * PdsAdministrator.
             */
            public Builder pdsAdministrator(String pdsAdministrator) {
                this.pdsAdministrator = pdsAdministrator;
                return this;
            }

            /**
             * PdsDomainId.
             */
            public Builder pdsDomainId(String pdsDomainId) {
                this.pdsDomainId = pdsDomainId;
                return this;
            }

            /**
             * PdsEndpoint.
             */
            public Builder pdsEndpoint(String pdsEndpoint) {
                this.pdsEndpoint = pdsEndpoint;
                return this;
            }

            /**
             * PdsInitToken.
             */
            public Builder pdsInitToken(String pdsInitToken) {
                this.pdsInitToken = pdsInitToken;
                return this;
            }

            /**
             * PdsProductName.
             */
            public Builder pdsProductName(String pdsProductName) {
                this.pdsProductName = pdsProductName;
                return this;
            }

            /**
             * PdsSubdomainId.
             */
            public Builder pdsSubdomainId(String pdsSubdomainId) {
                this.pdsSubdomainId = pdsSubdomainId;
                return this;
            }

            /**
             * PdsUrl.
             */
            public Builder pdsUrl(String pdsUrl) {
                this.pdsUrl = pdsUrl;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public CloudDriveServices build() {
                return new CloudDriveServices(this);
            } 

        } 

    }
}
