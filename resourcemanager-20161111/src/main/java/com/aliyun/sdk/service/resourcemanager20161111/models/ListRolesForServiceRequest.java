// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRolesForServiceRequest} extends {@link RequestModel}
 *
 * <p>ListRolesForServiceRequest</p>
 */
public class ListRolesForServiceRequest extends Request {
    @Query
    @NameInMap("Language")
    private String language;

    @Query
    @NameInMap("Service")
    private String service;

    private ListRolesForServiceRequest(Builder builder) {
        super(builder);
        this.language = builder.language;
        this.service = builder.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRolesForServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return service
     */
    public String getService() {
        return this.service;
    }

    public static final class Builder extends Request.Builder<ListRolesForServiceRequest, Builder> {
        private String language; 
        private String service; 

        private Builder() {
            super();
        } 

        private Builder(ListRolesForServiceRequest request) {
            super(request);
            this.language = request.language;
            this.service = request.service;
        } 

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * Service.
         */
        public Builder service(String service) {
            this.putQueryParameter("Service", service);
            this.service = service;
            return this;
        }

        @Override
        public ListRolesForServiceRequest build() {
            return new ListRolesForServiceRequest(this);
        } 

    } 

}
