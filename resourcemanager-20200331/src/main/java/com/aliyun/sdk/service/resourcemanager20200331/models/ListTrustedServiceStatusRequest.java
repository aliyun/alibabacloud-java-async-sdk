// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link ListTrustedServiceStatusRequest} extends {@link RequestModel}
 *
 * <p>ListTrustedServiceStatusRequest</p>
 */
public class ListTrustedServiceStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdminAccountId")
    private String adminAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
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
         * <p>The ID of the enterprise management account or delegated administrator account.</p>
         * <ul>
         * <li>If you set this parameter to the ID of an enterprise management account, the trusted services that are enabled within the enterprise management account are queried. The default value of this parameter is the ID of an enterprise management account.</li>
         * <li>If you set this parameter to the ID of a delegated administrator account, the trusted services that are enabled within the delegated administrator account are queried.</li>
         * </ul>
         * <p>For more information about trusted services and delegated administrator accounts, see <a href="https://help.aliyun.com/document_detail/208133.html">Overview of trusted services</a> and <a href="https://help.aliyun.com/document_detail/208117.html">Delegated administrator accounts</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>177242285274****</p>
         */
        public Builder adminAccountId(String adminAccountId) {
            this.putQueryParameter("AdminAccountId", adminAccountId);
            this.adminAccountId = adminAccountId;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * <p>Pages start from page 1. Default value: 1.</p>
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
         * <p>The number of entries to return on each page.</p>
         * <p>Valid values: 1 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
