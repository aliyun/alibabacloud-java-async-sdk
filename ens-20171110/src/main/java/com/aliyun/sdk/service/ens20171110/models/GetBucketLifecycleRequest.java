// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBucketLifecycleRequest} extends {@link RequestModel}
 *
 * <p>GetBucketLifecycleRequest</p>
 */
public class GetBucketLifecycleRequest extends Request {
    @Query
    @NameInMap("BucketName")
    @Validation(required = true)
    private String bucketName;

    @Query
    @NameInMap("RuleId")
    private String ruleId;

    private GetBucketLifecycleRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketLifecycleRequest create() {
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
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<GetBucketLifecycleRequest, Builder> {
        private String bucketName; 
        private String ruleId; 

        private Builder() {
            super();
        } 

        private Builder(GetBucketLifecycleRequest request) {
            super(request);
            this.bucketName = request.bucketName;
            this.ruleId = request.ruleId;
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
         * The ID of the rule to be queried. If this parameter is not specified, all rules are returned.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public GetBucketLifecycleRequest build() {
            return new GetBucketLifecycleRequest(this);
        } 

    } 

}
