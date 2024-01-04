// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExpectDeductResourceCmd} extends {@link TeaModel}
 *
 * <p>ExpectDeductResourceCmd</p>
 */
public class ExpectDeductResourceCmd extends TeaModel {
    @NameInMap("accountId")
    @Validation(required = true)
    private String accountId;

    @NameInMap("cost")
    @Validation(required = true)
    private Long cost;

    @NameInMap("extraInfo")
    private String extraInfo;

    @NameInMap("idempotentId")
    private String idempotentId;

    @NameInMap("resourceType")
    @Validation(required = true)
    private Long resourceType;

    @NameInMap("subAccountId")
    @Validation(required = true)
    private String subAccountId;

    @NameInMap("token")
    @Validation(required = true)
    private String token;

    private ExpectDeductResourceCmd(Builder builder) {
        this.accountId = builder.accountId;
        this.cost = builder.cost;
        this.extraInfo = builder.extraInfo;
        this.idempotentId = builder.idempotentId;
        this.resourceType = builder.resourceType;
        this.subAccountId = builder.subAccountId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExpectDeductResourceCmd create() {
        return builder().build();
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return cost
     */
    public Long getCost() {
        return this.cost;
    }

    /**
     * @return extraInfo
     */
    public String getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * @return idempotentId
     */
    public String getIdempotentId() {
        return this.idempotentId;
    }

    /**
     * @return resourceType
     */
    public Long getResourceType() {
        return this.resourceType;
    }

    /**
     * @return subAccountId
     */
    public String getSubAccountId() {
        return this.subAccountId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder {
        private String accountId; 
        private Long cost; 
        private String extraInfo; 
        private String idempotentId; 
        private Long resourceType; 
        private String subAccountId; 
        private String token; 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * cost.
         */
        public Builder cost(Long cost) {
            this.cost = cost;
            return this;
        }

        /**
         * extraInfo.
         */
        public Builder extraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * idempotentId.
         */
        public Builder idempotentId(String idempotentId) {
            this.idempotentId = idempotentId;
            return this;
        }

        /**
         * resourceType.
         */
        public Builder resourceType(Long resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * subAccountId.
         */
        public Builder subAccountId(String subAccountId) {
            this.subAccountId = subAccountId;
            return this;
        }

        /**
         * token.
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public ExpectDeductResourceCmd build() {
            return new ExpectDeductResourceCmd(this);
        } 

    } 

}
