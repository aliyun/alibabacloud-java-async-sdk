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
 * {@link DeleteLibraryInstructionRequest} extends {@link RequestModel}
 *
 * <p>DeleteLibraryInstructionRequest</p>
 */
public class DeleteLibraryInstructionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("libraryId")
    private Long libraryId;

    private DeleteLibraryInstructionRequest(Builder builder) {
        super(builder);
        this.libraryId = builder.libraryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLibraryInstructionRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteLibraryInstructionRequest, Builder> {
        private Long libraryId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLibraryInstructionRequest request) {
            super(request);
            this.libraryId = request.libraryId;
        } 

        /**
         * libraryId.
         */
        public Builder libraryId(Long libraryId) {
            this.putPathParameter("libraryId", libraryId);
            this.libraryId = libraryId;
            return this;
        }

        @Override
        public DeleteLibraryInstructionRequest build() {
            return new DeleteLibraryInstructionRequest(this);
        } 

    } 

}
