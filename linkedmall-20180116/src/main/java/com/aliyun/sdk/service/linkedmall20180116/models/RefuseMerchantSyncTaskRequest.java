// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link RefuseMerchantSyncTaskRequest} extends {@link RequestModel}
 *
 * <p>RefuseMerchantSyncTaskRequest</p>
 */
public class RefuseMerchantSyncTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SellerNick")
    private String sellerNick;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeStamp")
    private Long timeStamp;

    private RefuseMerchantSyncTaskRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.sellerNick = builder.sellerNick;
        this.taskId = builder.taskId;
        this.timeStamp = builder.timeStamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefuseMerchantSyncTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return sellerNick
     */
    public String getSellerNick() {
        return this.sellerNick;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return timeStamp
     */
    public Long getTimeStamp() {
        return this.timeStamp;
    }

    public static final class Builder extends Request.Builder<RefuseMerchantSyncTaskRequest, Builder> {
        private String bizId; 
        private String sellerNick; 
        private String taskId; 
        private Long timeStamp; 

        private Builder() {
            super();
        } 

        private Builder(RefuseMerchantSyncTaskRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.sellerNick = request.sellerNick;
            this.taskId = request.taskId;
            this.timeStamp = request.timeStamp;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20190325****</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * SellerNick.
         */
        public Builder sellerNick(String sellerNick) {
            this.putQueryParameter("SellerNick", sellerNick);
            this.sellerNick = sellerNick;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * TimeStamp.
         */
        public Builder timeStamp(Long timeStamp) {
            this.putQueryParameter("TimeStamp", timeStamp);
            this.timeStamp = timeStamp;
            return this;
        }

        @Override
        public RefuseMerchantSyncTaskRequest build() {
            return new RefuseMerchantSyncTaskRequest(this);
        } 

    } 

}
