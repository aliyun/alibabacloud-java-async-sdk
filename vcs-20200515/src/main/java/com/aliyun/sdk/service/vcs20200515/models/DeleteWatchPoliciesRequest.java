// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWatchPoliciesRequest} extends {@link RequestModel}
 *
 * <p>DeleteWatchPoliciesRequest</p>
 */
public class DeleteWatchPoliciesRequest extends Request {
    @Body
    @NameInMap("WatchPolicyIds")
    @Validation(required = true)
    private String watchPolicyIds;

    private DeleteWatchPoliciesRequest(Builder builder) {
        super(builder);
        this.watchPolicyIds = builder.watchPolicyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWatchPoliciesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return watchPolicyIds
     */
    public String getWatchPolicyIds() {
        return this.watchPolicyIds;
    }

    public static final class Builder extends Request.Builder<DeleteWatchPoliciesRequest, Builder> {
        private String watchPolicyIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWatchPoliciesRequest response) {
            super(response);
            this.watchPolicyIds = response.watchPolicyIds;
        } 

        /**
         * WatchPolicyIds.
         */
        public Builder watchPolicyIds(String watchPolicyIds) {
            this.putBodyParameter("WatchPolicyIds", watchPolicyIds);
            this.watchPolicyIds = watchPolicyIds;
            return this;
        }

        @Override
        public DeleteWatchPoliciesRequest build() {
            return new DeleteWatchPoliciesRequest(this);
        } 

    } 

}
