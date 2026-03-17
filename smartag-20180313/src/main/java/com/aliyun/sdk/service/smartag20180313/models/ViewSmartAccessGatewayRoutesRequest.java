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
 * {@link ViewSmartAccessGatewayRoutesRequest} extends {@link RequestModel}
 *
 * <p>ViewSmartAccessGatewayRoutesRequest</p>
 */
public class ViewSmartAccessGatewayRoutesRequest extends Request {
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

    private ViewSmartAccessGatewayRoutesRequest(Builder builder) {
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

    public static ViewSmartAccessGatewayRoutesRequest create() {
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

    public static final class Builder extends Request.Builder<ViewSmartAccessGatewayRoutesRequest, Builder> {
        private Boolean crossAccount; 
        private String regionId; 
        private String resourceUid; 
        private String sagInsId; 
        private String sagSn; 

        private Builder() {
            super();
        } 

        private Builder(ViewSmartAccessGatewayRoutesRequest request) {
            super(request);
            this.crossAccount = request.crossAccount;
            this.regionId = request.regionId;
            this.resourceUid = request.resourceUid;
            this.sagInsId = request.sagInsId;
            this.sagSn = request.sagSn;
        } 

        /**
         * <p>Specifies whether to query only the SAG instances that belong to another Alibaba Cloud account. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default)</li>
         * <li><strong>true</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder crossAccount(Boolean crossAccount) {
            this.putQueryParameter("CrossAccount", crossAccount);
            this.crossAccount = crossAccount;
            return this;
        }

        /**
         * <p>The region ID of the SAG instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The ID of the Alibaba Cloud account to which the SAG instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>147304382796****</p>
         */
        public Builder resourceUid(String resourceUid) {
            this.putQueryParameter("ResourceUid", resourceUid);
            this.resourceUid = resourceUid;
            return this;
        }

        /**
         * <p>The ID of the Smart Access Gateway (SAG) instance.</p>
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
         * <p>The serial number of the SAG device.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sagf4ea****</p>
         */
        public Builder sagSn(String sagSn) {
            this.putQueryParameter("SagSn", sagSn);
            this.sagSn = sagSn;
            return this;
        }

        @Override
        public ViewSmartAccessGatewayRoutesRequest build() {
            return new ViewSmartAccessGatewayRoutesRequest(this);
        } 

    } 

}
