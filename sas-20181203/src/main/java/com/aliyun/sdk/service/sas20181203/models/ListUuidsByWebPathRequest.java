// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The number of the page to return.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The path type of the web directory. Valid values:</p>
         * <ul>
         * <li><strong>def</strong>: automatically identified</li>
         * <li><strong>customize</strong>: manually added</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>def</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The path to the web directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/root/www****</p>
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
