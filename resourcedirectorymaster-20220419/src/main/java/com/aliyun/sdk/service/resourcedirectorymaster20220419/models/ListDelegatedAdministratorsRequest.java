// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDelegatedAdministratorsRequest} extends {@link RequestModel}
 *
 * <p>ListDelegatedAdministratorsRequest</p>
 */
public class ListDelegatedAdministratorsRequest extends Request {
    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("ServicePrincipal")
    private String servicePrincipal;

    private ListDelegatedAdministratorsRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.servicePrincipal = builder.servicePrincipal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDelegatedAdministratorsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return servicePrincipal
     */
    public String getServicePrincipal() {
        return this.servicePrincipal;
    }

    public static final class Builder extends Request.Builder<ListDelegatedAdministratorsRequest, Builder> {
        private Long pageNumber; 
        private Long pageSize; 
        private String servicePrincipal; 

        private Builder() {
            super();
        } 

        private Builder(ListDelegatedAdministratorsRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.servicePrincipal = request.servicePrincipal;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ServicePrincipal.
         */
        public Builder servicePrincipal(String servicePrincipal) {
            this.putQueryParameter("ServicePrincipal", servicePrincipal);
            this.servicePrincipal = servicePrincipal;
            return this;
        }

        @Override
        public ListDelegatedAdministratorsRequest build() {
            return new ListDelegatedAdministratorsRequest(this);
        } 

    } 

}
