// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeVulListPageRequest} extends {@link RequestModel}
 *
 * <p>DescribeVulListPageRequest</p>
 */
public class DescribeVulListPageRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("CveId")
    private String cveId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("VulNameLike")
    private String vulNameLike;


    private DescribeVulListPageRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.cveId = builder.cveId;
        this.pageSize = builder.pageSize;
        this.sourceIp = builder.sourceIp;
        this.vulNameLike = builder.vulNameLike;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulListPageRequest create() {
        return builder().build();
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
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return vulNameLike
     */
    public String getVulNameLike() {
        return this.vulNameLike;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private Integer currentPage; 
        private String cveId; 
        private Integer pageSize; 
        private String sourceIp; 
        private String vulNameLike; 

        /**
         * <p>CurrentPage.</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>CveId.</p>
         */
        public Builder cveId(String cveId) {
            this.putQueryParameter("CveId", cveId);
            this.cveId = cveId;
            return this;
        }

        /**
         * <p>PageSize.</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>SourceIp.</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>VulNameLike.</p>
         */
        public Builder vulNameLike(String vulNameLike) {
            this.putQueryParameter("VulNameLike", vulNameLike);
            this.vulNameLike = vulNameLike;
            return this;
        }

        public DescribeVulListPageRequest build() {
            return new DescribeVulListPageRequest(this);
        } 

    } 

}
