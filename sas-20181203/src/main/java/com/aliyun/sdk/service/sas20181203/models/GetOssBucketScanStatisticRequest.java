// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOssBucketScanStatisticRequest} extends {@link RequestModel}
 *
 * <p>GetOssBucketScanStatisticRequest</p>
 */
public class GetOssBucketScanStatisticRequest extends Request {
    @Query
    @NameInMap("BucketNameList")
    private java.util.List < String > bucketNameList;

    private GetOssBucketScanStatisticRequest(Builder builder) {
        super(builder);
        this.bucketNameList = builder.bucketNameList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssBucketScanStatisticRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucketNameList
     */
    public java.util.List < String > getBucketNameList() {
        return this.bucketNameList;
    }

    public static final class Builder extends Request.Builder<GetOssBucketScanStatisticRequest, Builder> {
        private java.util.List < String > bucketNameList; 

        private Builder() {
            super();
        } 

        private Builder(GetOssBucketScanStatisticRequest request) {
            super(request);
            this.bucketNameList = request.bucketNameList;
        } 

        /**
         * BucketNameList.
         */
        public Builder bucketNameList(java.util.List < String > bucketNameList) {
            this.putQueryParameter("BucketNameList", bucketNameList);
            this.bucketNameList = bucketNameList;
            return this;
        }

        @Override
        public GetOssBucketScanStatisticRequest build() {
            return new GetOssBucketScanStatisticRequest(this);
        } 

    } 

}
