// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAuthorizationUserRequest} extends {@link RequestModel}
 *
 * <p>CreateAuthorizationUserRequest</p>
 */
public class CreateAuthorizationUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bindId")
    private Long bindId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createType")
    private String createType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventTemplateId")
    private Long eventTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private CreateAuthorizationUserRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.bindId = builder.bindId;
        this.createType = builder.createType;
        this.eventTemplateId = builder.eventTemplateId;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAuthorizationUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return bindId
     */
    public Long getBindId() {
        return this.bindId;
    }

    /**
     * @return createType
     */
    public String getCreateType() {
        return this.createType;
    }

    /**
     * @return eventTemplateId
     */
    public Long getEventTemplateId() {
        return this.eventTemplateId;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<CreateAuthorizationUserRequest, Builder> {
        private String lang; 
        private Long bindId; 
        private String createType; 
        private Long eventTemplateId; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAuthorizationUserRequest request) {
            super(request);
            this.lang = request.lang;
            this.bindId = request.bindId;
            this.createType = request.createType;
            this.eventTemplateId = request.eventTemplateId;
            this.regId = request.regId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * bindId.
         */
        public Builder bindId(Long bindId) {
            this.putQueryParameter("bindId", bindId);
            this.bindId = bindId;
            return this;
        }

        /**
         * createType.
         */
        public Builder createType(String createType) {
            this.putQueryParameter("createType", createType);
            this.createType = createType;
            return this;
        }

        /**
         * eventTemplateId.
         */
        public Builder eventTemplateId(Long eventTemplateId) {
            this.putQueryParameter("eventTemplateId", eventTemplateId);
            this.eventTemplateId = eventTemplateId;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public CreateAuthorizationUserRequest build() {
            return new CreateAuthorizationUserRequest(this);
        } 

    } 

}
