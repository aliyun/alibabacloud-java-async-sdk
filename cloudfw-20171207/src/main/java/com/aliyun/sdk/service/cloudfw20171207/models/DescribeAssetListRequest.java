// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAssetListRequest} extends {@link RequestModel}
 *
 * <p>DescribeAssetListRequest</p>
 */
public class DescribeAssetListRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private String currentPage;

    @Query
    @NameInMap("IpVersion")
    private String ipVersion;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("MemberUid")
    private Long memberUid;

    @Query
    @NameInMap("NewResourceTag")
    private String newResourceTag;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private String pageSize;

    @Query
    @NameInMap("RegionNo")
    private String regionNo;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("SearchItem")
    private String searchItem;

    @Query
    @NameInMap("SgStatus")
    private String sgStatus;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("UserType")
    private String userType;

    private DescribeAssetListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.ipVersion = builder.ipVersion;
        this.lang = builder.lang;
        this.memberUid = builder.memberUid;
        this.newResourceTag = builder.newResourceTag;
        this.pageSize = builder.pageSize;
        this.regionNo = builder.regionNo;
        this.resourceType = builder.resourceType;
        this.searchItem = builder.searchItem;
        this.sgStatus = builder.sgStatus;
        this.status = builder.status;
        this.type = builder.type;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAssetListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return ipVersion
     */
    public String getIpVersion() {
        return this.ipVersion;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return memberUid
     */
    public Long getMemberUid() {
        return this.memberUid;
    }

    /**
     * @return newResourceTag
     */
    public String getNewResourceTag() {
        return this.newResourceTag;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return searchItem
     */
    public String getSearchItem() {
        return this.searchItem;
    }

    /**
     * @return sgStatus
     */
    public String getSgStatus() {
        return this.sgStatus;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return userType
     */
    public String getUserType() {
        return this.userType;
    }

    public static final class Builder extends Request.Builder<DescribeAssetListRequest, Builder> {
        private String currentPage; 
        private String ipVersion; 
        private String lang; 
        private Long memberUid; 
        private String newResourceTag; 
        private String pageSize; 
        private String regionNo; 
        private String resourceType; 
        private String searchItem; 
        private String sgStatus; 
        private String status; 
        private String type; 
        private String userType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAssetListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.ipVersion = request.ipVersion;
            this.lang = request.lang;
            this.memberUid = request.memberUid;
            this.newResourceTag = request.newResourceTag;
            this.pageSize = request.pageSize;
            this.regionNo = request.regionNo;
            this.resourceType = request.resourceType;
            this.searchItem = request.searchItem;
            this.sgStatus = request.sgStatus;
            this.status = request.status;
            this.type = request.type;
            this.userType = request.userType;
        } 

        /**
         * The page number. Valid values: 1 to 50.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The IP version of the asset that is protected by Cloud Firewall. Valid values:
         * <p>
         * 
         * *   **4**: IPv4 (default)
         * *   **6**: IPv6
         */
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * The language of the content within the response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The UID of the member that is added to Cloud Firewall.
         */
        public Builder memberUid(Long memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * The time when the asset was added. Valid values:
         * <p>
         * 
         * *   **discovered in 1 hour**: within one hour.
         * *   **discovered in 1 day**: within one day.
         * *   **discovered in 7 days**: within seven days.
         */
        public Builder newResourceTag(String newResourceTag) {
            this.putQueryParameter("NewResourceTag", newResourceTag);
            this.newResourceTag = newResourceTag;
            return this;
        }

        /**
         * The number of entries per page. Valid values: 1 to 50.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of your Cloud Firewall.
         * <p>
         * 
         * > For more information about the regions, see [Supported regions](~~195657~~).
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * The type of the asset. Valid values:
         * <p>
         * 
         * *   **BastionHostEgressIP**: the egress IP address of a bastion host
         * *   **BastionHostIngressIP**: the ingress IP address of a bastion host
         * *   **EcsEIP**: the elastic IP address (EIP) of an Elastic Compute Service (ECS) instance
         * *   **EcsPublicIP**: the public IP address of an ECS instance
         * *   **EIP**: the EIP
         * *   **EniEIP**: the EIP of an elastic network interface (ENI)
         * *   **NatEIP**: the EIP of a NAT gateway
         * *   **SlbEIP**: the EIP of a Server Load Balancer (SLB) instance or a Classic Load Balancer (CLB) instance
         * *   **SlbPublicIP**: the public IP address of an SLB instance or a CLB instance
         * *   **NatPublicIP**: the public IP address of a NAT gateway
         * *   **HAVIP**: the high-availability virtual IP address (HAVIP)
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The instance ID or IP address of the asset.
         */
        public Builder searchItem(String searchItem) {
            this.putQueryParameter("SearchItem", searchItem);
            this.searchItem = searchItem;
            return this;
        }

        /**
         * The status of the security group policy. Valid values:
         * <p>
         * 
         * *   **pass**: delivered
         * *   **block**: undelivered
         * *   **unsupport**: unsupported
         * 
         * > If you do not specify this parameter, the assets on which security group policies in all states take effect are queried.
         */
        public Builder sgStatus(String sgStatus) {
            this.putQueryParameter("SgStatus", sgStatus);
            this.sgStatus = sgStatus;
            return this;
        }

        /**
         * The status of the firewall. Valid values:
         * <p>
         * 
         * *   **open**: The firewall is enabled.
         * *   **opening**: The firewall is being enabled.
         * *   **closed**: The firewall is disabled.
         * *   **closing**: The firewall is being disabled.
         * 
         * > If you do not specify this parameter, the assets that are configured for firewalls in all states are queried.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * This parameter is deprecated.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The edition of Cloud Firewall. Valid values:
         * <p>
         * 
         * *   **buy**: a paid edition (default)
         * *   **free**: Free Edition
         */
        public Builder userType(String userType) {
            this.putQueryParameter("UserType", userType);
            this.userType = userType;
            return this;
        }

        @Override
        public DescribeAssetListRequest build() {
            return new DescribeAssetListRequest(this);
        } 

    } 

}
