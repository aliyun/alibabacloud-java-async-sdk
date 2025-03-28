// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(RegisterLineageRelationResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.lineageRelation = model.lineageRelation;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>1010210001</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The entity of lineage not exist, xxx</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * <p>The lineage.</p>
         */
        public Builder lineageRelation(LineageRelation lineageRelation) {
            this.lineageRelation = lineageRelation;
            return this;
        }

        /**
         * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE50E05E-028C-182B-9xxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RegisterLineageRelationResponseBody build() {
            return new RegisterLineageRelationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RegisterLineageRelationResponseBody} extends {@link TeaModel}
     *
     * <p>RegisterLineageRelationResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(LineageRelation model) {
                this.destEntityQualifiedName = model.destEntityQualifiedName;
                this.relationshipGuid = model.relationshipGuid;
                this.srcEntityQualifiedName = model.srcEntityQualifiedName;
            } 

            /**
             * <p>The unique identifier of the destination entity.</p>
             * 
             * <strong>example:</strong>
             * <p>custom-report.month_stat_user</p>
             */
            public Builder destEntityQualifiedName(String destEntityQualifiedName) {
                this.destEntityQualifiedName = destEntityQualifiedName;
                return this;
            }

            /**
             * <p>The ID of the lineage between entities.</p>
             * 
             * <strong>example:</strong>
             * <p>dfsldfdlsfdsaaaabbbb</p>
             */
            public Builder relationshipGuid(String relationshipGuid) {
                this.relationshipGuid = relationshipGuid;
                return this;
            }

            /**
             * <p>The unique identifier of the source entity.</p>
             * 
             * <strong>example:</strong>
             * <p>maxcompute-table.project.table</p>
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
