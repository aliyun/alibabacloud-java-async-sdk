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
 * {@link DeleteContactGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteContactGroupRequest</p>
 */
public class DeleteContactGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long contactGroupId;

    private DeleteContactGroupRequest(Builder builder) {
        super(builder);
        this.contactGroupId = builder.contactGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteContactGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactGroupId
     */
    public Long getContactGroupId() {
        return this.contactGroupId;
    }

    public static final class Builder extends Request.Builder<DeleteContactGroupRequest, Builder> {
        private Long contactGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteContactGroupRequest request) {
            super(request);
            this.contactGroupId = request.contactGroupId;
        } 

        /**
         * <p>The ID of the alert contact group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder contactGroupId(Long contactGroupId) {
            this.putQueryParameter("ContactGroupId", contactGroupId);
            this.contactGroupId = contactGroupId;
            return this;
        }

        @Override
        public DeleteContactGroupRequest build() {
            return new DeleteContactGroupRequest(this);
        } 

    } 

}
