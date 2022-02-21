// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPictureWithVectorIdRequest} extends {@link RequestModel}
 *
 * <p>GetPictureWithVectorIdRequest</p>
 */
public class GetPictureWithVectorIdRequest extends Request {
    @Query
    @NameInMap("VectorId")
    @Validation(required = true)
    private String vectorId;

    private GetPictureWithVectorIdRequest(Builder builder) {
        super(builder);
        this.vectorId = builder.vectorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPictureWithVectorIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return vectorId
     */
    public String getVectorId() {
        return this.vectorId;
    }

    public static final class Builder extends Request.Builder<GetPictureWithVectorIdRequest, Builder> {
        private String vectorId; 

        private Builder() {
            super();
        } 

        private Builder(GetPictureWithVectorIdRequest response) {
            super(response);
            this.vectorId = response.vectorId;
        } 

        /**
         * VectorId.
         */
        public Builder vectorId(String vectorId) {
            this.putQueryParameter("VectorId", vectorId);
            this.vectorId = vectorId;
            return this;
        }

        @Override
        public GetPictureWithVectorIdRequest build() {
            return new GetPictureWithVectorIdRequest(this);
        } 

    } 

}
