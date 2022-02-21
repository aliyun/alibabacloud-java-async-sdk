// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCasterComponentResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteCasterComponentResponseBody</p>
 */
public class DeleteCasterComponentResponseBody extends TeaModel {
    @NameInMap("CasterId")
    private String casterId;

    @NameInMap("ComponentId")
    private String componentId;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteCasterComponentResponseBody(Builder builder) {
        this.casterId = builder.casterId;
        this.componentId = builder.componentId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCasterComponentResponseBody create() {
        return builder().build();
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
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
        private String casterId; 
        private String componentId; 
        private String requestId; 

        /**
         * CasterId.
         */
        public Builder casterId(String casterId) {
            this.casterId = casterId;
            return this;
        }

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

        public DeleteCasterComponentResponseBody build() {
            return new DeleteCasterComponentResponseBody(this);
        } 

    } 

}
