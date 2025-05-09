// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link IsvGetAppIdRequest} extends {@link RequestModel}
 *
 * <p>IsvGetAppIdRequest</p>
 */
public class IsvGetAppIdRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Permissions")
    private String permissions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private IsvGetAppIdRequest(Builder builder) {
        super(builder);
        this.permissions = builder.permissions;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IsvGetAppIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return permissions
     */
    public String getPermissions() {
        return this.permissions;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<IsvGetAppIdRequest, Builder> {
        private String permissions; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(IsvGetAppIdRequest request) {
            super(request);
            this.permissions = request.permissions;
            this.type = request.type;
        } 

        /**
         * <p>The permission.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>whatsapp_business_messaging: sending permission on WhatsApp messages</li>
         * <li>ads_management: management permission on advertisements</li>
         * <li>catalog_management: management permission on catalogs</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>catalog_management</p>
         */
        public Builder permissions(String permissions) {
            this.putBodyParameter("Permissions", permissions);
            this.permissions = permissions;
            return this;
        }

        /**
         * <p>The type of the app. Valid value: WHATSAPP.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WHATSAPP</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public IsvGetAppIdRequest build() {
            return new IsvGetAppIdRequest(this);
        } 

    } 

}
