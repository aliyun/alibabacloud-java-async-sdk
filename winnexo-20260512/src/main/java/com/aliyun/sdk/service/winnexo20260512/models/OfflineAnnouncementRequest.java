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
 * {@link OfflineAnnouncementRequest} extends {@link RequestModel}
 *
 * <p>OfflineAnnouncementRequest</p>
 */
public class OfflineAnnouncementRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("announcementId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long announcementId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private OfflineAnnouncementRequest(Builder builder) {
        super(builder);
        this.announcementId = builder.announcementId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OfflineAnnouncementRequest create() {
        return builder().build();
    }

@Override
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
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<OfflineAnnouncementRequest, Builder> {
        private Long announcementId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(OfflineAnnouncementRequest request) {
            super(request);
            this.announcementId = request.announcementId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>公告业务 ID，必须为正整数</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder announcementId(Long announcementId) {
            this.putBodyParameter("announcementId", announcementId);
            this.announcementId = announcementId;
            return this;
        }

        /**
         * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public OfflineAnnouncementRequest build() {
            return new OfflineAnnouncementRequest(this);
        } 

    } 

}
