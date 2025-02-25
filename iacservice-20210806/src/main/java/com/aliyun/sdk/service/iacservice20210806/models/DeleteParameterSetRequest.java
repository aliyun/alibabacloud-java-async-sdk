// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteParameterSetRequest} extends {@link RequestModel}
 *
 * <p>DeleteParameterSetRequest</p>
 */
public class DeleteParameterSetRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("parameterSetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parameterSetId;

    private DeleteParameterSetRequest(Builder builder) {
        super(builder);
        this.parameterSetId = builder.parameterSetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteParameterSetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parameterSetId
     */
    public String getParameterSetId() {
        return this.parameterSetId;
    }

    public static final class Builder extends Request.Builder<DeleteParameterSetRequest, Builder> {
        private String parameterSetId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteParameterSetRequest request) {
            super(request);
            this.parameterSetId = request.parameterSetId;
        } 

        /**
         * parameterSetId.
         */
        public Builder parameterSetId(String parameterSetId) {
            this.putPathParameter("parameterSetId", parameterSetId);
            this.parameterSetId = parameterSetId;
            return this;
        }

        @Override
        public DeleteParameterSetRequest build() {
            return new DeleteParameterSetRequest(this);
        } 

    } 

}
