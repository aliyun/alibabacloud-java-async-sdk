// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrustedServiceStatusRequest} extends {@link RequestModel}
 *
 * <p>ListTrustedServiceStatusRequest</p>
 */
public class ListTrustedServiceStatusRequest extends Request {
    @Query
    @NameInMap("AdminAccountId")
    private String adminAccountId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private ListTrustedServiceStatusRequest(Builder builder) {
        super(builder);
        this.adminAccountId = builder.adminAccountId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrustedServiceStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adminAccountId
     */
    public String getAdminAccountId() {
        return this.adminAccountId;
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

    public static final class Builder extends Request.Builder<ListTrustedServiceStatusRequest, Builder> {
        private String adminAccountId; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListTrustedServiceStatusRequest response) {
            super(response);
            this.adminAccountId = response.adminAccountId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
        } 

        /**
         * AdminAccountId.
         */
        public Builder adminAccountId(String adminAccountId) {
            this.putQueryParameter("AdminAccountId", adminAccountId);
            this.adminAccountId = adminAccountId;
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
        public ListTrustedServiceStatusRequest build() {
            return new ListTrustedServiceStatusRequest(this);
        } 

    } 

}
