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
 * {@link QueryInspirationBalanceForPartnerRequest} extends {@link RequestModel}
 *
 * <p>QueryInspirationBalanceForPartnerRequest</p>
 */
public class QueryInspirationBalanceForPartnerRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BelongId")
    private String belongId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BelongIdType")
    private String belongIdType;

    private QueryInspirationBalanceForPartnerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.belongId = builder.belongId;
        this.belongIdType = builder.belongIdType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryInspirationBalanceForPartnerRequest create() {
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
     * @return belongId
     */
    public String getBelongId() {
        return this.belongId;
    }

    /**
     * @return belongIdType
     */
    public String getBelongIdType() {
        return this.belongIdType;
    }

    public static final class Builder extends Request.Builder<QueryInspirationBalanceForPartnerRequest, Builder> {
        private String regionId; 
        private String belongId; 
        private String belongIdType; 

        private Builder() {
            super();
        } 

        private Builder(QueryInspirationBalanceForPartnerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.belongId = request.belongId;
            this.belongIdType = request.belongIdType;
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
         * BelongId.
         */
        public Builder belongId(String belongId) {
            this.putQueryParameter("BelongId", belongId);
            this.belongId = belongId;
            return this;
        }

        /**
         * BelongIdType.
         */
        public Builder belongIdType(String belongIdType) {
            this.putQueryParameter("BelongIdType", belongIdType);
            this.belongIdType = belongIdType;
            return this;
        }

        @Override
        public QueryInspirationBalanceForPartnerRequest build() {
            return new QueryInspirationBalanceForPartnerRequest(this);
        } 

    } 

}
