// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPictureInfoWithVectorIdsRequest} extends {@link RequestModel}
 *
 * <p>GetPictureInfoWithVectorIdsRequest</p>
 */
public class GetPictureInfoWithVectorIdsRequest extends Request {
    @Query
    @NameInMap("VectorIdList")
    @Validation(required = true)
    private java.util.List < String > vectorIdList;

    private GetPictureInfoWithVectorIdsRequest(Builder builder) {
        super(builder);
        this.vectorIdList = builder.vectorIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPictureInfoWithVectorIdsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return vectorIdList
     */
    public java.util.List < String > getVectorIdList() {
        return this.vectorIdList;
    }

    public static final class Builder extends Request.Builder<GetPictureInfoWithVectorIdsRequest, Builder> {
        private java.util.List < String > vectorIdList; 

        private Builder() {
            super();
        } 

        private Builder(GetPictureInfoWithVectorIdsRequest response) {
            super(response);
            this.vectorIdList = response.vectorIdList;
        } 

        /**
         * VectorIdList.
         */
        public Builder vectorIdList(java.util.List < String > vectorIdList) {
            this.putQueryParameter("VectorIdList", vectorIdList);
            this.vectorIdList = vectorIdList;
            return this;
        }

        @Override
        public GetPictureInfoWithVectorIdsRequest build() {
            return new GetPictureInfoWithVectorIdsRequest(this);
        } 

    } 

}
