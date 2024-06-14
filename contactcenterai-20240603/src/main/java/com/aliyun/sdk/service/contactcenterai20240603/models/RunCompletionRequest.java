// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.contactcenterai20240603.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunCompletionRequest} extends {@link RequestModel}
 *
 * <p>RunCompletionRequest</p>
 */
public class RunCompletionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Dialogue")
    @com.aliyun.core.annotation.Validation(required = true)
    private Dialogue dialogue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Dimensions")
    private java.util.List < Dimensions> dimensions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Fields")
    private java.util.List < Fields> fields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModelCode")
    private String modelCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Stream")
    private Boolean stream;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Long > templateIds;

    private RunCompletionRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.appId = builder.appId;
        this.regionId = builder.regionId;
        this.dialogue = builder.dialogue;
        this.dimensions = builder.dimensions;
        this.fields = builder.fields;
        this.modelCode = builder.modelCode;
        this.stream = builder.stream;
        this.templateIds = builder.templateIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunCompletionRequest create() {
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
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return dialogue
     */
    public Dialogue getDialogue() {
        return this.dialogue;
    }

    /**
     * @return dimensions
     */
    public java.util.List < Dimensions> getDimensions() {
        return this.dimensions;
    }

    /**
     * @return fields
     */
    public java.util.List < Fields> getFields() {
        return this.fields;
    }

    /**
     * @return modelCode
     */
    public String getModelCode() {
        return this.modelCode;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    /**
     * @return templateIds
     */
    public java.util.List < Long > getTemplateIds() {
        return this.templateIds;
    }

    public static final class Builder extends Request.Builder<RunCompletionRequest, Builder> {
        private String workspaceId; 
        private String appId; 
        private String regionId; 
        private Dialogue dialogue; 
        private java.util.List < Dimensions> dimensions; 
        private java.util.List < Fields> fields; 
        private String modelCode; 
        private Boolean stream; 
        private java.util.List < Long > templateIds; 

        private Builder() {
            super();
        } 

        private Builder(RunCompletionRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.appId = request.appId;
            this.regionId = request.regionId;
            this.dialogue = request.dialogue;
            this.dimensions = request.dimensions;
            this.fields = request.fields;
            this.modelCode = request.modelCode;
            this.stream = request.stream;
            this.templateIds = request.templateIds;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * appId.
         */
        public Builder appId(String appId) {
            this.putPathParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Dialogue.
         */
        public Builder dialogue(Dialogue dialogue) {
            this.putBodyParameter("Dialogue", dialogue);
            this.dialogue = dialogue;
            return this;
        }

        /**
         * Dimensions.
         */
        public Builder dimensions(java.util.List < Dimensions> dimensions) {
            this.putBodyParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * Fields.
         */
        public Builder fields(java.util.List < Fields> fields) {
            this.putBodyParameter("Fields", fields);
            this.fields = fields;
            return this;
        }

        /**
         * ModelCode.
         */
        public Builder modelCode(String modelCode) {
            this.putBodyParameter("ModelCode", modelCode);
            this.modelCode = modelCode;
            return this;
        }

        /**
         * Stream.
         */
        public Builder stream(Boolean stream) {
            this.putBodyParameter("Stream", stream);
            this.stream = stream;
            return this;
        }

        /**
         * TemplateIds.
         */
        public Builder templateIds(java.util.List < Long > templateIds) {
            this.putBodyParameter("TemplateIds", templateIds);
            this.templateIds = templateIds;
            return this;
        }

        @Override
        public RunCompletionRequest build() {
            return new RunCompletionRequest(this);
        } 

    } 

    public static class Sentences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChatId")
        private String chatId;

        @com.aliyun.core.annotation.NameInMap("Role")
        @com.aliyun.core.annotation.Validation(required = true)
        private String role;

        @com.aliyun.core.annotation.NameInMap("Text")
        @com.aliyun.core.annotation.Validation(required = true)
        private String text;

        private Sentences(Builder builder) {
            this.chatId = builder.chatId;
            this.role = builder.role;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sentences create() {
            return builder().build();
        }

        /**
         * @return chatId
         */
        public String getChatId() {
            return this.chatId;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String chatId; 
            private String role; 
            private String text; 

            /**
             * ChatId.
             */
            public Builder chatId(String chatId) {
                this.chatId = chatId;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Sentences build() {
                return new Sentences(this);
            } 

        } 

    }
    public static class Dialogue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Sentences")
        private java.util.List < Sentences> sentences;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        private Dialogue(Builder builder) {
            this.sentences = builder.sentences;
            this.sessionId = builder.sessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dialogue create() {
            return builder().build();
        }

        /**
         * @return sentences
         */
        public java.util.List < Sentences> getSentences() {
            return this.sentences;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        public static final class Builder {
            private java.util.List < Sentences> sentences; 
            private String sessionId; 

            /**
             * Sentences.
             */
            public Builder sentences(java.util.List < Sentences> sentences) {
                this.sentences = sentences;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            public Dialogue build() {
                return new Dialogue(this);
            } 

        } 

    }
    public static class Dimensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        private Dimensions(Builder builder) {
            this.desc = builder.desc;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dimensions create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String desc; 
            private String name; 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Dimensions build() {
                return new Dimensions(this);
            } 

        } 

    }
    public static class Fields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Enums")
        private java.util.List < String > enums;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        private Fields(Builder builder) {
            this.code = builder.code;
            this.desc = builder.desc;
            this.enums = builder.enums;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fields create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return enums
         */
        public java.util.List < String > getEnums() {
            return this.enums;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String desc; 
            private java.util.List < String > enums; 
            private String name; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Enums.
             */
            public Builder enums(java.util.List < String > enums) {
                this.enums = enums;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Fields build() {
                return new Fields(this);
            } 

        } 

    }
}
