// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeHybridCloudUserResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridCloudUserResponseBody</p>
 */
public class DescribeHybridCloudUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserInfo")
    private UserInfo userInfo;

    private DescribeHybridCloudUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridCloudUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userInfo
     */
    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public static final class Builder {
        private String requestId; 
        private UserInfo userInfo; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9178CB86-285F-5679-A30A-3B3F007E4206</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the ports that can be used by a hybrid cloud cluster.</p>
         */
        public Builder userInfo(UserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }

        public DescribeHybridCloudUserResponseBody build() {
            return new DescribeHybridCloudUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHybridCloudUserResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridCloudUserResponseBody</p>
     */
    public static class UserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HttpPorts")
        private String httpPorts;

        @com.aliyun.core.annotation.NameInMap("HttpsPorts")
        private String httpsPorts;

        private UserInfo(Builder builder) {
            this.httpPorts = builder.httpPorts;
            this.httpsPorts = builder.httpsPorts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInfo create() {
            return builder().build();
        }

        /**
         * @return httpPorts
         */
        public String getHttpPorts() {
            return this.httpPorts;
        }

        /**
         * @return httpsPorts
         */
        public String getHttpsPorts() {
            return this.httpsPorts;
        }

        public static final class Builder {
            private String httpPorts; 
            private String httpsPorts; 

            /**
             * <p>The HTTP ports. The value is a string. If multiple ports are returned, the value is in the <strong>port1,port2,port3</strong> format.</p>
             * 
             * <strong>example:</strong>
             * <p>80,8080</p>
             */
            public Builder httpPorts(String httpPorts) {
                this.httpPorts = httpPorts;
                return this;
            }

            /**
             * <p>The HTTPS ports. The value is a string. If multiple ports are returned, the value is in the <strong>port1,port2,port3</strong> format.</p>
             * 
             * <strong>example:</strong>
             * <p>8443,443</p>
             */
            public Builder httpsPorts(String httpsPorts) {
                this.httpsPorts = httpsPorts;
                return this;
            }

            public UserInfo build() {
                return new UserInfo(this);
            } 

        } 

    }
}
