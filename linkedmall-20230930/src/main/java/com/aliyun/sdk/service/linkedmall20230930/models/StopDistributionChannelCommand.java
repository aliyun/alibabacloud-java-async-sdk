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
 * {@link StopDistributionChannelCommand} extends {@link TeaModel}
 *
 * <p>StopDistributionChannelCommand</p>
 */
public class StopDistributionChannelCommand extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("channelCodes")
    private java.util.List<String> channelCodes;

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

    private StopDistributionChannelCommand(Builder builder) {
        this.channelCodes = builder.channelCodes;
        this.lmShopId = builder.lmShopId;
        this.productId = builder.productId;
        this.requestId = builder.requestId;
        this.requestTime = builder.requestTime;
        this.requestUser = builder.requestUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopDistributionChannelCommand create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelCodes
     */
    public java.util.List<String> getChannelCodes() {
        return this.channelCodes;
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
        private java.util.List<String> channelCodes; 
        private String lmShopId; 
        private String productId; 
        private String requestId; 
        private String requestTime; 
        private String requestUser; 

        private Builder() {
        } 

        private Builder(StopDistributionChannelCommand model) {
            this.channelCodes = model.channelCodes;
            this.lmShopId = model.lmShopId;
            this.productId = model.productId;
            this.requestId = model.requestId;
            this.requestTime = model.requestTime;
            this.requestUser = model.requestUser;
        } 

        /**
         * <p>The set of channel IDs.</p>
         */
        public Builder channelCodes(java.util.List<String> channelCodes) {
            this.channelCodes = channelCodes;
            return this;
        }

        /**
         * <p>The store ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1100001</p>
         */
        public Builder lmShopId(String lmShopId) {
            this.lmShopId = lmShopId;
            return this;
        }

        /**
         * <p>The commodity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>660******080</p>
         */
        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>841471F6-5D61-1331-8C38-2****B55</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The request time. Format: YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01 00:00:00</p>
         */
        public Builder requestTime(String requestTime) {
            this.requestTime = requestTime;
            return this;
        }

        /**
         * <p>The requesting user.</p>
         * 
         * <strong>example:</strong>
         * <p>12000000001</p>
         */
        public Builder requestUser(String requestUser) {
            this.requestUser = requestUser;
            return this;
        }

        public StopDistributionChannelCommand build() {
            return new StopDistributionChannelCommand(this);
        } 

    } 

}
