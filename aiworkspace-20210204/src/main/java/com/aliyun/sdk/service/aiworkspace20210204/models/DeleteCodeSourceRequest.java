// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCodeSourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteCodeSourceRequest</p>
 */
public class DeleteCodeSourceRequest extends Request {
    @Path
    @NameInMap("CodeSourceId")
    @Validation(required = true)
    private String codeSourceId;

    private DeleteCodeSourceRequest(Builder builder) {
        super(builder);
        this.codeSourceId = builder.codeSourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCodeSourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeSourceId
     */
    public String getCodeSourceId() {
        return this.codeSourceId;
    }

    public static final class Builder extends Request.Builder<DeleteCodeSourceRequest, Builder> {
        private String codeSourceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCodeSourceRequest request) {
            super(request);
            this.codeSourceId = request.codeSourceId;
        } 

        /**
         * CodeSourceId.
         */
        public Builder codeSourceId(String codeSourceId) {
            this.putPathParameter("CodeSourceId", codeSourceId);
            this.codeSourceId = codeSourceId;
            return this;
        }

        @Override
        public DeleteCodeSourceRequest build() {
            return new DeleteCodeSourceRequest(this);
        } 

    } 

}
