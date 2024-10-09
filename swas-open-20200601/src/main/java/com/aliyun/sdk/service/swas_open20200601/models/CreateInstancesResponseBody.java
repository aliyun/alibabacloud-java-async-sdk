// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>CreateInstancesResponseBody</p>
 */
public class CreateInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateInstancesResponseBody(Builder builder) {
        this.instanceIds = builder.instanceIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > instanceIds; 
        private String requestId; 

        /**
         * <p>The IDs of the simple application servers.</p>
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30637AD6-D977-4833-A54C-CC89483E1FEE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateInstancesResponseBody build() {
            return new CreateInstancesResponseBody(this);
        } 

    } 

}
