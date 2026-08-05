// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DeleteLakebaseS3AccountRequest} extends {@link RequestModel}
 *
 * <p>DeleteLakebaseS3AccountRequest</p>
 */
public class DeleteLakebaseS3AccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PfsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pfsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAccAk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userAccAk;

    private DeleteLakebaseS3AccountRequest(Builder builder) {
        super(builder);
        this.pfsInstanceId = builder.pfsInstanceId;
        this.regionId = builder.regionId;
        this.userAccAk = builder.userAccAk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLakebaseS3AccountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pfsInstanceId
     */
    public String getPfsInstanceId() {
        return this.pfsInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return userAccAk
     */
    public String getUserAccAk() {
        return this.userAccAk;
    }

    public static final class Builder extends Request.Builder<DeleteLakebaseS3AccountRequest, Builder> {
        private String pfsInstanceId; 
        private String regionId; 
        private String userAccAk; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLakebaseS3AccountRequest request) {
            super(request);
            this.pfsInstanceId = request.pfsInstanceId;
            this.regionId = request.regionId;
            this.userAccAk = request.userAccAk;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-xxx</p>
         */
        public Builder pfsInstanceId(String pfsInstanceId) {
            this.putQueryParameter("PfsInstanceId", pfsInstanceId);
            this.pfsInstanceId = pfsInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>accname</p>
         */
        public Builder userAccAk(String userAccAk) {
            this.putQueryParameter("UserAccAk", userAccAk);
            this.userAccAk = userAccAk;
            return this;
        }

        @Override
        public DeleteLakebaseS3AccountRequest build() {
            return new DeleteLakebaseS3AccountRequest(this);
        } 

    } 

}
