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
 * {@link SubmitUploadTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitUploadTaskRequest</p>
 */
public class SubmitUploadTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadId")
    private Long uploadId;

    private SubmitUploadTaskRequest(Builder builder) {
        super(builder);
        this.force = builder.force;
        this.siteId = builder.siteId;
        this.uploadId = builder.uploadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitUploadTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
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

    public static final class Builder extends Request.Builder<SubmitUploadTaskRequest, Builder> {
        private Boolean force; 
        private Long siteId; 
        private Long uploadId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitUploadTaskRequest request) {
            super(request);
            this.force = request.force;
            this.siteId = request.siteId;
            this.uploadId = request.uploadId;
        } 

        /**
         * <p>Specifies whether to refresh resources in the corresponding directory if the requested content is different from that on the origin server. Default value: false. This parameter takes effect for a purge task.</p>
         * <ul>
         * <li><strong>true</strong>: purges all resources in the directory.</li>
         * <li><strong>false</strong>: refresh the changed resources in the directory.</li>
         * </ul>
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * <p>The website ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the ID.</p>
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
         * <p>The ID of the file upload task, which is generated when you call <a href="~~UploadTask~~">UploadTask</a>.</p>
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
        public SubmitUploadTaskRequest build() {
            return new SubmitUploadTaskRequest(this);
        } 

    } 

}
