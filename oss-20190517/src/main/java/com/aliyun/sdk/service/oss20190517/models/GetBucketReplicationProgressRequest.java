// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketReplicationProgressRequest} extends {@link RequestModel}
 *
 * <p>GetBucketReplicationProgressRequest</p>
 */
public class GetBucketReplicationProgressRequest extends Request {
    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    @Query
    @NameInMap("rule-id")
    @Validation(required = true)
    private String ruleId;

    private GetBucketReplicationProgressRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketReplicationProgressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<GetBucketReplicationProgressRequest, Builder> {
        private String bucket; 
        private String ruleId; 

        private Builder() {
            super();
        } 

        private Builder(GetBucketReplicationProgressRequest request) {
            super(request);
            this.bucket = request.bucket;
            this.ruleId = request.ruleId;
        } 

        /**
         * bucket.
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * rule-id.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("rule-id", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public GetBucketReplicationProgressRequest build() {
            return new GetBucketReplicationProgressRequest(this);
        } 

    } 

}
