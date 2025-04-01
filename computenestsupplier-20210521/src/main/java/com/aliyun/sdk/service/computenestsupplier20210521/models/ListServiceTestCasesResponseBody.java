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
 * {@link ListServiceTestCasesResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceTestCasesResponseBody</p>
 */
public class ListServiceTestCasesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListServiceTestCasesResponseBody(Builder builder) {
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceTestCasesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListServiceTestCasesResponseBody model) {
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAWns8w4MmhzeptXVRG0PUEU=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CA3AE512-6D30-549A-B52D-B9042CA8D515</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListServiceTestCasesResponseBody build() {
            return new ListServiceTestCasesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceTestCasesResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceTestCasesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TestCaseId")
        private String testCaseId;

        @com.aliyun.core.annotation.NameInMap("TestCaseName")
        private String testCaseName;

        @com.aliyun.core.annotation.NameInMap("TestConfig")
        private String testConfig;

        private Data(Builder builder) {
            this.templateName = builder.templateName;
            this.testCaseId = builder.testCaseId;
            this.testCaseName = builder.testCaseName;
            this.testConfig = builder.testConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
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

        public static final class Builder {
            private String templateName; 
            private String testCaseId; 
            private String testCaseName; 
            private String testConfig; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.templateName = model.templateName;
                this.testCaseId = model.testCaseId;
                this.testCaseName = model.testCaseName;
                this.testConfig = model.testConfig;
            } 

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-1</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The service test case id.</p>
             * 
             * <strong>example:</strong>
             * <p>stc-83fcee1383354e35b151</p>
             */
            public Builder testCaseId(String testCaseId) {
                this.testCaseId = testCaseId;
                return this;
            }

            /**
             * <p>The service test case name.</p>
             * 
             * <strong>example:</strong>
             * <p>case1</p>
             */
            public Builder testCaseName(String testCaseName) {
                this.testCaseName = testCaseName;
                return this;
            }

            /**
             * <p>The service test config.</p>
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
