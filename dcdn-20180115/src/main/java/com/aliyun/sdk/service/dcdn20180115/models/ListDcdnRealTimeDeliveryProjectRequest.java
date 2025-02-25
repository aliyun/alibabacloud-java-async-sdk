// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDcdnRealTimeDeliveryProjectRequest} extends {@link RequestModel}
 *
 * <p>ListDcdnRealTimeDeliveryProjectRequest</p>
 */
public class ListDcdnRealTimeDeliveryProjectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private ListDcdnRealTimeDeliveryProjectRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.domainName = builder.domainName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDcdnRealTimeDeliveryProjectRequest create() {
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
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
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

    public static final class Builder extends Request.Builder<ListDcdnRealTimeDeliveryProjectRequest, Builder> {
        private String businessType; 
        private String domainName; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListDcdnRealTimeDeliveryProjectRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.domainName = request.domainName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The type of the collected logs. Default value: cdn_log_access_l1. Valid values:</p>
         * <ul>
         * <li><strong>cdn_log_access_l1</strong>: access logs of Dynamic Content Delivery Network (DCDN) points of presence (POPs)</li>
         * <li><strong>cdn_log_origin</strong>: back-to-origin logs</li>
         * <li><strong>cdn_log_er</strong>: EdgeRoutine logs</li>
         * <li>By default, this parameter is left empty, and all logs are returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cdn_log_access_l1</p>
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * <p>The domain name. You can specify only one domain name in each request. If this parameter is not specified, all domain names are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The number of the page to return. Valid values: <strong>1</strong> to <strong>100000</strong>. Default value: 1.</p>
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
         * <p>The number of entries to return on each page. The default value is 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListDcdnRealTimeDeliveryProjectRequest build() {
            return new ListDcdnRealTimeDeliveryProjectRequest(this);
        } 

    } 

}
