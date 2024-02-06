// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeApplicationRequest} extends {@link RequestModel}
 *
 * <p>UpgradeApplicationRequest</p>
 */
public class UpgradeApplicationRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Template")
    @Validation(required = true)
    private String template;

    @Query
    @NameInMap("Timeout")
    private Integer timeout;

    private UpgradeApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.template = builder.template;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeApplicationRequest create() {
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
     * @return template
     */
    public String getTemplate() {
        return this.template;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<UpgradeApplicationRequest, Builder> {
        private String appId; 
        private String template; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeApplicationRequest request) {
            super(request);
            this.appId = request.appId;
            this.template = request.template;
            this.timeout = request.timeout;
        } 

        /**
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The information template for phased update. The value must be a JSON string and contain the following information:
         * <p>
         * 
         * *   Version range that you want to update
         * *   Configuration information of the target version
         * *   Canary release policy for resources
         * *   Intelligent upgrade policy that contains information such as the time window and resource usage limit
         */
        public Builder template(String template) {
            this.putQueryParameter("Template", template);
            this.template = template;
            return this;
        }

        /**
         * The timeout period for asynchronous upgrade. Unit: seconds. Default value: 300.
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public UpgradeApplicationRequest build() {
            return new UpgradeApplicationRequest(this);
        } 

    } 

}
