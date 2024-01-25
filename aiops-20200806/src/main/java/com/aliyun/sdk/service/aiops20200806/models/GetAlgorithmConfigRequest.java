// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlgorithmConfigRequest} extends {@link RequestModel}
 *
 * <p>GetAlgorithmConfigRequest</p>
 */
public class GetAlgorithmConfigRequest extends Request {
    @Query
    @NameInMap("AlgorithmTypeCode")
    private String algorithmTypeCode;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private GetAlgorithmConfigRequest(Builder builder) {
        super(builder);
        this.algorithmTypeCode = builder.algorithmTypeCode;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlgorithmConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmTypeCode
     */
    public String getAlgorithmTypeCode() {
        return this.algorithmTypeCode;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<GetAlgorithmConfigRequest, Builder> {
        private String algorithmTypeCode; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(GetAlgorithmConfigRequest request) {
            super(request);
            this.algorithmTypeCode = request.algorithmTypeCode;
            this.operaUid = request.operaUid;
        } 

        /**
         * AlgorithmTypeCode.
         */
        public Builder algorithmTypeCode(String algorithmTypeCode) {
            this.putQueryParameter("AlgorithmTypeCode", algorithmTypeCode);
            this.algorithmTypeCode = algorithmTypeCode;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        @Override
        public GetAlgorithmConfigRequest build() {
            return new GetAlgorithmConfigRequest(this);
        } 

    } 

}
