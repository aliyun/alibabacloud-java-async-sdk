// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20210728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTraceMuRequest} extends {@link RequestModel}
 *
 * <p>QueryTraceMuRequest</p>
 */
public class QueryTraceMuRequest extends Request {
    @Body
    @NameInMap("CreateTimeEnd")
    private Long createTimeEnd;

    @Body
    @NameInMap("CreateTimeStart")
    private Long createTimeStart;

    @Body
    @NameInMap("JobId")
    private String jobId;

    @Body
    @NameInMap("Level")
    private Long level;

    @Body
    @NameInMap("MessageId")
    private Long messageId;

    @Body
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Body
    @NameInMap("PageSize")
    private Long pageSize;

    private QueryTraceMuRequest(Builder builder) {
        super(builder);
        this.createTimeEnd = builder.createTimeEnd;
        this.createTimeStart = builder.createTimeStart;
        this.jobId = builder.jobId;
        this.level = builder.level;
        this.messageId = builder.messageId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTraceMuRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTimeEnd
     */
    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    /**
     * @return createTimeStart
     */
    public Long getCreateTimeStart() {
        return this.createTimeStart;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return level
     */
    public Long getLevel() {
        return this.level;
    }

    /**
     * @return messageId
     */
    public Long getMessageId() {
        return this.messageId;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<QueryTraceMuRequest, Builder> {
        private Long createTimeEnd; 
        private Long createTimeStart; 
        private String jobId; 
        private Long level; 
        private Long messageId; 
        private Long pageNumber; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(QueryTraceMuRequest request) {
            super(request);
            this.createTimeEnd = request.createTimeEnd;
            this.createTimeStart = request.createTimeStart;
            this.jobId = request.jobId;
            this.level = request.level;
            this.messageId = request.messageId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * 创建时间起始
         */
        public Builder createTimeEnd(Long createTimeEnd) {
            this.putBodyParameter("CreateTimeEnd", createTimeEnd);
            this.createTimeEnd = createTimeEnd;
            return this;
        }

        /**
         * 创建时间截止
         */
        public Builder createTimeStart(Long createTimeStart) {
            this.putBodyParameter("CreateTimeStart", createTimeStart);
            this.createTimeStart = createTimeStart;
            return this;
        }

        /**
         * 任务id
         */
        public Builder jobId(String jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * 水印强度
         */
        public Builder level(Long level) {
            this.putBodyParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * 水印信息id
         */
        public Builder messageId(Long messageId) {
            this.putBodyParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        /**
         * 页偏移
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 每页数量
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public QueryTraceMuRequest build() {
            return new QueryTraceMuRequest(this);
        } 

    } 

}
