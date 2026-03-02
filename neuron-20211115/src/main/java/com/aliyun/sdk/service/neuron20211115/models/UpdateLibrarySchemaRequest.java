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
 * {@link UpdateLibrarySchemaRequest} extends {@link RequestModel}
 *
 * <p>UpdateLibrarySchemaRequest</p>
 */
public class UpdateLibrarySchemaRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("libraryId")
    private Long libraryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private LibrarySchemaUpdateCmd body;

    private UpdateLibrarySchemaRequest(Builder builder) {
        super(builder);
        this.libraryId = builder.libraryId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLibrarySchemaRequest create() {
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
    public LibrarySchemaUpdateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateLibrarySchemaRequest, Builder> {
        private Long libraryId; 
        private LibrarySchemaUpdateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLibrarySchemaRequest request) {
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
        public Builder body(LibrarySchemaUpdateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateLibrarySchemaRequest build() {
            return new UpdateLibrarySchemaRequest(this);
        } 

    } 

}
