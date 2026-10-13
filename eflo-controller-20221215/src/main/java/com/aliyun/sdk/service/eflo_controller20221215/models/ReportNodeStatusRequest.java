// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link ReportNodeStatusRequest} extends {@link RequestModel}
 *
 * <p>ReportNodeStatusRequest</p>
 */
public class ReportNodeStatusRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DiagnosisType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String diagnosisType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeId;

    private ReportNodeStatusRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.diagnosisType = builder.diagnosisType;
        this.nodeId = builder.nodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportNodeStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return diagnosisType
     */
    public String getDiagnosisType() {
        return this.diagnosisType;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    public static final class Builder extends Request.Builder<ReportNodeStatusRequest, Builder> {
        private String description; 
        private String diagnosisType; 
        private String nodeId; 

        private Builder() {
            super();
        } 

        private Builder(ReportNodeStatusRequest request) {
            super(request);
            this.description = request.description;
            this.diagnosisType = request.diagnosisType;
            this.nodeId = request.nodeId;
        } 

        /**
         * <p>The detailed description of the exception.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GPU 0 reporting XID 79 (fallen off bus)</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The diagnosis type. Valid values:</p>
         * <ul>
         * <li>QUICK: quick diagnosis</li>
         * <li>COMPREHENSIVE: comprehensive diagnosis</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPREHENSIVE</p>
         */
        public Builder diagnosisType(String diagnosisType) {
            this.putBodyParameter("DiagnosisType", diagnosisType);
            this.diagnosisType = diagnosisType;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-eowpxmsldd</p>
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        @Override
        public ReportNodeStatusRequest build() {
            return new ReportNodeStatusRequest(this);
        } 

    } 

}
