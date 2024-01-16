// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceSecurityGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceSecurityGroupsResponseBody</p>
 */
public class GetInstanceSecurityGroupsResponseBody extends TeaModel {
    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityGroups")
    private java.util.List < String > securityGroups;

    private GetInstanceSecurityGroupsResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
        this.securityGroups = builder.securityGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceSecurityGroupsResponseBody create() {
        return builder().build();
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

    /**
     * @return securityGroups
     */
    public java.util.List < String > getSecurityGroups() {
        return this.securityGroups;
    }

    public static final class Builder {
        private String instanceId; 
        private String requestId; 
        private java.util.List < String > securityGroups; 

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

        /**
         * SecurityGroups.
         */
        public Builder securityGroups(java.util.List < String > securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public GetInstanceSecurityGroupsResponseBody build() {
            return new GetInstanceSecurityGroupsResponseBody(this);
        } 

    } 

}
