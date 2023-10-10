// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySlsLogStoreListRequest} extends {@link RequestModel}
 *
 * <p>QuerySlsLogStoreListRequest</p>
 */
public class QuerySlsLogStoreListRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private QuerySlsLogStoreListRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySlsLogStoreListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<QuerySlsLogStoreListRequest, Builder> {
        private String appId; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(QuerySlsLogStoreListRequest request) {
            super(request);
            this.appId = request.appId;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.type = request.type;
        } 

        /**
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The number of the page to return. Pages start from Page 1.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The type of data that is collected by Log Service. Valid values:
         * <p>
         * 
         * *   file: the file type
         * *   stdout: the standard output type
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public QuerySlsLogStoreListRequest build() {
            return new QuerySlsLogStoreListRequest(this);
        } 

    } 

}
