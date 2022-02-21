// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserDataResponseBody</p>
 */
public class DescribeUserDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("UserData")
    private String userData;

    @NameInMap("RegionId")
    private String regionId;

    private DescribeUserDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.instanceId = builder.instanceId;
        this.userData = builder.userData;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder {
        private String requestId; 
        private String instanceId; 
        private String userData; 
        private String regionId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The user data of the instance.
         */
        public Builder userData(String userData) {
            this.userData = userData;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        public DescribeUserDataResponseBody build() {
            return new DescribeUserDataResponseBody(this);
        } 

    } 

}
