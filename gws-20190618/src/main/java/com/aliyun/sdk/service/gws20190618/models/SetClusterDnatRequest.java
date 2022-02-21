// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetClusterDnatRequest} extends {@link RequestModel}
 *
 * <p>SetClusterDnatRequest</p>
 */
public class SetClusterDnatRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("NatEip")
    private String natEip;

    @Query
    @NameInMap("NatId")
    @Validation(required = true)
    private String natId;

    private SetClusterDnatRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.natEip = builder.natEip;
        this.natId = builder.natId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetClusterDnatRequest create() {
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
     * @return natEip
     */
    public String getNatEip() {
        return this.natEip;
    }

    /**
     * @return natId
     */
    public String getNatId() {
        return this.natId;
    }

    public static final class Builder extends Request.Builder<SetClusterDnatRequest, Builder> {
        private String clusterId; 
        private String natEip; 
        private String natId; 

        private Builder() {
            super();
        } 

        private Builder(SetClusterDnatRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.natEip = response.natEip;
            this.natId = response.natId;
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
         * NatEip.
         */
        public Builder natEip(String natEip) {
            this.putQueryParameter("NatEip", natEip);
            this.natEip = natEip;
            return this;
        }

        /**
         * NatId.
         */
        public Builder natId(String natId) {
            this.putQueryParameter("NatId", natId);
            this.natId = natId;
            return this;
        }

        @Override
        public SetClusterDnatRequest build() {
            return new SetClusterDnatRequest(this);
        } 

    } 

}
