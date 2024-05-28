// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCloudGtmInstanceConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListCloudGtmInstanceConfigsRequest</p>
 */
public class ListCloudGtmInstanceConfigsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableStatus")
    private String enableStatus;

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

    private ListCloudGtmInstanceConfigsRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clientToken = builder.clientToken;
        this.enableStatus = builder.enableStatus;
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

    public static ListCloudGtmInstanceConfigsRequest create() {
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

    public static final class Builder extends Request.Builder<ListCloudGtmInstanceConfigsRequest, Builder> {
        private String acceptLanguage; 
        private String clientToken; 
        private String enableStatus; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String remark; 
        private String scheduleDomainName; 
        private String scheduleZoneName; 

        private Builder() {
            super();
        } 

        private Builder(ListCloudGtmInstanceConfigsRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clientToken = request.clientToken;
            this.enableStatus = request.enableStatus;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.scheduleDomainName = request.scheduleDomainName;
            this.scheduleZoneName = request.scheduleZoneName;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * EnableStatus.
         */
        public Builder enableStatus(String enableStatus) {
            this.putQueryParameter("EnableStatus", enableStatus);
            this.enableStatus = enableStatus;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * ScheduleDomainName.
         */
        public Builder scheduleDomainName(String scheduleDomainName) {
            this.putQueryParameter("ScheduleDomainName", scheduleDomainName);
            this.scheduleDomainName = scheduleDomainName;
            return this;
        }

        /**
         * ScheduleZoneName.
         */
        public Builder scheduleZoneName(String scheduleZoneName) {
            this.putQueryParameter("ScheduleZoneName", scheduleZoneName);
            this.scheduleZoneName = scheduleZoneName;
            return this;
        }

        @Override
        public ListCloudGtmInstanceConfigsRequest build() {
            return new ListCloudGtmInstanceConfigsRequest(this);
        } 

    } 

}
