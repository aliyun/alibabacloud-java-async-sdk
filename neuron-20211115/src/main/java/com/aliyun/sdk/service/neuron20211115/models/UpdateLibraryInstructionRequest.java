// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link UpdateLibraryInstructionRequest} extends {@link RequestModel}
 *
 * <p>UpdateLibraryInstructionRequest</p>
 */
public class UpdateLibraryInstructionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("libraryId")
    private Long libraryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private LibraryInstruction body;

    private UpdateLibraryInstructionRequest(Builder builder) {
        super(builder);
        this.libraryId = builder.libraryId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLibraryInstructionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return libraryId
     */
    public Long getLibraryId() {
        return this.libraryId;
    }

    /**
     * @return body
     */
    public LibraryInstruction getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateLibraryInstructionRequest, Builder> {
        private Long libraryId; 
        private LibraryInstruction body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLibraryInstructionRequest request) {
            super(request);
            this.libraryId = request.libraryId;
            this.body = request.body;
        } 

        /**
         * libraryId.
         */
        public Builder libraryId(Long libraryId) {
            this.putPathParameter("libraryId", libraryId);
            this.libraryId = libraryId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(LibraryInstruction body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateLibraryInstructionRequest build() {
            return new UpdateLibraryInstructionRequest(this);
        } 

    } 

}
