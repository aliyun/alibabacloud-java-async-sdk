// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link GetAliYunSafeCenterResultRequest} extends {@link RequestModel}
 *
 * <p>GetAliYunSafeCenterResultRequest</p>
 */
public class GetAliYunSafeCenterResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateSimilarSecurityEventsQueryTaskRequest")
    private CreateSimilarSecurityEventsQueryTaskRequest createSimilarSecurityEventsQueryTaskRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DescribeInstancesFullStatusRequest")
    private DescribeInstancesFullStatusRequest describeInstancesFullStatusRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DescribeSecurityEventOperationStatusRequest")
    private DescribeSecurityEventOperationStatusRequest describeSecurityEventOperationStatusRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DescribeSimilarSecurityEventsRequest")
    private DescribeSimilarSecurityEventsRequest describeSimilarSecurityEventsRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GetAssetDetailByUuidRequest")
    private GetAssetDetailByUuidRequest getAssetDetailByUuidRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HandleSecurityEventsRequest")
    private HandleSecurityEventsRequest handleSecurityEventsRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HandleSimilarSecurityEventsRequest")
    private HandleSimilarSecurityEventsRequest handleSimilarSecurityEventsRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InterfaceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String interfaceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListInstancesRequest")
    private ListInstancesRequest listInstancesRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetAliYunSafeCenterResultRequest(Builder builder) {
        super(builder);
        this.createSimilarSecurityEventsQueryTaskRequest = builder.createSimilarSecurityEventsQueryTaskRequest;
        this.describeInstancesFullStatusRequest = builder.describeInstancesFullStatusRequest;
        this.describeSecurityEventOperationStatusRequest = builder.describeSecurityEventOperationStatusRequest;
        this.describeSimilarSecurityEventsRequest = builder.describeSimilarSecurityEventsRequest;
        this.getAssetDetailByUuidRequest = builder.getAssetDetailByUuidRequest;
        this.handleSecurityEventsRequest = builder.handleSecurityEventsRequest;
        this.handleSimilarSecurityEventsRequest = builder.handleSimilarSecurityEventsRequest;
        this.interfaceCode = builder.interfaceCode;
        this.listInstancesRequest = builder.listInstancesRequest;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAliYunSafeCenterResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createSimilarSecurityEventsQueryTaskRequest
     */
    public CreateSimilarSecurityEventsQueryTaskRequest getCreateSimilarSecurityEventsQueryTaskRequest() {
        return this.createSimilarSecurityEventsQueryTaskRequest;
    }

    /**
     * @return describeInstancesFullStatusRequest
     */
    public DescribeInstancesFullStatusRequest getDescribeInstancesFullStatusRequest() {
        return this.describeInstancesFullStatusRequest;
    }

    /**
     * @return describeSecurityEventOperationStatusRequest
     */
    public DescribeSecurityEventOperationStatusRequest getDescribeSecurityEventOperationStatusRequest() {
        return this.describeSecurityEventOperationStatusRequest;
    }

    /**
     * @return describeSimilarSecurityEventsRequest
     */
    public DescribeSimilarSecurityEventsRequest getDescribeSimilarSecurityEventsRequest() {
        return this.describeSimilarSecurityEventsRequest;
    }

    /**
     * @return getAssetDetailByUuidRequest
     */
    public GetAssetDetailByUuidRequest getGetAssetDetailByUuidRequest() {
        return this.getAssetDetailByUuidRequest;
    }

    /**
     * @return handleSecurityEventsRequest
     */
    public HandleSecurityEventsRequest getHandleSecurityEventsRequest() {
        return this.handleSecurityEventsRequest;
    }

    /**
     * @return handleSimilarSecurityEventsRequest
     */
    public HandleSimilarSecurityEventsRequest getHandleSimilarSecurityEventsRequest() {
        return this.handleSimilarSecurityEventsRequest;
    }

    /**
     * @return interfaceCode
     */
    public String getInterfaceCode() {
        return this.interfaceCode;
    }

    /**
     * @return listInstancesRequest
     */
    public ListInstancesRequest getListInstancesRequest() {
        return this.listInstancesRequest;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetAliYunSafeCenterResultRequest, Builder> {
        private CreateSimilarSecurityEventsQueryTaskRequest createSimilarSecurityEventsQueryTaskRequest; 
        private DescribeInstancesFullStatusRequest describeInstancesFullStatusRequest; 
        private DescribeSecurityEventOperationStatusRequest describeSecurityEventOperationStatusRequest; 
        private DescribeSimilarSecurityEventsRequest describeSimilarSecurityEventsRequest; 
        private GetAssetDetailByUuidRequest getAssetDetailByUuidRequest; 
        private HandleSecurityEventsRequest handleSecurityEventsRequest; 
        private HandleSimilarSecurityEventsRequest handleSimilarSecurityEventsRequest; 
        private String interfaceCode; 
        private ListInstancesRequest listInstancesRequest; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetAliYunSafeCenterResultRequest request) {
            super(request);
            this.createSimilarSecurityEventsQueryTaskRequest = request.createSimilarSecurityEventsQueryTaskRequest;
            this.describeInstancesFullStatusRequest = request.describeInstancesFullStatusRequest;
            this.describeSecurityEventOperationStatusRequest = request.describeSecurityEventOperationStatusRequest;
            this.describeSimilarSecurityEventsRequest = request.describeSimilarSecurityEventsRequest;
            this.getAssetDetailByUuidRequest = request.getAssetDetailByUuidRequest;
            this.handleSecurityEventsRequest = request.handleSecurityEventsRequest;
            this.handleSimilarSecurityEventsRequest = request.handleSimilarSecurityEventsRequest;
            this.interfaceCode = request.interfaceCode;
            this.listInstancesRequest = request.listInstancesRequest;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Creates a node to query security alerting events triggered by the same rule or alerting type.</p>
         */
        public Builder createSimilarSecurityEventsQueryTaskRequest(CreateSimilarSecurityEventsQueryTaskRequest createSimilarSecurityEventsQueryTaskRequest) {
            String createSimilarSecurityEventsQueryTaskRequestShrink = shrink(createSimilarSecurityEventsQueryTaskRequest, "CreateSimilarSecurityEventsQueryTaskRequest", "json");
            this.putQueryParameter("CreateSimilarSecurityEventsQueryTaskRequest", createSimilarSecurityEventsQueryTaskRequestShrink);
            this.createSimilarSecurityEventsQueryTaskRequest = createSimilarSecurityEventsQueryTaskRequest;
            return this;
        }

        /**
         * <p>Queries the running status of ECS instances.</p>
         */
        public Builder describeInstancesFullStatusRequest(DescribeInstancesFullStatusRequest describeInstancesFullStatusRequest) {
            String describeInstancesFullStatusRequestShrink = shrink(describeInstancesFullStatusRequest, "DescribeInstancesFullStatusRequest", "json");
            this.putQueryParameter("DescribeInstancesFullStatusRequest", describeInstancesFullStatusRequestShrink);
            this.describeInstancesFullStatusRequest = describeInstancesFullStatusRequest;
            return this;
        }

        /**
         * <p>Queries whether the list of security alerting events that match the same IP rule or same alerting type as the alerting event to be handled is empty.</p>
         */
        public Builder describeSecurityEventOperationStatusRequest(DescribeSecurityEventOperationStatusRequest describeSecurityEventOperationStatusRequest) {
            String describeSecurityEventOperationStatusRequestShrink = shrink(describeSecurityEventOperationStatusRequest, "DescribeSecurityEventOperationStatusRequest", "json");
            this.putQueryParameter("DescribeSecurityEventOperationStatusRequest", describeSecurityEventOperationStatusRequestShrink);
            this.describeSecurityEventOperationStatusRequest = describeSecurityEventOperationStatusRequest;
            return this;
        }

        /**
         * <p>Queries identical security alert events in Security Center.</p>
         */
        public Builder describeSimilarSecurityEventsRequest(DescribeSimilarSecurityEventsRequest describeSimilarSecurityEventsRequest) {
            String describeSimilarSecurityEventsRequestShrink = shrink(describeSimilarSecurityEventsRequest, "DescribeSimilarSecurityEventsRequest", "json");
            this.putQueryParameter("DescribeSimilarSecurityEventsRequest", describeSimilarSecurityEventsRequestShrink);
            this.describeSimilarSecurityEventsRequest = describeSimilarSecurityEventsRequest;
            return this;
        }

        /**
         * <p>The request parameters for querying the Security Center Agent status.</p>
         */
        public Builder getAssetDetailByUuidRequest(GetAssetDetailByUuidRequest getAssetDetailByUuidRequest) {
            String getAssetDetailByUuidRequestShrink = shrink(getAssetDetailByUuidRequest, "GetAssetDetailByUuidRequest", "json");
            this.putQueryParameter("GetAssetDetailByUuidRequest", getAssetDetailByUuidRequestShrink);
            this.getAssetDetailByUuidRequest = getAssetDetailByUuidRequest;
            return this;
        }

        /**
         * <p>Handles security alert events.</p>
         */
        public Builder handleSecurityEventsRequest(HandleSecurityEventsRequest handleSecurityEventsRequest) {
            String handleSecurityEventsRequestShrink = shrink(handleSecurityEventsRequest, "HandleSecurityEventsRequest", "json");
            this.putQueryParameter("HandleSecurityEventsRequest", handleSecurityEventsRequestShrink);
            this.handleSecurityEventsRequest = handleSecurityEventsRequest;
            return this;
        }

        /**
         * <p>Handles security alert events in batches based on the same IP rule or type.</p>
         */
        public Builder handleSimilarSecurityEventsRequest(HandleSimilarSecurityEventsRequest handleSimilarSecurityEventsRequest) {
            String handleSimilarSecurityEventsRequestShrink = shrink(handleSimilarSecurityEventsRequest, "HandleSimilarSecurityEventsRequest", "json");
            this.putQueryParameter("HandleSimilarSecurityEventsRequest", handleSimilarSecurityEventsRequestShrink);
            this.handleSimilarSecurityEventsRequest = handleSimilarSecurityEventsRequest;
            return this;
        }

        /**
         * <p>The code of the public API operation.</p>
         * <ul>
         * <li><p><strong>GetAssetDetailByUuid</strong>: Retrieves the Agent status. Request parameter: GetAssetDetailByUuidRequest.</p>
         * </li>
         * <li><p><strong>DescribeSimilarSecurityEvents</strong>: Retrieves the list of instance IDs for identical security alerting events. Request parameter: DescribeSimilarSecurityEventsRequest.</p>
         * </li>
         * <li><p><strong>CreateSimilarSecurityEventsQueryTask</strong>: Creates a node to query security alerting events triggered by the same rule or alerting type. Request parameter: CreateSimilarSecurityEventsQueryTaskRequest.</p>
         * </li>
         * <li><p><strong>DescribeSecurityEventOperationStatus</strong>: Queries whether the list of security alerting events that match the same IP rule or same alerting type as the alerting event to be handled is empty. Request parameter: DescribeSecurityEventOperationStatusRequest.</p>
         * </li>
         * <li><p><strong>HandleSimilarSecurityEvents</strong>: Handles security alerting events in batches based on the same IP rule or type. Request parameter: HandleSimilarSecurityEventsRequest.
         * HandleSecurityEvents: Handles security alerting events. Request parameter: HandleSecurityEventsRequest.</p>
         * </li>
         * <li><p><strong>DescribeInstancesFullStatus</strong>: Queries the running status of ECS instances. Request parameter: DescribeInstancesFullStatusRequest.</p>
         * </li>
         * <li><p><strong>ListInstances</strong>: Queries the running status of simple application servers. Request parameter: ListInstancesRequest.</p>
         * </li>
         * <li><p><strong>StartConfigRuleEvaluation</strong>: Re-evaluates security check rules.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Each API operation name corresponds to its own request parameters.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ListInstanceStatus</p>
         */
        public Builder interfaceCode(String interfaceCode) {
            this.putQueryParameter("InterfaceCode", interfaceCode);
            this.interfaceCode = interfaceCode;
            return this;
        }

        /**
         * <p>Queries the running status of simple application servers.</p>
         */
        public Builder listInstancesRequest(ListInstancesRequest listInstancesRequest) {
            String listInstancesRequestShrink = shrink(listInstancesRequest, "ListInstancesRequest", "json");
            this.putQueryParameter("ListInstancesRequest", listInstancesRequestShrink);
            this.listInstancesRequest = listInstancesRequest;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-guangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetAliYunSafeCenterResultRequest build() {
            return new GetAliYunSafeCenterResultRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetAliYunSafeCenterResultRequest} extends {@link TeaModel}
     *
     * <p>GetAliYunSafeCenterResultRequest</p>
     */
    public static class CreateSimilarSecurityEventsQueryTaskRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityEventId")
        private Long securityEventId;

        @com.aliyun.core.annotation.NameInMap("SimilarEventScenarioCode")
        private String similarEventScenarioCode;

        private CreateSimilarSecurityEventsQueryTaskRequest(Builder builder) {
            this.regionId = builder.regionId;
            this.securityEventId = builder.securityEventId;
            this.similarEventScenarioCode = builder.similarEventScenarioCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateSimilarSecurityEventsQueryTaskRequest create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return securityEventId
         */
        public Long getSecurityEventId() {
            return this.securityEventId;
        }

        /**
         * @return similarEventScenarioCode
         */
        public String getSimilarEventScenarioCode() {
            return this.similarEventScenarioCode;
        }

        public static final class Builder {
            private String regionId; 
            private Long securityEventId; 
            private String similarEventScenarioCode; 

            private Builder() {
            } 

            private Builder(CreateSimilarSecurityEventsQueryTaskRequest model) {
                this.regionId = model.regionId;
                this.securityEventId = model.securityEventId;
                this.similarEventScenarioCode = model.similarEventScenarioCode;
            } 

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-zhangjiakou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the security alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>629755508</p>
             */
            public Builder securityEventId(Long securityEventId) {
                this.securityEventId = securityEventId;
                return this;
            }

            /**
             * <p>The code of the alerting event that has the same type or rule hits.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder similarEventScenarioCode(String similarEventScenarioCode) {
                this.similarEventScenarioCode = similarEventScenarioCode;
                return this;
            }

            public CreateSimilarSecurityEventsQueryTaskRequest build() {
                return new CreateSimilarSecurityEventsQueryTaskRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAliYunSafeCenterResultRequest} extends {@link TeaModel}
     *
     * <p>GetAliYunSafeCenterResultRequest</p>
     */
    public static class DescribeInstancesFullStatusRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private java.util.List<String> instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private DescribeInstancesFullStatusRequest(Builder builder) {
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeInstancesFullStatusRequest create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private java.util.List<String> instanceId; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(DescribeInstancesFullStatusRequest model) {
                this.instanceId = model.instanceId;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The list of instance IDs.</p>
             */
            public Builder instanceId(java.util.List<String> instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public DescribeInstancesFullStatusRequest build() {
                return new DescribeInstancesFullStatusRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAliYunSafeCenterResultRequest} extends {@link TeaModel}
     *
     * <p>GetAliYunSafeCenterResultRequest</p>
     */
    public static class DescribeSecurityEventOperationStatusRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityEventIds")
        private java.util.List<String> securityEventIds;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        private DescribeSecurityEventOperationStatusRequest(Builder builder) {
            this.regionId = builder.regionId;
            this.securityEventIds = builder.securityEventIds;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeSecurityEventOperationStatusRequest create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return securityEventIds
         */
        public java.util.List<String> getSecurityEventIds() {
            return this.securityEventIds;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String regionId; 
            private java.util.List<String> securityEventIds; 
            private Long taskId; 

            private Builder() {
            } 

            private Builder(DescribeSecurityEventOperationStatusRequest model) {
                this.regionId = model.regionId;
                this.securityEventIds = model.securityEventIds;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The region ID. Example: ap-southeast-1.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-zhangjiakou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The list of security alert event IDs.</p>
             * <blockquote>
             * <p>You must specify either TaskId or SecurityEventIds.N. At least one of these parameters is required for a successful call.</p>
             * </blockquote>
             */
            public Builder securityEventIds(java.util.List<String> securityEventIds) {
                this.securityEventIds = securityEventIds;
                return this;
            }

            /**
             * <p>The ID of the task for handling security alert events.</p>
             * <blockquote>
             * <p>You must specify either TaskId or SecurityEventIds. At least one of these parameters is required for a successful call.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0BC3B4E600002A9F000048BCDCE7E710</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            public DescribeSecurityEventOperationStatusRequest build() {
                return new DescribeSecurityEventOperationStatusRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAliYunSafeCenterResultRequest} extends {@link TeaModel}
     *
     * <p>GetAliYunSafeCenterResultRequest</p>
     */
    public static class DescribeSimilarSecurityEventsRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        private DescribeSimilarSecurityEventsRequest(Builder builder) {
            this.regionId = builder.regionId;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeSimilarSecurityEventsRequest create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String regionId; 
            private Long taskId; 

            private Builder() {
            } 

            private Builder(DescribeSimilarSecurityEventsRequest model) {
                this.regionId = model.regionId;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-zhangjiakou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the query task. You can call the CreateSimilarSecurityEventsQueryTask operation to obtain this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1689135</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            public DescribeSimilarSecurityEventsRequest build() {
                return new DescribeSimilarSecurityEventsRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAliYunSafeCenterResultRequest} extends {@link TeaModel}
     *
     * <p>GetAliYunSafeCenterResultRequest</p>
     */
    public static class GetAssetDetailByUuidRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private GetAssetDetailByUuidRequest(Builder builder) {
            this.regionId = builder.regionId;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetAssetDetailByUuidRequest create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String regionId; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(GetAssetDetailByUuidRequest model) {
                this.regionId = model.regionId;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The UUID of the asset to query.</p>
             * 
             * <strong>example:</strong>
             * <p>9A75F21D3993C0A2B094A4AB132890B2</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public GetAssetDetailByUuidRequest build() {
                return new GetAssetDetailByUuidRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAliYunSafeCenterResultRequest} extends {@link TeaModel}
     *
     * <p>GetAliYunSafeCenterResultRequest</p>
     */
    public static class HandleSecurityEventsRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertType")
        private String alertType;

        @com.aliyun.core.annotation.NameInMap("FileMd5")
        private String fileMd5;

        @com.aliyun.core.annotation.NameInMap("FilePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("MarkBatch")
        private String markBatch;

        @com.aliyun.core.annotation.NameInMap("MarkMissParam")
        private String markMissParam;

        @com.aliyun.core.annotation.NameInMap("OperationCode")
        private String operationCode;

        @com.aliyun.core.annotation.NameInMap("OperationParams")
        private String operationParams;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("SecurityEventIds")
        private java.util.List<String> securityEventIds;

        private HandleSecurityEventsRequest(Builder builder) {
            this.alertType = builder.alertType;
            this.fileMd5 = builder.fileMd5;
            this.filePath = builder.filePath;
            this.instanceId = builder.instanceId;
            this.ip = builder.ip;
            this.markBatch = builder.markBatch;
            this.markMissParam = builder.markMissParam;
            this.operationCode = builder.operationCode;
            this.operationParams = builder.operationParams;
            this.regionId = builder.regionId;
            this.remark = builder.remark;
            this.securityEventIds = builder.securityEventIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HandleSecurityEventsRequest create() {
            return builder().build();
        }

        /**
         * @return alertType
         */
        public String getAlertType() {
            return this.alertType;
        }

        /**
         * @return fileMd5
         */
        public String getFileMd5() {
            return this.fileMd5;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return markBatch
         */
        public String getMarkBatch() {
            return this.markBatch;
        }

        /**
         * @return markMissParam
         */
        public String getMarkMissParam() {
            return this.markMissParam;
        }

        /**
         * @return operationCode
         */
        public String getOperationCode() {
            return this.operationCode;
        }

        /**
         * @return operationParams
         */
        public String getOperationParams() {
            return this.operationParams;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return securityEventIds
         */
        public java.util.List<String> getSecurityEventIds() {
            return this.securityEventIds;
        }

        public static final class Builder {
            private String alertType; 
            private String fileMd5; 
            private String filePath; 
            private String instanceId; 
            private String ip; 
            private String markBatch; 
            private String markMissParam; 
            private String operationCode; 
            private String operationParams; 
            private String regionId; 
            private String remark; 
            private java.util.List<String> securityEventIds; 

            private Builder() {
            } 

            private Builder(HandleSecurityEventsRequest model) {
                this.alertType = model.alertType;
                this.fileMd5 = model.fileMd5;
                this.filePath = model.filePath;
                this.instanceId = model.instanceId;
                this.ip = model.ip;
                this.markBatch = model.markBatch;
                this.markMissParam = model.markMissParam;
                this.operationCode = model.operationCode;
                this.operationParams = model.operationParams;
                this.regionId = model.regionId;
                this.remark = model.remark;
                this.securityEventIds = model.securityEventIds;
            } 

            /**
             * <p>The alert rule type.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder alertType(String alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * <p>The MD5 hash of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>fbbb90731fbb6df57c933173182d01a5</p>
             */
            public Builder fileMd5(String fileMd5) {
                this.fileMd5 = fileMd5;
                return this;
            }

            /**
             * <p>The path of the sensitive file.</p>
             * 
             * <strong>example:</strong>
             * <p>flyfish-lfp-wy.release</p>
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>api-shared-vpc-002</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The user IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>123.56.127.180</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>Specifies whether to add to the whitelist in batches.</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder markBatch(String markBatch) {
                this.markBatch = markBatch;
                return this;
            }

            /**
             * <p>The whitelist rule configuration. The value is in JSON format and contains the following fields:</p>
             * <ul>
             * <li><strong>field</strong>: The whitelist field.</li>
             * <li><strong>operate</strong>: The whitelist method. Valid values:<ul>
             * <li><strong>notContains</strong>: Does not contain.</li>
             * <li><strong>contains</strong>: Contains.</li>
             * <li><strong>regex</strong>: Regular expression match.</li>
             * <li><strong>strEqual</strong>: Equals.</li>
             * <li><strong>strNotEqual</strong>: Does not equal.</li>
             * </ul>
             * </li>
             * <li><strong>fieldValue</strong>: The match value.</li>
             * <li><strong>uuid</strong>: The scope of the whitelist rule. Valid values:<ul>
             * <li><strong>part</strong>: Only the current asset.</li>
             * <li><strong>ALL</strong>: All assets.</li>
             * </ul>
             * </li>
             * </ul>
             * <blockquote>
             * <p>Call the DescribeSecurityEventOperations operation to obtain the field whitelist field.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;uuid&quot;:&quot;part&quot;,&quot;field&quot;:&quot;gmtModified&quot;,&quot;operate&quot;:&quot;contains&quot;,&quot;fieldValue&quot;:&quot;asd&quot;},{&quot;uuid&quot;:&quot;part&quot;,&quot;field&quot;:&quot;loginUser&quot;,&quot;operate&quot;:&quot;contains&quot;,&quot;fieldValue&quot;:&quot;vff&quot;}]</p>
             */
            public Builder markMissParam(String markMissParam) {
                this.markMissParam = markMissParam;
                return this;
            }

            /**
             * <p>The method for handling the security alert event. Valid values:</p>
             * <ul>
             * <li><strong>block_ip</strong>: Block.</li>
             * <li><strong>advance_mark_mis_info</strong>: Add to whitelist.</li>
             * <li><strong>ignore</strong>: Ignore.</li>
             * <li><strong>manual_handled</strong>: Manually handled.</li>
             * <li><strong>kill_process</strong>: Terminate process.</li>
             * <li><strong>cleanup</strong>: Deep scan and cleanup.</li>
             * <li><strong>kill_and_quara</strong>: Virus scan and quarantine.</li>
             * <li><strong>disable_malicious_defense</strong>: Disable malicious behavior defense.</li>
             * <li><strong>client_problem_check</strong>: Troubleshoot.</li>
             * <li><strong>quara</strong>: Quarantine.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>block_ip</p>
             */
            public Builder operationCode(String operationCode) {
                this.operationCode = operationCode;
                return this;
            }

            /**
             * <p>The configuration of the sub-operation for handling security alert events.</p>
             * <p>When OperationCode is set to kill_and_quara, specify the parameter type &quot;subOperation&quot;:${code}.
             * Valid code values:</p>
             * <ul>
             * <li>Quarantined file: quaraFileByMd5andPath</li>
             * <li>Kill process and quarantined file by process ID and path: killAndQuaraFileByPidAndMd5andPath</li>
             * <li>Kill process only: killByMd5andPath</li>
             * <li>Kill process and quarantined file: killAndQuaraFileByMd5andPath</li>
             * <li>Kill container process by process ID and path: killProcessByPidandPathandCmdline</li>
             * <li>Kill container process by file MD5 and path: killContainerProcessByMd5AndPath</li>
             * </ul>
             * <p>When OperationCode is set to block_ip, the parameter is:</p>
             * <ul>
             * <li>Expiration time: expireTime:${timestamp}<blockquote>
             * <p>This parameter is required only when OperationCode is set to <code>kill_and_quara</code> or <code>block_ip</code>. For other values of OperationCode, this parameter can be left empty. ${timestamp} indicates the timestamp of the deadline for blocking this IP address.</p>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;expireTime\&quot;:1719588943551,\&quot;subOperation\&quot;:\&quot;killAndQuaraFileByMd5andPath\&quot;}</p>
             */
            public Builder operationParams(String operationParams) {
                this.operationParams = operationParams;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The collection of IDs of the security alert events to handle.</p>
             * <p>Example:</p>
             */
            public Builder securityEventIds(java.util.List<String> securityEventIds) {
                this.securityEventIds = securityEventIds;
                return this;
            }

            public HandleSecurityEventsRequest build() {
                return new HandleSecurityEventsRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAliYunSafeCenterResultRequest} extends {@link TeaModel}
     *
     * <p>GetAliYunSafeCenterResultRequest</p>
     */
    public static class HandleSimilarSecurityEventsRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertType")
        private String alertType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("OperationCode")
        private String operationCode;

        @com.aliyun.core.annotation.NameInMap("OperationParams")
        private String operationParams;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SourceIp")
        private String sourceIp;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        private HandleSimilarSecurityEventsRequest(Builder builder) {
            this.alertType = builder.alertType;
            this.instanceId = builder.instanceId;
            this.ip = builder.ip;
            this.operationCode = builder.operationCode;
            this.operationParams = builder.operationParams;
            this.regionId = builder.regionId;
            this.sourceIp = builder.sourceIp;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HandleSimilarSecurityEventsRequest create() {
            return builder().build();
        }

        /**
         * @return alertType
         */
        public String getAlertType() {
            return this.alertType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return operationCode
         */
        public String getOperationCode() {
            return this.operationCode;
        }

        /**
         * @return operationParams
         */
        public String getOperationParams() {
            return this.operationParams;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return sourceIp
         */
        public String getSourceIp() {
            return this.sourceIp;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String alertType; 
            private String instanceId; 
            private String ip; 
            private String operationCode; 
            private String operationParams; 
            private String regionId; 
            private String sourceIp; 
            private Long taskId; 

            private Builder() {
            } 

            private Builder(HandleSimilarSecurityEventsRequest model) {
                this.alertType = model.alertType;
                this.instanceId = model.instanceId;
                this.ip = model.ip;
                this.operationCode = model.operationCode;
                this.operationParams = model.operationParams;
                this.regionId = model.regionId;
                this.sourceIp = model.sourceIp;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The alerting type.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder alertType(String alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cfw_elasticity_public_cn-g4t3nkh3i00b</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The IP address of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>203.10*.44.71</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The operation type for batch handling similar security alert events.</p>
             * <blockquote>
             * <p>You can call the DescribeSecurityEventOperations operation to obtain this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>offline_handled</p>
             */
            public Builder operationCode(String operationCode) {
                this.operationCode = operationCode;
                return this;
            }

            /**
             * <p>The configuration of the sub-operation for handling alerting events. The value is in JSON format.</p>
             * <blockquote>
             * <p>This parameter is required only when <strong>OperationCode</strong> is set to <strong>kill_and_quara</strong>, <strong>block_ip</strong>, or <strong>virus_quara</strong>. For other values of <strong>OperationCode</strong>, this parameter can be left empty.</p>
             * </blockquote>
             * <blockquote>
             * <p>When <strong>OperationCode</strong> is set to <strong>block_ip</strong>, the following field is included:</p>
             * <ul>
             * <li><strong>expireTime</strong>: The lock expiration time. Unit: milliseconds.</li>
             * </ul>
             * <p>When <strong>OperationCode</strong> is set to <strong>kill_and_quara</strong>, the following field is included:</p>
             * <ul>
             * <li><strong>subOperation</strong>: The method for killing and quarantining. Valid values:<ul>
             * <li><strong>killAndQuaraFileByMd5andPath</strong>: Terminates the process and quarantines the file.</li>
             * <li><strong>killByMd5andPath</strong>: Terminates the running process.</li>
             * </ul>
             * </li>
             * </ul>
             * <p>When <strong>OperationCode</strong> is set to <strong>virus_quara</strong>, the following field is included:</p>
             * <ul>
             * <li><strong>subOperation</strong>: The method for killing and quarantining. Valid values:<ul>
             * <li><strong>quaraFileByMd5andPath</strong>: Quarantines the source file of the process.</li>
             * </ul>
             * </li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;expireTime\&quot;:1767687685917}</p>
             */
            public Builder operationParams(String operationParams) {
                this.operationParams = operationParams;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The IP address of the access source.</p>
             * 
             * <strong>example:</strong>
             * <p>220.2*3.155.93</p>
             */
            public Builder sourceIp(String sourceIp) {
                this.sourceIp = sourceIp;
                return this;
            }

            /**
             * <p>The ID of the task for batch handling all security alert events of the same type.</p>
             * <blockquote>
             * <p>You can call the CreateSimilarSecurityEventsQueryTask operation to obtain this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>12221</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            public HandleSimilarSecurityEventsRequest build() {
                return new HandleSimilarSecurityEventsRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAliYunSafeCenterResultRequest} extends {@link TeaModel}
     *
     * <p>GetAliYunSafeCenterResultRequest</p>
     */
    public static class ListInstancesRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceIds")
        private String instanceIds;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private ListInstancesRequest(Builder builder) {
            this.instanceIds = builder.instanceIds;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListInstancesRequest create() {
            return builder().build();
        }

        /**
         * @return instanceIds
         */
        public String getInstanceIds() {
            return this.instanceIds;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String instanceIds; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(ListInstancesRequest model) {
                this.instanceIds = model.instanceIds;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The instance IDs of simple application servers. The value is a JSON array that can contain up to 100 IDs. Separate multiple IDs with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;2ad1ae67295445f598017499dc****&quot;, &quot;2ad1ae67295445f598017123dc****&quot;]</p>
             */
            public Builder instanceIds(String instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public ListInstancesRequest build() {
                return new ListInstancesRequest(this);
            } 

        } 

    }
}
