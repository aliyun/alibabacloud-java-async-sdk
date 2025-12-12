// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link GenerateTaskCodesRequest} extends {@link RequestModel}
 *
 * <p>GenerateTaskCodesRequest</p>
 */
public class GenerateTaskCodesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("bizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("genNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer genNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("productNamespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productNamespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private GenerateTaskCodesRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.genNum = builder.genNum;
        this.productNamespace = builder.productNamespace;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateTaskCodesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return genNum
     */
    public Integer getGenNum() {
        return this.genNum;
    }

    /**
     * @return productNamespace
     */
    public String getProductNamespace() {
        return this.productNamespace;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GenerateTaskCodesRequest, Builder> {
        private String bizId; 
        private Integer genNum; 
        private String productNamespace; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateTaskCodesRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.genNum = request.genNum;
            this.productNamespace = request.productNamespace;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>w-d8********</p>
         */
        public Builder bizId(String bizId) {
            this.putPathParameter("bizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder genNum(Integer genNum) {
            this.putQueryParameter("genNum", genNum);
            this.genNum = genNum;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SS</p>
         */
        public Builder productNamespace(String productNamespace) {
            this.putQueryParameter("productNamespace", productNamespace);
            this.productNamespace = productNamespace;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GenerateTaskCodesRequest build() {
            return new GenerateTaskCodesRequest(this);
        } 

    } 

}
