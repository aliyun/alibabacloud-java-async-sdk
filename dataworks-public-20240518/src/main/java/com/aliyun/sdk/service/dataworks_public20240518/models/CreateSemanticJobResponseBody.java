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
 * {@link CreateSemanticJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSemanticJobResponseBody</p>
 */
public class CreateSemanticJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateSemanticJobResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSemanticJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateSemanticJobResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The saved semantic task definition. Use <code>Data.Name</code> to call RunSemanticJob, DeleteSemanticJob, ListSemanticJobRuns, and DownloadSemanticResults.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID. You can use this ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>676271D6-53B4-57BE-89FA-72F7AE1418DF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateSemanticJobResponseBody build() {
            return new CreateSemanticJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateSemanticJobResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSemanticJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("ReferenceFileIds")
        private java.util.List<String> referenceFileIds;

        @com.aliyun.core.annotation.NameInMap("ReferenceFileUris")
        private java.util.List<String> referenceFileUris;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Source")
        private java.util.Map<String, ?> source;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Data(Builder builder) {
            this.creator = builder.creator;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.name = builder.name;
            this.projectId = builder.projectId;
            this.referenceFileIds = builder.referenceFileIds;
            this.referenceFileUris = builder.referenceFileUris;
            this.resourceGroupId = builder.resourceGroupId;
            this.source = builder.source;
            this.type = builder.type;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return referenceFileIds
         */
        public java.util.List<String> getReferenceFileIds() {
            return this.referenceFileIds;
        }

        /**
         * @return referenceFileUris
         */
        public java.util.List<String> getReferenceFileUris() {
            return this.referenceFileUris;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return source
         */
        public java.util.Map<String, ?> getSource() {
            return this.source;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String creator; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private String name; 
            private Long projectId; 
            private java.util.List<String> referenceFileIds; 
            private java.util.List<String> referenceFileUris; 
            private String resourceGroupId; 
            private java.util.Map<String, ?> source; 
            private String type; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.creator = model.creator;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.name = model.name;
                this.projectId = model.projectId;
                this.referenceFileIds = model.referenceFileIds;
                this.referenceFileUris = model.referenceFileUris;
                this.resourceGroupId = model.resourceGroupId;
                this.source = model.source;
                this.type = model.type;
                this.userId = model.userId;
            } 

            /**
             * <p>The identifier of the task creator, which has the same value as <code>UserId</code> and identifies who created the task.</p>
             * 
             * <strong>example:</strong>
             * <p>user-demo</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The time when the task definition was created. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1700000000000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the task definition was last modified. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1700000000000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The internal unique ID of the task definition, which is used to identify the created task.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The saved task name. This value is used for subsequent operations such as running, deleting, querying run records, and downloading results.</p>
             * 
             * <strong>example:</strong>
             * <p>semantic-job-demo</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the DataWorks workspace to which the task belongs. This ID is used as the <code>ProjectId</code> for GetSemanticJobDetail, GetSemanticJobLog, and KillSemanticJob.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The list of IDs of associated uploaded files. If the source type is <code>singleTableFile</code>, the task reads the only file in the list at runtime.</p>
             */
            public Builder referenceFileIds(java.util.List<String> referenceFileIds) {
                this.referenceFileIds = referenceFileIds;
                return this;
            }

            /**
             * <p>The list of URIs of associated external reference files. If the source type is <code>singleTableFile</code>, the task reads the only file in the list at runtime.</p>
             */
            public Builder referenceFileUris(java.util.List<String> referenceFileUris) {
                this.referenceFileUris = referenceFileUris;
                return this;
            }

            /**
             * <p>The identifier of the resource group to be used when running this task.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-demo</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The saved input data source configuration, which corresponds to <code>Source</code> in the creation request. The data scope to be analyzed is selected based on this config during runtime.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;maxcompute&quot;,&quot;domain&quot;:&quot;sales&quot;,&quot;pinnedScopeInfo&quot;:[{&quot;type&quot;:&quot;project&quot;,&quot;name&quot;:&quot;mc_project&quot;}]}</p>
             */
            public Builder source(java.util.Map<String, ?> source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The saved <code>Source.type</code> data source type, which is used to quickly identify the task input type.</p>
             * 
             * <strong>example:</strong>
             * <p>maxcompute</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The identifier of the user who created the task.</p>
             * 
             * <strong>example:</strong>
             * <p>user-demo</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
