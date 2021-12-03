// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link TagResourceRequest} extends {@link RequestModel}
 *
 * <p>TagResourceRequest</p>
 */
public class TagResourceRequest extends Request {
    @Body
    @NameInMap("resourceArn")
    private String resourceArn;

    @Body
    @NameInMap("tags")
    private java.util.Map < String, String > tags;


    private TagResourceRequest(Builder builder) {
        super(builder);
        this.resourceArn = builder.resourceArn;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TagResourceRequest create() {
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

    public static final class Builder extends Request.Builder {
        private String resourceArn; 
        private java.util.Map < String, String > tags; 

        /**
         * <p>resourceArn.</p>
         */
        public Builder resourceArn(String resourceArn) {
            this.putBodyParameter("resourceArn", resourceArn);
            this.resourceArn = resourceArn;
            return this;
        }

        /**
         * <p>tags.</p>
         */
        public Builder tags(java.util.Map < String, String > tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        public TagResourceRequest build() {
            return new TagResourceRequest(this);
        } 

    } 

}
