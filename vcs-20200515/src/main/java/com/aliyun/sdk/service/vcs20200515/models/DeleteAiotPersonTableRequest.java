// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAiotPersonTableRequest} extends {@link RequestModel}
 *
 * <p>DeleteAiotPersonTableRequest</p>
 */
public class DeleteAiotPersonTableRequest extends Request {
    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Body
    @NameInMap("PersonTableId")
    @Validation(required = true)
    private String personTableId;

    private DeleteAiotPersonTableRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.personTableId = builder.personTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAiotPersonTableRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return personTableId
     */
    public String getPersonTableId() {
        return this.personTableId;
    }

    public static final class Builder extends Request.Builder<DeleteAiotPersonTableRequest, Builder> {
        private String id; 
        private String personTableId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAiotPersonTableRequest response) {
            super(response);
            this.id = response.id;
            this.personTableId = response.personTableId;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * PersonTableId.
         */
        public Builder personTableId(String personTableId) {
            this.putBodyParameter("PersonTableId", personTableId);
            this.personTableId = personTableId;
            return this;
        }

        @Override
        public DeleteAiotPersonTableRequest build() {
            return new DeleteAiotPersonTableRequest(this);
        } 

    } 

}
