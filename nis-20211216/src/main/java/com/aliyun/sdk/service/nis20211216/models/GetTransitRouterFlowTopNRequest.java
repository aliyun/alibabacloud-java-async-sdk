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
 * {@link GetTransitRouterFlowTopNRequest} extends {@link RequestModel}
 *
 * <p>GetTransitRouterFlowTopNRequest</p>
 */
public class GetTransitRouterFlowTopNRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountIds")
    private java.util.List<Long> accountIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BandwithPackageId")
    private String bandwithPackageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

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
    @com.aliyun.core.annotation.NameInMap("OtherRegion")
    private String otherRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThisIp")
    private String thisIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThisPort")
    private String thisPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThisRegion")
    private String thisRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopN")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer topN;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseMultiAccount")
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
    public java.util.List<Long> getAccountIds() {
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
        private java.util.List<Long> accountIds; 
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
         * <p>The IDs of the member accounts.</p>
         */
        public Builder accountIds(java.util.List<Long> accountIds) {
            String accountIdsShrink = shrink(accountIds, "AccountIds", "json");
            this.putQueryParameter("AccountIds", accountIdsShrink);
            this.accountIds = accountIds;
            return this;
        }

        /**
         * <p>The ID of the CEN bandwidth plan.</p>
         * 
         * <strong>example:</strong>
         * <p>cenbwp-ia8kw1zjv4hyal*****</p>
         */
        public Builder bandwithPackageId(String bandwithPackageId) {
            this.putQueryParameter("BandwithPackageId", bandwithPackageId);
            this.bandwithPackageId = bandwithPackageId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. The maximum time range that you can query is 24 hours.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1684373600099</p>
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
         * <p>The direction of the inter-region traffic in the local regions or for the local IP addresses. Valid values:</p>
         * <ul>
         * <li><strong>in</strong>: inbound traffic</li>
         * <li><strong>out</strong>: outbound traffic</li>
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
         * <p>The dimension for ranking inter-region traffic data. The value of this parameter is case-sensitive. Valid values:</p>
         * <ul>
         * <li><strong>1Tuple</strong>: queries the rankings of inter-region traffic data for the local regions, Cloud Enterprise Network (CEN) instances, and IP addresses.</li>
         * <li><strong>2Tuple</strong>: queries the rankings of inter-region traffic data for the local and remote regions, and the local and remote IP addresses.</li>
         * <li><strong>5Tuple</strong>: queries the rankings of inter-region traffic data for the local and remote IP addresses, local and remote ports, and protocols.</li>
         * <li><strong>Cen</strong>: queries the rankings of inter-region traffic data for CEN instances.</li>
         * <li><strong>RegionPair</strong>: queries the rankings of inter-region traffic data for the local and remote regions.</li>
         * <li><strong>Port</strong>: queries the rankings of inter-region traffic data for the local and remote ports.</li>
         * <li><strong>Protocol</strong>: queries the rankings of inter-region traffic data for the protocols.</li>
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
         * <p>The metric for ranking inter-region traffic data. Default value: Bytes. This value specifies that inter-region traffic data is ranked by traffic volume.</p>
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
         * 
         * <strong>example:</strong>
         * <p>10869</p>
         */
        public Builder otherPort(String otherPort) {
            this.putQueryParameter("OtherPort", otherPort);
            this.otherPort = otherPort;
            return this;
        }

        /**
         * <p>The remote region.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-1</p>
         */
        public Builder otherRegion(String otherRegion) {
            this.putQueryParameter("OtherRegion", otherRegion);
            this.otherRegion = otherRegion;
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
         * <p>The order for ranking inter-region traffic data. Valid values:</p>
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
         * <p>The local IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>1.8.XX.XX</p>
         */
        public Builder thisIp(String thisIp) {
            this.putQueryParameter("ThisIp", thisIp);
            this.thisIp = thisIp;
            return this;
        }

        /**
         * <p>The local port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder thisPort(String thisPort) {
            this.putQueryParameter("ThisPort", thisPort);
            this.thisPort = thisPort;
            return this;
        }

        /**
         * <p>The local region where the <strong>local IP address</strong> resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder thisRegion(String thisRegion) {
            this.putQueryParameter("ThisRegion", thisRegion);
            this.thisRegion = thisRegion;
            return this;
        }

        /**
         * <p>Specifies the maximum number of data entries to display. Default value: <strong>10</strong>. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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

        @Override
        public GetTransitRouterFlowTopNRequest build() {
            return new GetTransitRouterFlowTopNRequest(this);
        } 

    } 

}
