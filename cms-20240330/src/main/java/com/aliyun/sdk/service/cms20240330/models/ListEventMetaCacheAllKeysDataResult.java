// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListEventMetaCacheAllKeysDataResult} extends {@link TeaModel}
 *
 * <p>ListEventMetaCacheAllKeysDataResult</p>
 */
public class ListEventMetaCacheAllKeysDataResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("annotation")
    private java.util.List<String> annotation;

    @com.aliyun.core.annotation.NameInMap("label")
    private java.util.List<String> label;

    @com.aliyun.core.annotation.NameInMap("resourceTag")
    private java.util.List<String> resourceTag;

    private ListEventMetaCacheAllKeysDataResult(Builder builder) {
        this.annotation = builder.annotation;
        this.label = builder.label;
        this.resourceTag = builder.resourceTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventMetaCacheAllKeysDataResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return annotation
     */
    public java.util.List<String> getAnnotation() {
        return this.annotation;
    }

    /**
     * @return label
     */
    public java.util.List<String> getLabel() {
        return this.label;
    }

    /**
     * @return resourceTag
     */
    public java.util.List<String> getResourceTag() {
        return this.resourceTag;
    }

    public static final class Builder {
        private java.util.List<String> annotation; 
        private java.util.List<String> label; 
        private java.util.List<String> resourceTag; 

        private Builder() {
        } 

        private Builder(ListEventMetaCacheAllKeysDataResult model) {
            this.annotation = model.annotation;
            this.label = model.label;
            this.resourceTag = model.resourceTag;
        } 

        /**
         * <p>annotation类型的Key列表</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;message&quot;,&quot;current_value&quot;]</p>
         */
        public Builder annotation(java.util.List<String> annotation) {
            this.annotation = annotation;
            return this;
        }

        /**
         * <p>label类型的Key列表</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;_cms_rule_id&quot;,&quot;_cms_rule_name&quot;]</p>
         */
        public Builder label(java.util.List<String> label) {
            this.label = label;
            return this;
        }

        /**
         * <p>resource.tag类型的Key列表</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;arn&quot;,&quot;callType&quot;]</p>
         */
        public Builder resourceTag(java.util.List<String> resourceTag) {
            this.resourceTag = resourceTag;
            return this;
        }

        public ListEventMetaCacheAllKeysDataResult build() {
            return new ListEventMetaCacheAllKeysDataResult(this);
        } 

    } 

}
