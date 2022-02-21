// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBoardResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBoardResponseBody</p>
 */
public class CreateBoardResponseBody extends TeaModel {
    @NameInMap("BoardId")
    private String boardId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateBoardResponseBody(Builder builder) {
        this.boardId = builder.boardId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBoardResponseBody create() {
        return builder().build();
    }

    /**
     * @return boardId
     */
    public String getBoardId() {
        return this.boardId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String boardId; 
        private String requestId; 

        /**
         * BoardId.
         */
        public Builder boardId(String boardId) {
            this.boardId = boardId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateBoardResponseBody build() {
            return new CreateBoardResponseBody(this);
        } 

    } 

}
