// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListTrafficStatisticsRequest} extends {@link RequestModel}
 *
 * <p>ListTrafficStatisticsRequest</p>
 */
public class ListTrafficStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogUserIds")
    private java.util.List<Long> logUserIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductId")
    private String productId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionTag")
    private Integer regionTag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TrafficStatisticPeriod")
    private String trafficStatisticPeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TrafficStatisticPeriodType")
    private String trafficStatisticPeriodType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TrafficStatisticType")
    private String trafficStatisticType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TrafficType")
    private String trafficType;

    private ListTrafficStatisticsRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.logUserIds = builder.logUserIds;
        this.productId = builder.productId;
        this.regionId = builder.regionId;
        this.regionTag = builder.regionTag;
        this.roleFor = builder.roleFor;
        this.trafficStatisticPeriod = builder.trafficStatisticPeriod;
        this.trafficStatisticPeriodType = builder.trafficStatisticPeriodType;
        this.trafficStatisticType = builder.trafficStatisticType;
        this.trafficType = builder.trafficType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrafficStatisticsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return logUserIds
     */
    public java.util.List<Long> getLogUserIds() {
        return this.logUserIds;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return regionTag
     */
    public Integer getRegionTag() {
        return this.regionTag;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return trafficStatisticPeriod
     */
    public String getTrafficStatisticPeriod() {
        return this.trafficStatisticPeriod;
    }

    /**
     * @return trafficStatisticPeriodType
     */
    public String getTrafficStatisticPeriodType() {
        return this.trafficStatisticPeriodType;
    }

    /**
     * @return trafficStatisticType
     */
    public String getTrafficStatisticType() {
        return this.trafficStatisticType;
    }

    /**
     * @return trafficType
     */
    public String getTrafficType() {
        return this.trafficType;
    }

    public static final class Builder extends Request.Builder<ListTrafficStatisticsRequest, Builder> {
        private String lang; 
        private java.util.List<Long> logUserIds; 
        private String productId; 
        private String regionId; 
        private Integer regionTag; 
        private Long roleFor; 
        private String trafficStatisticPeriod; 
        private String trafficStatisticPeriodType; 
        private String trafficStatisticType; 
        private String trafficType; 

        private Builder() {
            super();
        } 

        private Builder(ListTrafficStatisticsRequest request) {
            super(request);
            this.lang = request.lang;
            this.logUserIds = request.logUserIds;
            this.productId = request.productId;
            this.regionId = request.regionId;
            this.regionTag = request.regionTag;
            this.roleFor = request.roleFor;
            this.trafficStatisticPeriod = request.trafficStatisticPeriod;
            this.trafficStatisticPeriodType = request.trafficStatisticPeriodType;
            this.trafficStatisticType = request.trafficStatisticType;
            this.trafficType = request.trafficType;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.
         * Note: This parameter is required in practice. If this parameter is not specified, the API returns a 400 error: &quot;The specified Lang can not be empty.&quot;</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The list of user IDs for batch data ingestion.</p>
         */
        public Builder logUserIds(java.util.List<Long> logUserIds) {
            String logUserIdsShrink = shrink(logUserIds, "LogUserIds", "simple");
            this.putBodyParameter("LogUserIds", logUserIdsShrink);
            this.logUserIds = logUserIds;
            return this;
        }

        /**
         * <p>The product ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas</p>
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>The region where the threat detection and response data management center resides. Specify the management center based on the region of your assets. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: The assets reside in the Chinese mainland.</li>
         * <li>ap-southeast-1: The assets reside outside China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder regionTag(Integer regionTag) {
            this.putBodyParameter("RegionTag", regionTag);
            this.regionTag = regionTag;
            return this;
        }

        /**
         * <p>The user ID that the administrator switches to when viewing from another member\&quot;s perspective.</p>
         * 
         * <strong>example:</strong>
         * <p>173326*******</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * <p>The statistical period.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder trafficStatisticPeriod(String trafficStatisticPeriod) {
            this.putBodyParameter("TrafficStatisticPeriod", trafficStatisticPeriod);
            this.trafficStatisticPeriod = trafficStatisticPeriod;
            return this;
        }

        /**
         * <p>The statistical granularity. Valid values:</p>
         * <ul>
         * <li>day: day. This is the default value.</li>
         * <li>hour: hour.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        public Builder trafficStatisticPeriodType(String trafficStatisticPeriodType) {
            this.putBodyParameter("TrafficStatisticPeriodType", trafficStatisticPeriodType);
            this.trafficStatisticPeriodType = trafficStatisticPeriodType;
            return this;
        }

        /**
         * <p>The statistical dimension. Valid values:</p>
         * <ul>
         * <li>Region</li>
         * <li>Product</li>
         * <li>DataIngetion</li>
         * <li>logUserId</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Region</p>
         */
        public Builder trafficStatisticType(String trafficStatisticType) {
            this.putBodyParameter("TrafficStatisticType", trafficStatisticType);
            this.trafficStatisticType = trafficStatisticType;
            return this;
        }

        /**
         * <p>The log traffic type.</p>
         * 
         * <strong>example:</strong>
         * <p>agentAnalysisLogTraffic</p>
         */
        public Builder trafficType(String trafficType) {
            this.putBodyParameter("TrafficType", trafficType);
            this.trafficType = trafficType;
            return this;
        }

        @Override
        public ListTrafficStatisticsRequest build() {
            return new ListTrafficStatisticsRequest(this);
        } 

    } 

}
