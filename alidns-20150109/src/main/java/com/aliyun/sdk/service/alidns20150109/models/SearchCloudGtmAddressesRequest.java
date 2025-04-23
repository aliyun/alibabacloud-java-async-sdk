// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link SearchCloudGtmAddressesRequest} extends {@link RequestModel}
 *
 * <p>SearchCloudGtmAddressesRequest</p>
 */
public class SearchCloudGtmAddressesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressId")
    private String addressId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AvailableStatus")
    private String availableStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableStatus")
    private String enableStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthStatus")
    private String healthStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonitorTemplateName")
    private String monitorTemplateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NameSearchCondition")
    private String nameSearchCondition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Names")
    private java.util.List<String> names;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemarkSearchCondition")
    private String remarkSearchCondition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remarks")
    private java.util.List<String> remarks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private SearchCloudGtmAddressesRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.address = builder.address;
        this.addressId = builder.addressId;
        this.availableStatus = builder.availableStatus;
        this.enableStatus = builder.enableStatus;
        this.healthStatus = builder.healthStatus;
        this.monitorTemplateName = builder.monitorTemplateName;
        this.nameSearchCondition = builder.nameSearchCondition;
        this.names = builder.names;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.remarkSearchCondition = builder.remarkSearchCondition;
        this.remarks = builder.remarks;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchCloudGtmAddressesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return addressId
     */
    public String getAddressId() {
        return this.addressId;
    }

    /**
     * @return availableStatus
     */
    public String getAvailableStatus() {
        return this.availableStatus;
    }

    /**
     * @return enableStatus
     */
    public String getEnableStatus() {
        return this.enableStatus;
    }

    /**
     * @return healthStatus
     */
    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * @return monitorTemplateName
     */
    public String getMonitorTemplateName() {
        return this.monitorTemplateName;
    }

    /**
     * @return nameSearchCondition
     */
    public String getNameSearchCondition() {
        return this.nameSearchCondition;
    }

    /**
     * @return names
     */
    public java.util.List<String> getNames() {
        return this.names;
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
     * @return remarkSearchCondition
     */
    public String getRemarkSearchCondition() {
        return this.remarkSearchCondition;
    }

    /**
     * @return remarks
     */
    public java.util.List<String> getRemarks() {
        return this.remarks;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<SearchCloudGtmAddressesRequest, Builder> {
        private String acceptLanguage; 
        private String address; 
        private String addressId; 
        private String availableStatus; 
        private String enableStatus; 
        private String healthStatus; 
        private String monitorTemplateName; 
        private String nameSearchCondition; 
        private java.util.List<String> names; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String remarkSearchCondition; 
        private java.util.List<String> remarks; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(SearchCloudGtmAddressesRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.address = request.address;
            this.addressId = request.addressId;
            this.availableStatus = request.availableStatus;
            this.enableStatus = request.enableStatus;
            this.healthStatus = request.healthStatus;
            this.monitorTemplateName = request.monitorTemplateName;
            this.nameSearchCondition = request.nameSearchCondition;
            this.names = request.names;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.remarkSearchCondition = request.remarkSearchCondition;
            this.remarks = request.remarks;
            this.type = request.type;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh-CN: Chinese</li>
         * <li>en-US (default): English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en-US</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>Query by service address with precise conditions, supporting IP addresses or domain names.</p>
         * 
         * <strong>example:</strong>
         * <p>223.5.XX.XX</p>
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * <p>The address ID. This ID uniquely identifies the address.</p>
         * 
         * <strong>example:</strong>
         * <p>addr-89518218114368**92</p>
         */
        public Builder addressId(String addressId) {
            this.putQueryParameter("AddressId", addressId);
            this.addressId = addressId;
            return this;
        }

        /**
         * <p>Search by address availability status with precise conditions:</p>
         * <ul>
         * <li>available</li>
         * <li>unavailable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>available</p>
         */
        public Builder availableStatus(String availableStatus) {
            this.putQueryParameter("AvailableStatus", availableStatus);
            this.availableStatus = availableStatus;
            return this;
        }

        /**
         * <p>Query by exact address enable status:</p>
         * <ul>
         * <li>enable: enabled status</li>
         * <li>disable: disabled status</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        public Builder enableStatus(String enableStatus) {
            this.putQueryParameter("EnableStatus", enableStatus);
            this.enableStatus = enableStatus;
            return this;
        }

        /**
         * <p>The health state of the addresses that you want to query. Valid values:</p>
         * <ul>
         * <li>ok: The addresses pass all health checks of the referenced health check templates.</li>
         * <li>ok_alert: The addresses fail some health checks of the referenced health check templates, but the addresses are deemed available.</li>
         * <li>ok_no_monitor: The addresses do not reference any health check template.</li>
         * <li>exceptional: The addresses fail some or all health checks of the referenced health check templates, and the addresses are deemed unavailable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder healthStatus(String healthStatus) {
            this.putQueryParameter("HealthStatus", healthStatus);
            this.healthStatus = healthStatus;
            return this;
        }

        /**
         * <p>Health check template name.</p>
         * 
         * <strong>example:</strong>
         * <p>Ping-IPv4</p>
         */
        public Builder monitorTemplateName(String monitorTemplateName) {
            this.putQueryParameter("MonitorTemplateName", monitorTemplateName);
            this.monitorTemplateName = monitorTemplateName;
            return this;
        }

        /**
         * <p>The logical condition for querying addresses by name. This parameter is required if you want to query addresses by name. Valid values:</p>
         * <ul>
         * <li>and: displays the results that match all search conditions.</li>
         * <li>or: displays the results that match some or all search conditions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>or</p>
         */
        public Builder nameSearchCondition(String nameSearchCondition) {
            this.putQueryParameter("NameSearchCondition", nameSearchCondition);
            this.nameSearchCondition = nameSearchCondition;
            return this;
        }

        /**
         * <p>Address name, usually for users to distinguish between different addresses.</p>
         */
        public Builder names(java.util.List<String> names) {
            this.putQueryParameter("Names", names);
            this.names = names;
            return this;
        }

        /**
         * <p>Current page number, starting from 1, default is 1.</p>
         * <p>This parameter is required.</p>
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
         * <p>The number of rows per page when paginating queries, with a maximum value of 100 and a default of 20.</p>
         * <p>This parameter is required.</p>
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
         * <p>The logical condition for querying addresses by additional description. This parameter is required if you want to query addresses by additional description. Valid values:</p>
         * <p>and: displays the results that match all search conditions.</p>
         * <p>or: displays the results that match some or all search conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>or</p>
         */
        public Builder remarkSearchCondition(String remarkSearchCondition) {
            this.putQueryParameter("RemarkSearchCondition", remarkSearchCondition);
            this.remarkSearchCondition = remarkSearchCondition;
            return this;
        }

        /**
         * <p>Remarks for the address.</p>
         */
        public Builder remarks(java.util.List<String> remarks) {
            this.putQueryParameter("Remarks", remarks);
            this.remarks = remarks;
            return this;
        }

        /**
         * <p>Search precisely by address type conditions:</p>
         * <ul>
         * <li>IPv4</li>
         * <li>IPv6</li>
         * <li>domain</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public SearchCloudGtmAddressesRequest build() {
            return new SearchCloudGtmAddressesRequest(this);
        } 

    } 

}
