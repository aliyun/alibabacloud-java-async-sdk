// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResourceUri} extends {@link TeaModel}
 *
 * <p>ResourceUri</p>
 */
public class ResourceUri extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("Uri")
    private String uri;

    private ResourceUri(Builder builder) {
        this.resourceType = builder.resourceType;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceUri create() {
        return builder().build();
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

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Uri.
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public ResourceUri build() {
            return new ResourceUri(this);
        } 

    } 

}
