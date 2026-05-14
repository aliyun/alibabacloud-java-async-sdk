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
 * {@link CloudQueryTaskRequest} extends {@link RequestModel}
 *
 * <p>CloudQueryTaskRequest</p>
 */
public class CloudQueryTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoStart")
    private Long autoStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoStop")
    private Long autoStop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Long limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

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
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Long status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeType")
    private Long timeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long type;

    private CloudQueryTaskRequest(Builder builder) {
        super(builder);
        this.autoStart = builder.autoStart;
        this.autoStop = builder.autoStop;
        this.endTime = builder.endTime;
        this.enterpriseId = builder.enterpriseId;
        this.limit = builder.limit;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.start = builder.start;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.timeType = builder.timeType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudQueryTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoStart
     */
    public Long getAutoStart() {
        return this.autoStart;
    }

    /**
     * @return autoStop
     */
    public Long getAutoStop() {
        return this.autoStop;
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
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
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
     * @return status
     */
    public Long getStatus() {
        return this.status;
    }

    /**
     * @return timeType
     */
    public Long getTimeType() {
        return this.timeType;
    }

    /**
     * @return type
     */
    public Long getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CloudQueryTaskRequest, Builder> {
        private Long autoStart; 
        private Long autoStop; 
        private String endTime; 
        private Long enterpriseId; 
        private Long limit; 
        private String name; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long start; 
        private String startTime; 
        private Long status; 
        private Long timeType; 
        private Long type; 

        private Builder() {
            super();
        } 

        private Builder(CloudQueryTaskRequest request) {
            super(request);
            this.autoStart = request.autoStart;
            this.autoStop = request.autoStop;
            this.endTime = request.endTime;
            this.enterpriseId = request.enterpriseId;
            this.limit = request.limit;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.start = request.start;
            this.startTime = request.startTime;
            this.status = request.status;
            this.timeType = request.timeType;
            this.type = request.type;
        } 

        /**
         * <p>定时开始；0.关闭 1.开启</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder autoStart(Long autoStart) {
            this.putQueryParameter("AutoStart", autoStart);
            this.autoStart = autoStart;
            return this;
        }

        /**
         * <p>定时结束；0.关闭 1.开启</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder autoStop(Long autoStop) {
            this.putQueryParameter("AutoStop", autoStop);
            this.autoStop = autoStop;
            return this;
        }

        /**
         * <p>查询结束时间；格式说明：&quot;2019-10-11 23:59:59&quot;</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20 20:00:00</p>
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
         * <p>需要取出的数据条数；大于0，最大不能超过100，默认10</p>
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
         * <p>任务名称；需进行UTF-8格式的URLEncode编码</p>
         * 
         * <strong>example:</strong>
         * <p>name1</p>
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
         * <p>从第几条开始获取；大于等于0，默认0</p>
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
         * <p>查询开始时间；格式说明：&quot;2019-10-11 00:00:00&quot;</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20 10:00:00</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>任务状态；0.初始 1.运行中 2.暂停 3.结束</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder status(Long status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>时间过滤条件；1.任务启动时间 2.任务结束时间 3.任务创建时间</p>
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
         * <p>任务类型；1.预测外呼任务 2.自动外呼任务</p>
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
        public CloudQueryTaskRequest build() {
            return new CloudQueryTaskRequest(this);
        } 

    } 

}
