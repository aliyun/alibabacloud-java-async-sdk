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
 * {@link MarkTodosReadRequest} extends {@link RequestModel}
 *
 * <p>MarkTodosReadRequest</p>
 */
public class MarkTodosReadRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appToken")
    private String appToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("markAllRead")
    private Boolean markAllRead;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserCode")
    private String opsUserCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserId")
    private String opsUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("todoIds")
    private java.util.List<String> todoIds;

    private MarkTodosReadRequest(Builder builder) {
        super(builder);
        this.appToken = builder.appToken;
        this.markAllRead = builder.markAllRead;
        this.opsUserCode = builder.opsUserCode;
        this.opsUserId = builder.opsUserId;
        this.tenantId = builder.tenantId;
        this.todoIds = builder.todoIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MarkTodosReadRequest create() {
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
     * @return markAllRead
     */
    public Boolean getMarkAllRead() {
        return this.markAllRead;
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
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return todoIds
     */
    public java.util.List<String> getTodoIds() {
        return this.todoIds;
    }

    public static final class Builder extends Request.Builder<MarkTodosReadRequest, Builder> {
        private String appToken; 
        private Boolean markAllRead; 
        private String opsUserCode; 
        private String opsUserId; 
        private String tenantId; 
        private java.util.List<String> todoIds; 

        private Builder() {
            super();
        } 

        private Builder(MarkTodosReadRequest request) {
            super(request);
            this.appToken = request.appToken;
            this.markAllRead = request.markAllRead;
            this.opsUserCode = request.opsUserCode;
            this.opsUserId = request.opsUserId;
            this.tenantId = request.tenantId;
            this.todoIds = request.todoIds;
        } 

        /**
         * <p>The platform application token issued by the console. If you specify this parameter, the operation is performed as the user specified by opsUserId or opsUserCode.</p>
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
         * <p>Specifies whether to mark all to-do items as read. This parameter takes precedence over todoIds.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder markAllRead(Boolean markAllRead) {
            this.putBodyParameter("markAllRead", markAllRead);
            this.markAllRead = markAllRead;
            return this;
        }

        /**
         * <p>The code of the proxy user, which is unique within the tenant. This parameter is used only when the application credential is configured as source_uid.</p>
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
         * <p>The ID of the proxy user, which is the WINNEXO platform user ID. This parameter is used only when the application credential is configured as winnexo_uid.</p>
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
         * <p>The list of to-do IDs. You can specify up to 100 IDs. This parameter is ignored when markAllRead is set to true.</p>
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
         * <p>The list of to-do IDs. You can specify up to 100 IDs. This parameter is ignored when markAllRead is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;todo_abc123&quot;,&quot;todo_def456&quot;]</p>
         */
        public Builder todoIds(java.util.List<String> todoIds) {
            String todoIdsShrink = shrink(todoIds, "todoIds", "json");
            this.putBodyParameter("todoIds", todoIdsShrink);
            this.todoIds = todoIds;
            return this;
        }

        @Override
        public MarkTodosReadRequest build() {
            return new MarkTodosReadRequest(this);
        } 

    } 

}
