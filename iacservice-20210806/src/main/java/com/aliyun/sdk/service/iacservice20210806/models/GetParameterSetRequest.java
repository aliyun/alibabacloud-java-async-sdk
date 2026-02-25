// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link GetParameterSetRequest} extends {@link RequestModel}
 *
 * <p>GetParameterSetRequest</p>
 */
public class GetParameterSetRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("parameterSetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parameterSetId;

    private GetParameterSetRequest(Builder builder) {
        super(builder);
        this.parameterSetId = builder.parameterSetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetParameterSetRequest create() {
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

    public static final class Builder extends Request.Builder<GetParameterSetRequest, Builder> {
        private String parameterSetId; 

        private Builder() {
            super();
        } 

        private Builder(GetParameterSetRequest request) {
            super(request);
            this.parameterSetId = request.parameterSetId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pts-433aead7560571fc2556dc33a4a</p>
         */
        public Builder parameterSetId(String parameterSetId) {
            this.putPathParameter("parameterSetId", parameterSetId);
            this.parameterSetId = parameterSetId;
            return this;
        }

        @Override
        public GetParameterSetRequest build() {
            return new GetParameterSetRequest(this);
        } 

    } 

}
