// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QuerySingleReportRequest} extends {@link RequestModel}
 *
 * <p>QuerySingleReportRequest</p>
 */
public class QuerySingleReportRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("reportType")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(QuerySingleReportRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.reportType = request.reportType;
        } 

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-cn-o400whm78004</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The type of the single table report. This parameter is required.</p>
         * <p>Valid values: typeItemValidScene,</p>
         * <p>typeItemTag,</p>
         * <p>typeItemTagScene,</p>
         * <p>typeItemWeightScene,</p>
         * <p>typeItemRawScene, and</p>
         * <p>typeItemExpireScene</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>typeItemTagScene</p>
         */
        public Builder reportType(String reportType) {
            this.putQueryParameter("reportType", reportType);
            this.reportType = reportType;
            return this;
        }

        @Override
        public QuerySingleReportRequest build() {
            return new QuerySingleReportRequest(this);
        } 

    } 

}
