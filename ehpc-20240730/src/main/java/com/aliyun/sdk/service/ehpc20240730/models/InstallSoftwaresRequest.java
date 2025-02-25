// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
 * {@link InstallSoftwaresRequest} extends {@link RequestModel}
 *
 * <p>InstallSoftwaresRequest</p>
 */
public class InstallSoftwaresRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdditionalPackages")
    private java.util.List<AdditionalPackages> additionalPackages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    private InstallSoftwaresRequest(Builder builder) {
        super(builder);
        this.additionalPackages = builder.additionalPackages;
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallSoftwaresRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return additionalPackages
     */
    public java.util.List<AdditionalPackages> getAdditionalPackages() {
        return this.additionalPackages;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    public static final class Builder extends Request.Builder<InstallSoftwaresRequest, Builder> {
        private java.util.List<AdditionalPackages> additionalPackages; 
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(InstallSoftwaresRequest request) {
            super(request);
            this.additionalPackages = request.additionalPackages;
            this.clusterId = request.clusterId;
        } 

        /**
         * <p>The information about the software systems that you want to install.</p>
         */
        public Builder additionalPackages(java.util.List<AdditionalPackages> additionalPackages) {
            String additionalPackagesShrink = shrink(additionalPackages, "AdditionalPackages", "json");
            this.putQueryParameter("AdditionalPackages", additionalPackagesShrink);
            this.additionalPackages = additionalPackages;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public InstallSoftwaresRequest build() {
            return new InstallSoftwaresRequest(this);
        } 

    } 

    /**
     * 
     * {@link InstallSoftwaresRequest} extends {@link TeaModel}
     *
     * <p>InstallSoftwaresRequest</p>
     */
    public static class AdditionalPackages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private AdditionalPackages(Builder builder) {
            this.name = builder.name;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdditionalPackages create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String name; 
            private String version; 

            /**
             * <p>The software name.</p>
             * 
             * <strong>example:</strong>
             * <p>gromacs</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The software version.</p>
             * 
             * <strong>example:</strong>
             * <p>2024.1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public AdditionalPackages build() {
                return new AdditionalPackages(this);
            } 

        } 

    }
}
