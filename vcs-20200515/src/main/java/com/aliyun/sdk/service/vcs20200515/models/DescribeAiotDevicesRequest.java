// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAiotDevicesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAiotDevicesRequest</p>
 */
public class DescribeAiotDevicesRequest extends Request {
    @Body
    @NameInMap("CorpIdList")
    private String corpIdList;

    @Body
    @NameInMap("IdList")
    private String idList;

    @Body
    @NameInMap("PageNum")
    private Long pageNum;

    @Body
    @NameInMap("PageSize")
    private Long pageSize;

    private DescribeAiotDevicesRequest(Builder builder) {
        super(builder);
        this.corpIdList = builder.corpIdList;
        this.idList = builder.idList;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAiotDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpIdList
     */
    public String getCorpIdList() {
        return this.corpIdList;
    }

    /**
     * @return idList
     */
    public String getIdList() {
        return this.idList;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeAiotDevicesRequest, Builder> {
        private String corpIdList; 
        private String idList; 
        private Long pageNum; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAiotDevicesRequest response) {
            super(response);
            this.corpIdList = response.corpIdList;
            this.idList = response.idList;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
        } 

        /**
         * CorpIdList.
         */
        public Builder corpIdList(String corpIdList) {
            this.putBodyParameter("CorpIdList", corpIdList);
            this.corpIdList = corpIdList;
            return this;
        }

        /**
         * IdList.
         */
        public Builder idList(String idList) {
            this.putBodyParameter("IdList", idList);
            this.idList = idList;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Long pageNum) {
            this.putBodyParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeAiotDevicesRequest build() {
            return new DescribeAiotDevicesRequest(this);
        } 

    } 

}
