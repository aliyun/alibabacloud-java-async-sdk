// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetTicketResponseBody} extends {@link TeaModel}
 *
 * <p>GetTicketResponseBody</p>
 */
public class GetTicketResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("creator")
    private Creator creator;

    @com.aliyun.core.annotation.NameInMap("customFields")
    private String customFields;

    @com.aliyun.core.annotation.NameInMap("openConversationId")
    private String openConversationId;

    @com.aliyun.core.annotation.NameInMap("openTicketId")
    private String openTicketId;

    @com.aliyun.core.annotation.NameInMap("processor")
    private Processor processor;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("scene")
    private String scene;

    @com.aliyun.core.annotation.NameInMap("sceneContext")
    private String sceneContext;

    @com.aliyun.core.annotation.NameInMap("stage")
    private String stage;

    @com.aliyun.core.annotation.NameInMap("takers")
    private java.util.List<Takers> takers;

    @com.aliyun.core.annotation.NameInMap("template")
    private Template template;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetTicketResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.creator = builder.creator;
        this.customFields = builder.customFields;
        this.openConversationId = builder.openConversationId;
        this.openTicketId = builder.openTicketId;
        this.processor = builder.processor;
        this.requestId = builder.requestId;
        this.scene = builder.scene;
        this.sceneContext = builder.sceneContext;
        this.stage = builder.stage;
        this.takers = builder.takers;
        this.template = builder.template;
        this.title = builder.title;
        this.updateTime = builder.updateTime;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTicketResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return creator
     */
    public Creator getCreator() {
        return this.creator;
    }

    /**
     * @return customFields
     */
    public String getCustomFields() {
        return this.customFields;
    }

    /**
     * @return openConversationId
     */
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    /**
     * @return openTicketId
     */
    public String getOpenTicketId() {
        return this.openTicketId;
    }

    /**
     * @return processor
     */
    public Processor getProcessor() {
        return this.processor;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return sceneContext
     */
    public String getSceneContext() {
        return this.sceneContext;
    }

    /**
     * @return stage
     */
    public String getStage() {
        return this.stage;
    }

    /**
     * @return takers
     */
    public java.util.List<Takers> getTakers() {
        return this.takers;
    }

    /**
     * @return template
     */
    public Template getTemplate() {
        return this.template;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private String createTime; 
        private Creator creator; 
        private String customFields; 
        private String openConversationId; 
        private String openTicketId; 
        private Processor processor; 
        private String requestId; 
        private String scene; 
        private String sceneContext; 
        private String stage; 
        private java.util.List<Takers> takers; 
        private Template template; 
        private String title; 
        private String updateTime; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * creator.
         */
        public Builder creator(Creator creator) {
            this.creator = creator;
            return this;
        }

        /**
         * customFields.
         */
        public Builder customFields(String customFields) {
            this.customFields = customFields;
            return this;
        }

        /**
         * openConversationId.
         */
        public Builder openConversationId(String openConversationId) {
            this.openConversationId = openConversationId;
            return this;
        }

        /**
         * openTicketId.
         */
        public Builder openTicketId(String openTicketId) {
            this.openTicketId = openTicketId;
            return this;
        }

        /**
         * processor.
         */
        public Builder processor(Processor processor) {
            this.processor = processor;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * scene.
         */
        public Builder scene(String scene) {
            this.scene = scene;
            return this;
        }

        /**
         * sceneContext.
         */
        public Builder sceneContext(String sceneContext) {
            this.sceneContext = sceneContext;
            return this;
        }

        /**
         * stage.
         */
        public Builder stage(String stage) {
            this.stage = stage;
            return this;
        }

        /**
         * takers.
         */
        public Builder takers(java.util.List<Takers> takers) {
            this.takers = takers;
            return this;
        }

        /**
         * template.
         */
        public Builder template(Template template) {
            this.template = template;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * updateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public GetTicketResponseBody build() {
            return new GetTicketResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTicketResponseBody} extends {@link TeaModel}
     *
     * <p>GetTicketResponseBody</p>
     */
    public static class Creator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("UnionId")
        private String unionId;

        private Creator(Builder builder) {
            this.nickName = builder.nickName;
            this.unionId = builder.unionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Creator create() {
            return builder().build();
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return unionId
         */
        public String getUnionId() {
            return this.unionId;
        }

        public static final class Builder {
            private String nickName; 
            private String unionId; 

            /**
             * NickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * UnionId.
             */
            public Builder unionId(String unionId) {
                this.unionId = unionId;
                return this;
            }

            public Creator build() {
                return new Creator(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTicketResponseBody} extends {@link TeaModel}
     *
     * <p>GetTicketResponseBody</p>
     */
    public static class Processor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("UnionId")
        private String unionId;

        private Processor(Builder builder) {
            this.nickName = builder.nickName;
            this.unionId = builder.unionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Processor create() {
            return builder().build();
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return unionId
         */
        public String getUnionId() {
            return this.unionId;
        }

        public static final class Builder {
            private String nickName; 
            private String unionId; 

            /**
             * NickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * UnionId.
             */
            public Builder unionId(String unionId) {
                this.unionId = unionId;
                return this;
            }

            public Processor build() {
                return new Processor(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTicketResponseBody} extends {@link TeaModel}
     *
     * <p>GetTicketResponseBody</p>
     */
    public static class Takers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("UnionId")
        private String unionId;

        private Takers(Builder builder) {
            this.nickName = builder.nickName;
            this.unionId = builder.unionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Takers create() {
            return builder().build();
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return unionId
         */
        public String getUnionId() {
            return this.unionId;
        }

        public static final class Builder {
            private String nickName; 
            private String unionId; 

            /**
             * NickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * UnionId.
             */
            public Builder unionId(String unionId) {
                this.unionId = unionId;
                return this;
            }

            public Takers build() {
                return new Takers(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTicketResponseBody} extends {@link TeaModel}
     *
     * <p>GetTicketResponseBody</p>
     */
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OpenTemplateBizId")
        private String openTemplateBizId;

        @com.aliyun.core.annotation.NameInMap("OpenTemplateId")
        private String openTemplateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private Template(Builder builder) {
            this.openTemplateBizId = builder.openTemplateBizId;
            this.openTemplateId = builder.openTemplateId;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return openTemplateBizId
         */
        public String getOpenTemplateBizId() {
            return this.openTemplateBizId;
        }

        /**
         * @return openTemplateId
         */
        public String getOpenTemplateId() {
            return this.openTemplateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private String openTemplateBizId; 
            private String openTemplateId; 
            private String templateName; 

            /**
             * <p>OpenTemplateBizId</p>
             * 
             * <strong>example:</strong>
             * <p>OpenTemplateBizId</p>
             */
            public Builder openTemplateBizId(String openTemplateBizId) {
                this.openTemplateBizId = openTemplateBizId;
                return this;
            }

            /**
             * <p>OpenTemplateBizId</p>
             * 
             * <strong>example:</strong>
             * <p>OpenTemplateBizId</p>
             */
            public Builder openTemplateId(String openTemplateId) {
                this.openTemplateId = openTemplateId;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
}
