// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RenameDbfsRequest} extends {@link RequestModel}
 *
 * <p>RenameDbfsRequest</p>
 */
public class RenameDbfsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FsName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fsName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private RenameDbfsRequest(Builder builder) {
        super(builder);
        this.fsId = builder.fsId;
        this.fsName = builder.fsName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenameDbfsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fsId
     */
    public String getFsId() {
        return this.fsId;
    }

    /**
     * @return fsName
     */
    public String getFsName() {
        return this.fsName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RenameDbfsRequest, Builder> {
        private String fsId; 
        private String fsName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RenameDbfsRequest request) {
            super(request);
            this.fsId = request.fsId;
            this.fsName = request.fsName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbfs-GOrr********Yd0VLOyBpg</p>
         */
        public Builder fsId(String fsId) {
            this.putQueryParameter("FsId", fsId);
            this.fsId = fsId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NewDbfsName</p>
         */
        public Builder fsName(String fsName) {
            this.putQueryParameter("FsName", fsName);
            this.fsName = fsName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public RenameDbfsRequest build() {
            return new RenameDbfsRequest(this);
        } 

    } 

}
