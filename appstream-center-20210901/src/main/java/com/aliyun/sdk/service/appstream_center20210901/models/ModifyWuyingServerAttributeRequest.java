// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ModifyWuyingServerAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyWuyingServerAttributeRequest</p>
 */
public class ModifyWuyingServerAttributeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WuyingServerId")
    private String wuyingServerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WuyingServerName")
    private String wuyingServerName;

    private ModifyWuyingServerAttributeRequest(Builder builder) {
        super(builder);
        this.password = builder.password;
        this.wuyingServerId = builder.wuyingServerId;
        this.wuyingServerName = builder.wuyingServerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWuyingServerAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return wuyingServerId
     */
    public String getWuyingServerId() {
        return this.wuyingServerId;
    }

    /**
     * @return wuyingServerName
     */
    public String getWuyingServerName() {
        return this.wuyingServerName;
    }

    public static final class Builder extends Request.Builder<ModifyWuyingServerAttributeRequest, Builder> {
        private String password; 
        private String wuyingServerId; 
        private String wuyingServerName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWuyingServerAttributeRequest request) {
            super(request);
            this.password = request.password;
            this.wuyingServerId = request.wuyingServerId;
            this.wuyingServerName = request.wuyingServerName;
        } 

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putBodyParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * WuyingServerId.
         */
        public Builder wuyingServerId(String wuyingServerId) {
            this.putBodyParameter("WuyingServerId", wuyingServerId);
            this.wuyingServerId = wuyingServerId;
            return this;
        }

        /**
         * WuyingServerName.
         */
        public Builder wuyingServerName(String wuyingServerName) {
            this.putBodyParameter("WuyingServerName", wuyingServerName);
            this.wuyingServerName = wuyingServerName;
            return this;
        }

        @Override
        public ModifyWuyingServerAttributeRequest build() {
            return new ModifyWuyingServerAttributeRequest(this);
        } 

    } 

}
