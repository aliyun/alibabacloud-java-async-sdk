// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRemediationTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListRemediationTemplatesRequest</p>
 */
public class ListRemediationTemplatesRequest extends Request {
    @Query
    @NameInMap("ManagedRuleIdentifier")
    @Validation(required = true)
    private String managedRuleIdentifier;

    @Query
    @NameInMap("RemediationType")
    private String remediationType;

    private ListRemediationTemplatesRequest(Builder builder) {
        super(builder);
        this.managedRuleIdentifier = builder.managedRuleIdentifier;
        this.remediationType = builder.remediationType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRemediationTemplatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return managedRuleIdentifier
     */
    public String getManagedRuleIdentifier() {
        return this.managedRuleIdentifier;
    }

    /**
     * @return remediationType
     */
    public String getRemediationType() {
        return this.remediationType;
    }

    public static final class Builder extends Request.Builder<ListRemediationTemplatesRequest, Builder> {
        private String managedRuleIdentifier; 
        private String remediationType; 

        private Builder() {
            super();
        } 

        private Builder(ListRemediationTemplatesRequest response) {
            super(response);
            this.managedRuleIdentifier = response.managedRuleIdentifier;
            this.remediationType = response.remediationType;
        } 

        /**
         * ManagedRuleIdentifier.
         */
        public Builder managedRuleIdentifier(String managedRuleIdentifier) {
            this.putQueryParameter("ManagedRuleIdentifier", managedRuleIdentifier);
            this.managedRuleIdentifier = managedRuleIdentifier;
            return this;
        }

        /**
         * RemediationType.
         */
        public Builder remediationType(String remediationType) {
            this.putQueryParameter("RemediationType", remediationType);
            this.remediationType = remediationType;
            return this;
        }

        @Override
        public ListRemediationTemplatesRequest build() {
            return new ListRemediationTemplatesRequest(this);
        } 

    } 

}
