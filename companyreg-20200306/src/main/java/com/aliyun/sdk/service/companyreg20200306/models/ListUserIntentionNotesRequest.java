// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserIntentionNotesRequest} extends {@link RequestModel}
 *
 * <p>ListUserIntentionNotesRequest</p>
 */
public class ListUserIntentionNotesRequest extends Request {
    @Query
    @NameInMap("BizType")
    @Validation(required = true)
    private String bizType;

    @Query
    @NameInMap("IntentionBizId")
    @Validation(required = true)
    private String intentionBizId;

    @Query
    @NameInMap("PageNum")
    @Validation(required = true)
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    private ListUserIntentionNotesRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.intentionBizId = builder.intentionBizId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserIntentionNotesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return intentionBizId
     */
    public String getIntentionBizId() {
        return this.intentionBizId;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListUserIntentionNotesRequest, Builder> {
        private String bizType; 
        private String intentionBizId; 
        private Integer pageNum; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListUserIntentionNotesRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.intentionBizId = request.intentionBizId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
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
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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
        public ListUserIntentionNotesRequest build() {
            return new ListUserIntentionNotesRequest(this);
        } 

    } 

}
