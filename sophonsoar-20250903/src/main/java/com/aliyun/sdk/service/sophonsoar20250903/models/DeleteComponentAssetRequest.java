// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20250903.models;

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
 * {@link DeleteComponentAssetRequest} extends {@link RequestModel}
 *
 * <p>DeleteComponentAssetRequest</p>
 */
public class DeleteComponentAssetRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ComponentAssetUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String componentAssetUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private DeleteComponentAssetRequest(Builder builder) {
        super(builder);
        this.componentAssetUuid = builder.componentAssetUuid;
        this.lang = builder.lang;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteComponentAssetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return componentAssetUuid
     */
    public String getComponentAssetUuid() {
        return this.componentAssetUuid;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    public static final class Builder extends Request.Builder<DeleteComponentAssetRequest, Builder> {
        private String componentAssetUuid; 
        private String lang; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(DeleteComponentAssetRequest request) {
            super(request);
            this.componentAssetUuid = request.componentAssetUuid;
            this.lang = request.lang;
            this.roleFor = request.roleFor;
        } 

        /**
         * <p>Asset UUID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1C5F11E9-<strong><strong>-51F0-</strong></strong>-43BB312A0557</p>
         */
        public Builder componentAssetUuid(String componentAssetUuid) {
            this.putBodyParameter("ComponentAssetUuid", componentAssetUuid);
            this.componentAssetUuid = componentAssetUuid;
            return this;
        }

        /**
         * <p>Set the language type for requests and received messages, default is <strong>zh</strong>. Values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Resource directory member account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>13760*****718726</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        @Override
        public DeleteComponentAssetRequest build() {
            return new DeleteComponentAssetRequest(this);
        } 

    } 

}
