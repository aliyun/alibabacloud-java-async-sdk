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
 * {@link SubmitChatQuestionRequest} extends {@link RequestModel}
 *
 * <p>SubmitChatQuestionRequest</p>
 */
public class SubmitChatQuestionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gmtService")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gmtService;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("liveScriptContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String liveScriptContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("openSmallTalk")
    private Boolean openSmallTalk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("questionList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<QuestionList> questionList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    private SubmitChatQuestionRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.gmtService = builder.gmtService;
        this.liveScriptContent = builder.liveScriptContent;
        this.openSmallTalk = builder.openSmallTalk;
        this.questionList = builder.questionList;
        this.requestId = builder.requestId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitChatQuestionRequest create() {
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
     * @return gmtService
     */
    public String getGmtService() {
        return this.gmtService;
    }

    /**
     * @return liveScriptContent
     */
    public String getLiveScriptContent() {
        return this.liveScriptContent;
    }

    /**
     * @return openSmallTalk
     */
    public Boolean getOpenSmallTalk() {
        return this.openSmallTalk;
    }

    /**
     * @return questionList
     */
    public java.util.List<QuestionList> getQuestionList() {
        return this.questionList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<SubmitChatQuestionRequest, Builder> {
        private String workspaceId; 
        private String gmtService; 
        private String liveScriptContent; 
        private Boolean openSmallTalk; 
        private java.util.List<QuestionList> questionList; 
        private String requestId; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitChatQuestionRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.gmtService = request.gmtService;
            this.liveScriptContent = request.liveScriptContent;
            this.openSmallTalk = request.openSmallTalk;
            this.questionList = request.questionList;
            this.requestId = request.requestId;
            this.sessionId = request.sessionId;
        } 

        /**
         * <p>Workspace ID</p>
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
         * <p>Current time</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-27 11:23:20</p>
         */
        public Builder gmtService(String gmtService) {
            this.putBodyParameter("gmtService", gmtService);
            this.gmtService = gmtService;
            return this;
        }

        /**
         * <p>Live channel script</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>我们家的酒全都是老酒，酒厂直售【当前用户问句】，保证正儿八经的自家酿造，地址都能告诉大家，品质实实在在的有保障。我们家这款酒入口非常绵柔顺滑，酱香、粮食香、花果香层层递进，空杯留香能持续48小时，不会有上头的感觉。今天我们是厂家直销，大家平时买酒在烟酒店要经过好几个环节的中间商，每个环节都要加价，今天在这里拍下，只会让你省不少冤枉钱。如果说你拿去存酒的话， 拍蓝瓶的云端系列也可以，越存的话会越香，你拿去托人办事、请人吃饭、商务宴请、搞接待送礼，直接带白瓶云悠系列。</p>
         */
        public Builder liveScriptContent(String liveScriptContent) {
            this.putBodyParameter("liveScriptContent", liveScriptContent);
            this.liveScriptContent = liveScriptContent;
            return this;
        }

        /**
         * <p>Enable small talk. Default is true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder openSmallTalk(Boolean openSmallTalk) {
            this.putBodyParameter("openSmallTalk", openSmallTalk);
            this.openSmallTalk = openSmallTalk;
            return this;
        }

        /**
         * <p>Question list</p>
         * <p>This parameter is required.</p>
         */
        public Builder questionList(java.util.List<QuestionList> questionList) {
            this.putBodyParameter("questionList", questionList);
            this.questionList = questionList;
            return this;
        }

        /**
         * <p>Request ID</p>
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

        /**
         * <p>Session ID</p>
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

        @Override
        public SubmitChatQuestionRequest build() {
            return new SubmitChatQuestionRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitChatQuestionRequest} extends {@link TeaModel}
     *
     * <p>SubmitChatQuestionRequest</p>
     */
    public static class QuestionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        @com.aliyun.core.annotation.Validation(required = true)
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("reply")
        private String reply;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("userId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userId;

        @com.aliyun.core.annotation.NameInMap("userName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userName;

        private QuestionList(Builder builder) {
            this.content = builder.content;
            this.gmtCreate = builder.gmtCreate;
            this.reply = builder.reply;
            this.sessionId = builder.sessionId;
            this.type = builder.type;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuestionList create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return reply
         */
        public String getReply() {
            return this.reply;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String content; 
            private String gmtCreate; 
            private String reply; 
            private String sessionId; 
            private String type; 
            private String userId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(QuestionList model) {
                this.content = model.content;
                this.gmtCreate = model.gmtCreate;
                this.reply = model.reply;
                this.sessionId = model.sessionId;
                this.type = model.type;
                this.userId = model.userId;
                this.userName = model.userName;
            } 

            /**
             * <p>Question content</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>这是多大的体积</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Original question time</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-17 10:05:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Reply content</p>
             * 
             * <strong>example:</strong>
             * <p>这是三升的。</p>
             */
            public Builder reply(String reply) {
                this.reply = reply;
                return this;
            }

            /**
             * <p>Session ID</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1869300950603128834</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>Question type: PRODUCT_QA (audio submission), GOSSIP (operation submission), UNKNOWN (unknown)</p>
             * 
             * <strong>example:</strong>
             * <p>PRODUCT_QA</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Unique ID of the user asking questions in the live channel</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>39485783475638465</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>Name of the user asking questions in the live channel</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>张**</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public QuestionList build() {
                return new QuestionList(this);
            } 

        } 

    }
}
