// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link Row} extends {@link TeaModel}
 *
 * <p>Row</p>
 */
public class Row extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomLabels")
    private java.util.List<KeyValuePair> customLabels;

    @com.aliyun.core.annotation.NameInMap("URI")
    private String URI;

    private Row(Builder builder) {
        this.customLabels = builder.customLabels;
        this.URI = builder.URI;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Row create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customLabels
     */
    public java.util.List<KeyValuePair> getCustomLabels() {
        return this.customLabels;
    }

    /**
     * @return URI
     */
    public String getURI() {
        return this.URI;
    }

    public static final class Builder {
        private java.util.List<KeyValuePair> customLabels; 
        private String URI; 

        private Builder() {
        } 

        private Builder(Row model) {
            this.customLabels = model.customLabels;
            this.URI = model.URI;
        } 

        /**
         * CustomLabels.
         */
        public Builder customLabels(java.util.List<KeyValuePair> customLabels) {
            this.customLabels = customLabels;
            return this;
        }

        /**
         * URI.
         */
        public Builder URI(String URI) {
            this.URI = URI;
            return this;
        }

        public Row build() {
            return new Row(this);
        } 

    } 

}
