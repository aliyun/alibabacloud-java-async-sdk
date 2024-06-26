// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenameBlockchainRequest} extends {@link RequestModel}
 *
 * <p>RenameBlockchainRequest</p>
 */
public class RenameBlockchainRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bizid")
    private String bizid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NewName")
    private String newName;

    private RenameBlockchainRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizid = builder.bizid;
        this.newName = builder.newName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenameBlockchainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bizid
     */
    public String getBizid() {
        return this.bizid;
    }

    /**
     * @return newName
     */
    public String getNewName() {
        return this.newName;
    }

    public static final class Builder extends Request.Builder<RenameBlockchainRequest, Builder> {
        private String regionId; 
        private String bizid; 
        private String newName; 

        private Builder() {
            super();
        } 

        private Builder(RenameBlockchainRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizid = request.bizid;
            this.newName = request.newName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Bizid.
         */
        public Builder bizid(String bizid) {
            this.putBodyParameter("Bizid", bizid);
            this.bizid = bizid;
            return this;
        }

        /**
         * NewName.
         */
        public Builder newName(String newName) {
            this.putBodyParameter("NewName", newName);
            this.newName = newName;
            return this;
        }

        @Override
        public RenameBlockchainRequest build() {
            return new RenameBlockchainRequest(this);
        } 

    } 

}
