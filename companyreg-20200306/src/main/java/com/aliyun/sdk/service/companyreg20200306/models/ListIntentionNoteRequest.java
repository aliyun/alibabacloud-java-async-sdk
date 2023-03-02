// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIntentionNoteRequest} extends {@link RequestModel}
 *
 * <p>ListIntentionNoteRequest</p>
 */
public class ListIntentionNoteRequest extends Request {
    @Query
    @NameInMap("BeginTime")
    private Long beginTime;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("IntentionBizId")
    @Validation(required = true)
    private String intentionBizId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private ListIntentionNoteRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.intentionBizId = builder.intentionBizId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntentionNoteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return intentionBizId
     */
    public String getIntentionBizId() {
        return this.intentionBizId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListIntentionNoteRequest, Builder> {
        private Long beginTime; 
        private Long endTime; 
        private String intentionBizId; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListIntentionNoteRequest request) {
            super(request);
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.intentionBizId = request.intentionBizId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * BeginTime.
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * IntentionBizId.
         */
        public Builder intentionBizId(String intentionBizId) {
            this.putQueryParameter("IntentionBizId", intentionBizId);
            this.intentionBizId = intentionBizId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListIntentionNoteRequest build() {
            return new ListIntentionNoteRequest(this);
        } 

    } 

}
