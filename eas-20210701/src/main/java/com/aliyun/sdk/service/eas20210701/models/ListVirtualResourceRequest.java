// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListVirtualResourceRequest} extends {@link RequestModel}
 *
 * <p>ListVirtualResourceRequest</p>
 */
public class ListVirtualResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualResourceId")
    private String virtualResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualResourceName")
    private String virtualResourceName;

    private ListVirtualResourceRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.virtualResourceId = builder.virtualResourceId;
        this.virtualResourceName = builder.virtualResourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirtualResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return virtualResourceId
     */
    public String getVirtualResourceId() {
        return this.virtualResourceId;
    }

    /**
     * @return virtualResourceName
     */
    public String getVirtualResourceName() {
        return this.virtualResourceName;
    }

    public static final class Builder extends Request.Builder<ListVirtualResourceRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String virtualResourceId; 
        private String virtualResourceName; 

        private Builder() {
            super();
        } 

        private Builder(ListVirtualResourceRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.virtualResourceId = request.virtualResourceId;
            this.virtualResourceName = request.virtualResourceName;
        } 

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the virtual resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-vr-npovr28onap1xxxxxx</p>
         */
        public Builder virtualResourceId(String virtualResourceId) {
            this.putQueryParameter("VirtualResourceId", virtualResourceId);
            this.virtualResourceId = virtualResourceId;
            return this;
        }

        /**
         * <p>The name of the virtual resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>MyVirtualResource</p>
         */
        public Builder virtualResourceName(String virtualResourceName) {
            this.putQueryParameter("VirtualResourceName", virtualResourceName);
            this.virtualResourceName = virtualResourceName;
            return this;
        }

        @Override
        public ListVirtualResourceRequest build() {
            return new ListVirtualResourceRequest(this);
        } 

    } 

}
