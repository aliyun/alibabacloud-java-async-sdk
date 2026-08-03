// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link CreateGenerateAICoachScriptTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateGenerateAICoachScriptTaskRequest</p>
 */
public class CreateGenerateAICoachScriptTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("assessmentPoint")
    private Boolean assessmentPoint;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dialogueKey")
    private String dialogueKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dialogueUrl")
    private String dialogueUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("docList")
    private java.util.List<DocList> docList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("docUrlList")
    private java.util.List<String> docUrlList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scriptName")
    private String scriptName;

    private CreateGenerateAICoachScriptTaskRequest(Builder builder) {
        super(builder);
        this.assessmentPoint = builder.assessmentPoint;
        this.description = builder.description;
        this.dialogueKey = builder.dialogueKey;
        this.dialogueUrl = builder.dialogueUrl;
        this.docList = builder.docList;
        this.docUrlList = builder.docUrlList;
        this.scriptName = builder.scriptName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGenerateAICoachScriptTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assessmentPoint
     */
    public Boolean getAssessmentPoint() {
        return this.assessmentPoint;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dialogueKey
     */
    public String getDialogueKey() {
        return this.dialogueKey;
    }

    /**
     * @return dialogueUrl
     */
    public String getDialogueUrl() {
        return this.dialogueUrl;
    }

    /**
     * @return docList
     */
    public java.util.List<DocList> getDocList() {
        return this.docList;
    }

    /**
     * @return docUrlList
     */
    public java.util.List<String> getDocUrlList() {
        return this.docUrlList;
    }

    /**
     * @return scriptName
     */
    public String getScriptName() {
        return this.scriptName;
    }

    public static final class Builder extends Request.Builder<CreateGenerateAICoachScriptTaskRequest, Builder> {
        private Boolean assessmentPoint; 
        private String description; 
        private String dialogueKey; 
        private String dialogueUrl; 
        private java.util.List<DocList> docList; 
        private java.util.List<String> docUrlList; 
        private String scriptName; 

        private Builder() {
            super();
        } 

        private Builder(CreateGenerateAICoachScriptTaskRequest request) {
            super(request);
            this.assessmentPoint = request.assessmentPoint;
            this.description = request.description;
            this.dialogueKey = request.dialogueKey;
            this.dialogueUrl = request.dialogueUrl;
            this.docList = request.docList;
            this.docUrlList = request.docUrlList;
            this.scriptName = request.scriptName;
        } 

        /**
         * assessmentPoint.
         */
        public Builder assessmentPoint(Boolean assessmentPoint) {
            this.putBodyParameter("assessmentPoint", assessmentPoint);
            this.assessmentPoint = assessmentPoint;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * dialogueKey.
         */
        public Builder dialogueKey(String dialogueKey) {
            this.putBodyParameter("dialogueKey", dialogueKey);
            this.dialogueKey = dialogueKey;
            return this;
        }

        /**
         * dialogueUrl.
         */
        public Builder dialogueUrl(String dialogueUrl) {
            this.putBodyParameter("dialogueUrl", dialogueUrl);
            this.dialogueUrl = dialogueUrl;
            return this;
        }

        /**
         * docList.
         */
        public Builder docList(java.util.List<DocList> docList) {
            this.putBodyParameter("docList", docList);
            this.docList = docList;
            return this;
        }

        /**
         * docUrlList.
         */
        public Builder docUrlList(java.util.List<String> docUrlList) {
            this.putBodyParameter("docUrlList", docUrlList);
            this.docUrlList = docUrlList;
            return this;
        }

        /**
         * scriptName.
         */
        public Builder scriptName(String scriptName) {
            this.putBodyParameter("scriptName", scriptName);
            this.scriptName = scriptName;
            return this;
        }

        @Override
        public CreateGenerateAICoachScriptTaskRequest build() {
            return new CreateGenerateAICoachScriptTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateGenerateAICoachScriptTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateGenerateAICoachScriptTaskRequest</p>
     */
    public static class DocList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("docId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("docName")
        private String docName;

        @com.aliyun.core.annotation.NameInMap("kbId")
        private String kbId;

        private DocList(Builder builder) {
            this.docId = builder.docId;
            this.docName = builder.docName;
            this.kbId = builder.kbId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DocList create() {
            return builder().build();
        }

        /**
         * @return docId
         */
        public String getDocId() {
            return this.docId;
        }

        /**
         * @return docName
         */
        public String getDocName() {
            return this.docName;
        }

        /**
         * @return kbId
         */
        public String getKbId() {
            return this.kbId;
        }

        public static final class Builder {
            private String docId; 
            private String docName; 
            private String kbId; 

            private Builder() {
            } 

            private Builder(DocList model) {
                this.docId = model.docId;
                this.docName = model.docName;
                this.kbId = model.kbId;
            } 

            /**
             * docId.
             */
            public Builder docId(String docId) {
                this.docId = docId;
                return this;
            }

            /**
             * docName.
             */
            public Builder docName(String docName) {
                this.docName = docName;
                return this;
            }

            /**
             * kbId.
             */
            public Builder kbId(String kbId) {
                this.kbId = kbId;
                return this;
            }

            public DocList build() {
                return new DocList(this);
            } 

        } 

    }
}
