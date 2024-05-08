// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < String > reportIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private java.util.List < String > resourceIds;

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
    public java.util.List < String > getReportIds() {
        return this.reportIds;
    }

    /**
     * @return resourceIds
     */
    public java.util.List < String > getResourceIds() {
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
        private java.util.List < String > reportIds; 
        private java.util.List < String > resourceIds; 
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
         * The maximum number of entries to return on each page. Maximum value: 100.
         * <p>
         * 
         * Default value:
         * 
         * *   If this parameter is left empty, the default value is 10.
         * *   If this parameter is set to a value greater than 100, the default value is 100.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The query token. Set the value to the `NextToken` value returned in the last call to the DescribeDiagnosticReports operation. Leave this parameter empty the first time you call this operation.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The region ID of the diagnostic report. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The IDs of diagnostic reports. You can specify up to 100 report IDs.
         */
        public Builder reportIds(java.util.List < String > reportIds) {
            this.putQueryParameter("ReportIds", reportIds);
            this.reportIds = reportIds;
            return this;
        }

        /**
         * The IDs of resources. You can specify up to 100 resource IDs.
         */
        public Builder resourceIds(java.util.List < String > resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * The severity level of the diagnostic report. Valid values:
         * <p>
         * 
         * * Unknown: The diagnostic has not started, failed to run, or exited unexpectedly without a diagnosis.
         * * Normal: No exceptions are detected.
         * * Info: Diagnostic information is recorded and may be related to exceptions.
         * * Warn: Diagnostic information is recorded and may indicate exceptions.
         * * Critical: Critical exceptions are detected.
         */
        public Builder severity(String severity) {
            this.putQueryParameter("Severity", severity);
            this.severity = severity;
            return this;
        }

        /**
         * The state of the diagnostic report. Valid values:
         * <p>
         * 
         * *   InProgress: The diagnostic is in progress.
         * *   Failed: The diagnostic failed.
         * *   Finished: The diagnostic is complete.
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
