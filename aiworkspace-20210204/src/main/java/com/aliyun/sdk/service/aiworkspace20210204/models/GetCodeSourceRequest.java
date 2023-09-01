// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCodeSourceRequest} extends {@link RequestModel}
 *
 * <p>GetCodeSourceRequest</p>
 */
public class GetCodeSourceRequest extends Request {
    @Path
    @NameInMap("CodeSourceId")
    @Validation(required = true)
    private String codeSourceId;

    private GetCodeSourceRequest(Builder builder) {
        super(builder);
        this.codeSourceId = builder.codeSourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCodeSourceRequest create() {
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

    public static final class Builder extends Request.Builder<GetCodeSourceRequest, Builder> {
        private String codeSourceId; 

        private Builder() {
            super();
        } 

        private Builder(GetCodeSourceRequest request) {
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
        public GetCodeSourceRequest build() {
            return new GetCodeSourceRequest(this);
        } 

    } 

}
