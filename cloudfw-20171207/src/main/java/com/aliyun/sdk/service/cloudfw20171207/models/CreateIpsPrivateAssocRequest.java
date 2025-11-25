// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link CreateIpsPrivateAssocRequest} extends {@link RequestModel}
 *
 * <p>CreateIpsPrivateAssocRequest</p>
 */
public class CreateIpsPrivateAssocRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    private CreateIpsPrivateAssocRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.resourceId = builder.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpsPrivateAssocRequest create() {
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    public static final class Builder extends Request.Builder<CreateIpsPrivateAssocRequest, Builder> {
        private String lang; 
        private String resourceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateIpsPrivateAssocRequest request) {
            super(request);
            this.lang = request.lang;
            this.resourceId = request.resourceId;
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
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        @Override
        public CreateIpsPrivateAssocRequest build() {
            return new CreateIpsPrivateAssocRequest(this);
        } 

    } 

}
