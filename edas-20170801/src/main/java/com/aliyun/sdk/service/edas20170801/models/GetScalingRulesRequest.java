// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link GetScalingRulesRequest} extends {@link RequestModel}
 *
 * <p>GetScalingRulesRequest</p>
 */
public class GetScalingRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    private GetScalingRulesRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.groupId = builder.groupId;
        this.mode = builder.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScalingRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    public static final class Builder extends Request.Builder<GetScalingRulesRequest, Builder> {
        private String appId; 
        private String groupId; 
        private String mode; 

        private Builder() {
            super();
        } 

        private Builder(GetScalingRulesRequest request) {
            super(request);
            this.appId = request.appId;
            this.groupId = request.groupId;
            this.mode = request.mode;
        } 

        /**
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>33e39be9-3e5f-*********</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the instance group to which the application is deployed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d8bb9d60-9**************</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The type of the scaling rule. You can leave this parameter empty. Valid values:</p>
         * <ul>
         * <li>SCALE_IN: scale-in rules</li>
         * <li>SCALE_OUT: scale-out rules</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SCALE_IN</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        @Override
        public GetScalingRulesRequest build() {
            return new GetScalingRulesRequest(this);
        } 

    } 

}
