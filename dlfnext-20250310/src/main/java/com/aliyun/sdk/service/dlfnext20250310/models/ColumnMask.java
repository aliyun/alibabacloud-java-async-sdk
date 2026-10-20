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
 * {@link ColumnMask} extends {@link TeaModel}
 *
 * <p>ColumnMask</p>
 */
public class ColumnMask extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("expression")
    private String expression;

    @com.aliyun.core.annotation.NameInMap("transform")
    private String transform;

    private ColumnMask(Builder builder) {
        this.expression = builder.expression;
        this.transform = builder.transform;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ColumnMask create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expression
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * @return transform
     */
    public String getTransform() {
        return this.transform;
    }

    public static final class Builder {
        private String expression; 
        private String transform; 

        private Builder() {
        } 

        private Builder(ColumnMask model) {
            this.expression = model.expression;
            this.transform = model.transform;
        } 

        /**
         * <p>The column masking expression.</p>
         * 
         * <strong>example:</strong>
         * <p>CONCAT(\&quot;<em><strong>-</strong>-</em>***\&quot;)</p>
         */
        public Builder expression(String expression) {
            this.expression = expression;
            return this;
        }

        /**
         * <p>The column masking transform method.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;CONCAT&quot;,&quot;inputs&quot;:[&quot;***-&quot;,{&quot;index&quot;:1,&quot;name&quot;:&quot;phone&quot;,&quot;type&quot;:&quot;STRING&quot;}]}</p>
         */
        public Builder transform(String transform) {
            this.transform = transform;
            return this;
        }

        public ColumnMask build() {
            return new ColumnMask(this);
        } 

    } 

}
