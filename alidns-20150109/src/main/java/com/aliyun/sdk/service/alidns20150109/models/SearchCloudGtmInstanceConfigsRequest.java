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
 * {@link SearchCloudGtmInstanceConfigsRequest} extends {@link RequestModel}
 *
 * <p>SearchCloudGtmInstanceConfigsRequest</p>
 */
public class SearchCloudGtmInstanceConfigsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AvailableStatus")
    private String availableStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableStatus")
    private String enableStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthStatus")
    private String healthStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleDomainName")
    private String scheduleDomainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleZoneName")
    private String scheduleZoneName;

    private SearchCloudGtmInstanceConfigsRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.availableStatus = builder.availableStatus;
        this.clientToken = builder.clientToken;
        this.enableStatus = builder.enableStatus;
        this.healthStatus = builder.healthStatus;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
        this.scheduleDomainName = builder.scheduleDomainName;
        this.scheduleZoneName = builder.scheduleZoneName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchCloudGtmInstanceConfigsRequest create() {
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
     * @return availableStatus
     */
    public String getAvailableStatus() {
        return this.availableStatus;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return scheduleDomainName
     */
    public String getScheduleDomainName() {
        return this.scheduleDomainName;
    }

    /**
     * @return scheduleZoneName
     */
    public String getScheduleZoneName() {
        return this.scheduleZoneName;
    }

    public static final class Builder extends Request.Builder<SearchCloudGtmInstanceConfigsRequest, Builder> {
        private String acceptLanguage; 
        private String availableStatus; 
        private String clientToken; 
        private String enableStatus; 
        private String healthStatus; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String remark; 
        private String scheduleDomainName; 
        private String scheduleZoneName; 

        private Builder() {
            super();
        } 

        private Builder(SearchCloudGtmInstanceConfigsRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.availableStatus = request.availableStatus;
            this.clientToken = request.clientToken;
            this.enableStatus = request.enableStatus;
            this.healthStatus = request.healthStatus;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.scheduleDomainName = request.scheduleDomainName;
            this.scheduleZoneName = request.scheduleZoneName;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh-CN: Chinese</li>
         * <li>en-US (default): English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The availability state of the access domain name. Valid values:</p>
         * <ul>
         * <li>available: If the access domain name is <strong>enabled</strong> and the health state is <strong>normal</strong>, the access domain name is deemed <strong>available</strong>.</li>
         * <li>unavailable: If the access domain name is <strong>disabled</strong> or the health state is <strong>abnormal</strong>, the access domain name is deemed <strong>unavailable</strong>.</li>
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
         * <p>The client token that is used to ensure the idempotence of the request. You can specify a custom value for this parameter, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The enabling state of the access domain name. Valid values:</p>
         * <ul>
         * <li>enable: The access domain name is enabled and the intelligent scheduling policy of the corresponding GTM instance takes effect.</li>
         * <li>disable: The access domain name is disabled and the intelligent scheduling policy of the corresponding GTM instance does not take effect.</li>
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
         * <p>The health state of the access domain name. Valid values:</p>
         * <ul>
         * <li>ok: The health state of the access domain name is normal and all address pools that are referenced by the access domain name are available.</li>
         * <li>ok_alert: The health state of the access domain name is warning and some of the address pools that are referenced by the access domain name are unavailable. In this case, only the available address pools are returned for Domain Name System (DNS) requests.</li>
         * <li>exceptional: The health state of the access domain name is abnormal and all address pools that are referenced by the access domain name are unavailable. In this case, addresses in the non-empty address pool with the smallest sequence number are preferentially used for fallback resolution. This returns DNS results for clients as much as possible.</li>
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
         * <p>The ID of the Global Traffic Manager (GTM) 3.0 instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gtm-cn-wwo3a3hbz**</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Current page number, starting from 1, default is 1.</p>
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
         * <p>The number of rows per page when paginating queries, with a maximum value of <strong>100</strong>, and a default of <strong>20</strong>.</p>
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
         * <p>Remarks for the domain instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The access domain name. The value of this parameter is composed of the value of ScheduleHostname and the value of ScheduleZoneName.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder scheduleDomainName(String scheduleDomainName) {
            this.putQueryParameter("ScheduleDomainName", scheduleDomainName);
            this.scheduleDomainName = scheduleDomainName;
            return this;
        }

        /**
         * <p>The zone such as example.com or subzone such as a.example.com of the access domain name. In most cases, the zone or subzone is hosted by the Public Authoritative DNS module of Alibaba Cloud DNS. This zone belongs to the account to which the GTM instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder scheduleZoneName(String scheduleZoneName) {
            this.putQueryParameter("ScheduleZoneName", scheduleZoneName);
            this.scheduleZoneName = scheduleZoneName;
            return this;
        }

        @Override
        public SearchCloudGtmInstanceConfigsRequest build() {
            return new SearchCloudGtmInstanceConfigsRequest(this);
        } 

    } 

}
