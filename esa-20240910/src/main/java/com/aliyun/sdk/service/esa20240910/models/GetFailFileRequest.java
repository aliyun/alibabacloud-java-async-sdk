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
 * {@link GetFailFileRequest} extends {@link RequestModel}
 *
 * <p>GetFailFileRequest</p>
 */
public class GetFailFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadId")
    private Long uploadId;

    private GetFailFileRequest(Builder builder) {
        super(builder);
        this.siteId = builder.siteId;
        this.uploadId = builder.uploadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFailFileRequest create() {
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

    public static final class Builder extends Request.Builder<GetFailFileRequest, Builder> {
        private Long siteId; 
        private Long uploadId; 

        private Builder() {
            super();
        } 

        private Builder(GetFailFileRequest request) {
            super(request);
            this.siteId = request.siteId;
            this.uploadId = request.uploadId;
        } 

        /**
         * <p>The site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The file upload task ID. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/2850466.html">UploadFile</a> operation to create an upload task, or by calling the <a href="https://help.aliyun.com/document_detail/2851127.html">ListUploadTasks</a> operation to query existing tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1593805857882113</p>
         */
        public Builder uploadId(Long uploadId) {
            this.putQueryParameter("UploadId", uploadId);
            this.uploadId = uploadId;
            return this;
        }

        @Override
        public GetFailFileRequest build() {
            return new GetFailFileRequest(this);
        } 

    } 

}
