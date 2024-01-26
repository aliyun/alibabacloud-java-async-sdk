// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreloadSparkAppMetricsRequest} extends {@link RequestModel}
 *
 * <p>PreloadSparkAppMetricsRequest</p>
 */
public class PreloadSparkAppMetricsRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true, maxLength = 64)
    private String appId;

    @Query
    @NameInMap("DBClusterId")
    private String DBClusterId;

    private PreloadSparkAppMetricsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.DBClusterId = builder.DBClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreloadSparkAppMetricsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public static final class Builder extends Request.Builder<PreloadSparkAppMetricsRequest, Builder> {
        private String appId; 
        private String DBClusterId; 

        private Builder() {
            super();
        } 

        private Builder(PreloadSparkAppMetricsRequest request) {
            super(request);
            this.appId = request.appId;
            this.DBClusterId = request.DBClusterId;
        } 

        /**
         * The Spark application ID.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
         * <p>
         * 
         * >  You can call the [DescribeDBClusters](~~129857~~) operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        @Override
        public PreloadSparkAppMetricsRequest build() {
            return new PreloadSparkAppMetricsRequest(this);
        } 

    } 

}
