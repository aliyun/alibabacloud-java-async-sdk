// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateIllustrationTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateIllustrationTaskRequest</p>
 */
public class CreateIllustrationTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("textId")
    private Long textId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private IllustrationTaskCreateCmd body;

    private CreateIllustrationTaskRequest(Builder builder) {
        super(builder);
        this.textId = builder.textId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIllustrationTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return textId
     */
    public Long getTextId() {
        return this.textId;
    }

    /**
     * @return body
     */
    public IllustrationTaskCreateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateIllustrationTaskRequest, Builder> {
        private Long textId; 
        private IllustrationTaskCreateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(CreateIllustrationTaskRequest request) {
            super(request);
            this.textId = request.textId;
            this.body = request.body;
        } 

        /**
         * textId.
         */
        public Builder textId(Long textId) {
            this.putPathParameter("textId", textId);
            this.textId = textId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(IllustrationTaskCreateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateIllustrationTaskRequest build() {
            return new CreateIllustrationTaskRequest(this);
        } 

    } 

}
