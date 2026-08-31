// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetKgAuthorizedWorkspacesResponseBody} extends {@link TeaModel}
 *
 * <p>GetKgAuthorizedWorkspacesResponseBody</p>
 */
public class GetKgAuthorizedWorkspacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetKgAuthorizedWorkspacesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKgAuthorizedWorkspacesResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetKgAuthorizedWorkspacesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetKgAuthorizedWorkspacesResponseBody build() {
            return new GetKgAuthorizedWorkspacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetKgAuthorizedWorkspacesResponseBody} extends {@link TeaModel}
     *
     * <p>GetKgAuthorizedWorkspacesResponseBody</p>
     */
    public static class RoleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private RoleList(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String name; 

            private Builder() {
            } 

            private Builder(RoleList model) {
                this.code = model.code;
                this.name = model.name;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public RoleList build() {
                return new RoleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKgAuthorizedWorkspacesResponseBody} extends {@link TeaModel}
     *
     * <p>GetKgAuthorizedWorkspacesResponseBody</p>
     */
    public static class WorkspaceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("LastPublishTime")
        private String lastPublishTime;

        @com.aliyun.core.annotation.NameInMap("LastPublishVersion")
        private Integer lastPublishVersion;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RoleList")
        private java.util.List<RoleList> roleList;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private WorkspaceList(Builder builder) {
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.lastPublishTime = builder.lastPublishTime;
            this.lastPublishVersion = builder.lastPublishVersion;
            this.name = builder.name;
            this.roleList = builder.roleList;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkspaceList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return lastPublishTime
         */
        public String getLastPublishTime() {
            return this.lastPublishTime;
        }

        /**
         * @return lastPublishVersion
         */
        public Integer getLastPublishVersion() {
            return this.lastPublishVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return roleList
         */
        public java.util.List<RoleList> getRoleList() {
            return this.roleList;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String description; 
            private String gmtCreate; 
            private String lastPublishTime; 
            private Integer lastPublishVersion; 
            private String name; 
            private java.util.List<RoleList> roleList; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(WorkspaceList model) {
                this.description = model.description;
                this.gmtCreate = model.gmtCreate;
                this.lastPublishTime = model.lastPublishTime;
                this.lastPublishVersion = model.lastPublishVersion;
                this.name = model.name;
                this.roleList = model.roleList;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * LastPublishTime.
             */
            public Builder lastPublishTime(String lastPublishTime) {
                this.lastPublishTime = lastPublishTime;
                return this;
            }

            /**
             * LastPublishVersion.
             */
            public Builder lastPublishVersion(Integer lastPublishVersion) {
                this.lastPublishVersion = lastPublishVersion;
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
             * RoleList.
             */
            public Builder roleList(java.util.List<RoleList> roleList) {
                this.roleList = roleList;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public WorkspaceList build() {
                return new WorkspaceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKgAuthorizedWorkspacesResponseBody} extends {@link TeaModel}
     *
     * <p>GetKgAuthorizedWorkspacesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("WorkspaceList")
        private java.util.List<WorkspaceList> workspaceList;

        private Data(Builder builder) {
            this.totalCount = builder.totalCount;
            this.workspaceList = builder.workspaceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return workspaceList
         */
        public java.util.List<WorkspaceList> getWorkspaceList() {
            return this.workspaceList;
        }

        public static final class Builder {
            private Integer totalCount; 
            private java.util.List<WorkspaceList> workspaceList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.totalCount = model.totalCount;
                this.workspaceList = model.workspaceList;
            } 

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * WorkspaceList.
             */
            public Builder workspaceList(java.util.List<WorkspaceList> workspaceList) {
                this.workspaceList = workspaceList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
