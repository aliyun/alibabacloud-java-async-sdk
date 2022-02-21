// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationResponseBody</p>
 */
public class DescribeApplicationResponseBody extends TeaModel {
    @NameInMap("Application")
    private String application;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeApplicationResponseBody(Builder builder) {
        this.application = builder.application;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationResponseBody create() {
        return builder().build();
    }

    /**
     * @return application
     */
    public String getApplication() {
        return this.application;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String application; 
        private String requestId; 

        /**
         * Application.
         */
        public Builder application(String application) {
            this.application = application;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApplicationResponseBody build() {
            return new DescribeApplicationResponseBody(this);
        } 

    } 

}
