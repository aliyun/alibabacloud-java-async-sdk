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
 * {@link QueryDatasetSmartqStatusRequest} extends {@link RequestModel}
 *
 * <p>QueryDatasetSmartqStatusRequest</p>
 */
public class QueryDatasetSmartqStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CubeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cubeId;

    private QueryDatasetSmartqStatusRequest(Builder builder) {
        super(builder);
        this.cubeId = builder.cubeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDatasetSmartqStatusRequest create() {
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

    public static final class Builder extends Request.Builder<QueryDatasetSmartqStatusRequest, Builder> {
        private String cubeId; 

        private Builder() {
            super();
        } 

        private Builder(QueryDatasetSmartqStatusRequest request) {
            super(request);
            this.cubeId = request.cubeId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7c7223ae-****-3c744528014b</p>
         */
        public Builder cubeId(String cubeId) {
            this.putQueryParameter("CubeId", cubeId);
            this.cubeId = cubeId;
            return this;
        }

        @Override
        public QueryDatasetSmartqStatusRequest build() {
            return new QueryDatasetSmartqStatusRequest(this);
        } 

    } 

}
