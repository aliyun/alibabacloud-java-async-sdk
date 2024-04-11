// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDcdnSubTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateDcdnSubTaskRequest</p>
 */
public class CreateDcdnSubTaskRequest extends Request {
    @Body
    @NameInMap("DomainName")
    private String domainName;

    @Body
    @NameInMap("ReportIds")
    @Validation(required = true)
    private String reportIds;

    private CreateDcdnSubTaskRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.reportIds = builder.reportIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDcdnSubTaskRequest create() {
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

    public static final class Builder extends Request.Builder<CreateDcdnSubTaskRequest, Builder> {
        private String domainName; 
        private String reportIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateDcdnSubTaskRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.reportIds = request.reportIds;
        } 

        /**
         * The domain names to be tracked. Separate multiple domain names with commas (,). You can specify up to 500 domain names. If you want to specify more than 500 domain names, [submit a ticket](https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex).
         * <p>
         * 
         * > If you do not specify a domain name, the tracking task is created for all domain names that belong to your Alibaba Cloud account.
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
         * *   **2**: Popular URLs by Request
         * *   **4**: Popular URLs by Traffic
         * *   **6**: Popular Referer by Request
         * *   **8**: Popular Referer by Traffic
         * *   **10**: Popular Back-to-origin URLs by Request
         * *   **12**: Popular Back-to-origin URLs by Traffic
         * *   **14**: Top Client IPs by Request
         * *   **16**: Top Client IPs by Traffic
         * *   **18**: Popular Domain Names by Traffic
         * *   **20**: PV/UV
         * *   **22**: Visit Distribution by Region
         * *   **24**: Distribution of ISPs
         * *   **26**: Peak IPv4/IPv6 Bandwidth
         * *   **27**: Back-to-origin bandwidth
         */
        public Builder reportIds(String reportIds) {
            this.putBodyParameter("ReportIds", reportIds);
            this.reportIds = reportIds;
            return this;
        }

        @Override
        public CreateDcdnSubTaskRequest build() {
            return new CreateDcdnSubTaskRequest(this);
        } 

    } 

}
