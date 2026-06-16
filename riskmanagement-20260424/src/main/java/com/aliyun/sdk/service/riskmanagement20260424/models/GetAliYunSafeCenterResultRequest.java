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
         * CreateSimilarSecurityEventsQueryTaskRequest.
         */
        public Builder createSimilarSecurityEventsQueryTaskRequest(CreateSimilarSecurityEventsQueryTaskRequest createSimilarSecurityEventsQueryTaskRequest) {
            String createSimilarSecurityEventsQueryTaskRequestShrink = shrink(createSimilarSecurityEventsQueryTaskRequest, "CreateSimilarSecurityEventsQueryTaskRequest", "json");
            this.putQueryParameter("CreateSimilarSecurityEventsQueryTaskRequest", createSimilarSecurityEventsQueryTaskRequestShrink);
            this.createSimilarSecurityEventsQueryTaskRequest = createSimilarSecurityEventsQueryTaskRequest;
            return this;
        }

        /**
         * DescribeInstancesFullStatusRequest.
         */
        public Builder describeInstancesFullStatusRequest(DescribeInstancesFullStatusRequest describeInstancesFullStatusRequest) {
            String describeInstancesFullStatusRequestShrink = shrink(describeInstancesFullStatusRequest, "DescribeInstancesFullStatusRequest", "json");
            this.putQueryParameter("DescribeInstancesFullStatusRequest", describeInstancesFullStatusRequestShrink);
            this.describeInstancesFullStatusRequest = describeInstancesFullStatusRequest;
            return this;
        }

        /**
         * DescribeSecurityEventOperationStatusRequest.
         */
        public Builder describeSecurityEventOperationStatusRequest(DescribeSecurityEventOperationStatusRequest describeSecurityEventOperationStatusRequest) {
            String describeSecurityEventOperationStatusRequestShrink = shrink(describeSecurityEventOperationStatusRequest, "DescribeSecurityEventOperationStatusRequest", "json");
            this.putQueryParameter("DescribeSecurityEventOperationStatusRequest", describeSecurityEventOperationStatusRequestShrink);
            this.describeSecurityEventOperationStatusRequest = describeSecurityEventOperationStatusRequest;
            return this;
        }

        /**
         * DescribeSimilarSecurityEventsRequest.
         */
        public Builder describeSimilarSecurityEventsRequest(DescribeSimilarSecurityEventsRequest describeSimilarSecurityEventsRequest) {
            String describeSimilarSecurityEventsRequestShrink = shrink(describeSimilarSecurityEventsRequest, "DescribeSimilarSecurityEventsRequest", "json");
            this.putQueryParameter("DescribeSimilarSecurityEventsRequest", describeSimilarSecurityEventsRequestShrink);
            this.describeSimilarSecurityEventsRequest = describeSimilarSecurityEventsRequest;
            return this;
        }

        /**
         * GetAssetDetailByUuidRequest.
         */
        public Builder getAssetDetailByUuidRequest(GetAssetDetailByUuidRequest getAssetDetailByUuidRequest) {
            String getAssetDetailByUuidRequestShrink = shrink(getAssetDetailByUuidRequest, "GetAssetDetailByUuidRequest", "json");
            this.putQueryParameter("GetAssetDetailByUuidRequest", getAssetDetailByUuidRequestShrink);
            this.getAssetDetailByUuidRequest = getAssetDetailByUuidRequest;
            return this;
        }

        /**
         * HandleSecurityEventsRequest.
         */
        public Builder handleSecurityEventsRequest(HandleSecurityEventsRequest handleSecurityEventsRequest) {
            String handleSecurityEventsRequestShrink = shrink(handleSecurityEventsRequest, "HandleSecurityEventsRequest", "json");
            this.putQueryParameter("HandleSecurityEventsRequest", handleSecurityEventsRequestShrink);
            this.handleSecurityEventsRequest = handleSecurityEventsRequest;
            return this;
        }

        /**
         * HandleSimilarSecurityEventsRequest.
         */
        public Builder handleSimilarSecurityEventsRequest(HandleSimilarSecurityEventsRequest handleSimilarSecurityEventsRequest) {
            String handleSimilarSecurityEventsRequestShrink = shrink(handleSimilarSecurityEventsRequest, "HandleSimilarSecurityEventsRequest", "json");
            this.putQueryParameter("HandleSimilarSecurityEventsRequest", handleSimilarSecurityEventsRequestShrink);
            this.handleSimilarSecurityEventsRequest = handleSimilarSecurityEventsRequest;
            return this;
        }

        /**
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
         * ListInstancesRequest.
         */
        public Builder listInstancesRequest(ListInstancesRequest listInstancesRequest) {
            String listInstancesRequestShrink = shrink(listInstancesRequest, "ListInstancesRequest", "json");
            this.putQueryParameter("ListInstancesRequest", listInstancesRequestShrink);
            this.listInstancesRequest = listInstancesRequest;
            return this;
        }

        /**
         * RegionId.
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
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SecurityEventId.
             */
            public Builder securityEventId(Long securityEventId) {
                this.securityEventId = securityEventId;
                return this;
            }

            /**
             * SimilarEventScenarioCode.
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
             * InstanceId.
             */
            public Builder instanceId(java.util.List<String> instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * RegionId.
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
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SecurityEventIds.
             */
            public Builder securityEventIds(java.util.List<String> securityEventIds) {
                this.securityEventIds = securityEventIds;
                return this;
            }

            /**
             * TaskId.
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
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * TaskId.
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
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Uuid.
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
             * AlertType.
             */
            public Builder alertType(String alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * FileMd5.
             */
            public Builder fileMd5(String fileMd5) {
                this.fileMd5 = fileMd5;
                return this;
            }

            /**
             * FilePath.
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * MarkBatch.
             */
            public Builder markBatch(String markBatch) {
                this.markBatch = markBatch;
                return this;
            }

            /**
             * MarkMissParam.
             */
            public Builder markMissParam(String markMissParam) {
                this.markMissParam = markMissParam;
                return this;
            }

            /**
             * OperationCode.
             */
            public Builder operationCode(String operationCode) {
                this.operationCode = operationCode;
                return this;
            }

            /**
             * OperationParams.
             */
            public Builder operationParams(String operationParams) {
                this.operationParams = operationParams;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * SecurityEventIds.
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
             * AlertType.
             */
            public Builder alertType(String alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * OperationCode.
             */
            public Builder operationCode(String operationCode) {
                this.operationCode = operationCode;
                return this;
            }

            /**
             * OperationParams.
             */
            public Builder operationParams(String operationParams) {
                this.operationParams = operationParams;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SourceIp.
             */
            public Builder sourceIp(String sourceIp) {
                this.sourceIp = sourceIp;
                return this;
            }

            /**
             * TaskId.
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
             * InstanceIds.
             */
            public Builder instanceIds(String instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * RegionId.
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
