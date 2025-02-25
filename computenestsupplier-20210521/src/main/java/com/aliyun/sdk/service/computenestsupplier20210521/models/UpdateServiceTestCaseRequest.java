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
 * {@link UpdateServiceTestCaseRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceTestCaseRequest</p>
 */
public class UpdateServiceTestCaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TestCaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String testCaseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TestCaseName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String testCaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TestConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String testConfig;

    private UpdateServiceTestCaseRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.testCaseId = builder.testCaseId;
        this.testCaseName = builder.testCaseName;
        this.testConfig = builder.testConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceTestCaseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return testCaseId
     */
    public String getTestCaseId() {
        return this.testCaseId;
    }

    /**
     * @return testCaseName
     */
    public String getTestCaseName() {
        return this.testCaseName;
    }

    /**
     * @return testConfig
     */
    public String getTestConfig() {
        return this.testConfig;
    }

    public static final class Builder extends Request.Builder<UpdateServiceTestCaseRequest, Builder> {
        private String regionId; 
        private String testCaseId; 
        private String testCaseName; 
        private String testConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceTestCaseRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.testCaseId = request.testCaseId;
            this.testCaseName = request.testCaseName;
            this.testConfig = request.testConfig;
        } 

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The service test case id.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>stc-2deec15c20b24aaf9f16</p>
         */
        public Builder testCaseId(String testCaseId) {
            this.putQueryParameter("TestCaseId", testCaseId);
            this.testCaseId = testCaseId;
            return this;
        }

        /**
         * <p>The service test case name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>case1</p>
         */
        public Builder testCaseName(String testCaseName) {
            this.putQueryParameter("TestCaseName", testCaseName);
            this.testCaseName = testCaseName;
            return this;
        }

        /**
         * <p>The service test config.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         * <p>parameters:
         *   PayType: &quot;PostPaid&quot;
         *   EcsInstanceType: &quot;$[iact3-auto]&quot;
         *   InstancePassword: &quot;$[iact3-auto]&quot;</p>
         */
        public Builder testConfig(String testConfig) {
            this.putQueryParameter("TestConfig", testConfig);
            this.testConfig = testConfig;
            return this;
        }

        @Override
        public UpdateServiceTestCaseRequest build() {
            return new UpdateServiceTestCaseRequest(this);
        } 

    } 

}
