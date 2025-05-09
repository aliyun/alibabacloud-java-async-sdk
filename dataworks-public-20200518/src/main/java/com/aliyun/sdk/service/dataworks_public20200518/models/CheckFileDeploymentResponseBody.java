// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link CheckFileDeploymentResponseBody} extends {@link TeaModel}
 *
 * <p>CheckFileDeploymentResponseBody</p>
 */
public class CheckFileDeploymentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckFileDeploymentResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckFileDeploymentResponseBody create() {
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

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(CheckFileDeploymentResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The request ID. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>86d5a5ac-0cc0-4c5f-a374-a15713b252ab</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckFileDeploymentResponseBody build() {
            return new CheckFileDeploymentResponseBody(this);
        } 

    } 

}
