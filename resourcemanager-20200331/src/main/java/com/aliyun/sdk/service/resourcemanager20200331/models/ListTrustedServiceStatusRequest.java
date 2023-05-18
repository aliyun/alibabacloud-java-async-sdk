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

        private Builder(ListTrustedServiceStatusRequest request) {
            super(request);
            this.adminAccountId = request.adminAccountId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * The ID of the enterprise management account or delegated administrator account.
         * <p>
         * 
         * *   If you set this parameter to the ID of an enterprise management account, the trusted services that are enabled within the enterprise management account are queried. The default value of this parameter is the ID of an enterprise management account.
         * *   If you set this parameter to the ID of a delegated administrator account, the trusted services that are enabled within the delegated administrator account are queried.
         * 
         * For more information about trusted services and delegated administrator accounts, see [Overview of trusted services](~~208133~~) and [Delegated administrator accounts](~~208117~~).
         */
        public Builder adminAccountId(String adminAccountId) {
            this.putQueryParameter("AdminAccountId", adminAccountId);
            this.adminAccountId = adminAccountId;
            return this;
        }

        /**
         * The number of the page to return.
         * <p>
         * 
         * Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Valid values: 1 to 100. Default value: 10.
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
