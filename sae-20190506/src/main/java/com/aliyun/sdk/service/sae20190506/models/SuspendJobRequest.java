// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SuspendJobRequest} extends {@link RequestModel}
 *
 * <p>SuspendJobRequest</p>
 */
public class SuspendJobRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Suspend")
    @Validation(required = true)
    private Boolean suspend;

    private SuspendJobRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.suspend = builder.suspend;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SuspendJobRequest create() {
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
     * @return suspend
     */
    public Boolean getSuspend() {
        return this.suspend;
    }

    public static final class Builder extends Request.Builder<SuspendJobRequest, Builder> {
        private String appId; 
        private Boolean suspend; 

        private Builder() {
            super();
        } 

        private Builder(SuspendJobRequest request) {
            super(request);
            this.appId = request.appId;
            this.suspend = request.suspend;
        } 

        /**
         * The ID of the job template.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Specifies whether to suspend the job template.
         */
        public Builder suspend(Boolean suspend) {
            this.putQueryParameter("Suspend", suspend);
            this.suspend = suspend;
            return this;
        }

        @Override
        public SuspendJobRequest build() {
            return new SuspendJobRequest(this);
        } 

    } 

}
