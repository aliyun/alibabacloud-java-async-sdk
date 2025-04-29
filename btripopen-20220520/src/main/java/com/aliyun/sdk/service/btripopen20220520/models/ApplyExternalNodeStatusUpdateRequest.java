// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link ApplyExternalNodeStatusUpdateRequest} extends {@link RequestModel}
 *
 * <p>ApplyExternalNodeStatusUpdateRequest</p>
 */
public class ApplyExternalNodeStatusUpdateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("node_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operation_records")
    private java.util.List<OperationRecords> operationRecords;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("process_action_result")
    @com.aliyun.core.annotation.Validation(required = true)
    private String processActionResult;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
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
    public java.util.List<OperationRecords> getOperationRecords() {
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
        private java.util.List<OperationRecords> operationRecords; 
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("node_id", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * operation_records.
         */
        public Builder operationRecords(java.util.List<OperationRecords> operationRecords) {
            String operationRecordsShrink = shrink(operationRecords, "operation_records", "json");
            this.putBodyParameter("operation_records", operationRecordsShrink);
            this.operationRecords = operationRecords;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROCESS_AGREE</p>
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

    /**
     * 
     * {@link ApplyExternalNodeStatusUpdateRequest} extends {@link TeaModel}
     *
     * <p>ApplyExternalNodeStatusUpdateRequest</p>
     */
    public static class OperationRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("operate_time")
        private String operateTime;

        @com.aliyun.core.annotation.NameInMap("operator_name")
        private String operatorName;

        @com.aliyun.core.annotation.NameInMap("result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("type")
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

            private Builder() {
            } 

            private Builder(OperationRecords model) {
                this.comment = model.comment;
                this.operateTime = model.operateTime;
                this.operatorName = model.operatorName;
                this.result = model.result;
                this.type = model.type;
            } 

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
