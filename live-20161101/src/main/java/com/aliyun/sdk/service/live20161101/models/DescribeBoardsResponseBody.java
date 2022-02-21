// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBoardsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBoardsResponseBody</p>
 */
public class DescribeBoardsResponseBody extends TeaModel {
    @NameInMap("Boards")
    private java.util.List < Boards> boards;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBoardsResponseBody(Builder builder) {
        this.boards = builder.boards;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBoardsResponseBody create() {
        return builder().build();
    }

    /**
     * @return boards
     */
    public java.util.List < Boards> getBoards() {
        return this.boards;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Boards> boards; 
        private String requestId; 

        /**
         * Boards.
         */
        public Builder boards(java.util.List < Boards> boards) {
            this.boards = boards;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBoardsResponseBody build() {
            return new DescribeBoardsResponseBody(this);
        } 

    } 

    public static class Boards extends TeaModel {
        @NameInMap("BoardId")
        private String boardId;

        @NameInMap("State")
        private Integer state;

        @NameInMap("Topic")
        private String topic;

        @NameInMap("UserId")
        private String userId;

        private Boards(Builder builder) {
            this.boardId = builder.boardId;
            this.state = builder.state;
            this.topic = builder.topic;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Boards create() {
            return builder().build();
        }

        /**
         * @return boardId
         */
        public String getBoardId() {
            return this.boardId;
        }

        /**
         * @return state
         */
        public Integer getState() {
            return this.state;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String boardId; 
            private Integer state; 
            private String topic; 
            private String userId; 

            /**
             * BoardId.
             */
            public Builder boardId(String boardId) {
                this.boardId = boardId;
                return this;
            }

            /**
             * State.
             */
            public Builder state(Integer state) {
                this.state = state;
                return this;
            }

            /**
             * Topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Boards build() {
                return new Boards(this);
            } 

        } 

    }
}
