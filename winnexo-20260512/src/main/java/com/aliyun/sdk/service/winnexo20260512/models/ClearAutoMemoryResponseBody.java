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
 * {@link ClearAutoMemoryResponseBody} extends {@link TeaModel}
 *
 * <p>ClearAutoMemoryResponseBody</p>
 */
public class ClearAutoMemoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("clearedCount")
    private Long clearedCount;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ClearAutoMemoryResponseBody(Builder builder) {
        this.clearedCount = builder.clearedCount;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClearAutoMemoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clearedCount
     */
    public Long getClearedCount() {
        return this.clearedCount;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Long clearedCount; 
        private String code; 
        private String message; 
        private String requestId; 
        private String type; 

        private Builder() {
        } 

        private Builder(ClearAutoMemoryResponseBody model) {
            this.clearedCount = model.clearedCount;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.type = model.type;
        } 

        /**
         * <p>本次成功删除的自动记忆文件数量；无可清空记忆时为 0</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder clearedCount(Long clearedCount) {
            this.clearedCount = clearedCount;
            return this;
        }

        /**
         * <p>业务状态码；成功为 200，失败时为对应错误码</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>错误描述；成功时为空字符串，失败时返回具体原因</p>
         * 
         * <strong>example:</strong>
         * <p>当前用户不是群组 cg_12345 的活跃成员</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>请求追踪 ID，用于定位本次调用</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>本次清空的自动记忆类型；取值为 user、feedback、reference、project 或 all</p>
         * 
         * <strong>example:</strong>
         * <p>project</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ClearAutoMemoryResponseBody build() {
            return new ClearAutoMemoryResponseBody(this);
        } 

    } 

}
