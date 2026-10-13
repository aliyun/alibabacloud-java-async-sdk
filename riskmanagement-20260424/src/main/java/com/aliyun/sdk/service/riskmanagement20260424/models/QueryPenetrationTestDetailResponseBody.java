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
 * {@link QueryPenetrationTestDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPenetrationTestDetailResponseBody</p>
 */
public class QueryPenetrationTestDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryPenetrationTestDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPenetrationTestDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryPenetrationTestDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * <ul>
         * <li><strong>200</strong>: success</li>
         * <li><strong>Other values (400, 500)</strong>: failure</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response content.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>855FCC89-0B13-5FC0-AAD2-120878081C1C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call is successful.                               </li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryPenetrationTestDetailResponseBody build() {
            return new QueryPenetrationTestDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryPenetrationTestDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPenetrationTestDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyTime")
        private Long applyTime;

        @com.aliyun.core.annotation.NameInMap("AssetType")
        private String assetType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("IsThirdpartyTest")
        private Boolean isThirdpartyTest;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TestContent")
        private String testContent;

        @com.aliyun.core.annotation.NameInMap("TestEndDate")
        private Long testEndDate;

        @com.aliyun.core.annotation.NameInMap("TestSourceIps")
        private String testSourceIps;

        @com.aliyun.core.annotation.NameInMap("TestStartDate")
        private Long testStartDate;

        @com.aliyun.core.annotation.NameInMap("TestSteps")
        private String testSteps;

        @com.aliyun.core.annotation.NameInMap("ThirdpartyEmail")
        private String thirdpartyEmail;

        @com.aliyun.core.annotation.NameInMap("ThirdpartyMobile")
        private String thirdpartyMobile;

        @com.aliyun.core.annotation.NameInMap("ThirdpartyTester")
        private String thirdpartyTester;

        private Data(Builder builder) {
            this.applyTime = builder.applyTime;
            this.assetType = builder.assetType;
            this.id = builder.id;
            this.ip = builder.ip;
            this.isThirdpartyTest = builder.isThirdpartyTest;
            this.status = builder.status;
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

        public static Data create() {
            return builder().build();
        }

        /**
         * @return applyTime
         */
        public Long getApplyTime() {
            return this.applyTime;
        }

        /**
         * @return assetType
         */
        public String getAssetType() {
            return this.assetType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return isThirdpartyTest
         */
        public Boolean getIsThirdpartyTest() {
            return this.isThirdpartyTest;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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
        public Long getTestEndDate() {
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
        public Long getTestStartDate() {
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

        public static final class Builder {
            private Long applyTime; 
            private String assetType; 
            private Long id; 
            private String ip; 
            private Boolean isThirdpartyTest; 
            private String status; 
            private String testContent; 
            private Long testEndDate; 
            private String testSourceIps; 
            private Long testStartDate; 
            private String testSteps; 
            private String thirdpartyEmail; 
            private String thirdpartyMobile; 
            private String thirdpartyTester; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.applyTime = model.applyTime;
                this.assetType = model.assetType;
                this.id = model.id;
                this.ip = model.ip;
                this.isThirdpartyTest = model.isThirdpartyTest;
                this.status = model.status;
                this.testContent = model.testContent;
                this.testEndDate = model.testEndDate;
                this.testSourceIps = model.testSourceIps;
                this.testStartDate = model.testStartDate;
                this.testSteps = model.testSteps;
                this.thirdpartyEmail = model.thirdpartyEmail;
                this.thirdpartyMobile = model.thirdpartyMobile;
                this.thirdpartyTester = model.thirdpartyTester;
            } 

            /**
             * <p>The application time.</p>
             * 
             * <strong>example:</strong>
             * <p>1788873796000</p>
             */
            public Builder applyTime(Long applyTime) {
                this.applyTime = applyTime;
                return this;
            }

            /**
             * <p>The asset type. Valid values:</p>
             * <ul>
             * <li><strong>EIP</strong>: public IP address of a VPC</li>
             * <li><strong>SLB</strong>: load balancing</li>
             * <li><strong>ECS</strong>: public IP address of an ECS instance in the classic network</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EIP</p>
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>The unique ID of the application record.</p>
             * <blockquote>
             * <p>This field is of the Long type. Precision loss may occur when you serialize or deserialize the value. Make sure that the value does not exceed 9007199254740991.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2387</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>IP</p>
             * 
             * <strong>example:</strong>
             * <p>47.113.186.91</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>Indicates whether the test is performed by a third-party service provider.</p>
             * <ul>
             * <li>true: Yes.</li>
             * <li>false: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isThirdpartyTest(Boolean isThirdpartyTest) {
                this.isThirdpartyTest = isThirdpartyTest;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li><strong>early_end</strong>: The user applies for early termination.</li>
             * <li><strong>expired</strong>: The authorization has expired.</li>
             * <li><strong>auditing</strong>: The application is being reviewed.</li>
             * <li><strong>approved</strong>: The application is approved.</li>
             * <li><strong>rejected</strong>: The application is rejected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>early_end</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The test content.</p>
             * <blockquote>
             * <ul>
             * <li>The content must be within 500 characters. Carefully fill in the content to increase the chance of passing the review.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>security test</p>
             */
            public Builder testContent(String testContent) {
                this.testContent = testContent;
                return this;
            }

            /**
             * <p>The test end time.</p>
             * 
             * <strong>example:</strong>
             * <p>1788873796000</p>
             */
            public Builder testEndDate(Long testEndDate) {
                this.testEndDate = testEndDate;
                return this;
            }

            /**
             * <p>The source IP addresses used for the test.</p>
             * <blockquote>
             * <p>You can specify up to 50 IP addresses. Separate multiple IP addresses with line breaks or commas (,). Specify 0.0.0.0 to allow all IP addresses. CIDR blocks are not supported, such as 140.168.0.0/16.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.1</p>
             */
            public Builder testSourceIps(String testSourceIps) {
                this.testSourceIps = testSourceIps;
                return this;
            }

            /**
             * <p>The test start date.</p>
             * 
             * <strong>example:</strong>
             * <p>1788873796000</p>
             */
            public Builder testStartDate(Long testStartDate) {
                this.testStartDate = testStartDate;
                return this;
            }

            /**
             * <p>The test steps.</p>
             * <blockquote>
             * <p>The content must be within 500 characters. Carefully fill in the content to increase the chance of passing the review.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder testSteps(String testSteps) {
                this.testSteps = testSteps;
                return this;
            }

            /**
             * <p>The email address of the third-party tester.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:12312@xxx.com">12312@xxx.com</a></p>
             */
            public Builder thirdpartyEmail(String thirdpartyEmail) {
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
                this.thirdpartyMobile = thirdpartyMobile;
                return this;
            }

            /**
             * <p>The third-party tester.</p>
             * 
             * <strong>example:</strong>
             * <p>zhangsan</p>
             */
            public Builder thirdpartyTester(String thirdpartyTester) {
                this.thirdpartyTester = thirdpartyTester;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
