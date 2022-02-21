// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCasterComponentResponseBody} extends {@link TeaModel}
 *
 * <p>AddCasterComponentResponseBody</p>
 */
public class AddCasterComponentResponseBody extends TeaModel {
    @NameInMap("ComponentId")
    private String componentId;

    @NameInMap("RequestId")
    private String requestId;

    private AddCasterComponentResponseBody(Builder builder) {
        this.componentId = builder.componentId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCasterComponentResponseBody create() {
        return builder().build();
    }

    /**
     * @return componentId
     */
    public String getComponentId() {
        return this.componentId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String componentId; 
        private String requestId; 

        /**
         * ComponentId.
         */
        public Builder componentId(String componentId) {
            this.componentId = componentId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddCasterComponentResponseBody build() {
            return new AddCasterComponentResponseBody(this);
        } 

    } 

}
