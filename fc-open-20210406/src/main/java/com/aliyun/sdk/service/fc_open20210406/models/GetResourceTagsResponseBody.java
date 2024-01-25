// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceTagsResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceTagsResponseBody</p>
 */
public class GetResourceTagsResponseBody extends TeaModel {
    @NameInMap("resourceArn")
    private String resourceArn;

    @NameInMap("tags")
    private java.util.Map < String, String > tags;

    private GetResourceTagsResponseBody(Builder builder) {
        this.resourceArn = builder.resourceArn;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceTagsResponseBody create() {
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
         * The Alibaba Cloud Resource Name (ARN) of the resource.
         * <p>
         * 
         * >  You can use the value of this parameter to query information about the resource, such as the account, service, and region of the resource.
         */
        public Builder resourceArn(String resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }

        /**
         * The tag dictionary.
         */
        public Builder tags(java.util.Map < String, String > tags) {
            this.tags = tags;
            return this;
        }

        public GetResourceTagsResponseBody build() {
            return new GetResourceTagsResponseBody(this);
        } 

    } 

}
