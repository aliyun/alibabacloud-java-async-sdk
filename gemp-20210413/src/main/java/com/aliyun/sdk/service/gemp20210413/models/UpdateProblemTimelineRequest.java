// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProblemTimelineRequest} extends {@link RequestModel}
 *
 * <p>UpdateProblemTimelineRequest</p>
 */
public class UpdateProblemTimelineRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("content")
    private String content;

    @Body
    @NameInMap("keyNode")
    private String keyNode;

    @Body
    @NameInMap("problemId")
    private Long problemId;

    @Body
    @NameInMap("problemTimelineId")
    private Long problemTimelineId;

    @Body
    @NameInMap("time")
    private String time;

    private UpdateProblemTimelineRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.content = builder.content;
        this.keyNode = builder.keyNode;
        this.problemId = builder.problemId;
        this.problemTimelineId = builder.problemTimelineId;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProblemTimelineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return keyNode
     */
    public String getKeyNode() {
        return this.keyNode;
    }

    /**
     * @return problemId
     */
    public Long getProblemId() {
        return this.problemId;
    }

    /**
     * @return problemTimelineId
     */
    public Long getProblemTimelineId() {
        return this.problemTimelineId;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder extends Request.Builder<UpdateProblemTimelineRequest, Builder> {
        private String clientToken; 
        private String content; 
        private String keyNode; 
        private Long problemId; 
        private Long problemTimelineId; 
        private String time; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProblemTimelineRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.content = request.content;
            this.keyNode = request.keyNode;
            this.problemId = request.problemId;
            this.problemTimelineId = request.problemTimelineId;
            this.time = request.time;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * content.
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * keyNode.
         */
        public Builder keyNode(String keyNode) {
            this.putBodyParameter("keyNode", keyNode);
            this.keyNode = keyNode;
            return this;
        }

        /**
         * problemId.
         */
        public Builder problemId(Long problemId) {
            this.putBodyParameter("problemId", problemId);
            this.problemId = problemId;
            return this;
        }

        /**
         * problemTimelineId.
         */
        public Builder problemTimelineId(Long problemTimelineId) {
            this.putBodyParameter("problemTimelineId", problemTimelineId);
            this.problemTimelineId = problemTimelineId;
            return this;
        }

        /**
         * time.
         */
        public Builder time(String time) {
            this.putBodyParameter("time", time);
            this.time = time;
            return this;
        }

        @Override
        public UpdateProblemTimelineRequest build() {
            return new UpdateProblemTimelineRequest(this);
        } 

    } 

}
