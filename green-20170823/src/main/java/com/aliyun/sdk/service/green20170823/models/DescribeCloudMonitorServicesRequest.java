// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudMonitorServicesRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudMonitorServicesRequest</p>
 */
public class DescribeCloudMonitorServicesRequest extends Request {
    @Query
    @NameInMap("Page")
    @Validation(required = true)
    private String page;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private String pageSize;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeCloudMonitorServicesRequest(Builder builder) {
        super(builder);
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudMonitorServicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeCloudMonitorServicesRequest, Builder> {
        private String page; 
        private String pageSize; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudMonitorServicesRequest request) {
            super(request);
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.sourceIp = request.sourceIp;
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
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeCloudMonitorServicesRequest build() {
            return new DescribeCloudMonitorServicesRequest(this);
        } 

    } 

}
