// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateTrafficControlTaskConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateTrafficControlTaskConfigResponseBody</p>
 */
public class GenerateTrafficControlTaskConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GenerateTrafficControlTaskConfigResponseBody(Builder builder) {
        this.config = builder.config;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateTrafficControlTaskConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String config; 
        private String requestId; 

        /**
         * Config.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateTrafficControlTaskConfigResponseBody build() {
            return new GenerateTrafficControlTaskConfigResponseBody(this);
        } 

    } 

}
