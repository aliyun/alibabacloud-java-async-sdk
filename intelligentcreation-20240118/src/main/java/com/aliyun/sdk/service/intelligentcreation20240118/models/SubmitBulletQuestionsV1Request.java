// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitBulletQuestionsV1Request} extends {@link RequestModel}
 *
 * <p>SubmitBulletQuestionsV1Request</p>
 */
public class SubmitBulletQuestionsV1Request extends Request {
    @Body
    @NameInMap("body")
    private SubmitBulletQuestionsCmd body;

    private SubmitBulletQuestionsV1Request(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitBulletQuestionsV1Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public SubmitBulletQuestionsCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<SubmitBulletQuestionsV1Request, Builder> {
        private SubmitBulletQuestionsCmd body; 

        private Builder() {
            super();
        } 

        private Builder(SubmitBulletQuestionsV1Request request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(SubmitBulletQuestionsCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public SubmitBulletQuestionsV1Request build() {
            return new SubmitBulletQuestionsV1Request(this);
        } 

    } 

}
