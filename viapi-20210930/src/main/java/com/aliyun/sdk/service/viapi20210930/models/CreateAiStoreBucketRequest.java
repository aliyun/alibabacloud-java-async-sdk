// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.viapi20210930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAiStoreBucketRequest} extends {@link RequestModel}
 *
 * <p>CreateAiStoreBucketRequest</p>
 */
public class CreateAiStoreBucketRequest extends Request {
    @Body
    @NameInMap("BucketName")
    private String bucketName;

    private CreateAiStoreBucketRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAiStoreBucketRequest create() {
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

    public static final class Builder extends Request.Builder<CreateAiStoreBucketRequest, Builder> {
        private String bucketName; 

        private Builder() {
            super();
        } 

        private Builder(CreateAiStoreBucketRequest request) {
            super(request);
            this.bucketName = request.bucketName;
        } 

        /**
         * BucketName.
         */
        public Builder bucketName(String bucketName) {
            this.putBodyParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        @Override
        public CreateAiStoreBucketRequest build() {
            return new CreateAiStoreBucketRequest(this);
        } 

    } 

}
