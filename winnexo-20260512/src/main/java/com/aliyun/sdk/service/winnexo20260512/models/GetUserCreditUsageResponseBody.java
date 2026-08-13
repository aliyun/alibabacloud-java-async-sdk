// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link GetUserCreditUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserCreditUsageResponseBody</p>
 */
public class GetUserCreditUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("creditLimit")
    private String creditLimit;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("remainingCredits")
    private String remainingCredits;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("shadowCreditLimit")
    private String shadowCreditLimit;

    @com.aliyun.core.annotation.NameInMap("shadowRemainingCredits")
    private String shadowRemainingCredits;

    @com.aliyun.core.annotation.NameInMap("shadowUsedCredits")
    private String shadowUsedCredits;

    @com.aliyun.core.annotation.NameInMap("tenantId")
    private Long tenantId;

    @com.aliyun.core.annotation.NameInMap("usedCredits")
    private String usedCredits;

    @com.aliyun.core.annotation.NameInMap("userId")
    private Long userId;

    private GetUserCreditUsageResponseBody(Builder builder) {
        this.code = builder.code;
        this.creditLimit = builder.creditLimit;
        this.message = builder.message;
        this.remainingCredits = builder.remainingCredits;
        this.requestId = builder.requestId;
        this.shadowCreditLimit = builder.shadowCreditLimit;
        this.shadowRemainingCredits = builder.shadowRemainingCredits;
        this.shadowUsedCredits = builder.shadowUsedCredits;
        this.tenantId = builder.tenantId;
        this.usedCredits = builder.usedCredits;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserCreditUsageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return creditLimit
     */
    public String getCreditLimit() {
        return this.creditLimit;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return remainingCredits
     */
    public String getRemainingCredits() {
        return this.remainingCredits;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return shadowCreditLimit
     */
    public String getShadowCreditLimit() {
        return this.shadowCreditLimit;
    }

    /**
     * @return shadowRemainingCredits
     */
    public String getShadowRemainingCredits() {
        return this.shadowRemainingCredits;
    }

    /**
     * @return shadowUsedCredits
     */
    public String getShadowUsedCredits() {
        return this.shadowUsedCredits;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    /**
     * @return usedCredits
     */
    public String getUsedCredits() {
        return this.usedCredits;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String code; 
        private String creditLimit; 
        private String message; 
        private String remainingCredits; 
        private String requestId; 
        private String shadowCreditLimit; 
        private String shadowRemainingCredits; 
        private String shadowUsedCredits; 
        private Long tenantId; 
        private String usedCredits; 
        private Long userId; 

        private Builder() {
        } 

        private Builder(GetUserCreditUsageResponseBody model) {
            this.code = model.code;
            this.creditLimit = model.creditLimit;
            this.message = model.message;
            this.remainingCredits = model.remainingCredits;
            this.requestId = model.requestId;
            this.shadowCreditLimit = model.shadowCreditLimit;
            this.shadowRemainingCredits = model.shadowRemainingCredits;
            this.shadowUsedCredits = model.shadowUsedCredits;
            this.tenantId = model.tenantId;
            this.usedCredits = model.usedCredits;
            this.userId = model.userId;
        } 

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>用户 credit 限额</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder creditLimit(String creditLimit) {
            this.creditLimit = creditLimit;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>The current zone list is illegal.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>剩余 credit（实时，来自 Redis）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder remainingCredits(String remainingCredits) {
            this.remainingCredits = remainingCredits;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>影子 credit 限额</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder shadowCreditLimit(String shadowCreditLimit) {
            this.shadowCreditLimit = shadowCreditLimit;
            return this;
        }

        /**
         * <p>剩余影子 credit（实时，来自 Redis）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder shadowRemainingCredits(String shadowRemainingCredits) {
            this.shadowRemainingCredits = shadowRemainingCredits;
            return this;
        }

        /**
         * <p>已消耗影子 credit（实时，来自 Redis）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder shadowUsedCredits(String shadowUsedCredits) {
            this.shadowUsedCredits = shadowUsedCredits;
            return this;
        }

        /**
         * <p>租户ID</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>已消耗 credit（实时，来自 Redis）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder usedCredits(String usedCredits) {
            this.usedCredits = usedCredits;
            return this;
        }

        /**
         * <p>用户ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public GetUserCreditUsageResponseBody build() {
            return new GetUserCreditUsageResponseBody(this);
        } 

    } 

}
