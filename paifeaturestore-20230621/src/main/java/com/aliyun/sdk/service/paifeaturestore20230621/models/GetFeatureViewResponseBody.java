// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link GetFeatureViewResponseBody} extends {@link TeaModel}
 *
 * <p>GetFeatureViewResponseBody</p>
 */
public class GetFeatureViewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("FeatureEntityId")
    private String featureEntityId;

    @com.aliyun.core.annotation.NameInMap("FeatureEntityName")
    private String featureEntityName;

    @com.aliyun.core.annotation.NameInMap("Fields")
    private java.util.List<Fields> fields;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("GmtSyncTime")
    private String gmtSyncTime;

    @com.aliyun.core.annotation.NameInMap("JoinId")
    private String joinId;

    @com.aliyun.core.annotation.NameInMap("LastSyncConfig")
    private String lastSyncConfig;

    @com.aliyun.core.annotation.NameInMap("MockTableName")
    private String mockTableName;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("PublishTableScript")
    private String publishTableScript;

    @com.aliyun.core.annotation.NameInMap("RegisterDatasourceId")
    private String registerDatasourceId;

    @com.aliyun.core.annotation.NameInMap("RegisterDatasourceName")
    private String registerDatasourceName;

    @com.aliyun.core.annotation.NameInMap("RegisterTable")
    private String registerTable;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SyncOnlineTable")
    private Boolean syncOnlineTable;

    @com.aliyun.core.annotation.NameInMap("TTL")
    private Integer TTL;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<String> tags;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("WriteMethod")
    private String writeMethod;

    @com.aliyun.core.annotation.NameInMap("WriteToFeatureDB")
    private Boolean writeToFeatureDB;

    private GetFeatureViewResponseBody(Builder builder) {
        this.config = builder.config;
        this.featureEntityId = builder.featureEntityId;
        this.featureEntityName = builder.featureEntityName;
        this.fields = builder.fields;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.gmtSyncTime = builder.gmtSyncTime;
        this.joinId = builder.joinId;
        this.lastSyncConfig = builder.lastSyncConfig;
        this.mockTableName = builder.mockTableName;
        this.name = builder.name;
        this.owner = builder.owner;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.publishTableScript = builder.publishTableScript;
        this.registerDatasourceId = builder.registerDatasourceId;
        this.registerDatasourceName = builder.registerDatasourceName;
        this.registerTable = builder.registerTable;
        this.requestId = builder.requestId;
        this.syncOnlineTable = builder.syncOnlineTable;
        this.TTL = builder.TTL;
        this.tags = builder.tags;
        this.type = builder.type;
        this.writeMethod = builder.writeMethod;
        this.writeToFeatureDB = builder.writeToFeatureDB;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFeatureViewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return featureEntityId
     */
    public String getFeatureEntityId() {
        return this.featureEntityId;
    }

    /**
     * @return featureEntityName
     */
    public String getFeatureEntityName() {
        return this.featureEntityName;
    }

    /**
     * @return fields
     */
    public java.util.List<Fields> getFields() {
        return this.fields;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return gmtSyncTime
     */
    public String getGmtSyncTime() {
        return this.gmtSyncTime;
    }

    /**
     * @return joinId
     */
    public String getJoinId() {
        return this.joinId;
    }

    /**
     * @return lastSyncConfig
     */
    public String getLastSyncConfig() {
        return this.lastSyncConfig;
    }

    /**
     * @return mockTableName
     */
    public String getMockTableName() {
        return this.mockTableName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
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
     * @return publishTableScript
     */
    public String getPublishTableScript() {
        return this.publishTableScript;
    }

    /**
     * @return registerDatasourceId
     */
    public String getRegisterDatasourceId() {
        return this.registerDatasourceId;
    }

    /**
     * @return registerDatasourceName
     */
    public String getRegisterDatasourceName() {
        return this.registerDatasourceName;
    }

    /**
     * @return registerTable
     */
    public String getRegisterTable() {
        return this.registerTable;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return syncOnlineTable
     */
    public Boolean getSyncOnlineTable() {
        return this.syncOnlineTable;
    }

    /**
     * @return TTL
     */
    public Integer getTTL() {
        return this.TTL;
    }

    /**
     * @return tags
     */
    public java.util.List<String> getTags() {
        return this.tags;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return writeMethod
     */
    public String getWriteMethod() {
        return this.writeMethod;
    }

    /**
     * @return writeToFeatureDB
     */
    public Boolean getWriteToFeatureDB() {
        return this.writeToFeatureDB;
    }

    public static final class Builder {
        private String config; 
        private String featureEntityId; 
        private String featureEntityName; 
        private java.util.List<Fields> fields; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String gmtSyncTime; 
        private String joinId; 
        private String lastSyncConfig; 
        private String mockTableName; 
        private String name; 
        private String owner; 
        private String projectId; 
        private String projectName; 
        private String publishTableScript; 
        private String registerDatasourceId; 
        private String registerDatasourceName; 
        private String registerTable; 
        private String requestId; 
        private Boolean syncOnlineTable; 
        private Integer TTL; 
        private java.util.List<String> tags; 
        private String type; 
        private String writeMethod; 
        private Boolean writeToFeatureDB; 

        private Builder() {
        } 

        private Builder(GetFeatureViewResponseBody model) {
            this.config = model.config;
            this.featureEntityId = model.featureEntityId;
            this.featureEntityName = model.featureEntityName;
            this.fields = model.fields;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.gmtSyncTime = model.gmtSyncTime;
            this.joinId = model.joinId;
            this.lastSyncConfig = model.lastSyncConfig;
            this.mockTableName = model.mockTableName;
            this.name = model.name;
            this.owner = model.owner;
            this.projectId = model.projectId;
            this.projectName = model.projectName;
            this.publishTableScript = model.publishTableScript;
            this.registerDatasourceId = model.registerDatasourceId;
            this.registerDatasourceName = model.registerDatasourceName;
            this.registerTable = model.registerTable;
            this.requestId = model.requestId;
            this.syncOnlineTable = model.syncOnlineTable;
            this.TTL = model.TTL;
            this.tags = model.tags;
            this.type = model.type;
            this.writeMethod = model.writeMethod;
            this.writeToFeatureDB = model.writeToFeatureDB;
        } 

        /**
         * Config.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * FeatureEntityId.
         */
        public Builder featureEntityId(String featureEntityId) {
            this.featureEntityId = featureEntityId;
            return this;
        }

        /**
         * FeatureEntityName.
         */
        public Builder featureEntityName(String featureEntityName) {
            this.featureEntityName = featureEntityName;
            return this;
        }

        /**
         * Fields.
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * GmtSyncTime.
         */
        public Builder gmtSyncTime(String gmtSyncTime) {
            this.gmtSyncTime = gmtSyncTime;
            return this;
        }

        /**
         * JoinId.
         */
        public Builder joinId(String joinId) {
            this.joinId = joinId;
            return this;
        }

        /**
         * LastSyncConfig.
         */
        public Builder lastSyncConfig(String lastSyncConfig) {
            this.lastSyncConfig = lastSyncConfig;
            return this;
        }

        /**
         * MockTableName.
         */
        public Builder mockTableName(String mockTableName) {
            this.mockTableName = mockTableName;
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
         * Owner.
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * PublishTableScript.
         */
        public Builder publishTableScript(String publishTableScript) {
            this.publishTableScript = publishTableScript;
            return this;
        }

        /**
         * RegisterDatasourceId.
         */
        public Builder registerDatasourceId(String registerDatasourceId) {
            this.registerDatasourceId = registerDatasourceId;
            return this;
        }

        /**
         * RegisterDatasourceName.
         */
        public Builder registerDatasourceName(String registerDatasourceName) {
            this.registerDatasourceName = registerDatasourceName;
            return this;
        }

        /**
         * RegisterTable.
         */
        public Builder registerTable(String registerTable) {
            this.registerTable = registerTable;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SyncOnlineTable.
         */
        public Builder syncOnlineTable(Boolean syncOnlineTable) {
            this.syncOnlineTable = syncOnlineTable;
            return this;
        }

        /**
         * TTL.
         */
        public Builder TTL(Integer TTL) {
            this.TTL = TTL;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * WriteMethod.
         */
        public Builder writeMethod(String writeMethod) {
            this.writeMethod = writeMethod;
            return this;
        }

        /**
         * WriteToFeatureDB.
         */
        public Builder writeToFeatureDB(Boolean writeToFeatureDB) {
            this.writeToFeatureDB = writeToFeatureDB;
            return this;
        }

        public GetFeatureViewResponseBody build() {
            return new GetFeatureViewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFeatureViewResponseBody} extends {@link TeaModel}
     *
     * <p>GetFeatureViewResponseBody</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Input(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Input model) {
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFeatureViewResponseBody} extends {@link TeaModel}
     *
     * <p>GetFeatureViewResponseBody</p>
     */
    public static class Transform extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Input")
        private java.util.List<Input> input;

        @com.aliyun.core.annotation.NameInMap("LLMConfigId")
        private Integer LLMConfigId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Transform(Builder builder) {
            this.input = builder.input;
            this.LLMConfigId = builder.LLMConfigId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Transform create() {
            return builder().build();
        }

        /**
         * @return input
         */
        public java.util.List<Input> getInput() {
            return this.input;
        }

        /**
         * @return LLMConfigId
         */
        public Integer getLLMConfigId() {
            return this.LLMConfigId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<Input> input; 
            private Integer LLMConfigId; 
            private String type; 

            private Builder() {
            } 

            private Builder(Transform model) {
                this.input = model.input;
                this.LLMConfigId = model.LLMConfigId;
                this.type = model.type;
            } 

            /**
             * Input.
             */
            public Builder input(java.util.List<Input> input) {
                this.input = input;
                return this;
            }

            /**
             * LLMConfigId.
             */
            public Builder LLMConfigId(Integer LLMConfigId) {
                this.LLMConfigId = LLMConfigId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Transform build() {
                return new Transform(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFeatureViewResponseBody} extends {@link TeaModel}
     *
     * <p>GetFeatureViewResponseBody</p>
     */
    public static class Fields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        private java.util.List<String> attributes;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Transform")
        private Transform transform;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Fields(Builder builder) {
            this.attributes = builder.attributes;
            this.name = builder.name;
            this.transform = builder.transform;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fields create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public java.util.List<String> getAttributes() {
            return this.attributes;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return transform
         */
        public Transform getTransform() {
            return this.transform;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<String> attributes; 
            private String name; 
            private Transform transform; 
            private String type; 

            private Builder() {
            } 

            private Builder(Fields model) {
                this.attributes = model.attributes;
                this.name = model.name;
                this.transform = model.transform;
                this.type = model.type;
            } 

            /**
             * Attributes.
             */
            public Builder attributes(java.util.List<String> attributes) {
                this.attributes = attributes;
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
             * Transform.
             */
            public Builder transform(Transform transform) {
                this.transform = transform;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Fields build() {
                return new Fields(this);
            } 

        } 

    }
}
