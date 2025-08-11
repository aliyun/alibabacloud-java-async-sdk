// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QueryLastAccelerationEngineJobRequest} extends {@link RequestModel}
 *
 * <p>QueryLastAccelerationEngineJobRequest</p>
 */
public class QueryLastAccelerationEngineJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CubeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cubeId;

    private QueryLastAccelerationEngineJobRequest(Builder builder) {
        super(builder);
        this.cubeId = builder.cubeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLastAccelerationEngineJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cubeId
     */
    public String getCubeId() {
        return this.cubeId;
    }

    public static final class Builder extends Request.Builder<QueryLastAccelerationEngineJobRequest, Builder> {
        private String cubeId; 

        private Builder() {
            super();
        } 

        private Builder(QueryLastAccelerationEngineJobRequest request) {
            super(request);
            this.cubeId = request.cubeId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d23d30c0-****-6c92bf668356</p>
         */
        public Builder cubeId(String cubeId) {
            this.putQueryParameter("CubeId", cubeId);
            this.cubeId = cubeId;
            return this;
        }

        @Override
        public QueryLastAccelerationEngineJobRequest build() {
            return new QueryLastAccelerationEngineJobRequest(this);
        } 

    } 

}
