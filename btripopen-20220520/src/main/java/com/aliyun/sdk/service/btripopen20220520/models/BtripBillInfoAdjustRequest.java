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
 * {@link BtripBillInfoAdjustRequest} extends {@link RequestModel}
 *
 * <p>BtripBillInfoAdjustRequest</p>
 */
public class BtripBillInfoAdjustRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("primary_id")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 999999999, minimum = 1)
    private Long primaryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("third_part_cost_center_id")
    private String thirdPartCostCenterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("third_part_department_id")
    private String thirdPartDepartmentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("third_part_invoice_id")
    private String thirdPartInvoiceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("third_part_project_id")
    private String thirdPartProjectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private BtripBillInfoAdjustRequest(Builder builder) {
        super(builder);
        this.primaryId = builder.primaryId;
        this.thirdPartCostCenterId = builder.thirdPartCostCenterId;
        this.thirdPartDepartmentId = builder.thirdPartDepartmentId;
        this.thirdPartInvoiceId = builder.thirdPartInvoiceId;
        this.thirdPartProjectId = builder.thirdPartProjectId;
        this.userId = builder.userId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BtripBillInfoAdjustRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return primaryId
     */
    public Long getPrimaryId() {
        return this.primaryId;
    }

    /**
     * @return thirdPartCostCenterId
     */
    public String getThirdPartCostCenterId() {
        return this.thirdPartCostCenterId;
    }

    /**
     * @return thirdPartDepartmentId
     */
    public String getThirdPartDepartmentId() {
        return this.thirdPartDepartmentId;
    }

    /**
     * @return thirdPartInvoiceId
     */
    public String getThirdPartInvoiceId() {
        return this.thirdPartInvoiceId;
    }

    /**
     * @return thirdPartProjectId
     */
    public String getThirdPartProjectId() {
        return this.thirdPartProjectId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<BtripBillInfoAdjustRequest, Builder> {
        private Long primaryId; 
        private String thirdPartCostCenterId; 
        private String thirdPartDepartmentId; 
        private String thirdPartInvoiceId; 
        private String thirdPartProjectId; 
        private String userId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(BtripBillInfoAdjustRequest request) {
            super(request);
            this.primaryId = request.primaryId;
            this.thirdPartCostCenterId = request.thirdPartCostCenterId;
            this.thirdPartDepartmentId = request.thirdPartDepartmentId;
            this.thirdPartInvoiceId = request.thirdPartInvoiceId;
            this.thirdPartProjectId = request.thirdPartProjectId;
            this.userId = request.userId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder primaryId(Long primaryId) {
            this.putBodyParameter("primary_id", primaryId);
            this.primaryId = primaryId;
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
         * third_part_department_id.
         */
        public Builder thirdPartDepartmentId(String thirdPartDepartmentId) {
            this.putBodyParameter("third_part_department_id", thirdPartDepartmentId);
            this.thirdPartDepartmentId = thirdPartDepartmentId;
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
         * third_part_project_id.
         */
        public Builder thirdPartProjectId(String thirdPartProjectId) {
            this.putBodyParameter("third_part_project_id", thirdPartProjectId);
            this.thirdPartProjectId = thirdPartProjectId;
            return this;
        }

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
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
        public BtripBillInfoAdjustRequest build() {
            return new BtripBillInfoAdjustRequest(this);
        } 

    } 

}
