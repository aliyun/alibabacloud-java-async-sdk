// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConfigurationVariateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateConfigurationVariateResponseBody</p>
 */
public class CreateConfigurationVariateResponseBody extends TeaModel {
    @NameInMap("ConfigurationVariateId")
    private String configurationVariateId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateConfigurationVariateResponseBody(Builder builder) {
        this.configurationVariateId = builder.configurationVariateId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConfigurationVariateResponseBody create() {
        return builder().build();
    }

    /**
     * @return configurationVariateId
     */
    public String getConfigurationVariateId() {
        return this.configurationVariateId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String configurationVariateId; 
        private String requestId; 

        /**
         * ConfigurationVariateId.
         */
        public Builder configurationVariateId(String configurationVariateId) {
            this.configurationVariateId = configurationVariateId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateConfigurationVariateResponseBody build() {
            return new CreateConfigurationVariateResponseBody(this);
        } 

    } 

}
