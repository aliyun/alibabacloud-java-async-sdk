// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link ListBaaSAntChainPeerRequest} extends {@link RequestModel}
 *
 * <p>ListBaaSAntChainPeerRequest</p>
 */
public class ListBaaSAntChainPeerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaaSAntChainChainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String baaSAntChainChainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaaSAntChainConsortiumId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String baaSAntChainConsortiumId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ListBaaSAntChainPeerRequest(Builder builder) {
        super(builder);
        this.baaSAntChainChainId = builder.baaSAntChainChainId;
        this.baaSAntChainConsortiumId = builder.baaSAntChainConsortiumId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBaaSAntChainPeerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baaSAntChainChainId
     */
    public String getBaaSAntChainChainId() {
        return this.baaSAntChainChainId;
    }

    /**
     * @return baaSAntChainConsortiumId
     */
    public String getBaaSAntChainConsortiumId() {
        return this.baaSAntChainConsortiumId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListBaaSAntChainPeerRequest, Builder> {
        private String baaSAntChainChainId; 
        private String baaSAntChainConsortiumId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListBaaSAntChainPeerRequest request) {
            super(request);
            this.baaSAntChainChainId = request.baaSAntChainChainId;
            this.baaSAntChainConsortiumId = request.baaSAntChainConsortiumId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder baaSAntChainChainId(String baaSAntChainChainId) {
            this.putQueryParameter("BaaSAntChainChainId", baaSAntChainChainId);
            this.baaSAntChainChainId = baaSAntChainChainId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder baaSAntChainConsortiumId(String baaSAntChainConsortiumId) {
            this.putQueryParameter("BaaSAntChainConsortiumId", baaSAntChainConsortiumId);
            this.baaSAntChainConsortiumId = baaSAntChainConsortiumId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListBaaSAntChainPeerRequest build() {
            return new ListBaaSAntChainPeerRequest(this);
        } 

    } 

}
