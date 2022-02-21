// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRoutineRequest} extends {@link RequestModel}
 *
 * <p>DeleteRoutineRequest</p>
 */
public class DeleteRoutineRequest extends Request {
    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DeleteRoutineRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRoutineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DeleteRoutineRequest, Builder> {
        private String name; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRoutineRequest response) {
            super(response);
            this.name = response.name;
            this.ownerId = response.ownerId;
        } 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public DeleteRoutineRequest build() {
            return new DeleteRoutineRequest(this);
        } 

    } 

}
