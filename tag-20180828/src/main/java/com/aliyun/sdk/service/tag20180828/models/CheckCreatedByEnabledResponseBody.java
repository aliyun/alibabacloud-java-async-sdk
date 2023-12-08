// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckCreatedByEnabledResponseBody} extends {@link TeaModel}
 *
 * <p>CheckCreatedByEnabledResponseBody</p>
 */
public class CheckCreatedByEnabledResponseBody extends TeaModel {
    @NameInMap("OpenStatus")
    private Boolean openStatus;

    @NameInMap("RequestId")
    private String requestId;

    private CheckCreatedByEnabledResponseBody(Builder builder) {
        this.openStatus = builder.openStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckCreatedByEnabledResponseBody create() {
        return builder().build();
    }

    /**
     * @return openStatus
     */
    public Boolean getOpenStatus() {
        return this.openStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean openStatus; 
        private String requestId; 

        /**
         * OpenStatus.
         */
        public Builder openStatus(Boolean openStatus) {
            this.openStatus = openStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckCreatedByEnabledResponseBody build() {
            return new CheckCreatedByEnabledResponseBody(this);
        } 

    } 

}
