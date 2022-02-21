// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitFlowResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitFlowResponseBody</p>
 */
public class SubmitFlowResponseBody extends TeaModel {
    @NameInMap("Data")
    private String data;

    @NameInMap("Id")
    private String id;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("RequestId")
    private String requestId;

    private SubmitFlowResponseBody(Builder builder) {
        this.data = builder.data;
        this.id = builder.id;
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitFlowResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
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
        private String data; 
        private String id; 
        private String instanceId; 
        private String requestId; 

        /**
         * 过期参数。
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * 工作流实例ID。
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * 过期参数。
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SubmitFlowResponseBody build() {
            return new SubmitFlowResponseBody(this);
        } 

    } 

}
