// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.batchcompute20151111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAppRequest} extends {@link RequestModel}
 *
 * <p>ModifyAppRequest</p>
 */
public class ModifyAppRequest extends Request {
    @Path
    @NameInMap("ResourceName")
    @Validation(required = true)
    private String resourceName;

    @Body
    @NameInMap("body")
    private String body;

    private ModifyAppRequest(Builder builder) {
        super(builder);
        this.resourceName = builder.resourceName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAppRequest create() {
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
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ModifyAppRequest, Builder> {
        private String resourceName; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAppRequest response) {
            super(response);
            this.resourceName = response.resourceName;
            this.body = response.body;
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
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ModifyAppRequest build() {
            return new ModifyAppRequest(this);
        } 

    } 

}
