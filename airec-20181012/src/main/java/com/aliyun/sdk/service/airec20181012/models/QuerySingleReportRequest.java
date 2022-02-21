// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySingleReportRequest} extends {@link RequestModel}
 *
 * <p>QuerySingleReportRequest</p>
 */
public class QuerySingleReportRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ReportType")
    private String reportType;

    private QuerySingleReportRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.reportType = builder.reportType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySingleReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return reportType
     */
    public String getReportType() {
        return this.reportType;
    }

    public static final class Builder extends Request.Builder<QuerySingleReportRequest, Builder> {
        private String instanceId; 
        private String reportType; 

        private Builder() {
            super();
        } 

        private Builder(QuerySingleReportRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.reportType = response.reportType;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ReportType.
         */
        public Builder reportType(String reportType) {
            this.putQueryParameter("ReportType", reportType);
            this.reportType = reportType;
            return this;
        }

        @Override
        public QuerySingleReportRequest build() {
            return new QuerySingleReportRequest(this);
        } 

    } 

}
