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
 * {@link ClinkStatIbRequest} extends {@link RequestModel}
 *
 * <p>ClinkStatIbRequest</p>
 */
public class ClinkStatIbRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Date")
    @com.aliyun.core.annotation.Validation(required = true)
    private String date;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DateEnd")
    private String dateEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndHour")
    private Long endHour;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndMinute")
    private Long endMinute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Fields")
    private String fields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hotlines")
    private String hotlines;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartHour")
    private Long startHour;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartMinute")
    private Long startMinute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatisticMethod")
    private Long statisticMethod;

    private ClinkStatIbRequest(Builder builder) {
        super(builder);
        this.date = builder.date;
        this.dateEnd = builder.dateEnd;
        this.endHour = builder.endHour;
        this.endMinute = builder.endMinute;
        this.enterpriseId = builder.enterpriseId;
        this.fields = builder.fields;
        this.hotlines = builder.hotlines;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startHour = builder.startHour;
        this.startMinute = builder.startMinute;
        this.statisticMethod = builder.statisticMethod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkStatIbRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return date
     */
    public String getDate() {
        return this.date;
    }

    /**
     * @return dateEnd
     */
    public String getDateEnd() {
        return this.dateEnd;
    }

    /**
     * @return endHour
     */
    public Long getEndHour() {
        return this.endHour;
    }

    /**
     * @return endMinute
     */
    public Long getEndMinute() {
        return this.endMinute;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return fields
     */
    public String getFields() {
        return this.fields;
    }

    /**
     * @return hotlines
     */
    public String getHotlines() {
        return this.hotlines;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return startHour
     */
    public Long getStartHour() {
        return this.startHour;
    }

    /**
     * @return startMinute
     */
    public Long getStartMinute() {
        return this.startMinute;
    }

    /**
     * @return statisticMethod
     */
    public Long getStatisticMethod() {
        return this.statisticMethod;
    }

    public static final class Builder extends Request.Builder<ClinkStatIbRequest, Builder> {
        private String date; 
        private String dateEnd; 
        private Long endHour; 
        private Long endMinute; 
        private Long enterpriseId; 
        private String fields; 
        private String hotlines; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long startHour; 
        private Long startMinute; 
        private Long statisticMethod; 

        private Builder() {
            super();
        } 

        private Builder(ClinkStatIbRequest request) {
            super(request);
            this.date = request.date;
            this.dateEnd = request.dateEnd;
            this.endHour = request.endHour;
            this.endMinute = request.endMinute;
            this.enterpriseId = request.enterpriseId;
            this.fields = request.fields;
            this.hotlines = request.hotlines;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.startHour = request.startHour;
            this.startMinute = request.startMinute;
            this.statisticMethod = request.statisticMethod;
        } 

        /**
         * <p>同步日期，时间格式(yyyyMMdd)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20240303</p>
         */
        public Builder date(String date) {
            this.putQueryParameter("Date", date);
            this.date = date;
            return this;
        }

        /**
         * <p>同步日期截止，时间格式(yyyyMMdd) ，默认与date相同，查询时间范围最大支持6个月</p>
         * 
         * <strong>example:</strong>
         * <p>20240303</p>
         */
        public Builder dateEnd(String dateEnd) {
            this.putQueryParameter("DateEnd", dateEnd);
            this.dateEnd = dateEnd;
            return this;
        }

        /**
         * <p>查询结束时间 (单位：小时，范围：0-23)，缺省值为23</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        public Builder endHour(Long endHour) {
            this.putQueryParameter("EndHour", endHour);
            this.endHour = endHour;
            return this;
        }

        /**
         * <p>查询结束分钟 (单位：分，范围：0、15、30、45、59)，缺省值为59 注：由startHour:startMinute和endHour:endMinute组成的开始时间和结束时间，开始时间不得晚于或等于结束时间。 只使用startHour或endHour时，请注意startMinute与endMinute的缺省值。</p>
         * 
         * <strong>example:</strong>
         * <p>59</p>
         */
        public Builder endMinute(Long endMinute) {
            this.putQueryParameter("EndMinute", endMinute);
            this.endMinute = endMinute;
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
         * <p>指定需要显示的字段 (默认全部)</p>
         * 
         * <strong>example:</strong>
         * <p>ibTotalCount,ibAnsweredCount</p>
         */
        public Builder fields(String fields) {
            this.putQueryParameter("Fields", fields);
            this.fields = fields;
            return this;
        }

        /**
         * <p>热线号码，指定需要查询的热线号码 (默认全部热线号码)</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx,xxxx</p>
         */
        public Builder hotlines(String hotlines) {
            this.putQueryParameter("Hotlines", hotlines);
            this.hotlines = hotlines;
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
         * <p>查询开始时间 (单位：小时，范围：0-23)，缺省值为0</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder startHour(Long startHour) {
            this.putQueryParameter("StartHour", startHour);
            this.startHour = startHour;
            return this;
        }

        /**
         * <p>查询开始分钟 (单位：分，范围：0、15、30、45)，缺省值为0</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder startMinute(Long startMinute) {
            this.putQueryParameter("StartMinute", startMinute);
            this.startMinute = startMinute;
            return this;
        }

        /**
         * <p>统计方式 (默认为2) 取值范围为[2,3]; 2:汇总统计;3:分时统计 注：分时统计下只会返回存在队列工作情况的数据，若队列在该时段没有工作或来电，则不会返回该时段的数据</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder statisticMethod(Long statisticMethod) {
            this.putQueryParameter("StatisticMethod", statisticMethod);
            this.statisticMethod = statisticMethod;
            return this;
        }

        @Override
        public ClinkStatIbRequest build() {
            return new ClinkStatIbRequest(this);
        } 

    } 

}
