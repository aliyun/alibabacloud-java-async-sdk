// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yunjian20211217.models;

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
 * {@link CreateDemandPlanV2Request} extends {@link RequestModel}
 *
 * <p>CreateDemandPlanV2Request</p>
 */
public class CreateDemandPlanV2Request extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("Yun-User-Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String yunUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("accountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productType")
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetCid")
    private Long targetCid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("userId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private CreateDemandPlanV2Request(Builder builder) {
        super(builder);
        this.yunUserId = builder.yunUserId;
        this.accountId = builder.accountId;
        this.description = builder.description;
        this.name = builder.name;
        this.productType = builder.productType;
        this.targetCid = builder.targetCid;
        this.type = builder.type;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDemandPlanV2Request create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return yunUserId
     */
    public String getYunUserId() {
        return this.yunUserId;
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return targetCid
     */
    public Long getTargetCid() {
        return this.targetCid;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateDemandPlanV2Request, Builder> {
        private String yunUserId; 
        private String accountId; 
        private String description; 
        private String name; 
        private String productType; 
        private Long targetCid; 
        private String type; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDemandPlanV2Request request) {
            super(request);
            this.yunUserId = request.yunUserId;
            this.accountId = request.accountId;
            this.description = request.description;
            this.name = request.name;
            this.productType = request.productType;
            this.targetCid = request.targetCid;
            this.type = request.type;
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder yunUserId(String yunUserId) {
            this.putHeaderParameter("Yun-User-Id", yunUserId);
            this.yunUserId = yunUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder accountId(String accountId) {
            this.putBodyParameter("accountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * productType.
         */
        public Builder productType(String productType) {
            this.putBodyParameter("productType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * targetCid.
         */
        public Builder targetCid(Long targetCid) {
            this.putBodyParameter("targetCid", targetCid);
            this.targetCid = targetCid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateDemandPlanV2Request build() {
            return new CreateDemandPlanV2Request(this);
        } 

    } 

}
