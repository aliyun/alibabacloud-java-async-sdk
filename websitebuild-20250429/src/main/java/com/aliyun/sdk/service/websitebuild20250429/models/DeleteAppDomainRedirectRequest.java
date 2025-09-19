// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link DeleteAppDomainRedirectRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppDomainRedirectRequest</p>
 */
public class DeleteAppDomainRedirectRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordId")
    private Long recordId;

    private DeleteAppDomainRedirectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.recordId = builder.recordId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppDomainRedirectRequest create() {
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
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return recordId
     */
    public Long getRecordId() {
        return this.recordId;
    }

    public static final class Builder extends Request.Builder<DeleteAppDomainRedirectRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private Long recordId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAppDomainRedirectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.recordId = request.recordId;
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
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * RecordId.
         */
        public Builder recordId(Long recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        @Override
        public DeleteAppDomainRedirectRequest build() {
            return new DeleteAppDomainRedirectRequest(this);
        } 

    } 

}
