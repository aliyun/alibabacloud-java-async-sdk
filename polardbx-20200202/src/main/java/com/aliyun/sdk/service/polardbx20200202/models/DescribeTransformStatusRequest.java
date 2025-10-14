// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeTransformStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeTransformStatusRequest</p>
 */
public class DescribeTransformStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryReport")
    private Boolean queryReport;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeTransformStatusRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.queryReport = builder.queryReport;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTransformStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return queryReport
     */
    public Boolean getQueryReport() {
        return this.queryReport;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeTransformStatusRequest, Builder> {
        private String DBInstanceName; 
        private Boolean queryReport; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTransformStatusRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.queryReport = request.queryReport;
            this.regionId = request.regionId;
        } 

        /**
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * QueryReport.
         */
        public Builder queryReport(Boolean queryReport) {
            this.putQueryParameter("QueryReport", queryReport);
            this.queryReport = queryReport;
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

        @Override
        public DescribeTransformStatusRequest build() {
            return new DescribeTransformStatusRequest(this);
        } 

    } 

}
