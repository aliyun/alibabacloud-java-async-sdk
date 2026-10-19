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
 * {@link UpdateMemoryAutoExtractionSwitchResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateMemoryAutoExtractionSwitchResponseBody</p>
 */
public class UpdateMemoryAutoExtractionSwitchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("clearedCount")
    private Long clearedCount;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private UpdateMemoryAutoExtractionSwitchResponseBody(Builder builder) {
        this.clearedCount = builder.clearedCount;
        this.code = builder.code;
        this.enabled = builder.enabled;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMemoryAutoExtractionSwitchResponseBody create() {
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
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
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

    public static final class Builder {
        private Long clearedCount; 
        private String code; 
        private Boolean enabled; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateMemoryAutoExtractionSwitchResponseBody model) {
            this.clearedCount = model.clearedCount;
            this.code = model.code;
            this.enabled = model.enabled;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>本次同步清空的自动记忆文件数量；未清空或无可清空记忆时为 0</p>
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
         * <p>更新后的自动记忆拾取开关状态；true 为开启，false 为关闭</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
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

        public UpdateMemoryAutoExtractionSwitchResponseBody build() {
            return new UpdateMemoryAutoExtractionSwitchResponseBody(this);
        } 

    } 

}
