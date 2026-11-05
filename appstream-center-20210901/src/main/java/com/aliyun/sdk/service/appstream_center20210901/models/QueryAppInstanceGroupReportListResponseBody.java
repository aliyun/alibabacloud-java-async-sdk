// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link QueryAppInstanceGroupReportListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAppInstanceGroupReportListResponseBody</p>
 */
public class QueryAppInstanceGroupReportListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IndexData")
    private java.util.List<IndexData> indexData;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryAppInstanceGroupReportListResponseBody(Builder builder) {
        this.code = builder.code;
        this.indexData = builder.indexData;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAppInstanceGroupReportListResponseBody create() {
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
     * @return indexData
     */
    public java.util.List<IndexData> getIndexData() {
        return this.indexData;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<IndexData> indexData; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryAppInstanceGroupReportListResponseBody model) {
            this.code = model.code;
            this.indexData = model.indexData;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The business status code. A value of <code>200</code> indicates that the request is processed. Other values indicate that the processing failed.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of app instance group report data.</p>
         */
        public Builder indexData(java.util.List<IndexData> indexData) {
            this.indexData = indexData;
            return this;
        }

        /**
         * <p>The description of the request processing result. If the request is successful, <code>success</code> is usually returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number corresponding to the current response.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page used in the current response.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The unique identifier of the current request, which can be used to troubleshoot request issues.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryAppInstanceGroupReportListResponseBody build() {
            return new QueryAppInstanceGroupReportListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAppInstanceGroupReportListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAppInstanceGroupReportListResponseBody</p>
     */
    public static class IndexData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
        private String appInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupName")
        private String appInstanceGroupName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private IndexData(Builder builder) {
            this.appInstanceGroupId = builder.appInstanceGroupId;
            this.appInstanceGroupName = builder.appInstanceGroupName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IndexData create() {
            return builder().build();
        }

        /**
         * @return appInstanceGroupId
         */
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        /**
         * @return appInstanceGroupName
         */
        public String getAppInstanceGroupName() {
            return this.appInstanceGroupName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String appInstanceGroupId; 
            private String appInstanceGroupName; 
            private String status; 

            private Builder() {
            } 

            private Builder(IndexData model) {
                this.appInstanceGroupId = model.appInstanceGroupId;
                this.appInstanceGroupName = model.appInstanceGroupName;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the app instance group.</p>
             * 
             * <strong>example:</strong>
             * <p>aig-9ciijz60n4xsv****</p>
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * <p>The name of the app instance group.</p>
             * 
             * <strong>example:</strong>
             * <p>R&amp;D workstation group</p>
             */
            public Builder appInstanceGroupName(String appInstanceGroupName) {
                this.appInstanceGroupName = appInstanceGroupName;
                return this;
            }

            /**
             * <p>The current status of the app instance group.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><code>DEPLOYING</code>: Deploying.</li>
             * <li><code>DEPLOYED</code>: Deployed but not published.</li>
             * <li><code>PUBLISHED</code>: Published and available to provide services based on the current configurations.</li>
             * <li><code>STOPPING</code>: Stopping.</li>
             * <li><code>STOPPED</code>: Stopped.</li>
             * <li><code>MAINTAINING</code>: Maintaining.</li>
             * <li><code>FAILED</code>: Deployment or running failed.</li>
             * <li><code>MAINTAIN_FAILED</code>: Maintenance failed.</li>
             * <li><code>DELETING</code>: Deleting.</li>
             * <li><code>DELETED</code>: Deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PUBLISHED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public IndexData build() {
                return new IndexData(this);
            } 

        } 

    }
}
