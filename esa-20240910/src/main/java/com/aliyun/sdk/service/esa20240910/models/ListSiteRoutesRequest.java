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
 * {@link ListSiteRoutesRequest} extends {@link RequestModel}
 *
 * <p>ListSiteRoutesRequest</p>
 */
public class ListSiteRoutesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private Long configId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigType")
    private String configType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteName")
    private String routeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private ListSiteRoutesRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
        this.configType = builder.configType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.routeName = builder.routeName;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSiteRoutesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configId
     */
    public Long getConfigId() {
        return this.configId;
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
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
     * @return routeName
     */
    public String getRouteName() {
        return this.routeName;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<ListSiteRoutesRequest, Builder> {
        private Long configId; 
        private String configType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String routeName; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(ListSiteRoutesRequest request) {
            super(request);
            this.configId = request.configId;
            this.configType = request.configType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.routeName = request.routeName;
            this.siteId = request.siteId;
        } 

        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>35281609698****</p>
         */
        public Builder configId(Long configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * <p>The configuration type. You can use this parameter to query global configurations or feature configurations. This parameter takes effect only if the functionName parameter is passed.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>global</li>
         * <li>rule</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        public Builder configType(String configType) {
            this.putQueryParameter("ConfigType", configType);
            this.configType = configType;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
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
         * <p>The number of entries per page. Maximum value: 500. Default value: 500.</p>
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
         * <p>The rule name. This parameter takes effect only when parameter functionName is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>test_route</p>
         */
        public Builder routeName(String routeName) {
            this.putQueryParameter("RouteName", routeName);
            this.routeName = routeName;
            return this;
        }

        /**
         * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public ListSiteRoutesRequest build() {
            return new ListSiteRoutesRequest(this);
        } 

    } 

}
