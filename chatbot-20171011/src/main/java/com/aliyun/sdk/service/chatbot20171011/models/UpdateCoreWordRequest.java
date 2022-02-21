// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCoreWordRequest} extends {@link RequestModel}
 *
 * <p>UpdateCoreWordRequest</p>
 */
public class UpdateCoreWordRequest extends Request {
    @Query
    @NameInMap("CoreWordCode")
    @Validation(required = true)
    private String coreWordCode;

    @Query
    @NameInMap("CoreWordName")
    @Validation(required = true)
    private String coreWordName;

    private UpdateCoreWordRequest(Builder builder) {
        super(builder);
        this.coreWordCode = builder.coreWordCode;
        this.coreWordName = builder.coreWordName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCoreWordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return coreWordCode
     */
    public String getCoreWordCode() {
        return this.coreWordCode;
    }

    /**
     * @return coreWordName
     */
    public String getCoreWordName() {
        return this.coreWordName;
    }

    public static final class Builder extends Request.Builder<UpdateCoreWordRequest, Builder> {
        private String coreWordCode; 
        private String coreWordName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCoreWordRequest response) {
            super(response);
            this.coreWordCode = response.coreWordCode;
            this.coreWordName = response.coreWordName;
        } 

        /**
         * CoreWordCode.
         */
        public Builder coreWordCode(String coreWordCode) {
            this.putQueryParameter("CoreWordCode", coreWordCode);
            this.coreWordCode = coreWordCode;
            return this;
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
        public UpdateCoreWordRequest build() {
            return new UpdateCoreWordRequest(this);
        } 

    } 

}
