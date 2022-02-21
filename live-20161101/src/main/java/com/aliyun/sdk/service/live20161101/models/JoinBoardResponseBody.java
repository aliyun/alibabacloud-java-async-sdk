// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JoinBoardResponseBody} extends {@link TeaModel}
 *
 * <p>JoinBoardResponseBody</p>
 */
public class JoinBoardResponseBody extends TeaModel {
    @NameInMap("BoardId")
    private String boardId;

    @NameInMap("KeepaliveInterval")
    private Integer keepaliveInterval;

    @NameInMap("KeepaliveTopic")
    private String keepaliveTopic;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Token")
    private String token;

    @NameInMap("TopicId")
    private String topicId;

    private JoinBoardResponseBody(Builder builder) {
        this.boardId = builder.boardId;
        this.keepaliveInterval = builder.keepaliveInterval;
        this.keepaliveTopic = builder.keepaliveTopic;
        this.requestId = builder.requestId;
        this.token = builder.token;
        this.topicId = builder.topicId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JoinBoardResponseBody create() {
        return builder().build();
    }

    /**
     * @return boardId
     */
    public String getBoardId() {
        return this.boardId;
    }

    /**
     * @return keepaliveInterval
     */
    public Integer getKeepaliveInterval() {
        return this.keepaliveInterval;
    }

    /**
     * @return keepaliveTopic
     */
    public String getKeepaliveTopic() {
        return this.keepaliveTopic;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return topicId
     */
    public String getTopicId() {
        return this.topicId;
    }

    public static final class Builder {
        private String boardId; 
        private Integer keepaliveInterval; 
        private String keepaliveTopic; 
        private String requestId; 
        private String token; 
        private String topicId; 

        /**
         * BoardId.
         */
        public Builder boardId(String boardId) {
            this.boardId = boardId;
            return this;
        }

        /**
         * KeepaliveInterval.
         */
        public Builder keepaliveInterval(Integer keepaliveInterval) {
            this.keepaliveInterval = keepaliveInterval;
            return this;
        }

        /**
         * KeepaliveTopic.
         */
        public Builder keepaliveTopic(String keepaliveTopic) {
            this.keepaliveTopic = keepaliveTopic;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * TopicId.
         */
        public Builder topicId(String topicId) {
            this.topicId = topicId;
            return this;
        }

        public JoinBoardResponseBody build() {
            return new JoinBoardResponseBody(this);
        } 

    } 

}
