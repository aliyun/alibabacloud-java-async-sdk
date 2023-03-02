// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserSolutionsRequest} extends {@link RequestModel}
 *
 * <p>ListUserSolutionsRequest</p>
 */
public class ListUserSolutionsRequest extends Request {
    @Query
    @NameInMap("ExistStatus")
    private java.util.List < Long > existStatus;

    @Query
    @NameInMap("IntentionBizId")
    private String intentionBizId;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private ListUserSolutionsRequest(Builder builder) {
        super(builder);
        this.existStatus = builder.existStatus;
        this.intentionBizId = builder.intentionBizId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserSolutionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return existStatus
     */
    public java.util.List < Long > getExistStatus() {
        return this.existStatus;
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

    public static final class Builder extends Request.Builder<ListUserSolutionsRequest, Builder> {
        private java.util.List < Long > existStatus; 
        private String intentionBizId; 
        private Integer pageNum; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListUserSolutionsRequest request) {
            super(request);
            this.existStatus = request.existStatus;
            this.intentionBizId = request.intentionBizId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
        } 

        /**
         * ExistStatus.
         */
        public Builder existStatus(java.util.List < Long > existStatus) {
            String existStatusShrink = shrink(existStatus, "ExistStatus", "json");
            this.putQueryParameter("ExistStatus", existStatusShrink);
            this.existStatus = existStatus;
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
        public ListUserSolutionsRequest build() {
            return new ListUserSolutionsRequest(this);
        } 

    } 

}
