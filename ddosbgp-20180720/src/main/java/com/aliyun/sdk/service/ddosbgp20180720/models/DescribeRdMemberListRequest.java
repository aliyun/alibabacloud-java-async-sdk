// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRdMemberListRequest} extends {@link RequestModel}
 *
 * <p>DescribeRdMemberListRequest</p>
 */
public class DescribeRdMemberListRequest extends Request {
    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ResourceDirectoryId")
    private String resourceDirectoryId;

    private DescribeRdMemberListRequest(Builder builder) {
        super(builder);
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.resourceDirectoryId = builder.resourceDirectoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRdMemberListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceDirectoryId
     */
    public String getResourceDirectoryId() {
        return this.resourceDirectoryId;
    }

    public static final class Builder extends Request.Builder<DescribeRdMemberListRequest, Builder> {
        private Integer pageNo; 
        private Integer pageSize; 
        private String resourceDirectoryId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRdMemberListRequest request) {
            super(request);
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.resourceDirectoryId = request.resourceDirectoryId;
        } 

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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
         * ResourceDirectoryId.
         */
        public Builder resourceDirectoryId(String resourceDirectoryId) {
            this.putQueryParameter("ResourceDirectoryId", resourceDirectoryId);
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }

        @Override
        public DescribeRdMemberListRequest build() {
            return new DescribeRdMemberListRequest(this);
        } 

    } 

}
