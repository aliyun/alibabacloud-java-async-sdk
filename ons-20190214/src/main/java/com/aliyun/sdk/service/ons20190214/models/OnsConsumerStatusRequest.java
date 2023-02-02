// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsConsumerStatusRequest} extends {@link RequestModel}
 *
 * <p>OnsConsumerStatusRequest</p>
 */
public class OnsConsumerStatusRequest extends Request {
    @Query
    @NameInMap("Detail")
    private Boolean detail;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("NeedJstack")
    private Boolean needJstack;

    private OnsConsumerStatusRequest(Builder builder) {
        super(builder);
        this.detail = builder.detail;
        this.groupId = builder.groupId;
        this.instanceId = builder.instanceId;
        this.needJstack = builder.needJstack;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsConsumerStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detail
     */
    public Boolean getDetail() {
        return this.detail;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return needJstack
     */
    public Boolean getNeedJstack() {
        return this.needJstack;
    }

    public static final class Builder extends Request.Builder<OnsConsumerStatusRequest, Builder> {
        private Boolean detail; 
        private String groupId; 
        private String instanceId; 
        private Boolean needJstack; 

        private Builder() {
            super();
        } 

        private Builder(OnsConsumerStatusRequest request) {
            super(request);
            this.detail = request.detail;
            this.groupId = request.groupId;
            this.instanceId = request.instanceId;
            this.needJstack = request.needJstack;
        } 

        /**
         * Specifies whether to query the details of the consumer group. Valid values:
         * <p>
         * 
         * *   **true**: The details of the consumer group are queried. You can obtain details from the **ConsumerConnectionInfoList** and **DetailInTopicList** response parameters.
         * *   **false**: The details of the consumer group are not queried. The values of the **ConsumerConnectionInfoList** and **DetailInTopicList** response parameters are empty. This value is the default value of the Detail parameter.
         */
        public Builder detail(Boolean detail) {
            this.putQueryParameter("Detail", detail);
            this.detail = detail;
            return this;
        }

        /**
         * The ID of the consumer group whose details you want to query.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the instance to which the consumer group belongs.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Specifies whether to query the information about thread stack traces. Valid values:
         * <p>
         * 
         * *   **true**: The information about thread stack traces is queried. You can obtain the information from the **Jstack** response parameter.
         * 
         * >  If you want to obtain the information about thread stack traces, make sure that the **Detail** parameter in the request is set to **true**.
         * 
         * *   **false**: The information about thread stack traces is not queried. The value of the **Jstack** response parameter is empty. This value is the default value of the NeedJstack parameter.
         */
        public Builder needJstack(Boolean needJstack) {
            this.putQueryParameter("NeedJstack", needJstack);
            this.needJstack = needJstack;
            return this;
        }

        @Override
        public OnsConsumerStatusRequest build() {
            return new OnsConsumerStatusRequest(this);
        } 

    } 

}
