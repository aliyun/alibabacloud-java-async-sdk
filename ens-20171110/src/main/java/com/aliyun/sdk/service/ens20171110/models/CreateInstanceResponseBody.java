// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateInstanceResponseBody</p>
 */
public class CreateInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("InstanceIds")
    private InstanceIds instanceIds;

    @NameInMap("RequestId")
    private String requestId;

    private CreateInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.instanceIds = builder.instanceIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return instanceIds
     */
    public InstanceIds getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private InstanceIds instanceIds; 
        private String requestId; 

        /**
         * The return code. A value of 0 indicates that the request is successful.
         * <p>
         * 
         * >  If you call this operation by using SDKs, the return value is of the integer type. If you call this operation by using common methods or HTTP requests, the return value is of the string type.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The IDs of instances.
         */
        public Builder instanceIds(InstanceIds instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateInstanceResponseBody build() {
            return new CreateInstanceResponseBody(this);
        } 

    } 

    public static class InstanceIds extends TeaModel {
        @NameInMap("InstanceId")
        private java.util.List < String > instanceId;

        private InstanceIds(Builder builder) {
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceIds create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public java.util.List < String > getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private java.util.List < String > instanceId; 

            /**
             * InstanceId.
             */
            public Builder instanceId(java.util.List < String > instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public InstanceIds build() {
                return new InstanceIds(this);
            } 

        } 

    }
}
