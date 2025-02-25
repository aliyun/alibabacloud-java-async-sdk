// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAuditCallbackRequest} extends {@link RequestModel}
 *
 * <p>CreateAuditCallbackRequest</p>
 */
public class CreateAuditCallbackRequest extends Request {
    @Query
    @NameInMap("CallbackSuggestions")
    @Validation(required = true)
    private String callbackSuggestions;

    @Query
    @NameInMap("CallbackTypes")
    @Validation(required = true)
    private String callbackTypes;

    @Query
    @NameInMap("CryptType")
    private String cryptType;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Url")
    @Validation(required = true)
    private String url;

    private CreateAuditCallbackRequest(Builder builder) {
        super(builder);
        this.callbackSuggestions = builder.callbackSuggestions;
        this.callbackTypes = builder.callbackTypes;
        this.cryptType = builder.cryptType;
        this.name = builder.name;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAuditCallbackRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callbackSuggestions
     */
    public String getCallbackSuggestions() {
        return this.callbackSuggestions;
    }

    /**
     * @return callbackTypes
     */
    public String getCallbackTypes() {
        return this.callbackTypes;
    }

    /**
     * @return cryptType
     */
    public String getCryptType() {
        return this.cryptType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<CreateAuditCallbackRequest, Builder> {
        private String callbackSuggestions; 
        private String callbackTypes; 
        private String cryptType; 
        private String name; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(CreateAuditCallbackRequest request) {
            super(request);
            this.callbackSuggestions = request.callbackSuggestions;
            this.callbackTypes = request.callbackTypes;
            this.cryptType = request.cryptType;
            this.name = request.name;
            this.url = request.url;
        } 

        /**
         * CallbackSuggestions.
         */
        public Builder callbackSuggestions(String callbackSuggestions) {
            this.putQueryParameter("CallbackSuggestions", callbackSuggestions);
            this.callbackSuggestions = callbackSuggestions;
            return this;
        }

        /**
         * CallbackTypes.
         */
        public Builder callbackTypes(String callbackTypes) {
            this.putQueryParameter("CallbackTypes", callbackTypes);
            this.callbackTypes = callbackTypes;
            return this;
        }

        /**
         * CryptType.
         */
        public Builder cryptType(String cryptType) {
            this.putQueryParameter("CryptType", cryptType);
            this.cryptType = cryptType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public CreateAuditCallbackRequest build() {
            return new CreateAuditCallbackRequest(this);
        } 

    } 

}
