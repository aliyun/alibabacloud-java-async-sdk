// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeSecurityModeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityModeResponseBody</p>
 */
public class DescribeSecurityModeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Module")
    @Deprecated
    private String module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityMode")
    private Integer securityMode;

    private DescribeSecurityModeResponseBody(Builder builder) {
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.securityMode = builder.securityMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityModeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return module
     */
    public String getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityMode
     */
    public Integer getSecurityMode() {
        return this.securityMode;
    }

    public static final class Builder {
        private String module; 
        private String requestId; 
        private Integer securityMode; 

        private Builder() {
        } 

        private Builder(DescribeSecurityModeResponseBody model) {
            this.module = model.module;
            this.requestId = model.requestId;
            this.securityMode = model.securityMode;
        } 

        /**
         * Module.
         */
        public Builder module(String module) {
            this.module = module;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecurityMode.
         */
        public Builder securityMode(Integer securityMode) {
            this.securityMode = securityMode;
            return this;
        }

        public DescribeSecurityModeResponseBody build() {
            return new DescribeSecurityModeResponseBody(this);
        } 

    } 

}
