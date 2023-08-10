// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckSharingWithResourceDirectoryStatusResponseBody} extends {@link TeaModel}
 *
 * <p>CheckSharingWithResourceDirectoryStatusResponseBody</p>
 */
public class CheckSharingWithResourceDirectoryStatusResponseBody extends TeaModel {
    @NameInMap("EnableSharingWithRd")
    private Boolean enableSharingWithRd;

    @NameInMap("RequestId")
    private String requestId;

    private CheckSharingWithResourceDirectoryStatusResponseBody(Builder builder) {
        this.enableSharingWithRd = builder.enableSharingWithRd;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckSharingWithResourceDirectoryStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return enableSharingWithRd
     */
    public Boolean getEnableSharingWithRd() {
        return this.enableSharingWithRd;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean enableSharingWithRd; 
        private String requestId; 

        /**
         * EnableSharingWithRd.
         */
        public Builder enableSharingWithRd(Boolean enableSharingWithRd) {
            this.enableSharingWithRd = enableSharingWithRd;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckSharingWithResourceDirectoryStatusResponseBody build() {
            return new CheckSharingWithResourceDirectoryStatusResponseBody(this);
        } 

    } 

}
