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
    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

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
        this.groupId = builder.groupId;
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
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
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
        private String groupId; 
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
            this.groupId = request.groupId;
            this.operatingObjectName = request.operatingObjectName;
            this.scope = request.scope;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The content type. Valid values:</p>
         * <ul>
         * <li>Text</li>
         * <li>Markdown</li>
         * </ul>
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
         * <p>The expiration time of the signed URL, in seconds. Default value: 3600.</p>
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
         * <p>The file name.</p>
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
         * <p>The collaboration space ID passed from the frontend. This parameter is required when scope is set to group. The value must be a space accessible to the current user and is used in the OSS path for locating. The value must be 1 to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-). This parameter is not used for other scope values.</p>
         * 
         * <strong>example:</strong>
         * <p>group_example</p>
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The name of the digital employee (operating object name, optional).</p>
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
         * <p>The permission scope.</p>
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
         * <p>The tenant ID to which the task belongs.</p>
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
