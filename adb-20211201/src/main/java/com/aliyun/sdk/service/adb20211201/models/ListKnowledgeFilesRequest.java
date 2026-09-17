// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link ListKnowledgeFilesRequest} extends {@link RequestModel}
 *
 * <p>ListKnowledgeFilesRequest</p>
 */
public class ListKnowledgeFilesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileIds")
    private String fileIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    private String page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("User")
    private String user;

    private ListKnowledgeFilesRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.fileIds = builder.fileIds;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKnowledgeFilesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return fileIds
     */
    public String getFileIds() {
        return this.fileIds;
    }

    /**
     * @return page
     */
    public String getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    public static final class Builder extends Request.Builder<ListKnowledgeFilesRequest, Builder> {
        private String DBClusterId; 
        private String fileIds; 
        private String page; 
        private String pageSize; 
        private String status; 
        private String user; 

        private Builder() {
            super();
        } 

        private Builder(ListKnowledgeFilesRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.fileIds = request.fileIds;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.user = request.user;
        } 

        /**
         * <p>The ID of the AnalyticDB for MySQL instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp19aaaaaa****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The JSON string of the file ID array. A maximum of 200 positive integers are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>[1001,1002,1003]</p>
         */
        public Builder fileIds(String fileIds) {
            this.putQueryParameter("FileIds", fileIds);
            this.fileIds = fileIds;
            return this;
        }

        /**
         * <p>The page number, starting from 1. If this parameter is not specified, Ray uses a default value of 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(String page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. If this parameter is not specified, Ray uses a default value of 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The processing status. Valid values:</p>
         * <ul>
         * <li>PENDING</li>
         * <li>PROCESSING</li>
         * <li>COMPLETED</li>
         * <li>FAILED</li>
         * <li>DUPLICATED</li>
         * <li>SKIPPED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FAILED</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The stable ID of the authorized user. If this parameter is not specified, all files in the knowledge base can be queried.</p>
         * 
         * <strong>example:</strong>
         * <p>u123</p>
         */
        public Builder user(String user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        @Override
        public ListKnowledgeFilesRequest build() {
            return new ListKnowledgeFilesRequest(this);
        } 

    } 

}
