// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ProjectModifyRequest} extends {@link RequestModel}
 *
 * <p>ProjectModifyRequest</p>
 */
public class ProjectModifyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("project_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("third_part_cost_center_id")
    private String thirdPartCostCenterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("third_part_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String thirdPartId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("third_part_invoice_id")
    private String thirdPartInvoiceId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private ProjectModifyRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.projectName = builder.projectName;
        this.thirdPartCostCenterId = builder.thirdPartCostCenterId;
        this.thirdPartId = builder.thirdPartId;
        this.thirdPartInvoiceId = builder.thirdPartInvoiceId;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProjectModifyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return thirdPartCostCenterId
     */
    public String getThirdPartCostCenterId() {
        return this.thirdPartCostCenterId;
    }

    /**
     * @return thirdPartId
     */
    public String getThirdPartId() {
        return this.thirdPartId;
    }

    /**
     * @return thirdPartInvoiceId
     */
    public String getThirdPartInvoiceId() {
        return this.thirdPartInvoiceId;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<ProjectModifyRequest, Builder> {
        private String code; 
        private String projectName; 
        private String thirdPartCostCenterId; 
        private String thirdPartId; 
        private String thirdPartInvoiceId; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(ProjectModifyRequest request) {
            super(request);
            this.code = request.code;
            this.projectName = request.projectName;
            this.thirdPartCostCenterId = request.thirdPartCostCenterId;
            this.thirdPartId = request.thirdPartId;
            this.thirdPartInvoiceId = request.thirdPartInvoiceId;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.putBodyParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("project_name", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * third_part_cost_center_id.
         */
        public Builder thirdPartCostCenterId(String thirdPartCostCenterId) {
            this.putBodyParameter("third_part_cost_center_id", thirdPartCostCenterId);
            this.thirdPartCostCenterId = thirdPartCostCenterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>340049</p>
         */
        public Builder thirdPartId(String thirdPartId) {
            this.putBodyParameter("third_part_id", thirdPartId);
            this.thirdPartId = thirdPartId;
            return this;
        }

        /**
         * third_part_invoice_id.
         */
        public Builder thirdPartInvoiceId(String thirdPartInvoiceId) {
            this.putBodyParameter("third_part_invoice_id", thirdPartInvoiceId);
            this.thirdPartInvoiceId = thirdPartInvoiceId;
            return this;
        }

        /**
         * x-acs-btrip-so-corp-token.
         */
        public Builder xAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
            this.putHeaderParameter("x-acs-btrip-so-corp-token", xAcsBtripSoCorpToken);
            this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
            return this;
        }

        @Override
        public ProjectModifyRequest build() {
            return new ProjectModifyRequest(this);
        } 

    } 

}
