// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyExternalNodeStatusUpdateRequest} extends {@link RequestModel}
 *
 * <p>ApplyExternalNodeStatusUpdateRequest</p>
 */
public class ApplyExternalNodeStatusUpdateRequest extends Request {
    @Body
    @NameInMap("node_id")
    @Validation(required = true)
    private String nodeId;

    @Body
    @NameInMap("operation_records")
    private java.util.List < OperationRecords> operationRecords;

    @Body
    @NameInMap("process_action_result")
    @Validation(required = true)
    private String processActionResult;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private ApplyExternalNodeStatusUpdateRequest(Builder builder) {
        super(builder);
        this.nodeId = builder.nodeId;
        this.operationRecords = builder.operationRecords;
        this.processActionResult = builder.processActionResult;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyExternalNodeStatusUpdateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return operationRecords
     */
    public java.util.List < OperationRecords> getOperationRecords() {
        return this.operationRecords;
    }

    /**
     * @return processActionResult
     */
    public String getProcessActionResult() {
        return this.processActionResult;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<ApplyExternalNodeStatusUpdateRequest, Builder> {
        private String nodeId; 
        private java.util.List < OperationRecords> operationRecords; 
        private String processActionResult; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(ApplyExternalNodeStatusUpdateRequest request) {
            super(request);
            this.nodeId = request.nodeId;
            this.operationRecords = request.operationRecords;
            this.processActionResult = request.processActionResult;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * node_id.
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("node_id", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * operation_records.
         */
        public Builder operationRecords(java.util.List < OperationRecords> operationRecords) {
            String operationRecordsShrink = shrink(operationRecords, "operation_records", "json");
            this.putBodyParameter("operation_records", operationRecordsShrink);
            this.operationRecords = operationRecords;
            return this;
        }

        /**
         * process_action_result.
         */
        public Builder processActionResult(String processActionResult) {
            this.putBodyParameter("process_action_result", processActionResult);
            this.processActionResult = processActionResult;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public ApplyExternalNodeStatusUpdateRequest build() {
            return new ApplyExternalNodeStatusUpdateRequest(this);
        } 

    } 

    public static class OperationRecords extends TeaModel {
        @NameInMap("comment")
        private String comment;

        @NameInMap("operate_time")
        private String operateTime;

        @NameInMap("operator_name")
        private String operatorName;

        @NameInMap("result")
        private String result;

        @NameInMap("type")
        private String type;

        private OperationRecords(Builder builder) {
            this.comment = builder.comment;
            this.operateTime = builder.operateTime;
            this.operatorName = builder.operatorName;
            this.result = builder.result;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationRecords create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return operateTime
         */
        public String getOperateTime() {
            return this.operateTime;
        }

        /**
         * @return operatorName
         */
        public String getOperatorName() {
            return this.operatorName;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String comment; 
            private String operateTime; 
            private String operatorName; 
            private String result; 
            private String type; 

            /**
             * comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * operate_time.
             */
            public Builder operateTime(String operateTime) {
                this.operateTime = operateTime;
                return this;
            }

            /**
             * operator_name.
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public OperationRecords build() {
                return new OperationRecords(this);
            } 

        } 

    }
}
