// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link DescribeDiagnoseReportRequest} extends {@link RequestModel}
 *
 * <p>DescribeDiagnoseReportRequest</p>
 */
public class DescribeDiagnoseReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiagnoseType")
    private String diagnoseType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportIds")
    private java.util.List<String> reportIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private java.util.List<String> resourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeDiagnoseReportRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.diagnoseType = builder.diagnoseType;
        this.endTime = builder.endTime;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.reportIds = builder.reportIds;
        this.resourceIds = builder.resourceIds;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnoseReportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return diagnoseType
     */
    public String getDiagnoseType() {
        return this.diagnoseType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeDiagnoseReportRequest, Builder> {
        private String clientToken; 
        private String diagnoseType; 
        private String endTime; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private java.util.List<String> reportIds; 
        private java.util.List<String> resourceIds; 
        private String startTime; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDiagnoseReportRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.diagnoseType = request.diagnoseType;
            this.endTime = request.endTime;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.reportIds = request.reportIds;
            this.resourceIds = request.resourceIds;
            this.startTime = request.startTime;
            this.status = request.status;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DiagnoseType.
         */
        public Builder diagnoseType(String diagnoseType) {
            this.putQueryParameter("DiagnoseType", diagnoseType);
            this.diagnoseType = diagnoseType;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ReportIds.
         */
        public Builder reportIds(java.util.List<String> reportIds) {
            this.putQueryParameter("ReportIds", reportIds);
            this.reportIds = reportIds;
            return this;
        }

        /**
         * ResourceIds.
         */
        public Builder resourceIds(java.util.List<String> resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeDiagnoseReportRequest build() {
            return new DescribeDiagnoseReportRequest(this);
        } 

    } 

}
