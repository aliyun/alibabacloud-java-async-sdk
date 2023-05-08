// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetModuleConfigRequest} extends {@link RequestModel}
 *
 * <p>GetModuleConfigRequest</p>
 */
public class GetModuleConfigRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private String currentPage;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    private GetModuleConfigRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModuleConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<GetModuleConfigRequest, Builder> {
        private String currentPage; 
        private String pageSize; 

        private Builder() {
            super();
        } 

        private Builder(GetModuleConfigRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
        } 

        /**
         * The number of the page to return.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **10**.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public GetModuleConfigRequest build() {
            return new GetModuleConfigRequest(this);
        } 

    } 

}
