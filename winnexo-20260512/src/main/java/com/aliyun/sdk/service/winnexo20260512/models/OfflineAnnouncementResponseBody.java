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
 * {@link OfflineAnnouncementResponseBody} extends {@link TeaModel}
 *
 * <p>OfflineAnnouncementResponseBody</p>
 */
public class OfflineAnnouncementResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("announcementId")
    private Long announcementId;

    @com.aliyun.core.annotation.NameInMap("changed")
    private Boolean changed;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("updatedBy")
    private Long updatedBy;

    private OfflineAnnouncementResponseBody(Builder builder) {
        this.announcementId = builder.announcementId;
        this.changed = builder.changed;
        this.code = builder.code;
        this.gmtModified = builder.gmtModified;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.updatedBy = builder.updatedBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OfflineAnnouncementResponseBody create() {
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
     * @return changed
     */
    public Boolean getChanged() {
        return this.changed;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updatedBy
     */
    public Long getUpdatedBy() {
        return this.updatedBy;
    }

    public static final class Builder {
        private Long announcementId; 
        private Boolean changed; 
        private String code; 
        private String gmtModified; 
        private String message; 
        private String requestId; 
        private String status; 
        private Long updatedBy; 

        private Builder() {
        } 

        private Builder(OfflineAnnouncementResponseBody model) {
            this.announcementId = model.announcementId;
            this.changed = model.changed;
            this.code = model.code;
            this.gmtModified = model.gmtModified;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.updatedBy = model.updatedBy;
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
         * <p>本次调用是否发生 PUBLISHED 到 OFFLINE 状态变更</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder changed(Boolean changed) {
            this.changed = changed;
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
         * <p>公告最近修改时间，ISO8601 格式</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-20T14:00:00+08:00</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
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
         * <p>下线后的公告状态：OFFLINE 或 EXPIRED</p>
         * 
         * <strong>example:</strong>
         * <p>OFFLINE</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>最近操作人平台用户 ID</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder updatedBy(Long updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public OfflineAnnouncementResponseBody build() {
            return new OfflineAnnouncementResponseBody(this);
        } 

    } 

}
