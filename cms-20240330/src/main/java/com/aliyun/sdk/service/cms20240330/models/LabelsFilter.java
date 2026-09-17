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
 * {@link LabelsFilter} extends {@link TeaModel}
 *
 * <p>LabelsFilter</p>
 */
public class LabelsFilter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("allOf")
    private java.util.List<LabelMatcher> allOf;

    @com.aliyun.core.annotation.NameInMap("anyOf")
    private java.util.List<LabelMatcher> anyOf;

    private LabelsFilter(Builder builder) {
        this.allOf = builder.allOf;
        this.anyOf = builder.anyOf;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LabelsFilter create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allOf
     */
    public java.util.List<LabelMatcher> getAllOf() {
        return this.allOf;
    }

    /**
     * @return anyOf
     */
    public java.util.List<LabelMatcher> getAnyOf() {
        return this.anyOf;
    }

    public static final class Builder {
        private java.util.List<LabelMatcher> allOf; 
        private java.util.List<LabelMatcher> anyOf; 

        private Builder() {
        } 

        private Builder(LabelsFilter model) {
            this.allOf = model.allOf;
            this.anyOf = model.anyOf;
        } 

        /**
         * <p>Match all labels (AND).</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;key&quot;:&quot;env&quot;,&quot;value&quot;:&quot;production&quot;},{&quot;key&quot;:&quot;team&quot;,&quot;value&quot;:&quot;ops&quot;}]</p>
         */
        public Builder allOf(java.util.List<LabelMatcher> allOf) {
            this.allOf = allOf;
            return this;
        }

        /**
         * <p>Match any label (OR).</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;key&quot;:&quot;env&quot;,&quot;value&quot;:&quot;production&quot;},{&quot;key&quot;:&quot;env&quot;,&quot;value&quot;:&quot;staging&quot;}]</p>
         */
        public Builder anyOf(java.util.List<LabelMatcher> anyOf) {
            this.anyOf = anyOf;
            return this;
        }

        public LabelsFilter build() {
            return new LabelsFilter(this);
        } 

    } 

}
