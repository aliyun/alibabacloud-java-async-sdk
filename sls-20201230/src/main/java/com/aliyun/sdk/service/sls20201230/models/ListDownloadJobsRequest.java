// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link ListDownloadJobsRequest} extends {@link RequestModel}
 *
 * <p>ListDownloadJobsRequest</p>
 */
public class ListDownloadJobsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("logstore")
    private String logstore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("offset")
    private Long offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private Long size;

    private ListDownloadJobsRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
        this.offset = builder.offset;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDownloadJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return offset
     */
    public Long getOffset() {
        return this.offset;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListDownloadJobsRequest, Builder> {
        private String project; 
        private String logstore; 
        private Long offset; 
        private Long size; 

        private Builder() {
            super();
        } 

        private Builder(ListDownloadJobsRequest request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
            this.offset = request.offset;
            this.size = request.size;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * logstore.
         */
        public Builder logstore(String logstore) {
            this.putQueryParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * offset.
         */
        public Builder offset(Long offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Long size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListDownloadJobsRequest build() {
            return new ListDownloadJobsRequest(this);
        } 

    } 

}
