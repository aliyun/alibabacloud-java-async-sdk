// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulListPageRequest} extends {@link RequestModel}
 *
 * <p>DescribeVulListPageRequest</p>
 */
public class DescribeVulListPageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CveId")
    private String cveId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VulNameLike")
    private String vulNameLike;

    private DescribeVulListPageRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.cveId = builder.cveId;
        this.pageSize = builder.pageSize;
        this.vulNameLike = builder.vulNameLike;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulListPageRequest create() {
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
     * @return cveId
     */
    public String getCveId() {
        return this.cveId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return vulNameLike
     */
    public String getVulNameLike() {
        return this.vulNameLike;
    }

    public static final class Builder extends Request.Builder<DescribeVulListPageRequest, Builder> {
        private Integer currentPage; 
        private String cveId; 
        private Integer pageSize; 
        private String vulNameLike; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVulListPageRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.cveId = request.cveId;
            this.pageSize = request.pageSize;
            this.vulNameLike = request.vulNameLike;
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
         * The Common Vulnerabilities and Exposures (CVE) ID of the vulnerability.
         */
        public Builder cveId(String cveId) {
            this.putQueryParameter("CveId", cveId);
            this.cveId = cveId;
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
         * The name of the vulnerability.
         */
        public Builder vulNameLike(String vulNameLike) {
            this.putQueryParameter("VulNameLike", vulNameLike);
            this.vulNameLike = vulNameLike;
            return this;
        }

        @Override
        public DescribeVulListPageRequest build() {
            return new DescribeVulListPageRequest(this);
        } 

    } 

}
