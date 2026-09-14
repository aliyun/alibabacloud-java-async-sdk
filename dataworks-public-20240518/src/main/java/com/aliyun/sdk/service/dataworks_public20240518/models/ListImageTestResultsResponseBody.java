// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListImageTestResultsResponseBody} extends {@link TeaModel}
 *
 * <p>ListImageTestResultsResponseBody</p>
 */
public class ListImageTestResultsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListImageTestResultsResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImageTestResultsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
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
        private PagingInfo pagingInfo; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListImageTestResultsResponseBody model) {
            this.pagingInfo = model.pagingInfo;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListImageTestResultsResponseBody build() {
            return new ListImageTestResultsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListImageTestResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListImageTestResultsResponseBody</p>
     */
    public static class TestResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("OperateTime")
        private Long operateTime;

        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private String processId;

        @com.aliyun.core.annotation.NameInMap("PublishStage")
        private String publishStage;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private Long resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private TestResultList(Builder builder) {
            this.imageId = builder.imageId;
            this.message = builder.message;
            this.operateTime = builder.operateTime;
            this.processId = builder.processId;
            this.publishStage = builder.publishStage;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TestResultList create() {
            return builder().build();
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return operateTime
         */
        public Long getOperateTime() {
            return this.operateTime;
        }

        /**
         * @return processId
         */
        public String getProcessId() {
            return this.processId;
        }

        /**
         * @return publishStage
         */
        public String getPublishStage() {
            return this.publishStage;
        }

        /**
         * @return resourceGroupId
         */
        public Long getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String imageId; 
            private String message; 
            private Long operateTime; 
            private String processId; 
            private String publishStage; 
            private Long resourceGroupId; 
            private String status; 

            private Builder() {
            } 

            private Builder(TestResultList model) {
                this.imageId = model.imageId;
                this.message = model.message;
                this.operateTime = model.operateTime;
                this.processId = model.processId;
                this.publishStage = model.publishStage;
                this.resourceGroupId = model.resourceGroupId;
                this.status = model.status;
            } 

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>img_123456</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The test result message.</p>
             * 
             * <strong>example:</strong>
             * <p>test finished</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The operation time, represented as a 64-bit timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1727055811000</p>
             */
            public Builder operateTime(Long operateTime) {
                this.operateTime = operateTime;
                return this;
            }

            /**
             * <p>The process ID.</p>
             * 
             * <strong>example:</strong>
             * <p>11111111-1111-1111-1111-111111111111</p>
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * <p>The publish stage of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>UNPUBLISHED</p>
             */
            public Builder publishStage(String publishStage) {
                this.publishStage = publishStage;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder resourceGroupId(Long resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The status of the test process.</p>
             * 
             * <strong>example:</strong>
             * <p>completed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public TestResultList build() {
                return new TestResultList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListImageTestResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListImageTestResultsResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TestResultList")
        private java.util.List<TestResultList> testResultList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PagingInfo(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.testResultList = builder.testResultList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
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
         * @return testResultList
         */
        public java.util.List<TestResultList> getTestResultList() {
            return this.testResultList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List<TestResultList> testResultList; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PagingInfo model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.testResultList = model.testResultList;
                this.totalCount = model.totalCount;
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
             * <p>The list of image test results.</p>
             */
            public Builder testResultList(java.util.List<TestResultList> testResultList) {
                this.testResultList = testResultList;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
