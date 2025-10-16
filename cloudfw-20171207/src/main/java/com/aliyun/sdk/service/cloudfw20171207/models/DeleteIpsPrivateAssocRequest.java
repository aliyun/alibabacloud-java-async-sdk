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
 * {@link DeleteIpsPrivateAssocRequest} extends {@link RequestModel}
 *
 * <p>DeleteIpsPrivateAssocRequest</p>
 */
public class DeleteIpsPrivateAssocRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    private DeleteIpsPrivateAssocRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.resourceId = builder.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIpsPrivateAssocRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteIpsPrivateAssocRequest, Builder> {
        private String lang; 
        private String resourceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIpsPrivateAssocRequest request) {
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
        public DeleteIpsPrivateAssocRequest build() {
            return new DeleteIpsPrivateAssocRequest(this);
        } 

    } 

}
