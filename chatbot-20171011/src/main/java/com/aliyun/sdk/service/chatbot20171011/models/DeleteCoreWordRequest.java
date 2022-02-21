// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCoreWordRequest} extends {@link RequestModel}
 *
 * <p>DeleteCoreWordRequest</p>
 */
public class DeleteCoreWordRequest extends Request {
    @Query
    @NameInMap("CoreWordName")
    @Validation(required = true)
    private String coreWordName;

    private DeleteCoreWordRequest(Builder builder) {
        super(builder);
        this.coreWordName = builder.coreWordName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCoreWordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return coreWordName
     */
    public String getCoreWordName() {
        return this.coreWordName;
    }

    public static final class Builder extends Request.Builder<DeleteCoreWordRequest, Builder> {
        private String coreWordName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCoreWordRequest response) {
            super(response);
            this.coreWordName = response.coreWordName;
        } 

        /**
         * CoreWordName.
         */
        public Builder coreWordName(String coreWordName) {
            this.putQueryParameter("CoreWordName", coreWordName);
            this.coreWordName = coreWordName;
            return this;
        }

        @Override
        public DeleteCoreWordRequest build() {
            return new DeleteCoreWordRequest(this);
        } 

    } 

}
