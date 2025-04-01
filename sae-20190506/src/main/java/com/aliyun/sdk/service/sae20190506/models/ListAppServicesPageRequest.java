// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ListAppServicesPageRequest} extends {@link RequestModel}
 *
 * <p>ListAppServicesPageRequest</p>
 */
public class ListAppServicesPageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceType;

    private ListAppServicesPageRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.serviceType = builder.serviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppServicesPageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
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
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    public static final class Builder extends Request.Builder<ListAppServicesPageRequest, Builder> {
        private String appId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String serviceType; 

        private Builder() {
            super();
        } 

        private Builder(ListAppServicesPageRequest request) {
            super(request);
            this.appId = request.appId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.serviceType = request.serviceType;
        } 

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6dcc8c9e-d3da-478a-a066-86dcf820****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
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
         * <p>The number of entries returned on each page. Valid values: 0 to 9999.</p>
         * 
         * <strong>example:</strong>
         * <p>9999</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The service type. Valid values:</p>
         * <ul>
         * <li><strong>dubbo</strong></li>
         * <li><strong>springCloud</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>springCloud</p>
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        @Override
        public ListAppServicesPageRequest build() {
            return new ListAppServicesPageRequest(this);
        } 

    } 

}
