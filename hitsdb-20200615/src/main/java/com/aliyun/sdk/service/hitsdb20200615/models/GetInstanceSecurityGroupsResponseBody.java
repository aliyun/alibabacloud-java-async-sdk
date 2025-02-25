// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link GetInstanceSecurityGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceSecurityGroupsResponseBody</p>
 */
public class GetInstanceSecurityGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityGroups")
    private java.util.List<String> securityGroups;

    private GetInstanceSecurityGroupsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
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
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
    public java.util.List<String> getSecurityGroups() {
        return this.securityGroups;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String instanceId; 
        private String requestId; 
        private java.util.List<String> securityGroups; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecurityGroups.
         */
        public Builder securityGroups(java.util.List<String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public GetInstanceSecurityGroupsResponseBody build() {
            return new GetInstanceSecurityGroupsResponseBody(this);
        } 

    } 

}
