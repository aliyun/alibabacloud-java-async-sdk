// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20250521.models;

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
 * {@link DescribeFileDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>DescribeFileDownloadUrlRequest</p>
 */
public class DescribeFileDownloadUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long fileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    private DescribeFileDownloadUrlRequest(Builder builder) {
        super(builder);
        this.fileId = builder.fileId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFileDownloadUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileId
     */
    public Long getFileId() {
        return this.fileId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<DescribeFileDownloadUrlRequest, Builder> {
        private Long fileId; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFileDownloadUrlRequest request) {
            super(request);
            this.fileId = request.fileId;
            this.projectId = request.projectId;
        } 

        /**
         * <p>File ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        public Builder fileId(Long fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>Project ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public DescribeFileDownloadUrlRequest build() {
            return new DescribeFileDownloadUrlRequest(this);
        } 

    } 

}
