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
 * {@link UpdateKnowledgeBaseSourceTagsResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateKnowledgeBaseSourceTagsResponseBody</p>
 */
public class UpdateKnowledgeBaseSourceTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sourceId")
    private String sourceId;

    @com.aliyun.core.annotation.NameInMap("sourceTags")
    private String sourceTags;

    private UpdateKnowledgeBaseSourceTagsResponseBody(Builder builder) {
        this.code = builder.code;
        this.gmtModified = builder.gmtModified;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.sourceId = builder.sourceId;
        this.sourceTags = builder.sourceTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKnowledgeBaseSourceTagsResponseBody create() {
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
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
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
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourceTags
     */
    public String getSourceTags() {
        return this.sourceTags;
    }

    public static final class Builder {
        private String code; 
        private String gmtModified; 
        private String message; 
        private String requestId; 
        private String sourceId; 
        private String sourceTags; 

        private Builder() {
        } 

        private Builder(UpdateKnowledgeBaseSourceTagsResponseBody model) {
            this.code = model.code;
            this.gmtModified = model.gmtModified;
            this.message = model.message;
            this.requestId = model.requestId;
            this.sourceId = model.sourceId;
            this.sourceTags = model.sourceTags;
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
         * <p>最近修改时间，ISO8601 格式</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
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
         * <p>数据源 ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSourceId</p>
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>更新后的资源标签</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder sourceTags(String sourceTags) {
            this.sourceTags = sourceTags;
            return this;
        }

        public UpdateKnowledgeBaseSourceTagsResponseBody build() {
            return new UpdateKnowledgeBaseSourceTagsResponseBody(this);
        } 

    } 

}
