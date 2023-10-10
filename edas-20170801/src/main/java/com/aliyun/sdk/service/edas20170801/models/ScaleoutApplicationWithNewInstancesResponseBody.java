// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScaleoutApplicationWithNewInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ScaleoutApplicationWithNewInstancesResponseBody</p>
 */
public class ScaleoutApplicationWithNewInstancesResponseBody extends TeaModel {
    @NameInMap("ChangeOrderId")
    private String changeOrderId;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ScaleoutApplicationWithNewInstancesResponseBody(Builder builder) {
        this.changeOrderId = builder.changeOrderId;
        this.code = builder.code;
        this.instanceIds = builder.instanceIds;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScaleoutApplicationWithNewInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return changeOrderId
     */
    public String getChangeOrderId() {
        return this.changeOrderId;
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
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String changeOrderId; 
        private Integer code; 
        private java.util.List < String > instanceIds; 
        private String message; 
        private String requestId; 

        /**
         * The ID of the change process for the scale-out.
         */
        public Builder changeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The IDs of ECS instances.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The additional information that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ScaleoutApplicationWithNewInstancesResponseBody build() {
            return new ScaleoutApplicationWithNewInstancesResponseBody(this);
        } 

    } 

}
