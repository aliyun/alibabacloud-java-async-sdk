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
    @Deprecated
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
         * <p>The page number of the current page in a paginated query.</p>
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
         * <p>The IP version of the assets protected by Cloud Firewall. Valid values:</p>
         * <ul>
         * <li><strong>4</strong> (default): IPv4.</li>
         * <li><strong>6</strong>: IPv6.</li>
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
         * <p>The language type of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
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
         * <p>The UID of the Cloud Firewall member account.</p>
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
         * <p>The time when the asset was discovered. Valid values:</p>
         * <ul>
         * <li><strong>discovered in 1 hour</strong>: The asset was discovered within 1 hour.</li>
         * <li><strong>discovered in 1 day</strong>: The asset was discovered within 1 day.</li>
         * <li><strong>discovered in 7 days</strong>: The asset was discovered within 7 days.</li>
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
         * <p>Specifies whether to query outbound traffic information.</p>
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
         * <p>The number of Cloud Firewall-protected assets to display on each page in a paginated query.</p>
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
         * <p>The region ID of the Cloud Firewall.</p>
         * <blockquote>
         * <p>For more information about regions supported by Cloud Firewall, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
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
         * <p>The asset type. Valid values:</p>
         * <ul>
         * <li><strong>BastionHostEgressIP</strong>: Bastion host egress IP.</li>
         * <li><strong>BastionHostIngressIP</strong>: Bastion host ingress IP.</li>
         * <li><strong>EcsEIP</strong>: ECS EIP.</li>
         * <li><strong>EcsPublicIP</strong>: ECS public IP.</li>
         * <li><strong>EIP</strong>: Elastic IP address.</li>
         * <li><strong>EniEIP</strong>: Elastic network interface EIP.</li>
         * <li><strong>NatEIP</strong>: NAT EIP.</li>
         * <li><strong>SlbEIP</strong>: SLB EIP (CLB EIP).</li>
         * <li><strong>SlbPublicIP</strong>: SLB public IP (CLB public IP).</li>
         * <li><strong>NatPublicIP</strong>: NAT public IP.</li>
         * <li><strong>HAVIP</strong>: High-availability virtual IP.</li>
         * <li><strong>NlbEIP</strong>: NLB EIP.</li>
         * <li><strong>ApiGatewayEIP</strong>: API Gateway public IP.</li>
         * <li><strong>AlbEIP</strong>: ALB EIP.</li>
         * <li><strong>AiGatewayEIP</strong>: AI Gateway public IP.</li>
         * <li><strong>GaEIP</strong>: GA EIP.</li>
         * <li><strong>SwasEIP</strong>: Simple Application Server public IP.</li>
         * <li><strong>EcdEIP</strong>: Elastic Desktop Service public IP.</li>
         * <li><strong>BastionHostIP</strong>: Bastion host IP.</li>
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
         * <p>The IP address or instance ID of the asset.</p>
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
         * <p>The status of data leakage detection.</p>
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
         * <p>The security group policy status. Valid values:</p>
         * <ul>
         * <li><strong>pass</strong>: Delivered.</li>
         * <li><strong>block</strong>: Not delivered.</li>
         * <li><strong>unsupport</strong>: Not supported.<blockquote>
         * <p>If this parameter is not set, all security group policy statuses are queried.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>The Cloud Firewall status. Valid values:</p>
         * <ul>
         * <li><strong>open</strong>: Protected.</li>
         * <li><strong>opening</strong>: Protection enabling.</li>
         * <li><strong>closed</strong>: Not protected.</li>
         * <li><strong>closing</strong>: Protection disabling.</li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is not set, all firewall statuses are queried.</p>
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
         * <p>The user type. Valid values:</p>
         * <ul>
         * <li><strong>buy</strong> (default): Paid user.</li>
         * <li><strong>free</strong>: Free user.</li>
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
