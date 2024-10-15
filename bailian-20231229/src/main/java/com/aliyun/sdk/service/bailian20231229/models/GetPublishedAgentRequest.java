// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetPublishedAgentRequest} extends {@link RequestModel}
 *
 * <p>GetPublishedAgentRequest</p>
 */
public class GetPublishedAgentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appCode")
    private String appCode;

    private GetPublishedAgentRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.appCode = builder.appCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPublishedAgentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    public static final class Builder extends Request.Builder<GetPublishedAgentRequest, Builder> {
        private String workspaceId; 
        private String appCode; 

        private Builder() {
            super();
        } 

        private Builder(GetPublishedAgentRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.appCode = request.appCode;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * appCode.
         */
        public Builder appCode(String appCode) {
            this.putPathParameter("appCode", appCode);
            this.appCode = appCode;
            return this;
        }

        @Override
        public GetPublishedAgentRequest build() {
            return new GetPublishedAgentRequest(this);
        } 

    } 

}
