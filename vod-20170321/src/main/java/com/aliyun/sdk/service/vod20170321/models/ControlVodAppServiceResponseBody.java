// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link ControlVodAppServiceResponseBody} extends {@link TeaModel}
 *
 * <p>ControlVodAppServiceResponseBody</p>
 */
public class ControlVodAppServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppServiceStatus")
    private String appServiceStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ControlVodAppServiceResponseBody(Builder builder) {
        this.appServiceStatus = builder.appServiceStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ControlVodAppServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appServiceStatus
     */
    public String getAppServiceStatus() {
        return this.appServiceStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String appServiceStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ControlVodAppServiceResponseBody model) {
            this.appServiceStatus = model.appServiceStatus;
            this.requestId = model.requestId;
        } 

        /**
         * AppServiceStatus.
         */
        public Builder appServiceStatus(String appServiceStatus) {
            this.appServiceStatus = appServiceStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ControlVodAppServiceResponseBody build() {
            return new ControlVodAppServiceResponseBody(this);
        } 

    } 

}
