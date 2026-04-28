// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link CopyUserTagsDirective} extends {@link TeaModel}
 *
 * <p>CopyUserTagsDirective</p>
 */
public class CopyUserTagsDirective extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("directive")
    private String directive;

    @com.aliyun.core.annotation.NameInMap("keys")
    private java.util.List<String> keys;

    private CopyUserTagsDirective(Builder builder) {
        this.directive = builder.directive;
        this.keys = builder.keys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyUserTagsDirective create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directive
     */
    public String getDirective() {
        return this.directive;
    }

    /**
     * @return keys
     */
    public java.util.List<String> getKeys() {
        return this.keys;
    }

    public static final class Builder {
        private String directive; 
        private java.util.List<String> keys; 

        private Builder() {
        } 

        private Builder(CopyUserTagsDirective model) {
            this.directive = model.directive;
            this.keys = model.keys;
        } 

        /**
         * directive.
         */
        public Builder directive(String directive) {
            this.directive = directive;
            return this;
        }

        /**
         * keys.
         */
        public Builder keys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }

        public CopyUserTagsDirective build() {
            return new CopyUserTagsDirective(this);
        } 

    } 

}
