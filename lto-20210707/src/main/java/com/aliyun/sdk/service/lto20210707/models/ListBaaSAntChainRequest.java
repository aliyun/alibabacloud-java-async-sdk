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
 * {@link ListBaaSAntChainRequest} extends {@link RequestModel}
 *
 * <p>ListBaaSAntChainRequest</p>
 */
public class ListBaaSAntChainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaaSAntChainConsortiumId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String baaSAntChainConsortiumId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ListBaaSAntChainRequest(Builder builder) {
        super(builder);
        this.baaSAntChainConsortiumId = builder.baaSAntChainConsortiumId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBaaSAntChainRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<ListBaaSAntChainRequest, Builder> {
        private String baaSAntChainConsortiumId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListBaaSAntChainRequest request) {
            super(request);
            this.baaSAntChainConsortiumId = request.baaSAntChainConsortiumId;
            this.regionId = request.regionId;
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
        public ListBaaSAntChainRequest build() {
            return new ListBaaSAntChainRequest(this);
        } 

    } 

}
