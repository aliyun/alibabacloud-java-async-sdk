// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetTrafficControlApisRequest} extends {@link RequestModel}
 *
 * <p>SetTrafficControlApisRequest</p>
 */
public class SetTrafficControlApisRequest extends Request {
    @Query
    @NameInMap("ApiIds")
    @Validation(required = true)
    private String apiIds;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StageName")
    @Validation(required = true)
    private String stageName;

    @Query
    @NameInMap("TrafficControlId")
    @Validation(required = true)
    private String trafficControlId;

    private SetTrafficControlApisRequest(Builder builder) {
        super(builder);
        this.apiIds = builder.apiIds;
        this.groupId = builder.groupId;
        this.securityToken = builder.securityToken;
        this.stageName = builder.stageName;
        this.trafficControlId = builder.trafficControlId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetTrafficControlApisRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiIds
     */
    public String getApiIds() {
        return this.apiIds;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return stageName
     */
    public String getStageName() {
        return this.stageName;
    }

    /**
     * @return trafficControlId
     */
    public String getTrafficControlId() {
        return this.trafficControlId;
    }

    public static final class Builder extends Request.Builder<SetTrafficControlApisRequest, Builder> {
        private String apiIds; 
        private String groupId; 
        private String securityToken; 
        private String stageName; 
        private String trafficControlId; 

        private Builder() {
            super();
        } 

        private Builder(SetTrafficControlApisRequest request) {
            super(request);
            this.apiIds = request.apiIds;
            this.groupId = request.groupId;
            this.securityToken = request.securityToken;
            this.stageName = request.stageName;
            this.trafficControlId = request.trafficControlId;
        } 

        /**
         * The ID of the request.
         */
        public Builder apiIds(String apiIds) {
            this.putQueryParameter("ApiIds", apiIds);
            this.apiIds = apiIds;
            return this;
        }

        /**
         * The name of the runtime environment. Valid values:
         * <p>
         * 
         * *   **RELEASE**
         * *   **TEST**
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * *   This API is intended for API providers.
         * <p>
         * *   This API allows you to bind a specific throttling policy to up to 100 APIs at a time.
         */
        public Builder stageName(String stageName) {
            this.putQueryParameter("StageName", stageName);
            this.stageName = stageName;
            return this;
        }

        /**
         * The API ID for the specified operation. Separate multiple API IDs with commas (,). A maximum of 100 API IDs can be entered.
         */
        public Builder trafficControlId(String trafficControlId) {
            this.putQueryParameter("TrafficControlId", trafficControlId);
            this.trafficControlId = trafficControlId;
            return this;
        }

        @Override
        public SetTrafficControlApisRequest build() {
            return new SetTrafficControlApisRequest(this);
        } 

    } 

}
