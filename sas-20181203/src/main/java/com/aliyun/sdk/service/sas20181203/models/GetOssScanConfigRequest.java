// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOssScanConfigRequest} extends {@link RequestModel}
 *
 * <p>GetOssScanConfigRequest</p>
 */
public class GetOssScanConfigRequest extends Request {
    @Query
    @NameInMap("BucketName")
    private String bucketName;

    @Query
    @NameInMap("Id")
    private String id;

    private GetOssScanConfigRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssScanConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<GetOssScanConfigRequest, Builder> {
        private String bucketName; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(GetOssScanConfigRequest request) {
            super(request);
            this.bucketName = request.bucketName;
            this.id = request.id;
        } 

        /**
         * The name of the bucket.
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * The ID of the policy.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetOssScanConfigRequest build() {
            return new GetOssScanConfigRequest(this);
        } 

    } 

}
