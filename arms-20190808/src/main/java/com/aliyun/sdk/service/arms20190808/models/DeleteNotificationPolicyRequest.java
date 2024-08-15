// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNotificationPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteNotificationPolicyRequest</p>
 */
public class DeleteNotificationPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    private DeleteNotificationPolicyRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNotificationPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteNotificationPolicyRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNotificationPolicyRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * The ID of the notification policy.
         * <p>
         * 
         * For more information about how to obtain the ID of a notification policy, see [ListNotificationPolicies](~~2612375~~).
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteNotificationPolicyRequest build() {
            return new DeleteNotificationPolicyRequest(this);
        } 

    } 

}
