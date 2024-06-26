// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkAppWebUiAddressRequest} extends {@link RequestModel}
 *
 * <p>GetSparkAppWebUiAddressRequest</p>
 */
public class GetSparkAppWebUiAddressRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    private GetSparkAppWebUiAddressRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.DBClusterId = builder.DBClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkAppWebUiAddressRequest create() {
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

    public static final class Builder extends Request.Builder<GetSparkAppWebUiAddressRequest, Builder> {
        private String appId; 
        private String DBClusterId; 

        private Builder() {
            super();
        } 

        private Builder(GetSparkAppWebUiAddressRequest request) {
            super(request);
            this.appId = request.appId;
            this.DBClusterId = request.DBClusterId;
        } 

        /**
         * The Spark application ID.
         * <p>
         * 
         * >  You can call the [ListSparkApps](~~455888~~) operation to query Spark application IDs.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The cluster ID.
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
        public GetSparkAppWebUiAddressRequest build() {
            return new GetSparkAppWebUiAddressRequest(this);
        } 

    } 

}
