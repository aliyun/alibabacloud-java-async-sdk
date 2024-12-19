// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetUploadTaskRequest} extends {@link RequestModel}
 *
 * <p>GetUploadTaskRequest</p>
 */
public class GetUploadTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadId")
    private Long uploadId;

    private GetUploadTaskRequest(Builder builder) {
        super(builder);
        this.siteId = builder.siteId;
        this.uploadId = builder.uploadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUploadTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return uploadId
     */
    public Long getUploadId() {
        return this.uploadId;
    }

    public static final class Builder extends Request.Builder<GetUploadTaskRequest, Builder> {
        private Long siteId; 
        private Long uploadId; 

        private Builder() {
            super();
        } 

        private Builder(GetUploadTaskRequest request) {
            super(request);
            this.siteId = request.siteId;
            this.uploadId = request.uploadId;
        } 

        /**
         * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The ID of the file upload task. This field is assigned after you call the <a href="https://help.aliyun.com/document_detail/2850466.html">UploadFile</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>159253299357****</p>
         */
        public Builder uploadId(Long uploadId) {
            this.putQueryParameter("UploadId", uploadId);
            this.uploadId = uploadId;
            return this;
        }

        @Override
        public GetUploadTaskRequest build() {
            return new GetUploadTaskRequest(this);
        } 

    } 

}
