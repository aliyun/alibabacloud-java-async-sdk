// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataArchiveOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateDataArchiveOrderRequest</p>
 */
public class CreateDataArchiveOrderRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Comment")
    @Validation(required = true)
    private String comment;

    @Query
    @NameInMap("Param")
    @Validation(required = true)
    private Param param;

    @Query
    @NameInMap("ParentId")
    private Long parentId;

    @Query
    @NameInMap("PluginType")
    private String pluginType;

    @Query
    @NameInMap("RelatedUserList")
    private java.util.List < String > relatedUserList;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private CreateDataArchiveOrderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.comment = builder.comment;
        this.param = builder.param;
        this.parentId = builder.parentId;
        this.pluginType = builder.pluginType;
        this.relatedUserList = builder.relatedUserList;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataArchiveOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return param
     */
    public Param getParam() {
        return this.param;
    }

    /**
     * @return parentId
     */
    public Long getParentId() {
        return this.parentId;
    }

    /**
     * @return pluginType
     */
    public String getPluginType() {
        return this.pluginType;
    }

    /**
     * @return relatedUserList
     */
    public java.util.List < String > getRelatedUserList() {
        return this.relatedUserList;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<CreateDataArchiveOrderRequest, Builder> {
        private String regionId; 
        private String comment; 
        private Param param; 
        private Long parentId; 
        private String pluginType; 
        private java.util.List < String > relatedUserList; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataArchiveOrderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.comment = request.comment;
            this.param = request.param;
            this.parentId = request.parentId;
            this.pluginType = request.pluginType;
            this.relatedUserList = request.relatedUserList;
            this.tid = request.tid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * Param.
         */
        public Builder param(Param param) {
            String paramShrink = shrink(param, "Param", "json");
            this.putQueryParameter("Param", paramShrink);
            this.param = param;
            return this;
        }

        /**
         * ParentId.
         */
        public Builder parentId(Long parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * PluginType.
         */
        public Builder pluginType(String pluginType) {
            this.putQueryParameter("PluginType", pluginType);
            this.pluginType = pluginType;
            return this;
        }

        /**
         * RelatedUserList.
         */
        public Builder relatedUserList(java.util.List < String > relatedUserList) {
            String relatedUserListShrink = shrink(relatedUserList, "RelatedUserList", "json");
            this.putQueryParameter("RelatedUserList", relatedUserListShrink);
            this.relatedUserList = relatedUserList;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public CreateDataArchiveOrderRequest build() {
            return new CreateDataArchiveOrderRequest(this);
        } 

    } 

    public static class TableIncludes extends TeaModel {
        @NameInMap("TableName")
        @Validation(required = true)
        private String tableName;

        @NameInMap("TableWhere")
        private String tableWhere;

        private TableIncludes(Builder builder) {
            this.tableName = builder.tableName;
            this.tableWhere = builder.tableWhere;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableIncludes create() {
            return builder().build();
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return tableWhere
         */
        public String getTableWhere() {
            return this.tableWhere;
        }

        public static final class Builder {
            private String tableName; 
            private String tableWhere; 

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * TableWhere.
             */
            public Builder tableWhere(String tableWhere) {
                this.tableWhere = tableWhere;
                return this;
            }

            public TableIncludes build() {
                return new TableIncludes(this);
            } 

        } 

    }
    public static class Variables extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Pattern")
        private String pattern;

        private Variables(Builder builder) {
            this.name = builder.name;
            this.pattern = builder.pattern;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Variables create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pattern
         */
        public String getPattern() {
            return this.pattern;
        }

        public static final class Builder {
            private String name; 
            private String pattern; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Pattern.
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            public Variables build() {
                return new Variables(this);
            } 

        } 

    }
    public static class Param extends TeaModel {
        @NameInMap("ArchiveMethod")
        @Validation(required = true)
        private String archiveMethod;

        @NameInMap("CronStr")
        private String cronStr;

        @NameInMap("Logic")
        private Boolean logic;

        @NameInMap("OrderAfter")
        private java.util.List < String > orderAfter;

        @NameInMap("RunMethod")
        @Validation(required = true)
        private String runMethod;

        @NameInMap("SourceCatalogName")
        @Validation(required = true)
        private String sourceCatalogName;

        @NameInMap("SourceInstanceName")
        @Validation(required = true)
        private String sourceInstanceName;

        @NameInMap("SourceSchemaName")
        @Validation(required = true)
        private String sourceSchemaName;

        @NameInMap("TableIncludes")
        @Validation(required = true)
        private java.util.List < TableIncludes> tableIncludes;

        @NameInMap("TableMapping")
        private java.util.List < String > tableMapping;

        @NameInMap("TargetInstanceHost")
        @Validation(required = true)
        private String targetInstanceHost;

        @NameInMap("Variables")
        private java.util.List < Variables> variables;

        private Param(Builder builder) {
            this.archiveMethod = builder.archiveMethod;
            this.cronStr = builder.cronStr;
            this.logic = builder.logic;
            this.orderAfter = builder.orderAfter;
            this.runMethod = builder.runMethod;
            this.sourceCatalogName = builder.sourceCatalogName;
            this.sourceInstanceName = builder.sourceInstanceName;
            this.sourceSchemaName = builder.sourceSchemaName;
            this.tableIncludes = builder.tableIncludes;
            this.tableMapping = builder.tableMapping;
            this.targetInstanceHost = builder.targetInstanceHost;
            this.variables = builder.variables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Param create() {
            return builder().build();
        }

        /**
         * @return archiveMethod
         */
        public String getArchiveMethod() {
            return this.archiveMethod;
        }

        /**
         * @return cronStr
         */
        public String getCronStr() {
            return this.cronStr;
        }

        /**
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
        }

        /**
         * @return orderAfter
         */
        public java.util.List < String > getOrderAfter() {
            return this.orderAfter;
        }

        /**
         * @return runMethod
         */
        public String getRunMethod() {
            return this.runMethod;
        }

        /**
         * @return sourceCatalogName
         */
        public String getSourceCatalogName() {
            return this.sourceCatalogName;
        }

        /**
         * @return sourceInstanceName
         */
        public String getSourceInstanceName() {
            return this.sourceInstanceName;
        }

        /**
         * @return sourceSchemaName
         */
        public String getSourceSchemaName() {
            return this.sourceSchemaName;
        }

        /**
         * @return tableIncludes
         */
        public java.util.List < TableIncludes> getTableIncludes() {
            return this.tableIncludes;
        }

        /**
         * @return tableMapping
         */
        public java.util.List < String > getTableMapping() {
            return this.tableMapping;
        }

        /**
         * @return targetInstanceHost
         */
        public String getTargetInstanceHost() {
            return this.targetInstanceHost;
        }

        /**
         * @return variables
         */
        public java.util.List < Variables> getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private String archiveMethod; 
            private String cronStr; 
            private Boolean logic; 
            private java.util.List < String > orderAfter; 
            private String runMethod; 
            private String sourceCatalogName; 
            private String sourceInstanceName; 
            private String sourceSchemaName; 
            private java.util.List < TableIncludes> tableIncludes; 
            private java.util.List < String > tableMapping; 
            private String targetInstanceHost; 
            private java.util.List < Variables> variables; 

            /**
             * ArchiveMethod.
             */
            public Builder archiveMethod(String archiveMethod) {
                this.archiveMethod = archiveMethod;
                return this;
            }

            /**
             * CronStr.
             */
            public Builder cronStr(String cronStr) {
                this.cronStr = cronStr;
                return this;
            }

            /**
             * Logic.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * OrderAfter.
             */
            public Builder orderAfter(java.util.List < String > orderAfter) {
                this.orderAfter = orderAfter;
                return this;
            }

            /**
             * RunMethod.
             */
            public Builder runMethod(String runMethod) {
                this.runMethod = runMethod;
                return this;
            }

            /**
             * SourceCatalogName.
             */
            public Builder sourceCatalogName(String sourceCatalogName) {
                this.sourceCatalogName = sourceCatalogName;
                return this;
            }

            /**
             * SourceInstanceName.
             */
            public Builder sourceInstanceName(String sourceInstanceName) {
                this.sourceInstanceName = sourceInstanceName;
                return this;
            }

            /**
             * SourceSchemaName.
             */
            public Builder sourceSchemaName(String sourceSchemaName) {
                this.sourceSchemaName = sourceSchemaName;
                return this;
            }

            /**
             * TableIncludes.
             */
            public Builder tableIncludes(java.util.List < TableIncludes> tableIncludes) {
                this.tableIncludes = tableIncludes;
                return this;
            }

            /**
             * TableMapping.
             */
            public Builder tableMapping(java.util.List < String > tableMapping) {
                this.tableMapping = tableMapping;
                return this;
            }

            /**
             * TargetInstanceHost.
             */
            public Builder targetInstanceHost(String targetInstanceHost) {
                this.targetInstanceHost = targetInstanceHost;
                return this;
            }

            /**
             * Variables.
             */
            public Builder variables(java.util.List < Variables> variables) {
                this.variables = variables;
                return this;
            }

            public Param build() {
                return new Param(this);
            } 

        } 

    }
}
