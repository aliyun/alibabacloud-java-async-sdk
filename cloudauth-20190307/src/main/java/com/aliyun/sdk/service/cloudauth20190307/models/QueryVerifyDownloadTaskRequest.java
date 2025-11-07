// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link QueryVerifyDownloadTaskRequest} extends {@link RequestModel}
 *
 * <p>QueryVerifyDownloadTaskRequest</p>
 */
public class QueryVerifyDownloadTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DownloadTaskId")
    private String downloadTaskId;

    private QueryVerifyDownloadTaskRequest(Builder builder) {
        super(builder);
        this.downloadTaskId = builder.downloadTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVerifyDownloadTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return downloadTaskId
     */
    public String getDownloadTaskId() {
        return this.downloadTaskId;
    }

    public static final class Builder extends Request.Builder<QueryVerifyDownloadTaskRequest, Builder> {
        private String downloadTaskId; 

        private Builder() {
            super();
        } 

        private Builder(QueryVerifyDownloadTaskRequest request) {
            super(request);
            this.downloadTaskId = request.downloadTaskId;
        } 

        /**
         * <p>Download task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>202411194002618</p>
         */
        public Builder downloadTaskId(String downloadTaskId) {
            this.putQueryParameter("DownloadTaskId", downloadTaskId);
            this.downloadTaskId = downloadTaskId;
            return this;
        }

        @Override
        public QueryVerifyDownloadTaskRequest build() {
            return new QueryVerifyDownloadTaskRequest(this);
        } 

    } 

}
