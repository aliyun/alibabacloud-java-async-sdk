// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNisNetworkMetricsRequest} extends {@link RequestModel}
 *
 * <p>GetNisNetworkMetricsRequest</p>
 */
public class GetNisNetworkMetricsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountIds")
    private java.util.List < String > accountIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    @com.aliyun.core.annotation.Validation(maximum = 253402271999000D)
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dimensions")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Dimensions> dimensions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(maximum = 253402271999000D)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanBy")
    private String scanBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseCrossAccount")
    private Boolean useCrossAccount;

    private GetNisNetworkMetricsRequest(Builder builder) {
        super(builder);
        this.accountIds = builder.accountIds;
        this.beginTime = builder.beginTime;
        this.dimensions = builder.dimensions;
        this.endTime = builder.endTime;
        this.metricName = builder.metricName;
        this.regionNo = builder.regionNo;
        this.resourceType = builder.resourceType;
        this.scanBy = builder.scanBy;
        this.useCrossAccount = builder.useCrossAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNisNetworkMetricsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountIds
     */
    public java.util.List < String > getAccountIds() {
        return this.accountIds;
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return dimensions
     */
    public java.util.List < Dimensions> getDimensions() {
        return this.dimensions;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return scanBy
     */
    public String getScanBy() {
        return this.scanBy;
    }

    /**
     * @return useCrossAccount
     */
    public Boolean getUseCrossAccount() {
        return this.useCrossAccount;
    }

    public static final class Builder extends Request.Builder<GetNisNetworkMetricsRequest, Builder> {
        private java.util.List < String > accountIds; 
        private Long beginTime; 
        private java.util.List < Dimensions> dimensions; 
        private Long endTime; 
        private String metricName; 
        private String regionNo; 
        private String resourceType; 
        private String scanBy; 
        private Boolean useCrossAccount; 

        private Builder() {
            super();
        } 

        private Builder(GetNisNetworkMetricsRequest request) {
            super(request);
            this.accountIds = request.accountIds;
            this.beginTime = request.beginTime;
            this.dimensions = request.dimensions;
            this.endTime = request.endTime;
            this.metricName = request.metricName;
            this.regionNo = request.regionNo;
            this.resourceType = request.resourceType;
            this.scanBy = request.scanBy;
            this.useCrossAccount = request.useCrossAccount;
        } 

        /**
         * AccountIds.
         */
        public Builder accountIds(java.util.List < String > accountIds) {
            this.putQueryParameter("AccountIds", accountIds);
            this.accountIds = accountIds;
            return this;
        }

        /**
         * BeginTime.
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * Dimensions.
         */
        public Builder dimensions(java.util.List < Dimensions> dimensions) {
            String dimensionsShrink = shrink(dimensions, "Dimensions", "json");
            this.putQueryParameter("Dimensions", dimensionsShrink);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * MetricName.
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * RegionNo.
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * ScanBy.
         */
        public Builder scanBy(String scanBy) {
            this.putQueryParameter("ScanBy", scanBy);
            this.scanBy = scanBy;
            return this;
        }

        /**
         * UseCrossAccount.
         */
        public Builder useCrossAccount(Boolean useCrossAccount) {
            this.putQueryParameter("UseCrossAccount", useCrossAccount);
            this.useCrossAccount = useCrossAccount;
            return this;
        }

        @Override
        public GetNisNetworkMetricsRequest build() {
            return new GetNisNetworkMetricsRequest(this);
        } 

    } 

    public static class Dimensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Dimensions(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dimensions create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Dimensions build() {
                return new Dimensions(this);
            } 

        } 

    }
}
