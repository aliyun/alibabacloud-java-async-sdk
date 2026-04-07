// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link RemoveZooKeeperSaslUserRequest} extends {@link RequestModel}
 *
 * <p>RemoveZooKeeperSaslUserRequest</p>
 */
public class RemoveZooKeeperSaslUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reload")
    private Boolean reload;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> userNames;

    private RemoveZooKeeperSaslUserRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.instanceId = builder.instanceId;
        this.reload = builder.reload;
        this.userNames = builder.userNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveZooKeeperSaslUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return reload
     */
    public Boolean getReload() {
        return this.reload;
    }

    /**
     * @return userNames
     */
    public java.util.List<String> getUserNames() {
        return this.userNames;
    }

    public static final class Builder extends Request.Builder<RemoveZooKeeperSaslUserRequest, Builder> {
        private String acceptLanguage; 
        private String instanceId; 
        private Boolean reload; 
        private java.util.List<String> userNames; 

        private Builder() {
            super();
        } 

        private Builder(RemoveZooKeeperSaslUserRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.instanceId = request.instanceId;
            this.reload = request.reload;
            this.userNames = request.userNames;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mse_prepaid_public_cn-****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Reload.
         */
        public Builder reload(Boolean reload) {
            this.putQueryParameter("Reload", reload);
            this.reload = reload;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userNames(java.util.List<String> userNames) {
            String userNamesShrink = shrink(userNames, "UserNames", "json");
            this.putQueryParameter("UserNames", userNamesShrink);
            this.userNames = userNames;
            return this;
        }

        @Override
        public RemoveZooKeeperSaslUserRequest build() {
            return new RemoveZooKeeperSaslUserRequest(this);
        } 

    } 

}
