// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBlockRequest} extends {@link RequestModel}
 *
 * <p>QueryBlockRequest</p>
 */
public class QueryBlockRequest extends Request {
    @Body
    @NameInMap("Bizid")
    private String bizid;

    @Body
    @NameInMap("Height")
    private Long height;

    private QueryBlockRequest(Builder builder) {
        super(builder);
        this.bizid = builder.bizid;
        this.height = builder.height;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBlockRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizid
     */
    public String getBizid() {
        return this.bizid;
    }

    /**
     * @return height
     */
    public Long getHeight() {
        return this.height;
    }

    public static final class Builder extends Request.Builder<QueryBlockRequest, Builder> {
        private String bizid; 
        private Long height; 

        private Builder() {
            super();
        } 

        private Builder(QueryBlockRequest request) {
            super(request);
            this.bizid = request.bizid;
            this.height = request.height;
        } 

        /**
         * Bizid.
         */
        public Builder bizid(String bizid) {
            this.putBodyParameter("Bizid", bizid);
            this.bizid = bizid;
            return this;
        }

        /**
         * Height.
         */
        public Builder height(Long height) {
            this.putBodyParameter("Height", height);
            this.height = height;
            return this;
        }

        @Override
        public QueryBlockRequest build() {
            return new QueryBlockRequest(this);
        } 

    } 

}
