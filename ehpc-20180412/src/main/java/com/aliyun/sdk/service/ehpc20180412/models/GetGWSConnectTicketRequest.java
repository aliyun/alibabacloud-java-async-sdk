// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGWSConnectTicketRequest} extends {@link RequestModel}
 *
 * <p>GetGWSConnectTicketRequest</p>
 */
public class GetGWSConnectTicketRequest extends Request {
    @Query
    @NameInMap("AppName")
    private String appName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private GetGWSConnectTicketRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGWSConnectTicketRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetGWSConnectTicketRequest, Builder> {
        private String appName; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetGWSConnectTicketRequest response) {
            super(response);
            this.appName = response.appName;
            this.instanceId = response.instanceId;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetGWSConnectTicketRequest build() {
            return new GetGWSConnectTicketRequest(this);
        } 

    } 

}
