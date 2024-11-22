// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCustomScenePoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomScenePoliciesResponseBody</p>
 */
public class DescribeCustomScenePoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataModule")
    private java.util.List < DataModule> dataModule;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("Quota")
    private Integer quota;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCustomScenePoliciesResponseBody(Builder builder) {
        this.dataModule = builder.dataModule;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.quota = builder.quota;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomScenePoliciesResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataModule
     */
    public java.util.List < DataModule> getDataModule() {
        return this.dataModule;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return quota
     */
    public Integer getQuota() {
        return this.quota;
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
        private java.util.List < DataModule> dataModule; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer quota; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The scenario-specific policies.</p>
         */
        public Builder dataModule(java.util.List < DataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The policy quota.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder quota(Integer quota) {
            this.quota = quota;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>85H66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCustomScenePoliciesResponseBody build() {
            return new DescribeCustomScenePoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCustomScenePoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomScenePoliciesResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Objects")
        private java.util.List < String > objects;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private Long policyId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        private DataModule(Builder builder) {
            this.endTime = builder.endTime;
            this.name = builder.name;
            this.objects = builder.objects;
            this.policyId = builder.policyId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.template = builder.template;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return objects
         */
        public java.util.List < String > getObjects() {
            return this.objects;
        }

        /**
         * @return policyId
         */
        public Long getPolicyId() {
            return this.policyId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        public static final class Builder {
            private String endTime; 
            private String name; 
            private java.util.List < String > objects; 
            private Long policyId; 
            private String startTime; 
            private String status; 
            private String template; 

            /**
             * <p>The time when the policy expires.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-06T16:00:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The name of the scenario-specific policy.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The IDs of websites that are associated with the policy.</p>
             */
            public Builder objects(java.util.List < String > objects) {
                this.objects = objects;
                return this;
            }

            /**
             * <p>The policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234****</p>
             */
            public Builder policyId(Long policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The time when the policy takes effect.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-04T16:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the policy. Valid values:</p>
             * <ul>
             * <li><strong>Disabled</strong></li>
             * <li><strong>Pending</strong></li>
             * <li><strong>Running</strong></li>
             * <li><strong>Expired</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Expired</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the policy template. Valid value:</p>
             * <ul>
             * <li><strong>promotion</strong>: major events.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>promotion</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            public DataModule build() {
                return new DataModule(this);
            } 

        } 

    }
}
