// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_dbaudit20191209.models;

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
 * {@link ClearInstanceStorageResponseBody} extends {@link TeaModel}
 *
 * <p>ClearInstanceStorageResponseBody</p>
 */
public class ClearInstanceStorageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ClearInstanceStorageResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClearInstanceStorageResponseBody create() {
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

        private Builder(ClearInstanceStorageResponseBody model) {
            this.instanceId = model.instanceId;
            this.requestId = model.requestId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ClearInstanceStorageResponseBody build() {
            return new ClearInstanceStorageResponseBody(this);
        } 

    } 

}
