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
 * {@link ListAliDingGroupMessagesRequest} extends {@link RequestModel}
 *
 * <p>ListAliDingGroupMessagesRequest</p>
 */
public class ListAliDingGroupMessagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appToken")
    private String appToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("chatId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chatId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserCode")
    private String opsUserCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserId")
    private String opsUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("time")
    @com.aliyun.core.annotation.Validation(required = true)
    private String time;

    private ListAliDingGroupMessagesRequest(Builder builder) {
        super(builder);
        this.appToken = builder.appToken;
        this.chatId = builder.chatId;
        this.direction = builder.direction;
        this.opsUserCode = builder.opsUserCode;
        this.opsUserId = builder.opsUserId;
        this.pageSize = builder.pageSize;
        this.tenantId = builder.tenantId;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAliDingGroupMessagesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appToken
     */
    public String getAppToken() {
        return this.appToken;
    }

    /**
     * @return chatId
     */
    public String getChatId() {
        return this.chatId;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return opsUserCode
     */
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    /**
     * @return opsUserId
     */
    public String getOpsUserId() {
        return this.opsUserId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder extends Request.Builder<ListAliDingGroupMessagesRequest, Builder> {
        private String appToken; 
        private String chatId; 
        private String direction; 
        private String opsUserCode; 
        private String opsUserId; 
        private Integer pageSize; 
        private String tenantId; 
        private String time; 

        private Builder() {
            super();
        } 

        private Builder(ListAliDingGroupMessagesRequest request) {
            super(request);
            this.appToken = request.appToken;
            this.chatId = request.chatId;
            this.direction = request.direction;
            this.opsUserCode = request.opsUserCode;
            this.opsUserId = request.opsUserId;
            this.pageSize = request.pageSize;
            this.tenantId = request.tenantId;
            this.time = request.time;
        } 

        /**
         * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
         * 
         * <strong>example:</strong>
         * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder appToken(String appToken) {
            this.putQueryParameter("appToken", appToken);
            this.appToken = appToken;
            return this;
        }

        /**
         * <p>The session ID, typically used for JSSDK.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cid-example</p>
         */
        public Builder chatId(String chatId) {
            this.putBodyParameter("chatId", chatId);
            this.chatId = chatId;
            return this;
        }

        /**
         * <p>The traffic direction. Valid values:</p>
         * <ul>
         * <li>OutBound: outbound.</li>
         * <li>InBound: inbound.</li>
         * <li>Both: bidirectional.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>newer</p>
         */
        public Builder direction(String direction) {
            this.putBodyParameter("direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder opsUserCode(String opsUserCode) {
            this.putQueryParameter("opsUserCode", opsUserCode);
            this.opsUserCode = opsUserCode;
            return this;
        }

        /**
         * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder opsUserId(String opsUserId) {
            this.putQueryParameter("opsUserId", opsUserId);
            this.opsUserId = opsUserId;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. Pass it explicitly through <code>--tenant-id</code> in winnexo-cli.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The relationship information.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-08T09:00:00+08:00</p>
         */
        public Builder time(String time) {
            this.putBodyParameter("time", time);
            this.time = time;
            return this;
        }

        @Override
        public ListAliDingGroupMessagesRequest build() {
            return new ListAliDingGroupMessagesRequest(this);
        } 

    } 

}
