// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link MedicalAnswerRequest} extends {@link RequestModel}
 *
 * <p>MedicalAnswerRequest</p>
 */
public class MedicalAnswerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private MedicalAnswerInput body;

    private MedicalAnswerRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MedicalAnswerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public MedicalAnswerInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<MedicalAnswerRequest, Builder> {
        private MedicalAnswerInput body; 

        private Builder() {
            super();
        } 

        private Builder(MedicalAnswerRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(MedicalAnswerInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public MedicalAnswerRequest build() {
            return new MedicalAnswerRequest(this);
        } 

    } 

}
