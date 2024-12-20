// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
         * <p>The ID of the notification policy.</p>
         * <p>For more information about how to obtain the ID of a notification policy, see <a href="https://help.aliyun.com/document_detail/2612375.html">ListNotificationPolicies</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
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
