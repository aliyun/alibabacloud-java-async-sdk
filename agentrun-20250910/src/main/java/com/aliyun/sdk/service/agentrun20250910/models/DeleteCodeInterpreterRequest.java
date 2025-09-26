// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link DeleteCodeInterpreterRequest} extends {@link RequestModel}
 *
 * <p>DeleteCodeInterpreterRequest</p>
 */
public class DeleteCodeInterpreterRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("codeInterpreterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String codeInterpreterId;

    private DeleteCodeInterpreterRequest(Builder builder) {
        super(builder);
        this.codeInterpreterId = builder.codeInterpreterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCodeInterpreterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeInterpreterId
     */
    public String getCodeInterpreterId() {
        return this.codeInterpreterId;
    }

    public static final class Builder extends Request.Builder<DeleteCodeInterpreterRequest, Builder> {
        private String codeInterpreterId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCodeInterpreterRequest request) {
            super(request);
            this.codeInterpreterId = request.codeInterpreterId;
        } 

        /**
         * <p>要删除的代码解释器实例的唯一标识符</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-1234-1234-123456789abc</p>
         */
        public Builder codeInterpreterId(String codeInterpreterId) {
            this.putPathParameter("codeInterpreterId", codeInterpreterId);
            this.codeInterpreterId = codeInterpreterId;
            return this;
        }

        @Override
        public DeleteCodeInterpreterRequest build() {
            return new DeleteCodeInterpreterRequest(this);
        } 

    } 

}
