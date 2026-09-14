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
 * {@link ListProcessDefinitionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProcessDefinitionsResponseBody</p>
 */
public class ListProcessDefinitionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListProcessDefinitionsResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProcessDefinitionsResponseBody create() {
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

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListProcessDefinitionsResponseBody model) {
            this.pagingInfo = model.pagingInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc5df3a17***903790e8e8a</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProcessDefinitionsResponseBody build() {
            return new ListProcessDefinitionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProcessDefinitionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProcessDefinitionsResponseBody</p>
     */
    public static class ProcessDefinitions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IsSystem")
        private Boolean isSystem;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("Scopes")
        private java.util.List<String> scopes;

        @com.aliyun.core.annotation.NameInMap("SubType")
        private String subType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ProcessDefinitions(Builder builder) {
            this.description = builder.description;
            this.enabled = builder.enabled;
            this.id = builder.id;
            this.isSystem = builder.isSystem;
            this.name = builder.name;
            this.priority = builder.priority;
            this.scopes = builder.scopes;
            this.subType = builder.subType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessDefinitions create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isSystem
         */
        public Boolean getIsSystem() {
            return this.isSystem;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return scopes
         */
        public java.util.List<String> getScopes() {
            return this.scopes;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private Boolean enabled; 
            private String id; 
            private Boolean isSystem; 
            private String name; 
            private String priority; 
            private java.util.List<String> scopes; 
            private String subType; 
            private String type; 

            private Builder() {
            } 

            private Builder(ProcessDefinitions model) {
                this.description = model.description;
                this.enabled = model.enabled;
                this.id = model.id;
                this.isSystem = model.isSystem;
                this.name = model.name;
                this.priority = model.priority;
                this.scopes = model.scopes;
                this.subType = model.subType;
                this.type = model.type;
            } 

            /**
             * <p>The description of the process definition.</p>
             * 
             * <strong>example:</strong>
             * <p>lwt_ide_simple 项目 MaxCompute 表审批策略</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the process definition is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The ID of the process definition.</p>
             * 
             * <strong>example:</strong>
             * <p>10354346</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether this is a default system policy. System policies have restricted update capabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isSystem(Boolean isSystem) {
                this.isSystem = isSystem;
                return this;
            }

            /**
             * <p>The name of the process definition.</p>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute 表审批</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The priority. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The phases in which the rule is effective. Valid values:</p>
             * <ul>
             * <li><p><code>Deployment</code>: The policy is checked when an application is submitted.</p>
             * </li>
             * <li><p><code>Running</code>: The policy is checked during process execution to determine if approval can be skipped. (Supported only for the MaxCompute type)</p>
             * </li>
             * </ul>
             */
            public Builder scopes(java.util.List<String> scopes) {
                this.scopes = scopes;
                return this;
            }

            /**
             * <p>The subtype. Valid values:</p>
             * <ul>
             * <li><p>Table</p>
             * </li>
             * <li><p>Column</p>
             * </li>
             * <li><p>Database</p>
             * </li>
             * <li><p>Schema</p>
             * </li>
             * <li><p>Default</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Table</p>
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * <p>The type of the process definition. Valid values:</p>
             * <ul>
             * <li><p>MaxCompute</p>
             * </li>
             * <li><p>DataService</p>
             * </li>
             * <li><p>Extension</p>
             * </li>
             * <li><p>Hologres</p>
             * </li>
             * <li><p>DlfV1 (You cannot create custom definitions for this type.)</p>
             * </li>
             * <li><p>EMR (You cannot create custom definitions for this type.)</p>
             * </li>
             * <li><p>DataAssetGovernance (You cannot create custom definitions for this type.)</p>
             * </li>
             * <li><p>Lindorm (You cannot create custom definitions for this type.)</p>
             * </li>
             * <li><p>StarRocks (You cannot create custom definitions for this type.)</p>
             * </li>
             * <li><p>DlfNext (You cannot create custom definitions for this type.)</p>
             * </li>
             * <li><p>DataWorks (You cannot create custom definitions for this type.)</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ProcessDefinitions build() {
                return new ProcessDefinitions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProcessDefinitionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProcessDefinitionsResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProcessDefinitions")
        private java.util.List<ProcessDefinitions> processDefinitions;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PagingInfo(Builder builder) {
            this.processDefinitions = builder.processDefinitions;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return processDefinitions
         */
        public java.util.List<ProcessDefinitions> getProcessDefinitions() {
            return this.processDefinitions;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<ProcessDefinitions> processDefinitions; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PagingInfo model) {
                this.processDefinitions = model.processDefinitions;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>A list of process definitions. For more information, see the <code>ProcessDefinition</code> object.</p>
             */
            public Builder processDefinitions(java.util.List<ProcessDefinitions> processDefinitions) {
                this.processDefinitions = processDefinitions;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
