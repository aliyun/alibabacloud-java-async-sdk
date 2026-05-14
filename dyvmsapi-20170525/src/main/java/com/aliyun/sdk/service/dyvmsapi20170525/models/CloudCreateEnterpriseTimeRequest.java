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
 * {@link CloudCreateEnterpriseTimeRequest} extends {@link RequestModel}
 *
 * <p>CloudCreateEnterpriseTimeRequest</p>
 */
public class CloudCreateEnterpriseTimeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DayOfWeek")
    private String dayOfWeek;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromDay")
    private String fromDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long timeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToDay")
    private String toDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long type;

    private CloudCreateEnterpriseTimeRequest(Builder builder) {
        super(builder);
        this.dayOfWeek = builder.dayOfWeek;
        this.endTime = builder.endTime;
        this.enterpriseId = builder.enterpriseId;
        this.fromDay = builder.fromDay;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.priority = builder.priority;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startTime = builder.startTime;
        this.timeType = builder.timeType;
        this.toDay = builder.toDay;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudCreateEnterpriseTimeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dayOfWeek
     */
    public String getDayOfWeek() {
        return this.dayOfWeek;
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
     * @return fromDay
     */
    public String getFromDay() {
        return this.fromDay;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return priority
     */
    public Long getPriority() {
        return this.priority;
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
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return timeType
     */
    public Long getTimeType() {
        return this.timeType;
    }

    /**
     * @return toDay
     */
    public String getToDay() {
        return this.toDay;
    }

    /**
     * @return type
     */
    public Long getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CloudCreateEnterpriseTimeRequest, Builder> {
        private String dayOfWeek; 
        private String endTime; 
        private Long enterpriseId; 
        private String fromDay; 
        private String name; 
        private Long ownerId; 
        private Long priority; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String startTime; 
        private Long timeType; 
        private String toDay; 
        private Long type; 

        private Builder() {
            super();
        } 

        private Builder(CloudCreateEnterpriseTimeRequest request) {
            super(request);
            this.dayOfWeek = request.dayOfWeek;
            this.endTime = request.endTime;
            this.enterpriseId = request.enterpriseId;
            this.fromDay = request.fromDay;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.priority = request.priority;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.startTime = request.startTime;
            this.timeType = request.timeType;
            this.toDay = request.toDay;
            this.type = request.type;
        } 

        /**
         * <p>当type=1 时必选,周一：2、周二：3、周三：4、周四：5、周五：6、周六：7、周日：1。星期值以,分隔 例如： 2,3,4代表周一周二周三、type=2时为空串</p>
         * 
         * <strong>example:</strong>
         * <p>2,3,4</p>
         */
        public Builder dayOfWeek(String dayOfWeek) {
            this.putQueryParameter("DayOfWeek", dayOfWeek);
            this.dayOfWeek = dayOfWeek;
            return this;
        }

        /**
         * <p>结束时间；格式为 HH:mm 例如、 19:00 startTime不能大于endTime</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>19:00</p>
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
         * <p>起始日期；当type=2 时必选，格式为：yyyy-MM-dd 、type=1时为空串 fromDay不能大于toDay</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20</p>
         */
        public Builder fromDay(String fromDay) {
            this.putQueryParameter("FromDay", fromDay);
            this.fromDay = fromDay;
            return this;
        }

        /**
         * <p>时间条件名称；同一呼叫中心下不能重复</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo01</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * <p>时间条件优先级；同一呼叫中心下不能重复，值从1开始，值越小优先级越高</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder priority(Long priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
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
         * <p>开始时间；格式为 HH:mm 例如、 06:00 startTime不能大于endTime</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>06:00</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>时间类型 1.连续 2.间隔</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder timeType(Long timeType) {
            this.putQueryParameter("TimeType", timeType);
            this.timeType = timeType;
            return this;
        }

        /**
         * <p>终止日期；当type=2 时必选，格式为：yyyy-MM-dd 、type=1时为空串 fromDay不能大于toDay</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-25</p>
         */
        public Builder toDay(String toDay) {
            this.putQueryParameter("ToDay", toDay);
            this.toDay = toDay;
            return this;
        }

        /**
         * <p>条件类型 1:按照星期配置 2:按照固定时间配置</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder type(Long type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CloudCreateEnterpriseTimeRequest build() {
            return new CloudCreateEnterpriseTimeRequest(this);
        } 

    } 

}
