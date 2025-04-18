// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

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
 * {@link GetVbrFlowTopNRequest} extends {@link RequestModel}
 *
 * <p>GetVbrFlowTopNRequest</p>
 */
public class GetVbrFlowTopNRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountIds")
    private java.util.List<Long> accountIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttachmentId")
    private String attachmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudIp")
    private String cloudIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudPort")
    private String cloudPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupBy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OtherIp")
    private String otherIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OtherPort")
    private String otherPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopN")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer topN;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseMultiAccount")
    private Boolean useMultiAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualBorderRouterId")
    private String virtualBorderRouterId;

    private GetVbrFlowTopNRequest(Builder builder) {
        super(builder);
        this.accountIds = builder.accountIds;
        this.attachmentId = builder.attachmentId;
        this.beginTime = builder.beginTime;
        this.cenId = builder.cenId;
        this.cloudIp = builder.cloudIp;
        this.cloudPort = builder.cloudPort;
        this.direction = builder.direction;
        this.endTime = builder.endTime;
        this.groupBy = builder.groupBy;
        this.orderBy = builder.orderBy;
        this.otherIp = builder.otherIp;
        this.otherPort = builder.otherPort;
        this.protocol = builder.protocol;
        this.regionId = builder.regionId;
        this.sort = builder.sort;
        this.topN = builder.topN;
        this.useMultiAccount = builder.useMultiAccount;
        this.virtualBorderRouterId = builder.virtualBorderRouterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVbrFlowTopNRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountIds
     */
    public java.util.List<Long> getAccountIds() {
        return this.accountIds;
    }

    /**
     * @return attachmentId
     */
    public String getAttachmentId() {
        return this.attachmentId;
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return cloudIp
     */
    public String getCloudIp() {
        return this.cloudIp;
    }

    /**
     * @return cloudPort
     */
    public String getCloudPort() {
        return this.cloudPort;
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
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return groupBy
     */
    public String getGroupBy() {
        return this.groupBy;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return otherIp
     */
    public String getOtherIp() {
        return this.otherIp;
    }

    /**
     * @return otherPort
     */
    public String getOtherPort() {
        return this.otherPort;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return topN
     */
    public Integer getTopN() {
        return this.topN;
    }

    /**
     * @return useMultiAccount
     */
    public Boolean getUseMultiAccount() {
        return this.useMultiAccount;
    }

    /**
     * @return virtualBorderRouterId
     */
    public String getVirtualBorderRouterId() {
        return this.virtualBorderRouterId;
    }

    public static final class Builder extends Request.Builder<GetVbrFlowTopNRequest, Builder> {
        private java.util.List<Long> accountIds; 
        private String attachmentId; 
        private Long beginTime; 
        private String cenId; 
        private String cloudIp; 
        private String cloudPort; 
        private String direction; 
        private Long endTime; 
        private String groupBy; 
        private String orderBy; 
        private String otherIp; 
        private String otherPort; 
        private String protocol; 
        private String regionId; 
        private String sort; 
        private Integer topN; 
        private Boolean useMultiAccount; 
        private String virtualBorderRouterId; 

        private Builder() {
            super();
        } 

        private Builder(GetVbrFlowTopNRequest request) {
            super(request);
            this.accountIds = request.accountIds;
            this.attachmentId = request.attachmentId;
            this.beginTime = request.beginTime;
            this.cenId = request.cenId;
            this.cloudIp = request.cloudIp;
            this.cloudPort = request.cloudPort;
            this.direction = request.direction;
            this.endTime = request.endTime;
            this.groupBy = request.groupBy;
            this.orderBy = request.orderBy;
            this.otherIp = request.otherIp;
            this.otherPort = request.otherPort;
            this.protocol = request.protocol;
            this.regionId = request.regionId;
            this.sort = request.sort;
            this.topN = request.topN;
            this.useMultiAccount = request.useMultiAccount;
            this.virtualBorderRouterId = request.virtualBorderRouterId;
        } 

        /**
         * <p>The IDs of member accounts.</p>
         */
        public Builder accountIds(java.util.List<Long> accountIds) {
            String accountIdsShrink = shrink(accountIds, "AccountIds", "json");
            this.putQueryParameter("AccountIds", accountIdsShrink);
            this.accountIds = accountIds;
            return this;
        }

        /**
         * <p>The CEN connection ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-dnv870gmqzmb5u****</p>
         */
        public Builder attachmentId(String attachmentId) {
            this.putQueryParameter("AttachmentId", attachmentId);
            this.attachmentId = attachmentId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. The maximum time range that you can query is 24 hours.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1638239092000</p>
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>The CEN instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-ia8kw1zjv4hyal****</p>
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The local IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>112.74.XX.XX</p>
         */
        public Builder cloudIp(String cloudIp) {
            this.putQueryParameter("CloudIp", cloudIp);
            this.cloudIp = cloudIp;
            return this;
        }

        /**
         * <p>The local port.</p>
         * <blockquote>
         * <p> This parameter is required only if you set <strong>GroupBy</strong> to <strong>CloudPort</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        public Builder cloudPort(String cloudPort) {
            this.putQueryParameter("CloudPort", cloudPort);
            this.cloudPort = cloudPort;
            return this;
        }

        /**
         * <p>The direction of the hybrid cloud traffic in the local regions or for the local IP addresses. Valid values:</p>
         * <ul>
         * <li><strong>in</strong>: traffic from a data center to Alibaba Cloud</li>
         * <li><strong>out</strong>: traffic from Alibaba Cloud to a data center</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The end of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. The maximum time range that you can query is 24 hours.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1638239093000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The dimension for ranking hybrid cloud traffic data. The value of this parameter is case-sensitive. Valid values:</p>
         * <ul>
         * <li><strong>1Tuple</strong>: queries the rankings of hybrid cloud traffic data for the Cloud Enterprise Network (CEN) instances, CEN connections, virtual border routers (VBRs), and IP addresses.</li>
         * <li><strong>2Tuple</strong>: queries the rankings of hybrid cloud traffic data for the local and remote IP addresses.</li>
         * <li><strong>5Tuple</strong>: queries the rankings of hybrid cloud traffic data for the local and remote IP addresses, local and remote ports, and protocols.</li>
         * <li><strong>CloudPort</strong>: queries the rankings of hybrid cloud traffic data for the local ports.</li>
         * <li><strong>OtherPort</strong>: queries the rankings of hybrid cloud traffic data for the remote ports.</li>
         * <li><strong>Protocol</strong>: queries the rankings of hybrid cloud traffic data for the protocols.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1Tuple</p>
         */
        public Builder groupBy(String groupBy) {
            this.putQueryParameter("GroupBy", groupBy);
            this.groupBy = groupBy;
            return this;
        }

        /**
         * <p>The metric for ranking hybrid cloud traffic data. Default value: Bytes. This value specifies that hybrid cloud traffic data is ranked by traffic volumes.</p>
         * 
         * <strong>example:</strong>
         * <p>Bytes</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The remote IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>122.112.XX.XX</p>
         */
        public Builder otherIp(String otherIp) {
            this.putQueryParameter("OtherIp", otherIp);
            this.otherIp = otherIp;
            return this;
        }

        /**
         * <p>The remote port.</p>
         * <blockquote>
         * <p> This parameter is required only if you set <strong>GroupBy</strong> to <strong>OtherPort</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>40002</p>
         */
        public Builder otherPort(String otherPort) {
            this.putQueryParameter("OtherPort", otherPort);
            this.otherPort = otherPort;
            return this;
        }

        /**
         * <p>The protocol number.</p>
         * <blockquote>
         * <p> All protocols are supported. This parameter is required only if you set <strong>GroupBy</strong> to <strong>5Tuple</strong> or <strong>Protocol</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The local region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The order for ranking hybrid cloud traffic data. Valid values:</p>
         * <ul>
         * <li><strong>desc</strong>: descending order</li>
         * <li><strong>asc</strong>: ascending order</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * <p>Specifies top-N traffic data to display. Default value: <strong>10</strong>. This value specifies that top-10 traffic data is displayed by default. Maximum value: <strong>100</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder topN(Integer topN) {
            this.putQueryParameter("TopN", topN);
            this.topN = topN;
            return this;
        }

        /**
         * <p>Specifies whether to enable the multi-account management feature. Default value: <strong>false</strong>. This value specifies that the multi-account management feature is disabled.</p>
         * <blockquote>
         * <p> By default, the multi-account management feature is not available. If you want to use this feature, contact your account manager to apply for permissions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder useMultiAccount(Boolean useMultiAccount) {
            this.putQueryParameter("UseMultiAccount", useMultiAccount);
            this.useMultiAccount = useMultiAccount;
            return this;
        }

        /**
         * <p>The ID of the VBR that is associated with the Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-k1atj46citwuek42j****</p>
         */
        public Builder virtualBorderRouterId(String virtualBorderRouterId) {
            this.putQueryParameter("VirtualBorderRouterId", virtualBorderRouterId);
            this.virtualBorderRouterId = virtualBorderRouterId;
            return this;
        }

        @Override
        public GetVbrFlowTopNRequest build() {
            return new GetVbrFlowTopNRequest(this);
        } 

    } 

}
