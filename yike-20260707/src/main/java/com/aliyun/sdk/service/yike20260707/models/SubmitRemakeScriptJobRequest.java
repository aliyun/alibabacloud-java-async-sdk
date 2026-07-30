// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link SubmitRemakeScriptJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitRemakeScriptJobRequest</p>
 */
public class SubmitRemakeScriptJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemakeParams")
    private String remakeParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemakeType")
    private String remakeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitRemakeScriptJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.remakeParams = builder.remakeParams;
        this.remakeType = builder.remakeType;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitRemakeScriptJobRequest create() {
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
     * @return remakeParams
     */
    public String getRemakeParams() {
        return this.remakeParams;
    }

    /**
     * @return remakeType
     */
    public String getRemakeType() {
        return this.remakeType;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitRemakeScriptJobRequest, Builder> {
        private String regionId; 
        private String remakeParams; 
        private String remakeType; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitRemakeScriptJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.remakeParams = request.remakeParams;
            this.remakeType = request.remakeType;
            this.userData = request.userData;
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
         * RemakeParams.
         */
        public Builder remakeParams(String remakeParams) {
            this.putQueryParameter("RemakeParams", remakeParams);
            this.remakeParams = remakeParams;
            return this;
        }

        /**
         * RemakeType.
         */
        public Builder remakeType(String remakeType) {
            this.putQueryParameter("RemakeType", remakeType);
            this.remakeType = remakeType;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitRemakeScriptJobRequest build() {
            return new SubmitRemakeScriptJobRequest(this);
        } 

    } 

}
