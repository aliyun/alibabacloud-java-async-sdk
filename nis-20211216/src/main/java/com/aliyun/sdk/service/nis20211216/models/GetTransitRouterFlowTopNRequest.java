// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTransitRouterFlowTopNRequest} extends {@link RequestModel}
 *
 * <p>GetTransitRouterFlowTopNRequest</p>
 */
public class GetTransitRouterFlowTopNRequest extends Request {
    @Query
    @NameInMap("AccountIds")
    private java.util.List < String > accountIds;

    @Query
    @NameInMap("BandwithPackageId")
    private String bandwithPackageId;

    @Query
    @NameInMap("BeginTime")
    @Validation(required = true)
    private Long beginTime;

    @Query
    @NameInMap("CenId")
    private String cenId;

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
    @NameInMap("OtherRegion")
    private String otherRegion;

    @Query
    @NameInMap("Protocol")
    private String protocol;

    @Query
    @NameInMap("Sort")
    private String sort;

    @Query
    @NameInMap("ThisIp")
    private String thisIp;

    @Query
    @NameInMap("ThisPort")
    private String thisPort;

    @Query
    @NameInMap("ThisRegion")
    private String thisRegion;

    @Query
    @NameInMap("TopN")
    @Validation(maximum = 100, minimum = 1)
    private Integer topN;

    @Query
    @NameInMap("UseMultiAccount")
    private Boolean useMultiAccount;

    private GetTransitRouterFlowTopNRequest(Builder builder) {
        super(builder);
        this.accountIds = builder.accountIds;
        this.bandwithPackageId = builder.bandwithPackageId;
        this.beginTime = builder.beginTime;
        this.cenId = builder.cenId;
        this.direction = builder.direction;
        this.endTime = builder.endTime;
        this.groupBy = builder.groupBy;
        this.orderBy = builder.orderBy;
        this.otherIp = builder.otherIp;
        this.otherPort = builder.otherPort;
        this.otherRegion = builder.otherRegion;
        this.protocol = builder.protocol;
        this.sort = builder.sort;
        this.thisIp = builder.thisIp;
        this.thisPort = builder.thisPort;
        this.thisRegion = builder.thisRegion;
        this.topN = builder.topN;
        this.useMultiAccount = builder.useMultiAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTransitRouterFlowTopNRequest create() {
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
     * @return bandwithPackageId
     */
    public String getBandwithPackageId() {
        return this.bandwithPackageId;
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
     * @return otherRegion
     */
    public String getOtherRegion() {
        return this.otherRegion;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return thisIp
     */
    public String getThisIp() {
        return this.thisIp;
    }

    /**
     * @return thisPort
     */
    public String getThisPort() {
        return this.thisPort;
    }

    /**
     * @return thisRegion
     */
    public String getThisRegion() {
        return this.thisRegion;
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

    public static final class Builder extends Request.Builder<GetTransitRouterFlowTopNRequest, Builder> {
        private java.util.List < String > accountIds; 
        private String bandwithPackageId; 
        private Long beginTime; 
        private String cenId; 
        private String direction; 
        private Long endTime; 
        private String groupBy; 
        private String orderBy; 
        private String otherIp; 
        private String otherPort; 
        private String otherRegion; 
        private String protocol; 
        private String sort; 
        private String thisIp; 
        private String thisPort; 
        private String thisRegion; 
        private Integer topN; 
        private Boolean useMultiAccount; 

        private Builder() {
            super();
        } 

        private Builder(GetTransitRouterFlowTopNRequest request) {
            super(request);
            this.accountIds = request.accountIds;
            this.bandwithPackageId = request.bandwithPackageId;
            this.beginTime = request.beginTime;
            this.cenId = request.cenId;
            this.direction = request.direction;
            this.endTime = request.endTime;
            this.groupBy = request.groupBy;
            this.orderBy = request.orderBy;
            this.otherIp = request.otherIp;
            this.otherPort = request.otherPort;
            this.otherRegion = request.otherRegion;
            this.protocol = request.protocol;
            this.sort = request.sort;
            this.thisIp = request.thisIp;
            this.thisPort = request.thisPort;
            this.thisRegion = request.thisRegion;
            this.topN = request.topN;
            this.useMultiAccount = request.useMultiAccount;
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
         * BandwithPackageId.
         */
        public Builder bandwithPackageId(String bandwithPackageId) {
            this.putQueryParameter("BandwithPackageId", bandwithPackageId);
            this.bandwithPackageId = bandwithPackageId;
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
         * OtherRegion.
         */
        public Builder otherRegion(String otherRegion) {
            this.putQueryParameter("OtherRegion", otherRegion);
            this.otherRegion = otherRegion;
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
         * Sort.
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * ThisIp.
         */
        public Builder thisIp(String thisIp) {
            this.putQueryParameter("ThisIp", thisIp);
            this.thisIp = thisIp;
            return this;
        }

        /**
         * ThisPort.
         */
        public Builder thisPort(String thisPort) {
            this.putQueryParameter("ThisPort", thisPort);
            this.thisPort = thisPort;
            return this;
        }

        /**
         * ThisRegion.
         */
        public Builder thisRegion(String thisRegion) {
            this.putQueryParameter("ThisRegion", thisRegion);
            this.thisRegion = thisRegion;
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

        @Override
        public GetTransitRouterFlowTopNRequest build() {
            return new GetTransitRouterFlowTopNRequest(this);
        } 

    } 

}
