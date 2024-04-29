// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUuidsByWebPathRequest} extends {@link RequestModel}
 *
 * <p>ListUuidsByWebPathRequest</p>
 */
public class ListUuidsByWebPathRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebPath")
    private String webPath;

    private ListUuidsByWebPathRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.type = builder.type;
        this.webPath = builder.webPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUuidsByWebPathRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return webPath
     */
    public String getWebPath() {
        return this.webPath;
    }

    public static final class Builder extends Request.Builder<ListUuidsByWebPathRequest, Builder> {
        private Integer currentPage; 
        private Integer pageSize; 
        private String type; 
        private String webPath; 

        private Builder() {
            super();
        } 

        private Builder(ListUuidsByWebPathRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.type = request.type;
            this.webPath = request.webPath;
        } 

        /**
         * The number of the page to return.
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
         * The path type of the web directory. Valid values:
         * <p>
         * 
         * *   **def**: automatically identified
         * *   **customize**: manually added
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The path to the web directory.
         */
        public Builder webPath(String webPath) {
            this.putQueryParameter("WebPath", webPath);
            this.webPath = webPath;
            return this;
        }

        @Override
        public ListUuidsByWebPathRequest build() {
            return new ListUuidsByWebPathRequest(this);
        } 

    } 

}
