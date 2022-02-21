// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDoubleVerificationGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteDoubleVerificationGroupRequest</p>
 */
public class DeleteDoubleVerificationGroupRequest extends Request {
    @Body
    @NameInMap("DoubleVerificationGroupId")
    private String doubleVerificationGroupId;

    @Body
    @NameInMap("Id")
    private String id;

    private DeleteDoubleVerificationGroupRequest(Builder builder) {
        super(builder);
        this.doubleVerificationGroupId = builder.doubleVerificationGroupId;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDoubleVerificationGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return doubleVerificationGroupId
     */
    public String getDoubleVerificationGroupId() {
        return this.doubleVerificationGroupId;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteDoubleVerificationGroupRequest, Builder> {
        private String doubleVerificationGroupId; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDoubleVerificationGroupRequest response) {
            super(response);
            this.doubleVerificationGroupId = response.doubleVerificationGroupId;
            this.id = response.id;
        } 

        /**
         * DoubleVerificationGroupId.
         */
        public Builder doubleVerificationGroupId(String doubleVerificationGroupId) {
            this.putBodyParameter("DoubleVerificationGroupId", doubleVerificationGroupId);
            this.doubleVerificationGroupId = doubleVerificationGroupId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteDoubleVerificationGroupRequest build() {
            return new DeleteDoubleVerificationGroupRequest(this);
        } 

    } 

}
