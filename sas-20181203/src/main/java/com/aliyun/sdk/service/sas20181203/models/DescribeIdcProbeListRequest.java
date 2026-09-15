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
         * <p>The page number of the page to return. Default value: 1, which indicates that the first page is returned.</p>
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
         * <p>The maximum number of entries per page when paging. Default value: 20. If you leave this parameter empty, 20 entries are returned per page.</p>
         * <blockquote>
         * <p>Do not leave PageSize empty.</p>
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
         * <p>The usage status of the probe. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: enabled</li>
         * <li><strong>1</strong>: disabled.</li>
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
