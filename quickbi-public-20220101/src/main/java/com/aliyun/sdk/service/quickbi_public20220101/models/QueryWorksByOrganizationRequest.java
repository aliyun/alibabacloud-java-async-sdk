// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QueryWorksByOrganizationRequest} extends {@link RequestModel}
 *
 * <p>QueryWorksByOrganizationRequest</p>
 */
public class QueryWorksByOrganizationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    @com.aliyun.core.annotation.Validation(maximum = 99999999, minimum = 1)
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdPartAuthFlag")
    private Integer thirdPartAuthFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorksType")
    private String worksType;

    private QueryWorksByOrganizationRequest(Builder builder) {
        super(builder);
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.thirdPartAuthFlag = builder.thirdPartAuthFlag;
        this.worksType = builder.worksType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryWorksByOrganizationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
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

    /**
     * @return thirdPartAuthFlag
     */
    public Integer getThirdPartAuthFlag() {
        return this.thirdPartAuthFlag;
    }

    /**
     * @return worksType
     */
    public String getWorksType() {
        return this.worksType;
    }

    public static final class Builder extends Request.Builder<QueryWorksByOrganizationRequest, Builder> {
        private Integer pageNum; 
        private Integer pageSize; 
        private Integer status; 
        private Integer thirdPartAuthFlag; 
        private String worksType; 

        private Builder() {
            super();
        } 

        private Builder(QueryWorksByOrganizationRequest request) {
            super(request);
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.thirdPartAuthFlag = request.thirdPartAuthFlag;
            this.worksType = request.worksType;
        } 

        /**
         * <p>Page number.</p>
         * <ul>
         * <li>Default value is 1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>Number of items per page.</p>
         * <ul>
         * <li>Default value is 10.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The status of the work to query. Possible values:</p>
         * <ul>
         * <li>0: Unpublished</li>
         * <li>1: Published</li>
         * <li>2: Modified but not published</li>
         * <li>3: Offline</li>
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

        /**
         * <p>Third-party embedding status. Possible values:</p>
         * <ul>
         * <li>0: Embedding not enabled</li>
         * <li>1: Embedding enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder thirdPartAuthFlag(Integer thirdPartAuthFlag) {
            this.putQueryParameter("ThirdPartAuthFlag", thirdPartAuthFlag);
            this.thirdPartAuthFlag = thirdPartAuthFlag;
            return this;
        }

        /**
         * <p>The type of work to query. Leave blank to query all types. Possible values:</p>
         * <ul>
         * <li>DATAPRODUCT: Data Portal</li>
         * <li>PAGE: Dashboard</li>
         * <li>REPORT: Spreadsheet</li>
         * <li>dashboardOfflineQuery: Self-service Data Retrieval</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PAGE</p>
         */
        public Builder worksType(String worksType) {
            this.putQueryParameter("WorksType", worksType);
            this.worksType = worksType;
            return this;
        }

        @Override
        public QueryWorksByOrganizationRequest build() {
            return new QueryWorksByOrganizationRequest(this);
        } 

    } 

}
