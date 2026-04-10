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
 * {@link DisplayNameFilter} extends {@link TeaModel}
 *
 * <p>DisplayNameFilter</p>
 */
public class DisplayNameFilter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("contains")
    private String contains;

    @com.aliyun.core.annotation.NameInMap("notContains")
    private String notContains;

    private DisplayNameFilter(Builder builder) {
        this.contains = builder.contains;
        this.notContains = builder.notContains;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisplayNameFilter create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contains
     */
    public String getContains() {
        return this.contains;
    }

    /**
     * @return notContains
     */
    public String getNotContains() {
        return this.notContains;
    }

    public static final class Builder {
        private String contains; 
        private String notContains; 

        private Builder() {
        } 

        private Builder(DisplayNameFilter model) {
            this.contains = model.contains;
            this.notContains = model.notContains;
        } 

        /**
         * contains.
         */
        public Builder contains(String contains) {
            this.contains = contains;
            return this;
        }

        /**
         * notContains.
         */
        public Builder notContains(String notContains) {
            this.notContains = notContains;
            return this;
        }

        public DisplayNameFilter build() {
            return new DisplayNameFilter(this);
        } 

    } 

}
