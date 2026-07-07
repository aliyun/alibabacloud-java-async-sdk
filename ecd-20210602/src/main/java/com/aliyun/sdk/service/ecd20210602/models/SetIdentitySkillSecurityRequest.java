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
 * {@link SetIdentitySkillSecurityRequest} extends {@link RequestModel}
 *
 * <p>SetIdentitySkillSecurityRequest</p>
 */
public class SetIdentitySkillSecurityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enabled")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<IdentityIds> identityIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillChannel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillChannel;

    private SetIdentitySkillSecurityRequest(Builder builder) {
        super(builder);
        this.enabled = builder.enabled;
        this.identityIds = builder.identityIds;
        this.skillChannel = builder.skillChannel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetIdentitySkillSecurityRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return identityIds
     */
    public java.util.List<IdentityIds> getIdentityIds() {
        return this.identityIds;
    }

    /**
     * @return skillChannel
     */
    public String getSkillChannel() {
        return this.skillChannel;
    }

    public static final class Builder extends Request.Builder<SetIdentitySkillSecurityRequest, Builder> {
        private Boolean enabled; 
        private java.util.List<IdentityIds> identityIds; 
        private String skillChannel; 

        private Builder() {
            super();
        } 

        private Builder(SetIdentitySkillSecurityRequest request) {
            super(request);
            this.enabled = request.enabled;
            this.identityIds = request.identityIds;
            this.skillChannel = request.skillChannel;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder identityIds(java.util.List<IdentityIds> identityIds) {
            this.putQueryParameter("IdentityIds", identityIds);
            this.identityIds = identityIds;
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

        @Override
        public SetIdentitySkillSecurityRequest build() {
            return new SetIdentitySkillSecurityRequest(this);
        } 

    } 

    /**
     * 
     * {@link SetIdentitySkillSecurityRequest} extends {@link TeaModel}
     *
     * <p>SetIdentitySkillSecurityRequest</p>
     */
    public static class IdentityIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IdentityId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String identityId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String regionId;

        private IdentityIds(Builder builder) {
            this.identityId = builder.identityId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IdentityIds create() {
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

            private Builder(IdentityIds model) {
                this.identityId = model.identityId;
                this.regionId = model.regionId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-b9ej3xiok4tjbgf9x</p>
             */
            public Builder identityId(String identityId) {
                this.identityId = identityId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public IdentityIds build() {
                return new IdentityIds(this);
            } 

        } 

    }
}
