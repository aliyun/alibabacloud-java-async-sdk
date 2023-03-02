// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMPCoSPhaseGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyMPCoSPhaseGroupRequest</p>
 */
public class ModifyMPCoSPhaseGroupRequest extends Request {
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
    @NameInMap("PhaseGroupId")
    @Validation(required = true)
    private String phaseGroupId;

    @Query
    @NameInMap("Remark")
    private String remark;

    private ModifyMPCoSPhaseGroupRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.bizChainId = builder.bizChainId;
        this.name = builder.name;
        this.phaseGroupId = builder.phaseGroupId;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMPCoSPhaseGroupRequest create() {
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
     * @return phaseGroupId
     */
    public String getPhaseGroupId() {
        return this.phaseGroupId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<ModifyMPCoSPhaseGroupRequest, Builder> {
        private String apiVersion; 
        private String bizChainId; 
        private String name; 
        private String phaseGroupId; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMPCoSPhaseGroupRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.bizChainId = request.bizChainId;
            this.name = request.name;
            this.phaseGroupId = request.phaseGroupId;
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
         * PhaseGroupId.
         */
        public Builder phaseGroupId(String phaseGroupId) {
            this.putQueryParameter("PhaseGroupId", phaseGroupId);
            this.phaseGroupId = phaseGroupId;
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
        public ModifyMPCoSPhaseGroupRequest build() {
            return new ModifyMPCoSPhaseGroupRequest(this);
        } 

    } 

}
