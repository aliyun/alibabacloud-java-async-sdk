// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link EnableInstancePublicAccessResponseBody} extends {@link TeaModel}
 *
 * <p>EnableInstancePublicAccessResponseBody</p>
 */
public class EnableInstancePublicAccessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private EnableInstancePublicAccessResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableInstancePublicAccessResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String instanceId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(EnableInstancePublicAccessResponseBody model) {
            this.instanceId = model.instanceId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The instance ID of the Bastionhost instance for which public network access is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-78v1gh****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The request ID. The China Chinese system generates a unique ID for each request. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>D47B5043-FDD6-4FBE-976E-5FC67A23578F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnableInstancePublicAccessResponseBody build() {
            return new EnableInstancePublicAccessResponseBody(this);
        } 

    } 

}
