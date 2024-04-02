// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNotificationContactsRequest} extends {@link RequestModel}
 *
 * <p>DeleteNotificationContactsRequest</p>
 */
public class DeleteNotificationContactsRequest extends Request {
    @Query
    @NameInMap("ContactTypes")
    @Validation(required = true)
    private String contactTypes;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DeleteNotificationContactsRequest(Builder builder) {
        super(builder);
        this.contactTypes = builder.contactTypes;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNotificationContactsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactTypes
     */
    public String getContactTypes() {
        return this.contactTypes;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DeleteNotificationContactsRequest, Builder> {
        private String contactTypes; 
        private String lang; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNotificationContactsRequest request) {
            super(request);
            this.contactTypes = request.contactTypes;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * ContactTypes.
         */
        public Builder contactTypes(String contactTypes) {
            this.putQueryParameter("ContactTypes", contactTypes);
            this.contactTypes = contactTypes;
            return this;
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
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DeleteNotificationContactsRequest build() {
            return new DeleteNotificationContactsRequest(this);
        } 

    } 

}
