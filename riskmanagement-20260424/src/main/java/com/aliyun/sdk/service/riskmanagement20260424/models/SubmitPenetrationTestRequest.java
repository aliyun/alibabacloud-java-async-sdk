// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link SubmitPenetrationTestRequest} extends {@link RequestModel}
 *
 * <p>SubmitPenetrationTestRequest</p>
 */
public class SubmitPenetrationTestRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetList")
    private String assetList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsThirdpartyTest")
    private Boolean isThirdpartyTest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TestContent")
    private String testContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TestEndDate")
    private String testEndDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TestSourceIps")
    private String testSourceIps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TestStartDate")
    private String testStartDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TestSteps")
    private String testSteps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdpartyEmail")
    private String thirdpartyEmail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdpartyMobile")
    private String thirdpartyMobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdpartyTester")
    private String thirdpartyTester;

    private SubmitPenetrationTestRequest(Builder builder) {
        super(builder);
        this.assetList = builder.assetList;
        this.isThirdpartyTest = builder.isThirdpartyTest;
        this.testContent = builder.testContent;
        this.testEndDate = builder.testEndDate;
        this.testSourceIps = builder.testSourceIps;
        this.testStartDate = builder.testStartDate;
        this.testSteps = builder.testSteps;
        this.thirdpartyEmail = builder.thirdpartyEmail;
        this.thirdpartyMobile = builder.thirdpartyMobile;
        this.thirdpartyTester = builder.thirdpartyTester;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitPenetrationTestRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetList
     */
    public String getAssetList() {
        return this.assetList;
    }

    /**
     * @return isThirdpartyTest
     */
    public Boolean getIsThirdpartyTest() {
        return this.isThirdpartyTest;
    }

    /**
     * @return testContent
     */
    public String getTestContent() {
        return this.testContent;
    }

    /**
     * @return testEndDate
     */
    public String getTestEndDate() {
        return this.testEndDate;
    }

    /**
     * @return testSourceIps
     */
    public String getTestSourceIps() {
        return this.testSourceIps;
    }

    /**
     * @return testStartDate
     */
    public String getTestStartDate() {
        return this.testStartDate;
    }

    /**
     * @return testSteps
     */
    public String getTestSteps() {
        return this.testSteps;
    }

    /**
     * @return thirdpartyEmail
     */
    public String getThirdpartyEmail() {
        return this.thirdpartyEmail;
    }

    /**
     * @return thirdpartyMobile
     */
    public String getThirdpartyMobile() {
        return this.thirdpartyMobile;
    }

    /**
     * @return thirdpartyTester
     */
    public String getThirdpartyTester() {
        return this.thirdpartyTester;
    }

    public static final class Builder extends Request.Builder<SubmitPenetrationTestRequest, Builder> {
        private String assetList; 
        private Boolean isThirdpartyTest; 
        private String testContent; 
        private String testEndDate; 
        private String testSourceIps; 
        private String testStartDate; 
        private String testSteps; 
        private String thirdpartyEmail; 
        private String thirdpartyMobile; 
        private String thirdpartyTester; 

        private Builder() {
            super();
        } 

        private Builder(SubmitPenetrationTestRequest request) {
            super(request);
            this.assetList = request.assetList;
            this.isThirdpartyTest = request.isThirdpartyTest;
            this.testContent = request.testContent;
            this.testEndDate = request.testEndDate;
            this.testSourceIps = request.testSourceIps;
            this.testStartDate = request.testStartDate;
            this.testSteps = request.testSteps;
            this.thirdpartyEmail = request.thirdpartyEmail;
            this.thirdpartyMobile = request.thirdpartyMobile;
            this.thirdpartyTester = request.thirdpartyTester;
        } 

        /**
         * <p>The asset list.</p>
         * <blockquote>
         * <p>The array supports up to 50 IP addresses.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;AssetType&quot;:&quot;SLB&quot;,&quot;Ip&quot;:&quot;47.114.52.93&quot;}]</p>
         */
        public Builder assetList(String assetList) {
            this.putQueryParameter("AssetList", assetList);
            this.assetList = assetList;
            return this;
        }

        /**
         * <p>Specifies whether the test is performed by a third-party testing service provider. Valid values:</p>
         * <ul>
         * <li><p>true: Yes.</p>
         * </li>
         * <li><p>false: No.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isThirdpartyTest(Boolean isThirdpartyTest) {
            this.putQueryParameter("IsThirdpartyTest", isThirdpartyTest);
            this.isThirdpartyTest = isThirdpartyTest;
            return this;
        }

        /**
         * <p>The test content.</p>
         * <blockquote>
         * <p>The content must be up to 500 characters in length. Provide detailed information to facilitate the approval process.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>security test</p>
         */
        public Builder testContent(String testContent) {
            this.putQueryParameter("TestContent", testContent);
            this.testContent = testContent;
            return this;
        }

        /**
         * <p>The end time of the test.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-30</p>
         */
        public Builder testEndDate(String testEndDate) {
            this.putQueryParameter("TestEndDate", testEndDate);
            this.testEndDate = testEndDate;
            return this;
        }

        /**
         * <p>The source IP addresses used for the test.</p>
         * <blockquote>
         * <p>Up to 50 IP addresses are supported. Separate multiple IP addresses with line breaks or commas (,). Enter 0.0.0.0 to allow all IP addresses. CIDR blocks such as 140.168.0.0/16 are not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0</p>
         */
        public Builder testSourceIps(String testSourceIps) {
            this.putQueryParameter("TestSourceIps", testSourceIps);
            this.testSourceIps = testSourceIps;
            return this;
        }

        /**
         * <p>The start date of the test.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-30</p>
         */
        public Builder testStartDate(String testStartDate) {
            this.putQueryParameter("TestStartDate", testStartDate);
            this.testStartDate = testStartDate;
            return this;
        }

        /**
         * <p>The test steps.</p>
         * <blockquote>
         * <p>The steps must be up to 500 characters in length. Provide detailed information to facilitate the approval process.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        public Builder testSteps(String testSteps) {
            this.putQueryParameter("TestSteps", testSteps);
            this.testSteps = testSteps;
            return this;
        }

        /**
         * <p>The email address of the third-party tester.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:123xxxxx@xx.com">123xxxxx@xx.com</a></p>
         */
        public Builder thirdpartyEmail(String thirdpartyEmail) {
            this.putQueryParameter("ThirdpartyEmail", thirdpartyEmail);
            this.thirdpartyEmail = thirdpartyEmail;
            return this;
        }

        /**
         * <p>The mobile phone number of the third-party tester.</p>
         * 
         * <strong>example:</strong>
         * <p>177xxxxxx21</p>
         */
        public Builder thirdpartyMobile(String thirdpartyMobile) {
            this.putQueryParameter("ThirdpartyMobile", thirdpartyMobile);
            this.thirdpartyMobile = thirdpartyMobile;
            return this;
        }

        /**
         * <p>The name of the third-party tester.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        public Builder thirdpartyTester(String thirdpartyTester) {
            this.putQueryParameter("ThirdpartyTester", thirdpartyTester);
            this.thirdpartyTester = thirdpartyTester;
            return this;
        }

        @Override
        public SubmitPenetrationTestRequest build() {
            return new SubmitPenetrationTestRequest(this);
        } 

    } 

}
