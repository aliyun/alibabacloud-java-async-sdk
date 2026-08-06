// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link UpdateVpcConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateVpcConfigRequest</p>
 */
public class UpdateVpcConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("removals")
    private java.util.List<String> removals;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("updates")
    private java.util.List<Updates> updates;

    private UpdateVpcConfigRequest(Builder builder) {
        super(builder);
        this.removals = builder.removals;
        this.updates = builder.updates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVpcConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return removals
     */
    public java.util.List<String> getRemovals() {
        return this.removals;
    }

    /**
     * @return updates
     */
    public java.util.List<Updates> getUpdates() {
        return this.updates;
    }

    public static final class Builder extends Request.Builder<UpdateVpcConfigRequest, Builder> {
        private java.util.List<String> removals; 
        private java.util.List<Updates> updates; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVpcConfigRequest request) {
            super(request);
            this.removals = request.removals;
            this.updates = request.updates;
        } 

        /**
         * removals.
         */
        public Builder removals(java.util.List<String> removals) {
            this.putBodyParameter("removals", removals);
            this.removals = removals;
            return this;
        }

        /**
         * updates.
         */
        public Builder updates(java.util.List<Updates> updates) {
            this.putBodyParameter("updates", updates);
            this.updates = updates;
            return this;
        }

        @Override
        public UpdateVpcConfigRequest build() {
            return new UpdateVpcConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateVpcConfigRequest} extends {@link TeaModel}
     *
     * <p>UpdateVpcConfigRequest</p>
     */
    public static class Updates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("extendedOptions")
        private java.util.Map<String, String> extendedOptions;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        private Updates(Builder builder) {
            this.extendedOptions = builder.extendedOptions;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Updates create() {
            return builder().build();
        }

        /**
         * @return extendedOptions
         */
        public java.util.Map<String, String> getExtendedOptions() {
            return this.extendedOptions;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private java.util.Map<String, String> extendedOptions; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Updates model) {
                this.extendedOptions = model.extendedOptions;
                this.vpcId = model.vpcId;
            } 

            /**
             * extendedOptions.
             */
            public Builder extendedOptions(java.util.Map<String, String> extendedOptions) {
                this.extendedOptions = extendedOptions;
                return this;
            }

            /**
             * <p>VPC ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf67xxxx</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Updates build() {
                return new Updates(this);
            } 

        } 

    }
}
