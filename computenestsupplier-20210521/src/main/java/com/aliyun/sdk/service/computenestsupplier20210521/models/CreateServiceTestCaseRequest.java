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
 * {@link CreateServiceTestCaseRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceTestCaseRequest</p>
 */
public class CreateServiceTestCaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TestCaseName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String testCaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TestConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String testConfig;

    private CreateServiceTestCaseRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.serviceId = builder.serviceId;
        this.serviceVersion = builder.serviceVersion;
        this.templateName = builder.templateName;
        this.testCaseName = builder.testCaseName;
        this.testConfig = builder.testConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceTestCaseRequest create() {
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
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
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

    public static final class Builder extends Request.Builder<CreateServiceTestCaseRequest, Builder> {
        private String regionId; 
        private String serviceId; 
        private String serviceVersion; 
        private String templateName; 
        private String testCaseName; 
        private String testConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceTestCaseRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.serviceId = request.serviceId;
            this.serviceVersion = request.serviceVersion;
            this.templateName = request.templateName;
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
         * <p>The service ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>service-0e6fca6a51a544xxxxxx</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The service version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>draft</p>
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        /**
         * <p>The template name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom_Image_Ecs</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>Service Test case name.</p>
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
         * <p>The service test config</p>
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
        public CreateServiceTestCaseRequest build() {
            return new CreateServiceTestCaseRequest(this);
        } 

    } 

}
