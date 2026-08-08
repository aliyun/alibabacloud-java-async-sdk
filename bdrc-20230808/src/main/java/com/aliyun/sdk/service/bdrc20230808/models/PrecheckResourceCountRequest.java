// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

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
 * {@link PrecheckResourceCountRequest} extends {@link RequestModel}
 *
 * <p>PrecheckResourceCountRequest</p>
 */
public class PrecheckResourceCountRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagResourceMatchers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<TagResourceMatchers> tagResourceMatchers;

    private PrecheckResourceCountRequest(Builder builder) {
        super(builder);
        this.resourceType = builder.resourceType;
        this.tagResourceMatchers = builder.tagResourceMatchers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrecheckResourceCountRequest create() {
        return builder().build();
    }

@Override
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
     * @return tagResourceMatchers
     */
    public java.util.List<TagResourceMatchers> getTagResourceMatchers() {
        return this.tagResourceMatchers;
    }

    public static final class Builder extends Request.Builder<PrecheckResourceCountRequest, Builder> {
        private String resourceType; 
        private java.util.List<TagResourceMatchers> tagResourceMatchers; 

        private Builder() {
            super();
        } 

        private Builder(PrecheckResourceCountRequest request) {
            super(request);
            this.resourceType = request.resourceType;
            this.tagResourceMatchers = request.tagResourceMatchers;
        } 

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder tagResourceMatchers(java.util.List<TagResourceMatchers> tagResourceMatchers) {
            String tagResourceMatchersShrink = shrink(tagResourceMatchers, "TagResourceMatchers", "json");
            this.putBodyParameter("TagResourceMatchers", tagResourceMatchersShrink);
            this.tagResourceMatchers = tagResourceMatchers;
            return this;
        }

        @Override
        public PrecheckResourceCountRequest build() {
            return new PrecheckResourceCountRequest(this);
        } 

    } 

    /**
     * 
     * {@link PrecheckResourceCountRequest} extends {@link TeaModel}
     *
     * <p>PrecheckResourceCountRequest</p>
     */
    public static class TagResourceMatchers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Operator")
        @com.aliyun.core.annotation.Validation(required = true)
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

        private TagResourceMatchers(Builder builder) {
            this.key = builder.key;
            this.operator = builder.operator;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagResourceMatchers create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private String operator; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(TagResourceMatchers model) {
                this.key = model.key;
                this.operator = model.operator;
                this.values = model.values;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CreatedBy</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>EQUAL</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public TagResourceMatchers build() {
                return new TagResourceMatchers(this);
            } 

        } 

    }
}
