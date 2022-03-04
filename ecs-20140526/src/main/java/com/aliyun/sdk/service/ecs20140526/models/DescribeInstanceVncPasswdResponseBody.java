// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceVncPasswdResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceVncPasswdResponseBody</p>
 */
public class DescribeInstanceVncPasswdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VncPasswd")
    private String vncPasswd;

    private DescribeInstanceVncPasswdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vncPasswd = builder.vncPasswd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceVncPasswdResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vncPasswd
     */
    public String getVncPasswd() {
        return this.vncPasswd;
    }

    public static final class Builder {
        private String requestId; 
        private String vncPasswd; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VncPasswd.
         */
        public Builder vncPasswd(String vncPasswd) {
            this.vncPasswd = vncPasswd;
            return this;
        }

        public DescribeInstanceVncPasswdResponseBody build() {
            return new DescribeInstanceVncPasswdResponseBody(this);
        } 

    } 

}
