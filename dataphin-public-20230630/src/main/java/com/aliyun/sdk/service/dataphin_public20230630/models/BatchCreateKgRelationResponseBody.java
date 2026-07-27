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
 * {@link BatchCreateKgRelationResponseBody} extends {@link TeaModel}
 *
 * <p>BatchCreateKgRelationResponseBody</p>
 */
public class BatchCreateKgRelationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CreateResult")
    private CreateResult createResult;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private BatchCreateKgRelationResponseBody(Builder builder) {
        this.code = builder.code;
        this.createResult = builder.createResult;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateKgRelationResponseBody create() {
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
     * @return createResult
     */
    public CreateResult getCreateResult() {
        return this.createResult;
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
        private CreateResult createResult; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(BatchCreateKgRelationResponseBody model) {
            this.code = model.code;
            this.createResult = model.createResult;
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
         * CreateResult.
         */
        public Builder createResult(CreateResult createResult) {
            this.createResult = createResult;
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

        public BatchCreateKgRelationResponseBody build() {
            return new BatchCreateKgRelationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchCreateKgRelationResponseBody} extends {@link TeaModel}
     *
     * <p>BatchCreateKgRelationResponseBody</p>
     */
    public static class SuccessRelationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RelationId")
        private String relationId;

        @com.aliyun.core.annotation.NameInMap("RelationType")
        private String relationType;

        private SuccessRelationList(Builder builder) {
            this.relationId = builder.relationId;
            this.relationType = builder.relationType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessRelationList create() {
            return builder().build();
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

        public static final class Builder {
            private String relationId; 
            private String relationType; 

            private Builder() {
            } 

            private Builder(SuccessRelationList model) {
                this.relationId = model.relationId;
                this.relationType = model.relationType;
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

            public SuccessRelationList build() {
                return new SuccessRelationList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchCreateKgRelationResponseBody} extends {@link TeaModel}
     *
     * <p>BatchCreateKgRelationResponseBody</p>
     */
    public static class CreateResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailCount")
        private Integer failCount;

        @com.aliyun.core.annotation.NameInMap("SuccessCount")
        private Integer successCount;

        @com.aliyun.core.annotation.NameInMap("SuccessRelationList")
        private java.util.List<SuccessRelationList> successRelationList;

        private CreateResult(Builder builder) {
            this.failCount = builder.failCount;
            this.successCount = builder.successCount;
            this.successRelationList = builder.successRelationList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateResult create() {
            return builder().build();
        }

        /**
         * @return failCount
         */
        public Integer getFailCount() {
            return this.failCount;
        }

        /**
         * @return successCount
         */
        public Integer getSuccessCount() {
            return this.successCount;
        }

        /**
         * @return successRelationList
         */
        public java.util.List<SuccessRelationList> getSuccessRelationList() {
            return this.successRelationList;
        }

        public static final class Builder {
            private Integer failCount; 
            private Integer successCount; 
            private java.util.List<SuccessRelationList> successRelationList; 

            private Builder() {
            } 

            private Builder(CreateResult model) {
                this.failCount = model.failCount;
                this.successCount = model.successCount;
                this.successRelationList = model.successRelationList;
            } 

            /**
             * FailCount.
             */
            public Builder failCount(Integer failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * SuccessCount.
             */
            public Builder successCount(Integer successCount) {
                this.successCount = successCount;
                return this;
            }

            /**
             * SuccessRelationList.
             */
            public Builder successRelationList(java.util.List<SuccessRelationList> successRelationList) {
                this.successRelationList = successRelationList;
                return this;
            }

            public CreateResult build() {
                return new CreateResult(this);
            } 

        } 

    }
}
