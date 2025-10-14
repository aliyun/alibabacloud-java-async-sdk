// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DeleteGdnInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteGdnInstanceRequest</p>
 */
public class DeleteGdnInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GdnInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gdnInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteGdnInstanceRequest(Builder builder) {
        super(builder);
        this.gdnInstanceName = builder.gdnInstanceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGdnInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gdnInstanceName
     */
    public String getGdnInstanceName() {
        return this.gdnInstanceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteGdnInstanceRequest, Builder> {
        private String gdnInstanceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGdnInstanceRequest request) {
            super(request);
            this.gdnInstanceName = request.gdnInstanceName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gdn-yq****dorhkzttoi</p>
         */
        public Builder gdnInstanceName(String gdnInstanceName) {
            this.putQueryParameter("GdnInstanceName", gdnInstanceName);
            this.gdnInstanceName = gdnInstanceName;
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
        public DeleteGdnInstanceRequest build() {
            return new DeleteGdnInstanceRequest(this);
        } 

    } 

}
