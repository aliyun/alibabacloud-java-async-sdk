// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeApisecApiResourcesRequest} extends {@link RequestModel}
 *
 * <p>DescribeApisecApiResourcesRequest</p>
 */
public class DescribeApisecApiResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiFormat")
    private String apiFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiId")
    private String apiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiMethod")
    private String apiMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiStatus")
    private String apiStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiTag")
    private String apiTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiType")
    private String apiType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthFlag")
    private String authFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Follow")
    private Long follow;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchedHost")
    private String matchedHost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Note")
    private String note;

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
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestSensitiveType")
    private String requestSensitiveType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SensitiveLevel")
    private String sensitiveLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SensitiveType")
    private String sensitiveType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeApisecApiResourcesRequest(Builder builder) {
        super(builder);
        this.apiFormat = builder.apiFormat;
        this.apiId = builder.apiId;
        this.apiMethod = builder.apiMethod;
        this.apiStatus = builder.apiStatus;
        this.apiTag = builder.apiTag;
        this.apiType = builder.apiType;
        this.authFlag = builder.authFlag;
        this.clusterId = builder.clusterId;
        this.endTime = builder.endTime;
        this.follow = builder.follow;
        this.instanceId = builder.instanceId;
        this.matchedHost = builder.matchedHost;
        this.note = builder.note;
        this.orderKey = builder.orderKey;
        this.orderWay = builder.orderWay;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.requestSensitiveType = builder.requestSensitiveType;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.sensitiveLevel = builder.sensitiveLevel;
        this.sensitiveType = builder.sensitiveType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisecApiResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiFormat
     */
    public String getApiFormat() {
        return this.apiFormat;
    }

    /**
     * @return apiId
     */
    public String getApiId() {
        return this.apiId;
    }

    /**
     * @return apiMethod
     */
    public String getApiMethod() {
        return this.apiMethod;
    }

    /**
     * @return apiStatus
     */
    public String getApiStatus() {
        return this.apiStatus;
    }

    /**
     * @return apiTag
     */
    public String getApiTag() {
        return this.apiTag;
    }

    /**
     * @return apiType
     */
    public String getApiType() {
        return this.apiType;
    }

    /**
     * @return authFlag
     */
    public String getAuthFlag() {
        return this.authFlag;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return follow
     */
    public Long getFollow() {
        return this.follow;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return matchedHost
     */
    public String getMatchedHost() {
        return this.matchedHost;
    }

    /**
     * @return note
     */
    public String getNote() {
        return this.note;
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
     * @return requestSensitiveType
     */
    public String getRequestSensitiveType() {
        return this.requestSensitiveType;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
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
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeApisecApiResourcesRequest, Builder> {
        private String apiFormat; 
        private String apiId; 
        private String apiMethod; 
        private String apiStatus; 
        private String apiTag; 
        private String apiType; 
        private String authFlag; 
        private String clusterId; 
        private String endTime; 
        private Long follow; 
        private String instanceId; 
        private String matchedHost; 
        private String note; 
        private String orderKey; 
        private String orderWay; 
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 
        private String requestSensitiveType; 
        private String resourceManagerResourceGroupId; 
        private String sensitiveLevel; 
        private String sensitiveType; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApisecApiResourcesRequest request) {
            super(request);
            this.apiFormat = request.apiFormat;
            this.apiId = request.apiId;
            this.apiMethod = request.apiMethod;
            this.apiStatus = request.apiStatus;
            this.apiTag = request.apiTag;
            this.apiType = request.apiType;
            this.authFlag = request.authFlag;
            this.clusterId = request.clusterId;
            this.endTime = request.endTime;
            this.follow = request.follow;
            this.instanceId = request.instanceId;
            this.matchedHost = request.matchedHost;
            this.note = request.note;
            this.orderKey = request.orderKey;
            this.orderWay = request.orderWay;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.requestSensitiveType = request.requestSensitiveType;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.sensitiveLevel = request.sensitiveLevel;
            this.sensitiveType = request.sensitiveType;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The API.</p>
         * 
         * <strong>example:</strong>
         * <p>/auth/login</p>
         */
        public Builder apiFormat(String apiFormat) {
            this.putQueryParameter("ApiFormat", apiFormat);
            this.apiFormat = apiFormat;
            return this;
        }

        /**
         * <p>The ID of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>867ade***24ee6e205b8da82b8f84</p>
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * <p>The request method of the API. Valid values:</p>
         * <ul>
         * <li><strong>GET</strong></li>
         * <li><strong>POST</strong></li>
         * <li><strong>HEAD</strong></li>
         * <li><strong>PUT</strong></li>
         * <li><strong>DELETE</strong></li>
         * <li><strong>CONNECT</strong></li>
         * <li><strong>PATCH</strong></li>
         * <li><strong>OPTIONS</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
        public Builder apiMethod(String apiMethod) {
            this.putQueryParameter("ApiMethod", apiMethod);
            this.apiMethod = apiMethod;
            return this;
        }

        /**
         * <p>The API status. Valid values:</p>
         * <ul>
         * <li><strong>NewbornInterface</strong>: The API is newly added.</li>
         * <li><strong>OfflineInterface</strong>: The API is inactive.</li>
         * <li><strong>normal</strong>: The API is normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OfflineInterface</p>
         */
        public Builder apiStatus(String apiStatus) {
            this.putQueryParameter("ApiStatus", apiStatus);
            this.apiStatus = apiStatus;
            return this;
        }

        /**
         * <p>The business purpose of the API.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to query the business purpose of the API.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SendMail</p>
         */
        public Builder apiTag(String apiTag) {
            this.putQueryParameter("ApiTag", apiTag);
            this.apiTag = apiTag;
            return this;
        }

        /**
         * <p>The service object. Valid values:</p>
         * <ul>
         * <li><strong>PublicAPI</strong>: public services</li>
         * <li><strong>ThirdpartAPI</strong>: cooperation with third-party partners</li>
         * <li><strong>InternalAPI</strong>: internal office</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>innerAPI</p>
         */
        public Builder apiType(String apiType) {
            this.putQueryParameter("ApiType", apiType);
            this.apiType = apiType;
            return this;
        }

        /**
         * <p>Specifies whether authentication is required. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Authentication is required.</li>
         * <li><strong>1</strong>: Authentication is not required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder authFlag(String authFlag) {
            this.putQueryParameter("AuthFlag", authFlag);
            this.authFlag = authFlag;
            return this;
        }

        /**
         * <p>The ID of the hybrid cloud cluster.</p>
         * <blockquote>
         * <p>For hybrid cloud scenarios only, you can call the <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> operation to query the hybrid cloud clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>740</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The end of the time range to query. This value is a UNIX timestamp in UTC. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683388800</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Specifies whether to follow the API. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: follows the API.</li>
         * <li><strong>0</strong>: does not follow the API.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder follow(Long follow) {
            this.putQueryParameter("Follow", follow);
            this.follow = follow;
            return this;
        }

        /**
         * <p>The ID of the Web Application Firewall (WAF) instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v2_public_cn-u***gr20j</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The domain name or IP address of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>a.aliyun.com</p>
         */
        public Builder matchedHost(String matchedHost) {
            this.putQueryParameter("MatchedHost", matchedHost);
            this.matchedHost = matchedHost;
            return this;
        }

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>API for logon</p>
         */
        public Builder note(String note) {
            this.putQueryParameter("Note", note);
            this.note = note;
            return this;
        }

        /**
         * <p>The name of the sorting field. Valid values:</p>
         * <ul>
         * <li><strong>allCnt</strong>: the total number of calls to the API in the previous 30 days</li>
         * <li><strong>botCnt</strong>: the number of bot-initiated requests in the previous 30 days</li>
         * <li><strong>crossBorderCnt</strong>: the number of cross-border requests in the previous 30 days</li>
         * <li><strong>abnormalNum</strong>: the number of API-related risks</li>
         * <li><strong>eventNum</strong>: the number of API-related security events</li>
         * <li><strong>farthestTs</strong>: the time when the API was first detected</li>
         * <li><strong>lastestTs</strong>: the time of the most recent access to the API</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>allCnt</p>
         */
        public Builder orderKey(String orderKey) {
            this.putQueryParameter("OrderKey", orderKey);
            this.orderKey = orderKey;
            return this;
        }

        /**
         * <p>The sorting method. Valid values:</p>
         * <ul>
         * <li><strong>desc</strong> (default): descending order</li>
         * <li><strong>asc</strong>: ascending order</li>
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
         * <p>The sensitive data type in the request.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to query the supported sensitive data types.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1004,1005</p>
         */
        public Builder requestSensitiveType(String requestSensitiveType) {
            this.putQueryParameter("RequestSensitiveType", requestSensitiveType);
            this.requestSensitiveType = requestSensitiveType;
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
         * <p>The sensitivity level of the API. Valid values:</p>
         * <ul>
         * <li><strong>L1</strong>: high sensitivity</li>
         * <li><strong>L2</strong>: moderate sensitivity</li>
         * <li><strong>L3</strong>: low sensitivity</li>
         * <li><strong>N</strong>: non-sensitivity</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>L3</p>
         */
        public Builder sensitiveLevel(String sensitiveLevel) {
            this.putQueryParameter("SensitiveLevel", sensitiveLevel);
            this.sensitiveLevel = sensitiveLevel;
            return this;
        }

        /**
         * <p>The sensitive data type in the response.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to query the supported sensitive data types.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1004</p>
         */
        public Builder sensitiveType(String sensitiveType) {
            this.putQueryParameter("SensitiveType", sensitiveType);
            this.sensitiveType = sensitiveType;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. This value is a UNIX timestamp in UTC. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1681833600</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeApisecApiResourcesRequest build() {
            return new DescribeApisecApiResourcesRequest(this);
        } 

    } 

}
