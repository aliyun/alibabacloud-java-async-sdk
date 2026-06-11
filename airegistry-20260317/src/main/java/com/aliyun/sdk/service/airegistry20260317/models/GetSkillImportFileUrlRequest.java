// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airegistry20260317.models;

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
 * {@link GetSkillImportFileUrlRequest} extends {@link RequestModel}
 *
 * <p>GetSkillImportFileUrlRequest</p>
 */
public class GetSkillImportFileUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentType")
    private String contentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    private GetSkillImportFileUrlRequest(Builder builder) {
        super(builder);
        this.contentType = builder.contentType;
        this.namespaceId = builder.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSkillImportFileUrlRequest create() {
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
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public static final class Builder extends Request.Builder<GetSkillImportFileUrlRequest, Builder> {
        private String contentType; 
        private String namespaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetSkillImportFileUrlRequest request) {
            super(request);
            this.contentType = request.contentType;
            this.namespaceId = request.namespaceId;
        } 

        /**
         * ContentType.
         */
        public Builder contentType(String contentType) {
            this.putQueryParameter("ContentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        @Override
        public GetSkillImportFileUrlRequest build() {
            return new GetSkillImportFileUrlRequest(this);
        } 

    } 

}
