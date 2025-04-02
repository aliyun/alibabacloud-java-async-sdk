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
 * {@link StatisticsReportResponseBody} extends {@link TeaModel}
 *
 * <p>StatisticsReportResponseBody</p>
 */
public class StatisticsReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("commentNum")
    private Long commentNum;

    @com.aliyun.core.annotation.NameInMap("commentUserNum")
    private Long commentUserNum;

    @com.aliyun.core.annotation.NameInMap("likeNum")
    private Long likeNum;

    @com.aliyun.core.annotation.NameInMap("readNum")
    private Long readNum;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private StatisticsReportResponseBody(Builder builder) {
        this.commentNum = builder.commentNum;
        this.commentUserNum = builder.commentUserNum;
        this.likeNum = builder.likeNum;
        this.readNum = builder.readNum;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StatisticsReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commentNum
     */
    public Long getCommentNum() {
        return this.commentNum;
    }

    /**
     * @return commentUserNum
     */
    public Long getCommentUserNum() {
        return this.commentUserNum;
    }

    /**
     * @return likeNum
     */
    public Long getLikeNum() {
        return this.likeNum;
    }

    /**
     * @return readNum
     */
    public Long getReadNum() {
        return this.readNum;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long commentNum; 
        private Long commentUserNum; 
        private Long likeNum; 
        private Long readNum; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(StatisticsReportResponseBody model) {
            this.commentNum = model.commentNum;
            this.commentUserNum = model.commentUserNum;
            this.likeNum = model.likeNum;
            this.readNum = model.readNum;
            this.requestId = model.requestId;
        } 

        /**
         * commentNum.
         */
        public Builder commentNum(Long commentNum) {
            this.commentNum = commentNum;
            return this;
        }

        /**
         * commentUserNum.
         */
        public Builder commentUserNum(Long commentUserNum) {
            this.commentUserNum = commentUserNum;
            return this;
        }

        /**
         * likeNum.
         */
        public Builder likeNum(Long likeNum) {
            this.likeNum = likeNum;
            return this;
        }

        /**
         * readNum.
         */
        public Builder readNum(Long readNum) {
            this.readNum = readNum;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StatisticsReportResponseBody build() {
            return new StatisticsReportResponseBody(this);
        } 

    } 

}
