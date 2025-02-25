// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link GetSparkTemplateFullTreeRequest} extends {@link RequestModel}
 *
 * <p>GetSparkTemplateFullTreeRequest</p>
 */
public class GetSparkTemplateFullTreeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String DBClusterId;

    private GetSparkTemplateFullTreeRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkTemplateFullTreeRequest create() {
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

    public static final class Builder extends Request.Builder<GetSparkTemplateFullTreeRequest, Builder> {
        private String DBClusterId; 

        private Builder() {
            super();
        } 

        private Builder(GetSparkTemplateFullTreeRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
        } 

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp11q28kvl688****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        @Override
        public GetSparkTemplateFullTreeRequest build() {
            return new GetSparkTemplateFullTreeRequest(this);
        } 

    } 

}
