// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link ProtocolConfiguration} extends {@link TeaModel}
 *
 * <p>ProtocolConfiguration</p>
 */
public class ProtocolConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ProtocolConfiguration(Builder builder) {
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProtocolConfiguration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String type; 

        private Builder() {
        } 

        private Builder(ProtocolConfiguration model) {
            this.type = model.type;
        } 

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ProtocolConfiguration build() {
            return new ProtocolConfiguration(this);
        } 

    } 

}
