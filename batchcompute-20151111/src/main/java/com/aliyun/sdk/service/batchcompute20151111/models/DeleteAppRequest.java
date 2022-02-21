// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.batchcompute20151111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAppRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppRequest</p>
 */
public class DeleteAppRequest extends Request {
    @Path
    @NameInMap("ResourceName")
    @Validation(required = true)
    private String resourceName;

    @Query
    @NameInMap("Qualifier")
    private String qualifier;

    private DeleteAppRequest(Builder builder) {
        super(builder);
        this.resourceName = builder.resourceName;
        this.qualifier = builder.qualifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppRequest create() {
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
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    public static final class Builder extends Request.Builder<DeleteAppRequest, Builder> {
        private String resourceName; 
        private String qualifier; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAppRequest response) {
            super(response);
            this.resourceName = response.resourceName;
            this.qualifier = response.qualifier;
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
         * Qualifier.
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("Qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        @Override
        public DeleteAppRequest build() {
            return new DeleteAppRequest(this);
        } 

    } 

}
