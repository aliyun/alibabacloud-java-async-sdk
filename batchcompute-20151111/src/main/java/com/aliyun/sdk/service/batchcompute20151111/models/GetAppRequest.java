// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.batchcompute20151111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppRequest} extends {@link RequestModel}
 *
 * <p>GetAppRequest</p>
 */
public class GetAppRequest extends Request {
    @Path
    @NameInMap("ResourceName")
    @Validation(required = true)
    private String resourceName;

    @Query
    @NameInMap("Detail")
    private String detail;

    @Query
    @NameInMap("Qualifier")
    private String qualifier;

    @Query
    @NameInMap("Revisions")
    private String revisions;

    @Query
    @NameInMap("Scope")
    private String scope;

    private GetAppRequest(Builder builder) {
        super(builder);
        this.resourceName = builder.resourceName;
        this.detail = builder.detail;
        this.qualifier = builder.qualifier;
        this.revisions = builder.revisions;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @return revisions
     */
    public String getRevisions() {
        return this.revisions;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder extends Request.Builder<GetAppRequest, Builder> {
        private String resourceName; 
        private String detail; 
        private String qualifier; 
        private String revisions; 
        private String scope; 

        private Builder() {
            super();
        } 

        private Builder(GetAppRequest response) {
            super(response);
            this.resourceName = response.resourceName;
            this.detail = response.detail;
            this.qualifier = response.qualifier;
            this.revisions = response.revisions;
            this.scope = response.scope;
        } 

        /**
         * ResourceName.
         */
        public Builder resourceName(String resourceName) {
            this.putPathParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * Detail.
         */
        public Builder detail(String detail) {
            this.putQueryParameter("Detail", detail);
            this.detail = detail;
            return this;
        }

        /**
         * Qualifier.
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("Qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        /**
         * Revisions.
         */
        public Builder revisions(String revisions) {
            this.putQueryParameter("Revisions", revisions);
            this.revisions = revisions;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        @Override
        public GetAppRequest build() {
            return new GetAppRequest(this);
        } 

    } 

}
