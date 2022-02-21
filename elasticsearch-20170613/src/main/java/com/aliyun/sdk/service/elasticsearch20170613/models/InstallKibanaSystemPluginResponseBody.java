// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallKibanaSystemPluginResponseBody} extends {@link TeaModel}
 *
 * <p>InstallKibanaSystemPluginResponseBody</p>
 */
public class InstallKibanaSystemPluginResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < String > result;

    private InstallKibanaSystemPluginResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallKibanaSystemPluginResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < String > getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < String > result) {
            this.result = result;
            return this;
        }

        public InstallKibanaSystemPluginResponseBody build() {
            return new InstallKibanaSystemPluginResponseBody(this);
        } 

    } 

}
