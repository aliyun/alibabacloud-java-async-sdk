// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link Resource} extends {@link TeaModel}
 *
 * <p>Resource</p>
 */
public class Resource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("resouceType")
    private String resouceType;

    @com.aliyun.core.annotation.NameInMap("resourceArn")
    private String resourceArn;

    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.Map<String, String> tags;

    private Resource(Builder builder) {
        this.resouceType = builder.resouceType;
        this.resourceArn = builder.resourceArn;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Resource create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resouceType
     */
    public String getResouceType() {
        return this.resouceType;
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
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String resouceType; 
        private String resourceArn; 
        private java.util.Map<String, String> tags; 

        private Builder() {
        } 

        private Builder(Resource model) {
            this.resouceType = model.resouceType;
            this.resourceArn = model.resourceArn;
            this.tags = model.tags;
        } 

        /**
         * <p>The name of the resource type. For a function in Function Compute 3.0, use ALIYUN::FC::FUNCTION. For a service in an earlier version of Function Compute, use ALIYUN::FC::SERVICE.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::FC::FUNCTION</p>
         */
        public Builder resouceType(String resouceType) {
            this.resouceType = resouceType;
            return this;
        }

        /**
         * <p>The Alibaba Cloud resource descriptor.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:fc:cn-shanghai:****:functions/demo</p>
         */
        public Builder resourceArn(String resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }

        /**
         * <p>The tag dictionary.</p>
         */
        public Builder tags(java.util.Map<String, String> tags) {
            this.tags = tags;
            return this;
        }

        public Resource build() {
            return new Resource(this);
        } 

    } 

}
