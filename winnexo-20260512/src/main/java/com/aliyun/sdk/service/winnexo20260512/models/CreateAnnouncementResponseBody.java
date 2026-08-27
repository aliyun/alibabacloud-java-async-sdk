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
 * {@link CreateAnnouncementResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAnnouncementResponseBody</p>
 */
public class CreateAnnouncementResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("announcementId")
    private Long announcementId;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("createdBy")
    private Long createdBy;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("publishedAt")
    private String publishedAt;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private CreateAnnouncementResponseBody(Builder builder) {
        this.announcementId = builder.announcementId;
        this.code = builder.code;
        this.createdBy = builder.createdBy;
        this.message = builder.message;
        this.publishedAt = builder.publishedAt;
        this.requestId = builder.requestId;
        this.sourceType = builder.sourceType;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAnnouncementResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return announcementId
     */
    public Long getAnnouncementId() {
        return this.announcementId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return createdBy
     */
    public Long getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return publishedAt
     */
    public String getPublishedAt() {
        return this.publishedAt;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private Long announcementId; 
        private String code; 
        private Long createdBy; 
        private String message; 
        private String publishedAt; 
        private String requestId; 
        private String sourceType; 
        private String status; 

        private Builder() {
        } 

        private Builder(CreateAnnouncementResponseBody model) {
            this.announcementId = model.announcementId;
            this.code = model.code;
            this.createdBy = model.createdBy;
            this.message = model.message;
            this.publishedAt = model.publishedAt;
            this.requestId = model.requestId;
            this.sourceType = model.sourceType;
            this.status = model.status;
        } 

        /**
         * <p>公告业务 ID</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder announcementId(Long announcementId) {
            this.announcementId = announcementId;
            return this;
        }

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>创建人平台用户 ID</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder createdBy(Long createdBy) {
            this.createdBy = createdBy;
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
         * <p>发布时间；草稿为空，ISO8601 格式</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-20T14:00:00+08:00</p>
         */
        public Builder publishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
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
         * <p>公告来源，固定为 PLATFORM</p>
         * 
         * <strong>example:</strong>
         * <p>PLATFORM</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>公告状态：DRAFT 或 PUBLISHED</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLISHED</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreateAnnouncementResponseBody build() {
            return new CreateAnnouncementResponseBody(this);
        } 

    } 

}
