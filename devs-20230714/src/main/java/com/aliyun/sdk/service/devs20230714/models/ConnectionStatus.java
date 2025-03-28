// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link ConnectionStatus} extends {@link TeaModel}
 *
 * <p>ConnectionStatus</p>
 */
public class ConnectionStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("installation")
    private Installation installation;

    private ConnectionStatus(Builder builder) {
        this.installation = builder.installation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConnectionStatus create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return installation
     */
    public Installation getInstallation() {
        return this.installation;
    }

    public static final class Builder {
        private Installation installation; 

        private Builder() {
        } 

        private Builder(ConnectionStatus model) {
            this.installation = model.installation;
        } 

        /**
         * installation.
         */
        public Builder installation(Installation installation) {
            this.installation = installation;
            return this;
        }

        public ConnectionStatus build() {
            return new ConnectionStatus(this);
        } 

    } 

}
