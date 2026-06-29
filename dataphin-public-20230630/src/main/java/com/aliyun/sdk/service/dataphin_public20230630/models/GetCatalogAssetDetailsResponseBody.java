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
 * {@link GetCatalogAssetDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>GetCatalogAssetDetailsResponseBody</p>
 */
public class GetCatalogAssetDetailsResponseBody extends TeaModel {
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

    private GetCatalogAssetDetailsResponseBody(Builder builder) {
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

    public static GetCatalogAssetDetailsResponseBody create() {
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

        private Builder(GetCatalogAssetDetailsResponseBody model) {
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

        public GetCatalogAssetDetailsResponseBody build() {
            return new GetCatalogAssetDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCatalogAssetDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCatalogAssetDetailsResponseBody</p>
     */
    public static class AssociatedEntity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUnitId")
        private Long bizUnitId;

        @com.aliyun.core.annotation.NameInMap("BizUnitName")
        private String bizUnitName;

        @com.aliyun.core.annotation.NameInMap("DimensionDisplayName")
        private String dimensionDisplayName;

        @com.aliyun.core.annotation.NameInMap("DimensionId")
        private Long dimensionId;

        @com.aliyun.core.annotation.NameInMap("DimensionName")
        private String dimensionName;

        private AssociatedEntity(Builder builder) {
            this.bizUnitId = builder.bizUnitId;
            this.bizUnitName = builder.bizUnitName;
            this.dimensionDisplayName = builder.dimensionDisplayName;
            this.dimensionId = builder.dimensionId;
            this.dimensionName = builder.dimensionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociatedEntity create() {
            return builder().build();
        }

        /**
         * @return bizUnitId
         */
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        /**
         * @return bizUnitName
         */
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        /**
         * @return dimensionDisplayName
         */
        public String getDimensionDisplayName() {
            return this.dimensionDisplayName;
        }

        /**
         * @return dimensionId
         */
        public Long getDimensionId() {
            return this.dimensionId;
        }

        /**
         * @return dimensionName
         */
        public String getDimensionName() {
            return this.dimensionName;
        }

        public static final class Builder {
            private Long bizUnitId; 
            private String bizUnitName; 
            private String dimensionDisplayName; 
            private Long dimensionId; 
            private String dimensionName; 

            private Builder() {
            } 

            private Builder(AssociatedEntity model) {
                this.bizUnitId = model.bizUnitId;
                this.bizUnitName = model.bizUnitName;
                this.dimensionDisplayName = model.dimensionDisplayName;
                this.dimensionId = model.dimensionId;
                this.dimensionName = model.dimensionName;
            } 

            /**
             * BizUnitId.
             */
            public Builder bizUnitId(Long bizUnitId) {
                this.bizUnitId = bizUnitId;
                return this;
            }

            /**
             * BizUnitName.
             */
            public Builder bizUnitName(String bizUnitName) {
                this.bizUnitName = bizUnitName;
                return this;
            }

            /**
             * DimensionDisplayName.
             */
            public Builder dimensionDisplayName(String dimensionDisplayName) {
                this.dimensionDisplayName = dimensionDisplayName;
                return this;
            }

            /**
             * DimensionId.
             */
            public Builder dimensionId(Long dimensionId) {
                this.dimensionId = dimensionId;
                return this;
            }

            /**
             * DimensionName.
             */
            public Builder dimensionName(String dimensionName) {
                this.dimensionName = dimensionName;
                return this;
            }

            public AssociatedEntity build() {
                return new AssociatedEntity(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCatalogAssetDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCatalogAssetDetailsResponseBody</p>
     */
    public static class Standards extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Standards(Builder builder) {
            this.code = builder.code;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Standards create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
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

        public static final class Builder {
            private String code; 
            private Long id; 
            private String name; 

            private Builder() {
            } 

            private Builder(Standards model) {
                this.code = model.code;
                this.id = model.id;
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
             * Id.
             */
            public Builder id(Long id) {
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

            public Standards build() {
                return new Standards(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCatalogAssetDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCatalogAssetDetailsResponseBody</p>
     */
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedEntity")
        private AssociatedEntity associatedEntity;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("ClassifyName")
        private String classifyName;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Guid")
        private String guid;

        @com.aliyun.core.annotation.NameInMap("LevelShortName")
        private String levelShortName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("QualityScore")
        private Double qualityScore;

        @com.aliyun.core.annotation.NameInMap("Standards")
        private java.util.List<Standards> standards;

        private Columns(Builder builder) {
            this.associatedEntity = builder.associatedEntity;
            this.bizType = builder.bizType;
            this.classifyName = builder.classifyName;
            this.dataType = builder.dataType;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.guid = builder.guid;
            this.levelShortName = builder.levelShortName;
            this.name = builder.name;
            this.qualityScore = builder.qualityScore;
            this.standards = builder.standards;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return associatedEntity
         */
        public AssociatedEntity getAssociatedEntity() {
            return this.associatedEntity;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return classifyName
         */
        public String getClassifyName() {
            return this.classifyName;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return guid
         */
        public String getGuid() {
            return this.guid;
        }

        /**
         * @return levelShortName
         */
        public String getLevelShortName() {
            return this.levelShortName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return qualityScore
         */
        public Double getQualityScore() {
            return this.qualityScore;
        }

        /**
         * @return standards
         */
        public java.util.List<Standards> getStandards() {
            return this.standards;
        }

        public static final class Builder {
            private AssociatedEntity associatedEntity; 
            private String bizType; 
            private String classifyName; 
            private String dataType; 
            private String description; 
            private String displayName; 
            private String guid; 
            private String levelShortName; 
            private String name; 
            private Double qualityScore; 
            private java.util.List<Standards> standards; 

            private Builder() {
            } 

            private Builder(Columns model) {
                this.associatedEntity = model.associatedEntity;
                this.bizType = model.bizType;
                this.classifyName = model.classifyName;
                this.dataType = model.dataType;
                this.description = model.description;
                this.displayName = model.displayName;
                this.guid = model.guid;
                this.levelShortName = model.levelShortName;
                this.name = model.name;
                this.qualityScore = model.qualityScore;
                this.standards = model.standards;
            } 

            /**
             * AssociatedEntity.
             */
            public Builder associatedEntity(AssociatedEntity associatedEntity) {
                this.associatedEntity = associatedEntity;
                return this;
            }

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * ClassifyName.
             */
            public Builder classifyName(String classifyName) {
                this.classifyName = classifyName;
                return this;
            }

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Guid.
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            /**
             * LevelShortName.
             */
            public Builder levelShortName(String levelShortName) {
                this.levelShortName = levelShortName;
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
             * QualityScore.
             */
            public Builder qualityScore(Double qualityScore) {
                this.qualityScore = qualityScore;
                return this;
            }

            /**
             * Standards.
             */
            public Builder standards(java.util.List<Standards> standards) {
                this.standards = standards;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCatalogAssetDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCatalogAssetDetailsResponseBody</p>
     */
    public static class CustomAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttrType")
        private String attrType;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private CustomAttributes(Builder builder) {
            this.attrType = builder.attrType;
            this.code = builder.code;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomAttributes create() {
            return builder().build();
        }

        /**
         * @return attrType
         */
        public String getAttrType() {
            return this.attrType;
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

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String attrType; 
            private String code; 
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(CustomAttributes model) {
                this.attrType = model.attrType;
                this.code = model.code;
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * AttrType.
             */
            public Builder attrType(String attrType) {
                this.attrType = attrType;
                return this;
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

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public CustomAttributes build() {
                return new CustomAttributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCatalogAssetDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCatalogAssetDetailsResponseBody</p>
     */
    public static class Directories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private Long directoryId;

        @com.aliyun.core.annotation.NameInMap("DirectoryName")
        private String directoryName;

        @com.aliyun.core.annotation.NameInMap("TopicId")
        private Long topicId;

        @com.aliyun.core.annotation.NameInMap("TopicName")
        private String topicName;

        private Directories(Builder builder) {
            this.directoryId = builder.directoryId;
            this.directoryName = builder.directoryName;
            this.topicId = builder.topicId;
            this.topicName = builder.topicName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Directories create() {
            return builder().build();
        }

        /**
         * @return directoryId
         */
        public Long getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return directoryName
         */
        public String getDirectoryName() {
            return this.directoryName;
        }

        /**
         * @return topicId
         */
        public Long getTopicId() {
            return this.topicId;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        public static final class Builder {
            private Long directoryId; 
            private String directoryName; 
            private Long topicId; 
            private String topicName; 

            private Builder() {
            } 

            private Builder(Directories model) {
                this.directoryId = model.directoryId;
                this.directoryName = model.directoryName;
                this.topicId = model.topicId;
                this.topicName = model.topicName;
            } 

            /**
             * DirectoryId.
             */
            public Builder directoryId(Long directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * DirectoryName.
             */
            public Builder directoryName(String directoryName) {
                this.directoryName = directoryName;
                return this;
            }

            /**
             * TopicId.
             */
            public Builder topicId(Long topicId) {
                this.topicId = topicId;
                return this;
            }

            /**
             * TopicName.
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            public Directories build() {
                return new Directories(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCatalogAssetDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCatalogAssetDetailsResponseBody</p>
     */
    public static class FirstOnShelveUser extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private FirstOnShelveUser(Builder builder) {
            this.displayName = builder.displayName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FirstOnShelveUser create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String displayName; 
            private String userId; 

            private Builder() {
            } 

            private Builder(FirstOnShelveUser model) {
                this.displayName = model.displayName;
                this.userId = model.userId;
            } 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public FirstOnShelveUser build() {
                return new FirstOnShelveUser(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCatalogAssetDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCatalogAssetDetailsResponseBody</p>
     */
    public static class LastOnShelveUser extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private LastOnShelveUser(Builder builder) {
            this.displayName = builder.displayName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LastOnShelveUser create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String displayName; 
            private String userId; 

            private Builder() {
            } 

            private Builder(LastOnShelveUser model) {
                this.displayName = model.displayName;
                this.userId = model.userId;
            } 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public LastOnShelveUser build() {
                return new LastOnShelveUser(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCatalogAssetDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCatalogAssetDetailsResponseBody</p>
     */
    public static class Owner extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Owner(Builder builder) {
            this.displayName = builder.displayName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Owner create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String displayName; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Owner model) {
                this.displayName = model.displayName;
                this.userId = model.userId;
            } 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Owner build() {
                return new Owner(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCatalogAssetDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCatalogAssetDetailsResponseBody</p>
     */
    public static class Owners extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Owners(Builder builder) {
            this.displayName = builder.displayName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Owners create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String displayName; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Owners model) {
                this.displayName = model.displayName;
                this.userId = model.userId;
            } 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Owners build() {
                return new Owners(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCatalogAssetDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCatalogAssetDetailsResponseBody</p>
     */
    public static class Project extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        private Project(Builder builder) {
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Project create() {
            return builder().build();
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

        public static final class Builder {
            private String projectId; 
            private String projectName; 

            private Builder() {
            } 

            private Builder(Project model) {
                this.projectId = model.projectId;
                this.projectName = model.projectName;
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

            public Project build() {
                return new Project(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCatalogAssetDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCatalogAssetDetailsResponseBody</p>
     */
    public static class SimpleNodeInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUnit")
        private String bizUnit;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeScheduleType")
        private String nodeScheduleType;

        @com.aliyun.core.annotation.NameInMap("Owners")
        private java.util.List<Owners> owners;

        @com.aliyun.core.annotation.NameInMap("Project")
        private Project project;

        @com.aliyun.core.annotation.NameInMap("SubBizType")
        private String subBizType;

        private SimpleNodeInfos(Builder builder) {
            this.bizUnit = builder.bizUnit;
            this.env = builder.env;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.nodeScheduleType = builder.nodeScheduleType;
            this.owners = builder.owners;
            this.project = builder.project;
            this.subBizType = builder.subBizType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SimpleNodeInfos create() {
            return builder().build();
        }

        /**
         * @return bizUnit
         */
        public String getBizUnit() {
            return this.bizUnit;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return nodeScheduleType
         */
        public String getNodeScheduleType() {
            return this.nodeScheduleType;
        }

        /**
         * @return owners
         */
        public java.util.List<Owners> getOwners() {
            return this.owners;
        }

        /**
         * @return project
         */
        public Project getProject() {
            return this.project;
        }

        /**
         * @return subBizType
         */
        public String getSubBizType() {
            return this.subBizType;
        }

        public static final class Builder {
            private String bizUnit; 
            private String env; 
            private String nodeId; 
            private String nodeName; 
            private String nodeScheduleType; 
            private java.util.List<Owners> owners; 
            private Project project; 
            private String subBizType; 

            private Builder() {
            } 

            private Builder(SimpleNodeInfos model) {
                this.bizUnit = model.bizUnit;
                this.env = model.env;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.nodeScheduleType = model.nodeScheduleType;
                this.owners = model.owners;
                this.project = model.project;
                this.subBizType = model.subBizType;
            } 

            /**
             * BizUnit.
             */
            public Builder bizUnit(String bizUnit) {
                this.bizUnit = bizUnit;
                return this;
            }

            /**
             * Env.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * NodeScheduleType.
             */
            public Builder nodeScheduleType(String nodeScheduleType) {
                this.nodeScheduleType = nodeScheduleType;
                return this;
            }

            /**
             * Owners.
             */
            public Builder owners(java.util.List<Owners> owners) {
                this.owners = owners;
                return this;
            }

            /**
             * Project.
             */
            public Builder project(Project project) {
                this.project = project;
                return this;
            }

            /**
             * SubBizType.
             */
            public Builder subBizType(String subBizType) {
                this.subBizType = subBizType;
                return this;
            }

            public SimpleNodeInfos build() {
                return new SimpleNodeInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCatalogAssetDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCatalogAssetDetailsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiCallMode")
        private String apiCallMode;

        @com.aliyun.core.annotation.NameInMap("ApiGroupName")
        private String apiGroupName;

        @com.aliyun.core.annotation.NameInMap("ApiId")
        private Long apiId;

        @com.aliyun.core.annotation.NameInMap("ApiRequestMethod")
        private String apiRequestMethod;

        @com.aliyun.core.annotation.NameInMap("AssetDescription")
        private String assetDescription;

        @com.aliyun.core.annotation.NameInMap("AssetDetailUrl")
        private String assetDetailUrl;

        @com.aliyun.core.annotation.NameInMap("AssetDisplayName")
        private String assetDisplayName;

        @com.aliyun.core.annotation.NameInMap("AssetFrom")
        private String assetFrom;

        @com.aliyun.core.annotation.NameInMap("AssetFullName")
        private String assetFullName;

        @com.aliyun.core.annotation.NameInMap("AssetName")
        private String assetName;

        @com.aliyun.core.annotation.NameInMap("AssetTags")
        private java.util.List<String> assetTags;

        @com.aliyun.core.annotation.NameInMap("AssetType")
        private String assetType;

        @com.aliyun.core.annotation.NameInMap("BiCatalog")
        private String biCatalog;

        @com.aliyun.core.annotation.NameInMap("BizUnitId")
        private Long bizUnitId;

        @com.aliyun.core.annotation.NameInMap("BizUnitName")
        private String bizUnitName;

        @com.aliyun.core.annotation.NameInMap("ChartCount")
        private Long chartCount;

        @com.aliyun.core.annotation.NameInMap("CollectionCount")
        private Long collectionCount;

        @com.aliyun.core.annotation.NameInMap("Columns")
        private java.util.List<Columns> columns;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CustomAttributes")
        private java.util.List<CustomAttributes> customAttributes;

        @com.aliyun.core.annotation.NameInMap("DataCellId")
        private String dataCellId;

        @com.aliyun.core.annotation.NameInMap("DataCellName")
        private String dataCellName;

        @com.aliyun.core.annotation.NameInMap("DataSourceName")
        private String dataSourceName;

        @com.aliyun.core.annotation.NameInMap("DatasourceId")
        private Long datasourceId;

        @com.aliyun.core.annotation.NameInMap("Directories")
        private java.util.List<Directories> directories;

        @com.aliyun.core.annotation.NameInMap("FirstOnShelveTime")
        private String firstOnShelveTime;

        @com.aliyun.core.annotation.NameInMap("FirstOnShelveUser")
        private FirstOnShelveUser firstOnShelveUser;

        @com.aliyun.core.annotation.NameInMap("Granularity")
        private String granularity;

        @com.aliyun.core.annotation.NameInMap("Guid")
        private String guid;

        @com.aliyun.core.annotation.NameInMap("Instruction")
        private String instruction;

        @com.aliyun.core.annotation.NameInMap("IsDeleted")
        private Boolean isDeleted;

        @com.aliyun.core.annotation.NameInMap("IsPartitionTable")
        private Boolean isPartitionTable;

        @com.aliyun.core.annotation.NameInMap("LastDdlTime")
        private String lastDdlTime;

        @com.aliyun.core.annotation.NameInMap("LastDmlTime")
        private String lastDmlTime;

        @com.aliyun.core.annotation.NameInMap("LastOnShelveTime")
        private String lastOnShelveTime;

        @com.aliyun.core.annotation.NameInMap("LastOnShelveUser")
        private LastOnShelveUser lastOnShelveUser;

        @com.aliyun.core.annotation.NameInMap("MaintainUserGroups")
        private java.util.List<String> maintainUserGroups;

        @com.aliyun.core.annotation.NameInMap("MaintainUserIds")
        private java.util.List<String> maintainUserIds;

        @com.aliyun.core.annotation.NameInMap("MaxSecurityLevel")
        private String maxSecurityLevel;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private Owner owner;

        @com.aliyun.core.annotation.NameInMap("PartitionKey")
        private String partitionKey;

        @com.aliyun.core.annotation.NameInMap("PrimaryKey")
        private String primaryKey;

        @com.aliyun.core.annotation.NameInMap("ProfilingReportViewScopeType")
        private String profilingReportViewScopeType;

        @com.aliyun.core.annotation.NameInMap("ProfilingReportViewScopeUserGroups")
        private java.util.List<String> profilingReportViewScopeUserGroups;

        @com.aliyun.core.annotation.NameInMap("ProfilingReportViewScopeUserIds")
        private java.util.List<String> profilingReportViewScopeUserIds;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("ReadCount")
        private Long readCount;

        @com.aliyun.core.annotation.NameInMap("ShelveViewScopeType")
        private String shelveViewScopeType;

        @com.aliyun.core.annotation.NameInMap("ShelveViewScopeUserGroups")
        private java.util.List<String> shelveViewScopeUserGroups;

        @com.aliyun.core.annotation.NameInMap("ShelveViewScopeUserIds")
        private java.util.List<String> shelveViewScopeUserIds;

        @com.aliyun.core.annotation.NameInMap("SimpleNodeInfos")
        private java.util.List<SimpleNodeInfos> simpleNodeInfos;

        @com.aliyun.core.annotation.NameInMap("SubType")
        private String subType;

        @com.aliyun.core.annotation.NameInMap("SumTableGuid")
        private String sumTableGuid;

        @com.aliyun.core.annotation.NameInMap("SumTableName")
        private String sumTableName;

        @com.aliyun.core.annotation.NameInMap("TableLifeCycle")
        private String tableLifeCycle;

        @com.aliyun.core.annotation.NameInMap("TableSizeInBytes")
        private Long tableSizeInBytes;

        private Data(Builder builder) {
            this.apiCallMode = builder.apiCallMode;
            this.apiGroupName = builder.apiGroupName;
            this.apiId = builder.apiId;
            this.apiRequestMethod = builder.apiRequestMethod;
            this.assetDescription = builder.assetDescription;
            this.assetDetailUrl = builder.assetDetailUrl;
            this.assetDisplayName = builder.assetDisplayName;
            this.assetFrom = builder.assetFrom;
            this.assetFullName = builder.assetFullName;
            this.assetName = builder.assetName;
            this.assetTags = builder.assetTags;
            this.assetType = builder.assetType;
            this.biCatalog = builder.biCatalog;
            this.bizUnitId = builder.bizUnitId;
            this.bizUnitName = builder.bizUnitName;
            this.chartCount = builder.chartCount;
            this.collectionCount = builder.collectionCount;
            this.columns = builder.columns;
            this.createTime = builder.createTime;
            this.customAttributes = builder.customAttributes;
            this.dataCellId = builder.dataCellId;
            this.dataCellName = builder.dataCellName;
            this.dataSourceName = builder.dataSourceName;
            this.datasourceId = builder.datasourceId;
            this.directories = builder.directories;
            this.firstOnShelveTime = builder.firstOnShelveTime;
            this.firstOnShelveUser = builder.firstOnShelveUser;
            this.granularity = builder.granularity;
            this.guid = builder.guid;
            this.instruction = builder.instruction;
            this.isDeleted = builder.isDeleted;
            this.isPartitionTable = builder.isPartitionTable;
            this.lastDdlTime = builder.lastDdlTime;
            this.lastDmlTime = builder.lastDmlTime;
            this.lastOnShelveTime = builder.lastOnShelveTime;
            this.lastOnShelveUser = builder.lastOnShelveUser;
            this.maintainUserGroups = builder.maintainUserGroups;
            this.maintainUserIds = builder.maintainUserIds;
            this.maxSecurityLevel = builder.maxSecurityLevel;
            this.modifyTime = builder.modifyTime;
            this.owner = builder.owner;
            this.partitionKey = builder.partitionKey;
            this.primaryKey = builder.primaryKey;
            this.profilingReportViewScopeType = builder.profilingReportViewScopeType;
            this.profilingReportViewScopeUserGroups = builder.profilingReportViewScopeUserGroups;
            this.profilingReportViewScopeUserIds = builder.profilingReportViewScopeUserIds;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.readCount = builder.readCount;
            this.shelveViewScopeType = builder.shelveViewScopeType;
            this.shelveViewScopeUserGroups = builder.shelveViewScopeUserGroups;
            this.shelveViewScopeUserIds = builder.shelveViewScopeUserIds;
            this.simpleNodeInfos = builder.simpleNodeInfos;
            this.subType = builder.subType;
            this.sumTableGuid = builder.sumTableGuid;
            this.sumTableName = builder.sumTableName;
            this.tableLifeCycle = builder.tableLifeCycle;
            this.tableSizeInBytes = builder.tableSizeInBytes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiCallMode
         */
        public String getApiCallMode() {
            return this.apiCallMode;
        }

        /**
         * @return apiGroupName
         */
        public String getApiGroupName() {
            return this.apiGroupName;
        }

        /**
         * @return apiId
         */
        public Long getApiId() {
            return this.apiId;
        }

        /**
         * @return apiRequestMethod
         */
        public String getApiRequestMethod() {
            return this.apiRequestMethod;
        }

        /**
         * @return assetDescription
         */
        public String getAssetDescription() {
            return this.assetDescription;
        }

        /**
         * @return assetDetailUrl
         */
        public String getAssetDetailUrl() {
            return this.assetDetailUrl;
        }

        /**
         * @return assetDisplayName
         */
        public String getAssetDisplayName() {
            return this.assetDisplayName;
        }

        /**
         * @return assetFrom
         */
        public String getAssetFrom() {
            return this.assetFrom;
        }

        /**
         * @return assetFullName
         */
        public String getAssetFullName() {
            return this.assetFullName;
        }

        /**
         * @return assetName
         */
        public String getAssetName() {
            return this.assetName;
        }

        /**
         * @return assetTags
         */
        public java.util.List<String> getAssetTags() {
            return this.assetTags;
        }

        /**
         * @return assetType
         */
        public String getAssetType() {
            return this.assetType;
        }

        /**
         * @return biCatalog
         */
        public String getBiCatalog() {
            return this.biCatalog;
        }

        /**
         * @return bizUnitId
         */
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        /**
         * @return bizUnitName
         */
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        /**
         * @return chartCount
         */
        public Long getChartCount() {
            return this.chartCount;
        }

        /**
         * @return collectionCount
         */
        public Long getCollectionCount() {
            return this.collectionCount;
        }

        /**
         * @return columns
         */
        public java.util.List<Columns> getColumns() {
            return this.columns;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return customAttributes
         */
        public java.util.List<CustomAttributes> getCustomAttributes() {
            return this.customAttributes;
        }

        /**
         * @return dataCellId
         */
        public String getDataCellId() {
            return this.dataCellId;
        }

        /**
         * @return dataCellName
         */
        public String getDataCellName() {
            return this.dataCellName;
        }

        /**
         * @return dataSourceName
         */
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        /**
         * @return datasourceId
         */
        public Long getDatasourceId() {
            return this.datasourceId;
        }

        /**
         * @return directories
         */
        public java.util.List<Directories> getDirectories() {
            return this.directories;
        }

        /**
         * @return firstOnShelveTime
         */
        public String getFirstOnShelveTime() {
            return this.firstOnShelveTime;
        }

        /**
         * @return firstOnShelveUser
         */
        public FirstOnShelveUser getFirstOnShelveUser() {
            return this.firstOnShelveUser;
        }

        /**
         * @return granularity
         */
        public String getGranularity() {
            return this.granularity;
        }

        /**
         * @return guid
         */
        public String getGuid() {
            return this.guid;
        }

        /**
         * @return instruction
         */
        public String getInstruction() {
            return this.instruction;
        }

        /**
         * @return isDeleted
         */
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        /**
         * @return isPartitionTable
         */
        public Boolean getIsPartitionTable() {
            return this.isPartitionTable;
        }

        /**
         * @return lastDdlTime
         */
        public String getLastDdlTime() {
            return this.lastDdlTime;
        }

        /**
         * @return lastDmlTime
         */
        public String getLastDmlTime() {
            return this.lastDmlTime;
        }

        /**
         * @return lastOnShelveTime
         */
        public String getLastOnShelveTime() {
            return this.lastOnShelveTime;
        }

        /**
         * @return lastOnShelveUser
         */
        public LastOnShelveUser getLastOnShelveUser() {
            return this.lastOnShelveUser;
        }

        /**
         * @return maintainUserGroups
         */
        public java.util.List<String> getMaintainUserGroups() {
            return this.maintainUserGroups;
        }

        /**
         * @return maintainUserIds
         */
        public java.util.List<String> getMaintainUserIds() {
            return this.maintainUserIds;
        }

        /**
         * @return maxSecurityLevel
         */
        public String getMaxSecurityLevel() {
            return this.maxSecurityLevel;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return owner
         */
        public Owner getOwner() {
            return this.owner;
        }

        /**
         * @return partitionKey
         */
        public String getPartitionKey() {
            return this.partitionKey;
        }

        /**
         * @return primaryKey
         */
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        /**
         * @return profilingReportViewScopeType
         */
        public String getProfilingReportViewScopeType() {
            return this.profilingReportViewScopeType;
        }

        /**
         * @return profilingReportViewScopeUserGroups
         */
        public java.util.List<String> getProfilingReportViewScopeUserGroups() {
            return this.profilingReportViewScopeUserGroups;
        }

        /**
         * @return profilingReportViewScopeUserIds
         */
        public java.util.List<String> getProfilingReportViewScopeUserIds() {
            return this.profilingReportViewScopeUserIds;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return readCount
         */
        public Long getReadCount() {
            return this.readCount;
        }

        /**
         * @return shelveViewScopeType
         */
        public String getShelveViewScopeType() {
            return this.shelveViewScopeType;
        }

        /**
         * @return shelveViewScopeUserGroups
         */
        public java.util.List<String> getShelveViewScopeUserGroups() {
            return this.shelveViewScopeUserGroups;
        }

        /**
         * @return shelveViewScopeUserIds
         */
        public java.util.List<String> getShelveViewScopeUserIds() {
            return this.shelveViewScopeUserIds;
        }

        /**
         * @return simpleNodeInfos
         */
        public java.util.List<SimpleNodeInfos> getSimpleNodeInfos() {
            return this.simpleNodeInfos;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        /**
         * @return sumTableGuid
         */
        public String getSumTableGuid() {
            return this.sumTableGuid;
        }

        /**
         * @return sumTableName
         */
        public String getSumTableName() {
            return this.sumTableName;
        }

        /**
         * @return tableLifeCycle
         */
        public String getTableLifeCycle() {
            return this.tableLifeCycle;
        }

        /**
         * @return tableSizeInBytes
         */
        public Long getTableSizeInBytes() {
            return this.tableSizeInBytes;
        }

        public static final class Builder {
            private String apiCallMode; 
            private String apiGroupName; 
            private Long apiId; 
            private String apiRequestMethod; 
            private String assetDescription; 
            private String assetDetailUrl; 
            private String assetDisplayName; 
            private String assetFrom; 
            private String assetFullName; 
            private String assetName; 
            private java.util.List<String> assetTags; 
            private String assetType; 
            private String biCatalog; 
            private Long bizUnitId; 
            private String bizUnitName; 
            private Long chartCount; 
            private Long collectionCount; 
            private java.util.List<Columns> columns; 
            private String createTime; 
            private java.util.List<CustomAttributes> customAttributes; 
            private String dataCellId; 
            private String dataCellName; 
            private String dataSourceName; 
            private Long datasourceId; 
            private java.util.List<Directories> directories; 
            private String firstOnShelveTime; 
            private FirstOnShelveUser firstOnShelveUser; 
            private String granularity; 
            private String guid; 
            private String instruction; 
            private Boolean isDeleted; 
            private Boolean isPartitionTable; 
            private String lastDdlTime; 
            private String lastDmlTime; 
            private String lastOnShelveTime; 
            private LastOnShelveUser lastOnShelveUser; 
            private java.util.List<String> maintainUserGroups; 
            private java.util.List<String> maintainUserIds; 
            private String maxSecurityLevel; 
            private String modifyTime; 
            private Owner owner; 
            private String partitionKey; 
            private String primaryKey; 
            private String profilingReportViewScopeType; 
            private java.util.List<String> profilingReportViewScopeUserGroups; 
            private java.util.List<String> profilingReportViewScopeUserIds; 
            private Long projectId; 
            private String projectName; 
            private Long readCount; 
            private String shelveViewScopeType; 
            private java.util.List<String> shelveViewScopeUserGroups; 
            private java.util.List<String> shelveViewScopeUserIds; 
            private java.util.List<SimpleNodeInfos> simpleNodeInfos; 
            private String subType; 
            private String sumTableGuid; 
            private String sumTableName; 
            private String tableLifeCycle; 
            private Long tableSizeInBytes; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apiCallMode = model.apiCallMode;
                this.apiGroupName = model.apiGroupName;
                this.apiId = model.apiId;
                this.apiRequestMethod = model.apiRequestMethod;
                this.assetDescription = model.assetDescription;
                this.assetDetailUrl = model.assetDetailUrl;
                this.assetDisplayName = model.assetDisplayName;
                this.assetFrom = model.assetFrom;
                this.assetFullName = model.assetFullName;
                this.assetName = model.assetName;
                this.assetTags = model.assetTags;
                this.assetType = model.assetType;
                this.biCatalog = model.biCatalog;
                this.bizUnitId = model.bizUnitId;
                this.bizUnitName = model.bizUnitName;
                this.chartCount = model.chartCount;
                this.collectionCount = model.collectionCount;
                this.columns = model.columns;
                this.createTime = model.createTime;
                this.customAttributes = model.customAttributes;
                this.dataCellId = model.dataCellId;
                this.dataCellName = model.dataCellName;
                this.dataSourceName = model.dataSourceName;
                this.datasourceId = model.datasourceId;
                this.directories = model.directories;
                this.firstOnShelveTime = model.firstOnShelveTime;
                this.firstOnShelveUser = model.firstOnShelveUser;
                this.granularity = model.granularity;
                this.guid = model.guid;
                this.instruction = model.instruction;
                this.isDeleted = model.isDeleted;
                this.isPartitionTable = model.isPartitionTable;
                this.lastDdlTime = model.lastDdlTime;
                this.lastDmlTime = model.lastDmlTime;
                this.lastOnShelveTime = model.lastOnShelveTime;
                this.lastOnShelveUser = model.lastOnShelveUser;
                this.maintainUserGroups = model.maintainUserGroups;
                this.maintainUserIds = model.maintainUserIds;
                this.maxSecurityLevel = model.maxSecurityLevel;
                this.modifyTime = model.modifyTime;
                this.owner = model.owner;
                this.partitionKey = model.partitionKey;
                this.primaryKey = model.primaryKey;
                this.profilingReportViewScopeType = model.profilingReportViewScopeType;
                this.profilingReportViewScopeUserGroups = model.profilingReportViewScopeUserGroups;
                this.profilingReportViewScopeUserIds = model.profilingReportViewScopeUserIds;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.readCount = model.readCount;
                this.shelveViewScopeType = model.shelveViewScopeType;
                this.shelveViewScopeUserGroups = model.shelveViewScopeUserGroups;
                this.shelveViewScopeUserIds = model.shelveViewScopeUserIds;
                this.simpleNodeInfos = model.simpleNodeInfos;
                this.subType = model.subType;
                this.sumTableGuid = model.sumTableGuid;
                this.sumTableName = model.sumTableName;
                this.tableLifeCycle = model.tableLifeCycle;
                this.tableSizeInBytes = model.tableSizeInBytes;
            } 

            /**
             * ApiCallMode.
             */
            public Builder apiCallMode(String apiCallMode) {
                this.apiCallMode = apiCallMode;
                return this;
            }

            /**
             * ApiGroupName.
             */
            public Builder apiGroupName(String apiGroupName) {
                this.apiGroupName = apiGroupName;
                return this;
            }

            /**
             * ApiId.
             */
            public Builder apiId(Long apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * ApiRequestMethod.
             */
            public Builder apiRequestMethod(String apiRequestMethod) {
                this.apiRequestMethod = apiRequestMethod;
                return this;
            }

            /**
             * AssetDescription.
             */
            public Builder assetDescription(String assetDescription) {
                this.assetDescription = assetDescription;
                return this;
            }

            /**
             * AssetDetailUrl.
             */
            public Builder assetDetailUrl(String assetDetailUrl) {
                this.assetDetailUrl = assetDetailUrl;
                return this;
            }

            /**
             * AssetDisplayName.
             */
            public Builder assetDisplayName(String assetDisplayName) {
                this.assetDisplayName = assetDisplayName;
                return this;
            }

            /**
             * AssetFrom.
             */
            public Builder assetFrom(String assetFrom) {
                this.assetFrom = assetFrom;
                return this;
            }

            /**
             * AssetFullName.
             */
            public Builder assetFullName(String assetFullName) {
                this.assetFullName = assetFullName;
                return this;
            }

            /**
             * AssetName.
             */
            public Builder assetName(String assetName) {
                this.assetName = assetName;
                return this;
            }

            /**
             * AssetTags.
             */
            public Builder assetTags(java.util.List<String> assetTags) {
                this.assetTags = assetTags;
                return this;
            }

            /**
             * AssetType.
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * BiCatalog.
             */
            public Builder biCatalog(String biCatalog) {
                this.biCatalog = biCatalog;
                return this;
            }

            /**
             * BizUnitId.
             */
            public Builder bizUnitId(Long bizUnitId) {
                this.bizUnitId = bizUnitId;
                return this;
            }

            /**
             * BizUnitName.
             */
            public Builder bizUnitName(String bizUnitName) {
                this.bizUnitName = bizUnitName;
                return this;
            }

            /**
             * ChartCount.
             */
            public Builder chartCount(Long chartCount) {
                this.chartCount = chartCount;
                return this;
            }

            /**
             * CollectionCount.
             */
            public Builder collectionCount(Long collectionCount) {
                this.collectionCount = collectionCount;
                return this;
            }

            /**
             * Columns.
             */
            public Builder columns(java.util.List<Columns> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CustomAttributes.
             */
            public Builder customAttributes(java.util.List<CustomAttributes> customAttributes) {
                this.customAttributes = customAttributes;
                return this;
            }

            /**
             * DataCellId.
             */
            public Builder dataCellId(String dataCellId) {
                this.dataCellId = dataCellId;
                return this;
            }

            /**
             * DataCellName.
             */
            public Builder dataCellName(String dataCellName) {
                this.dataCellName = dataCellName;
                return this;
            }

            /**
             * DataSourceName.
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * DatasourceId.
             */
            public Builder datasourceId(Long datasourceId) {
                this.datasourceId = datasourceId;
                return this;
            }

            /**
             * Directories.
             */
            public Builder directories(java.util.List<Directories> directories) {
                this.directories = directories;
                return this;
            }

            /**
             * FirstOnShelveTime.
             */
            public Builder firstOnShelveTime(String firstOnShelveTime) {
                this.firstOnShelveTime = firstOnShelveTime;
                return this;
            }

            /**
             * FirstOnShelveUser.
             */
            public Builder firstOnShelveUser(FirstOnShelveUser firstOnShelveUser) {
                this.firstOnShelveUser = firstOnShelveUser;
                return this;
            }

            /**
             * Granularity.
             */
            public Builder granularity(String granularity) {
                this.granularity = granularity;
                return this;
            }

            /**
             * Guid.
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            /**
             * Instruction.
             */
            public Builder instruction(String instruction) {
                this.instruction = instruction;
                return this;
            }

            /**
             * IsDeleted.
             */
            public Builder isDeleted(Boolean isDeleted) {
                this.isDeleted = isDeleted;
                return this;
            }

            /**
             * IsPartitionTable.
             */
            public Builder isPartitionTable(Boolean isPartitionTable) {
                this.isPartitionTable = isPartitionTable;
                return this;
            }

            /**
             * LastDdlTime.
             */
            public Builder lastDdlTime(String lastDdlTime) {
                this.lastDdlTime = lastDdlTime;
                return this;
            }

            /**
             * LastDmlTime.
             */
            public Builder lastDmlTime(String lastDmlTime) {
                this.lastDmlTime = lastDmlTime;
                return this;
            }

            /**
             * LastOnShelveTime.
             */
            public Builder lastOnShelveTime(String lastOnShelveTime) {
                this.lastOnShelveTime = lastOnShelveTime;
                return this;
            }

            /**
             * LastOnShelveUser.
             */
            public Builder lastOnShelveUser(LastOnShelveUser lastOnShelveUser) {
                this.lastOnShelveUser = lastOnShelveUser;
                return this;
            }

            /**
             * MaintainUserGroups.
             */
            public Builder maintainUserGroups(java.util.List<String> maintainUserGroups) {
                this.maintainUserGroups = maintainUserGroups;
                return this;
            }

            /**
             * MaintainUserIds.
             */
            public Builder maintainUserIds(java.util.List<String> maintainUserIds) {
                this.maintainUserIds = maintainUserIds;
                return this;
            }

            /**
             * MaxSecurityLevel.
             */
            public Builder maxSecurityLevel(String maxSecurityLevel) {
                this.maxSecurityLevel = maxSecurityLevel;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(Owner owner) {
                this.owner = owner;
                return this;
            }

            /**
             * PartitionKey.
             */
            public Builder partitionKey(String partitionKey) {
                this.partitionKey = partitionKey;
                return this;
            }

            /**
             * PrimaryKey.
             */
            public Builder primaryKey(String primaryKey) {
                this.primaryKey = primaryKey;
                return this;
            }

            /**
             * ProfilingReportViewScopeType.
             */
            public Builder profilingReportViewScopeType(String profilingReportViewScopeType) {
                this.profilingReportViewScopeType = profilingReportViewScopeType;
                return this;
            }

            /**
             * ProfilingReportViewScopeUserGroups.
             */
            public Builder profilingReportViewScopeUserGroups(java.util.List<String> profilingReportViewScopeUserGroups) {
                this.profilingReportViewScopeUserGroups = profilingReportViewScopeUserGroups;
                return this;
            }

            /**
             * ProfilingReportViewScopeUserIds.
             */
            public Builder profilingReportViewScopeUserIds(java.util.List<String> profilingReportViewScopeUserIds) {
                this.profilingReportViewScopeUserIds = profilingReportViewScopeUserIds;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
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
             * ReadCount.
             */
            public Builder readCount(Long readCount) {
                this.readCount = readCount;
                return this;
            }

            /**
             * ShelveViewScopeType.
             */
            public Builder shelveViewScopeType(String shelveViewScopeType) {
                this.shelveViewScopeType = shelveViewScopeType;
                return this;
            }

            /**
             * ShelveViewScopeUserGroups.
             */
            public Builder shelveViewScopeUserGroups(java.util.List<String> shelveViewScopeUserGroups) {
                this.shelveViewScopeUserGroups = shelveViewScopeUserGroups;
                return this;
            }

            /**
             * ShelveViewScopeUserIds.
             */
            public Builder shelveViewScopeUserIds(java.util.List<String> shelveViewScopeUserIds) {
                this.shelveViewScopeUserIds = shelveViewScopeUserIds;
                return this;
            }

            /**
             * SimpleNodeInfos.
             */
            public Builder simpleNodeInfos(java.util.List<SimpleNodeInfos> simpleNodeInfos) {
                this.simpleNodeInfos = simpleNodeInfos;
                return this;
            }

            /**
             * SubType.
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * SumTableGuid.
             */
            public Builder sumTableGuid(String sumTableGuid) {
                this.sumTableGuid = sumTableGuid;
                return this;
            }

            /**
             * SumTableName.
             */
            public Builder sumTableName(String sumTableName) {
                this.sumTableName = sumTableName;
                return this;
            }

            /**
             * TableLifeCycle.
             */
            public Builder tableLifeCycle(String tableLifeCycle) {
                this.tableLifeCycle = tableLifeCycle;
                return this;
            }

            /**
             * TableSizeInBytes.
             */
            public Builder tableSizeInBytes(Long tableSizeInBytes) {
                this.tableSizeInBytes = tableSizeInBytes;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
