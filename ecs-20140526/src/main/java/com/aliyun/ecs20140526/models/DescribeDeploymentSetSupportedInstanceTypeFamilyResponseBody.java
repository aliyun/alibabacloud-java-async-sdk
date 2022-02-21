// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeploymentSetSupportedInstanceTypeFamilyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeploymentSetSupportedInstanceTypeFamilyResponseBody</p>
 */
public class DescribeDeploymentSetSupportedInstanceTypeFamilyResponseBody extends TeaModel {
    @NameInMap("InstanceTypeFamilies")
    private String instanceTypeFamilies;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDeploymentSetSupportedInstanceTypeFamilyResponseBody(Builder builder) {
        this.instanceTypeFamilies = builder.instanceTypeFamilies;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeploymentSetSupportedInstanceTypeFamilyResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceTypeFamilies
     */
    public String getInstanceTypeFamilies() {
        return this.instanceTypeFamilies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String instanceTypeFamilies; 
        private String requestId; 

        /**
         * Instance families that support deployment sets.
         */
        public Builder instanceTypeFamilies(String instanceTypeFamilies) {
            this.instanceTypeFamilies = instanceTypeFamilies;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDeploymentSetSupportedInstanceTypeFamilyResponseBody build() {
            return new DescribeDeploymentSetSupportedInstanceTypeFamilyResponseBody(this);
        } 

    } 

}
