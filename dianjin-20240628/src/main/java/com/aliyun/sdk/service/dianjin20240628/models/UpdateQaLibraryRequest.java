// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link UpdateQaLibraryRequest} extends {@link RequestModel}
 *
 * <p>UpdateQaLibraryRequest</p>
 */
public class UpdateQaLibraryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parseQaResults")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ParseQaResults> parseQaResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("qaLibraryId")
    private String qaLibraryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    private UpdateQaLibraryRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.parseQaResults = builder.parseQaResults;
        this.qaLibraryId = builder.qaLibraryId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateQaLibraryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return parseQaResults
     */
    public java.util.List<ParseQaResults> getParseQaResults() {
        return this.parseQaResults;
    }

    /**
     * @return qaLibraryId
     */
    public String getQaLibraryId() {
        return this.qaLibraryId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder extends Request.Builder<UpdateQaLibraryRequest, Builder> {
        private String workspaceId; 
        private java.util.List<ParseQaResults> parseQaResults; 
        private String qaLibraryId; 
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateQaLibraryRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.parseQaResults = request.parseQaResults;
            this.qaLibraryId = request.qaLibraryId;
            this.requestId = request.requestId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder parseQaResults(java.util.List<ParseQaResults> parseQaResults) {
            this.putBodyParameter("parseQaResults", parseQaResults);
            this.parseQaResults = parseQaResults;
            return this;
        }

        /**
         * qaLibraryId.
         */
        public Builder qaLibraryId(String qaLibraryId) {
            this.putBodyParameter("qaLibraryId", qaLibraryId);
            this.qaLibraryId = qaLibraryId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0FC6636E-380A-5369-AE01-D1C15BB9B254</p>
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("requestId", requestId);
            this.requestId = requestId;
            return this;
        }

        @Override
        public UpdateQaLibraryRequest build() {
            return new UpdateQaLibraryRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateQaLibraryRequest} extends {@link TeaModel}
     *
     * <p>UpdateQaLibraryRequest</p>
     */
    public static class ParseQaResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("answer")
        @com.aliyun.core.annotation.Validation(required = true)
        private String answer;

        @com.aliyun.core.annotation.NameInMap("question")
        @com.aliyun.core.annotation.Validation(required = true)
        private String question;

        private ParseQaResults(Builder builder) {
            this.answer = builder.answer;
            this.question = builder.question;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParseQaResults create() {
            return builder().build();
        }

        /**
         * @return answer
         */
        public String getAnswer() {
            return this.answer;
        }

        /**
         * @return question
         */
        public String getQuestion() {
            return this.question;
        }

        public static final class Builder {
            private String answer; 
            private String question; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder answer(String answer) {
                this.answer = answer;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder question(String question) {
                this.question = question;
                return this;
            }

            public ParseQaResults build() {
                return new ParseQaResults(this);
            } 

        } 

    }
}
