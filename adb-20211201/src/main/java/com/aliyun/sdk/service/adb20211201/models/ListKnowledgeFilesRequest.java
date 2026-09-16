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
         * FileIds.
         */
        public Builder fileIds(String fileIds) {
            this.putQueryParameter("FileIds", fileIds);
            this.fileIds = fileIds;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(String page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * User.
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
