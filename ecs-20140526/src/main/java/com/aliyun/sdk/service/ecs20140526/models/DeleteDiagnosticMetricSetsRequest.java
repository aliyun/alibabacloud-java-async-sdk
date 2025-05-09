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
 * {@link DeleteDiagnosticMetricSetsRequest} extends {@link RequestModel}
 *
 * <p>DeleteDiagnosticMetricSetsRequest</p>
 */
public class DeleteDiagnosticMetricSetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricSetIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> metricSetIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteDiagnosticMetricSetsRequest(Builder builder) {
        super(builder);
        this.metricSetIds = builder.metricSetIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDiagnosticMetricSetsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metricSetIds
     */
    public java.util.List<String> getMetricSetIds() {
        return this.metricSetIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteDiagnosticMetricSetsRequest, Builder> {
        private java.util.List<String> metricSetIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDiagnosticMetricSetsRequest request) {
            super(request);
            this.metricSetIds = request.metricSetIds;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The IDs of diagnostic metric sets. You can specify up to 10 set IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder metricSetIds(java.util.List<String> metricSetIds) {
            this.putQueryParameter("MetricSetIds", metricSetIds);
            this.metricSetIds = metricSetIds;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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

        @Override
        public DeleteDiagnosticMetricSetsRequest build() {
            return new DeleteDiagnosticMetricSetsRequest(this);
        } 

    } 

}
