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
         * AccountIds.
         */
        public Builder accountIds(java.util.List < String > accountIds) {
            String accountIdsShrink = shrink(accountIds, "AccountIds", "json");
            this.putQueryParameter("AccountIds", accountIdsShrink);
            this.accountIds = accountIds;
            return this;
        }

        /**
         * AttachmentId.
         */
        public Builder attachmentId(String attachmentId) {
            this.putQueryParameter("AttachmentId", attachmentId);
            this.attachmentId = attachmentId;
            return this;
        }

        /**
         * BeginTime.
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * CenId.
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * CloudIp.
         */
        public Builder cloudIp(String cloudIp) {
            this.putQueryParameter("CloudIp", cloudIp);
            this.cloudIp = cloudIp;
            return this;
        }

        /**
         * CloudPort.
         */
        public Builder cloudPort(String cloudPort) {
            this.putQueryParameter("CloudPort", cloudPort);
            this.cloudPort = cloudPort;
            return this;
        }

        /**
         * Direction.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * GroupBy.
         */
        public Builder groupBy(String groupBy) {
            this.putQueryParameter("GroupBy", groupBy);
            this.groupBy = groupBy;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * OtherIp.
         */
        public Builder otherIp(String otherIp) {
            this.putQueryParameter("OtherIp", otherIp);
            this.otherIp = otherIp;
            return this;
        }

        /**
         * OtherPort.
         */
        public Builder otherPort(String otherPort) {
            this.putQueryParameter("OtherPort", otherPort);
            this.otherPort = otherPort;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Sort.
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * TopN.
         */
        public Builder topN(Integer topN) {
            this.putQueryParameter("TopN", topN);
            this.topN = topN;
            return this;
        }

        /**
         * UseMultiAccount.
         */
        public Builder useMultiAccount(Boolean useMultiAccount) {
            this.putQueryParameter("UseMultiAccount", useMultiAccount);
            this.useMultiAccount = useMultiAccount;
            return this;
        }

        /**
         * VirtualBorderRouterId.
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
