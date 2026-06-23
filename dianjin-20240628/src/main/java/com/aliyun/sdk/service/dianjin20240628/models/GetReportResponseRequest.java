// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link GetReportResponseRequest} extends {@link RequestModel}
 *
 * <p>GetReportResponseRequest</p>
 */
public class GetReportResponseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sceneCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneCode;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("fundProduct")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fundProduct;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("outRequestNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outRequestNo;

    private GetReportResponseRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.sceneCode = builder.sceneCode;
        this.fundProduct = builder.fundProduct;
        this.outRequestNo = builder.outRequestNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetReportResponseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return sceneCode
     */
    public String getSceneCode() {
        return this.sceneCode;
    }

    /**
     * @return fundProduct
     */
    public String getFundProduct() {
        return this.fundProduct;
    }

    /**
     * @return outRequestNo
     */
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    public static final class Builder extends Request.Builder<GetReportResponseRequest, Builder> {
        private String workspaceId; 
        private String sceneCode; 
        private String fundProduct; 
        private String outRequestNo; 

        private Builder() {
            super();
        } 

        private Builder(GetReportResponseRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.sceneCode = request.sceneCode;
            this.fundProduct = request.fundProduct;
            this.outRequestNo = request.outRequestNo;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>XIANYU</p>
         */
        public Builder sceneCode(String sceneCode) {
            this.putPathParameter("sceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>msxf_stable</p>
         */
        public Builder fundProduct(String fundProduct) {
            this.putPathParameter("fundProduct", fundProduct);
            this.fundProduct = fundProduct;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cf6b904c1ef...</p>
         */
        public Builder outRequestNo(String outRequestNo) {
            this.putPathParameter("outRequestNo", outRequestNo);
            this.outRequestNo = outRequestNo;
            return this;
        }

        @Override
        public GetReportResponseRequest build() {
            return new GetReportResponseRequest(this);
        } 

    } 

}
