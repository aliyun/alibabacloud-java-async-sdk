// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVbrFlowTopNRequest} extends {@link RequestModel}
 *
 * <p>GetVbrFlowTopNRequest</p>
 */
public class GetVbrFlowTopNRequest extends Request {
    @Query
    @NameInMap("AccountIds")
    private java.util.List < String > accountIds;

    @Query
    @NameInMap("AttachmentId")
    private String attachmentId;

    @Query
    @NameInMap("BeginTime")
    @Validation(required = true)
    private Long beginTime;

    @Query
    @NameInMap("CenId")
    private String cenId;

    @Query
    @NameInMap("CloudIp")
    private String cloudIp;

    @Query
    @NameInMap("CloudPort")
    private String cloudPort;

    @Query
    @NameInMap("Direction")
    @Validation(required = true)
    private String direction;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("GroupBy")
    @Validation(required = true)
    private String groupBy;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("OtherIp")
    private String otherIp;

    @Query
    @NameInMap("OtherPort")
    private String otherPort;

    @Query
    @NameInMap("Protocol")
    private String protocol;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Sort")
    private String sort;

    @Query
    @NameInMap("TopN")
    @Validation(maximum = 100, minimum = 1)
    private Integer topN;

    @Query
    @NameInMap("UseMultiAccount")
    private Boolean useMultiAccount;

    @Query
    @NameInMap("VirtualBorderRouterId")
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
    public java.util.List < String > getAccountIds() {
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
        private java.util.List < String > accountIds; 
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
         * The IDs of member accounts.
         */
        public Builder accountIds(java.util.List < String > accountIds) {
            String accountIdsShrink = shrink(accountIds, "AccountIds", "json");
            this.putQueryParameter("AccountIds", accountIdsShrink);
            this.accountIds = accountIds;
            return this;
        }

        /**
         * The CEN connection ID.
         */
        public Builder attachmentId(String attachmentId) {
            this.putQueryParameter("AttachmentId", attachmentId);
            this.attachmentId = attachmentId;
            return this;
        }

        /**
         * The beginning of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. The maximum time range that you can query is 24 hours.
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * The CEN instance ID.
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * The local IP address.
         */
        public Builder cloudIp(String cloudIp) {
            this.putQueryParameter("CloudIp", cloudIp);
            this.cloudIp = cloudIp;
            return this;
        }

        /**
         * The local port.
         * <p>
         * 
         * >  This parameter is required only if you set GroupBy to CloudPort.
         */
        public Builder cloudPort(String cloudPort) {
            this.putQueryParameter("CloudPort", cloudPort);
            this.cloudPort = cloudPort;
            return this;
        }

        /**
         * The direction of the hybrid cloud traffic in the local regions or for the local IP addresses. Valid values:
         * <p>
         * 
         * *   in: traffic from a data center to Alibaba Cloud
         * *   out: traffic from Alibaba Cloud to a data center
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * The end of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. The maximum time range that you can query is 24 hours.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The dimension for ranking hybrid cloud traffic data. The value of this parameter is case-sensitive. Valid values:
         * <p>
         * 
         * *   1Tuple: queries the rankings of hybrid cloud traffic data for the Cloud Enterprise Network (CEN) instances, CEN connections, virtual border routers (VBRs), and IP addresses.
         * *   2Tuple: queries the rankings of hybrid cloud traffic data for the local and remote IP addresses.
         * *   5Tuple: queries the rankings of hybrid cloud traffic data for the local and remote IP addresses, local and remote ports, and protocols.
         * *   CloudPort: queries the rankings of hybrid cloud traffic data for the local ports.
         * *   OtherPort: queries the rankings of hybrid cloud traffic data for the remote ports.
         * *   Protocol: queries the rankings of hybrid cloud traffic data for the protocols.
         */
        public Builder groupBy(String groupBy) {
            this.putQueryParameter("GroupBy", groupBy);
            this.groupBy = groupBy;
            return this;
        }

        /**
         * The metric for ranking hybrid cloud traffic data. Default value: Bytes. This value specifies that hybrid cloud traffic data is ranked by traffic volumes.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * The remote IP address.
         */
        public Builder otherIp(String otherIp) {
            this.putQueryParameter("OtherIp", otherIp);
            this.otherIp = otherIp;
            return this;
        }

        /**
         * The remote port.
         * <p>
         * 
         * >  This parameter is required only if you set GroupBy to OtherPort.
         */
        public Builder otherPort(String otherPort) {
            this.putQueryParameter("OtherPort", otherPort);
            this.otherPort = otherPort;
            return this;
        }

        /**
         * The protocol number.
         * <p>
         * 
         * >  All protocols are supported. This parameter is required only if you set GroupBy to 5Tuple or Protocol.
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * The local region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The order for ranking hybrid cloud traffic data. Valid values:
         * <p>
         * 
         * *   desc: descending order
         * *   asc: ascending order
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * Specifies top-N traffic data to display. Default value: **10**. This value specifies that top-10 traffic data is displayed by default. Maximum value: **100**.
         */
        public Builder topN(Integer topN) {
            this.putQueryParameter("TopN", topN);
            this.topN = topN;
            return this;
        }

        /**
         * Specifies whether to enable the multi-account management feature. Default value: **false**. This value specifies that the multi-account management feature is disabled.
         * <p>
         * 
         * >  By default, the multi-account management feature is not available. If you want to use this feature, contact your account manager to apply for permissions.
         */
        public Builder useMultiAccount(Boolean useMultiAccount) {
            this.putQueryParameter("UseMultiAccount", useMultiAccount);
            this.useMultiAccount = useMultiAccount;
            return this;
        }

        /**
         * The ID of the VBR that is associated with the Express Connect circuit.
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
