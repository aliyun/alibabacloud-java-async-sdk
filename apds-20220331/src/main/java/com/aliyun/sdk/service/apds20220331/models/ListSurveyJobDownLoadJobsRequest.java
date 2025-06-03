// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331.models;

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
 * {@link ListSurveyJobDownLoadJobsRequest} extends {@link RequestModel}
 *
 * <p>ListSurveyJobDownLoadJobsRequest</p>
 */
public class ListSurveyJobDownLoadJobsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sortCol")
    private String sortCol;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sortType")
    private String sortType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private ListSurveyJobDownLoadJobsRequest(Builder builder) {
        super(builder);
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.sortCol = builder.sortCol;
        this.sortType = builder.sortType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSurveyJobDownLoadJobsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return sortCol
     */
    public String getSortCol() {
        return this.sortCol;
    }

    /**
     * @return sortType
     */
    public String getSortType() {
        return this.sortType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListSurveyJobDownLoadJobsRequest, Builder> {
        private Integer pageNum; 
        private Integer pageSize; 
        private String sortCol; 
        private String sortType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListSurveyJobDownLoadJobsRequest request) {
            super(request);
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.sortCol = request.sortCol;
            this.sortType = request.sortType;
            this.regionId = request.regionId;
        } 

        /**
         * pageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putBodyParameter("pageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * sortCol.
         */
        public Builder sortCol(String sortCol) {
            this.putBodyParameter("sortCol", sortCol);
            this.sortCol = sortCol;
            return this;
        }

        /**
         * sortType.
         */
        public Builder sortType(String sortType) {
            this.putBodyParameter("sortType", sortType);
            this.sortType = sortType;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListSurveyJobDownLoadJobsRequest build() {
            return new ListSurveyJobDownLoadJobsRequest(this);
        } 

    } 

}
