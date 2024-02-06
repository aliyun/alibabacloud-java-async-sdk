// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBucketLifecycleRequest} extends {@link RequestModel}
 *
 * <p>DeleteBucketLifecycleRequest</p>
 */
public class DeleteBucketLifecycleRequest extends Request {
    @Query
    @NameInMap("BucketName")
    @Validation(required = true)
    private String bucketName;

    @Query
    @NameInMap("RuleId")
    private String ruleId;

    private DeleteBucketLifecycleRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBucketLifecycleRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteBucketLifecycleRequest, Builder> {
        private String bucketName; 
        private String ruleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBucketLifecycleRequest request) {
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
         * The ID of the rule. If this parameter is not specified, all rules are removed.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public DeleteBucketLifecycleRequest build() {
            return new DeleteBucketLifecycleRequest(this);
        } 

    } 

}
