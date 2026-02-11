// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20250521.models;

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
 * {@link DescribeModelingProjectListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeModelingProjectListResponseBody</p>
 */
public class DescribeModelingProjectListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private java.util.List<ResultObject> resultObject;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalItem")
    private Long totalItem;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Long totalPage;

    private DescribeModelingProjectListResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
        this.success = builder.success;
        this.totalItem = builder.totalItem;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModelingProjectListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public java.util.List<ResultObject> getResultObject() {
        return this.resultObject;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalItem
     */
    public Long getTotalItem() {
        return this.totalItem;
    }

    /**
     * @return totalPage
     */
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private Long code; 
        private Long currentPage; 
        private Long pageSize; 
        private String requestId; 
        private java.util.List<ResultObject> resultObject; 
        private Boolean success; 
        private Long totalItem; 
        private Long totalPage; 

        private Builder() {
        } 

        private Builder(DescribeModelingProjectListResponseBody model) {
            this.code = model.code;
            this.currentPage = model.currentPage;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
            this.success = model.success;
            this.totalItem = model.totalItem;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>Status code. A return value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Pagination parameter: number of items per page, with a default value of 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4A91D2D1-AEC9-1658-ABCE-5A39DE66A5C2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned result.</p>
         */
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: Call succeeded.</li>
         * <li><strong>false</strong>: Call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalItem(Long totalItem) {
            this.totalItem = totalItem;
            return this;
        }

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeModelingProjectListResponseBody build() {
            return new DescribeModelingProjectListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeModelingProjectListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModelingProjectListResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("EnvStatus")
        private String envStatus;

        @com.aliyun.core.annotation.NameInMap("LoginAccount")
        private String loginAccount;

        @com.aliyun.core.annotation.NameInMap("ModelingStatus")
        private String modelingStatus;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private ResultObject(Builder builder) {
            this.endTime = builder.endTime;
            this.envStatus = builder.envStatus;
            this.loginAccount = builder.loginAccount;
            this.modelingStatus = builder.modelingStatus;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return envStatus
         */
        public String getEnvStatus() {
            return this.envStatus;
        }

        /**
         * @return loginAccount
         */
        public String getLoginAccount() {
            return this.loginAccount;
        }

        /**
         * @return modelingStatus
         */
        public String getModelingStatus() {
            return this.modelingStatus;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long endTime; 
            private String envStatus; 
            private String loginAccount; 
            private String modelingStatus; 
            private String projectId; 
            private String projectName; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.endTime = model.endTime;
                this.envStatus = model.envStatus;
                this.loginAccount = model.loginAccount;
                this.modelingStatus = model.modelingStatus;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.startTime = model.startTime;
            } 

            /**
             * <p>End time of the secure modeling project.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-29T02:15:10Z</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Secure environment status.</p>
             * 
             * <strong>example:</strong>
             * <p>PREPARING</p>
             */
            public Builder envStatus(String envStatus) {
                this.envStatus = envStatus;
                return this;
            }

            /**
             * <p>Login account.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder loginAccount(String loginAccount) {
                this.loginAccount = loginAccount;
                return this;
            }

            /**
             * <p>Modeling project status.</p>
             * 
             * <strong>example:</strong>
             * <p>PREPARING</p>
             */
            public Builder modelingStatus(String modelingStatus) {
                this.modelingStatus = modelingStatus;
                return this;
            }

            /**
             * <p>Project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>01</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>Project name.</p>
             * 
             * <strong>example:</strong>
             * <p>project</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>Start time of the secure modeling project.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-23T01:20:00Z</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
