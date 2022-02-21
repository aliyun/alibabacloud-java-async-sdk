// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteOuterAccountRequest} extends {@link RequestModel}
 *
 * <p>DeleteOuterAccountRequest</p>
 */
public class DeleteOuterAccountRequest extends Request {
    @Query
    @NameInMap("OuterAccountId")
    @Validation(required = true)
    private String outerAccountId;

    @Query
    @NameInMap("OuterAccountType")
    @Validation(required = true)
    private String outerAccountType;

    private DeleteOuterAccountRequest(Builder builder) {
        super(builder);
        this.outerAccountId = builder.outerAccountId;
        this.outerAccountType = builder.outerAccountType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteOuterAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return outerAccountId
     */
    public String getOuterAccountId() {
        return this.outerAccountId;
    }

    /**
     * @return outerAccountType
     */
    public String getOuterAccountType() {
        return this.outerAccountType;
    }

    public static final class Builder extends Request.Builder<DeleteOuterAccountRequest, Builder> {
        private String outerAccountId; 
        private String outerAccountType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteOuterAccountRequest response) {
            super(response);
            this.outerAccountId = response.outerAccountId;
            this.outerAccountType = response.outerAccountType;
        } 

        /**
         * OuterAccountId.
         */
        public Builder outerAccountId(String outerAccountId) {
            this.putQueryParameter("OuterAccountId", outerAccountId);
            this.outerAccountId = outerAccountId;
            return this;
        }

        /**
         * OuterAccountType.
         */
        public Builder outerAccountType(String outerAccountType) {
            this.putQueryParameter("OuterAccountType", outerAccountType);
            this.outerAccountType = outerAccountType;
            return this;
        }

        @Override
        public DeleteOuterAccountRequest build() {
            return new DeleteOuterAccountRequest(this);
        } 

    } 

}
