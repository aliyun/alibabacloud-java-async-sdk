// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.unimkt20181212.models;

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
 * {@link QueryContentListRequest} extends {@link RequestModel}
 *
 * <p>QueryContentListRequest</p>
 */
public class QueryContentListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BrandUserId")
    @com.aliyun.core.annotation.Validation()
    private Long brandUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BrandUserNick")
    private String brandUserNick;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long proxyUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskBizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskBizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    private QueryContentListRequest(Builder builder) {
        super(builder);
        this.brandUserId = builder.brandUserId;
        this.brandUserNick = builder.brandUserNick;
        this.channelId = builder.channelId;
        this.proxyUserId = builder.proxyUserId;
        this.taskBizType = builder.taskBizType;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryContentListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return brandUserId
     */
    public Long getBrandUserId() {
        return this.brandUserId;
    }

    /**
     * @return brandUserNick
     */
    public String getBrandUserNick() {
        return this.brandUserNick;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return proxyUserId
     */
    public Long getProxyUserId() {
        return this.proxyUserId;
    }

    /**
     * @return taskBizType
     */
    public String getTaskBizType() {
        return this.taskBizType;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<QueryContentListRequest, Builder> {
        private Long brandUserId; 
        private String brandUserNick; 
        private String channelId; 
        private Long proxyUserId; 
        private String taskBizType; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(QueryContentListRequest request) {
            super(request);
            this.brandUserId = request.brandUserId;
            this.brandUserNick = request.brandUserNick;
            this.channelId = request.channelId;
            this.proxyUserId = request.proxyUserId;
            this.taskBizType = request.taskBizType;
            this.taskType = request.taskType;
        } 

        /**
         * BrandUserId.
         */
        public Builder brandUserId(Long brandUserId) {
            this.putQueryParameter("BrandUserId", brandUserId);
            this.brandUserId = brandUserId;
            return this;
        }

        /**
         * BrandUserNick.
         */
        public Builder brandUserNick(String brandUserNick) {
            this.putQueryParameter("BrandUserNick", brandUserNick);
            this.brandUserNick = brandUserNick;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder proxyUserId(Long proxyUserId) {
            this.putQueryParameter("ProxyUserId", proxyUserId);
            this.proxyUserId = proxyUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder taskBizType(String taskBizType) {
            this.putQueryParameter("TaskBizType", taskBizType);
            this.taskBizType = taskBizType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public QueryContentListRequest build() {
            return new QueryContentListRequest(this);
        } 

    } 

}
