// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeDiagnosticReportsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDiagnosticReportsRequest</p>
 */
public class DescribeDiagnosticReportsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportIds")
    private java.util.List<String> reportIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private java.util.List<String> resourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Severity")
    private String severity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeDiagnosticReportsRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.reportIds = builder.reportIds;
        this.resourceIds = builder.resourceIds;
        this.severity = builder.severity;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosticReportsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return reportIds
     */
    public java.util.List<String> getReportIds() {
        return this.reportIds;
    }

    /**
     * @return resourceIds
     */
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeDiagnosticReportsRequest, Builder> {
        private String sourceRegionId; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private java.util.List<String> reportIds; 
        private java.util.List<String> resourceIds; 
        private String severity; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDiagnosticReportsRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.reportIds = request.reportIds;
            this.resourceIds = request.resourceIds;
            this.severity = request.severity;
            this.status = request.status;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * <p>The maximum number of entries per page for paging. Maximum value: 100.</p>
         * <p>Default value:</p>
         * <ul>
         * <li>If this parameter is not set, the default value is 10.</li>
         * <li>If the value you set is greater than 100, the default value is 100.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. Set this parameter to the <code>NextToken</code> value returned in the previous call. You do not need to set this parameter for the first request.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The list of diagnostic report IDs.</p>
         */
        public Builder reportIds(java.util.List<String> reportIds) {
            this.putQueryParameter("ReportIds", reportIds);
            this.reportIds = reportIds;
            return this;
        }

        /**
         * <p>The list of resource IDs. A maximum of 100 IDs are supported.</p>
         */
        public Builder resourceIds(java.util.List<String> resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * <p>The severity level. Valid values:</p>
         * <ul>
         * <li>Unknown: The initial state, which indicates that the diagnosis has not started or the diagnosis process exited abnormally. No diagnostic conclusion is available.</li>
         * <li>Normal: The diagnosis is normal and no issues are found.</li>
         * <li>Info: Related information is available and may be associated with an exception.</li>
         * <li>Warn: Related information is available and may cause an exception.</li>
         * <li>Critical: A critical exception exists.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder severity(String severity) {
            this.putQueryParameter("Severity", severity);
            this.severity = severity;
            return this;
        }

        /**
         * <p>The report status. Valid values:</p>
         * <ul>
         * <li>InProgress: The diagnosis is in progress.</li>
         * <li>Failed: The diagnosis failed.</li>
         * <li>Finished: The diagnosis is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeDiagnosticReportsRequest build() {
            return new DescribeDiagnosticReportsRequest(this);
        } 

    } 

}
