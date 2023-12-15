// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PaasConditionSetDTO} extends {@link TeaModel}
 *
 * <p>PaasConditionSetDTO</p>
 */
public class PaasConditionSetDTO extends TeaModel {
    @NameInMap("ConditionEntries")
    private java.util.List < PaasConditionEntryDTO > conditionEntries;

    private PaasConditionSetDTO(Builder builder) {
        this.conditionEntries = builder.conditionEntries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaasConditionSetDTO create() {
        return builder().build();
    }

    /**
     * @return conditionEntries
     */
    public java.util.List < PaasConditionEntryDTO > getConditionEntries() {
        return this.conditionEntries;
    }

    public static final class Builder {
        private java.util.List < PaasConditionEntryDTO > conditionEntries; 

        /**
         * ConditionEntries.
         */
        public Builder conditionEntries(java.util.List < PaasConditionEntryDTO > conditionEntries) {
            this.conditionEntries = conditionEntries;
            return this;
        }

        public PaasConditionSetDTO build() {
            return new PaasConditionSetDTO(this);
        } 

    } 

}
