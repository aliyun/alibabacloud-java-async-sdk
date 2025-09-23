// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link GetBiddingRemainLimitNumRequest} extends {@link RequestModel}
 *
 * <p>GetBiddingRemainLimitNumRequest</p>
 */
public class GetBiddingRemainLimitNumRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiName")
    private String apiName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetBiddingRemainLimitNumRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.apiName = builder.apiName;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBiddingRemainLimitNumRequest create() {
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
     * @return apiName
     */
    public String getApiName() {
        return this.apiName;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GetBiddingRemainLimitNumRequest, Builder> {
        private String regionId; 
        private String apiName; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetBiddingRemainLimitNumRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.apiName = request.apiName;
            this.workspaceId = request.workspaceId;
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
         * ApiName.
         */
        public Builder apiName(String apiName) {
            this.putBodyParameter("ApiName", apiName);
            this.apiName = apiName;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GetBiddingRemainLimitNumRequest build() {
            return new GetBiddingRemainLimitNumRequest(this);
        } 

    } 

}
