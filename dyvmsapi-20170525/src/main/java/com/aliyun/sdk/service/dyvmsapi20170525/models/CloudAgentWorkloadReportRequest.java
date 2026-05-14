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
 * {@link CloudAgentWorkloadReportRequest} extends {@link RequestModel}
 *
 * <p>CloudAgentWorkloadReportRequest</p>
 */
public class CloudAgentWorkloadReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cnos")
    private String cnos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Gnos")
    private String gnos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Long limit;

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
    @com.aliyun.core.annotation.NameInMap("Start")
    private Long start;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatisticMethod")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long statisticMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeRangeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long timeRangeType;

    private CloudAgentWorkloadReportRequest(Builder builder) {
        super(builder);
        this.cnos = builder.cnos;
        this.endTime = builder.endTime;
        this.enterpriseId = builder.enterpriseId;
        this.gnos = builder.gnos;
        this.limit = builder.limit;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.start = builder.start;
        this.startTime = builder.startTime;
        this.statisticMethod = builder.statisticMethod;
        this.timeRangeType = builder.timeRangeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudAgentWorkloadReportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cnos
     */
    public String getCnos() {
        return this.cnos;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return gnos
     */
    public String getGnos() {
        return this.gnos;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
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
     * @return start
     */
    public Long getStart() {
        return this.start;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return statisticMethod
     */
    public Long getStatisticMethod() {
        return this.statisticMethod;
    }

    /**
     * @return timeRangeType
     */
    public Long getTimeRangeType() {
        return this.timeRangeType;
    }

    public static final class Builder extends Request.Builder<CloudAgentWorkloadReportRequest, Builder> {
        private String cnos; 
        private String endTime; 
        private Long enterpriseId; 
        private String gnos; 
        private Long limit; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long start; 
        private String startTime; 
        private Long statisticMethod; 
        private Long timeRangeType; 

        private Builder() {
            super();
        } 

        private Builder(CloudAgentWorkloadReportRequest request) {
            super(request);
            this.cnos = request.cnos;
            this.endTime = request.endTime;
            this.enterpriseId = request.enterpriseId;
            this.gnos = request.gnos;
            this.limit = request.limit;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.start = request.start;
            this.startTime = request.startTime;
            this.statisticMethod = request.statisticMethod;
            this.timeRangeType = request.timeRangeType;
        } 

        /**
         * <p>座席号；说明：根据座席工号查询指定座席的工作量统计支持按照多个座席工号进行查询，多个座席工号之间使用英文逗号&quot;,&quot;分隔，默认查询账户下所有座席的工作量统计</p>
         * 
         * <strong>example:</strong>
         * <p>1111,2222</p>
         */
        public Builder cnos(String cnos) {
            this.putQueryParameter("Cnos", cnos);
            this.cnos = cnos;
            return this;
        }

        /**
         * <p>说明：统计日期的结束时间，格式：yyyy-MM-dd</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-15</p>
         */
        public Builder endTime(String endTime) {
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
         * <p>说明：根据外呼编号查询指定座席的工作量统计,默认查询账户下所有座席的工作量统计</p>
         * 
         * <strong>example:</strong>
         * <p>WH12</p>
         */
        public Builder gnos(String gnos) {
            this.putQueryParameter("Gnos", gnos);
            this.gnos = gnos;
            return this;
        }

        /**
         * <p>查询条数；取值：最大不能超过1000，默认10</p>
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
         * <p>查询起始位置；取值：大于等于0，默认0</p>
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
         * <p>说明：统计日期的开始时间，格式：yyyy-MM-dd</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-13</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>统计方法；说明：0：分时1：分日2：汇总 10：队列汇总</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder statisticMethod(Long statisticMethod) {
            this.putQueryParameter("StatisticMethod", statisticMethod);
            this.statisticMethod = statisticMethod;
            return this;
        }

        /**
         * <p>说明：统计报表类型，1：日报表2：周报表3：月报表4：自定义时间</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder timeRangeType(Long timeRangeType) {
            this.putQueryParameter("TimeRangeType", timeRangeType);
            this.timeRangeType = timeRangeType;
            return this;
        }

        @Override
        public CloudAgentWorkloadReportRequest build() {
            return new CloudAgentWorkloadReportRequest(this);
        } 

    } 

}
