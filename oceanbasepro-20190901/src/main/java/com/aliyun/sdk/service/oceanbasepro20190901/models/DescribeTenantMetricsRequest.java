// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeTenantMetricsRequest} extends {@link RequestModel}
 *
 * <p>DescribeTenantMetricsRequest</p>
 */
public class DescribeTenantMetricsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Metrics")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metrics;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @Deprecated
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantIdList")
    private String tenantIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantName")
    @Deprecated
    private String tenantName;

    private DescribeTenantMetricsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.metrics = builder.metrics;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.tenantId = builder.tenantId;
        this.tenantIdList = builder.tenantIdList;
        this.tenantName = builder.tenantName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTenantMetricsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return metrics
     */
    public String getMetrics() {
        return this.metrics;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return tenantIdList
     */
    public String getTenantIdList() {
        return this.tenantIdList;
    }

    /**
     * @return tenantName
     */
    public String getTenantName() {
        return this.tenantName;
    }

    public static final class Builder extends Request.Builder<DescribeTenantMetricsRequest, Builder> {
        private String regionId; 
        private String endTime; 
        private String instanceId; 
        private String metrics; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String startTime; 
        private String tenantId; 
        private String tenantIdList; 
        private String tenantName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTenantMetricsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.metrics = request.metrics;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.tenantId = request.tenantId;
            this.tenantIdList = request.tenantIdList;
            this.tenantName = request.tenantName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-13T15:45:43Z</p>
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>2021-06-13T15:40:43Z</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ob317v4uif****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>{&quot;name&quot;:&quot;DescribeTenantMetrics&quot;,&quot;product&quot;:&quot;OceanBasePro&quot;,&quot;version&quot;:&quot;2019-09-01&quot;,&quot;path&quot;:&quot;/&quot;,&quot;deprecated&quot;:0,&quot;method&quot;:&quot;POST|GET&quot;,&quot;protocol&quot;:&quot;HTTP|HTTPS&quot;,&quot;hidden&quot;:0,&quot;timeout&quot;:10000,&quot;parameter_type&quot;:&quot;Single&quot;,&quot;params&quot;:&quot;[{&quot;name&quot;:&quot;Action&quot;,&quot;position&quot;:&quot;Query&quot;,&quot;required&quot;:true,&quot;checkBlank&quot;:false,&quot;visibility&quot;:&quot;Public&quot;,&quot;deprecated&quot;:false,&quot;type&quot;:&quot;String&quot;,&quot;description&quot;:&quot;&quot;,&quot;example&quot;:&quot;DescribeTenantMetrics&quot;},{&quot;name&quot;:&quot;InstanceId&quot;,&quot;position&quot;:&quot;Body&quot;,&quot;required&quot;:true,&quot;checkBlank&quot;:false,&quot;visibility&quot;:&quot;Public&quot;,&quot;deprecated&quot;:false,&quot;type&quot;:&quot;String&quot;,&quot;title&quot;:&quot;&quot;,&quot;description&quot;:&quot;&quot;,&quot;example&quot;:&quot;ob317v4uif****&quot;},{&quot;name&quot;:&quot;PageSize&quot;,&quot;position&quot;:&quot;Body&quot;,&quot;required&quot;:false,&quot;checkBlank&quot;:false,&quot;visibility&quot;:&quot;Public&quot;,&quot;deprecated&quot;:false,&quot;type&quot;:&quot;Integer&quot;,&quot;title&quot;:&quot;&quot;,&quot;description&quot;:&quot;&quot;,&quot;example&quot;:&quot;10&quot;},{&quot;name&quot;:&quot;PageNumber&quot;,&quot;position&quot;:&quot;Body&quot;,&quot;required&quot;:false,&quot;checkBlank&quot;:false,&quot;visibility&quot;:&quot;Public&quot;,&quot;deprecated&quot;:false,&quot;type&quot;:&quot;Integer&quot;,&quot;title&quot;:&quot;&quot;,&quot;description&quot;:&quot;&quot;,&quot;example&quot;:&quot;1&quot;},{&quot;name&quot;:&quot;TenantName&quot;,&quot;position&quot;:&quot;Body&quot;,&quot;required&quot;:false,&quot;checkBlank&quot;:false,&quot;visibility&quot;:&quot;Public&quot;,&quot;deprecated&quot;:true,&quot;type&quot;:&quot;String&quot;,&quot;title&quot;:&quot;&quot;,&quot;description&quot;:&quot;&quot;,&quot;example&quot;:&quot;pay_online&quot;},{&quot;name&quot;:&quot;StartTime&quot;,&quot;position&quot;:&quot;Body&quot;,&quot;required&quot;:true,&quot;checkBlank&quot;:false,&quot;visibility&quot;:&quot;Public&quot;,&quot;deprecated&quot;:false,&quot;type&quot;:&quot;String&quot;,&quot;title&quot;:&quot;&quot;,&quot;description&quot;:&quot;&quot;,&quot;example&quot;:&quot;2021-06-13T15:40:43Z&quot;},{&quot;name&quot;:&quot;EndTime&quot;,&quot;position&quot;:&quot;Body&quot;,&quot;required&quot;:true,&quot;checkBlank&quot;:false,&quot;visibility&quot;:&quot;Public&quot;,&quot;deprecated&quot;:false,&quot;type&quot;:&quot;String&quot;,&quot;title&quot;:&quot;&quot;,&quot;description&quot;:&quot;&quot;,&quot;example&quot;:&quot;2021-06-13T15:45:43Z&quot;},{&quot;name&quot;:&quot;Metrics&quot;,&quot;position&quot;:&quot;Body&quot;,&quot;required&quot;:true,&quot;checkBlank&quot;:false,&quot;visibility&quot;:&quot;Public&quot;,&quot;deprecated&quot;:false,&quot;type&quot;:&quot;String&quot;,&quot;title&quot;:&quot;&quot;,&quot;description&quot;:&quot;&quot;,&quot;example&quot;:&quot;tps&quot;},{&quot;name&quot;:&quot;TenantId&quot;,&quot;position&quot;:&quot;Body&quot;,&quot;required&quot;:false,&quot;checkBlank&quot;:false,&quot;visibility&quot;:&quot;Public&quot;,&quot;deprecated&quot;:true,&quot;type&quot;:&quot;String&quot;,&quot;title&quot;:&quot;&quot;,&quot;description&quot;:&quot;&quot;,&quot;example&quot;:&quot;tfafd34fs****&quot;},{&quot;name&quot;:&quot;TenantIdList&quot;,&quot;position&quot;:&quot;Body&quot;,&quot;required&quot;:false,&quot;checkBlank&quot;:false,&quot;visibility&quot;:&quot;Public&quot;,&quot;deprecated&quot;:false,&quot;type&quot;:&quot;String&quot;,&quot;title&quot;:&quot;&quot;,&quot;description&quot;:&quot;&quot;,&quot;example&quot;:&quot;[tdak3nac****,tdakc42df****]&quot;}]&quot;,&quot;response_headers&quot;:&quot;[]&quot;,&quot;response&quot;:&quot;{&quot;type&quot;:&quot;Object&quot;,&quot;children&quot;:[{&quot;name&quot;:&quot;TotalCount&quot;,&quot;required&quot;:false,&quot;checkBlank&quot;:false,&quot;visibility&quot;:&quot;Public&quot;,&quot;deprecated&quot;:false,&quot;type&quot;:&quot;Integer&quot;,&quot;title&quot;:&quot;&quot;,&quot;description&quot;:&quot;&quot;,&quot;example&quot;:&quot;9&quot;},{&quot;name&quot;:&quot;RequestId&quot;,&quot;required&quot;:false,&quot;checkBlank&quot;:false,&quot;visibility&quot;:&quot;Public&quot;,&quot;deprecated&quot;:false,&quot;type&quot;:&quot;String&quot;,&quot;title&quot;:&quot;&quot;,&quot;description&quot;:&quot;&quot;,&quot;example&quot;:&quot;EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C&quot;},{&quot;name&quot;:&quot;TenantMetrics&quot;,&quot;required&quot;:false,&quot;checkBlank&quot;:false,&quot;visibility&quot;:&quot;Public&quot;,&quot;deprecated&quot;:false,&quot;type&quot;:&quot;String&quot;,&quot;title&quot;:&quot;&quot;,&quot;description&quot;:&quot;&quot;,&quot;example&quot;:&quot;\&quot;Metrics\&quot;:[ {\&quot;request_queue_rt\&quot;:0.0,\&quot;TimeStamp\&quot;:\&quot;2022-02-23T01:58:00Z\&quot;}]&quot;}],&quot;title&quot;:&quot;&quot;,&quot;description&quot;:&quot;&quot;}&quot;,&quot;errors&quot;:&quot;{}&quot;}</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tps</p>
         */
        public Builder metrics(String metrics) {
            this.putBodyParameter("Metrics", metrics);
            this.metrics = metrics;
            return this;
        }

        /**
         * <p>The ID of the OceanBase cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>tfafd34fs****</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Example 1</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-13T15:40:43Z</p>
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * TenantIdList.
         */
        public Builder tenantIdList(String tenantIdList) {
            this.putBodyParameter("TenantIdList", tenantIdList);
            this.tenantIdList = tenantIdList;
            return this;
        }

        /**
         * <p>2021-06-13T15:45:43Z</p>
         * 
         * <strong>example:</strong>
         * <p>pay_online</p>
         */
        public Builder tenantName(String tenantName) {
            this.putBodyParameter("TenantName", tenantName);
            this.tenantName = tenantName;
            return this;
        }

        @Override
        public DescribeTenantMetricsRequest build() {
            return new DescribeTenantMetricsRequest(this);
        } 

    } 

}
