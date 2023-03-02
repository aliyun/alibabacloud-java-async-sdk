// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMPCoSPhaseRequest} extends {@link RequestModel}
 *
 * <p>ModifyMPCoSPhaseRequest</p>
 */
public class ModifyMPCoSPhaseRequest extends Request {
    @Query
    @NameInMap("ApiVersion")
    @Validation(required = true)
    private String apiVersion;

    @Query
    @NameInMap("BizChainId")
    @Validation(required = true)
    private String bizChainId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("PhaseId")
    @Validation(required = true)
    private String phaseId;

    @Query
    @NameInMap("Remark")
    private String remark;

    private ModifyMPCoSPhaseRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.bizChainId = builder.bizChainId;
        this.name = builder.name;
        this.phaseId = builder.phaseId;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMPCoSPhaseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiVersion
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * @return bizChainId
     */
    public String getBizChainId() {
        return this.bizChainId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return phaseId
     */
    public String getPhaseId() {
        return this.phaseId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<ModifyMPCoSPhaseRequest, Builder> {
        private String apiVersion; 
        private String bizChainId; 
        private String name; 
        private String phaseId; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMPCoSPhaseRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.bizChainId = request.bizChainId;
            this.name = request.name;
            this.phaseId = request.phaseId;
            this.remark = request.remark;
        } 

        /**
         * ApiVersion.
         */
        public Builder apiVersion(String apiVersion) {
            this.putQueryParameter("ApiVersion", apiVersion);
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * BizChainId.
         */
        public Builder bizChainId(String bizChainId) {
            this.putQueryParameter("BizChainId", bizChainId);
            this.bizChainId = bizChainId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PhaseId.
         */
        public Builder phaseId(String phaseId) {
            this.putQueryParameter("PhaseId", phaseId);
            this.phaseId = phaseId;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public ModifyMPCoSPhaseRequest build() {
            return new ModifyMPCoSPhaseRequest(this);
        } 

    } 

}
