// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDeploymentSetSupportedInstanceTypeFamilyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeploymentSetSupportedInstanceTypeFamilyResponseBody</p>
 */
public class DescribeDeploymentSetSupportedInstanceTypeFamilyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceTypeFamilies")
    private String instanceTypeFamilies;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The instance families that support the deployment strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.i2g,ecs.i1,ecs.i2ne,ecs.i2gne</p>
         */
        public Builder instanceTypeFamilies(String instanceTypeFamilies) {
            this.instanceTypeFamilies = instanceTypeFamilies;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B7DB-A3DC7DE1****</p>
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
