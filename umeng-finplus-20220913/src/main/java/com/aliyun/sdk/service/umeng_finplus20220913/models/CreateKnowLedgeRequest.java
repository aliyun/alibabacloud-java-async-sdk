// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20220913.models;

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
 * {@link CreateKnowLedgeRequest} extends {@link RequestModel}
 *
 * <p>CreateKnowLedgeRequest</p>
 */
public class CreateKnowLedgeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreateKnowLedgeRequestBody body;

    private CreateKnowLedgeRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKnowLedgeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public CreateKnowLedgeRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateKnowLedgeRequest, Builder> {
        private CreateKnowLedgeRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(CreateKnowLedgeRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(CreateKnowLedgeRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public CreateKnowLedgeRequest build() {
            return new CreateKnowLedgeRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateKnowLedgeRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowLedgeRequest</p>
     */
    public static class CreateKnowLedgeRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("internalKnowledgeId")
        private String internalKnowledgeId;

        @com.aliyun.core.annotation.NameInMap("knowledgeName")
        @com.aliyun.core.annotation.Validation(maxLength = 30)
        private String knowledgeName;

        private CreateKnowLedgeRequestBody(Builder builder) {
            this.appId = builder.appId;
            this.internalKnowledgeId = builder.internalKnowledgeId;
            this.knowledgeName = builder.knowledgeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateKnowLedgeRequestBody create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return internalKnowledgeId
         */
        public String getInternalKnowledgeId() {
            return this.internalKnowledgeId;
        }

        /**
         * @return knowledgeName
         */
        public String getKnowledgeName() {
            return this.knowledgeName;
        }

        public static final class Builder {
            private String appId; 
            private String internalKnowledgeId; 
            private String knowledgeName; 

            private Builder() {
            } 

            private Builder(CreateKnowLedgeRequestBody model) {
                this.appId = model.appId;
                this.internalKnowledgeId = model.internalKnowledgeId;
                this.knowledgeName = model.knowledgeName;
            } 

            /**
             * appId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * internalKnowledgeId.
             */
            public Builder internalKnowledgeId(String internalKnowledgeId) {
                this.internalKnowledgeId = internalKnowledgeId;
                return this;
            }

            /**
             * knowledgeName.
             */
            public Builder knowledgeName(String knowledgeName) {
                this.knowledgeName = knowledgeName;
                return this;
            }

            public CreateKnowLedgeRequestBody build() {
                return new CreateKnowLedgeRequestBody(this);
            } 

        } 

    }
}
