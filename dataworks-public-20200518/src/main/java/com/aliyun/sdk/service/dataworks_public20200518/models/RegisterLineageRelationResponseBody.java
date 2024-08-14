// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterLineageRelationResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterLineageRelationResponseBody</p>
 */
public class RegisterLineageRelationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("LineageRelation")
    private LineageRelation lineageRelation;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private RegisterLineageRelationResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.lineageRelation = builder.lineageRelation;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterLineageRelationResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return lineageRelation
     */
    public LineageRelation getLineageRelation() {
        return this.lineageRelation;
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
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private LineageRelation lineageRelation; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The lineage.
         */
        public Builder lineageRelation(LineageRelation lineageRelation) {
            this.lineageRelation = lineageRelation;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RegisterLineageRelationResponseBody build() {
            return new RegisterLineageRelationResponseBody(this);
        } 

    } 

    public static class LineageRelation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestEntityQualifiedName")
        private String destEntityQualifiedName;

        @com.aliyun.core.annotation.NameInMap("RelationshipGuid")
        private String relationshipGuid;

        @com.aliyun.core.annotation.NameInMap("SrcEntityQualifiedName")
        private String srcEntityQualifiedName;

        private LineageRelation(Builder builder) {
            this.destEntityQualifiedName = builder.destEntityQualifiedName;
            this.relationshipGuid = builder.relationshipGuid;
            this.srcEntityQualifiedName = builder.srcEntityQualifiedName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LineageRelation create() {
            return builder().build();
        }

        /**
         * @return destEntityQualifiedName
         */
        public String getDestEntityQualifiedName() {
            return this.destEntityQualifiedName;
        }

        /**
         * @return relationshipGuid
         */
        public String getRelationshipGuid() {
            return this.relationshipGuid;
        }

        /**
         * @return srcEntityQualifiedName
         */
        public String getSrcEntityQualifiedName() {
            return this.srcEntityQualifiedName;
        }

        public static final class Builder {
            private String destEntityQualifiedName; 
            private String relationshipGuid; 
            private String srcEntityQualifiedName; 

            /**
             * The unique identifier of the destination entity.
             */
            public Builder destEntityQualifiedName(String destEntityQualifiedName) {
                this.destEntityQualifiedName = destEntityQualifiedName;
                return this;
            }

            /**
             * The ID of the lineage between entities.
             */
            public Builder relationshipGuid(String relationshipGuid) {
                this.relationshipGuid = relationshipGuid;
                return this;
            }

            /**
             * The unique identifier of the source entity.
             */
            public Builder srcEntityQualifiedName(String srcEntityQualifiedName) {
                this.srcEntityQualifiedName = srcEntityQualifiedName;
                return this;
            }

            public LineageRelation build() {
                return new LineageRelation(this);
            } 

        } 

    }
}
