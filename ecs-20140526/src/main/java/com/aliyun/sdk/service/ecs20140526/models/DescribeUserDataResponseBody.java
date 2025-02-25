// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeUserDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserDataResponseBody</p>
 */
public class DescribeUserDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private DescribeUserDataResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder {
        private String instanceId; 
        private String regionId; 
        private String requestId; 
        private String userData; 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp14bnftyqhxg9ij****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The user data of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWNobyBoZWxsbyBlY321ABC</p>
         */
        public Builder userData(String userData) {
            this.userData = userData;
            return this;
        }

        public DescribeUserDataResponseBody build() {
            return new DescribeUserDataResponseBody(this);
        } 

    } 

}
