// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ScaleoutApplicationWithNewInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ScaleoutApplicationWithNewInstancesResponseBody</p>
 */
public class ScaleoutApplicationWithNewInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChangeOrderId")
    private String changeOrderId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<String> getInstanceIds() {
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
        private java.util.List<String> instanceIds; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ScaleoutApplicationWithNewInstancesResponseBody model) {
            this.changeOrderId = model.changeOrderId;
            this.code = model.code;
            this.instanceIds = model.instanceIds;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the change process for the scale-out.</p>
         * 
         * <strong>example:</strong>
         * <p>e370c17f-*****-3df0721a327</p>
         */
        public Builder changeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The IDs of ECS instances.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>e370c17f-*****-3df0721a327</p>
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
