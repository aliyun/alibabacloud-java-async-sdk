// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link InstallKibanaSystemPluginResponseBody} extends {@link TeaModel}
 *
 * <p>InstallKibanaSystemPluginResponseBody</p>
 */
public class InstallKibanaSystemPluginResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<String> result;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<String> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<String> result; 

        private Builder() {
        } 

        private Builder(InstallKibanaSystemPluginResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F99407AB-2FA9-489E-A259-40CF6DC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of plug-ins to be installed.</p>
         */
        public Builder result(java.util.List<String> result) {
            this.result = result;
            return this;
        }

        public InstallKibanaSystemPluginResponseBody build() {
            return new InstallKibanaSystemPluginResponseBody(this);
        } 

    } 

}
