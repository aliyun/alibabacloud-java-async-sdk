// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The default installation version.</p>
         * 
         * <strong>example:</strong>
         * <p>proxy_01_03</p>
         */
        public Builder installVersion(String installVersion) {
            this.installVersion = installVersion;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F9FCB51A-5078-5D31-9C4D-3B25BEF068C7</p>
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
