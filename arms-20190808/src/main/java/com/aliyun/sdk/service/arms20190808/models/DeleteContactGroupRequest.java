// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteContactGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteContactGroupRequest</p>
 */
public class DeleteContactGroupRequest extends Request {
    @Query
    @NameInMap("ContactGroupId")
    @Validation(required = true)
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
         * ContactGroupId.
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
