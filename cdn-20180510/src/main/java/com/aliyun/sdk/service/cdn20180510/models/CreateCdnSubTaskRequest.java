// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCdnSubTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateCdnSubTaskRequest</p>
 */
public class CreateCdnSubTaskRequest extends Request {
    @Body
    @NameInMap("DomainName")
    private String domainName;

    @Body
    @NameInMap("ReportIds")
    @Validation(required = true)
    private String reportIds;

    private CreateCdnSubTaskRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.reportIds = builder.reportIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCdnSubTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return reportIds
     */
    public String getReportIds() {
        return this.reportIds;
    }

    public static final class Builder extends Request.Builder<CreateCdnSubTaskRequest, Builder> {
        private String domainName; 
        private String reportIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateCdnSubTaskRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.reportIds = request.reportIds;
        } 

        /**
         * The domain names to be tracked. Separate multiple domain names with commas (,). You can specify up to 500 domain names. If you want to specify more than 500 domain names, [submit a ticket](https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex).
         * <p>
         * 
         * > If you do not specify a domain name, the custom operations report is created for all domain names that belong to your Alibaba Cloud account.
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The IDs of the metrics that you want to include in the report. Separate multiple IDs with commas (,). Valid values:
         * <p>
         * 
         * *   **1**: frequently requested URLs (ranked by the number of requests)
         * *   **3**: frequently requested URLs (ranked by the amount of network traffic)
         * *   **5**: frequently used Referer headers (ranked by the number of requests)
         * *   **7**: frequently used Referer headers (ranked by the amount of network traffic)
         * *   **9**: frequently requested URLs that are redirected to the origin (ranked by the number of requests)
         * *   **11**: frequently requested URLs that are redirected to the origin (ranked by the amount of network traffic)
         * *   **13**: top client IP addresses (ranked by the number of requests)
         * *   **15**: top client IP addresses (ranked by the amount of network traffic)
         * *   **17**: domain names ranked by the amount of network traffic
         * *   **19**: page views and unique visitors
         * *   **21**: regions from which requests are initiated
         * *   **23**: Internet service providers (ISPs)
         */
        public Builder reportIds(String reportIds) {
            this.putBodyParameter("ReportIds", reportIds);
            this.reportIds = reportIds;
            return this;
        }

        @Override
        public CreateCdnSubTaskRequest build() {
            return new CreateCdnSubTaskRequest(this);
        } 

    } 

}
