// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyADConnectorOfficeSiteResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyADConnectorOfficeSiteResponseBody</p>
 */
public class ModifyADConnectorOfficeSiteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyADConnectorOfficeSiteResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyADConnectorOfficeSiteResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyADConnectorOfficeSiteResponseBody build() {
            return new ModifyADConnectorOfficeSiteResponseBody(this);
        } 

    } 

}
