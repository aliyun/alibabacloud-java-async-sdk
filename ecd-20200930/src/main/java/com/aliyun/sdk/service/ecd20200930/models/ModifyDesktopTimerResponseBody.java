// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDesktopTimerResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDesktopTimerResponseBody</p>
 */
public class ModifyDesktopTimerResponseBody extends TeaModel {
    @NameInMap("DesktopIds")
    private java.util.List < String > desktopIds;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyDesktopTimerResponseBody(Builder builder) {
        this.desktopIds = builder.desktopIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesktopTimerResponseBody create() {
        return builder().build();
    }

    /**
     * @return desktopIds
     */
    public java.util.List < String > getDesktopIds() {
        return this.desktopIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > desktopIds; 
        private String requestId; 

        /**
         * DesktopIds.
         */
        public Builder desktopIds(java.util.List < String > desktopIds) {
            this.desktopIds = desktopIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDesktopTimerResponseBody build() {
            return new ModifyDesktopTimerResponseBody(this);
        } 

    } 

}
