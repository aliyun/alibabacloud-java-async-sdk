// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20180418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKubernetesTemplatesRequest} extends {@link RequestModel}
 *
 * <p>DescribeKubernetesTemplatesRequest</p>
 */
public class DescribeKubernetesTemplatesRequest extends Request {
    @Query
    @NameInMap("KubernetesVersion")
    private String kubernetesVersion;

    @Query
    @NameInMap("Region")
    private String region;

    private DescribeKubernetesTemplatesRequest(Builder builder) {
        super(builder);
        this.kubernetesVersion = builder.kubernetesVersion;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKubernetesTemplatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return kubernetesVersion
     */
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<DescribeKubernetesTemplatesRequest, Builder> {
        private String kubernetesVersion; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(DescribeKubernetesTemplatesRequest response) {
            super(response);
            this.kubernetesVersion = response.kubernetesVersion;
            this.region = response.region;
        } 

        /**
         * KubernetesVersion.
         */
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.putQueryParameter("KubernetesVersion", kubernetesVersion);
            this.kubernetesVersion = kubernetesVersion;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public DescribeKubernetesTemplatesRequest build() {
            return new DescribeKubernetesTemplatesRequest(this);
        } 

    } 

}
