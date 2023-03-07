// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVisualServicePasswdResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyVisualServicePasswdResponseBody</p>
 */
public class ModifyVisualServicePasswdResponseBody extends TeaModel {
    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyVisualServicePasswdResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVisualServicePasswdResponseBody create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 

        /**
         * The status of the VNC Remote visualization service. Valid values:
         * <p>
         * 
         * *   Service started.: started
         * *   Service stopped.: stopped
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyVisualServicePasswdResponseBody build() {
            return new ModifyVisualServicePasswdResponseBody(this);
        } 

    } 

}
