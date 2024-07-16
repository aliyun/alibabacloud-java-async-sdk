// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCardsRequest} extends {@link RequestModel}
 *
 * <p>ListCardsRequest</p>
 */
public class ListCardsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Apn")
    private String apn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Iccid")
    private String iccid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Iccids")
    private java.util.List < String > iccids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpAddress")
    private String ipAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lock")
    private Boolean lock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Msisdn")
    private String msisdn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetLinkId")
    private String netLinkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Online")
    private Boolean online;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Statuses")
    private java.util.List < String > statuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WirelessCloudConnectorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wirelessCloudConnectorId;

    private ListCardsRequest(Builder builder) {
        super(builder);
        this.apn = builder.apn;
        this.iccid = builder.iccid;
        this.iccids = builder.iccids;
        this.ipAddress = builder.ipAddress;
        this.lock = builder.lock;
        this.maxResults = builder.maxResults;
        this.msisdn = builder.msisdn;
        this.netLinkId = builder.netLinkId;
        this.nextToken = builder.nextToken;
        this.online = builder.online;
        this.statuses = builder.statuses;
        this.wirelessCloudConnectorId = builder.wirelessCloudConnectorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCardsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apn
     */
    public String getApn() {
        return this.apn;
    }

    /**
     * @return iccid
     */
    public String getIccid() {
        return this.iccid;
    }

    /**
     * @return iccids
     */
    public java.util.List < String > getIccids() {
        return this.iccids;
    }

    /**
     * @return ipAddress
     */
    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * @return lock
     */
    public Boolean getLock() {
        return this.lock;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return msisdn
     */
    public String getMsisdn() {
        return this.msisdn;
    }

    /**
     * @return netLinkId
     */
    public String getNetLinkId() {
        return this.netLinkId;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return online
     */
    public Boolean getOnline() {
        return this.online;
    }

    /**
     * @return statuses
     */
    public java.util.List < String > getStatuses() {
        return this.statuses;
    }

    /**
     * @return wirelessCloudConnectorId
     */
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

    public static final class Builder extends Request.Builder<ListCardsRequest, Builder> {
        private String apn; 
        private String iccid; 
        private java.util.List < String > iccids; 
        private String ipAddress; 
        private Boolean lock; 
        private Long maxResults; 
        private String msisdn; 
        private String netLinkId; 
        private String nextToken; 
        private Boolean online; 
        private java.util.List < String > statuses; 
        private String wirelessCloudConnectorId; 

        private Builder() {
            super();
        } 

        private Builder(ListCardsRequest request) {
            super(request);
            this.apn = request.apn;
            this.iccid = request.iccid;
            this.iccids = request.iccids;
            this.ipAddress = request.ipAddress;
            this.lock = request.lock;
            this.maxResults = request.maxResults;
            this.msisdn = request.msisdn;
            this.netLinkId = request.netLinkId;
            this.nextToken = request.nextToken;
            this.online = request.online;
            this.statuses = request.statuses;
            this.wirelessCloudConnectorId = request.wirelessCloudConnectorId;
        } 

        /**
         * Apn.
         */
        public Builder apn(String apn) {
            this.putQueryParameter("Apn", apn);
            this.apn = apn;
            return this;
        }

        /**
         * Iccid.
         */
        public Builder iccid(String iccid) {
            this.putQueryParameter("Iccid", iccid);
            this.iccid = iccid;
            return this;
        }

        /**
         * Iccids.
         */
        public Builder iccids(java.util.List < String > iccids) {
            this.putQueryParameter("Iccids", iccids);
            this.iccids = iccids;
            return this;
        }

        /**
         * IpAddress.
         */
        public Builder ipAddress(String ipAddress) {
            this.putQueryParameter("IpAddress", ipAddress);
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * Lock.
         */
        public Builder lock(Boolean lock) {
            this.putQueryParameter("Lock", lock);
            this.lock = lock;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Msisdn.
         */
        public Builder msisdn(String msisdn) {
            this.putQueryParameter("Msisdn", msisdn);
            this.msisdn = msisdn;
            return this;
        }

        /**
         * NetLinkId.
         */
        public Builder netLinkId(String netLinkId) {
            this.putQueryParameter("NetLinkId", netLinkId);
            this.netLinkId = netLinkId;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Online.
         */
        public Builder online(Boolean online) {
            this.putQueryParameter("Online", online);
            this.online = online;
            return this;
        }

        /**
         * Statuses.
         */
        public Builder statuses(java.util.List < String > statuses) {
            this.putQueryParameter("Statuses", statuses);
            this.statuses = statuses;
            return this;
        }

        /**
         * WirelessCloudConnectorId.
         */
        public Builder wirelessCloudConnectorId(String wirelessCloudConnectorId) {
            this.putQueryParameter("WirelessCloudConnectorId", wirelessCloudConnectorId);
            this.wirelessCloudConnectorId = wirelessCloudConnectorId;
            return this;
        }

        @Override
        public ListCardsRequest build() {
            return new ListCardsRequest(this);
        } 

    } 

}
