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
    @com.aliyun.core.annotation.NameInMap("action")
    private String action;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("comments")
    private String comments;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("email")
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("interval")
    private String interval;

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
        this.action = builder.action;
        this.comments = builder.comments;
        this.email = builder.email;
        this.interval = builder.interval;
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
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return comments
     */
    public String getComments() {
        return this.comments;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return interval
     */
    public String getInterval() {
        return this.interval;
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
        private String action; 
        private String comments; 
        private String email; 
        private String interval; 
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
            this.action = request.action;
            this.comments = request.comments;
            this.email = request.email;
            this.interval = request.interval;
            this.isProd = request.isProd;
            this.processDefinitionCode = request.processDefinitionCode;
            this.productNamespace = request.productNamespace;
            this.regionId = request.regionId;
            this.runtimeQueue = request.runtimeQueue;
            this.versionHashCode = request.versionHashCode;
            this.versionNumber = request.versionNumber;
        } 

        /**
         * <p>The workspace ID.</p>
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
         * action.
         */
        public Builder action(String action) {
            this.putQueryParameter("action", action);
            this.action = action;
            return this;
        }

        /**
         * comments.
         */
        public Builder comments(String comments) {
            this.putQueryParameter("comments", comments);
            this.comments = comments;
            return this;
        }

        /**
         * email.
         */
        public Builder email(String email) {
            this.putQueryParameter("email", email);
            this.email = email;
            return this;
        }

        /**
         * interval.
         */
        public Builder interval(String interval) {
            this.putQueryParameter("interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>Specifies whether to run the workflow in the production environment.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isProd(Boolean isProd) {
            this.putQueryParameter("isProd", isProd);
            this.isProd = isProd;
            return this;
        }

        /**
         * <p>The workflow ID.</p>
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
         * <p>The code of the service.</p>
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
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The queue on which the workflow runs.</p>
         * 
         * <strong>example:</strong>
         * <p>root_queue</p>
         */
        public Builder runtimeQueue(String runtimeQueue) {
            this.putQueryParameter("runtimeQueue", runtimeQueue);
            this.runtimeQueue = runtimeQueue;
            return this;
        }

        /**
         * <p>The hash code of the version.</p>
         * 
         * <strong>example:</strong>
         * <p>dh*********</p>
         */
        public Builder versionHashCode(String versionHashCode) {
            this.putQueryParameter("versionHashCode", versionHashCode);
            this.versionHashCode = versionHashCode;
            return this;
        }

        /**
         * <p>The version number of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
