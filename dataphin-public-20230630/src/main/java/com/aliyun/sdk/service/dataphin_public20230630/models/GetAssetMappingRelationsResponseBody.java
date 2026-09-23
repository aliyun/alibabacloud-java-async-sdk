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
 * {@link GetAssetMappingRelationsResponseBody} extends {@link TeaModel}
 *
 * <p>GetAssetMappingRelationsResponseBody</p>
 */
public class GetAssetMappingRelationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("MappingRelationList")
    private java.util.List<MappingRelationList> mappingRelationList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAssetMappingRelationsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.mappingRelationList = builder.mappingRelationList;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAssetMappingRelationsResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return mappingRelationList
     */
    public java.util.List<MappingRelationList> getMappingRelationList() {
        return this.mappingRelationList;
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
        private Integer httpStatusCode; 
        private java.util.List<MappingRelationList> mappingRelationList; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAssetMappingRelationsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.mappingRelationList = model.mappingRelationList;
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
         * <p>The list of mapping relationships.</p>
         */
        public Builder mappingRelationList(java.util.List<MappingRelationList> mappingRelationList) {
            this.mappingRelationList = mappingRelationList;
            return this;
        }

        /**
         * <p>The error details from the backend response.</p>
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

        public GetAssetMappingRelationsResponseBody build() {
            return new GetAssetMappingRelationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAssetMappingRelationsResponseBody} extends {@link TeaModel}
     *
     * <p>GetAssetMappingRelationsResponseBody</p>
     */
    public static class MappingRelationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetType")
        private String assetType;

        @com.aliyun.core.annotation.NameInMap("Guid")
        private String guid;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("StandardCode")
        private String standardCode;

        @com.aliyun.core.annotation.NameInMap("StandardId")
        private Long standardId;

        @com.aliyun.core.annotation.NameInMap("StandardName")
        private String standardName;

        @com.aliyun.core.annotation.NameInMap("StandardSetDirectory")
        private String standardSetDirectory;

        @com.aliyun.core.annotation.NameInMap("StandardSetId")
        private Long standardSetId;

        @com.aliyun.core.annotation.NameInMap("StandardSetName")
        private String standardSetName;

        @com.aliyun.core.annotation.NameInMap("StandardStage")
        private String standardStage;

        private MappingRelationList(Builder builder) {
            this.assetType = builder.assetType;
            this.guid = builder.guid;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.standardCode = builder.standardCode;
            this.standardId = builder.standardId;
            this.standardName = builder.standardName;
            this.standardSetDirectory = builder.standardSetDirectory;
            this.standardSetId = builder.standardSetId;
            this.standardSetName = builder.standardSetName;
            this.standardStage = builder.standardStage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MappingRelationList create() {
            return builder().build();
        }

        /**
         * @return assetType
         */
        public String getAssetType() {
            return this.assetType;
        }

        /**
         * @return guid
         */
        public String getGuid() {
            return this.guid;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return standardCode
         */
        public String getStandardCode() {
            return this.standardCode;
        }

        /**
         * @return standardId
         */
        public Long getStandardId() {
            return this.standardId;
        }

        /**
         * @return standardName
         */
        public String getStandardName() {
            return this.standardName;
        }

        /**
         * @return standardSetDirectory
         */
        public String getStandardSetDirectory() {
            return this.standardSetDirectory;
        }

        /**
         * @return standardSetId
         */
        public Long getStandardSetId() {
            return this.standardSetId;
        }

        /**
         * @return standardSetName
         */
        public String getStandardSetName() {
            return this.standardSetName;
        }

        /**
         * @return standardStage
         */
        public String getStandardStage() {
            return this.standardStage;
        }

        public static final class Builder {
            private String assetType; 
            private String guid; 
            private String modifyTime; 
            private String name; 
            private String standardCode; 
            private Long standardId; 
            private String standardName; 
            private String standardSetDirectory; 
            private Long standardSetId; 
            private String standardSetName; 
            private String standardStage; 

            private Builder() {
            } 

            private Builder(MappingRelationList model) {
                this.assetType = model.assetType;
                this.guid = model.guid;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.standardCode = model.standardCode;
                this.standardId = model.standardId;
                this.standardName = model.standardName;
                this.standardSetDirectory = model.standardSetDirectory;
                this.standardSetId = model.standardSetId;
                this.standardSetName = model.standardSetName;
                this.standardStage = model.standardStage;
            } 

            /**
             * <p>The Asset Type. Valid values:</p>
             * <ul>
             * <li>COLUMN: field.</li>
             * <li>INDEX: metric.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COLUMN</p>
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>The GUID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>1122</p>
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-30 00:00:00</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The name of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The code of the standard.</p>
             * 
             * <strong>example:</strong>
             * <p>cc</p>
             */
            public Builder standardCode(String standardCode) {
                this.standardCode = standardCode;
                return this;
            }

            /**
             * <p>The ID of the standard.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder standardId(Long standardId) {
                this.standardId = standardId;
                return this;
            }

            /**
             * <p>The name of the standard.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder standardName(String standardName) {
                this.standardName = standardName;
                return this;
            }

            /**
             * <p>The folder in which the standard set resides.</p>
             * 
             * <strong>example:</strong>
             * <p>/dir1</p>
             */
            public Builder standardSetDirectory(String standardSetDirectory) {
                this.standardSetDirectory = standardSetDirectory;
                return this;
            }

            /**
             * <p>The ID of the standard set.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder standardSetId(Long standardSetId) {
                this.standardSetId = standardSetId;
                return this;
            }

            /**
             * <p>The name of the standard set.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder standardSetName(String standardSetName) {
                this.standardSetName = standardSetName;
                return this;
            }

            /**
             * <p>The stage of the standard.</p>
             * 
             * <strong>example:</strong>
             * <p>PROD</p>
             */
            public Builder standardStage(String standardStage) {
                this.standardStage = standardStage;
                return this;
            }

            public MappingRelationList build() {
                return new MappingRelationList(this);
            } 

        } 

    }
}
