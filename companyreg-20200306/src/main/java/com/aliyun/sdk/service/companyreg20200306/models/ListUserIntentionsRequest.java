// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

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
 * {@link ListUserIntentionsRequest} extends {@link RequestModel}
 *
 * <p>ListUserIntentionsRequest</p>
 */
public class ListUserIntentionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Area")
    private String area;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizTypes")
    private String bizTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntentionBizId")
    private String intentionBizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortFiled")
    private String sortFiled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortOrder")
    private String sortOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithExtInfo")
    private Boolean withExtInfo;

    private ListUserIntentionsRequest(Builder builder) {
        super(builder);
        this.area = builder.area;
        this.bizType = builder.bizType;
        this.bizTypes = builder.bizTypes;
        this.intentionBizId = builder.intentionBizId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.sortFiled = builder.sortFiled;
        this.sortOrder = builder.sortOrder;
        this.status = builder.status;
        this.withExtInfo = builder.withExtInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserIntentionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return area
     */
    public String getArea() {
        return this.area;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return bizTypes
     */
    public String getBizTypes() {
        return this.bizTypes;
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

    /**
     * @return sortFiled
     */
    public String getSortFiled() {
        return this.sortFiled;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return withExtInfo
     */
    public Boolean getWithExtInfo() {
        return this.withExtInfo;
    }

    public static final class Builder extends Request.Builder<ListUserIntentionsRequest, Builder> {
        private String area; 
        private String bizType; 
        private String bizTypes; 
        private String intentionBizId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String sortFiled; 
        private String sortOrder; 
        private Integer status; 
        private Boolean withExtInfo; 

        private Builder() {
            super();
        } 

        private Builder(ListUserIntentionsRequest request) {
            super(request);
            this.area = request.area;
            this.bizType = request.bizType;
            this.bizTypes = request.bizTypes;
            this.intentionBizId = request.intentionBizId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.sortFiled = request.sortFiled;
            this.sortOrder = request.sortOrder;
            this.status = request.status;
            this.withExtInfo = request.withExtInfo;
        } 

        /**
         * Area.
         */
        public Builder area(String area) {
            this.putQueryParameter("Area", area);
            this.area = area;
            return this;
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
         * BizTypes.
         */
        public Builder bizTypes(String bizTypes) {
            this.putQueryParameter("BizTypes", bizTypes);
            this.bizTypes = bizTypes;
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

        /**
         * SortFiled.
         */
        public Builder sortFiled(String sortFiled) {
            this.putQueryParameter("SortFiled", sortFiled);
            this.sortFiled = sortFiled;
            return this;
        }

        /**
         * SortOrder.
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * WithExtInfo.
         */
        public Builder withExtInfo(Boolean withExtInfo) {
            this.putQueryParameter("WithExtInfo", withExtInfo);
            this.withExtInfo = withExtInfo;
            return this;
        }

        @Override
        public ListUserIntentionsRequest build() {
            return new ListUserIntentionsRequest(this);
        } 

    } 

}
