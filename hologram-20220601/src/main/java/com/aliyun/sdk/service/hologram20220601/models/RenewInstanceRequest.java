// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewInstanceRequest} extends {@link RequestModel}
 *
 * <p>RenewInstanceRequest</p>
 */
public class RenewInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("duration")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer duration;

    private RenewInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.autoRenew = builder.autoRenew;
        this.duration = builder.duration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    public static final class Builder extends Request.Builder<RenewInstanceRequest, Builder> {
        private String instanceId; 
        private Boolean autoRenew; 
        private Integer duration; 

        private Builder() {
            super();
        } 

        private Builder(RenewInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.autoRenew = request.autoRenew;
            this.duration = request.duration;
        } 

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Specifies whether to enable monthly auto-renewal. The default value is false. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * >  If you enable auto-renewal for an instance for which auto-renewal is enabled, an error is reported.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("autoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The renewal duration. Unit: month.
         */
        public Builder duration(Integer duration) {
            this.putBodyParameter("duration", duration);
            this.duration = duration;
            return this;
        }

        @Override
        public RenewInstanceRequest build() {
            return new RenewInstanceRequest(this);
        } 

    } 

}
