// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link TrialOrderEligibilityVO} extends {@link TeaModel}
 *
 * <p>TrialOrderEligibilityVO</p>
 */
public class TrialOrderEligibilityVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Valid")
    private Boolean valid;

    private TrialOrderEligibilityVO(Builder builder) {
        this.message = builder.message;
        this.valid = builder.valid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrialOrderEligibilityVO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return valid
     */
    public Boolean getValid() {
        return this.valid;
    }

    public static final class Builder {
        private String message; 
        private Boolean valid; 

        private Builder() {
        } 

        private Builder(TrialOrderEligibilityVO model) {
            this.message = model.message;
            this.valid = model.valid;
        } 

        /**
         * <p>Contains details about the eligibility status, such as the reason for ineligibility.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Indicates whether the user is eligible for the trial.</p>
         */
        public Builder valid(Boolean valid) {
            this.valid = valid;
            return this;
        }

        public TrialOrderEligibilityVO build() {
            return new TrialOrderEligibilityVO(this);
        } 

    } 

}
