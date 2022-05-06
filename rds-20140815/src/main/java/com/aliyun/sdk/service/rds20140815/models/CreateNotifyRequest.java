// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNotifyRequest} extends {@link RequestModel}
 *
 * <p>CreateNotifyRequest</p>
 */
public class CreateNotifyRequest extends Request {
    @Body
    @NameInMap("IdempotentId")
    @Validation(required = true)
    private String idempotentId;

    @Body
    @NameInMap("Level")
    @Validation(required = true)
    private String level;

    @Body
    @NameInMap("NotifyElement")
    @Validation(required = true)
    private String notifyElement;

    @Body
    @NameInMap("TemplateName")
    @Validation(required = true)
    private String templateName;

    @Body
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private CreateNotifyRequest(Builder builder) {
        super(builder);
        this.idempotentId = builder.idempotentId;
        this.level = builder.level;
        this.notifyElement = builder.notifyElement;
        this.templateName = builder.templateName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNotifyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return idempotentId
     */
    public String getIdempotentId() {
        return this.idempotentId;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return notifyElement
     */
    public String getNotifyElement() {
        return this.notifyElement;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateNotifyRequest, Builder> {
        private String idempotentId; 
        private String level; 
        private String notifyElement; 
        private String templateName; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateNotifyRequest request) {
            super(request);
            this.idempotentId = request.idempotentId;
            this.level = request.level;
            this.notifyElement = request.notifyElement;
            this.templateName = request.templateName;
            this.type = request.type;
        } 

        /**
         * A short description of struct
         */
        public Builder idempotentId(String idempotentId) {
            this.putBodyParameter("IdempotentId", idempotentId);
            this.idempotentId = idempotentId;
            return this;
        }

        /**
         * A short description of struct
         */
        public Builder level(String level) {
            this.putBodyParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * A short description of struct
         */
        public Builder notifyElement(String notifyElement) {
            this.putBodyParameter("NotifyElement", notifyElement);
            this.notifyElement = notifyElement;
            return this;
        }

        /**
         * A short description of struct
         */
        public Builder templateName(String templateName) {
            this.putBodyParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * A short description of struct
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateNotifyRequest build() {
            return new CreateNotifyRequest(this);
        } 

    } 

}
