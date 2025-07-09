// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link CreateGlobalDistributeCacheResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGlobalDistributeCacheResponseBody</p>
 */
public class CreateGlobalDistributeCacheResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GlobalInstanceId")
    private String globalInstanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateGlobalDistributeCacheResponseBody(Builder builder) {
        this.globalInstanceId = builder.globalInstanceId;
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGlobalDistributeCacheResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return globalInstanceId
     */
    public String getGlobalInstanceId() {
        return this.globalInstanceId;
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
        private String globalInstanceId; 
        private String instanceId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateGlobalDistributeCacheResponseBody model) {
            this.globalInstanceId = model.globalInstanceId;
            this.instanceId = model.instanceId;
            this.requestId = model.requestId;
        } 

        /**
         * GlobalInstanceId.
         */
        public Builder globalInstanceId(String globalInstanceId) {
            this.globalInstanceId = globalInstanceId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E681E498-5A0D-44F2-B1A7-912DC3******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateGlobalDistributeCacheResponseBody build() {
            return new CreateGlobalDistributeCacheResponseBody(this);
        } 

    } 

}
