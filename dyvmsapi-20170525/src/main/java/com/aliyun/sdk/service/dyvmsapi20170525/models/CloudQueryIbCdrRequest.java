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
 * {@link CloudQueryIbCdrRequest} extends {@link RequestModel}
 *
 * <p>CloudQueryIbCdrRequest</p>
 */
public class CloudQueryIbCdrRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalleeNumber")
    private String calleeNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("City")
    private String city;

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
    @com.aliyun.core.annotation.NameInMap("Hotline")
    private String hotline;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JoinQueueCode")
    private Long joinQueueCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LeaveQueueCode")
    private Long leaveQueueCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Long limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Province")
    private String province;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Qno")
    private String qno;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Start")
    private Long start;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Long status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeRangeType")
    private String timeRangeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UniqueId")
    private String uniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserFieldValue")
    private String userFieldValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserFieldkey")
    private String userFieldkey;

    private CloudQueryIbCdrRequest(Builder builder) {
        super(builder);
        this.calleeNumber = builder.calleeNumber;
        this.city = builder.city;
        this.cno = builder.cno;
        this.customerNumber = builder.customerNumber;
        this.endTime = builder.endTime;
        this.enterpriseId = builder.enterpriseId;
        this.hotline = builder.hotline;
        this.joinQueueCode = builder.joinQueueCode;
        this.leaveQueueCode = builder.leaveQueueCode;
        this.limit = builder.limit;
        this.province = builder.province;
        this.qno = builder.qno;
        this.start = builder.start;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.timeRangeType = builder.timeRangeType;
        this.uniqueId = builder.uniqueId;
        this.userFieldValue = builder.userFieldValue;
        this.userFieldkey = builder.userFieldkey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudQueryIbCdrRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calleeNumber
     */
    public String getCalleeNumber() {
        return this.calleeNumber;
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
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
     * @return hotline
     */
    public String getHotline() {
        return this.hotline;
    }

    /**
     * @return joinQueueCode
     */
    public Long getJoinQueueCode() {
        return this.joinQueueCode;
    }

    /**
     * @return leaveQueueCode
     */
    public Long getLeaveQueueCode() {
        return this.leaveQueueCode;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * @return qno
     */
    public String getQno() {
        return this.qno;
    }

    /**
     * @return start
     */
    public Long getStart() {
        return this.start;
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

    /**
     * @return timeRangeType
     */
    public String getTimeRangeType() {
        return this.timeRangeType;
    }

    /**
     * @return uniqueId
     */
    public String getUniqueId() {
        return this.uniqueId;
    }

    /**
     * @return userFieldValue
     */
    public String getUserFieldValue() {
        return this.userFieldValue;
    }

    /**
     * @return userFieldkey
     */
    public String getUserFieldkey() {
        return this.userFieldkey;
    }

    public static final class Builder extends Request.Builder<CloudQueryIbCdrRequest, Builder> {
        private String calleeNumber; 
        private String city; 
        private String cno; 
        private String customerNumber; 
        private Long endTime; 
        private Long enterpriseId; 
        private String hotline; 
        private Long joinQueueCode; 
        private Long leaveQueueCode; 
        private Long limit; 
        private String province; 
        private String qno; 
        private Long start; 
        private Long startTime; 
        private Long status; 
        private String timeRangeType; 
        private String uniqueId; 
        private String userFieldValue; 
        private String userFieldkey; 

        private Builder() {
            super();
        } 

        private Builder(CloudQueryIbCdrRequest request) {
            super(request);
            this.calleeNumber = request.calleeNumber;
            this.city = request.city;
            this.cno = request.cno;
            this.customerNumber = request.customerNumber;
            this.endTime = request.endTime;
            this.enterpriseId = request.enterpriseId;
            this.hotline = request.hotline;
            this.joinQueueCode = request.joinQueueCode;
            this.leaveQueueCode = request.leaveQueueCode;
            this.limit = request.limit;
            this.province = request.province;
            this.qno = request.qno;
            this.start = request.start;
            this.startTime = request.startTime;
            this.status = request.status;
            this.timeRangeType = request.timeRangeType;
            this.uniqueId = request.uniqueId;
            this.userFieldValue = request.userFieldValue;
            this.userFieldkey = request.userFieldkey;
        } 

        /**
         * <p>座席号码</p>
         * 
         * <strong>example:</strong>
         * <p>41008502</p>
         */
        public Builder calleeNumber(String calleeNumber) {
            this.putQueryParameter("CalleeNumber", calleeNumber);
            this.calleeNumber = calleeNumber;
            return this;
        }

        /**
         * <p>客户电话归属城市；为空表示全部，如&quot;成都&quot;，此参数需要URLEncode</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * <p>座席工号,此字段支持传入多个座席工号，使用英文半角逗号隔开</p>
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
         * <p>17750247753</p>
         */
        public Builder customerNumber(String customerNumber) {
            this.putQueryParameter("CustomerNumber", customerNumber);
            this.customerNumber = customerNumber;
            return this;
        }

        /**
         * <p>查询结束时间；时间戳格式,精确到s。startTime与endTime不允许跨月，默认值取当前月份最后一天</p>
         * 
         * <strong>example:</strong>
         * <p>1775030413</p>
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
         * <p>7000002</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>热线号码</p>
         * 
         * <strong>example:</strong>
         * <p>10003221</p>
         */
        public Builder hotline(String hotline) {
            this.putQueryParameter("Hotline", hotline);
            this.hotline = hotline;
            return this;
        }

        /**
         * <p>未进入队列原因 参数说明： 4: 无座席未进入队列 , 3: 队列满未进入队列</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder joinQueueCode(Long joinQueueCode) {
            this.putQueryParameter("JoinQueueCode", joinQueueCode);
            this.joinQueueCode = joinQueueCode;
            return this;
        }

        /**
         * <p>离开队列原因 参数说明： 2: 队列中放弃 , 3: 队列中超时溢出 , 4: 队列中无座席溢出</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder leaveQueueCode(Long leaveQueueCode) {
            this.putQueryParameter("LeaveQueueCode", leaveQueueCode);
            this.leaveQueueCode = leaveQueueCode;
            return this;
        }

        /**
         * <p>需要取出的数据条数；大于0，最大不能超过1000，默认10</p>
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
         * <p>客户电话归属省份；为空表示全部，如&quot;四川&quot;，此参数需要URLEncode</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder province(String province) {
            this.putQueryParameter("Province", province);
            this.province = province;
            return this;
        }

        /**
         * <p>队列号 参数说明：-1: 未进入队列</p>
         * 
         * <strong>example:</strong>
         * <p>566</p>
         */
        public Builder qno(String qno) {
            this.putQueryParameter("Qno", qno);
            this.qno = qno;
            return this;
        }

        /**
         * <p>从第几条开始取；大于等于0，默认0</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder start(Long start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        /**
         * <p>查询开始时间；时间戳格式,精确到s。startTime与endTime不允许跨月，默认值取当前月份第一天</p>
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
         * <p>呼叫结果；参数说明： 1:座席接听 2:已呼叫座席，座席未接听 3:系统接听 4:系统未接听-IVR配置错误 5:系统未接听-停机 6:系统未接听-欠费 7:系统未接听-黑名单 8:系统未接听-未注册 9:系统未接听-彩铃 11:系统未接听-呼叫超出营帐中设置的最大限制 12:系统未接听-客户呼入系统后在系统未应答前挂机 13:其他错误 14:未进入队列 15:队列中放弃 16:队列中超时溢出 17:队列中无座席溢出 18:无座席未进入队列 19:队列满未进入队列</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Long status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>查询时间开始结束范围生效类型；通话记录startTime和endTime时间范围生效类型，当startTime和endTime不为空时生效；取值：1.呼叫开始时间 2.呼叫结束时间； 默认为1</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder timeRangeType(String timeRangeType) {
            this.putQueryParameter("TimeRangeType", timeRangeType);
            this.timeRangeType = timeRangeType;
            return this;
        }

        /**
         * <p>如果uniqueId值不为空，则以下其它参数无效，即仅查询电话唯一标识为uniqueId的记录信息</p>
         * 
         * <strong>example:</strong>
         * <p>uniq_1-162046xxxx.12</p>
         */
        public Builder uniqueId(String uniqueId) {
            this.putQueryParameter("UniqueId", uniqueId);
            this.uniqueId = uniqueId;
            return this;
        }

        /**
         * <p>用户自定义参数指定查询value；传递该参数时必须传递userFieldKey，仅查询一个字段，不支持模糊匹配， 构造的自定义字段查询条件为:{&quot;userFieldkey&quot;:&quot;userFieldvalue&quot;}，此参数需要URLEncode</p>
         * 
         * <strong>example:</strong>
         * <p>userFieldvalue</p>
         */
        public Builder userFieldValue(String userFieldValue) {
            this.putQueryParameter("UserFieldValue", userFieldValue);
            this.userFieldValue = userFieldValue;
            return this;
        }

        /**
         * <p>用户自定义参数指定查询key；传递该参数时必须传递userFieldValue，仅查询一个字段，不支持模糊匹配， 构造的自定义字段查询条件为:{&quot;userFieldkey&quot;:&quot;userFieldvalue&quot;}，此参数需要URLEncode</p>
         * 
         * <strong>example:</strong>
         * <p>userFieldkey</p>
         */
        public Builder userFieldkey(String userFieldkey) {
            this.putQueryParameter("UserFieldkey", userFieldkey);
            this.userFieldkey = userFieldkey;
            return this;
        }

        @Override
        public CloudQueryIbCdrRequest build() {
            return new CloudQueryIbCdrRequest(this);
        } 

    } 

}
