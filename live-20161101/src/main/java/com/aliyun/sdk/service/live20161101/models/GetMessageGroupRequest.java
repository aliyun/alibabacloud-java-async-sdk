// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMessageGroupRequest} extends {@link RequestModel}
 *
 * <p>GetMessageGroupRequest</p>
 */
public class GetMessageGroupRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    private GetMessageGroupRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMessageGroupRequest create() {
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

    public static final class Builder extends Request.Builder<GetMessageGroupRequest, Builder> {
        private String appId; 
        private String groupId; 

        private Builder() {
            super();
        } 

        private Builder(GetMessageGroupRequest request) {
            super(request);
            this.appId = request.appId;
            this.groupId = request.groupId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        @Override
        public GetMessageGroupRequest build() {
            return new GetMessageGroupRequest(this);
        } 

    } 

}
