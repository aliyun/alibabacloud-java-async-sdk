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
 * {@link MedicalKnowledgeRequest} extends {@link RequestModel}
 *
 * <p>MedicalKnowledgeRequest</p>
 */
public class MedicalKnowledgeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private MedicalKnowInput body;

    private MedicalKnowledgeRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MedicalKnowledgeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public MedicalKnowInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<MedicalKnowledgeRequest, Builder> {
        private MedicalKnowInput body; 

        private Builder() {
            super();
        } 

        private Builder(MedicalKnowledgeRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(MedicalKnowInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public MedicalKnowledgeRequest build() {
            return new MedicalKnowledgeRequest(this);
        } 

    } 

}
