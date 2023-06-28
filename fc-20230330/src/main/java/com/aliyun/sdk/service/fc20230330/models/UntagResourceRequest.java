// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UntagResourceRequest} extends {@link RequestModel}
 *
 * <p>UntagResourceRequest</p>
 */
public class UntagResourceRequest extends Request {
    @Query
    @NameInMap("all")
    private Boolean all;

    @Query
    @NameInMap("arn")
    @Validation(required = true)
    private String arn;

    @Query
    @NameInMap("tagKeys")
    private String tagKeys;

    private UntagResourceRequest(Builder builder) {
        super(builder);
        this.all = builder.all;
        this.arn = builder.arn;
        this.tagKeys = builder.tagKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UntagResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return all
     */
    public Boolean getAll() {
        return this.all;
    }

    /**
     * @return arn
     */
    public String getArn() {
        return this.arn;
    }

    /**
     * @return tagKeys
     */
    public String getTagKeys() {
        return this.tagKeys;
    }

    public static final class Builder extends Request.Builder<UntagResourceRequest, Builder> {
        private Boolean all; 
        private String arn; 
        private String tagKeys; 

        private Builder() {
            super();
        } 

        private Builder(UntagResourceRequest request) {
            super(request);
            this.all = request.all;
            this.arn = request.arn;
            this.tagKeys = request.tagKeys;
        } 

        /**
         * all.
         */
        public Builder all(Boolean all) {
            this.putQueryParameter("all", all);
            this.all = all;
            return this;
        }

        /**
         * arn.
         */
        public Builder arn(String arn) {
            this.putQueryParameter("arn", arn);
            this.arn = arn;
            return this;
        }

        /**
         * tagKeys.
         */
        public Builder tagKeys(String tagKeys) {
            this.putQueryParameter("tagKeys", tagKeys);
            this.tagKeys = tagKeys;
            return this;
        }

        @Override
        public UntagResourceRequest build() {
            return new UntagResourceRequest(this);
        } 

    } 

}
