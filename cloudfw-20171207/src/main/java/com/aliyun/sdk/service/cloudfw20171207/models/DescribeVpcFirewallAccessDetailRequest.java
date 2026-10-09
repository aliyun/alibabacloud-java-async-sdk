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
 * {@link DescribeVpcFirewallAccessDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcFirewallAccessDetailRequest</p>
 */
public class DescribeVpcFirewallAccessDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetIP")
    private String assetIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IPProtocol")
    private String IPProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeerAssetIP")
    private String peerAssetIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeerAssetInstanceId")
    private String peerAssetInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeerAssetInstanceName")
    private String peerAssetInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeerVpcId")
    private String peerVpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    private String riskLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    private DescribeVpcFirewallAccessDetailRequest(Builder builder) {
        super(builder);
        this.assetIP = builder.assetIP;
        this.currentPage = builder.currentPage;
        this.direction = builder.direction;
        this.endTime = builder.endTime;
        this.IPProtocol = builder.IPProtocol;
        this.lang = builder.lang;
        this.order = builder.order;
        this.pageSize = builder.pageSize;
        this.peerAssetIP = builder.peerAssetIP;
        this.peerAssetInstanceId = builder.peerAssetInstanceId;
        this.peerAssetInstanceName = builder.peerAssetInstanceName;
        this.peerVpcId = builder.peerVpcId;
        this.port = builder.port;
        this.riskLevel = builder.riskLevel;
        this.sort = builder.sort;
        this.startTime = builder.startTime;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallAccessDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetIP
     */
    public String getAssetIP() {
        return this.assetIP;
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return IPProtocol
     */
    public String getIPProtocol() {
        return this.IPProtocol;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return peerAssetIP
     */
    public String getPeerAssetIP() {
        return this.peerAssetIP;
    }

    /**
     * @return peerAssetInstanceId
     */
    public String getPeerAssetInstanceId() {
        return this.peerAssetInstanceId;
    }

    /**
     * @return peerAssetInstanceName
     */
    public String getPeerAssetInstanceName() {
        return this.peerAssetInstanceName;
    }

    /**
     * @return peerVpcId
     */
    public String getPeerVpcId() {
        return this.peerVpcId;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return riskLevel
     */
    public String getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<DescribeVpcFirewallAccessDetailRequest, Builder> {
        private String assetIP; 
        private String currentPage; 
        private String direction; 
        private String endTime; 
        private String IPProtocol; 
        private String lang; 
        private String order; 
        private String pageSize; 
        private String peerAssetIP; 
        private String peerAssetInstanceId; 
        private String peerAssetInstanceName; 
        private String peerVpcId; 
        private String port; 
        private String riskLevel; 
        private String sort; 
        private String startTime; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcFirewallAccessDetailRequest request) {
            super(request);
            this.assetIP = request.assetIP;
            this.currentPage = request.currentPage;
            this.direction = request.direction;
            this.endTime = request.endTime;
            this.IPProtocol = request.IPProtocol;
            this.lang = request.lang;
            this.order = request.order;
            this.pageSize = request.pageSize;
            this.peerAssetIP = request.peerAssetIP;
            this.peerAssetInstanceId = request.peerAssetInstanceId;
            this.peerAssetInstanceName = request.peerAssetInstanceName;
            this.peerVpcId = request.peerVpcId;
            this.port = request.port;
            this.riskLevel = request.riskLevel;
            this.sort = request.sort;
            this.startTime = request.startTime;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The IP address of the local asset. You must specify at least one of AssetIP and Port. If both are left empty, the API returns a 400 error.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        public Builder assetIP(String assetIP) {
            this.putQueryParameter("AssetIP", assetIP);
            this.assetIP = assetIP;
            return this;
        }

        /**
         * <p>The page number in a paged query.</p>
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
         * <p>The traffic direction. Valid values:</p>
         * <ul>
         * <li><strong>in</strong>: inbound.</li>
         * <li><strong>out</strong>: outbound.</li>
         * </ul>
         * <blockquote>
         * <p>If you do not configure this parameter in Settings, traffic in all directions is queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>The end time of the query. The value is a UNIX timestamp. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1729042555</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong>: TCP protocol.</li>
         * <li><strong>udp</strong>: UDP protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        public Builder IPProtocol(String IPProtocol) {
            this.putQueryParameter("IPProtocol", IPProtocol);
            this.IPProtocol = IPProtocol;
            return this;
        }

        /**
         * <p>The language type. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
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
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li><strong>asc</strong>: ascending order.</li>
         * <li><strong>desc</strong> (default): descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The number of entries per page in a paged query.</p>
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
         * <p>The source IP address of the peer.</p>
         * 
         * <strong>example:</strong>
         * <p>10.125.1.XX</p>
         */
        public Builder peerAssetIP(String peerAssetIP) {
            this.putQueryParameter("PeerAssetIP", peerAssetIP);
            this.peerAssetIP = peerAssetIP;
            return this;
        }

        /**
         * <p>The instance ID of the peer asset.</p>
         * 
         * <strong>example:</strong>
         * <p>i-123451</p>
         */
        public Builder peerAssetInstanceId(String peerAssetInstanceId) {
            this.putQueryParameter("PeerAssetInstanceId", peerAssetInstanceId);
            this.peerAssetInstanceId = peerAssetInstanceId;
            return this;
        }

        /**
         * <p>The instance name of the peer asset.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs22</p>
         */
        public Builder peerAssetInstanceName(String peerAssetInstanceName) {
            this.putQueryParameter("PeerAssetInstanceName", peerAssetInstanceName);
            this.peerAssetInstanceName = peerAssetInstanceName;
            return this;
        }

        /**
         * <p>The instance ID of the peer VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-90rq0anm6t8vbwbo****</p>
         */
        public Builder peerVpcId(String peerVpcId) {
            this.putQueryParameter("PeerVpcId", peerVpcId);
            this.peerVpcId = peerVpcId;
            return this;
        }

        /**
         * <p>The port number. You must specify at least one of AssetIP and Port. If both are left empty, the API returns a 400 error.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The risk assessment level.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder riskLevel(String riskLevel) {
            this.putQueryParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * <p>The sort field. Valid values:</p>
         * <ul>
         * <li><p><strong>InBytes</strong></p>
         * </li>
         * <li><p><strong>OutBytes</strong></p>
         * </li>
         * <li><p><strong>TotalBytes</strong></p>
         * </li>
         * <li><p><strong>InPackets</strong></p>
         * </li>
         * <li><p><strong>OutPackets</strong></p>
         * </li>
         * <li><p><strong>SessionCount</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InBytes</p>
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * <p>The start time of the query. The value is a UNIX timestamp. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1655778046</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The VPC-connected instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze4xj5kmb5udb****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public DescribeVpcFirewallAccessDetailRequest build() {
            return new DescribeVpcFirewallAccessDetailRequest(this);
        } 

    } 

}
