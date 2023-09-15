// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFileProtectPluginStatusRequest} extends {@link RequestModel}
 *
 * <p>ListFileProtectPluginStatusRequest</p>
 */
public class ListFileProtectPluginStatusRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Long currentPage;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Long pageSize;

    @Query
    @NameInMap("SwitchId")
    private String switchId;

    private ListFileProtectPluginStatusRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.switchId = builder.switchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFileProtectPluginStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return switchId
     */
    public String getSwitchId() {
        return this.switchId;
    }

    public static final class Builder extends Request.Builder<ListFileProtectPluginStatusRequest, Builder> {
        private Long currentPage; 
        private Long pageSize; 
        private String switchId; 

        private Builder() {
            super();
        } 

        private Builder(ListFileProtectPluginStatusRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.switchId = request.switchId;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
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
         * SwitchId.
         */
        public Builder switchId(String switchId) {
            this.putQueryParameter("SwitchId", switchId);
            this.switchId = switchId;
            return this;
        }

        @Override
        public ListFileProtectPluginStatusRequest build() {
            return new ListFileProtectPluginStatusRequest(this);
        } 

    } 

}
