// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReprotectDiskReplicaPairRequest} extends {@link RequestModel}
 *
 * <p>ReprotectDiskReplicaPairRequest</p>
 */
public class ReprotectDiskReplicaPairRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ReplicaPairId")
    @Validation(required = true)
    private String replicaPairId;

    @Query
    @NameInMap("ReverseReplicate")
    private Boolean reverseReplicate;

    private ReprotectDiskReplicaPairRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
        this.replicaPairId = builder.replicaPairId;
        this.reverseReplicate = builder.reverseReplicate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReprotectDiskReplicaPairRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return replicaPairId
     */
    public String getReplicaPairId() {
        return this.replicaPairId;
    }

    /**
     * @return reverseReplicate
     */
    public Boolean getReverseReplicate() {
        return this.reverseReplicate;
    }

    public static final class Builder extends Request.Builder<ReprotectDiskReplicaPairRequest, Builder> {
        private String clientToken; 
        private String regionId; 
        private String replicaPairId; 
        private Boolean reverseReplicate; 

        private Builder() {
            super();
        } 

        private Builder(ReprotectDiskReplicaPairRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.regionId = request.regionId;
            this.replicaPairId = request.replicaPairId;
            this.reverseReplicate = request.reverseReplicate;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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

        /**
         * ReplicaPairId.
         */
        public Builder replicaPairId(String replicaPairId) {
            this.putQueryParameter("ReplicaPairId", replicaPairId);
            this.replicaPairId = replicaPairId;
            return this;
        }

        /**
         * 反向复制开关：false代表恢复原方向，true代表反向复制。默认值是true。
         */
        public Builder reverseReplicate(Boolean reverseReplicate) {
            this.putQueryParameter("ReverseReplicate", reverseReplicate);
            this.reverseReplicate = reverseReplicate;
            return this;
        }

        @Override
        public ReprotectDiskReplicaPairRequest build() {
            return new ReprotectDiskReplicaPairRequest(this);
        } 

    } 

}
