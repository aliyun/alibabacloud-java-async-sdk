// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOssStorageAndAccByBucketsRequest} extends {@link RequestModel}
 *
 * <p>GetOssStorageAndAccByBucketsRequest</p>
 */
public class GetOssStorageAndAccByBucketsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketList")
    private String bucketList;

    private GetOssStorageAndAccByBucketsRequest(Builder builder) {
        super(builder);
        this.bucketList = builder.bucketList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssStorageAndAccByBucketsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucketList
     */
    public String getBucketList() {
        return this.bucketList;
    }

    public static final class Builder extends Request.Builder<GetOssStorageAndAccByBucketsRequest, Builder> {
        private String bucketList; 

        private Builder() {
            super();
        } 

        private Builder(GetOssStorageAndAccByBucketsRequest request) {
            super(request);
            this.bucketList = request.bucketList;
        } 

        /**
         * The information about the bucket.
         */
        public Builder bucketList(String bucketList) {
            this.putQueryParameter("BucketList", bucketList);
            this.bucketList = bucketList;
            return this;
        }

        @Override
        public GetOssStorageAndAccByBucketsRequest build() {
            return new GetOssStorageAndAccByBucketsRequest(this);
        } 

    } 

}
