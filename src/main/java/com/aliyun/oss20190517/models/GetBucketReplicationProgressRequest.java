// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetBucketReplicationProgressRequest} extends {@link RequestModel}
 *
 * <p>GetBucketReplicationProgressRequest</p>
 */
public class GetBucketReplicationProgressRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Query
    @NameInMap("rule-id")
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

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return ruleId
     */
    public String ruleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<GetBucketReplicationProgressRequest.Builder> {
        private String bucket; 
        private String ruleId; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>rule-id.</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("rule-id", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        public GetBucketReplicationProgressRequest build() {
            return new GetBucketReplicationProgressRequest(this);
        } 

    } 

}
