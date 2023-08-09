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
    private java.util.List < String > accountIds;

    @Query
    @NameInMap("BeginTime")
    @Validation(required = true)
    private Long beginTime;

    @Query
    @NameInMap("CloudIp")
    private String cloudIp;

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
    public java.util.List < String > getAccountIds() {
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
        private java.util.List < String > accountIds; 
        private Long beginTime; 
        private String cloudIp; 
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
         * AccountIds.
         */
        public Builder accountIds(java.util.List < String > accountIds) {
            this.putQueryParameter("AccountIds", accountIds);
            this.accountIds = accountIds;
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
         * CloudIp.
         */
        public Builder cloudIp(String cloudIp) {
            this.putQueryParameter("CloudIp", cloudIp);
            this.cloudIp = cloudIp;
            return this;
        }

        /**
         * CloudIsp.
         */
        public Builder cloudIsp(String cloudIsp) {
            this.putQueryParameter("CloudIsp", cloudIsp);
            this.cloudIsp = cloudIsp;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceList.
         */
        public Builder instanceList(java.util.List < String > instanceList) {
            String instanceListShrink = shrink(instanceList, "InstanceList", "json");
            this.putQueryParameter("InstanceList", instanceListShrink);
            this.instanceList = instanceList;
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
         * OtherCity.
         */
        public Builder otherCity(String otherCity) {
            this.putQueryParameter("OtherCity", otherCity);
            this.otherCity = otherCity;
            return this;
        }

        /**
         * OtherCountry.
         */
        public Builder otherCountry(String otherCountry) {
            this.putQueryParameter("OtherCountry", otherCountry);
            this.otherCountry = otherCountry;
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
         * OtherIsp.
         */
        public Builder otherIsp(String otherIsp) {
            this.putQueryParameter("OtherIsp", otherIsp);
            this.otherIsp = otherIsp;
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
         * TupleType.
         */
        public Builder tupleType(Integer tupleType) {
            this.putQueryParameter("TupleType", tupleType);
            this.tupleType = tupleType;
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
        public GetInternetTupleRequest build() {
            return new GetInternetTupleRequest(this);
        } 

    } 

}
