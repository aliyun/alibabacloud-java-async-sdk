// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlertRulesRequest} extends {@link RequestModel}
 *
 * <p>GetAlertRulesRequest</p>
 */
public class GetAlertRulesRequest extends Request {
    @Query
    @NameInMap("AlertIds")
    private String alertIds;

    @Query
    @NameInMap("AlertNames")
    private String alertNames;

    @Query
    @NameInMap("AlertStatus")
    private String alertStatus;

    @Query
    @NameInMap("AlertType")
    @Validation(required = true)
    private String alertType;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("Page")
    @Validation(required = true)
    private Long page;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Size")
    @Validation(required = true)
    private Long size;

    private GetAlertRulesRequest(Builder builder) {
        super(builder);
        this.alertIds = builder.alertIds;
        this.alertNames = builder.alertNames;
        this.alertStatus = builder.alertStatus;
        this.alertType = builder.alertType;
        this.clusterId = builder.clusterId;
        this.page = builder.page;
        this.regionId = builder.regionId;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlertRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertIds
     */
    public String getAlertIds() {
        return this.alertIds;
    }

    /**
     * @return alertNames
     */
    public String getAlertNames() {
        return this.alertNames;
    }

    /**
     * @return alertStatus
     */
    public String getAlertStatus() {
        return this.alertStatus;
    }

    /**
     * @return alertType
     */
    public String getAlertType() {
        return this.alertType;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<GetAlertRulesRequest, Builder> {
        private String alertIds; 
        private String alertNames; 
        private String alertStatus; 
        private String alertType; 
        private String clusterId; 
        private Long page; 
        private String regionId; 
        private Long size; 

        private Builder() {
            super();
        } 

        private Builder(GetAlertRulesRequest request) {
            super(request);
            this.alertIds = request.alertIds;
            this.alertNames = request.alertNames;
            this.alertStatus = request.alertStatus;
            this.alertType = request.alertType;
            this.clusterId = request.clusterId;
            this.page = request.page;
            this.regionId = request.regionId;
            this.size = request.size;
        } 

        /**
         * 告警规则ID
         */
        public Builder alertIds(String alertIds) {
            this.putQueryParameter("AlertIds", alertIds);
            this.alertIds = alertIds;
            return this;
        }

        /**
         * 告警规则名称
         */
        public Builder alertNames(String alertNames) {
            this.putQueryParameter("AlertNames", alertNames);
            this.alertNames = alertNames;
            return this;
        }

        /**
         * 告警规则运行状态
         */
        public Builder alertStatus(String alertStatus) {
            this.putQueryParameter("AlertStatus", alertStatus);
            this.alertStatus = alertStatus;
            return this;
        }

        /**
         * 告警规则类型
         */
        public Builder alertType(String alertType) {
            this.putQueryParameter("AlertType", alertType);
            this.alertType = alertType;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 页数
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * 地域
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 每一页大小
         */
        public Builder size(Long size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public GetAlertRulesRequest build() {
            return new GetAlertRulesRequest(this);
        } 

    } 

}
