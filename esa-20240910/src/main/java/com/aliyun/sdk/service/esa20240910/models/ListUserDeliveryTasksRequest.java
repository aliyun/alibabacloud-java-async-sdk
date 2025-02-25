// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListUserDeliveryTasksRequest} extends {@link RequestModel}
 *
 * <p>ListUserDeliveryTasksRequest</p>
 */
public class ListUserDeliveryTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    private ListUserDeliveryTasksRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserDeliveryTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
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

    public static final class Builder extends Request.Builder<ListUserDeliveryTasksRequest, Builder> {
        private String businessType; 
        private Long pageNumber; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListUserDeliveryTasksRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The log category. Valid values:</p>
         * <ol>
         * <li>dcdn_log_access_l1 (default): access logs.</li>
         * <li>dcdn_log_er: Edge Routine logs.</li>
         * <li>dcdn_log_waf: firewall logs.</li>
         * <li>dcdn_log_ipa: TCP/UDP proxy logs.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>dcdn_log_access_l1</p>
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListUserDeliveryTasksRequest build() {
            return new ListUserDeliveryTasksRequest(this);
        } 

    } 

}
