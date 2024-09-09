// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetModelFeatureResponseBody} extends {@link TeaModel}
 *
 * <p>GetModelFeatureResponseBody</p>
 */
public class GetModelFeatureResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExportTrainingSetTableScript")
    private String exportTrainingSetTableScript;

    @com.aliyun.core.annotation.NameInMap("Features")
    private java.util.List < Features> features;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("LabelPriorityLevel")
    private Long labelPriorityLevel;

    @com.aliyun.core.annotation.NameInMap("LabelTableId")
    private String labelTableId;

    @com.aliyun.core.annotation.NameInMap("LabelTableName")
    private String labelTableName;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("Relations")
    private Relations relations;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrainingSetFGTable")
    private String trainingSetFGTable;

    @com.aliyun.core.annotation.NameInMap("TrainingSetTable")
    private String trainingSetTable;

    private GetModelFeatureResponseBody(Builder builder) {
        this.exportTrainingSetTableScript = builder.exportTrainingSetTableScript;
        this.features = builder.features;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.labelPriorityLevel = builder.labelPriorityLevel;
        this.labelTableId = builder.labelTableId;
        this.labelTableName = builder.labelTableName;
        this.name = builder.name;
        this.owner = builder.owner;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.relations = builder.relations;
        this.requestId = builder.requestId;
        this.trainingSetFGTable = builder.trainingSetFGTable;
        this.trainingSetTable = builder.trainingSetTable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelFeatureResponseBody create() {
        return builder().build();
    }

    /**
     * @return exportTrainingSetTableScript
     */
    public String getExportTrainingSetTableScript() {
        return this.exportTrainingSetTableScript;
    }

    /**
     * @return features
     */
    public java.util.List < Features> getFeatures() {
        return this.features;
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
     * @return labelPriorityLevel
     */
    public Long getLabelPriorityLevel() {
        return this.labelPriorityLevel;
    }

    /**
     * @return labelTableId
     */
    public String getLabelTableId() {
        return this.labelTableId;
    }

    /**
     * @return labelTableName
     */
    public String getLabelTableName() {
        return this.labelTableName;
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
     * @return relations
     */
    public Relations getRelations() {
        return this.relations;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trainingSetFGTable
     */
    public String getTrainingSetFGTable() {
        return this.trainingSetFGTable;
    }

    /**
     * @return trainingSetTable
     */
    public String getTrainingSetTable() {
        return this.trainingSetTable;
    }

    public static final class Builder {
        private String exportTrainingSetTableScript; 
        private java.util.List < Features> features; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private Long labelPriorityLevel; 
        private String labelTableId; 
        private String labelTableName; 
        private String name; 
        private String owner; 
        private String projectId; 
        private String projectName; 
        private Relations relations; 
        private String requestId; 
        private String trainingSetFGTable; 
        private String trainingSetTable; 

        /**
         * ExportTrainingSetTableScript.
         */
        public Builder exportTrainingSetTableScript(String exportTrainingSetTableScript) {
            this.exportTrainingSetTableScript = exportTrainingSetTableScript;
            return this;
        }

        /**
         * Features.
         */
        public Builder features(java.util.List < Features> features) {
            this.features = features;
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
         * LabelPriorityLevel.
         */
        public Builder labelPriorityLevel(Long labelPriorityLevel) {
            this.labelPriorityLevel = labelPriorityLevel;
            return this;
        }

        /**
         * LabelTableId.
         */
        public Builder labelTableId(String labelTableId) {
            this.labelTableId = labelTableId;
            return this;
        }

        /**
         * LabelTableName.
         */
        public Builder labelTableName(String labelTableName) {
            this.labelTableName = labelTableName;
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
         * Relations.
         */
        public Builder relations(Relations relations) {
            this.relations = relations;
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
         * TrainingSetFGTable.
         */
        public Builder trainingSetFGTable(String trainingSetFGTable) {
            this.trainingSetFGTable = trainingSetFGTable;
            return this;
        }

        /**
         * TrainingSetTable.
         */
        public Builder trainingSetTable(String trainingSetTable) {
            this.trainingSetTable = trainingSetTable;
            return this;
        }

        public GetModelFeatureResponseBody build() {
            return new GetModelFeatureResponseBody(this);
        } 

    } 

    public static class Features extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("FeatureViewId")
        private String featureViewId;

        @com.aliyun.core.annotation.NameInMap("FeatureViewName")
        private String featureViewName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Features(Builder builder) {
            this.aliasName = builder.aliasName;
            this.featureViewId = builder.featureViewId;
            this.featureViewName = builder.featureViewName;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Features create() {
            return builder().build();
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return featureViewId
         */
        public String getFeatureViewId() {
            return this.featureViewId;
        }

        /**
         * @return featureViewName
         */
        public String getFeatureViewName() {
            return this.featureViewName;
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
            private String aliasName; 
            private String featureViewId; 
            private String featureViewName; 
            private String name; 
            private String type; 

            /**
             * AliasName.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * FeatureViewId.
             */
            public Builder featureViewId(String featureViewId) {
                this.featureViewId = featureViewId;
                return this;
            }

            /**
             * FeatureViewName.
             */
            public Builder featureViewName(String featureViewName) {
                this.featureViewName = featureViewName;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Features build() {
                return new Features(this);
            } 

        } 

    }
    public static class Domains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainType")
        private String domainType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Domains(Builder builder) {
            this.domainType = builder.domainType;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domains create() {
            return builder().build();
        }

        /**
         * @return domainType
         */
        public String getDomainType() {
            return this.domainType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String domainType; 
            private String id; 
            private String name; 

            /**
             * DomainType.
             */
            public Builder domainType(String domainType) {
                this.domainType = domainType;
                return this;
            }

            /**
             * Domain ID。
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Domains build() {
                return new Domains(this);
            } 

        } 

    }
    public static class Links extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("From")
        private String from;

        @com.aliyun.core.annotation.NameInMap("Link")
        private String link;

        @com.aliyun.core.annotation.NameInMap("To")
        private String to;

        private Links(Builder builder) {
            this.from = builder.from;
            this.link = builder.link;
            this.to = builder.to;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Links create() {
            return builder().build();
        }

        /**
         * @return from
         */
        public String getFrom() {
            return this.from;
        }

        /**
         * @return link
         */
        public String getLink() {
            return this.link;
        }

        /**
         * @return to
         */
        public String getTo() {
            return this.to;
        }

        public static final class Builder {
            private String from; 
            private String link; 
            private String to; 

            /**
             * From.
             */
            public Builder from(String from) {
                this.from = from;
                return this;
            }

            /**
             * Link.
             */
            public Builder link(String link) {
                this.link = link;
                return this;
            }

            /**
             * To.
             */
            public Builder to(String to) {
                this.to = to;
                return this;
            }

            public Links build() {
                return new Links(this);
            } 

        } 

    }
    public static class Relations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domains")
        private java.util.List < Domains> domains;

        @com.aliyun.core.annotation.NameInMap("Links")
        private java.util.List < Links> links;

        private Relations(Builder builder) {
            this.domains = builder.domains;
            this.links = builder.links;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Relations create() {
            return builder().build();
        }

        /**
         * @return domains
         */
        public java.util.List < Domains> getDomains() {
            return this.domains;
        }

        /**
         * @return links
         */
        public java.util.List < Links> getLinks() {
            return this.links;
        }

        public static final class Builder {
            private java.util.List < Domains> domains; 
            private java.util.List < Links> links; 

            /**
             * Domains.
             */
            public Builder domains(java.util.List < Domains> domains) {
                this.domains = domains;
                return this;
            }

            /**
             * Links.
             */
            public Builder links(java.util.List < Links> links) {
                this.links = links;
                return this;
            }

            public Relations build() {
                return new Relations(this);
            } 

        } 

    }
}
