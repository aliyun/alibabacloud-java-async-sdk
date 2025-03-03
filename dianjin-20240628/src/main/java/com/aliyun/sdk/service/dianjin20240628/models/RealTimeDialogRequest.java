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
 * {@link RealTimeDialogRequest} extends {@link RequestModel}
 *
 * <p>RealTimeDialogRequest</p>
 */
public class RealTimeDialogRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("analysis")
    private Boolean analysis;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("bizType")
    private String bizType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("conversationModel")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ConversationModel> conversationModel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dialogMemoryTurns")
    private Integer dialogMemoryTurns;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("metaData")
    private java.util.Map<String, ?> metaData;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("recommend")
    private Boolean recommend;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scriptContentPlayed")
    private String scriptContentPlayed;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stream")
    private Boolean stream;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userVad")
    private Boolean userVad;

    private RealTimeDialogRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.analysis = builder.analysis;
        this.bizType = builder.bizType;
        this.conversationModel = builder.conversationModel;
        this.dialogMemoryTurns = builder.dialogMemoryTurns;
        this.metaData = builder.metaData;
        this.recommend = builder.recommend;
        this.scriptContentPlayed = builder.scriptContentPlayed;
        this.sessionId = builder.sessionId;
        this.stream = builder.stream;
        this.userVad = builder.userVad;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RealTimeDialogRequest create() {
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
     * @return conversationModel
     */
    public java.util.List<ConversationModel> getConversationModel() {
        return this.conversationModel;
    }

    /**
     * @return dialogMemoryTurns
     */
    public Integer getDialogMemoryTurns() {
        return this.dialogMemoryTurns;
    }

    /**
     * @return metaData
     */
    public java.util.Map<String, ?> getMetaData() {
        return this.metaData;
    }

    /**
     * @return recommend
     */
    public Boolean getRecommend() {
        return this.recommend;
    }

    /**
     * @return scriptContentPlayed
     */
    public String getScriptContentPlayed() {
        return this.scriptContentPlayed;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    /**
     * @return userVad
     */
    public Boolean getUserVad() {
        return this.userVad;
    }

    public static final class Builder extends Request.Builder<RealTimeDialogRequest, Builder> {
        private String workspaceId; 
        private Boolean analysis; 
        private String bizType; 
        private java.util.List<ConversationModel> conversationModel; 
        private Integer dialogMemoryTurns; 
        private java.util.Map<String, ?> metaData; 
        private Boolean recommend; 
        private String scriptContentPlayed; 
        private String sessionId; 
        private Boolean stream; 
        private Boolean userVad; 

        private Builder() {
            super();
        } 

        private Builder(RealTimeDialogRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.analysis = request.analysis;
            this.bizType = request.bizType;
            this.conversationModel = request.conversationModel;
            this.dialogMemoryTurns = request.dialogMemoryTurns;
            this.metaData = request.metaData;
            this.recommend = request.recommend;
            this.scriptContentPlayed = request.scriptContentPlayed;
            this.sessionId = request.sessionId;
            this.stream = request.stream;
            this.userVad = request.userVad;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxxxx</p>
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
         * <p>This parameter is required.</p>
         */
        public Builder conversationModel(java.util.List<ConversationModel> conversationModel) {
            this.putBodyParameter("conversationModel", conversationModel);
            this.conversationModel = conversationModel;
            return this;
        }

        /**
         * dialogMemoryTurns.
         */
        public Builder dialogMemoryTurns(Integer dialogMemoryTurns) {
            this.putBodyParameter("dialogMemoryTurns", dialogMemoryTurns);
            this.dialogMemoryTurns = dialogMemoryTurns;
            return this;
        }

        /**
         * metaData.
         */
        public Builder metaData(java.util.Map<String, ?> metaData) {
            this.putBodyParameter("metaData", metaData);
            this.metaData = metaData;
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

        /**
         * scriptContentPlayed.
         */
        public Builder scriptContentPlayed(String scriptContentPlayed) {
            this.putBodyParameter("scriptContentPlayed", scriptContentPlayed);
            this.scriptContentPlayed = scriptContentPlayed;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>237645726354</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * stream.
         */
        public Builder stream(Boolean stream) {
            this.putBodyParameter("stream", stream);
            this.stream = stream;
            return this;
        }

        /**
         * userVad.
         */
        public Builder userVad(Boolean userVad) {
            this.putBodyParameter("userVad", userVad);
            this.userVad = userVad;
            return this;
        }

        @Override
        public RealTimeDialogRequest build() {
            return new RealTimeDialogRequest(this);
        } 

    } 

    /**
     * 
     * {@link RealTimeDialogRequest} extends {@link TeaModel}
     *
     * <p>RealTimeDialogRequest</p>
     */
    public static class ConversationModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("begin")
        private Integer begin;

        @com.aliyun.core.annotation.NameInMap("beginTime")
        private String beginTime;

        @com.aliyun.core.annotation.NameInMap("content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("customerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("customerServiceId")
        private String customerServiceId;

        @com.aliyun.core.annotation.NameInMap("customerServiceType")
        private String customerServiceType;

        @com.aliyun.core.annotation.NameInMap("end")
        private Integer end;

        @com.aliyun.core.annotation.NameInMap("role")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer role;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private ConversationModel(Builder builder) {
            this.begin = builder.begin;
            this.beginTime = builder.beginTime;
            this.content = builder.content;
            this.customerId = builder.customerId;
            this.customerServiceId = builder.customerServiceId;
            this.customerServiceType = builder.customerServiceType;
            this.end = builder.end;
            this.role = builder.role;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConversationModel create() {
            return builder().build();
        }

        /**
         * @return begin
         */
        public Integer getBegin() {
            return this.begin;
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return customerServiceId
         */
        public String getCustomerServiceId() {
            return this.customerServiceId;
        }

        /**
         * @return customerServiceType
         */
        public String getCustomerServiceType() {
            return this.customerServiceType;
        }

        /**
         * @return end
         */
        public Integer getEnd() {
            return this.end;
        }

        /**
         * @return role
         */
        public Integer getRole() {
            return this.role;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer begin; 
            private String beginTime; 
            private String content; 
            private String customerId; 
            private String customerServiceId; 
            private String customerServiceType; 
            private Integer end; 
            private Integer role; 
            private String type; 

            /**
             * begin.
             */
            public Builder begin(Integer begin) {
                this.begin = begin;
                return this;
            }

            /**
             * beginTime.
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * customerId.
             */
            public Builder customerId(String customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * customerServiceId.
             */
            public Builder customerServiceId(String customerServiceId) {
                this.customerServiceId = customerServiceId;
                return this;
            }

            /**
             * customerServiceType.
             */
            public Builder customerServiceType(String customerServiceType) {
                this.customerServiceType = customerServiceType;
                return this;
            }

            /**
             * end.
             */
            public Builder end(Integer end) {
                this.end = end;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder role(Integer role) {
                this.role = role;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>audio</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ConversationModel build() {
                return new ConversationModel(this);
            } 

        } 

    }
}
