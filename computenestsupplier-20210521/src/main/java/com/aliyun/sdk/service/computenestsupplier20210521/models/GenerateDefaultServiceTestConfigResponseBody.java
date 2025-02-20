// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link GenerateDefaultServiceTestConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateDefaultServiceTestConfigResponseBody</p>
 */
public class GenerateDefaultServiceTestConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TestConfig")
    private String testConfig;

    private GenerateDefaultServiceTestConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.testConfig = builder.testConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateDefaultServiceTestConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return testConfig
     */
    public String getTestConfig() {
        return this.testConfig;
    }

    public static final class Builder {
        private String requestId; 
        private String testConfig; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>51945B04-6AA6-410D-93BA-236E0248B104</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The service test config</p>
         * 
         * <strong>example:</strong>
         * <hr>
         * <p>parameters:
         *   PayType: &quot;PostPaid&quot;
         *   EcsInstanceType: &quot;$[iact3-auto]&quot;
         *   InstancePassword: &quot;$[iact3-auto]&quot;</p>
         */
        public Builder testConfig(String testConfig) {
            this.testConfig = testConfig;
            return this;
        }

        public GenerateDefaultServiceTestConfigResponseBody build() {
            return new GenerateDefaultServiceTestConfigResponseBody(this);
        } 

    } 

}
