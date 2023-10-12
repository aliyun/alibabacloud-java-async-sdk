// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConfigurationSpecificationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateConfigurationSpecificationResponseBody</p>
 */
public class CreateConfigurationSpecificationResponseBody extends TeaModel {
    @NameInMap("ConfigurationSpecificationId")
    private String configurationSpecificationId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateConfigurationSpecificationResponseBody(Builder builder) {
        this.configurationSpecificationId = builder.configurationSpecificationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConfigurationSpecificationResponseBody create() {
        return builder().build();
    }

    /**
     * @return configurationSpecificationId
     */
    public String getConfigurationSpecificationId() {
        return this.configurationSpecificationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String configurationSpecificationId; 
        private String requestId; 

        /**
         * ConfigurationSpecificationId.
         */
        public Builder configurationSpecificationId(String configurationSpecificationId) {
            this.configurationSpecificationId = configurationSpecificationId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateConfigurationSpecificationResponseBody build() {
            return new CreateConfigurationSpecificationResponseBody(this);
        } 

    } 

}
