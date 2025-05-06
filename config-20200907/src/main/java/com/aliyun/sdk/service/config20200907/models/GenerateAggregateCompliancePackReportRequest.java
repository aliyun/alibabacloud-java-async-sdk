// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link GenerateAggregateCompliancePackReportRequest} extends {@link RequestModel}
 *
 * <p>GenerateAggregateCompliancePackReportRequest</p>
 */
public class GenerateAggregateCompliancePackReportRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CompliancePackId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String compliancePackId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MultiFiles")
    private Boolean multiFiles;

    private GenerateAggregateCompliancePackReportRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.clientToken = builder.clientToken;
        this.compliancePackId = builder.compliancePackId;
        this.multiFiles = builder.multiFiles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateAggregateCompliancePackReportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return compliancePackId
     */
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    /**
     * @return multiFiles
     */
    public Boolean getMultiFiles() {
        return this.multiFiles;
    }

    public static final class Builder extends Request.Builder<GenerateAggregateCompliancePackReportRequest, Builder> {
        private String aggregatorId; 
        private String clientToken; 
        private String compliancePackId; 
        private Boolean multiFiles; 

        private Builder() {
            super();
        } 

        private Builder(GenerateAggregateCompliancePackReportRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.clientToken = request.clientToken;
            this.compliancePackId = request.compliancePackId;
            this.multiFiles = request.multiFiles;
        } 

        /**
         * <p>The ID of the account group.</p>
         * <p>For more information about how to obtain the ID of the account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-f632626622af0079****</p>
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putBodyParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <code>token</code> can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>1594295238-f9361358-5843-4294-8d30-b5183fac****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the compliance package.</p>
         * <p>For more information about how to obtain the ID of a compliance package, see <a href="https://help.aliyun.com/document_detail/262059.html">ListAggregateCompliancePacks</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cp-fdc8626622af00f9****</p>
         */
        public Builder compliancePackId(String compliancePackId) {
            this.putBodyParameter("CompliancePackId", compliancePackId);
            this.compliancePackId = compliancePackId;
            return this;
        }

        /**
         * MultiFiles.
         */
        public Builder multiFiles(Boolean multiFiles) {
            this.putBodyParameter("MultiFiles", multiFiles);
            this.multiFiles = multiFiles;
            return this;
        }

        @Override
        public GenerateAggregateCompliancePackReportRequest build() {
            return new GenerateAggregateCompliancePackReportRequest(this);
        } 

    } 

}
