// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProductRequest} extends {@link RequestModel}
 *
 * <p>GetProductRequest</p>
 */
public class GetProductRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Query
    @NameInMap("withIconURL")
    private Boolean withIconURL;

    private GetProductRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.withIconURL = builder.withIconURL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return withIconURL
     */
    public Boolean getWithIconURL() {
        return this.withIconURL;
    }

    public static final class Builder extends Request.Builder<GetProductRequest, Builder> {
        private String uid; 
        private Boolean withIconURL; 

        private Builder() {
            super();
        } 

        private Builder(GetProductRequest request) {
            super(request);
            this.uid = request.uid;
            this.withIconURL = request.withIconURL;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * withIconURL.
         */
        public Builder withIconURL(Boolean withIconURL) {
            this.putQueryParameter("withIconURL", withIconURL);
            this.withIconURL = withIconURL;
            return this;
        }

        @Override
        public GetProductRequest build() {
            return new GetProductRequest(this);
        } 

    } 

}
