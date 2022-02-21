// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAiotPersonTableItemRequest} extends {@link RequestModel}
 *
 * <p>DeleteAiotPersonTableItemRequest</p>
 */
public class DeleteAiotPersonTableItemRequest extends Request {
    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Body
    @NameInMap("PersonTableId")
    @Validation(required = true)
    private String personTableId;

    @Body
    @NameInMap("PersonTableItemId")
    @Validation(required = true)
    private String personTableItemId;

    private DeleteAiotPersonTableItemRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.personTableId = builder.personTableId;
        this.personTableItemId = builder.personTableItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAiotPersonTableItemRequest create() {
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

    /**
     * @return personTableItemId
     */
    public String getPersonTableItemId() {
        return this.personTableItemId;
    }

    public static final class Builder extends Request.Builder<DeleteAiotPersonTableItemRequest, Builder> {
        private String id; 
        private String personTableId; 
        private String personTableItemId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAiotPersonTableItemRequest response) {
            super(response);
            this.id = response.id;
            this.personTableId = response.personTableId;
            this.personTableItemId = response.personTableItemId;
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

        /**
         * PersonTableItemId.
         */
        public Builder personTableItemId(String personTableItemId) {
            this.putBodyParameter("PersonTableItemId", personTableItemId);
            this.personTableItemId = personTableItemId;
            return this;
        }

        @Override
        public DeleteAiotPersonTableItemRequest build() {
            return new DeleteAiotPersonTableItemRequest(this);
        } 

    } 

}
