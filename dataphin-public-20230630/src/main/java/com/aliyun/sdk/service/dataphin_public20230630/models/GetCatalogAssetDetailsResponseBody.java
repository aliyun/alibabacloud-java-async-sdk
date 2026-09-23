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
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data catalog asset details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The backend response exception details.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
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
         * <p>Indicates whether the request was successful.</p>
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
             * <p>The ID of the business unit.</p>
             * 
             * <strong>example:</strong>
             * <p>7137404445633152</p>
             */
            public Builder bizUnitId(Long bizUnitId) {
                this.bizUnitId = bizUnitId;
                return this;
            }

            /**
             * <p>The name of the business unit.</p>
             * 
             * <strong>example:</strong>
             * <p>LD_train</p>
             */
            public Builder bizUnitName(String bizUnitName) {
                this.bizUnitName = bizUnitName;
                return this;
            }

            /**
             * <p>The display name of the dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>上药erp数据源</p>
             */
            public Builder dimensionDisplayName(String dimensionDisplayName) {
                this.dimensionDisplayName = dimensionDisplayName;
                return this;
            }

            /**
             * <p>The ID of the dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>68014359</p>
             */
            public Builder dimensionId(Long dimensionId) {
                this.dimensionId = dimensionId;
                return this;
            }

            /**
             * <p>The name of the dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>etl_source</p>
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
             * <p>The code of the standard.</p>
             * 
             * <strong>example:</strong>
             * <p>hr_person_id</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The ID of the standard.</p>
             * 
             * <strong>example:</strong>
             * <p>120350</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the standard.</p>
             * 
             * <strong>example:</strong>
             * <p>id</p>
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
             * <p>The associated entity. This parameter is returned when the business type is DIMENSION.</p>
             */
            public Builder associatedEntity(AssociatedEntity associatedEntity) {
                this.associatedEntity = associatedEntity;
                return this;
            }

            /**
             * <p>The business type. Valid values:</p>
             * <ul>
             * <li>INDEX: metric.</li>
             * <li>STAT_PERIOD: statistical period.</li>
             * <li>DIMENSION: dimension.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DIMENSION</p>
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * <p>The data classification.</p>
             * 
             * <strong>example:</strong>
             * <p>/交易信息/0000001</p>
             */
            public Builder classifyName(String classifyName) {
                this.classifyName = classifyName;
                return this;
            }

            /**
             * <p>The data type of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>double</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>The description of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The display name of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>Store traffic conversion rate</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The GUID of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>dp_table.300023201.ld_fashion.dws_lulu_location.conversion_rate</p>
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            /**
             * <p>The data classification level.</p>
             * 
             * <strong>example:</strong>
             * <p>L4</p>
             */
            public Builder levelShortName(String levelShortName) {
                this.levelShortName = levelShortName;
                return this;
            }

            /**
             * <p>The name of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>conversion_rate</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The quality score.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder qualityScore(Double qualityScore) {
                this.qualityScore = qualityScore;
                return this;
            }

            /**
             * <p>The associated standards.</p>
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
             * <p>The attribute type. Valid values: BUSINESS (business attribute), MANAGEMENT (management attribute), TECHNOLOGY (technical attribute).</p>
             * 
             * <strong>example:</strong>
             * <p>MANAGEMENT</p>
             */
            public Builder attrType(String attrType) {
                this.attrType = attrType;
                return this;
            }

            /**
             * <p>The attribute code.</p>
             * 
             * <strong>example:</strong>
             * <p>gkglbm</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The attribute name.</p>
             * 
             * <strong>example:</strong>
             * <p>Supervising department</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The attribute value.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
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
    public static class DirectoryChain extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DirectoryDescription")
        private String directoryDescription;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private Long directoryId;

        @com.aliyun.core.annotation.NameInMap("DirectoryName")
        private String directoryName;

        @com.aliyun.core.annotation.NameInMap("Level")
        private Integer level;

        private DirectoryChain(Builder builder) {
            this.directoryDescription = builder.directoryDescription;
            this.directoryId = builder.directoryId;
            this.directoryName = builder.directoryName;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DirectoryChain create() {
            return builder().build();
        }

        /**
         * @return directoryDescription
         */
        public String getDirectoryDescription() {
            return this.directoryDescription;
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
         * @return level
         */
        public Integer getLevel() {
            return this.level;
        }

        public static final class Builder {
            private String directoryDescription; 
            private Long directoryId; 
            private String directoryName; 
            private Integer level; 

            private Builder() {
            } 

            private Builder(DirectoryChain model) {
                this.directoryDescription = model.directoryDescription;
                this.directoryId = model.directoryId;
                this.directoryName = model.directoryName;
                this.level = model.level;
            } 

            /**
             * <p>The directory description.</p>
             * 
             * <strong>example:</strong>
             * <p>Data assets related to transactions</p>
             */
            public Builder directoryDescription(String directoryDescription) {
                this.directoryDescription = directoryDescription;
                return this;
            }

            /**
             * <p>The directory ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2001</p>
             */
            public Builder directoryId(Long directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>The directory name.</p>
             * 
             * <strong>example:</strong>
             * <p>Transaction domain</p>
             */
            public Builder directoryName(String directoryName) {
                this.directoryName = directoryName;
                return this;
            }

            /**
             * <p>The folder level.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder level(Integer level) {
                this.level = level;
                return this;
            }

            public DirectoryChain build() {
                return new DirectoryChain(this);
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
        @com.aliyun.core.annotation.NameInMap("DirectoryChain")
        private java.util.List<DirectoryChain> directoryChain;

        @com.aliyun.core.annotation.NameInMap("DirectoryDescription")
        private String directoryDescription;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private Long directoryId;

        @com.aliyun.core.annotation.NameInMap("DirectoryName")
        private String directoryName;

        @com.aliyun.core.annotation.NameInMap("TopicDescription")
        private String topicDescription;

        @com.aliyun.core.annotation.NameInMap("TopicId")
        private Long topicId;

        @com.aliyun.core.annotation.NameInMap("TopicName")
        private String topicName;

        private Directories(Builder builder) {
            this.directoryChain = builder.directoryChain;
            this.directoryDescription = builder.directoryDescription;
            this.directoryId = builder.directoryId;
            this.directoryName = builder.directoryName;
            this.topicDescription = builder.topicDescription;
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
         * @return directoryChain
         */
        public java.util.List<DirectoryChain> getDirectoryChain() {
            return this.directoryChain;
        }

        /**
         * @return directoryDescription
         */
        public String getDirectoryDescription() {
            return this.directoryDescription;
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
         * @return topicDescription
         */
        public String getTopicDescription() {
            return this.topicDescription;
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
            private java.util.List<DirectoryChain> directoryChain; 
            private String directoryDescription; 
            private Long directoryId; 
            private String directoryName; 
            private String topicDescription; 
            private Long topicId; 
            private String topicName; 

            private Builder() {
            } 

            private Builder(Directories model) {
                this.directoryChain = model.directoryChain;
                this.directoryDescription = model.directoryDescription;
                this.directoryId = model.directoryId;
                this.directoryName = model.directoryName;
                this.topicDescription = model.topicDescription;
                this.topicId = model.topicId;
                this.topicName = model.topicName;
            } 

            /**
             * <p>The complete directory hierarchy chain from the top-level directory to the current directory, including the current directory.</p>
             */
            public Builder directoryChain(java.util.List<DirectoryChain> directoryChain) {
                this.directoryChain = directoryChain;
                return this;
            }

            /**
             * <p>The directory description.</p>
             * 
             * <strong>example:</strong>
             * <p>Data tables related to order details</p>
             */
            public Builder directoryDescription(String directoryDescription) {
                this.directoryDescription = directoryDescription;
                return this;
            }

            /**
             * <p>The directory ID.</p>
             * 
             * <strong>example:</strong>
             * <p>102260</p>
             */
            public Builder directoryId(Long directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>The directory name.</p>
             * 
             * <strong>example:</strong>
             * <p>Online e-commerce platform</p>
             */
            public Builder directoryName(String directoryName) {
                this.directoryName = directoryName;
                return this;
            }

            /**
             * <p>The topic description.</p>
             * 
             * <strong>example:</strong>
             * <p>Core data asset catalog for the entire company, covering all online and offline channels</p>
             */
            public Builder topicDescription(String topicDescription) {
                this.topicDescription = topicDescription;
                return this;
            }

            /**
             * <p>The topic ID.</p>
             * 
             * <strong>example:</strong>
             * <p>101676</p>
             */
            public Builder topicId(Long topicId) {
                this.topicId = topicId;
                return this;
            }

            /**
             * <p>The topic name.</p>
             * 
             * <strong>example:</strong>
             * <p>Omni-channel data topic</p>
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
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>John</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
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
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>John</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
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
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>John</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
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
    public static class CatalogScores extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Catalog")
        private String catalog;

        @com.aliyun.core.annotation.NameInMap("FieldRuleCount")
        private Integer fieldRuleCount;

        @com.aliyun.core.annotation.NameInMap("PassRate")
        private Double passRate;

        @com.aliyun.core.annotation.NameInMap("PassRuleCount")
        private Integer passRuleCount;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("TableRuleCount")
        private Integer tableRuleCount;

        @com.aliyun.core.annotation.NameInMap("ValidateRuleCount")
        private Integer validateRuleCount;

        private CatalogScores(Builder builder) {
            this.catalog = builder.catalog;
            this.fieldRuleCount = builder.fieldRuleCount;
            this.passRate = builder.passRate;
            this.passRuleCount = builder.passRuleCount;
            this.score = builder.score;
            this.tableRuleCount = builder.tableRuleCount;
            this.validateRuleCount = builder.validateRuleCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CatalogScores create() {
            return builder().build();
        }

        /**
         * @return catalog
         */
        public String getCatalog() {
            return this.catalog;
        }

        /**
         * @return fieldRuleCount
         */
        public Integer getFieldRuleCount() {
            return this.fieldRuleCount;
        }

        /**
         * @return passRate
         */
        public Double getPassRate() {
            return this.passRate;
        }

        /**
         * @return passRuleCount
         */
        public Integer getPassRuleCount() {
            return this.passRuleCount;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return tableRuleCount
         */
        public Integer getTableRuleCount() {
            return this.tableRuleCount;
        }

        /**
         * @return validateRuleCount
         */
        public Integer getValidateRuleCount() {
            return this.validateRuleCount;
        }

        public static final class Builder {
            private String catalog; 
            private Integer fieldRuleCount; 
            private Double passRate; 
            private Integer passRuleCount; 
            private Double score; 
            private Integer tableRuleCount; 
            private Integer validateRuleCount; 

            private Builder() {
            } 

            private Builder(CatalogScores model) {
                this.catalog = model.catalog;
                this.fieldRuleCount = model.fieldRuleCount;
                this.passRate = model.passRate;
                this.passRuleCount = model.passRuleCount;
                this.score = model.score;
                this.tableRuleCount = model.tableRuleCount;
                this.validateRuleCount = model.validateRuleCount;
            } 

            /**
             * <p>The dimension name.</p>
             * 
             * <strong>example:</strong>
             * <p>Completeness</p>
             */
            public Builder catalog(String catalog) {
                this.catalog = catalog;
                return this;
            }

            /**
             * <p>The number of field-level rules.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder fieldRuleCount(Integer fieldRuleCount) {
                this.fieldRuleCount = fieldRuleCount;
                return this;
            }

            /**
             * <p>The pass rate.</p>
             * 
             * <strong>example:</strong>
             * <p>0.83</p>
             */
            public Builder passRate(Double passRate) {
                this.passRate = passRate;
                return this;
            }

            /**
             * <p>The number of passed rules.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder passRuleCount(Integer passRuleCount) {
                this.passRuleCount = passRuleCount;
                return this;
            }

            /**
             * <p>The dimension score.</p>
             * 
             * <strong>example:</strong>
             * <p>85.5</p>
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The number of table-level rules.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder tableRuleCount(Integer tableRuleCount) {
                this.tableRuleCount = tableRuleCount;
                return this;
            }

            /**
             * <p>The number of validated rules.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder validateRuleCount(Integer validateRuleCount) {
                this.validateRuleCount = validateRuleCount;
                return this;
            }

            public CatalogScores build() {
                return new CatalogScores(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCatalogAssetDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCatalogAssetDetailsResponseBody</p>
     */
    public static class QualityScoreRadar extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CatalogScores")
        private java.util.List<CatalogScores> catalogScores;

        @com.aliyun.core.annotation.NameInMap("PassRuleCount")
        private Integer passRuleCount;

        @com.aliyun.core.annotation.NameInMap("TotalScore")
        private Double totalScore;

        @com.aliyun.core.annotation.NameInMap("ValidateRuleCount")
        private Integer validateRuleCount;

        private QualityScoreRadar(Builder builder) {
            this.catalogScores = builder.catalogScores;
            this.passRuleCount = builder.passRuleCount;
            this.totalScore = builder.totalScore;
            this.validateRuleCount = builder.validateRuleCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QualityScoreRadar create() {
            return builder().build();
        }

        /**
         * @return catalogScores
         */
        public java.util.List<CatalogScores> getCatalogScores() {
            return this.catalogScores;
        }

        /**
         * @return passRuleCount
         */
        public Integer getPassRuleCount() {
            return this.passRuleCount;
        }

        /**
         * @return totalScore
         */
        public Double getTotalScore() {
            return this.totalScore;
        }

        /**
         * @return validateRuleCount
         */
        public Integer getValidateRuleCount() {
            return this.validateRuleCount;
        }

        public static final class Builder {
            private java.util.List<CatalogScores> catalogScores; 
            private Integer passRuleCount; 
            private Double totalScore; 
            private Integer validateRuleCount; 

            private Builder() {
            } 

            private Builder(QualityScoreRadar model) {
                this.catalogScores = model.catalogScores;
                this.passRuleCount = model.passRuleCount;
                this.totalScore = model.totalScore;
                this.validateRuleCount = model.validateRuleCount;
            } 

            /**
             * <p>The list of dimension scores.</p>
             */
            public Builder catalogScores(java.util.List<CatalogScores> catalogScores) {
                this.catalogScores = catalogScores;
                return this;
            }

            /**
             * <p>The number of passed rules.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder passRuleCount(Integer passRuleCount) {
                this.passRuleCount = passRuleCount;
                return this;
            }

            /**
             * <p>The total quality score.</p>
             * 
             * <strong>example:</strong>
             * <p>85.5</p>
             */
            public Builder totalScore(Double totalScore) {
                this.totalScore = totalScore;
                return this;
            }

            /**
             * <p>The number of validated rules.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder validateRuleCount(Integer validateRuleCount) {
                this.validateRuleCount = validateRuleCount;
                return this;
            }

            public QualityScoreRadar build() {
                return new QualityScoreRadar(this);
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
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>John</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
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
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>6865331517728384</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The project name.</p>
             * 
             * <strong>example:</strong>
             * <p>fashion_cdm</p>
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
             * <p>The business unit to which the node belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder bizUnit(String bizUnit) {
                this.bizUnit = bizUnit;
                return this;
            }

            /**
             * <p>The environment to which the asset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>PROD</p>
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>n_7443633109495119872</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The node name.</p>
             * 
             * <strong>example:</strong>
             * <p>2345</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The scheduling type. Valid values: NORMAL (timed scheduling), MANUAL (manual scheduling).</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder nodeScheduleType(String nodeScheduleType) {
                this.nodeScheduleType = nodeScheduleType;
                return this;
            }

            /**
             * <p>The list of O&amp;M owners.</p>
             */
            public Builder owners(java.util.List<Owners> owners) {
                this.owners = owners;
                return this;
            }

            /**
             * <p>The project to which the node belongs.</p>
             */
            public Builder project(Project project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The node type. Example valid values: DLINK (offline integration), PYTHON37 (Python compute node).</p>
             * 
             * <strong>example:</strong>
             * <p>DLINK</p>
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

        @com.aliyun.core.annotation.NameInMap("QualityScoreRadar")
        private QualityScoreRadar qualityScoreRadar;

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
            this.qualityScoreRadar = builder.qualityScoreRadar;
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
         * @return qualityScoreRadar
         */
        public QualityScoreRadar getQualityScoreRadar() {
            return this.qualityScoreRadar;
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
            private QualityScoreRadar qualityScoreRadar; 
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
                this.qualityScoreRadar = model.qualityScoreRadar;
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
             * <p>The API call mode. Returned when the asset type is API. Valid values: 1=Synchronous call, 2=Asynchronous call.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder apiCallMode(String apiCallMode) {
                this.apiCallMode = apiCallMode;
                return this;
            }

            /**
             * <p>The API group name. Returned when the asset type is API.</p>
             * 
             * <strong>example:</strong>
             * <p>Default API group</p>
             */
            public Builder apiGroupName(String apiGroupName) {
                this.apiGroupName = apiGroupName;
                return this;
            }

            /**
             * <p>The API ID. Returned when the asset type is API.</p>
             * 
             * <strong>example:</strong>
             * <p>10441</p>
             */
            public Builder apiId(Long apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The API operation type. Returned when the asset type is API. Valid values: 1=Get, 2=List, 3=Create, 4=Update, 5=Delete.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder apiRequestMethod(String apiRequestMethod) {
                this.apiRequestMethod = apiRequestMethod;
                return this;
            }

            /**
             * <p>The description of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder assetDescription(String assetDescription) {
                this.assetDescription = assetDescription;
                return this;
            }

            /**
             * <p>The URL of the asset catalog detail page.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://dataphin.poc.lydaas.com/market/catalog/detail/table/">https://dataphin.poc.lydaas.com/market/catalog/detail/table/</a>...</p>
             */
            public Builder assetDetailUrl(String assetDetailUrl) {
                this.assetDetailUrl = assetDetailUrl;
                return this;
            }

            /**
             * <p>The display name of the asset. This parameter is returned when the asset type is TABLE, INDEX, or BIZ_INDEX.</p>
             * 
             * <strong>example:</strong>
             * <p>abc表</p>
             */
            public Builder assetDisplayName(String assetDisplayName) {
                this.assetDisplayName = assetDisplayName;
                return this;
            }

            /**
             * <p>The source of the asset. TABLE (physical table) returns &quot;Dataphin-workspace type-project Chinese name (project English name)&quot;. TABLE (logical table) returns &quot;Dataphin-workspace type-data domain Chinese name (data domain English name)&quot;. TABLE (data source table) returns &quot;source system name-data source name-database/schema name&quot;. INDEX (standard modeling metric) returns the asset source of the associated aggregate logical table. INDEX (custom metric) returns the asset source of the source table. API returns &quot;data service project name&quot;. PAGE returns &quot;application system name&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>Dataphin-中间层-服饰零售 (LD_Fashion)</p>
             */
            public Builder assetFrom(String assetFrom) {
                this.assetFrom = assetFrom;
                return this;
            }

            /**
             * <p>The full name of the asset. This parameter is returned when the asset type is TABLE or INDEX.</p>
             * 
             * <strong>example:</strong>
             * <p>dwd_all.abc</p>
             */
            public Builder assetFullName(String assetFullName) {
                this.assetFullName = assetFullName;
                return this;
            }

            /**
             * <p>The name of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder assetName(String assetName) {
                this.assetName = assetName;
                return this;
            }

            /**
             * <p>The tags of the asset.</p>
             */
            public Builder assetTags(java.util.List<String> assetTags) {
                this.assetTags = assetTags;
                return this;
            }

            /**
             * <p>The asset type. Valid values:</p>
             * <ul>
             * <li>TABLE: table, including views and materialized views.</li>
             * <li>INDEX: technical metric.</li>
             * <li>BIZ_INDEX: business metric.</li>
             * <li>API: API.</li>
             * <li>PAGE: dashboard.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TABLE</p>
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>The BI workspace or folder to which the asset belongs. Returned when the asset type is PAGE (dashboard).</p>
             * 
             * <strong>example:</strong>
             * <p>dataphin演示空间</p>
             */
            public Builder biCatalog(String biCatalog) {
                this.biCatalog = biCatalog;
                return this;
            }

            /**
             * <p>The ID of the data domain to which the asset belongs. This parameter is returned when the asset type is TABLE (logical tables only) or INDEX (technical metrics whose source table is a logical table only).</p>
             * 
             * <strong>example:</strong>
             * <p>6865277495315392</p>
             */
            public Builder bizUnitId(Long bizUnitId) {
                this.bizUnitId = bizUnitId;
                return this;
            }

            /**
             * <p>The name of the data domain to which the asset belongs. This parameter is returned when the asset type is TABLE (logical tables only) or INDEX (technical metrics whose source table is a logical table only).</p>
             * 
             * <strong>example:</strong>
             * <p>服饰零售（LD_Fashion）</p>
             */
            public Builder bizUnitName(String bizUnitName) {
                this.bizUnitName = bizUnitName;
                return this;
            }

            /**
             * <p>The total number of charts. Returned when the asset type is PAGE (dashboard).</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder chartCount(Long chartCount) {
                this.chartCount = chartCount;
                return this;
            }

            /**
             * <p>The collection count.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder collectionCount(Long collectionCount) {
                this.collectionCount = collectionCount;
                return this;
            }

            /**
             * <p>The list of columns. This parameter is returned when the asset type is TABLE.</p>
             */
            public Builder columns(java.util.List<Columns> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-11 16:10:19</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The custom attributes. Returned when includeDetailedAttributes is set to true.</p>
             */
            public Builder customAttributes(java.util.List<CustomAttributes> customAttributes) {
                this.customAttributes = customAttributes;
                return this;
            }

            /**
             * <p>The ID of the data domain. Returned when the asset type is TABLE (logical tables only) or INDEX (technical metrics whose source table is a logical table only).</p>
             * 
             * <strong>example:</strong>
             * <p>49837403</p>
             */
            public Builder dataCellId(String dataCellId) {
                this.dataCellId = dataCellId;
                return this;
            }

            /**
             * <p>The name of the data domain. Returned when the asset type is TABLE (logical tables only) or INDEX (technical metrics whose source table is a logical table only).</p>
             * 
             * <strong>example:</strong>
             * <p>Course domain</p>
             */
            public Builder dataCellName(String dataCellName) {
                this.dataCellName = dataCellName;
                return this;
            }

            /**
             * <p>The name of the data source to which the asset belongs. This parameter is returned when the asset type is TABLE (data source tables only) or INDEX (technical metrics whose source table is a data source table only).</p>
             * 
             * <strong>example:</strong>
             * <p>demo_mysql</p>
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * <p>The ID of the data source to which the asset belongs. This parameter is returned when the asset type is TABLE (data source tables only) or INDEX (technical metrics whose source table is a data source table only).</p>
             * 
             * <strong>example:</strong>
             * <p>7305549302863001856</p>
             */
            public Builder datasourceId(Long datasourceId) {
                this.datasourceId = datasourceId;
                return this;
            }

            /**
             * <p>The directories to which the asset belongs, including topic ID, topic name, directory ID, and directory name.</p>
             */
            public Builder directories(java.util.List<Directories> directories) {
                this.directories = directories;
                return this;
            }

            /**
             * <p>The time of the first listing.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-22 10:06:20</p>
             */
            public Builder firstOnShelveTime(String firstOnShelveTime) {
                this.firstOnShelveTime = firstOnShelveTime;
                return this;
            }

            /**
             * <p>The user who performed the first listing.</p>
             */
            public Builder firstOnShelveUser(FirstOnShelveUser firstOnShelveUser) {
                this.firstOnShelveUser = firstOnShelveUser;
                return this;
            }

            /**
             * <p>The statistical granularity name of the technical metric. Returned when the asset type is INDEX.</p>
             * 
             * <strong>example:</strong>
             * <p>Course</p>
             */
            public Builder granularity(String granularity) {
                this.granularity = granularity;
                return this;
            }

            /**
             * <p>The GUID of the asset, which serves as the unique identifier of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>dp_ds_table.300023201.7311626611751680256.load_test.abc</p>
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            /**
             * <p>The usage instructions.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder instruction(String instruction) {
                this.instruction = instruction;
                return this;
            }

            /**
             * <p>Indicates whether the asset is deleted.</p>
             */
            public Builder isDeleted(Boolean isDeleted) {
                this.isDeleted = isDeleted;
                return this;
            }

            /**
             * <p>Indicates whether the table is a partitioned table. Returned when the asset type is TABLE. Valid values:</p>
             * <ul>
             * <li>true: The table is a partitioned table.</li>
             * <li>false: The table is not a partitioned table.</li>
             * </ul>
             */
            public Builder isPartitionTable(Boolean isPartitionTable) {
                this.isPartitionTable = isPartitionTable;
                return this;
            }

            /**
             * <p>The time of the last DDL change.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-11 16:10:19</p>
             */
            public Builder lastDdlTime(String lastDdlTime) {
                this.lastDdlTime = lastDdlTime;
                return this;
            }

            /**
             * <p>The time of the last DML update.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-11 16:10:19</p>
             */
            public Builder lastDmlTime(String lastDmlTime) {
                this.lastDmlTime = lastDmlTime;
                return this;
            }

            /**
             * <p>The time of the last listing.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-22 10:06:20</p>
             */
            public Builder lastOnShelveTime(String lastOnShelveTime) {
                this.lastOnShelveTime = lastOnShelveTime;
                return this;
            }

            /**
             * <p>The user who performed the last listing.</p>
             */
            public Builder lastOnShelveUser(LastOnShelveUser lastOnShelveUser) {
                this.lastOnShelveUser = lastOnShelveUser;
                return this;
            }

            /**
             * <p>The listing maintenance user groups.</p>
             */
            public Builder maintainUserGroups(java.util.List<String> maintainUserGroups) {
                this.maintainUserGroups = maintainUserGroups;
                return this;
            }

            /**
             * <p>The IDs of the listing maintenance users.</p>
             */
            public Builder maintainUserIds(java.util.List<String> maintainUserIds) {
                this.maintainUserIds = maintainUserIds;
                return this;
            }

            /**
             * <p>The maximum sensitivity level. This parameter is returned when the asset type is TABLE.</p>
             * 
             * <strong>example:</strong>
             * <p>L3</p>
             */
            public Builder maxSecurityLevel(String maxSecurityLevel) {
                this.maxSecurityLevel = maxSecurityLevel;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-11 16:10:19</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The owner.</p>
             */
            public Builder owner(Owner owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The partition key. Returned when the asset type is TABLE.</p>
             * 
             * <strong>example:</strong>
             * <p>ds</p>
             */
            public Builder partitionKey(String partitionKey) {
                this.partitionKey = partitionKey;
                return this;
            }

            /**
             * <p>The primary key. Returned when the asset type is TABLE.</p>
             * 
             * <strong>example:</strong>
             * <p>employee_id</p>
             */
            public Builder primaryKey(String primaryKey) {
                this.primaryKey = primaryKey;
                return this;
            }

            /**
             * <p>The visibility scope type of the profiling report. This parameter is returned only when the asset type is TABLE or INDEX. Valid values:</p>
             * <ul>
             * <li>ALL_USERS_CAN_VIEW: Visible to all users.</li>
             * <li>PART_USERS_CAN_VIEW: Visible to some users.</li>
             * <li>ALL_USERS_CAN_NOT_VIEW: Not visible to any users.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALL_USERS_CAN_VIEW</p>
             */
            public Builder profilingReportViewScopeType(String profilingReportViewScopeType) {
                this.profilingReportViewScopeType = profilingReportViewScopeType;
                return this;
            }

            /**
             * <p>The user groups within the profiling report visibility scope.</p>
             */
            public Builder profilingReportViewScopeUserGroups(java.util.List<String> profilingReportViewScopeUserGroups) {
                this.profilingReportViewScopeUserGroups = profilingReportViewScopeUserGroups;
                return this;
            }

            /**
             * <p>The users within the profiling report visibility scope.</p>
             */
            public Builder profilingReportViewScopeUserIds(java.util.List<String> profilingReportViewScopeUserIds) {
                this.profilingReportViewScopeUserIds = profilingReportViewScopeUserIds;
                return this;
            }

            /**
             * <p>The ID of the project to which the asset belongs. This parameter is returned when the asset type is TABLE (physical tables only) or INDEX (technical metrics whose source table is a physical table only).</p>
             * 
             * <strong>example:</strong>
             * <p>6865331517728384</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The name of the project to which the asset belongs. This parameter is returned when the asset type is TABLE (physical tables only) or INDEX (technical metrics whose source table is a physical table only).</p>
             * 
             * <strong>example:</strong>
             * <p>train</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The quality score radar chart information. This parameter is returned only when includeDetailedAttributes is set to true. It contains the total score, the number of passed/validated rules, and the score details for each dimension.</p>
             */
            public Builder qualityScoreRadar(QualityScoreRadar qualityScoreRadar) {
                this.qualityScoreRadar = qualityScoreRadar;
                return this;
            }

            /**
             * <p>The view count.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder readCount(Long readCount) {
                this.readCount = readCount;
                return this;
            }

            /**
             * <p>The visibility scope type. Valid values:</p>
             * <ul>
             * <li>ALL_USERS_CAN_VIEW: Visible to all users.</li>
             * <li>PART_USERS_CAN_VIEW: Visible to some users.</li>
             * <li>PART_USERS_CAN_NOT_VIEW: Not visible to some users.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALL_USERS_CAN_VIEW</p>
             */
            public Builder shelveViewScopeType(String shelveViewScopeType) {
                this.shelveViewScopeType = shelveViewScopeType;
                return this;
            }

            /**
             * <p>The user groups within the visibility scope.</p>
             */
            public Builder shelveViewScopeUserGroups(java.util.List<String> shelveViewScopeUserGroups) {
                this.shelveViewScopeUserGroups = shelveViewScopeUserGroups;
                return this;
            }

            /**
             * <p>The users within the visibility scope.</p>
             */
            public Builder shelveViewScopeUserIds(java.util.List<String> shelveViewScopeUserIds) {
                this.shelveViewScopeUserIds = shelveViewScopeUserIds;
                return this;
            }

            /**
             * <p>The output nodes. Returned when the asset type is TABLE.</p>
             */
            public Builder simpleNodeInfos(java.util.List<SimpleNodeInfos> simpleNodeInfos) {
                this.simpleNodeInfos = simpleNodeInfos;
                return this;
            }

            /**
             * <p>The subtype. Valid values:</p>
             * <ul>
             * <li>DIM_NORMAL: common logical dimension table.</li>
             * <li>DIM_ENUM: enumeration logical dimension table.</li>
             * <li>DIM_VIRTUAL: virtual logical dimension table.</li>
             * <li>SUM_BIZ_UNIT: aggregate logical table.</li>
             * <li>FACT_EVENT: event fact logical table.</li>
             * <li>FACT_SNAPSHOT: snapshot fact logical table.</li>
             * <li>DATASOURCE_TABLE: data source table.</li>
             * <li>PHYSICAL_TABLE: physical table.</li>
             * <li>DATASOURCE_VIEW: view (data source view).</li>
             * <li>PHYSICAL_VIEW: physical view.</li>
             * <li>MATERIALIZED_VIEW: materialized view.</li>
             * <li>BIZ_INDEX: business metric.</li>
             * <li>INDEX: technical metric (standard modeling metric).</li>
             * <li>CUSTOM_INDEX: technical metric (custom metric).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DIM_NORMAL</p>
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * <p>The GUID of the aggregate table to which the asset belongs. Returned when the asset type is INDEX.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.300023201.test.ads_gross</p>
             */
            public Builder sumTableGuid(String sumTableGuid) {
                this.sumTableGuid = sumTableGuid;
                return this;
            }

            /**
             * <p>The name of the aggregate table to which the asset belongs. Returned when the asset type is INDEX.</p>
             * 
             * <strong>example:</strong>
             * <p>ads_gross</p>
             */
            public Builder sumTableName(String sumTableName) {
                this.sumTableName = sumTableName;
                return this;
            }

            /**
             * <p>The lifecycle. Returned when the asset type is TABLE.</p>
             * 
             * <strong>example:</strong>
             * <p>36000</p>
             */
            public Builder tableLifeCycle(String tableLifeCycle) {
                this.tableLifeCycle = tableLifeCycle;
                return this;
            }

            /**
             * <p>The storage size. This parameter is returned only when the asset type is TABLE.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
