// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDepartmentRequest} extends {@link RequestModel}
 *
 * <p>DeleteDepartmentRequest</p>
 */
public class DeleteDepartmentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_dept_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outDeptId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private DeleteDepartmentRequest(Builder builder) {
        super(builder);
        this.outDeptId = builder.outDeptId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDepartmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return outDeptId
     */
    public String getOutDeptId() {
        return this.outDeptId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<DeleteDepartmentRequest, Builder> {
        private String outDeptId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDepartmentRequest request) {
            super(request);
            this.outDeptId = request.outDeptId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * out_dept_id.
         */
        public Builder outDeptId(String outDeptId) {
            this.putBodyParameter("out_dept_id", outDeptId);
            this.outDeptId = outDeptId;
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
        public DeleteDepartmentRequest build() {
            return new DeleteDepartmentRequest(this);
        } 

    } 

}
