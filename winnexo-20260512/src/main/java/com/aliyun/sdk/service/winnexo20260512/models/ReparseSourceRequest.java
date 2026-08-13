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
 * {@link ReparseSourceRequest} extends {@link RequestModel}
 *
 * <p>ReparseSourceRequest</p>
 */
public class ReparseSourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("forceSync")
    private Boolean forceSync;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ReparseSourceRequest(Builder builder) {
        super(builder);
        this.forceSync = builder.forceSync;
        this.sourceId = builder.sourceId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReparseSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forceSync
     */
    public Boolean getForceSync() {
        return this.forceSync;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ReparseSourceRequest, Builder> {
        private Boolean forceSync; 
        private String sourceId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ReparseSourceRequest request) {
            super(request);
            this.forceSync = request.forceSync;
            this.sourceId = request.sourceId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>是否同步等待重新解析完成；默认 false，异步入队</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forceSync(Boolean forceSync) {
            this.putBodyParameter("forceSync", forceSync);
            this.forceSync = forceSync;
            return this;
        }

        /**
         * <p>待重新解析的数据源 ID（租户内唯一）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSourceId</p>
         */
        public Builder sourceId(String sourceId) {
            this.putBodyParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
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
        public ReparseSourceRequest build() {
            return new ReparseSourceRequest(this);
        } 

    } 

}
