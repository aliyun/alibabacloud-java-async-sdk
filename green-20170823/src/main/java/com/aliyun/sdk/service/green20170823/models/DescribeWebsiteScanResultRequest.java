// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebsiteScanResultRequest} extends {@link RequestModel}
 *
 * <p>DescribeWebsiteScanResultRequest</p>
 */
public class DescribeWebsiteScanResultRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("HandleStatus")
    private String handleStatus;

    @Query
    @NameInMap("Label")
    private String label;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SiteUrl")
    private String siteUrl;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("SubServiceModule")
    @Validation(required = true)
    private String subServiceModule;

    @Query
    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeWebsiteScanResultRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.domain = builder.domain;
        this.handleStatus = builder.handleStatus;
        this.label = builder.label;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.siteUrl = builder.siteUrl;
        this.sourceIp = builder.sourceIp;
        this.subServiceModule = builder.subServiceModule;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebsiteScanResultRequest create() {
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
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return handleStatus
     */
    public String getHandleStatus() {
        return this.handleStatus;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return siteUrl
     */
    public String getSiteUrl() {
        return this.siteUrl;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return subServiceModule
     */
    public String getSubServiceModule() {
        return this.subServiceModule;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder extends Request.Builder<DescribeWebsiteScanResultRequest, Builder> {
        private Integer currentPage; 
        private String domain; 
        private String handleStatus; 
        private String label; 
        private String lang; 
        private Integer pageSize; 
        private String siteUrl; 
        private String sourceIp; 
        private String subServiceModule; 
        private Integer totalCount; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWebsiteScanResultRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.domain = request.domain;
            this.handleStatus = request.handleStatus;
            this.label = request.label;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.siteUrl = request.siteUrl;
            this.sourceIp = request.sourceIp;
            this.subServiceModule = request.subServiceModule;
            this.totalCount = request.totalCount;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * HandleStatus.
         */
        public Builder handleStatus(String handleStatus) {
            this.putQueryParameter("HandleStatus", handleStatus);
            this.handleStatus = handleStatus;
            return this;
        }

        /**
         * Label.
         */
        public Builder label(String label) {
            this.putQueryParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SiteUrl.
         */
        public Builder siteUrl(String siteUrl) {
            this.putQueryParameter("SiteUrl", siteUrl);
            this.siteUrl = siteUrl;
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

        /**
         * SubServiceModule.
         */
        public Builder subServiceModule(String subServiceModule) {
            this.putQueryParameter("SubServiceModule", subServiceModule);
            this.subServiceModule = subServiceModule;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.putQueryParameter("TotalCount", totalCount);
            this.totalCount = totalCount;
            return this;
        }

        @Override
        public DescribeWebsiteScanResultRequest build() {
            return new DescribeWebsiteScanResultRequest(this);
        } 

    } 

}
