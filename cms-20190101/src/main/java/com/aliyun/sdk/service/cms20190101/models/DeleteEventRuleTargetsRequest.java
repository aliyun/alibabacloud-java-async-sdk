// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEventRuleTargetsRequest} extends {@link RequestModel}
 *
 * <p>DeleteEventRuleTargetsRequest</p>
 */
public class DeleteEventRuleTargetsRequest extends Request {
    @Query
    @NameInMap("Ids")
    @Validation(required = true)
    private java.util.List < String > ids;

    @Query
    @NameInMap("RuleName")
    @Validation(required = true)
    private String ruleName;

    private DeleteEventRuleTargetsRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEventRuleTargetsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public java.util.List < String > getIds() {
        return this.ids;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static final class Builder extends Request.Builder<DeleteEventRuleTargetsRequest, Builder> {
        private java.util.List < String > ids; 
        private String ruleName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEventRuleTargetsRequest request) {
            super(request);
            this.ids = request.ids;
            this.ruleName = request.ruleName;
        } 

        /**
         * Ids.
         */
        public Builder ids(java.util.List < String > ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * The ID of the target. Valid values of N: 1 to 20.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        @Override
        public DeleteEventRuleTargetsRequest build() {
            return new DeleteEventRuleTargetsRequest(this);
        } 

    } 

}
