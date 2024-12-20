// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link GetAlertRulesRequest} extends {@link RequestModel}
 *
 * <p>GetAlertRulesRequest</p>
 */
public class GetAlertRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertIds")
    private String alertIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertNames")
    private String alertNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertStatus")
    private String alertStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertType")
    private String alertType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

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
    public java.util.List<Tags> getTags() {
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
        private java.util.List<Tags> tags; 

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
         * <p>The unique IDs of alert rules.</p>
         * <ul>
         * <li>If you do not specify this parameter, the API operation does not filter alert rules based on their IDs.</li>
         * <li>If you specify this parameter, the API operation returns only the information of the specified alert rules. Other filter conditions also take effect.</li>
         * </ul>
         * <blockquote>
         * <p>When you call the GetAlertRules operation, you can specify other request parameters to obtain the AlertIds parameter from the response. Then, you can specify the AlertIds parameter to query the specified alert rules.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;12345&quot;]</p>
         */
        public Builder alertIds(String alertIds) {
            this.putQueryParameter("AlertIds", alertIds);
            this.alertIds = alertIds;
            return this;
        }

        /**
         * <p>The names of alert rules. When you create alert rules of the new version, you cannot specify duplicate names. However, existing alert rules may have duplicate names. Therefore, the <strong>AlertName</strong> parameter does not uniquely identify an alert rule.</p>
         * <ul>
         * <li>If you do not specify this parameter, the API operation does not filter alert rules based on their names.</li>
         * <li>If you specify this parameter, the API operation returns only the information of the specified alert rules. Other filter conditions also take effect.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;test&quot;]</p>
         */
        public Builder alertNames(String alertNames) {
            this.putQueryParameter("AlertNames", alertNames);
            this.alertNames = alertNames;
            return this;
        }

        /**
         * <p>The status of the alert rule. Valid values:</p>
         * <ul>
         * <li>RUNNING</li>
         * <li>STOPPED</li>
         * <li>PAUSED</li>
         * </ul>
         * <blockquote>
         * <p> The PAUSED state indicates that the alert rule is abnormal and has been suspended. This may be because the specified threshold value is excessively large, or the associated cluster has been deleted.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder alertStatus(String alertStatus) {
            this.putQueryParameter("AlertStatus", alertStatus);
            this.alertStatus = alertStatus;
            return this;
        }

        /**
         * <p>The type of the alert rule. This parameter is required for the new version of Alert Management.</p>
         * <ul>
         * <li>APPLICATION_MONITORING_ALERT_RULE: alert rule for Application Monitoring</li>
         * <li>BROWSER_MONITORING_ALERT_RULE: alert rule for Browser Monitoring</li>
         * <li>PROMETHEUS_MONITORING_ALERT_RULE: alert rule for Managed Service for Prometheus</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>APPLICATION_MONITORING_ALERT_RULE</p>
         */
        public Builder alertType(String alertType) {
            this.putQueryParameter("AlertType", alertType);
            this.alertType = alertType;
            return this;
        }

        /**
         * <p>The ID of the monitored cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ceba9b9ea5b924dd0b6726d2de6******</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>You do not need to configure this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The number of alert rules to return on each page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder size(Long size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public GetAlertRulesRequest build() {
            return new GetAlertRulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetAlertRulesRequest} extends {@link TeaModel}
     *
     * <p>GetAlertRulesRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>type</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>prod</p>
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
