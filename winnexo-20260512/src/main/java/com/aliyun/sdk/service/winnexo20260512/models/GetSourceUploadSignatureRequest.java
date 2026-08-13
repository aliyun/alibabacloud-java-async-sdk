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
 * {@link GetSourceUploadSignatureRequest} extends {@link RequestModel}
 *
 * <p>GetSourceUploadSignatureRequest</p>
 */
public class GetSourceUploadSignatureRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contentType")
    private String contentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expires")
    private Long expires;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("filename")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filename;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    private String operatingObjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scope")
    private String scope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private GetSourceUploadSignatureRequest(Builder builder) {
        super(builder);
        this.contentType = builder.contentType;
        this.expires = builder.expires;
        this.filename = builder.filename;
        this.operatingObjectName = builder.operatingObjectName;
        this.scope = builder.scope;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSourceUploadSignatureRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return expires
     */
    public Long getExpires() {
        return this.expires;
    }

    /**
     * @return filename
     */
    public String getFilename() {
        return this.filename;
    }

    /**
     * @return operatingObjectName
     */
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<GetSourceUploadSignatureRequest, Builder> {
        private String contentType; 
        private Long expires; 
        private String filename; 
        private String operatingObjectName; 
        private String scope; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetSourceUploadSignatureRequest request) {
            super(request);
            this.contentType = request.contentType;
            this.expires = request.expires;
            this.filename = request.filename;
            this.operatingObjectName = request.operatingObjectName;
            this.scope = request.scope;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>文件 Content-Type（可选，不传则自动推断）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder contentType(String contentType) {
            this.putBodyParameter("contentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>签名 URL 过期时间（秒），默认 3600</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder expires(Long expires) {
            this.putBodyParameter("expires", expires);
            this.expires = expires;
            return this;
        }

        /**
         * <p>文件名（含后缀，如 report.pdf）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.pdf</p>
         */
        public Builder filename(String filename) {
            this.putBodyParameter("filename", filename);
            this.filename = filename;
            return this;
        }

        /**
         * <p>Agent 命名空间标识（数字员工名称）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.putBodyParameter("operatingObjectName", operatingObjectName);
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>数据源归属范围: source（个人数据源，映射 PERSONAL）/ knowledge（企业知识库，映射 TENANT）</p>
         * 
         * <strong>example:</strong>
         * <p>source</p>
         */
        public Builder scope(String scope) {
            this.putBodyParameter("scope", scope);
            this.scope = scope;
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
        public GetSourceUploadSignatureRequest build() {
            return new GetSourceUploadSignatureRequest(this);
        } 

    } 

}
