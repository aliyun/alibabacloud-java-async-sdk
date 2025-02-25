// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTaskDetailVoteInfo} extends {@link TeaModel}
 *
 * <p>CreateTaskDetailVoteInfo</p>
 */
public class CreateTaskDetailVoteInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MinVote")
    private Long minVote;

    @com.aliyun.core.annotation.NameInMap("VoteNum")
    private Long voteNum;

    private CreateTaskDetailVoteInfo(Builder builder) {
        this.minVote = builder.minVote;
        this.voteNum = builder.voteNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTaskDetailVoteInfo create() {
        return builder().build();
    }

    /**
     * @return minVote
     */
    public Long getMinVote() {
        return this.minVote;
    }

    /**
     * @return voteNum
     */
    public Long getVoteNum() {
        return this.voteNum;
    }

    public static final class Builder {
        private Long minVote; 
        private Long voteNum; 

        /**
         * MinVote.
         */
        public Builder minVote(Long minVote) {
            this.minVote = minVote;
            return this;
        }

        /**
         * VoteNum.
         */
        public Builder voteNum(Long voteNum) {
            this.voteNum = voteNum;
            return this;
        }

        public CreateTaskDetailVoteInfo build() {
            return new CreateTaskDetailVoteInfo(this);
        } 

    } 

}
