// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAiotPersonTableItemsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAiotPersonTableItemsRequest</p>
 */
public class DescribeAiotPersonTableItemsRequest extends Request {
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

    @Body
    @NameInMap("PersonTableId")
    private String personTableId;

    @Body
    @NameInMap("PersonTableItemId")
    private String personTableItemId;

    private DescribeAiotPersonTableItemsRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.personTableId = builder.personTableId;
        this.personTableItemId = builder.personTableItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAiotPersonTableItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return personTableId
     */
    public String getPersonTableId() {
        return this.personTableId;
    }

    /**
     * @return personTableItemId
     */
    public String getPersonTableItemId() {
        return this.personTableItemId;
    }

    public static final class Builder extends Request.Builder<DescribeAiotPersonTableItemsRequest, Builder> {
        private String id; 
        private Long pageNum; 
        private Long pageSize; 
        private String personTableId; 
        private String personTableItemId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAiotPersonTableItemsRequest response) {
            super(response);
            this.id = response.id;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.personTableId = response.personTableId;
            this.personTableItemId = response.personTableItemId;
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

        /**
         * PersonTableId.
         */
        public Builder personTableId(String personTableId) {
            this.putBodyParameter("PersonTableId", personTableId);
            this.personTableId = personTableId;
            return this;
        }

        /**
         * PersonTableItemId.
         */
        public Builder personTableItemId(String personTableItemId) {
            this.putBodyParameter("PersonTableItemId", personTableItemId);
            this.personTableItemId = personTableItemId;
            return this;
        }

        @Override
        public DescribeAiotPersonTableItemsRequest build() {
            return new DescribeAiotPersonTableItemsRequest(this);
        } 

    } 

}
