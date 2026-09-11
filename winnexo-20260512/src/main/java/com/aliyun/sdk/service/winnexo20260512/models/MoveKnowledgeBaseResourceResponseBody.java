// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link MoveKnowledgeBaseResourceResponseBody} extends {@link TeaModel}
 *
 * <p>MoveKnowledgeBaseResourceResponseBody</p>
 */
public class MoveKnowledgeBaseResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("knowledgeId")
    private String knowledgeId;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sourceDirectoryId")
    private String sourceDirectoryId;

    @com.aliyun.core.annotation.NameInMap("sourceId")
    private String sourceId;

    @com.aliyun.core.annotation.NameInMap("targetDirectoryId")
    private String targetDirectoryId;

    private MoveKnowledgeBaseResourceResponseBody(Builder builder) {
        this.code = builder.code;
        this.knowledgeId = builder.knowledgeId;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.sourceDirectoryId = builder.sourceDirectoryId;
        this.sourceId = builder.sourceId;
        this.targetDirectoryId = builder.targetDirectoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveKnowledgeBaseResourceResponseBody create() {
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
     * @return knowledgeId
     */
    public String getKnowledgeId() {
        return this.knowledgeId;
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
     * @return sourceDirectoryId
     */
    public String getSourceDirectoryId() {
        return this.sourceDirectoryId;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return targetDirectoryId
     */
    public String getTargetDirectoryId() {
        return this.targetDirectoryId;
    }

    public static final class Builder {
        private String code; 
        private String knowledgeId; 
        private String message; 
        private String requestId; 
        private String sourceDirectoryId; 
        private String sourceId; 
        private String targetDirectoryId; 

        private Builder() {
        } 

        private Builder(MoveKnowledgeBaseResourceResponseBody model) {
            this.code = model.code;
            this.knowledgeId = model.knowledgeId;
            this.message = model.message;
            this.requestId = model.requestId;
            this.sourceDirectoryId = model.sourceDirectoryId;
            this.sourceId = model.sourceId;
            this.targetDirectoryId = model.targetDirectoryId;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The target knowledge base ID. This value is echoed from the request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleKnowledgeId</p>
         */
        public Builder knowledgeId(String knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }

        /**
         * <p>The description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>375701FC-2FB9-5782-BE8F-A3F5E2F2158C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The source directory ID. This value is echoed from the request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSourceDirectoryId</p>
         */
        public Builder sourceDirectoryId(String sourceDirectoryId) {
            this.sourceDirectoryId = sourceDirectoryId;
            return this;
        }

        /**
         * <p>The unique identifier on the business system side, that is, the business ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2000358</p>
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The target directory ID. This value is echoed from the request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleTargetDirectoryId</p>
         */
        public Builder targetDirectoryId(String targetDirectoryId) {
            this.targetDirectoryId = targetDirectoryId;
            return this;
        }

        public MoveKnowledgeBaseResourceResponseBody build() {
            return new MoveKnowledgeBaseResourceResponseBody(this);
        } 

    } 

}
