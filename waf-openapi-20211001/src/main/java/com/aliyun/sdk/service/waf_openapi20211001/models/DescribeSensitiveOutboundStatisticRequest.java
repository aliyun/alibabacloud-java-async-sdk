// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSensitiveOutboundStatisticRequest} extends {@link RequestModel}
 *
 * <p>DescribeSensitiveOutboundStatisticRequest</p>
 */
public class DescribeSensitiveOutboundStatisticRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DetectionResult")
    private String detectionResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderKey")
    private String orderKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderWay")
    private String orderWay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 25, minimum = 1)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SensitiveCode")
    private String sensitiveCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SensitiveLevel")
    private String sensitiveLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SensitiveType")
    private String sensitiveType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private DescribeSensitiveOutboundStatisticRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.detectionResult = builder.detectionResult;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.orderKey = builder.orderKey;
        this.orderWay = builder.orderWay;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.sensitiveCode = builder.sensitiveCode;
        this.sensitiveLevel = builder.sensitiveLevel;
        this.sensitiveType = builder.sensitiveType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSensitiveOutboundStatisticRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return detectionResult
     */
    public String getDetectionResult() {
        return this.detectionResult;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return orderKey
     */
    public String getOrderKey() {
        return this.orderKey;
    }

    /**
     * @return orderWay
     */
    public String getOrderWay() {
        return this.orderWay;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return sensitiveCode
     */
    public String getSensitiveCode() {
        return this.sensitiveCode;
    }

    /**
     * @return sensitiveLevel
     */
    public String getSensitiveLevel() {
        return this.sensitiveLevel;
    }

    /**
     * @return sensitiveType
     */
    public String getSensitiveType() {
        return this.sensitiveType;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeSensitiveOutboundStatisticRequest, Builder> {
        private String clusterId; 
        private String detectionResult; 
        private Long endTime; 
        private String instanceId; 
        private String orderKey; 
        private String orderWay; 
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private String sensitiveCode; 
        private String sensitiveLevel; 
        private String sensitiveType; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSensitiveOutboundStatisticRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.detectionResult = request.detectionResult;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.orderKey = request.orderKey;
            this.orderWay = request.orderWay;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.sensitiveCode = request.sensitiveCode;
            this.sensitiveLevel = request.sensitiveLevel;
            this.sensitiveType = request.sensitiveType;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The ID of the hybrid cloud cluster.</p>
         * <blockquote>
         * <p>For hybrid cloud scenarios only, you can call the <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> operation to query the hybrid cloud clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>428</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The evaluation result. Valid values:</p>
         * <ul>
         * <li><strong>report</strong>: Risks exist in cross-border data transfer.</li>
         * <li><strong>none</strong>: No risks exist in cross-border data transfer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>report</p>
         */
        public Builder detectionResult(String detectionResult) {
            this.putQueryParameter("DetectionResult", detectionResult);
            this.detectionResult = detectionResult;
            return this;
        }

        /**
         * <p>The end of the time range to query. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
         * <blockquote>
         * <p> You can query only data of the previous month, previous 3 months, previous 6 months, previous 12 months, and data generated since January 1 of last year for compliance check. You must specify a valid time range.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1725966000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf-cn-0xldbqt****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the sorting field. Valid values:</p>
         * <ul>
         * <li><strong>total_count</strong> (default): total number of data entries</li>
         * <li><strong>outbound_count</strong>: total number of data entries that are transferred across borders</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>total_count</p>
         */
        public Builder orderKey(String orderKey) {
            this.putQueryParameter("OrderKey", orderKey);
            this.orderKey = orderKey;
            return this;
        }

        /**
         * <p>The sorting method. Valid values:</p>
         * <ul>
         * <li><strong>desc</strong> (default): in descending order</li>
         * <li><strong>asc</strong>: in ascending order</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder orderWay(String orderWay) {
            this.putQueryParameter("OrderWay", orderWay);
            this.orderWay = orderWay;
            return this;
        }

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region in which the Web Application Firewall (WAF) instance is deployed. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong>: Chinese mainland</li>
         * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland</li>
         * </ul>
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
         * <p>The ID of the Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm***q</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The type of the sensitive data. Separate multiple types with commas (,).</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeApisecRules~~">DescribeApisecRules</a> operation to query the supported types of sensitive data. Only built-in types of sensitive data are supported for this operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000,1001</p>
         */
        public Builder sensitiveCode(String sensitiveCode) {
            this.putQueryParameter("SensitiveCode", sensitiveCode);
            this.sensitiveCode = sensitiveCode;
            return this;
        }

        /**
         * <p>The sensitivity level. Valid values:</p>
         * <ul>
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        public Builder sensitiveLevel(String sensitiveLevel) {
            this.putQueryParameter("SensitiveLevel", sensitiveLevel);
            this.sensitiveLevel = sensitiveLevel;
            return this;
        }

        /**
         * <p>The type of the information. Valid values:</p>
         * <ul>
         * <li><strong>info</strong> (default): full personal information</li>
         * <li><strong>sensitive</strong>: sensitive personal information</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>info</p>
         */
        public Builder sensitiveType(String sensitiveType) {
            this.putQueryParameter("SensitiveType", sensitiveType);
            this.sensitiveType = sensitiveType;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
         * <blockquote>
         * <p> You can query only data of the previous month, previous 3 months, previous 6 months, previous 12 months, and data generated since January 1 of last year for compliance check. You must specify a valid time range.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1672502400</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeSensitiveOutboundStatisticRequest build() {
            return new DescribeSensitiveOutboundStatisticRequest(this);
        } 

    } 

}
