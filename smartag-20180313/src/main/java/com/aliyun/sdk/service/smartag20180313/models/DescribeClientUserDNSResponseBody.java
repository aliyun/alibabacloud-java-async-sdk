// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeClientUserDNSResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClientUserDNSResponseBody</p>
 */
public class DescribeClientUserDNSResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppDNS")
    private java.util.List<String> appDNS;

    @com.aliyun.core.annotation.NameInMap("RecoveredDNS")
    private java.util.List<String> recoveredDNS;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClientUserDNSResponseBody(Builder builder) {
        this.appDNS = builder.appDNS;
        this.recoveredDNS = builder.recoveredDNS;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClientUserDNSResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appDNS
     */
    public java.util.List<String> getAppDNS() {
        return this.appDNS;
    }

    /**
     * @return recoveredDNS
     */
    public java.util.List<String> getRecoveredDNS() {
        return this.recoveredDNS;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> appDNS; 
        private java.util.List<String> recoveredDNS; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeClientUserDNSResponseBody model) {
            this.appDNS = model.appDNS;
            this.recoveredDNS = model.recoveredDNS;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The active and standby DNS servers that the SAG app instance uses when it connects to private networks.</p>
         */
        public Builder appDNS(java.util.List<String> appDNS) {
            this.appDNS = appDNS;
            return this;
        }

        /**
         * <p>The active and standby DNS servers that the SAG app instance uses when it disconnects from private networks.</p>
         */
        public Builder recoveredDNS(java.util.List<String> recoveredDNS) {
            this.recoveredDNS = recoveredDNS;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>894AA8BD-0627-45B1-AA18-9CE1D50DA9D0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClientUserDNSResponseBody build() {
            return new DescribeClientUserDNSResponseBody(this);
        } 

    } 

}
