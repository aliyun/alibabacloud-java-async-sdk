// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkDefinitionsRequest} extends {@link RequestModel}
 *
 * <p>GetSparkDefinitionsRequest</p>
 */
public class GetSparkDefinitionsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    private GetSparkDefinitionsRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkDefinitionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public static final class Builder extends Request.Builder<GetSparkDefinitionsRequest, Builder> {
        private String DBClusterId; 

        private Builder() {
            super();
        } 

        private Builder(GetSparkDefinitionsRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
        } 

        /**
         * The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        @Override
        public GetSparkDefinitionsRequest build() {
            return new GetSparkDefinitionsRequest(this);
        } 

    } 

}
