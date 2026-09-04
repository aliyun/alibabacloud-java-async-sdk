// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.codesec20260401.models;

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
 * {@link CompleteCodeBundleRequest} extends {@link RequestModel}
 *
 * <p>CompleteCodeBundleRequest</p>
 */
public class CompleteCodeBundleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("codeBundleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long codeBundleId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("byteSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long byteSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("contentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contentType;

    private CompleteCodeBundleRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.codeBundleId = builder.codeBundleId;
        this.regionId = builder.regionId;
        this.byteSize = builder.byteSize;
        this.contentType = builder.contentType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompleteCodeBundleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return codeBundleId
     */
    public Long getCodeBundleId() {
        return this.codeBundleId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return byteSize
     */
    public Long getByteSize() {
        return this.byteSize;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    public static final class Builder extends Request.Builder<CompleteCodeBundleRequest, Builder> {
        private Long projectId; 
        private Long codeBundleId; 
        private String regionId; 
        private Long byteSize; 
        private String contentType; 

        private Builder() {
            super();
        } 

        private Builder(CompleteCodeBundleRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.codeBundleId = request.codeBundleId;
            this.regionId = request.regionId;
            this.byteSize = request.byteSize;
            this.contentType = request.contentType;
        } 

        /**
         * <p>Numeric primary key (<code>projects.id</code>).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12312</p>
         */
        public Builder projectId(Long projectId) {
            this.putPathParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>Numeric primary key (<code>code_bundles.id</code>).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        public Builder codeBundleId(Long codeBundleId) {
            this.putPathParameter("codeBundleId", codeBundleId);
            this.codeBundleId = codeBundleId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Declared uploaded object size; should match OSS <strong><code>Content-Length</code></strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder byteSize(Long byteSize) {
            this.putQueryParameter("byteSize", byteSize);
            this.byteSize = byteSize;
            return this;
        }

        /**
         * <p>MIME type stored on the bundle (often <strong><code>application/octet-stream</code></strong> for presigned PUT).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>application/octet-stream</p>
         */
        public Builder contentType(String contentType) {
            this.putQueryParameter("contentType", contentType);
            this.contentType = contentType;
            return this;
        }

        @Override
        public CompleteCodeBundleRequest build() {
            return new CompleteCodeBundleRequest(this);
        } 

    } 

}
