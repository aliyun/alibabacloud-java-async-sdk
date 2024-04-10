// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInternetTupleRequest} extends {@link RequestModel}
 *
 * <p>GetInternetTupleRequest</p>
 */
public class GetInternetTupleRequest extends Request {
    @Query
    @NameInMap("AccountIds")
    private java.util.List < Long > accountIds;

    @Query
    @NameInMap("BeginTime")
    @Validation(required = true)
    private Long beginTime;

    @Query
    @NameInMap("CloudIp")
    private String cloudIp;

    @Query
    @NameInMap("CloudIpList")
    private java.util.List < String > cloudIpList;

    @Query
    @NameInMap("CloudIsp")
    private String cloudIsp;

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
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("InstanceList")
    private java.util.List < String > instanceList;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("OtherCity")
    private String otherCity;

    @Query
    @NameInMap("OtherCountry")
    private String otherCountry;

    @Query
    @NameInMap("OtherIp")
    private String otherIp;

    @Query
    @NameInMap("OtherIsp")
    private String otherIsp;

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
    private Integer topN;

    @Query
    @NameInMap("TupleType")
    @Validation(required = true)
    private Integer tupleType;

    @Query
    @NameInMap("UseMultiAccount")
    private Boolean useMultiAccount;

    private GetInternetTupleRequest(Builder builder) {
        super(builder);
        this.accountIds = builder.accountIds;
        this.beginTime = builder.beginTime;
        this.cloudIp = builder.cloudIp;
        this.cloudIpList = builder.cloudIpList;
        this.cloudIsp = builder.cloudIsp;
        this.cloudPort = builder.cloudPort;
        this.direction = builder.direction;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.instanceList = builder.instanceList;
        this.orderBy = builder.orderBy;
        this.otherCity = builder.otherCity;
        this.otherCountry = builder.otherCountry;
        this.otherIp = builder.otherIp;
        this.otherIsp = builder.otherIsp;
        this.otherPort = builder.otherPort;
        this.protocol = builder.protocol;
        this.regionId = builder.regionId;
        this.sort = builder.sort;
        this.topN = builder.topN;
        this.tupleType = builder.tupleType;
        this.useMultiAccount = builder.useMultiAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInternetTupleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountIds
     */
    public java.util.List < Long > getAccountIds() {
        return this.accountIds;
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return cloudIp
     */
    public String getCloudIp() {
        return this.cloudIp;
    }

    /**
     * @return cloudIpList
     */
    public java.util.List < String > getCloudIpList() {
        return this.cloudIpList;
    }

    /**
     * @return cloudIsp
     */
    public String getCloudIsp() {
        return this.cloudIsp;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceList
     */
    public java.util.List < String > getInstanceList() {
        return this.instanceList;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return otherCity
     */
    public String getOtherCity() {
        return this.otherCity;
    }

    /**
     * @return otherCountry
     */
    public String getOtherCountry() {
        return this.otherCountry;
    }

    /**
     * @return otherIp
     */
    public String getOtherIp() {
        return this.otherIp;
    }

    /**
     * @return otherIsp
     */
    public String getOtherIsp() {
        return this.otherIsp;
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
     * @return tupleType
     */
    public Integer getTupleType() {
        return this.tupleType;
    }

    /**
     * @return useMultiAccount
     */
    public Boolean getUseMultiAccount() {
        return this.useMultiAccount;
    }

    public static final class Builder extends Request.Builder<GetInternetTupleRequest, Builder> {
        private java.util.List < Long > accountIds; 
        private Long beginTime; 
        private String cloudIp; 
        private java.util.List < String > cloudIpList; 
        private String cloudIsp; 
        private String cloudPort; 
        private String direction; 
        private Long endTime; 
        private String instanceId; 
        private java.util.List < String > instanceList; 
        private String orderBy; 
        private String otherCity; 
        private String otherCountry; 
        private String otherIp; 
        private String otherIsp; 
        private String otherPort; 
        private String protocol; 
        private String regionId; 
        private String sort; 
        private Integer topN; 
        private Integer tupleType; 
        private Boolean useMultiAccount; 

        private Builder() {
            super();
        } 

        private Builder(GetInternetTupleRequest request) {
            super(request);
            this.accountIds = request.accountIds;
            this.beginTime = request.beginTime;
            this.cloudIp = request.cloudIp;
            this.cloudIpList = request.cloudIpList;
            this.cloudIsp = request.cloudIsp;
            this.cloudPort = request.cloudPort;
            this.direction = request.direction;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.instanceList = request.instanceList;
            this.orderBy = request.orderBy;
            this.otherCity = request.otherCity;
            this.otherCountry = request.otherCountry;
            this.otherIp = request.otherIp;
            this.otherIsp = request.otherIsp;
            this.otherPort = request.otherPort;
            this.protocol = request.protocol;
            this.regionId = request.regionId;
            this.sort = request.sort;
            this.topN = request.topN;
            this.tupleType = request.tupleType;
            this.useMultiAccount = request.useMultiAccount;
        } 

        /**
         * The IDs of member accounts.
         */
        public Builder accountIds(java.util.List < Long > accountIds) {
            this.putQueryParameter("AccountIds", accountIds);
            this.accountIds = accountIds;
            return this;
        }

        /**
         * The beginning of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
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
         * The local IP addresses for filtering.
         */
        public Builder cloudIpList(java.util.List < String > cloudIpList) {
            String cloudIpListShrink = shrink(cloudIpList, "CloudIpList", "json");
            this.putQueryParameter("CloudIpList", cloudIpListShrink);
            this.cloudIpList = cloudIpList;
            return this;
        }

        /**
         * The local Internet service provider (ISP).
         * <p>
         * 
         * >  In most cases, the value is Alibaba or Alibaba Cloud.
         */
        public Builder cloudIsp(String cloudIsp) {
            this.putQueryParameter("CloudIsp", cloudIsp);
            this.cloudIsp = cloudIsp;
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
         * The direction of the Internet traffic that you want to query. Valid values:
         * <p>
         * 
         * *   **in**: inbound
         * *   **out**: outbound
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * The end of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The instance IDs for filtering.
         */
        public Builder instanceList(java.util.List < String > instanceList) {
            String instanceListShrink = shrink(instanceList, "InstanceList", "json");
            this.putQueryParameter("InstanceList", instanceListShrink);
            this.instanceList = instanceList;
            return this;
        }

        /**
         * The metric for data ranking. Default value: **ByteCount**. This value indicates that Internet traffic data is ranked by traffic volume.
         * <p>
         * 
         * Valid values:
         * 
         * *   Rtt
         * *   ByteCount
         * *   PacketCount
         * *   InByteCount
         * *   OutByteCount
         * *   InPacketCount
         * *   OutPacketCount
         * *   InRetranCount
         * *   OutRetranCount
         * *   InDupAckCount
         * *   OutDupAckCount
         * *   InOutOrderCount
         * *   OutOutOrderCount
         * *   RetranCount
         * *   OutOrderCount
         * *   DupAckCount
         * *   RetransmitRate
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * The remote city.
         * <p>
         * 
         * >  This parameter is required only if you set **TupleType** to **2** or **5**.
         */
        public Builder otherCity(String otherCity) {
            this.putQueryParameter("OtherCity", otherCity);
            this.otherCity = otherCity;
            return this;
        }

        /**
         * The remote country.
         * <p>
         * 
         * >  This parameter is required only if you set **TupleType** to **2** or **5**.
         */
        public Builder otherCountry(String otherCountry) {
            this.putQueryParameter("OtherCountry", otherCountry);
            this.otherCountry = otherCountry;
            return this;
        }

        /**
         * The remote IP address.
         * <p>
         * 
         * > This parameter is required only when you set **TupleType** to **2** or **5**.
         */
        public Builder otherIp(String otherIp) {
            this.putQueryParameter("OtherIp", otherIp);
            this.otherIp = otherIp;
            return this;
        }

        /**
         * The remote ISP.
         * <p>
         * 
         * > This parameter is required if you want to view the information about the remote ISP.
         */
        public Builder otherIsp(String otherIsp) {
            this.putQueryParameter("OtherIsp", otherIsp);
            this.otherIsp = otherIsp;
            return this;
        }

        /**
         * The remote port.
         * <p>
         * 
         * > This parameter is required only when you set **TupleType** to **5**.
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
         * > All protocols are supported. This parameter is required only when you set **TupleType** to **5**.
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * The ID of the region for which you want to query the Internet traffic.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The order in which instances are ranked by Internet traffic. Valid values:
         * <p>
         * 
         * *   **desc**: the descending order
         * *   **asc**: the ascending order
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * Specifies top-N traffic data to display. Default value: **10**. This value specifies to display top-10 traffic data by default. Max value: **100**.
         */
        public Builder topN(Integer topN) {
            this.putQueryParameter("TopN", topN);
            this.topN = topN;
            return this;
        }

        /**
         * The type of the tuple. Valid values:
         * <p>
         * 
         * *   **1**: 1-tuple
         * *   **2**: 2-tuple
         * *   **5**: 5-tuple
         */
        public Builder tupleType(Integer tupleType) {
            this.putQueryParameter("TupleType", tupleType);
            this.tupleType = tupleType;
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

        @Override
        public GetInternetTupleRequest build() {
            return new GetInternetTupleRequest(this);
        } 

    } 

}
