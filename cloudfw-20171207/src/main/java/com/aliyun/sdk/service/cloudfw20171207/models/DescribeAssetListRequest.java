// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeAssetListRequest} extends {@link RequestModel}
 *
 * <p>DescribeAssetListRequest</p>
 */
public class DescribeAssetListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpVersion")
    private String ipVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private Long memberUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewResourceTag")
    private String newResourceTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutStatistic")
    private String outStatistic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    private String regionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchItem")
    private String searchItem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SensitiveStatus")
    private String sensitiveStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SgStatus")
    private String sgStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserType")
    private String userType;

    private DescribeAssetListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.ipVersion = builder.ipVersion;
        this.lang = builder.lang;
        this.memberUid = builder.memberUid;
        this.newResourceTag = builder.newResourceTag;
        this.outStatistic = builder.outStatistic;
        this.pageSize = builder.pageSize;
        this.regionNo = builder.regionNo;
        this.resourceType = builder.resourceType;
        this.searchItem = builder.searchItem;
        this.sensitiveStatus = builder.sensitiveStatus;
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
     * @return outStatistic
     */
    public String getOutStatistic() {
        return this.outStatistic;
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
     * @return sensitiveStatus
     */
    public String getSensitiveStatus() {
        return this.sensitiveStatus;
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
        private String outStatistic; 
        private String pageSize; 
        private String regionNo; 
        private String resourceType; 
        private String searchItem; 
        private String sensitiveStatus; 
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
            this.outStatistic = request.outStatistic;
            this.pageSize = request.pageSize;
            this.regionNo = request.regionNo;
            this.resourceType = request.resourceType;
            this.searchItem = request.searchItem;
            this.sensitiveStatus = request.sensitiveStatus;
            this.sgStatus = request.sgStatus;
            this.status = request.status;
            this.type = request.type;
            this.userType = request.userType;
        } 

        /**
         * <p>The page number. Valid values: 1 to 50.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The IP version of the asset that is protected by Cloud Firewall. Valid values:</p>
         * <ul>
         * <li><strong>4</strong>: IPv4 (default)</li>
         * <li><strong>6</strong>: IPv6</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * <p>The language of the content within the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese (default)</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The UID of the member that is added to Cloud Firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>258039427902****</p>
         */
        public Builder memberUid(Long memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * <p>The time when the asset was added. Valid values:</p>
         * <ul>
         * <li><strong>discovered in 1 hour</strong>: within one hour.</li>
         * <li><strong>discovered in 1 day</strong>: within one day.</li>
         * <li><strong>discovered in 7 days</strong>: within seven days.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>discovered in 1 hour</p>
         */
        public Builder newResourceTag(String newResourceTag) {
            this.putQueryParameter("NewResourceTag", newResourceTag);
            this.newResourceTag = newResourceTag;
            return this;
        }

        /**
         * <p>Whether to query external traffic information.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder outStatistic(String outStatistic) {
            this.putQueryParameter("OutStatistic", outStatistic);
            this.outStatistic = outStatistic;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 50.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of your Cloud Firewall.</p>
         * <blockquote>
         * <p>For more information about the regions, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * <p>The type of the asset. Valid values:</p>
         * <ul>
         * <li><strong>BastionHostEgressIP</strong>: the egress IP address of a bastion host</li>
         * <li><strong>BastionHostIngressIP</strong>: the ingress IP address of a bastion host</li>
         * <li><strong>EcsEIP</strong>: the elastic IP address (EIP) of an Elastic Compute Service (ECS) instance</li>
         * <li><strong>EcsPublicIP</strong>: the public IP address of an ECS instance</li>
         * <li><strong>EIP</strong>: the EIP</li>
         * <li><strong>EniEIP</strong>: the EIP of an elastic network interface (ENI)</li>
         * <li><strong>NatEIP</strong>: the EIP of a NAT gateway</li>
         * <li><strong>SlbEIP</strong>: the EIP of a Server Load Balancer (SLB) instance or a Classic Load Balancer (CLB) instance</li>
         * <li><strong>SlbPublicIP</strong>: the public IP address of an SLB instance or a CLB instance</li>
         * <li><strong>NatPublicIP</strong>: the public IP address of a NAT gateway</li>
         * <li><strong>HAVIP</strong>: the high-availability virtual IP address (HAVIP)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EIP</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The instance ID or IP address of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        public Builder searchItem(String searchItem) {
            this.putQueryParameter("SearchItem", searchItem);
            this.searchItem = searchItem;
            return this;
        }

        /**
         * <p>Data leakage detection activation status.</p>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        public Builder sensitiveStatus(String sensitiveStatus) {
            this.putQueryParameter("SensitiveStatus", sensitiveStatus);
            this.sensitiveStatus = sensitiveStatus;
            return this;
        }

        /**
         * <p>The status of the security group policy. Valid values:</p>
         * <ul>
         * <li><strong>pass</strong>: delivered</li>
         * <li><strong>block</strong>: undelivered</li>
         * <li><strong>unsupport</strong>: unsupported</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the assets on which security group policies in all states take effect are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        public Builder sgStatus(String sgStatus) {
            this.putQueryParameter("SgStatus", sgStatus);
            this.sgStatus = sgStatus;
            return this;
        }

        /**
         * <p>The status of the firewall. Valid values:</p>
         * <ul>
         * <li><strong>open</strong>: The firewall is enabled.</li>
         * <li><strong>opening</strong>: The firewall is being enabled.</li>
         * <li><strong>closed</strong>: The firewall is disabled.</li>
         * <li><strong>closing</strong>: The firewall is being disabled.</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the assets that are configured for firewalls in all states are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>eip</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The edition of Cloud Firewall. Valid values:</p>
         * <ul>
         * <li><strong>buy</strong>: a paid edition (default)</li>
         * <li><strong>free</strong>: Free Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>buy</p>
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
