// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckSharingWithResourceDirectoryStatusResponseBody} extends {@link TeaModel}
 *
 * <p>CheckSharingWithResourceDirectoryStatusResponseBody</p>
 */
public class CheckSharingWithResourceDirectoryStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EnableSharingWithRd")
    private Boolean enableSharingWithRd;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>Indicates whether resource sharing within a resource directory is enabled. Valid values:</p>
         * <ul>
         * <li>false</li>
         * <li>true</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableSharingWithRd(Boolean enableSharingWithRd) {
            this.enableSharingWithRd = enableSharingWithRd;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>819545D0-C97A-5DB3-BD73-A1B17E9A4BC1</p>
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
