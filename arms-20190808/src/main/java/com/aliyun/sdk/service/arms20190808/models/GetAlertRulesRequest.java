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
    @NameInMap("ProductCode")
    private String productCode;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Size")
    @Validation(required = true)
    private Long size;

    @Query
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    private GetAlertRulesRequest(Builder builder) {
        super(builder);
        this.alertIds = builder.alertIds;
        this.alertNames = builder.alertNames;
        this.alertStatus = builder.alertStatus;
        this.alertType = builder.alertType;
        this.clusterId = builder.clusterId;
        this.page = builder.page;
        this.productCode = builder.productCode;
        this.regionId = builder.regionId;
        this.size = builder.size;
        this.tags = builder.tags;
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
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
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

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<GetAlertRulesRequest, Builder> {
        private String alertIds; 
        private String alertNames; 
        private String alertStatus; 
        private String alertType; 
        private String clusterId; 
        private Long page; 
        private String productCode; 
        private String regionId; 
        private Long size; 
        private java.util.List < Tags> tags; 

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
            this.productCode = request.productCode;
            this.regionId = request.regionId;
            this.size = request.size;
            this.tags = request.tags;
        } 

        /**
         * The unique IDs of alert rules.
         * <p>
         * 
         * *   If you do not specify this parameter, the API operation does not filter alert rules based on their IDs.
         * *   If you specify this parameter, the API operation returns only the information of the specified alert rules. Other filter conditions also take effect.
         * 
         * > When you call the GetAlertRules operation, you can specify other request parameters to obtain the AlertIds parameter from the response. Then, you can specify the AlertIds parameter to query the specified alert rules.
         */
        public Builder alertIds(String alertIds) {
            this.putQueryParameter("AlertIds", alertIds);
            this.alertIds = alertIds;
            return this;
        }

        /**
         * The names of alert rules. When you create alert rules of the new version, you cannot specify duplicate names. However, existing alert rules may have duplicate names. Therefore, the **AlertName** parameter does not uniquely identify an alert rule.
         * <p>
         * 
         * *   If you do not specify this parameter, the API operation does not filter alert rules based on their names.
         * *   If you specify this parameter, the API operation returns only the information of the specified alert rules. Other filter conditions also take effect.
         */
        public Builder alertNames(String alertNames) {
            this.putQueryParameter("AlertNames", alertNames);
            this.alertNames = alertNames;
            return this;
        }

        /**
         * The status of the alert rule. Valid values:
         * <p>
         * 
         * *   RUNNING
         * *   STOPPED
         * *   PAUSED
         * 
         * > The **PAUSED** status indicates that the alert rule is abnormal and is actively paused by the system. The alert rule may be paused because that it is not unique or the associated cluster has been deleted.
         */
        public Builder alertStatus(String alertStatus) {
            this.putQueryParameter("AlertStatus", alertStatus);
            this.alertStatus = alertStatus;
            return this;
        }

        /**
         * The type of the alert rule.
         * <p>
         * 
         * *   APPLICATION_MONITORING_ALERT_RULE: alert rule for Application Monitoring
         * *   BROWSER_MONITORING_ALERT_RULE: an alert rule for Browser Monitoring.
         * *   PROMETHEUS_MONITORING_ALERT_RULE: alert rule for Managed Service for Prometheus.
         */
        public Builder alertType(String alertType) {
            this.putQueryParameter("AlertType", alertType);
            this.alertType = alertType;
            return this;
        }

        /**
         * The ID of the monitored cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * You do not need to configure this parameter.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The number of alert rules to return on each page.
         */
        public Builder size(Long size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public GetAlertRulesRequest build() {
            return new GetAlertRulesRequest(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
