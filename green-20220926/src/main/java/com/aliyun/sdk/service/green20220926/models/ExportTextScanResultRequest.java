// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link ExportTextScanResultRequest} extends {@link RequestModel}
 *
 * <p>ExportTextScanResultRequest</p>
 */
public class ExportTextScanResultRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Query")
    private java.util.Map<String, String> query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    private ExportTextScanResultRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.query = builder.query;
        this.regionId = builder.regionId;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportTextScanResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return query
     */
    public java.util.Map<String, String> getQuery() {
        return this.query;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<ExportTextScanResultRequest, Builder> {
        private String endDate; 
        private java.util.Map<String, String> query; 
        private String regionId; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(ExportTextScanResultRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.query = request.query;
            this.regionId = request.regionId;
            this.startDate = request.startDate;
        } 

        /**
         * <p>End time of the query, in the format yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-11 10:00:00</p>
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>Query conditions.</p>
         */
        public Builder query(java.util.Map<String, String> query) {
            String queryShrink = shrink(query, "Query", "json");
            this.putBodyParameter("Query", queryShrink);
            this.query = query;
            return this;
        }

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Start time of the query, in the format yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-10 10:00:00</p>
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public ExportTextScanResultRequest build() {
            return new ExportTextScanResultRequest(this);
        } 

    } 

}
