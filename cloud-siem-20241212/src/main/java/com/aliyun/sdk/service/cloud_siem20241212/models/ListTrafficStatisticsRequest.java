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
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * LogUserIds.
         */
        public Builder logUserIds(java.util.List<Long> logUserIds) {
            String logUserIdsShrink = shrink(logUserIds, "LogUserIds", "simple");
            this.putBodyParameter("LogUserIds", logUserIdsShrink);
            this.logUserIds = logUserIds;
            return this;
        }

        /**
         * ProductId.
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RegionTag.
         */
        public Builder regionTag(Integer regionTag) {
            this.putBodyParameter("RegionTag", regionTag);
            this.regionTag = regionTag;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * TrafficStatisticPeriod.
         */
        public Builder trafficStatisticPeriod(String trafficStatisticPeriod) {
            this.putBodyParameter("TrafficStatisticPeriod", trafficStatisticPeriod);
            this.trafficStatisticPeriod = trafficStatisticPeriod;
            return this;
        }

        /**
         * TrafficStatisticPeriodType.
         */
        public Builder trafficStatisticPeriodType(String trafficStatisticPeriodType) {
            this.putBodyParameter("TrafficStatisticPeriodType", trafficStatisticPeriodType);
            this.trafficStatisticPeriodType = trafficStatisticPeriodType;
            return this;
        }

        /**
         * TrafficStatisticType.
         */
        public Builder trafficStatisticType(String trafficStatisticType) {
            this.putBodyParameter("TrafficStatisticType", trafficStatisticType);
            this.trafficStatisticType = trafficStatisticType;
            return this;
        }

        /**
         * TrafficType.
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
