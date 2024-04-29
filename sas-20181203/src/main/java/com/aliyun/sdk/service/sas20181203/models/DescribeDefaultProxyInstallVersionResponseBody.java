// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefaultProxyInstallVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefaultProxyInstallVersionResponseBody</p>
 */
public class DescribeDefaultProxyInstallVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstallVersion")
    private String installVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDefaultProxyInstallVersionResponseBody(Builder builder) {
        this.installVersion = builder.installVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefaultProxyInstallVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return installVersion
     */
    public String getInstallVersion() {
        return this.installVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String installVersion; 
        private String requestId; 

        /**
         * The default installation version.
         */
        public Builder installVersion(String installVersion) {
            this.installVersion = installVersion;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDefaultProxyInstallVersionResponseBody build() {
            return new DescribeDefaultProxyInstallVersionResponseBody(this);
        } 

    } 

}
