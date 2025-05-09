// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link UpdatePublishGraySwitchRequest} extends {@link RequestModel}
 *
 * <p>UpdatePublishGraySwitchRequest</p>
 */
public class UpdatePublishGraySwitchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GraySwitchStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer graySwitchStatus;

    private UpdatePublishGraySwitchRequest(Builder builder) {
        super(builder);
        this.graySwitchStatus = builder.graySwitchStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePublishGraySwitchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return graySwitchStatus
     */
    public Integer getGraySwitchStatus() {
        return this.graySwitchStatus;
    }

    public static final class Builder extends Request.Builder<UpdatePublishGraySwitchRequest, Builder> {
        private Integer graySwitchStatus; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePublishGraySwitchRequest request) {
            super(request);
            this.graySwitchStatus = request.graySwitchStatus;
        } 

        /**
         * <p>Specifies whether to enable the canary release feature. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enabled.</li>
         * <li><strong>0</strong>: disabled.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder graySwitchStatus(Integer graySwitchStatus) {
            this.putQueryParameter("GraySwitchStatus", graySwitchStatus);
            this.graySwitchStatus = graySwitchStatus;
            return this;
        }

        @Override
        public UpdatePublishGraySwitchRequest build() {
            return new UpdatePublishGraySwitchRequest(this);
        } 

    } 

}
