// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeIntentionRequest} extends {@link RequestModel}
 *
 * <p>RecognizeIntentionRequest</p>
 */
public class RecognizeIntentionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("analysis")
    private Boolean analysis;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("bizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("conversation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String conversation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("globalIntentionList")
    private java.util.List < GlobalIntentionList> globalIntentionList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("hierarchicalIntentionList")
    private java.util.List < HierarchicalIntentionList> hierarchicalIntentionList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("intentionList")
    private java.util.List < IntentionList> intentionList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("opType")
    private String opType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("recommend")
    private Boolean recommend;

    private RecognizeIntentionRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.analysis = builder.analysis;
        this.bizType = builder.bizType;
        this.conversation = builder.conversation;
        this.globalIntentionList = builder.globalIntentionList;
        this.hierarchicalIntentionList = builder.hierarchicalIntentionList;
        this.intentionList = builder.intentionList;
        this.opType = builder.opType;
        this.recommend = builder.recommend;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeIntentionRequest create() {
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
     * @return analysis
     */
    public Boolean getAnalysis() {
        return this.analysis;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return conversation
     */
    public String getConversation() {
        return this.conversation;
    }

    /**
     * @return globalIntentionList
     */
    public java.util.List < GlobalIntentionList> getGlobalIntentionList() {
        return this.globalIntentionList;
    }

    /**
     * @return hierarchicalIntentionList
     */
    public java.util.List < HierarchicalIntentionList> getHierarchicalIntentionList() {
        return this.hierarchicalIntentionList;
    }

    /**
     * @return intentionList
     */
    public java.util.List < IntentionList> getIntentionList() {
        return this.intentionList;
    }

    /**
     * @return opType
     */
    public String getOpType() {
        return this.opType;
    }

    /**
     * @return recommend
     */
    public Boolean getRecommend() {
        return this.recommend;
    }

    public static final class Builder extends Request.Builder<RecognizeIntentionRequest, Builder> {
        private String workspaceId; 
        private Boolean analysis; 
        private String bizType; 
        private String conversation; 
        private java.util.List < GlobalIntentionList> globalIntentionList; 
        private java.util.List < HierarchicalIntentionList> hierarchicalIntentionList; 
        private java.util.List < IntentionList> intentionList; 
        private String opType; 
        private Boolean recommend; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeIntentionRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.analysis = request.analysis;
            this.bizType = request.bizType;
            this.conversation = request.conversation;
            this.globalIntentionList = request.globalIntentionList;
            this.hierarchicalIntentionList = request.hierarchicalIntentionList;
            this.intentionList = request.intentionList;
            this.opType = request.opType;
            this.recommend = request.recommend;
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
         * analysis.
         */
        public Builder analysis(Boolean analysis) {
            this.putBodyParameter("analysis", analysis);
            this.analysis = analysis;
            return this;
        }

        /**
         * bizType.
         */
        public Builder bizType(String bizType) {
            this.putBodyParameter("bizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * conversation.
         */
        public Builder conversation(String conversation) {
            this.putBodyParameter("conversation", conversation);
            this.conversation = conversation;
            return this;
        }

        /**
         * globalIntentionList.
         */
        public Builder globalIntentionList(java.util.List < GlobalIntentionList> globalIntentionList) {
            this.putBodyParameter("globalIntentionList", globalIntentionList);
            this.globalIntentionList = globalIntentionList;
            return this;
        }

        /**
         * hierarchicalIntentionList.
         */
        public Builder hierarchicalIntentionList(java.util.List < HierarchicalIntentionList> hierarchicalIntentionList) {
            this.putBodyParameter("hierarchicalIntentionList", hierarchicalIntentionList);
            this.hierarchicalIntentionList = hierarchicalIntentionList;
            return this;
        }

        /**
         * intentionList.
         */
        public Builder intentionList(java.util.List < IntentionList> intentionList) {
            this.putBodyParameter("intentionList", intentionList);
            this.intentionList = intentionList;
            return this;
        }

        /**
         * opType.
         */
        public Builder opType(String opType) {
            this.putBodyParameter("opType", opType);
            this.opType = opType;
            return this;
        }

        /**
         * recommend.
         */
        public Builder recommend(Boolean recommend) {
            this.putBodyParameter("recommend", recommend);
            this.recommend = recommend;
            return this;
        }

        @Override
        public RecognizeIntentionRequest build() {
            return new RecognizeIntentionRequest(this);
        } 

    } 

    public static class GlobalIntentionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("intention")
        private String intention;

        @com.aliyun.core.annotation.NameInMap("intentionCode")
        private String intentionCode;

        private GlobalIntentionList(Builder builder) {
            this.description = builder.description;
            this.intention = builder.intention;
            this.intentionCode = builder.intentionCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalIntentionList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return intention
         */
        public String getIntention() {
            return this.intention;
        }

        /**
         * @return intentionCode
         */
        public String getIntentionCode() {
            return this.intentionCode;
        }

        public static final class Builder {
            private String description; 
            private String intention; 
            private String intentionCode; 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * intention.
             */
            public Builder intention(String intention) {
                this.intention = intention;
                return this;
            }

            /**
             * intentionCode.
             */
            public Builder intentionCode(String intentionCode) {
                this.intentionCode = intentionCode;
                return this;
            }

            public GlobalIntentionList build() {
                return new GlobalIntentionList(this);
            } 

        } 

    }
    public static class HierarchicalIntentionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("intention")
        private String intention;

        @com.aliyun.core.annotation.NameInMap("intentionCode")
        private String intentionCode;

        private HierarchicalIntentionList(Builder builder) {
            this.description = builder.description;
            this.intention = builder.intention;
            this.intentionCode = builder.intentionCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HierarchicalIntentionList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return intention
         */
        public String getIntention() {
            return this.intention;
        }

        /**
         * @return intentionCode
         */
        public String getIntentionCode() {
            return this.intentionCode;
        }

        public static final class Builder {
            private String description; 
            private String intention; 
            private String intentionCode; 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * intention.
             */
            public Builder intention(String intention) {
                this.intention = intention;
                return this;
            }

            /**
             * intentionCode.
             */
            public Builder intentionCode(String intentionCode) {
                this.intentionCode = intentionCode;
                return this;
            }

            public HierarchicalIntentionList build() {
                return new HierarchicalIntentionList(this);
            } 

        } 

    }
    public static class IntentionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("intention")
        private String intention;

        @com.aliyun.core.annotation.NameInMap("intentionCode")
        private String intentionCode;

        private IntentionList(Builder builder) {
            this.description = builder.description;
            this.intention = builder.intention;
            this.intentionCode = builder.intentionCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IntentionList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return intention
         */
        public String getIntention() {
            return this.intention;
        }

        /**
         * @return intentionCode
         */
        public String getIntentionCode() {
            return this.intentionCode;
        }

        public static final class Builder {
            private String description; 
            private String intention; 
            private String intentionCode; 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * intention.
             */
            public Builder intention(String intention) {
                this.intention = intention;
                return this;
            }

            /**
             * intentionCode.
             */
            public Builder intentionCode(String intentionCode) {
                this.intentionCode = intentionCode;
                return this;
            }

            public IntentionList build() {
                return new IntentionList(this);
            } 

        } 

    }
}
