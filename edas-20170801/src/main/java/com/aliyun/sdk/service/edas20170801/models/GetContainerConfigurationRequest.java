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
 * {@link GetContainerConfigurationRequest} extends {@link RequestModel}
 *
 * <p>GetContainerConfigurationRequest</p>
 */
public class GetContainerConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    private GetContainerConfigurationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetContainerConfigurationRequest create() {
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

    public static final class Builder extends Request.Builder<GetContainerConfigurationRequest, Builder> {
        private String appId; 
        private String groupId; 

        private Builder() {
            super();
        } 

        private Builder(GetContainerConfigurationRequest request) {
            super(request);
            this.appId = request.appId;
            this.groupId = request.groupId;
        } 

        /**
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3616cdca-4f92-**************</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the instance group.</p>
         * <ul>
         * <li>If this parameter is specified, this operation queries the Tomcat configuration of the instance group.</li>
         * <li>If this parameter is not specified, this operation queries the Tomcat configuration of the application.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8123db90-880f-**************</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        @Override
        public GetContainerConfigurationRequest build() {
            return new GetContainerConfigurationRequest(this);
        } 

    } 

}
