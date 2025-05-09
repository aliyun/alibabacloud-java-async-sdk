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
 * {@link GetInternetTupleRequest} extends {@link RequestModel}
 *
 * <p>GetInternetTupleRequest</p>
 */
public class GetInternetTupleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountIds")
    private java.util.List<Long> accountIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 253402271999000D)
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudIp")
    private String cloudIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudIpList")
    private java.util.List<String> cloudIpList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudIsp")
    private String cloudIsp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudPort")
    private String cloudPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 253402271999000D)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceList")
    private java.util.List<String> instanceList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OtherCity")
    private String otherCity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OtherCountry")
    private String otherCountry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OtherIp")
    private String otherIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OtherIsp")
    private String otherIsp;

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
    private Integer topN;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TupleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer tupleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseMultiAccount")
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
    public java.util.List<Long> getAccountIds() {
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
    public java.util.List<String> getCloudIpList() {
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
    public java.util.List<String> getInstanceList() {
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
        private java.util.List<Long> accountIds; 
        private Long beginTime; 
        private String cloudIp; 
        private java.util.List<String> cloudIpList; 
        private String cloudIsp; 
        private String cloudPort; 
        private String direction; 
        private Long endTime; 
        private String instanceId; 
        private java.util.List<String> instanceList; 
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
         * <p>The IDs of member accounts.</p>
         */
        public Builder accountIds(java.util.List<Long> accountIds) {
            this.putQueryParameter("AccountIds", accountIds);
            this.accountIds = accountIds;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
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
         * <p>The local IP addresses for filtering.</p>
         */
        public Builder cloudIpList(java.util.List<String> cloudIpList) {
            String cloudIpListShrink = shrink(cloudIpList, "CloudIpList", "json");
            this.putQueryParameter("CloudIpList", cloudIpListShrink);
            this.cloudIpList = cloudIpList;
            return this;
        }

        /**
         * <p>The local Internet service provider (ISP).</p>
         * <blockquote>
         * <p> In most cases, the value is Alibaba or Alibaba Cloud.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        public Builder cloudIsp(String cloudIsp) {
            this.putQueryParameter("CloudIsp", cloudIsp);
            this.cloudIsp = cloudIsp;
            return this;
        }

        /**
         * <p>The local port.</p>
         * <blockquote>
         * <p> This parameter is required only if you set GroupBy to CloudPort.</p>
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
         * <p>The direction of the Internet traffic that you want to query. Valid values:</p>
         * <ul>
         * <li><strong>in</strong>: inbound</li>
         * <li><strong>out</strong>: outbound</li>
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
         * <p>The end of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1684373700099</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud instance.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-sample*</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The instance IDs for filtering.</p>
         */
        public Builder instanceList(java.util.List<String> instanceList) {
            String instanceListShrink = shrink(instanceList, "InstanceList", "json");
            this.putQueryParameter("InstanceList", instanceListShrink);
            this.instanceList = instanceList;
            return this;
        }

        /**
         * <p>The metric for data ranking. Default value: <strong>ByteCount</strong>. This value indicates that Internet traffic data is ranked by traffic volume.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Rtt</li>
         * <li>ByteCount</li>
         * <li>PacketCount</li>
         * <li>RetransmitRate</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ByteCount</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The remote city.</p>
         * <blockquote>
         * <p> This parameter is required only if you set <strong>TupleType</strong> to <strong>2</strong> or <strong>5</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou</p>
         */
        public Builder otherCity(String otherCity) {
            this.putQueryParameter("OtherCity", otherCity);
            this.otherCity = otherCity;
            return this;
        }

        /**
         * <p>The remote country.</p>
         * <blockquote>
         * <p> This parameter is required only if you set <strong>TupleType</strong> to <strong>2</strong> or <strong>5</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>China</p>
         */
        public Builder otherCountry(String otherCountry) {
            this.putQueryParameter("OtherCountry", otherCountry);
            this.otherCountry = otherCountry;
            return this;
        }

        /**
         * <p>The remote IP address.</p>
         * <blockquote>
         * <p>This parameter is required only when you set <strong>TupleType</strong> to <strong>2</strong> or <strong>5</strong>.</p>
         * </blockquote>
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
         * <p>The remote ISP.</p>
         * <blockquote>
         * <p>This parameter is required if you want to view the information about the remote ISP.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>China Mobile</p>
         */
        public Builder otherIsp(String otherIsp) {
            this.putQueryParameter("OtherIsp", otherIsp);
            this.otherIsp = otherIsp;
            return this;
        }

        /**
         * <p>The remote port.</p>
         * <blockquote>
         * <p>This parameter is required only when you set <strong>TupleType</strong> to <strong>5</strong>.</p>
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
         * <p>All protocols are supported. This parameter is required only when you set <strong>TupleType</strong> to <strong>5</strong>.</p>
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
         * <p>The ID of the region for which you want to query the Internet traffic.</p>
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
         * <p>The order in which instances are ranked by Internet traffic. Valid values:</p>
         * <ul>
         * <li><strong>desc</strong>: the descending order</li>
         * <li><strong>asc</strong>: the ascending order</li>
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
         * <p>Specifies top-N traffic data to display. Default value: <strong>10</strong>. This value specifies to display top-10 traffic data by default. Max value: <strong>100</strong>.</p>
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
         * <p>The type of the tuple. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: 1-tuple</li>
         * <li><strong>2</strong>: 2-tuple</li>
         * <li><strong>5</strong>: 5-tuple</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder tupleType(Integer tupleType) {
            this.putQueryParameter("TupleType", tupleType);
            this.tupleType = tupleType;
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
        public GetInternetTupleRequest build() {
            return new GetInternetTupleRequest(this);
        } 

    } 

}
