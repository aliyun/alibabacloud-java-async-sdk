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
 * {@link SessionNetworkHeaderValueReplacement} extends {@link TeaModel}
 *
 * <p>SessionNetworkHeaderValueReplacement</p>
 */
public class SessionNetworkHeaderValueReplacement extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("placeholder")
    private String placeholder;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private SessionNetworkHeaderValueReplacement(Builder builder) {
        this.placeholder = builder.placeholder;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SessionNetworkHeaderValueReplacement create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return placeholder
     */
    public String getPlaceholder() {
        return this.placeholder;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String placeholder; 
        private String value; 

        private Builder() {
        } 

        private Builder(SessionNetworkHeaderValueReplacement model) {
            this.placeholder = model.placeholder;
            this.value = model.value;
        } 

        /**
         * placeholder.
         */
        public Builder placeholder(String placeholder) {
            this.placeholder = placeholder;
            return this;
        }

        /**
         * value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public SessionNetworkHeaderValueReplacement build() {
            return new SessionNetworkHeaderValueReplacement(this);
        } 

    } 

}
