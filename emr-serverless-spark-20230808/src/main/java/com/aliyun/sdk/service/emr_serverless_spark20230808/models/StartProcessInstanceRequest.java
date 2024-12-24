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
 * {@link StartProcessInstanceRequest} extends {@link RequestModel}
 *
 * <p>StartProcessInstanceRequest</p>
 */
public class StartProcessInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("bizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isProd")
    private Boolean isProd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("processDefinitionCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long processDefinitionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("productNamespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productNamespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("runtimeQueue")
    private String runtimeQueue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("versionHashCode")
    private String versionHashCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("versionNumber")
    private Integer versionNumber;

    private StartProcessInstanceRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.isProd = builder.isProd;
        this.processDefinitionCode = builder.processDefinitionCode;
        this.productNamespace = builder.productNamespace;
        this.regionId = builder.regionId;
        this.runtimeQueue = builder.runtimeQueue;
        this.versionHashCode = builder.versionHashCode;
        this.versionNumber = builder.versionNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartProcessInstanceRequest create() {
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
     * @return isProd
     */
    public Boolean getIsProd() {
        return this.isProd;
    }

    /**
     * @return processDefinitionCode
     */
    public Long getProcessDefinitionCode() {
        return this.processDefinitionCode;
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

    /**
     * @return runtimeQueue
     */
    public String getRuntimeQueue() {
        return this.runtimeQueue;
    }

    /**
     * @return versionHashCode
     */
    public String getVersionHashCode() {
        return this.versionHashCode;
    }

    /**
     * @return versionNumber
     */
    public Integer getVersionNumber() {
        return this.versionNumber;
    }

    public static final class Builder extends Request.Builder<StartProcessInstanceRequest, Builder> {
        private String bizId; 
        private Boolean isProd; 
        private Long processDefinitionCode; 
        private String productNamespace; 
        private String regionId; 
        private String runtimeQueue; 
        private String versionHashCode; 
        private Integer versionNumber; 

        private Builder() {
            super();
        } 

        private Builder(StartProcessInstanceRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.isProd = request.isProd;
            this.processDefinitionCode = request.processDefinitionCode;
            this.productNamespace = request.productNamespace;
            this.regionId = request.regionId;
            this.runtimeQueue = request.runtimeQueue;
            this.versionHashCode = request.versionHashCode;
            this.versionNumber = request.versionNumber;
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
         * isProd.
         */
        public Builder isProd(Boolean isProd) {
            this.putQueryParameter("isProd", isProd);
            this.isProd = isProd;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12***********</p>
         */
        public Builder processDefinitionCode(Long processDefinitionCode) {
            this.putQueryParameter("processDefinitionCode", processDefinitionCode);
            this.processDefinitionCode = processDefinitionCode;
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

        /**
         * runtimeQueue.
         */
        public Builder runtimeQueue(String runtimeQueue) {
            this.putQueryParameter("runtimeQueue", runtimeQueue);
            this.runtimeQueue = runtimeQueue;
            return this;
        }

        /**
         * versionHashCode.
         */
        public Builder versionHashCode(String versionHashCode) {
            this.putQueryParameter("versionHashCode", versionHashCode);
            this.versionHashCode = versionHashCode;
            return this;
        }

        /**
         * versionNumber.
         */
        public Builder versionNumber(Integer versionNumber) {
            this.putQueryParameter("versionNumber", versionNumber);
            this.versionNumber = versionNumber;
            return this;
        }

        @Override
        public StartProcessInstanceRequest build() {
            return new StartProcessInstanceRequest(this);
        } 

    } 

}
