// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHubClustersRequest} extends {@link RequestModel}
 *
 * <p>DescribeHubClustersRequest</p>
 */
public class DescribeHubClustersRequest extends Request {
    @Query
    @NameInMap("Profile")
    private String profile;

    private DescribeHubClustersRequest(Builder builder) {
        super(builder);
        this.profile = builder.profile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHubClustersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return profile
     */
    public String getProfile() {
        return this.profile;
    }

    public static final class Builder extends Request.Builder<DescribeHubClustersRequest, Builder> {
        private String profile; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHubClustersRequest request) {
            super(request);
            this.profile = request.profile;
        } 

        /**
         * The scenario where master instances are used. Valid values:
         * <p>
         * 
         * *   `Default`: standard scenarios.
         * *   `XFlow`: workflow scenarios.
         * 
         * Default value: `Default`.
         */
        public Builder profile(String profile) {
            this.putQueryParameter("Profile", profile);
            this.profile = profile;
            return this;
        }

        @Override
        public DescribeHubClustersRequest build() {
            return new DescribeHubClustersRequest(this);
        } 

    } 

}
