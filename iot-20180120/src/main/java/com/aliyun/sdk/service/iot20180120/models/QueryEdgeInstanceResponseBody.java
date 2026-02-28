// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryEdgeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEdgeInstanceResponseBody</p>
 */
public class QueryEdgeInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryEdgeInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEdgeInstanceResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryEdgeInstanceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error message returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>request parameter error</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. true: indicates that the call was successful. false: indicates that the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>199BBC5D-FC99-46CB-88E2-FB98E92446FA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The data returned if the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryEdgeInstanceResponseBody build() {
            return new QueryEdgeInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryEdgeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEdgeInstanceResponseBody</p>
     */
    public static class InstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizEnable")
        private Boolean bizEnable;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTimestamp")
        private Long gmtCreateTimestamp;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTimestamp")
        private Long gmtModifiedTimestamp;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LatestDeploymentStatus")
        private Integer latestDeploymentStatus;

        @com.aliyun.core.annotation.NameInMap("LatestDeploymentType")
        private String latestDeploymentType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
        private String roleArn;

        @com.aliyun.core.annotation.NameInMap("RoleAttachTime")
        private String roleAttachTime;

        @com.aliyun.core.annotation.NameInMap("RoleAttachTimestamp")
        private Long roleAttachTimestamp;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private Integer spec;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private InstanceList(Builder builder) {
            this.bizEnable = builder.bizEnable;
            this.gmtCreate = builder.gmtCreate;
            this.gmtCreateTimestamp = builder.gmtCreateTimestamp;
            this.gmtModified = builder.gmtModified;
            this.gmtModifiedTimestamp = builder.gmtModifiedTimestamp;
            this.instanceId = builder.instanceId;
            this.latestDeploymentStatus = builder.latestDeploymentStatus;
            this.latestDeploymentType = builder.latestDeploymentType;
            this.name = builder.name;
            this.roleArn = builder.roleArn;
            this.roleAttachTime = builder.roleAttachTime;
            this.roleAttachTimestamp = builder.roleAttachTimestamp;
            this.roleName = builder.roleName;
            this.spec = builder.spec;
            this.tags = builder.tags;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceList create() {
            return builder().build();
        }

        /**
         * @return bizEnable
         */
        public Boolean getBizEnable() {
            return this.bizEnable;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtCreateTimestamp
         */
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return gmtModifiedTimestamp
         */
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return latestDeploymentStatus
         */
        public Integer getLatestDeploymentStatus() {
            return this.latestDeploymentStatus;
        }

        /**
         * @return latestDeploymentType
         */
        public String getLatestDeploymentType() {
            return this.latestDeploymentType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return roleAttachTime
         */
        public String getRoleAttachTime() {
            return this.roleAttachTime;
        }

        /**
         * @return roleAttachTimestamp
         */
        public Long getRoleAttachTimestamp() {
            return this.roleAttachTimestamp;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return spec
         */
        public Integer getSpec() {
            return this.spec;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean bizEnable; 
            private String gmtCreate; 
            private Long gmtCreateTimestamp; 
            private String gmtModified; 
            private Long gmtModifiedTimestamp; 
            private String instanceId; 
            private Integer latestDeploymentStatus; 
            private String latestDeploymentType; 
            private String name; 
            private String roleArn; 
            private String roleAttachTime; 
            private Long roleAttachTimestamp; 
            private String roleName; 
            private Integer spec; 
            private String tags; 
            private Integer type; 

            private Builder() {
            } 

            private Builder(InstanceList model) {
                this.bizEnable = model.bizEnable;
                this.gmtCreate = model.gmtCreate;
                this.gmtCreateTimestamp = model.gmtCreateTimestamp;
                this.gmtModified = model.gmtModified;
                this.gmtModifiedTimestamp = model.gmtModifiedTimestamp;
                this.instanceId = model.instanceId;
                this.latestDeploymentStatus = model.latestDeploymentStatus;
                this.latestDeploymentType = model.latestDeploymentType;
                this.name = model.name;
                this.roleArn = model.roleArn;
                this.roleAttachTime = model.roleAttachTime;
                this.roleAttachTimestamp = model.roleAttachTimestamp;
                this.roleName = model.roleName;
                this.spec = model.spec;
                this.tags = model.tags;
                this.type = model.type;
            } 

            /**
             * <p>The time when the edge instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder bizEnable(Boolean bizEnable) {
                this.bizEnable = bizEnable;
                return this;
            }

            /**
             * <p>The name of the edge instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-07-17 14:34:28</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtCreateTimestamp.
             */
            public Builder gmtCreateTimestamp(Long gmtCreateTimestamp) {
                this.gmtCreateTimestamp = gmtCreateTimestamp;
                return this;
            }

            /**
             * <p>The type of the latest deployment task.</p>
             * <ul>
             * <li>deploy: deploys the edge instance.</li>
             * <li>Reset: resets the edge instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2019-07-17 14:51:38</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * GmtModifiedTimestamp.
             */
            public Builder gmtModifiedTimestamp(Long gmtModifiedTimestamp) {
                this.gmtModifiedTimestamp = gmtModifiedTimestamp;
                return this;
            }

            /**
             * <p>The name of the RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>9iqyQAKDb2aYGVKa****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Indicates whether the edge instance was enabled.</p>
             * <ul>
             * <li>true: enabled</li>
             * <li>false: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder latestDeploymentStatus(Integer latestDeploymentStatus) {
                this.latestDeploymentStatus = latestDeploymentStatus;
                return this;
            }

            /**
             * <p>The status of the latest deployment task.</p>
             * <ul>
             * <li>0: The task has not started.</li>
             * <li>1: The task is being processed.</li>
             * <li>2: The task was successful.</li>
             * <li>3: The task failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>deploy</p>
             */
            public Builder latestDeploymentType(String latestDeploymentType) {
                this.latestDeploymentType = latestDeploymentType;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The time when the RAM role was attached to IoT Platform.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::1473922805******:role/aliyuniotaccessingfcrole</p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * <p>The specification of the edge instance.</p>
             * <ul>
             * <li>10: Lite Edition.</li>
             * <li>20: Standard Edition.</li>
             * <li>30: Pro Edition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2020-02-19 11:25:48</p>
             */
            public Builder roleAttachTime(String roleAttachTime) {
                this.roleAttachTime = roleAttachTime;
                return this;
            }

            /**
             * RoleAttachTimestamp.
             */
            public Builder roleAttachTimestamp(Long roleAttachTimestamp) {
                this.roleAttachTimestamp = roleAttachTimestamp;
                return this;
            }

            /**
             * <p>The time when the edge instance was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunIOTAccessingFCRole</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>The tags of the edge instance.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder spec(Integer spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The ID of the edge instance.</p>
             * 
             * <strong>example:</strong>
             * <p>k1:v1,k2:v2</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryEdgeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEdgeInstanceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("InstanceList")
        private java.util.List<InstanceList> instanceList;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.instanceList = builder.instanceList;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return instanceList
         */
        public java.util.List<InstanceList> getInstanceList() {
            return this.instanceList;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer currentPage; 
            private java.util.List<InstanceList> instanceList; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.instanceList = model.instanceList;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>Indicates whether you own the edge instance or you are authorized to use the edge instance.</p>
             * <ul>
             * <li>0: You own the edge instance.</li>
             * <li>1: You are authorized to use the edge instance.</li>
             * </ul>
             */
            public Builder instanceList(java.util.List<InstanceList> instanceList) {
                this.instanceList = instanceList;
                return this;
            }

            /**
             * <p>The number of edge instances.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>A list of edge instances.</p>
             * 
             * <strong>example:</strong>
             * <p>201</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
