// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20211130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataSetStatusRequest} extends {@link RequestModel}
 *
 * <p>GetDataSetStatusRequest</p>
 */
public class GetDataSetStatusRequest extends Request {
    @Query
    @NameInMap("dataSetId")
    @Validation(required = true)
    private Long dataSetId;

    private GetDataSetStatusRequest(Builder builder) {
        super(builder);
        this.dataSetId = builder.dataSetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataSetStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSetId
     */
    public Long getDataSetId() {
        return this.dataSetId;
    }

    public static final class Builder extends Request.Builder<GetDataSetStatusRequest, Builder> {
        private Long dataSetId; 

        private Builder() {
            super();
        } 

        private Builder(GetDataSetStatusRequest request) {
            super(request);
            this.dataSetId = request.dataSetId;
        } 

        /**
         * dataSetId.
         */
        public Builder dataSetId(Long dataSetId) {
            this.putQueryParameter("dataSetId", dataSetId);
            this.dataSetId = dataSetId;
            return this;
        }

        @Override
        public GetDataSetStatusRequest build() {
            return new GetDataSetStatusRequest(this);
        } 

    } 

}
