// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link ListWhatAppTemplateRequest} extends {@link RequestModel}
 *
 * <p>ListWhatAppTemplateRequest</p>
 */
public class ListWhatAppTemplateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HetuParams")
    private String hetuParams;

    private ListWhatAppTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.custSpaceId = builder.custSpaceId;
        this.hetuParams = builder.hetuParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWhatAppTemplateRequest create() {
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
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return hetuParams
     */
    public String getHetuParams() {
        return this.hetuParams;
    }

    public static final class Builder extends Request.Builder<ListWhatAppTemplateRequest, Builder> {
        private String regionId; 
        private String custSpaceId; 
        private String hetuParams; 

        private Builder() {
            super();
        } 

        private Builder(ListWhatAppTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.custSpaceId = request.custSpaceId;
            this.hetuParams = request.hetuParams;
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
         * CustSpaceId.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * HetuParams.
         */
        public Builder hetuParams(String hetuParams) {
            this.putQueryParameter("HetuParams", hetuParams);
            this.hetuParams = hetuParams;
            return this;
        }

        @Override
        public ListWhatAppTemplateRequest build() {
            return new ListWhatAppTemplateRequest(this);
        } 

    } 

}
