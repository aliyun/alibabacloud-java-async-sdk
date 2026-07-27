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
 * {@link GetKgRelationResponseBody} extends {@link TeaModel}
 *
 * <p>GetKgRelationResponseBody</p>
 */
public class GetKgRelationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RelationInfo")
    private RelationInfo relationInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetKgRelationResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.relationInfo = builder.relationInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKgRelationResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return relationInfo
     */
    public RelationInfo getRelationInfo() {
        return this.relationInfo;
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
        private String message; 
        private RelationInfo relationInfo; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetKgRelationResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.relationInfo = model.relationInfo;
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
         * RelationInfo.
         */
        public Builder relationInfo(RelationInfo relationInfo) {
            this.relationInfo = relationInfo;
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

        public GetKgRelationResponseBody build() {
            return new GetKgRelationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetKgRelationResponseBody} extends {@link TeaModel}
     *
     * <p>GetKgRelationResponseBody</p>
     */
    public static class PropertyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private PropertyList(Builder builder) {
            this.code = builder.code;
            this.dataType = builder.dataType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String code; 
            private String dataType; 
            private String value; 

            private Builder() {
            } 

            private Builder(PropertyList model) {
                this.code = model.code;
                this.dataType = model.dataType;
                this.value = model.value;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public PropertyList build() {
                return new PropertyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKgRelationResponseBody} extends {@link TeaModel}
     *
     * <p>GetKgRelationResponseBody</p>
     */
    public static class RelationInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PropertyList")
        private java.util.List<PropertyList> propertyList;

        @com.aliyun.core.annotation.NameInMap("RelationId")
        private String relationId;

        @com.aliyun.core.annotation.NameInMap("RelationType")
        private String relationType;

        @com.aliyun.core.annotation.NameInMap("SourceEntityId")
        private String sourceEntityId;

        @com.aliyun.core.annotation.NameInMap("TargetEntityId")
        private String targetEntityId;

        private RelationInfo(Builder builder) {
            this.propertyList = builder.propertyList;
            this.relationId = builder.relationId;
            this.relationType = builder.relationType;
            this.sourceEntityId = builder.sourceEntityId;
            this.targetEntityId = builder.targetEntityId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelationInfo create() {
            return builder().build();
        }

        /**
         * @return propertyList
         */
        public java.util.List<PropertyList> getPropertyList() {
            return this.propertyList;
        }

        /**
         * @return relationId
         */
        public String getRelationId() {
            return this.relationId;
        }

        /**
         * @return relationType
         */
        public String getRelationType() {
            return this.relationType;
        }

        /**
         * @return sourceEntityId
         */
        public String getSourceEntityId() {
            return this.sourceEntityId;
        }

        /**
         * @return targetEntityId
         */
        public String getTargetEntityId() {
            return this.targetEntityId;
        }

        public static final class Builder {
            private java.util.List<PropertyList> propertyList; 
            private String relationId; 
            private String relationType; 
            private String sourceEntityId; 
            private String targetEntityId; 

            private Builder() {
            } 

            private Builder(RelationInfo model) {
                this.propertyList = model.propertyList;
                this.relationId = model.relationId;
                this.relationType = model.relationType;
                this.sourceEntityId = model.sourceEntityId;
                this.targetEntityId = model.targetEntityId;
            } 

            /**
             * PropertyList.
             */
            public Builder propertyList(java.util.List<PropertyList> propertyList) {
                this.propertyList = propertyList;
                return this;
            }

            /**
             * RelationId.
             */
            public Builder relationId(String relationId) {
                this.relationId = relationId;
                return this;
            }

            /**
             * RelationType.
             */
            public Builder relationType(String relationType) {
                this.relationType = relationType;
                return this;
            }

            /**
             * SourceEntityId.
             */
            public Builder sourceEntityId(String sourceEntityId) {
                this.sourceEntityId = sourceEntityId;
                return this;
            }

            /**
             * TargetEntityId.
             */
            public Builder targetEntityId(String targetEntityId) {
                this.targetEntityId = targetEntityId;
                return this;
            }

            public RelationInfo build() {
                return new RelationInfo(this);
            } 

        } 

    }
}
