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
 * {@link ClinkListCdrObsRequest} extends {@link RequestModel}
 *
 * <p>ClinkListCdrObsRequest</p>
 */
public class ClinkListCdrObsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssociatedId")
    private Long associatedId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("City")
    private String city;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientNumber")
    private String clientNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cno")
    private String cno;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerNumber")
    private String customerNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Evaluation")
    private Long evaluation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HiddenType")
    private Long hiddenType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hotline")
    private String hotline;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdType")
    private Long idType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Long limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MainUniqueId")
    private String mainUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mark")
    private Long mark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Offset")
    private Long offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Province")
    private String province;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueAnswerInTime")
    private Long queueAnswerInTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestUniqueId")
    private String requestUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Long status;

    private ClinkListCdrObsRequest(Builder builder) {
        super(builder);
        this.associatedId = builder.associatedId;
        this.city = builder.city;
        this.clientNumber = builder.clientNumber;
        this.cno = builder.cno;
        this.customerNumber = builder.customerNumber;
        this.endTime = builder.endTime;
        this.enterpriseId = builder.enterpriseId;
        this.evaluation = builder.evaluation;
        this.hiddenType = builder.hiddenType;
        this.hotline = builder.hotline;
        this.idType = builder.idType;
        this.limit = builder.limit;
        this.mainUniqueId = builder.mainUniqueId;
        this.mark = builder.mark;
        this.offset = builder.offset;
        this.ownerId = builder.ownerId;
        this.province = builder.province;
        this.queueAnswerInTime = builder.queueAnswerInTime;
        this.requestUniqueId = builder.requestUniqueId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkListCdrObsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return associatedId
     */
    public Long getAssociatedId() {
        return this.associatedId;
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return clientNumber
     */
    public String getClientNumber() {
        return this.clientNumber;
    }

    /**
     * @return cno
     */
    public String getCno() {
        return this.cno;
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
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return evaluation
     */
    public Long getEvaluation() {
        return this.evaluation;
    }

    /**
     * @return hiddenType
     */
    public Long getHiddenType() {
        return this.hiddenType;
    }

    /**
     * @return hotline
     */
    public String getHotline() {
        return this.hotline;
    }

    /**
     * @return idType
     */
    public Long getIdType() {
        return this.idType;
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
     * @return mark
     */
    public Long getMark() {
        return this.mark;
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
     * @return province
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * @return queueAnswerInTime
     */
    public Long getQueueAnswerInTime() {
        return this.queueAnswerInTime;
    }

    /**
     * @return requestUniqueId
     */
    public String getRequestUniqueId() {
        return this.requestUniqueId;
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
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public Long getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ClinkListCdrObsRequest, Builder> {
        private Long associatedId; 
        private String city; 
        private String clientNumber; 
        private String cno; 
        private String customerNumber; 
        private Long endTime; 
        private Long enterpriseId; 
        private Long evaluation; 
        private Long hiddenType; 
        private String hotline; 
        private Long idType; 
        private Long limit; 
        private String mainUniqueId; 
        private Long mark; 
        private Long offset; 
        private Long ownerId; 
        private String province; 
        private Long queueAnswerInTime; 
        private String requestUniqueId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long startTime; 
        private Long status; 

        private Builder() {
            super();
        } 

        private Builder(ClinkListCdrObsRequest request) {
            super(request);
            this.associatedId = request.associatedId;
            this.city = request.city;
            this.clientNumber = request.clientNumber;
            this.cno = request.cno;
            this.customerNumber = request.customerNumber;
            this.endTime = request.endTime;
            this.enterpriseId = request.enterpriseId;
            this.evaluation = request.evaluation;
            this.hiddenType = request.hiddenType;
            this.hotline = request.hotline;
            this.idType = request.idType;
            this.limit = request.limit;
            this.mainUniqueId = request.mainUniqueId;
            this.mark = request.mark;
            this.offset = request.offset;
            this.ownerId = request.ownerId;
            this.province = request.province;
            this.queueAnswerInTime = request.queueAnswerInTime;
            this.requestUniqueId = request.requestUniqueId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.startTime = request.startTime;
            this.status = request.status;
        } 

        /**
         * <p>业务ID</p>
         * 
         * <strong>example:</strong>
         * <p>AssociatedId</p>
         */
        public Builder associatedId(Long associatedId) {
            this.putQueryParameter("AssociatedId", associatedId);
            this.associatedId = associatedId;
            return this;
        }

        /**
         * <p>客户城市</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
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
         * <p>座席号，要求只能是 4-11 位数字</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        public Builder cno(String cno) {
            this.putQueryParameter("Cno", cno);
            this.cno = cno;
            return this;
        }

        /**
         * <p>客户号码</p>
         * 
         * <strong>example:</strong>
         * <p>177xxxx</p>
         */
        public Builder customerNumber(String customerNumber) {
            this.putQueryParameter("CustomerNumber", customerNumber);
            this.customerNumber = customerNumber;
            return this;
        }

        /**
         * <p>结束时间，时间戳格式精确到秒，开始时间和结束时间跨度不能超过一个月。默认值取当前时间</p>
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
         * <p>是否邀评: 0: 否 1: 是 2: -</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder evaluation(Long evaluation) {
            this.putQueryParameter("Evaluation", evaluation);
            this.evaluation = evaluation;
            return this;
        }

        /**
         * <p>是否隐藏号码。 0: 不隐藏，1: 中间四位，2: 最后八位 3: 全部号码，4: 最后四位。默认值为 0</p>
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
         * <p>热线号码</p>
         * 
         * <strong>example:</strong>
         * <p>Hotline</p>
         */
        public Builder hotline(String hotline) {
            this.putQueryParameter("Hotline", hotline);
            this.hotline = hotline;
            return this;
        }

        /**
         * <p>业务ID类型，1：工单；2：业务记录</p>
         * 
         * <strong>example:</strong>
         * <p>44</p>
         */
        public Builder idType(Long idType) {
            this.putQueryParameter("IdType", idType);
            this.idType = idType;
            return this;
        }

        /**
         * <p>查询条数，范围 10-100。默认值为 10。注：limit + offset 不允许超过100000</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
         * <p>MainUniqueId</p>
         */
        public Builder mainUniqueId(String mainUniqueId) {
            this.putQueryParameter("MainUniqueId", mainUniqueId);
            this.mainUniqueId = mainUniqueId;
            return this;
        }

        /**
         * <p>标记。取值范围如下： 为空表示全部， 1:留言 2:转移 3:咨询 4:三方 5:传真接收 6:会议 7:交互 8:IVR中放弃 9:已进入IVR 10:未进入IVR 11:队列中放弃 12:队列中溢出 注： 其中mark值2,3,4,7仅在status=1(座席接听)时有效， mark值1,5,6,8,9,10,11,12在status=3(系统接听)时有效</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder mark(Long mark) {
            this.putQueryParameter("Mark", mark);
            this.mark = mark;
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
         * <p>客户省份</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder province(String province) {
            this.putQueryParameter("Province", province);
            this.province = province;
            return this;
        }

        /**
         * <p>队列及时应答: 0: 否 1: 是 2: -</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder queueAnswerInTime(Long queueAnswerInTime) {
            this.putQueryParameter("QueueAnswerInTime", queueAnswerInTime);
            this.queueAnswerInTime = queueAnswerInTime;
            return this;
        }

        /**
         * <p>请求唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>RequestUniqueId</p>
         */
        public Builder requestUniqueId(String requestUniqueId) {
            this.putQueryParameter("RequestUniqueId", requestUniqueId);
            this.requestUniqueId = requestUniqueId;
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
         * <p>接听状态。取值范围如下： 0: 全部 1: 客户未接听 2: 座席未接听 3: 双方接听 默认值为0</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Long status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ClinkListCdrObsRequest build() {
            return new ClinkListCdrObsRequest(this);
        } 

    } 

}
