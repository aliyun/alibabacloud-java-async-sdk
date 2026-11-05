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
 * {@link DryRunViolation} extends {@link TeaModel}
 *
 * <p>DryRunViolation</p>
 */
public class DryRunViolation extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("field")
    private String field;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("suggestion")
    private String suggestion;

    private DryRunViolation(Builder builder) {
        this.field = builder.field;
        this.message = builder.message;
        this.suggestion = builder.suggestion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DryRunViolation create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return field
     */
    public String getField() {
        return this.field;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return suggestion
     */
    public String getSuggestion() {
        return this.suggestion;
    }

    public static final class Builder {
        private String field; 
        private String message; 
        private String suggestion; 

        private Builder() {
        } 

        private Builder(DryRunViolation model) {
            this.field = model.field;
            this.message = model.message;
            this.suggestion = model.suggestion;
        } 

        /**
         * <p>The path of the violated field, such as schedule.intervalSecs.</p>
         * 
         * <strong>example:</strong>
         * <p>schedule.intervalSecs</p>
         */
        public Builder field(String field) {
            this.field = field;
            return this;
        }

        /**
         * <p>The violation description.</p>
         * 
         * <strong>example:</strong>
         * <p>schedule interval must be a multiple of 15 seconds</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The remediation suggestion.</p>
         * 
         * <strong>example:</strong>
         * <p>must satisfy: 15-86400 seconds and a multiple of 15</p>
         */
        public Builder suggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }

        public DryRunViolation build() {
            return new DryRunViolation(this);
        } 

    } 

}
