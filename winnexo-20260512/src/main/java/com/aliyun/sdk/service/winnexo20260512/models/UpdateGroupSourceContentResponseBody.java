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
 * {@link UpdateGroupSourceContentResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateGroupSourceContentResponseBody</p>
 */
public class UpdateGroupSourceContentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sourceId")
    private String sourceId;

    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private UpdateGroupSourceContentResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGroupSourceContentResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String name; 
        private String requestId; 
        private String sourceId; 
        private String sourceType; 
        private String status; 

        private Builder() {
        } 

        private Builder(UpdateGroupSourceContentResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.name = model.name;
            this.requestId = model.requestId;
            this.sourceId = model.sourceId;
            this.sourceType = model.sourceType;
            this.status = model.status;
        } 

        /**
         * <p>业务状态码；成功为200</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>错误描述</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>操作后的资料名称，沿用已有名称维护规则</p>
         * 
         * <strong>example:</strong>
         * <p>项目资料</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>请求追踪ID</p>
         * 
         * <strong>example:</strong>
         * <p>C474BFC7-7B11-5D92-971E-74AA82EC495B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>资料 ID；替换、编辑、重新解析均保持该 ID</p>
         * 
         * <strong>example:</strong>
         * <p>source_example</p>
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>资料类型</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>当前资料状态；RUNNING 表示处理中，异步受理不代表解析完成</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public UpdateGroupSourceContentResponseBody build() {
            return new UpdateGroupSourceContentResponseBody(this);
        } 

    } 

}
