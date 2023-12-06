// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProductVersionRequest} extends {@link RequestModel}
 *
 * <p>GetProductVersionRequest</p>
 */
public class GetProductVersionRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Query
    @NameInMap("withDocumentationURL")
    private Boolean withDocumentationURL;

    @Query
    @NameInMap("withExtendResourceURL")
    private Boolean withExtendResourceURL;

    private GetProductVersionRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.withDocumentationURL = builder.withDocumentationURL;
        this.withExtendResourceURL = builder.withExtendResourceURL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductVersionRequest create() {
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
     * @return withDocumentationURL
     */
    public Boolean getWithDocumentationURL() {
        return this.withDocumentationURL;
    }

    /**
     * @return withExtendResourceURL
     */
    public Boolean getWithExtendResourceURL() {
        return this.withExtendResourceURL;
    }

    public static final class Builder extends Request.Builder<GetProductVersionRequest, Builder> {
        private String uid; 
        private Boolean withDocumentationURL; 
        private Boolean withExtendResourceURL; 

        private Builder() {
            super();
        } 

        private Builder(GetProductVersionRequest request) {
            super(request);
            this.uid = request.uid;
            this.withDocumentationURL = request.withDocumentationURL;
            this.withExtendResourceURL = request.withExtendResourceURL;
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
         * withDocumentationURL.
         */
        public Builder withDocumentationURL(Boolean withDocumentationURL) {
            this.putQueryParameter("withDocumentationURL", withDocumentationURL);
            this.withDocumentationURL = withDocumentationURL;
            return this;
        }

        /**
         * withExtendResourceURL.
         */
        public Builder withExtendResourceURL(Boolean withExtendResourceURL) {
            this.putQueryParameter("withExtendResourceURL", withExtendResourceURL);
            this.withExtendResourceURL = withExtendResourceURL;
            return this;
        }

        @Override
        public GetProductVersionRequest build() {
            return new GetProductVersionRequest(this);
        } 

    } 

}
