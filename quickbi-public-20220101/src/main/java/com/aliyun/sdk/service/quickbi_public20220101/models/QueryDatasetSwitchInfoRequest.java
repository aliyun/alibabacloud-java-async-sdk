// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDatasetSwitchInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryDatasetSwitchInfoRequest</p>
 */
public class QueryDatasetSwitchInfoRequest extends Request {
    @Query
    @NameInMap("CubeId")
    @Validation(required = true)
    private String cubeId;

    private QueryDatasetSwitchInfoRequest(Builder builder) {
        super(builder);
        this.cubeId = builder.cubeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDatasetSwitchInfoRequest create() {
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

    public static final class Builder extends Request.Builder<QueryDatasetSwitchInfoRequest, Builder> {
        private String cubeId; 

        private Builder() {
            super();
        } 

        private Builder(QueryDatasetSwitchInfoRequest request) {
            super(request);
            this.cubeId = request.cubeId;
        } 

        /**
         * CubeId.
         */
        public Builder cubeId(String cubeId) {
            this.putQueryParameter("CubeId", cubeId);
            this.cubeId = cubeId;
            return this;
        }

        @Override
        public QueryDatasetSwitchInfoRequest build() {
            return new QueryDatasetSwitchInfoRequest(this);
        } 

    } 

}
