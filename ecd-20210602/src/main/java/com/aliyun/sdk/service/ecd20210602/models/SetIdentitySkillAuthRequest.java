// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20210602.models;

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
 * {@link SetIdentitySkillAuthRequest} extends {@link RequestModel}
 *
 * <p>SetIdentitySkillAuthRequest</p>
 */
public class SetIdentitySkillAuthRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoInstall")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean autoInstall;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Identities")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Identities> identities;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillChannel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> skillIds;

    private SetIdentitySkillAuthRequest(Builder builder) {
        super(builder);
        this.autoInstall = builder.autoInstall;
        this.identities = builder.identities;
        this.operationType = builder.operationType;
        this.skillChannel = builder.skillChannel;
        this.skillIds = builder.skillIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetIdentitySkillAuthRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoInstall
     */
    public Boolean getAutoInstall() {
        return this.autoInstall;
    }

    /**
     * @return identities
     */
    public java.util.List<Identities> getIdentities() {
        return this.identities;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    /**
     * @return skillChannel
     */
    public String getSkillChannel() {
        return this.skillChannel;
    }

    /**
     * @return skillIds
     */
    public java.util.List<String> getSkillIds() {
        return this.skillIds;
    }

    public static final class Builder extends Request.Builder<SetIdentitySkillAuthRequest, Builder> {
        private Boolean autoInstall; 
        private java.util.List<Identities> identities; 
        private String operationType; 
        private String skillChannel; 
        private java.util.List<String> skillIds; 

        private Builder() {
            super();
        } 

        private Builder(SetIdentitySkillAuthRequest request) {
            super(request);
            this.autoInstall = request.autoInstall;
            this.identities = request.identities;
            this.operationType = request.operationType;
            this.skillChannel = request.skillChannel;
            this.skillIds = request.skillIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoInstall(Boolean autoInstall) {
            this.putQueryParameter("AutoInstall", autoInstall);
            this.autoInstall = autoInstall;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder identities(java.util.List<Identities> identities) {
            this.putQueryParameter("Identities", identities);
            this.identities = identities;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SET_AUTH</p>
         */
        public Builder operationType(String operationType) {
            this.putQueryParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ENTERPRISE</p>
         */
        public Builder skillChannel(String skillChannel) {
            this.putQueryParameter("SkillChannel", skillChannel);
            this.skillChannel = skillChannel;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder skillIds(java.util.List<String> skillIds) {
            this.putQueryParameter("SkillIds", skillIds);
            this.skillIds = skillIds;
            return this;
        }

        @Override
        public SetIdentitySkillAuthRequest build() {
            return new SetIdentitySkillAuthRequest(this);
        } 

    } 

    /**
     * 
     * {@link SetIdentitySkillAuthRequest} extends {@link TeaModel}
     *
     * <p>SetIdentitySkillAuthRequest</p>
     */
    public static class Identities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IdentityId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String identityId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String regionId;

        private Identities(Builder builder) {
            this.identityId = builder.identityId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Identities create() {
            return builder().build();
        }

        /**
         * @return identityId
         */
        public String getIdentityId() {
            return this.identityId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String identityId; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(Identities model) {
                this.identityId = model.identityId;
                this.regionId = model.regionId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-av4u9m5ghko26****</p>
             */
            public Builder identityId(String identityId) {
                this.identityId = identityId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Identities build() {
                return new Identities(this);
            } 

        } 

    }
}
