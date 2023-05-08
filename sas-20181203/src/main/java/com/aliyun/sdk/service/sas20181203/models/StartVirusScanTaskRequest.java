// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartVirusScanTaskRequest} extends {@link RequestModel}
 *
 * <p>StartVirusScanTaskRequest</p>
 */
public class StartVirusScanTaskRequest extends Request {
    @Query
    @NameInMap("TargetInfo")
    @Validation(required = true)
    private String targetInfo;

    private StartVirusScanTaskRequest(Builder builder) {
        super(builder);
        this.targetInfo = builder.targetInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartVirusScanTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return targetInfo
     */
    public String getTargetInfo() {
        return this.targetInfo;
    }

    public static final class Builder extends Request.Builder<StartVirusScanTaskRequest, Builder> {
        private String targetInfo; 

        private Builder() {
            super();
        } 

        private Builder(StartVirusScanTaskRequest request) {
            super(request);
            this.targetInfo = request.targetInfo;
        } 

        /**
         * TargetInfo.
         */
        public Builder targetInfo(String targetInfo) {
            this.putQueryParameter("TargetInfo", targetInfo);
            this.targetInfo = targetInfo;
            return this;
        }

        @Override
        public StartVirusScanTaskRequest build() {
            return new StartVirusScanTaskRequest(this);
        } 

    } 

}
