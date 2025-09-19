// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeIdcProbeListRequest} extends {@link RequestModel}
 *
 * <p>DescribeIdcProbeListRequest</p>
 */
public class DescribeIdcProbeListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdcName")
    private String idcName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private DescribeIdcProbeListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.idcName = builder.idcName;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIdcProbeListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return idcName
     */
    public String getIdcName() {
        return this.idcName;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeIdcProbeListRequest, Builder> {
        private Integer currentPage; 
        private String idcName; 
        private Integer pageSize; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIdcProbeListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.idcName = request.idcName;
            this.pageSize = request.pageSize;
            this.status = request.status;
        } 

        /**
         * <p>Sets the page number from which to start displaying the query results. The default value is 1, indicating that the display starts from the first page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The name of the IDC.</p>
         * 
         * <strong>example:</strong>
         * <p>3K IDC</p>
         */
        public Builder idcName(String idcName) {
            this.putQueryParameter("IdcName", idcName);
            this.idcName = idcName;
            return this;
        }

        /**
         * <p>Specifies the maximum number of data entries to display per page in a paginated query. The default number of data entries per page is 20, and if the PageSize parameter is empty, it will default to returning 20 data entries.</p>
         * <blockquote>
         * <p>It is recommended that the PageSize value is not empty.</p>
         * </blockquote>
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
         * <p>Probe status. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Enabled</li>
         * <li><strong>1</strong>: Disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeIdcProbeListRequest build() {
            return new DescribeIdcProbeListRequest(this);
        } 

    } 

}
