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
         * 模板内容，请注意控制总字数在70个字以内，超出部分按长短信收费，按67个字为单位记一条短信，营销短信必须在结尾添加“回T退订”。
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * 申请说明。
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * 模板名称。
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * 签名名称，同时只能指定签名名称或签名ID其中之一。
         */
        public Builder signature(String signature) {
            this.putBodyParameter("Signature", signature);
            this.signature = signature;
            return this;
        }

        /**
         * 签名ID，可通过ListSignatures获取审核状态为已通过的签名列表，获取签名ID。
         */
        public Builder signatureId(String signatureId) {
            this.putBodyParameter("SignatureId", signatureId);
            this.signatureId = signatureId;
            return this;
        }

        /**
         * 模板类型。
         * <p>
         * - 0 : 验证码。
         * - 1 : 短信通知。
         * - 2 : 推广短信。
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
