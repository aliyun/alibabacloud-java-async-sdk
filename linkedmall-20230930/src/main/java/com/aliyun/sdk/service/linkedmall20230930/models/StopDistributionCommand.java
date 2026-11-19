// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link StopDistributionCommand} extends {@link TeaModel}
 *
 * <p>StopDistributionCommand</p>
 */
public class StopDistributionCommand extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("lmShopId")
    private String lmShopId;

    @com.aliyun.core.annotation.NameInMap("productId")
    private String productId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("requestTime")
    private String requestTime;

    @com.aliyun.core.annotation.NameInMap("requestUser")
    private String requestUser;

    private StopDistributionCommand(Builder builder) {
        this.lmShopId = builder.lmShopId;
        this.productId = builder.productId;
        this.requestId = builder.requestId;
        this.requestTime = builder.requestTime;
        this.requestUser = builder.requestUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopDistributionCommand create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lmShopId
     */
    public String getLmShopId() {
        return this.lmShopId;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return requestTime
     */
    public String getRequestTime() {
        return this.requestTime;
    }

    /**
     * @return requestUser
     */
    public String getRequestUser() {
        return this.requestUser;
    }

    public static final class Builder {
        private String lmShopId; 
        private String productId; 
        private String requestId; 
        private String requestTime; 
        private String requestUser; 

        private Builder() {
        } 

        private Builder(StopDistributionCommand model) {
            this.lmShopId = model.lmShopId;
            this.productId = model.productId;
            this.requestId = model.requestId;
            this.requestTime = model.requestTime;
            this.requestUser = model.requestUser;
        } 

        /**
         * <p>The LM shop ID.</p>
         * 
         * <strong>example:</strong>
         * <p>21000019</p>
         */
        public Builder lmShopId(String lmShopId) {
            this.lmShopId = lmShopId;
            return this;
        }

        /**
         * <p>The product ID.</p>
         * 
         * <strong>example:</strong>
         * <p>660057403063402509</p>
         */
        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>48A34399-A72C-1E23-8388-7E63A1B2E927</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The submission time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-01 10:01:00</p>
         */
        public Builder requestTime(String requestTime) {
            this.requestTime = requestTime;
            return this;
        }

        /**
         * <p>The submitter.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_user</p>
         */
        public Builder requestUser(String requestUser) {
            this.requestUser = requestUser;
            return this;
        }

        public StopDistributionCommand build() {
            return new StopDistributionCommand(this);
        } 

    } 

}
