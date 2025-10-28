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
 * {@link GetJvmConfigurationRequest} extends {@link RequestModel}
 *
 * <p>GetJvmConfigurationRequest</p>
 */
public class GetJvmConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    private GetJvmConfigurationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJvmConfigurationRequest create() {
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

    public static final class Builder extends Request.Builder<GetJvmConfigurationRequest, Builder> {
        private String appId; 
        private String groupId; 

        private Builder() {
            super();
        } 

        private Builder(GetJvmConfigurationRequest request) {
            super(request);
            this.appId = request.appId;
            this.groupId = request.groupId;
        } 

        /**
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3616cdca-4f92-4***************</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the instance group.</p>
         * <ul>
         * <li>If an ID is specified, this operation queries the JVM configuration information of the instance group.</li>
         * <li>If an ID is not specified, this operation queries the JVM configuration information of the application.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8123db90-880f-48**************</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        @Override
        public GetJvmConfigurationRequest build() {
            return new GetJvmConfigurationRequest(this);
        } 

    } 

}
