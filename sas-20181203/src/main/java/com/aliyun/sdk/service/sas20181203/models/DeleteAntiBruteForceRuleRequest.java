// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAntiBruteForceRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteAntiBruteForceRuleRequest</p>
 */
public class DeleteAntiBruteForceRuleRequest extends Request {
    @Query
    @NameInMap("Ids")
    @Validation(required = true)
    private java.util.List < Long > ids;

    private DeleteAntiBruteForceRuleRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAntiBruteForceRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public java.util.List < Long > getIds() {
        return this.ids;
    }

    public static final class Builder extends Request.Builder<DeleteAntiBruteForceRuleRequest, Builder> {
        private java.util.List < Long > ids; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAntiBruteForceRuleRequest request) {
            super(request);
            this.ids = request.ids;
        } 

        /**
         * The IDs of the defense rules against brute-force attacks to delete.
         */
        public Builder ids(java.util.List < Long > ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        @Override
        public DeleteAntiBruteForceRuleRequest build() {
            return new DeleteAntiBruteForceRuleRequest(this);
        } 

    } 

}
