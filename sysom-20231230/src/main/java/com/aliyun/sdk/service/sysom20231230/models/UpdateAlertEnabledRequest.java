// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link UpdateAlertEnabledRequest} extends {@link RequestModel}
 *
 * <p>UpdateAlertEnabledRequest</p>
 */
public class UpdateAlertEnabledRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    private UpdateAlertEnabledRequest(Builder builder) {
        super(builder);
        this.enabled = builder.enabled;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAlertEnabledRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<UpdateAlertEnabledRequest, Builder> {
        private Boolean enabled; 
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAlertEnabledRequest request) {
            super(request);
            this.enabled = request.enabled;
            this.id = request.id;
        } 

        /**
         * enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.putBodyParameter("enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.putBodyParameter("id", id);
            this.id = id;
            return this;
        }

        @Override
        public UpdateAlertEnabledRequest build() {
            return new UpdateAlertEnabledRequest(this);
        } 

    } 

}
