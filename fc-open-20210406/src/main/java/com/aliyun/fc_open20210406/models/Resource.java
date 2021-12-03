// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link Resource} extends {@link TeaModel}
 *
 * <p>Resource</p>
 */
public class Resource extends TeaModel {
    @NameInMap("resourceArn")
    private String resourceArn;

    @NameInMap("tags")
    private java.util.Map < String, String > tags;


    private Resource(Builder builder) {
        this.resourceArn = builder.resourceArn;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Resource create() {
        return builder().build();
    }

    /**
     * @return resourceArn
     */
    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * @return tags
     */
    public java.util.Map < String, String > getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String resourceArn; 
        private java.util.Map < String, String > tags; 

        /**
         * <p>resourceArn</p>
         */
        public Builder resourceArn(String resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }

        /**
         * <p>tags</p>
         */
        public Builder tags(java.util.Map < String, String > tags) {
            this.tags = tags;
            return this;
        }

        public Resource build() {
            return new Resource(this);
        } 

    } 

}
