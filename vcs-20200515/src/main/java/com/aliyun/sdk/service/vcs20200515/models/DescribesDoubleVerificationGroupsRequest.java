// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribesDoubleVerificationGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribesDoubleVerificationGroupsRequest</p>
 */
public class DescribesDoubleVerificationGroupsRequest extends Request {
    @Body
    @NameInMap("DoubleVerificationGroupIds")
    private String doubleVerificationGroupIds;

    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Body
    @NameInMap("PageNum")
    private Long pageNum;

    @Body
    @NameInMap("PageSize")
    private Long pageSize;

    private DescribesDoubleVerificationGroupsRequest(Builder builder) {
        super(builder);
        this.doubleVerificationGroupIds = builder.doubleVerificationGroupIds;
        this.id = builder.id;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribesDoubleVerificationGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return doubleVerificationGroupIds
     */
    public String getDoubleVerificationGroupIds() {
        return this.doubleVerificationGroupIds;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
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

    public static final class Builder extends Request.Builder<DescribesDoubleVerificationGroupsRequest, Builder> {
        private String doubleVerificationGroupIds; 
        private String id; 
        private Long pageNum; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribesDoubleVerificationGroupsRequest response) {
            super(response);
            this.doubleVerificationGroupIds = response.doubleVerificationGroupIds;
            this.id = response.id;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
        } 

        /**
         * DoubleVerificationGroupIds.
         */
        public Builder doubleVerificationGroupIds(String doubleVerificationGroupIds) {
            this.putBodyParameter("DoubleVerificationGroupIds", doubleVerificationGroupIds);
            this.doubleVerificationGroupIds = doubleVerificationGroupIds;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
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
        public DescribesDoubleVerificationGroupsRequest build() {
            return new DescribesDoubleVerificationGroupsRequest(this);
        } 

    } 

}
