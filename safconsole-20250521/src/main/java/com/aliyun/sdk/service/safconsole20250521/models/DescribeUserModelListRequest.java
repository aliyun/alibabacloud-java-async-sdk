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
 * {@link DescribeUserModelListRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserModelListRequest</p>
 */
public class DescribeUserModelListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthType")
    private String authType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    private DescribeUserModelListRequest(Builder builder) {
        super(builder);
        this.authType = builder.authType;
        this.currentPage = builder.currentPage;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserModelListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeUserModelListRequest, Builder> {
        private String authType; 
        private String currentPage; 
        private String name; 
        private String pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserModelListRequest request) {
            super(request);
            this.authType = request.authType;
            this.currentPage = request.currentPage;
            this.name = request.name;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>Authorization type.</p>
         * 
         * <strong>example:</strong>
         * <p>READ</p>
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Model name.</p>
         * 
         * <strong>example:</strong>
         * <p>StudyX</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Pagination parameter: number of items per page, default value 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeUserModelListRequest build() {
            return new DescribeUserModelListRequest(this);
        } 

    } 

}
