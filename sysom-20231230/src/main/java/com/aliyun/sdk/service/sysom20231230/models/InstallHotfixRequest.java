// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link InstallHotfixRequest} extends {@link RequestModel}
 *
 * <p>InstallHotfixRequest</p>
 */
public class InstallHotfixRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cveId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String cveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instances")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Instances> instances;

    private InstallHotfixRequest(Builder builder) {
        super(builder);
        this.cveId = builder.cveId;
        this.instances = builder.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallHotfixRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cveId
     */
    public String getCveId() {
        return this.cveId;
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
        return this.instances;
    }

    public static final class Builder extends Request.Builder<InstallHotfixRequest, Builder> {
        private String cveId; 
        private java.util.List<Instances> instances; 

        private Builder() {
            super();
        } 

        private Builder(InstallHotfixRequest request) {
            super(request);
            this.cveId = request.cveId;
            this.instances = request.instances;
        } 

        /**
         * <p>CVE ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2026-12345</p>
         */
        public Builder cveId(String cveId) {
            this.putBodyParameter("cveId", cveId);
            this.cveId = cveId;
            return this;
        }

        /**
         * <p>The target instances.</p>
         * <p>This parameter is required.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.putBodyParameter("instances", instances);
            this.instances = instances;
            return this;
        }

        @Override
        public InstallHotfixRequest build() {
            return new InstallHotfixRequest(this);
        } 

    } 

    /**
     * 
     * {@link InstallHotfixRequest} extends {@link TeaModel}
     *
     * <p>InstallHotfixRequest</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instanceId")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 254, minLength = 1)
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("regionId")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
        private String regionId;

        private Instances(Builder builder) {
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String instanceId; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.instanceId = model.instanceId;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The instance ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1example</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
