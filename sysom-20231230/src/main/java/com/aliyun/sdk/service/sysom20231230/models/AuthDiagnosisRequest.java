// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthDiagnosisRequest} extends {@link RequestModel}
 *
 * <p>AuthDiagnosisRequest</p>
 */
public class AuthDiagnosisRequest extends Request {
    @Body
    @NameInMap("instances")
    private java.util.List < Instances> instances;

    private AuthDiagnosisRequest(Builder builder) {
        super(builder);
        this.instances = builder.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthDiagnosisRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    public static final class Builder extends Request.Builder<AuthDiagnosisRequest, Builder> {
        private java.util.List < Instances> instances; 

        private Builder() {
            super();
        } 

        private Builder(AuthDiagnosisRequest request) {
            super(request);
            this.instances = request.instances;
        } 

        /**
         * instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.putBodyParameter("instances", instances);
            this.instances = instances;
            return this;
        }

        @Override
        public AuthDiagnosisRequest build() {
            return new AuthDiagnosisRequest(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @NameInMap("instance")
        private String instance;

        @NameInMap("region")
        private String region;

        private Instances(Builder builder) {
            this.instance = builder.instance;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public String getInstance() {
            return this.instance;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String instance; 
            private String region; 

            /**
             * instance.
             */
            public Builder instance(String instance) {
                this.instance = instance;
                return this;
            }

            /**
             * region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
