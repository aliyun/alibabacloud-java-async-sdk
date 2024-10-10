// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeImageScanAuthorizationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageScanAuthorizationResponseBody</p>
 */
public class DescribeImageScanAuthorizationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthStatus")
    private AuthStatus authStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeImageScanAuthorizationResponseBody(Builder builder) {
        this.authStatus = builder.authStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageScanAuthorizationResponseBody create() {
        return builder().build();
    }

    /**
     * @return authStatus
     */
    public AuthStatus getAuthStatus() {
        return this.authStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AuthStatus authStatus; 
        private String requestId; 

        /**
         * <p>The authorization status of image scans.</p>
         */
        public Builder authStatus(AuthStatus authStatus) {
            this.authStatus = authStatus;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>340D7FC4-D575-1661-8ACD-CFA7BE57****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageScanAuthorizationResponseBody build() {
            return new DescribeImageScanAuthorizationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageScanAuthorizationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageScanAuthorizationResponseBody</p>
     */
    public static class AuthStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private Boolean status;

        private AuthStatus(Builder builder) {
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthStatus create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public Boolean getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean status; 

            /**
             * <p>Indicates whether Security Center is authorized to scan images. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes </li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            public AuthStatus build() {
                return new AuthStatus(this);
            } 

        } 

    }
}
