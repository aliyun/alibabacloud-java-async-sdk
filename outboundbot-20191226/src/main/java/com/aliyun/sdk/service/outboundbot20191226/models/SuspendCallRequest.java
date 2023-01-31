// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SuspendCallRequest} extends {@link RequestModel}
 *
 * <p>SuspendCallRequest</p>
 */
public class SuspendCallRequest extends Request {
    @Query
    @NameInMap("CalledNumbers")
    private java.util.List < String > calledNumbers;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private SuspendCallRequest(Builder builder) {
        super(builder);
        this.calledNumbers = builder.calledNumbers;
        this.groupId = builder.groupId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SuspendCallRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calledNumbers
     */
    public java.util.List < String > getCalledNumbers() {
        return this.calledNumbers;
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

    public static final class Builder extends Request.Builder<SuspendCallRequest, Builder> {
        private java.util.List < String > calledNumbers; 
        private String groupId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(SuspendCallRequest request) {
            super(request);
            this.calledNumbers = request.calledNumbers;
            this.groupId = request.groupId;
            this.instanceId = request.instanceId;
        } 

        /**
         * CalledNumbers.
         */
        public Builder calledNumbers(java.util.List < String > calledNumbers) {
            this.putQueryParameter("CalledNumbers", calledNumbers);
            this.calledNumbers = calledNumbers;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public SuspendCallRequest build() {
            return new SuspendCallRequest(this);
        } 

    } 

}
