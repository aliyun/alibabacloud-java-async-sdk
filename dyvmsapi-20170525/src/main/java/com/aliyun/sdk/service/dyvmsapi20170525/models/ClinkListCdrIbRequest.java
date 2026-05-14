// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link ClinkListCdrIbRequest} extends {@link RequestModel}
 *
 * <p>ClinkListCdrIbRequest</p>
 */
public class ClinkListCdrIbRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BridgeDuration")
    private Long bridgeDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BridgeDurationEnd")
    private Long bridgeDurationEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BridgeTime")
    private Long bridgeTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BridgeTimeEnd")
    private Long bridgeTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientNumber")
    private String clientNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cnos")
    private String cnos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerNumber")
    private String customerNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimeEnd")
    private Long endTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirstCallCno")
    private String firstCallCno;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirstCallNumber")
    private String firstCallNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirstCallQno")
    private String firstCallQno;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HiddenType")
    private Long hiddenType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Long limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MainUniqueId")
    private String mainUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Offset")
    private Long offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Qnos")
    private String qnos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScrollId")
    private String scrollId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScrollSearch")
    private String scrollSearch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimeEnd")
    private Long startTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Statuses")
    private Long statuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TotalDuration")
    private Long totalDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TotalDurationEnd")
    private Long totalDurationEnd;

    private ClinkListCdrIbRequest(Builder builder) {
        super(builder);
        this.bridgeDuration = builder.bridgeDuration;
        this.bridgeDurationEnd = builder.bridgeDurationEnd;
        this.bridgeTime = builder.bridgeTime;
        this.bridgeTimeEnd = builder.bridgeTimeEnd;
        this.clientNumber = builder.clientNumber;
        this.cnos = builder.cnos;
        this.customerNumber = builder.customerNumber;
        this.endTime = builder.endTime;
        this.endTimeEnd = builder.endTimeEnd;
        this.enterpriseId = builder.enterpriseId;
        this.firstCallCno = builder.firstCallCno;
        this.firstCallNumber = builder.firstCallNumber;
        this.firstCallQno = builder.firstCallQno;
        this.hiddenType = builder.hiddenType;
        this.limit = builder.limit;
        this.mainUniqueId = builder.mainUniqueId;
        this.offset = builder.offset;
        this.ownerId = builder.ownerId;
        this.qnos = builder.qnos;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scrollId = builder.scrollId;
        this.scrollSearch = builder.scrollSearch;
        this.startTime = builder.startTime;
        this.startTimeEnd = builder.startTimeEnd;
        this.statuses = builder.statuses;
        this.totalDuration = builder.totalDuration;
        this.totalDurationEnd = builder.totalDurationEnd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkListCdrIbRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bridgeDuration
     */
    public Long getBridgeDuration() {
        return this.bridgeDuration;
    }

    /**
     * @return bridgeDurationEnd
     */
    public Long getBridgeDurationEnd() {
        return this.bridgeDurationEnd;
    }

    /**
     * @return bridgeTime
     */
    public Long getBridgeTime() {
        return this.bridgeTime;
    }

    /**
     * @return bridgeTimeEnd
     */
    public Long getBridgeTimeEnd() {
        return this.bridgeTimeEnd;
    }

    /**
     * @return clientNumber
     */
    public String getClientNumber() {
        return this.clientNumber;
    }

    /**
     * @return cnos
     */
    public String getCnos() {
        return this.cnos;
    }

    /**
     * @return customerNumber
     */
    public String getCustomerNumber() {
        return this.customerNumber;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return endTimeEnd
     */
    public Long getEndTimeEnd() {
        return this.endTimeEnd;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return firstCallCno
     */
    public String getFirstCallCno() {
        return this.firstCallCno;
    }

    /**
     * @return firstCallNumber
     */
    public String getFirstCallNumber() {
        return this.firstCallNumber;
    }

    /**
     * @return firstCallQno
     */
    public String getFirstCallQno() {
        return this.firstCallQno;
    }

    /**
     * @return hiddenType
     */
    public Long getHiddenType() {
        return this.hiddenType;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return mainUniqueId
     */
    public String getMainUniqueId() {
        return this.mainUniqueId;
    }

    /**
     * @return offset
     */
    public Long getOffset() {
        return this.offset;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return qnos
     */
    public String getQnos() {
        return this.qnos;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return scrollId
     */
    public String getScrollId() {
        return this.scrollId;
    }

    /**
     * @return scrollSearch
     */
    public String getScrollSearch() {
        return this.scrollSearch;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return startTimeEnd
     */
    public Long getStartTimeEnd() {
        return this.startTimeEnd;
    }

    /**
     * @return statuses
     */
    public Long getStatuses() {
        return this.statuses;
    }

    /**
     * @return totalDuration
     */
    public Long getTotalDuration() {
        return this.totalDuration;
    }

    /**
     * @return totalDurationEnd
     */
    public Long getTotalDurationEnd() {
        return this.totalDurationEnd;
    }

    public static final class Builder extends Request.Builder<ClinkListCdrIbRequest, Builder> {
        private Long bridgeDuration; 
        private Long bridgeDurationEnd; 
        private Long bridgeTime; 
        private Long bridgeTimeEnd; 
        private String clientNumber; 
        private String cnos; 
        private String customerNumber; 
        private Long endTime; 
        private Long endTimeEnd; 
        private Long enterpriseId; 
        private String firstCallCno; 
        private String firstCallNumber; 
        private String firstCallQno; 
        private Long hiddenType; 
        private Long limit; 
        private String mainUniqueId; 
        private Long offset; 
        private Long ownerId; 
        private String qnos; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scrollId; 
        private String scrollSearch; 
        private Long startTime; 
        private Long startTimeEnd; 
        private Long statuses; 
        private Long totalDuration; 
        private Long totalDurationEnd; 

        private Builder() {
            super();
        } 

        private Builder(ClinkListCdrIbRequest request) {
            super(request);
            this.bridgeDuration = request.bridgeDuration;
            this.bridgeDurationEnd = request.bridgeDurationEnd;
            this.bridgeTime = request.bridgeTime;
            this.bridgeTimeEnd = request.bridgeTimeEnd;
            this.clientNumber = request.clientNumber;
            this.cnos = request.cnos;
            this.customerNumber = request.customerNumber;
            this.endTime = request.endTime;
            this.endTimeEnd = request.endTimeEnd;
            this.enterpriseId = request.enterpriseId;
            this.firstCallCno = request.firstCallCno;
            this.firstCallNumber = request.firstCallNumber;
            this.firstCallQno = request.firstCallQno;
            this.hiddenType = request.hiddenType;
            this.limit = request.limit;
            this.mainUniqueId = request.mainUniqueId;
            this.offset = request.offset;
            this.ownerId = request.ownerId;
            this.qnos = request.qnos;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scrollId = request.scrollId;
            this.scrollSearch = request.scrollSearch;
            this.startTime = request.startTime;
            this.startTimeEnd = request.startTimeEnd;
            this.statuses = request.statuses;
            this.totalDuration = request.totalDuration;
            this.totalDurationEnd = request.totalDurationEnd;
        } 

        /**
         * <p>通话时长范围查询最小值，和bridgeDurationEnd配合使用</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder bridgeDuration(Long bridgeDuration) {
            this.putQueryParameter("BridgeDuration", bridgeDuration);
            this.bridgeDuration = bridgeDuration;
            return this;
        }

        /**
         * <p>通话时长范围查询最大值</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder bridgeDurationEnd(Long bridgeDurationEnd) {
            this.putQueryParameter("BridgeDurationEnd", bridgeDurationEnd);
            this.bridgeDurationEnd = bridgeDurationEnd;
            return this;
        }

        /**
         * <p>接听时间，时间戳格式精确到秒。</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        public Builder bridgeTime(Long bridgeTime) {
            this.putQueryParameter("BridgeTime", bridgeTime);
            this.bridgeTime = bridgeTime;
            return this;
        }

        /**
         * <p>接听时间查询截止，时间戳格式精确到秒。</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        public Builder bridgeTimeEnd(Long bridgeTimeEnd) {
            this.putQueryParameter("BridgeTimeEnd", bridgeTimeEnd);
            this.bridgeTimeEnd = bridgeTimeEnd;
            return this;
        }

        /**
         * <p>座席电话</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder clientNumber(String clientNumber) {
            this.putQueryParameter("ClientNumber", clientNumber);
            this.clientNumber = clientNumber;
            return this;
        }

        /**
         * <p>座席号</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        public Builder cnos(String cnos) {
            this.putQueryParameter("Cnos", cnos);
            this.cnos = cnos;
            return this;
        }

        /**
         * <p>客户号码</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder customerNumber(String customerNumber) {
            this.putQueryParameter("CustomerNumber", customerNumber);
            this.customerNumber = customerNumber;
            return this;
        }

        /**
         * <p>结束时间，时间戳格式精确到秒。</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>结束时间查询截止，时间戳格式精确到秒。</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        public Builder endTimeEnd(Long endTimeEnd) {
            this.putQueryParameter("EndTimeEnd", endTimeEnd);
            this.endTimeEnd = endTimeEnd;
            return this;
        }

        /**
         * <p>呼叫中心 id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8004970</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>首呼座席</p>
         * 
         * <strong>example:</strong>
         * <p>1122</p>
         */
        public Builder firstCallCno(String firstCallCno) {
            this.putQueryParameter("FirstCallCno", firstCallCno);
            this.firstCallCno = firstCallCno;
            return this;
        }

        /**
         * <p>首呼座席电话</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder firstCallNumber(String firstCallNumber) {
            this.putQueryParameter("FirstCallNumber", firstCallNumber);
            this.firstCallNumber = firstCallNumber;
            return this;
        }

        /**
         * <p>首呼队列</p>
         * 
         * <strong>example:</strong>
         * <p>2222</p>
         */
        public Builder firstCallQno(String firstCallQno) {
            this.putQueryParameter("FirstCallQno", firstCallQno);
            this.firstCallQno = firstCallQno;
            return this;
        }

        /**
         * <p>是否隐藏号码。  0: 不隐藏，1: 中间四位，2: 最后八位，3: 全部号码，4: 最后四位。默认值为 0</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder hiddenType(Long hiddenType) {
            this.putQueryParameter("HiddenType", hiddenType);
            this.hiddenType = hiddenType;
            return this;
        }

        /**
         * <p>查询条数，范围 10-100。默认值为 10。注：limit + offset 不允许超过100000</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>通话记录唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>uniq_1-162046xxxx.12</p>
         */
        public Builder mainUniqueId(String mainUniqueId) {
            this.putQueryParameter("MainUniqueId", mainUniqueId);
            this.mainUniqueId = mainUniqueId;
            return this;
        }

        /**
         * <p>偏移量，范围 0-99990。默认值为 0。注：limit + offset 不允许超过100000</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder offset(Long offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>队列号</p>
         * 
         * <strong>example:</strong>
         * <p>1122</p>
         */
        public Builder qnos(String qnos) {
            this.putQueryParameter("Qnos", qnos);
            this.qnos = qnos;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>滚动查询ID。配合scrollSearch使用，第一次查询时不需要传递此参数，后续查询可从返回列表中取值，并传参数。当scrollId为空时，代表滚动查询结束。</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder scrollId(String scrollId) {
            this.putQueryParameter("ScrollId", scrollId);
            this.scrollId = scrollId;
            return this;
        }

        /**
         * <p>是否滚动查询。默认false，true代表使用滚动查询。</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder scrollSearch(String scrollSearch) {
            this.putQueryParameter("ScrollSearch", scrollSearch);
            this.scrollSearch = scrollSearch;
            return this;
        }

        /**
         * <p>开始时间，时间戳格式精确到秒。默认值取当前月份第一天</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>开始时间查询截止，时间戳格式精确到秒，开始时间和结束时间跨度不能超过一个月。默认值取当前时间</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        public Builder startTimeEnd(Long startTimeEnd) {
            this.putQueryParameter("StartTimeEnd", startTimeEnd);
            this.startTimeEnd = startTimeEnd;
            return this;
        }

        /**
         * <p>接听状态。取值范围如下：  1: 人工接听  2: 人工未接听  3: 系统应答  4: 系统未应答  默认全部</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder statuses(Long statuses) {
            this.putQueryParameter("Statuses", statuses);
            this.statuses = statuses;
            return this;
        }

        /**
         * <p>总时长范围查询最小值，和totalDurationEnd配合使用</p>
         * 
         * <strong>example:</strong>
         * <p>69</p>
         */
        public Builder totalDuration(Long totalDuration) {
            this.putQueryParameter("TotalDuration", totalDuration);
            this.totalDuration = totalDuration;
            return this;
        }

        /**
         * <p>总时长范围查询最大值</p>
         * 
         * <strong>example:</strong>
         * <p>47</p>
         */
        public Builder totalDurationEnd(Long totalDurationEnd) {
            this.putQueryParameter("TotalDurationEnd", totalDurationEnd);
            this.totalDurationEnd = totalDurationEnd;
            return this;
        }

        @Override
        public ClinkListCdrIbRequest build() {
            return new ClinkListCdrIbRequest(this);
        } 

    } 

}
