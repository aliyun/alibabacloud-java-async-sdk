// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
    @com.aliyun.core.annotation.NameInMap("RaspDefend")
    private Integer raspDefend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VulNameLike")
    private String vulNameLike;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VulType")
    private String vulType;

    private DescribeVulListPageRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.cveId = builder.cveId;
        this.pageSize = builder.pageSize;
        this.raspDefend = builder.raspDefend;
        this.vulNameLike = builder.vulNameLike;
        this.vulType = builder.vulType;
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
     * @return raspDefend
     */
    public Integer getRaspDefend() {
        return this.raspDefend;
    }

    /**
     * @return vulNameLike
     */
    public String getVulNameLike() {
        return this.vulNameLike;
    }

    /**
     * @return vulType
     */
    public String getVulType() {
        return this.vulType;
    }

    public static final class Builder extends Request.Builder<DescribeVulListPageRequest, Builder> {
        private Integer currentPage; 
        private String cveId; 
        private Integer pageSize; 
        private Integer raspDefend; 
        private String vulNameLike; 
        private String vulType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVulListPageRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.cveId = request.cveId;
            this.pageSize = request.pageSize;
            this.raspDefend = request.raspDefend;
            this.vulNameLike = request.vulNameLike;
            this.vulType = request.vulType;
        } 

        /**
         * <p>The number of the page to return.</p>
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
         * <p>The Common Vulnerabilities and Exposures (CVE) ID of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2022-44702</p>
         */
        public Builder cveId(String cveId) {
            this.putQueryParameter("CveId", cveId);
            this.cveId = cveId;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Indicates whether the application protection feature is supported. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: no.</p>
         * </li>
         * <li><p><strong>1</strong>: yes.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder raspDefend(Integer raspDefend) {
            this.putQueryParameter("RaspDefend", raspDefend);
            this.raspDefend = raspDefend;
            return this;
        }

        /**
         * <p>The name of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>RCE vulnerability</p>
         */
        public Builder vulNameLike(String vulNameLike) {
            this.putQueryParameter("VulNameLike", vulNameLike);
            this.vulNameLike = vulNameLike;
            return this;
        }

        /**
         * <p>The type of the vulnerabilities. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: Linux software vulnerability.</li>
         * <li><strong>sys</strong>: Windows system vulnerability.</li>
         * <li><strong>app</strong>: Application vulnerability that is detected by using web scanner.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
         */
        public Builder vulType(String vulType) {
            this.putQueryParameter("VulType", vulType);
            this.vulType = vulType;
            return this;
        }

        @Override
        public DescribeVulListPageRequest build() {
            return new DescribeVulListPageRequest(this);
        } 

    } 

}
