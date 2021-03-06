// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateTemplateRequest</p>
 */
public class CreateTemplateRequest extends Request {
    @Body
    @NameInMap("Content")
    private String content;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("Signature")
    private String signature;

    @Body
    @NameInMap("SignatureId")
    private String signatureId;

    @Body
    @NameInMap("Type")
    private Integer type;

    private CreateTemplateRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.description = builder.description;
        this.name = builder.name;
        this.signature = builder.signature;
        this.signatureId = builder.signatureId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return signature
     */
    public String getSignature() {
        return this.signature;
    }

    /**
     * @return signatureId
     */
    public String getSignatureId() {
        return this.signatureId;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateTemplateRequest, Builder> {
        private String content; 
        private String description; 
        private String name; 
        private String signature; 
        private String signatureId; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(CreateTemplateRequest request) {
            super(request);
            this.content = request.content;
            this.description = request.description;
            this.name = request.name;
            this.signature = request.signature;
            this.signatureId = request.signatureId;
            this.type = request.type;
        } 

        /**
         * ??????????????????????????????????????????70???????????????????????????????????????????????????67????????????????????????????????????????????????????????????????????????T????????????
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * ???????????????
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ???????????????
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ??????????????????????????????????????????????????????Id???????????????
         */
        public Builder signature(String signature) {
            this.putBodyParameter("Signature", signature);
            this.signature = signature;
            return this;
        }

        /**
         * ??????Id????????????ListSignatures????????????????????????????????????????????????????????????Id???
         */
        public Builder signatureId(String signatureId) {
            this.putBodyParameter("SignatureId", signatureId);
            this.signatureId = signatureId;
            return this;
        }

        /**
         * ???????????????
         * <p>
         * - 0 : ????????????
         * - 1 : ???????????????
         * - 2 : ???????????????
         */
        public Builder type(Integer type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateTemplateRequest build() {
            return new CreateTemplateRequest(this);
        } 

    } 

}
