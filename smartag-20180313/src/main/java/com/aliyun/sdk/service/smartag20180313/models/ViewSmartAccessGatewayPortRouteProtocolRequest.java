// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link ViewSmartAccessGatewayPortRouteProtocolRequest} extends {@link RequestModel}
 *
 * <p>ViewSmartAccessGatewayPortRouteProtocolRequest</p>
 */
public class ViewSmartAccessGatewayPortRouteProtocolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccount")
    private Boolean crossAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceUid")
    private String resourceUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SagInsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sagInsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SagSn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sagSn;

    private ViewSmartAccessGatewayPortRouteProtocolRequest(Builder builder) {
        super(builder);
        this.crossAccount = builder.crossAccount;
        this.regionId = builder.regionId;
        this.resourceUid = builder.resourceUid;
        this.sagInsId = builder.sagInsId;
        this.sagSn = builder.sagSn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ViewSmartAccessGatewayPortRouteProtocolRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crossAccount
     */
    public Boolean getCrossAccount() {
        return this.crossAccount;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceUid
     */
    public String getResourceUid() {
        return this.resourceUid;
    }

    /**
     * @return sagInsId
     */
    public String getSagInsId() {
        return this.sagInsId;
    }

    /**
     * @return sagSn
     */
    public String getSagSn() {
        return this.sagSn;
    }

    public static final class Builder extends Request.Builder<ViewSmartAccessGatewayPortRouteProtocolRequest, Builder> {
        private Boolean crossAccount; 
        private String regionId; 
        private String resourceUid; 
        private String sagInsId; 
        private String sagSn; 

        private Builder() {
            super();
        } 

        private Builder(ViewSmartAccessGatewayPortRouteProtocolRequest request) {
            super(request);
            this.crossAccount = request.crossAccount;
            this.regionId = request.regionId;
            this.resourceUid = request.resourceUid;
            this.sagInsId = request.sagInsId;
            this.sagSn = request.sagSn;
        } 

        /**
         * CrossAccount.
         */
        public Builder crossAccount(Boolean crossAccount) {
            this.putQueryParameter("CrossAccount", crossAccount);
            this.crossAccount = crossAccount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceUid.
         */
        public Builder resourceUid(String resourceUid) {
            this.putQueryParameter("ResourceUid", resourceUid);
            this.resourceUid = resourceUid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-sv487b7lno6go5****</p>
         */
        public Builder sagInsId(String sagInsId) {
            this.putQueryParameter("SagInsId", sagInsId);
            this.sagInsId = sagInsId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sagf4dk****</p>
         */
        public Builder sagSn(String sagSn) {
            this.putQueryParameter("SagSn", sagSn);
            this.sagSn = sagSn;
            return this;
        }

        @Override
        public ViewSmartAccessGatewayPortRouteProtocolRequest build() {
            return new ViewSmartAccessGatewayPortRouteProtocolRequest(this);
        } 

    } 

}
