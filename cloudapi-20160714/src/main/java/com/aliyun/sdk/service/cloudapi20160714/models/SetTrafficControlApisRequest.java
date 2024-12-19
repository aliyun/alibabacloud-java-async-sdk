// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link SetTrafficControlApisRequest} extends {@link RequestModel}
 *
 * <p>SetTrafficControlApisRequest</p>
 */
public class SetTrafficControlApisRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficControlId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The API ID for the specified operation. Separate multiple API IDs with commas (,). A maximum of 100 API IDs can be entered.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3b81fd160f5645e097cc8855d75a1cf6,46fbb52840d146f186e38e8e70fc8c12</p>
         */
        public Builder apiIds(String apiIds) {
            this.putQueryParameter("ApiIds", apiIds);
            this.apiIds = apiIds;
            return this;
        }

        /**
         * <p>The ID of the API group containing the APIs to which you want to bind a specified throttling policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0009db9c828549768a200320714b8930</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The security token included in the WebSocket request header. The system uses this token to authenticate the request.</p>
         * 
         * <strong>example:</strong>
         * <p>556d15cb-0808-432d-ab07-33e6b961b703</p>
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The name of the runtime environment. Valid values:</p>
         * <ul>
         * <li><strong>RELEASE</strong></li>
         * <li><strong>TEST</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RELEASE</p>
         */
        public Builder stageName(String stageName) {
            this.putQueryParameter("StageName", stageName);
            this.stageName = stageName;
            return this;
        }

        /**
         * <p>The ID of the throttling policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dd05f1c54d6749eda95f9fa6d491449a</p>
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
