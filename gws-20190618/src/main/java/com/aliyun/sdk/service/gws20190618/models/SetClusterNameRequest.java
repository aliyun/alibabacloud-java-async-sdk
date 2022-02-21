// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetClusterNameRequest} extends {@link RequestModel}
 *
 * <p>SetClusterNameRequest</p>
 */
public class SetClusterNameRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private SetClusterNameRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetClusterNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<SetClusterNameRequest, Builder> {
        private String clusterId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(SetClusterNameRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.name = response.name;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public SetClusterNameRequest build() {
            return new SetClusterNameRequest(this);
        } 

    } 

}
