// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link DeleteMediaLiveInputRequest} extends {@link RequestModel}
 *
 * <p>DeleteMediaLiveInputRequest</p>
 */
public class DeleteMediaLiveInputRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InputId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputId;

    private DeleteMediaLiveInputRequest(Builder builder) {
        super(builder);
        this.inputId = builder.inputId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMediaLiveInputRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inputId
     */
    public String getInputId() {
        return this.inputId;
    }

    public static final class Builder extends Request.Builder<DeleteMediaLiveInputRequest, Builder> {
        private String inputId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMediaLiveInputRequest request) {
            super(request);
            this.inputId = request.inputId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SEGK5KA6KYKAWQQH</p>
         */
        public Builder inputId(String inputId) {
            this.putBodyParameter("InputId", inputId);
            this.inputId = inputId;
            return this;
        }

        @Override
        public DeleteMediaLiveInputRequest build() {
            return new DeleteMediaLiveInputRequest(this);
        } 

    } 

}
