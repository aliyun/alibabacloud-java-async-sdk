// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link RefreshContainerNetworkRequest} extends {@link RequestModel}
 *
 * <p>RefreshContainerNetworkRequest</p>
 */
public class RefreshContainerNetworkRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;


    private RefreshContainerNetworkRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshContainerNetworkRequest create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String clusterId; 

        /**
         * <p>ClusterId.</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        public RefreshContainerNetworkRequest build() {
            return new RefreshContainerNetworkRequest(this);
        } 

    } 

}
