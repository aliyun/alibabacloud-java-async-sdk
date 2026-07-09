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
 * {@link SeverityLevelsFilter} extends {@link TeaModel}
 *
 * <p>SeverityLevelsFilter</p>
 */
public class SeverityLevelsFilter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("contains")
    private java.util.List<String> contains;

    private SeverityLevelsFilter(Builder builder) {
        this.contains = builder.contains;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SeverityLevelsFilter create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contains
     */
    public java.util.List<String> getContains() {
        return this.contains;
    }

    public static final class Builder {
        private java.util.List<String> contains; 

        private Builder() {
        } 

        private Builder(SeverityLevelsFilter model) {
            this.contains = model.contains;
        } 

        /**
         * contains.
         */
        public Builder contains(java.util.List<String> contains) {
            this.contains = contains;
            return this;
        }

        public SeverityLevelsFilter build() {
            return new SeverityLevelsFilter(this);
        } 

    } 

}
