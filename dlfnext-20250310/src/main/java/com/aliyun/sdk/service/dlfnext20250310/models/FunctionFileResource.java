// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FunctionFileResource} extends {@link TeaModel}
 *
 * <p>FunctionFileResource</p>
 */
public class FunctionFileResource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("uri")
    private String uri;

    private FunctionFileResource(Builder builder) {
        this.resourceType = builder.resourceType;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FunctionFileResource create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    public static final class Builder {
        private String resourceType; 
        private String uri; 

        private Builder() {
        } 

        private Builder(FunctionFileResource model) {
            this.resourceType = model.resourceType;
            this.uri = model.uri;
        } 

        /**
         * resourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * uri.
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public FunctionFileResource build() {
            return new FunctionFileResource(this);
        } 

    } 

}
