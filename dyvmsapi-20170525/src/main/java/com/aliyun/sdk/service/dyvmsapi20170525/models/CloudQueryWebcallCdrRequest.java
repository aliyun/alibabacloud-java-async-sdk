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
 * {@link CloudQueryWebcallCdrRequest} extends {@link RequestModel}
 *
 * <p>CloudQueryWebcallCdrRequest</p>
 */
public class CloudQueryWebcallCdrRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalleeClid")
    private String calleeClid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalleeDisplayNumber")
    private String calleeDisplayNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalleeNumber")
    private String calleeNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("City")
    private String city;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Clid")
    private String clid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cno")
    private String cno;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerNumber")
    private String customerNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayNumber")
    private String displayNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Gno")
    private String gno;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsRealAnswer")
    private Long isRealAnswer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Long limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Province")
    private String province;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestUniqueId")
    private String requestUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReturnCount")
    private Long returnCount;

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

    private CloudQueryWebcallCdrRequest(Builder builder) {
        super(builder);
        this.calleeClid = builder.calleeClid;
        this.calleeDisplayNumber = builder.calleeDisplayNumber;
        this.calleeNumber = builder.calleeNumber;
        this.city = builder.city;
        this.clid = builder.clid;
        this.cno = builder.cno;
        this.customerNumber = builder.customerNumber;
        this.displayNumber = builder.displayNumber;
        this.endTime = builder.endTime;
        this.enterpriseId = builder.enterpriseId;
        this.gno = builder.gno;
        this.isRealAnswer = builder.isRealAnswer;
        this.limit = builder.limit;
        this.province = builder.province;
        this.requestUniqueId = builder.requestUniqueId;
        this.returnCount = builder.returnCount;
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

    public static CloudQueryWebcallCdrRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calleeClid
     */
    public String getCalleeClid() {
        return this.calleeClid;
    }

    /**
     * @return calleeDisplayNumber
     */
    public String getCalleeDisplayNumber() {
        return this.calleeDisplayNumber;
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
     * @return clid
     */
    public String getClid() {
        return this.clid;
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
     * @return displayNumber
     */
    public String getDisplayNumber() {
        return this.displayNumber;
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
     * @return gno
     */
    public String getGno() {
        return this.gno;
    }

    /**
     * @return isRealAnswer
     */
    public Long getIsRealAnswer() {
        return this.isRealAnswer;
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
     * @return requestUniqueId
     */
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

    /**
     * @return returnCount
     */
    public Long getReturnCount() {
        return this.returnCount;
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

    public static final class Builder extends Request.Builder<CloudQueryWebcallCdrRequest, Builder> {
        private String calleeClid; 
        private String calleeDisplayNumber; 
        private String calleeNumber; 
        private String city; 
        private String clid; 
        private String cno; 
        private String customerNumber; 
        private String displayNumber; 
        private Long endTime; 
        private Long enterpriseId; 
        private String gno; 
        private Long isRealAnswer; 
        private Long limit; 
        private String province; 
        private String requestUniqueId; 
        private Long returnCount; 
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

        private Builder(CloudQueryWebcallCdrRequest request) {
            super(request);
            this.calleeClid = request.calleeClid;
            this.calleeDisplayNumber = request.calleeDisplayNumber;
            this.calleeNumber = request.calleeNumber;
            this.city = request.city;
            this.clid = request.clid;
            this.cno = request.cno;
            this.customerNumber = request.customerNumber;
            this.displayNumber = request.displayNumber;
            this.endTime = request.endTime;
            this.enterpriseId = request.enterpriseId;
            this.gno = request.gno;
            this.isRealAnswer = request.isRealAnswer;
            this.limit = request.limit;
            this.province = request.province;
            this.requestUniqueId = request.requestUniqueId;
            this.returnCount = request.returnCount;
            this.start = request.start;
            this.startTime = request.startTime;
            this.status = request.status;
            this.timeRangeType = request.timeRangeType;
            this.uniqueId = request.uniqueId;
            this.userFieldValue = request.userFieldValue;
            this.userFieldkey = request.userFieldkey;
        } 

        /**
         * <p>第二侧外显号码</p>
         * 
         * <strong>example:</strong>
         * <p>02138276106</p>
         */
        public Builder calleeClid(String calleeClid) {
            this.putQueryParameter("CalleeClid", calleeClid);
            this.calleeClid = calleeClid;
            return this;
        }

        /**
         * <p>第二侧真实外显号码</p>
         * 
         * <strong>example:</strong>
         * <p>02138276106</p>
         */
        public Builder calleeDisplayNumber(String calleeDisplayNumber) {
            this.putQueryParameter("CalleeDisplayNumber", calleeDisplayNumber);
            this.calleeDisplayNumber = calleeDisplayNumber;
            return this;
        }

        /**
         * <p>座席号码</p>
         * 
         * <strong>example:</strong>
         * <p>01041009283</p>
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
         * <p>示例值示例值</p>
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * <p>外显号码</p>
         * 
         * <strong>example:</strong>
         * <p>02138276106</p>
         */
        public Builder clid(String clid) {
            this.putQueryParameter("Clid", clid);
            this.clid = clid;
            return this;
        }

        /**
         * <p>座席工号</p>
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
         * <p>01042003255</p>
         */
        public Builder customerNumber(String customerNumber) {
            this.putQueryParameter("CustomerNumber", customerNumber);
            this.customerNumber = customerNumber;
            return this;
        }

        /**
         * <p>真实外显号码，当使用AXB场景进行外呼时，真实外显号码为虚拟号</p>
         * 
         * <strong>example:</strong>
         * <p>02138276106</p>
         */
        public Builder displayNumber(String displayNumber) {
            this.putQueryParameter("DisplayNumber", displayNumber);
            this.displayNumber = displayNumber;
            return this;
        }

        /**
         * <p>查询结束时间；时间戳格式,精确到s。startTime与endTime不允许跨月，默认值取当前月份最后一天</p>
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
         * <p>7000002</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>座席所属外呼组 单个外呼组号2-20位，支持一个或多个座席工号查询，多个座席工号以英文逗号隔开，一次最多支持10个。不支持模糊匹配。</p>
         * 
         * <strong>example:</strong>
         * <p>233</p>
         */
        public Builder gno(String gno) {
            this.putQueryParameter("Gno", gno);
            this.gno = gno;
            return this;
        }

        /**
         * <p>真人接听；取值说明：1-是、0-否</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isRealAnswer(Long isRealAnswer) {
            this.putQueryParameter("IsRealAnswer", isRealAnswer);
            this.isRealAnswer = isRealAnswer;
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
         * <p>示例值示例值</p>
         */
        public Builder province(String province) {
            this.putQueryParameter("Province", province);
            this.province = province;
            return this;
        }

        /**
         * <p>查询请求唯一id对应的记录信息，默认查询当前月，如requestUniqueId不属于当前月，查询时请传递查询参数 查询开始时间(startTime)</p>
         * 
         * <strong>example:</strong>
         * <p>uniq_1-162046xxxx.12</p>
         */
        public Builder requestUniqueId(String requestUniqueId) {
            this.putQueryParameter("RequestUniqueId", requestUniqueId);
            this.requestUniqueId = requestUniqueId;
            return this;
        }

        /**
         * <p>是否返回总条数；取值说明：0: 不返回，1：返回，不传默认为1</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder returnCount(Long returnCount) {
            this.putQueryParameter("ReturnCount", returnCount);
            this.returnCount = returnCount;
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
         * <p>呼叫结果；参数说明： 20 webcall, TTS合成失败； 21 webcall, 客户未接 ； 22:webcall, 客户接听； 23: webcall； 已呼叫； 24: webcall, 双方接听；</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
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
         * <p>用户自定义参数指定查询value；传递该参数时必须传递userFieldKey，仅查询一个字段，不支持模糊匹配，构造的自定义字段查询条件为:{&quot;userFieldkey&quot;:&quot;userFieldvalue&quot;}，此参数需要URLEncode</p>
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
         * <p>用户自定义参数指定查询key；传递该参数时必须传递userFieldValue，仅查询一个字段，不支持模糊匹配，构造的自定义字段查询条件为:{&quot;userFieldkey&quot;:&quot;userFieldvalue&quot;}，此参数需要URLEncode</p>
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
        public CloudQueryWebcallCdrRequest build() {
            return new CloudQueryWebcallCdrRequest(this);
        } 

    } 

}
