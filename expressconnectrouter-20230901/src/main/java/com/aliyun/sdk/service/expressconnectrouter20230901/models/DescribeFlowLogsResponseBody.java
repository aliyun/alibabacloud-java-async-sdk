// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

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
 * {@link DescribeFlowLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFlowLogsResponseBody</p>
 */
public class DescribeFlowLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("FlowLogs")
    private java.util.List<FlowLogs> flowLogs;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeFlowLogsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.flowLogs = builder.flowLogs;
        this.httpStatusCode = builder.httpStatusCode;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return flowLogs
     */
    public java.util.List<FlowLogs> getFlowLogs() {
        return this.flowLogs;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private java.util.List<FlowLogs> flowLogs; 
        private Integer httpStatusCode; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeFlowLogsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.flowLogs = model.flowLogs;
            this.httpStatusCode = model.httpStatusCode;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The queried information about the request denial.</p>
         * 
         * <strong>example:</strong>
         * <p>Authentication is failed for ****</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The response code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed. For more information, see Error codes.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>IllegalParamFormat.EcrId</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic part in the error message. This parameter is used to replace the <code>%s</code> variable in <strong>ErrMessage</strong>.</p>
         * <blockquote>
         * <p> For example, if the value of <strong>ErrMessage</strong> is <strong>The Value of Input Parameter %s is not valid</strong> and the value of <strong>DynamicMessage</strong> is <strong>DtsJobId</strong>, the request parameter <strong>DtsJobId</strong> is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>The param format of EcrId **** is illegal.</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The information about the flow logs.</p>
         */
        public Builder flowLogs(java.util.List<FlowLogs> flowLogs) {
            this.flowLogs = flowLogs;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The total number of entries returned. Valid values: 1 to 2147483647. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AAAAAYws9fJ0Ur4MGm/5OkDoW/Zn0J0/sCjivzwX9oBcwFnWaaas/kSG+J/WzLOxJHS4****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6FABF516-FED3-5697-BDA2-B18C5D9A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>True</strong></li>
         * <li><strong>False</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of records that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeFlowLogsResponseBody build() {
            return new DescribeFlowLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFlowLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFlowLogsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of tag N of the instance. The tag key cannot be an empty string.</p>
             * <blockquote>
             * <p>It can be up to 64 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>TagKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * <blockquote>
             * <p>It can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>. The tag value can be an empty string.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>TagValue</p>
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
    /**
     * 
     * {@link DescribeFlowLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFlowLogsResponseBody</p>
     */
    public static class FlowLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EcrId")
        private String ecrId;

        @com.aliyun.core.annotation.NameInMap("FlowLogId")
        private String flowLogId;

        @com.aliyun.core.annotation.NameInMap("FlowLogName")
        private String flowLogName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SamplingRate")
        private String samplingRate;

        @com.aliyun.core.annotation.NameInMap("SlsRegionId")
        private String slsRegionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private FlowLogs(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.ecrId = builder.ecrId;
            this.flowLogId = builder.flowLogId;
            this.flowLogName = builder.flowLogName;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.interval = builder.interval;
            this.logStoreName = builder.logStoreName;
            this.projectName = builder.projectName;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.samplingRate = builder.samplingRate;
            this.slsRegionId = builder.slsRegionId;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowLogs create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ecrId
         */
        public String getEcrId() {
            return this.ecrId;
        }

        /**
         * @return flowLogId
         */
        public String getFlowLogId() {
            return this.flowLogId;
        }

        /**
         * @return flowLogName
         */
        public String getFlowLogName() {
            return this.flowLogName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return logStoreName
         */
        public String getLogStoreName() {
            return this.logStoreName;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return samplingRate
         */
        public String getSamplingRate() {
            return this.samplingRate;
        }

        /**
         * @return slsRegionId
         */
        public String getSlsRegionId() {
            return this.slsRegionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String creationTime; 
            private String description; 
            private String ecrId; 
            private String flowLogId; 
            private String flowLogName; 
            private String instanceId; 
            private String instanceType; 
            private Integer interval; 
            private String logStoreName; 
            private String projectName; 
            private String regionId; 
            private String resourceGroupId; 
            private String samplingRate; 
            private String slsRegionId; 
            private String status; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(FlowLogs model) {
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.ecrId = model.ecrId;
                this.flowLogId = model.flowLogId;
                this.flowLogName = model.flowLogName;
                this.instanceId = model.instanceId;
                this.instanceType = model.instanceType;
                this.interval = model.interval;
                this.logStoreName = model.logStoreName;
                this.projectName = model.projectName;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.samplingRate = model.samplingRate;
                this.slsRegionId = model.slsRegionId;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * <p>The time when the flow log was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-09-21T04:20Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the flow log.</p>
             * 
             * <strong>example:</strong>
             * <p>myFlowlog</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ECR ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecr-h4cop1khw98*****</p>
             */
            public Builder ecrId(String ecrId) {
                this.ecrId = ecrId;
                return this;
            }

            /**
             * <p>The ID of the flow log.</p>
             * 
             * <strong>example:</strong>
             * <p>flowlog-leypqehtgtia2*****</p>
             */
            public Builder flowLogId(String flowLogId) {
                this.flowLogId = flowLogId;
                return this;
            }

            /**
             * <p>The name of the flow log.</p>
             * 
             * <strong>example:</strong>
             * <p>myFlowlog</p>
             */
            public Builder flowLogName(String flowLogName) {
                this.flowLogName = flowLogName;
                return this;
            }

            /**
             * <p>The ID of the network instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vbr-9dpty76irpf4u15*****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The type of the network instance. Valid values:</p>
             * <ul>
             * <li><strong>VBR</strong>: virtual border router (VBR)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VBR</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The time window for collecting log data. Unit: seconds. Valid values:</p>
             * <ul>
             * <li><strong>60</strong></li>
             * <li><strong>600</strong></li>
             * </ul>
             * <p>Default value: <strong>600</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The Logstore that stores the captured traffic data.</p>
             * 
             * <strong>example:</strong>
             * <p>FlowLogStore</p>
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * <p>The name of the project that stores the captured traffic data.</p>
             * 
             * <strong>example:</strong>
             * <p>FlowLogProject</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The region ID of the flow log.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the ECR belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekzb3xwrexc4ry</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The sampling proportion. Valid values:</p>
             * <ul>
             * <li><strong>1:4096</strong></li>
             * <li><strong>1:2048</strong></li>
             * <li><strong>1:1024</strong></li>
             * </ul>
             * <p>Default value: <strong>1:4096</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1:4096</p>
             */
            public Builder samplingRate(String samplingRate) {
                this.samplingRate = samplingRate;
                return this;
            }

            /**
             * <p>The ID of the region where Log Service is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder slsRegionId(String slsRegionId) {
                this.slsRegionId = slsRegionId;
                return this;
            }

            /**
             * <p>The status of the flow log. Valid values:</p>
             * <ul>
             * <li><p><strong>Active</strong></p>
             * </li>
             * <li><p><strong>Inactive</strong></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tag key.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public FlowLogs build() {
                return new FlowLogs(this);
            } 

        } 

    }
}
