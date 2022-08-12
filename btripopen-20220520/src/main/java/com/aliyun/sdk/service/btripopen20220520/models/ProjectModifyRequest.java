// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ProjectModifyRequest} extends {@link RequestModel}
 *
 * <p>ProjectModifyRequest</p>
 */
public class ProjectModifyRequest extends Request {
    @Body
    @NameInMap("code")
    private String code;

    @Body
    @NameInMap("project_name")
    @Validation(required = true)
    private String projectName;

    @Body
    @NameInMap("third_part_cost_center_id")
    private String thirdPartCostCenterId;

    @Body
    @NameInMap("third_part_id")
    @Validation(required = true)
    private String thirdPartId;

    @Body
    @NameInMap("third_part_invoice_id")
    private String thirdPartInvoiceId;

    private ProjectModifyRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.projectName = builder.projectName;
        this.thirdPartCostCenterId = builder.thirdPartCostCenterId;
        this.thirdPartId = builder.thirdPartId;
        this.thirdPartInvoiceId = builder.thirdPartInvoiceId;
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

    public static final class Builder extends Request.Builder<ProjectModifyRequest, Builder> {
        private String code; 
        private String projectName; 
        private String thirdPartCostCenterId; 
        private String thirdPartId; 
        private String thirdPartInvoiceId; 

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
        } 

        /**
         * 项目代码
         */
        public Builder code(String code) {
            this.putBodyParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * 项目名称
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("project_name", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * 第三方成本中心id
         */
        public Builder thirdPartCostCenterId(String thirdPartCostCenterId) {
            this.putBodyParameter("third_part_cost_center_id", thirdPartCostCenterId);
            this.thirdPartCostCenterId = thirdPartCostCenterId;
            return this;
        }

        /**
         * 第三方项目id
         */
        public Builder thirdPartId(String thirdPartId) {
            this.putBodyParameter("third_part_id", thirdPartId);
            this.thirdPartId = thirdPartId;
            return this;
        }

        /**
         * 第三方发票id
         */
        public Builder thirdPartInvoiceId(String thirdPartInvoiceId) {
            this.putBodyParameter("third_part_invoice_id", thirdPartInvoiceId);
            this.thirdPartInvoiceId = thirdPartInvoiceId;
            return this;
        }

        @Override
        public ProjectModifyRequest build() {
            return new ProjectModifyRequest(this);
        } 

    } 

}
