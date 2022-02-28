// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAssetGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyAssetGroupRequest</p>
 */
public class ModifyAssetGroupRequest extends Request {
    @Query
    @NameInMap("GroupId")
    private Long groupId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Uuids")
    private String uuids;

    private ModifyAssetGroupRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.sourceIp = builder.sourceIp;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAssetGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<ModifyAssetGroupRequest, Builder> {
        private Long groupId; 
        private String sourceIp; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAssetGroupRequest response) {
            super(response);
            this.groupId = response.groupId;
            this.sourceIp = response.sourceIp;
            this.uuids = response.uuids;
        } 

        /**
         * GroupId.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * Uuids.
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public ModifyAssetGroupRequest build() {
            return new ModifyAssetGroupRequest(this);
        } 

    } 

}
