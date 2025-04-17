// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link DetachOSSBucketRequest} extends {@link RequestModel}
 *
 * <p>DetachOSSBucketRequest</p>
 */
public class DetachOSSBucketRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSSBucket")
    @com.aliyun.core.annotation.Validation(required = true)
    private String OSSBucket;

    private DetachOSSBucketRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.OSSBucket = builder.OSSBucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachOSSBucketRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return OSSBucket
     */
    public String getOSSBucket() {
        return this.OSSBucket;
    }

    public static final class Builder extends Request.Builder<DetachOSSBucketRequest, Builder> {
        private String regionId; 
        private String OSSBucket; 

        private Builder() {
            super();
        } 

        private Builder(DetachOSSBucketRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.OSSBucket = request.OSSBucket;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The OSS bucket that you want to unbind.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>examplebucket</p>
         */
        public Builder OSSBucket(String OSSBucket) {
            this.putQueryParameter("OSSBucket", OSSBucket);
            this.OSSBucket = OSSBucket;
            return this;
        }

        @Override
        public DetachOSSBucketRequest build() {
            return new DetachOSSBucketRequest(this);
        } 

    } 

}
