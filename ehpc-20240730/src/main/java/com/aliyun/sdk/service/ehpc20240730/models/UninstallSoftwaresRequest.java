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
 * {@link UninstallSoftwaresRequest} extends {@link RequestModel}
 *
 * <p>UninstallSoftwaresRequest</p>
 */
public class UninstallSoftwaresRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdditionalPackages")
    private java.util.List<AdditionalPackages> additionalPackages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    private UninstallSoftwaresRequest(Builder builder) {
        super(builder);
        this.additionalPackages = builder.additionalPackages;
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UninstallSoftwaresRequest create() {
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

    public static final class Builder extends Request.Builder<UninstallSoftwaresRequest, Builder> {
        private java.util.List<AdditionalPackages> additionalPackages; 
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(UninstallSoftwaresRequest request) {
            super(request);
            this.additionalPackages = request.additionalPackages;
            this.clusterId = request.clusterId;
        } 

        /**
         * <p>The information about the software systems that you want to uninstall.</p>
         */
        public Builder additionalPackages(java.util.List<AdditionalPackages> additionalPackages) {
            String additionalPackagesShrink = shrink(additionalPackages, "AdditionalPackages", "json");
            this.putQueryParameter("AdditionalPackages", additionalPackagesShrink);
            this.additionalPackages = additionalPackages;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
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
        public UninstallSoftwaresRequest build() {
            return new UninstallSoftwaresRequest(this);
        } 

    } 

    /**
     * 
     * {@link UninstallSoftwaresRequest} extends {@link TeaModel}
     *
     * <p>UninstallSoftwaresRequest</p>
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

            private Builder() {
            } 

            private Builder(AdditionalPackages model) {
                this.name = model.name;
                this.version = model.version;
            } 

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
