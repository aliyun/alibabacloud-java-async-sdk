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
 * {@link GetTokenInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetTokenInfoResponseBody</p>
 */
public class GetTokenInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("tokenMasked")
    private String tokenMasked;

    private GetTokenInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.enabled = builder.enabled;
        this.gmtCreate = builder.gmtCreate;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.tokenMasked = builder.tokenMasked;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTokenInfoResponseBody create() {
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
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tokenMasked
     */
    public String getTokenMasked() {
        return this.tokenMasked;
    }

    public static final class Builder {
        private String code; 
        private Boolean enabled; 
        private String gmtCreate; 
        private String message; 
        private String requestId; 
        private String tokenMasked; 

        private Builder() {
        } 

        private Builder(GetTokenInfoResponseBody model) {
            this.code = model.code;
            this.enabled = model.enabled;
            this.gmtCreate = model.gmtCreate;
            this.message = model.message;
            this.requestId = model.requestId;
            this.tokenMasked = model.tokenMasked;
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
         * <p>Token 是否开启（存在 ACTIVE 状态的 Token）</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>Token 创建时间（ISO 8601）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
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
         * <p>脱敏后的 Token 值</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder tokenMasked(String tokenMasked) {
            this.tokenMasked = tokenMasked;
            return this;
        }

        public GetTokenInfoResponseBody build() {
            return new GetTokenInfoResponseBody(this);
        } 

    } 

}
