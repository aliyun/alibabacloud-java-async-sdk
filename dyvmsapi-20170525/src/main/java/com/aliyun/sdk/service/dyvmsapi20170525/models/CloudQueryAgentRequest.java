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
 * {@link CloudQueryAgentRequest} extends {@link RequestModel}
 *
 * <p>CloudQueryAgentRequest</p>
 */
public class CloudQueryAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Active")
    private Long active;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cnos")
    private String cnos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

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
    @com.aliyun.core.annotation.NameInMap("Order")
    private Long order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Qno")
    private String qno;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReturnQueue")
    private Long returnQueue;

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
    @com.aliyun.core.annotation.NameInMap("WebrtcUrlType")
    private Long webrtcUrlType;

    private CloudQueryAgentRequest(Builder builder) {
        super(builder);
        this.active = builder.active;
        this.cnos = builder.cnos;
        this.comment = builder.comment;
        this.endTime = builder.endTime;
        this.enterpriseId = builder.enterpriseId;
        this.limit = builder.limit;
        this.name = builder.name;
        this.order = builder.order;
        this.ownerId = builder.ownerId;
        this.qno = builder.qno;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.returnQueue = builder.returnQueue;
        this.start = builder.start;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.webrtcUrlType = builder.webrtcUrlType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudQueryAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return active
     */
    public Long getActive() {
        return this.active;
    }

    /**
     * @return cnos
     */
    public String getCnos() {
        return this.cnos;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
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
     * @return order
     */
    public Long getOrder() {
        return this.order;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return qno
     */
    public String getQno() {
        return this.qno;
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
     * @return returnQueue
     */
    public Long getReturnQueue() {
        return this.returnQueue;
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
     * @return webrtcUrlType
     */
    public Long getWebrtcUrlType() {
        return this.webrtcUrlType;
    }

    public static final class Builder extends Request.Builder<CloudQueryAgentRequest, Builder> {
        private Long active; 
        private String cnos; 
        private String comment; 
        private String endTime; 
        private Long enterpriseId; 
        private Long limit; 
        private String name; 
        private Long order; 
        private Long ownerId; 
        private String qno; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long returnQueue; 
        private Long start; 
        private String startTime; 
        private Long status; 
        private Long webrtcUrlType; 

        private Builder() {
            super();
        } 

        private Builder(CloudQueryAgentRequest request) {
            super(request);
            this.active = request.active;
            this.cnos = request.cnos;
            this.comment = request.comment;
            this.endTime = request.endTime;
            this.enterpriseId = request.enterpriseId;
            this.limit = request.limit;
            this.name = request.name;
            this.order = request.order;
            this.ownerId = request.ownerId;
            this.qno = request.qno;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.returnQueue = request.returnQueue;
            this.start = request.start;
            this.startTime = request.startTime;
            this.status = request.status;
            this.webrtcUrlType = request.webrtcUrlType;
        } 

        /**
         * <p>是否启用；正整数，只能是0或者1，0是停用，1是启用</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder active(Long active) {
            this.putQueryParameter("Active", active);
            this.active = active;
            return this;
        }

        /**
         * <p>多个座席号以英文逗号分隔 最多支持500个座席</p>
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
         * <p>通过座席备注信息检索；取值说明：前缀模糊匹配</p>
         * 
         * <strong>example:</strong>
         * <p>comment1</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>创建时间终止时间点；取值说明：&quot;2019-10-11 23:59:59&quot;</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20 12:00:00</p>
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
         * <p>查询条数；正整数，大于0，最大不能超过1000，默认10</p>
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
         * <p>通过座席名称检索；取值说明：前后缀模糊匹配</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>排序方式,按照创建时间排序；0正序 1倒序</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder order(Long order) {
            this.putQueryParameter("Order", order);
            this.order = order;
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
         * <p>队列号；当qno不为空时，查询指定队列的所有座席记录</p>
         * 
         * <strong>example:</strong>
         * <p>333</p>
         */
        public Builder qno(String qno) {
            this.putQueryParameter("Qno", qno);
            this.qno = qno;
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
         * <p>是否返回绑定座席的队列信息；0:不返回 1:需要返回 默认值:1</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder returnQueue(Long returnQueue) {
            this.putQueryParameter("ReturnQueue", returnQueue);
            this.returnQueue = returnQueue;
            return this;
        }

        /**
         * <p>从第几条开始；正整数，大于等于0，默认0</p>
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
         * <p>创建时间起始时间点；取值说明：&quot;2019-10-11 00:00:00&quot;</p>
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
         * <p>是否在线；正整数，只能是0或者1，0是离线，1是在线</p>
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
         * <p>webrtc软电话返回地址；取值说明：0：企业默认 1：公网域名 2：专线域名 3：公网IP 4：专线IP</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder webrtcUrlType(Long webrtcUrlType) {
            this.putQueryParameter("WebrtcUrlType", webrtcUrlType);
            this.webrtcUrlType = webrtcUrlType;
            return this;
        }

        @Override
        public CloudQueryAgentRequest build() {
            return new CloudQueryAgentRequest(this);
        } 

    } 

}
