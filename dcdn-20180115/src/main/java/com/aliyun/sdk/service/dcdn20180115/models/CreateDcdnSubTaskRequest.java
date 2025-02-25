// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDcdnSubTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateDcdnSubTaskRequest</p>
 */
public class CreateDcdnSubTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReportIds")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The domain names to be tracked. Separate multiple domain names with commas (,). You can specify up to 500 domain names. If you want to specify more than 500 domain names, <a href="https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex">submit a ticket</a>.</p>
         * <blockquote>
         * <p>If you do not specify a domain name, the tracking task is created for all domain names that belong to your Alibaba Cloud account.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>example.com,example.org</p>
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The IDs of the metrics that you want to include in the report. Separate multiple IDs with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: Popular URLs by Request</li>
         * <li><strong>4</strong>: Popular URLs by Traffic</li>
         * <li><strong>6</strong>: Popular Referer by Request</li>
         * <li><strong>8</strong>: Popular Referer by Traffic</li>
         * <li><strong>10</strong>: Popular Back-to-origin URLs by Request</li>
         * <li><strong>12</strong>: Popular Back-to-origin URLs by Traffic</li>
         * <li><strong>14</strong>: Top Client IPs by Request</li>
         * <li><strong>16</strong>: Top Client IPs by Traffic</li>
         * <li><strong>18</strong>: Popular Domain Names by Traffic</li>
         * <li><strong>20</strong>: PV/UV</li>
         * <li><strong>22</strong>: Visit Distribution by Region</li>
         * <li><strong>24</strong>: Distribution of ISPs</li>
         * <li><strong>26</strong>: Peak IPv4/IPv6 Bandwidth</li>
         * <li><strong>27</strong>: Back-to-origin bandwidth</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2,4,6</p>
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
