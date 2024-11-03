// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateCdnSubTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateCdnSubTaskRequest</p>
 */
public class CreateCdnSubTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReportIds")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The domain names to be tracked. Separate multiple domain names with commas (,). You can specify up to 500 domain names. If you want to specify more than 500 domain names, <a href="https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex">submit a ticket</a>.</p>
         * <blockquote>
         * <p>If you do not specify a domain name, the custom operations report is created for all domain names that belong to your Alibaba Cloud account.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example1.com,www.example2.com">www.example1.com,www.example2.com</a></p>
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The IDs of the metrics that you want to include in the report. Separate multiple IDs with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: frequently requested URLs (ranked by the number of requests)</li>
         * <li><strong>3</strong>: frequently requested URLs (ranked by the amount of network traffic)</li>
         * <li><strong>5</strong>: frequently used Referer headers (ranked by the number of requests)</li>
         * <li><strong>7</strong>: frequently used Referer headers (ranked by the amount of network traffic)</li>
         * <li><strong>9</strong>: frequently requested URLs that are redirected to the origin (ranked by the number of requests)</li>
         * <li><strong>11</strong>: frequently requested URLs that are redirected to the origin (ranked by the amount of network traffic)</li>
         * <li><strong>13</strong>: top client IP addresses (ranked by the number of requests)</li>
         * <li><strong>15</strong>: top client IP addresses (ranked by the amount of network traffic)</li>
         * <li><strong>17</strong>: domain names ranked by the amount of network traffic</li>
         * <li><strong>19</strong>: page views and unique visitors</li>
         * <li><strong>21</strong>: regions from which requests are initiated</li>
         * <li><strong>23</strong>: Internet service providers (ISPs)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1,3,5</p>
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
