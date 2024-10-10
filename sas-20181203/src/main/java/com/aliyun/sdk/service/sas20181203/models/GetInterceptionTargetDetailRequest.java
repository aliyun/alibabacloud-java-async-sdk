// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetInterceptionTargetDetailRequest} extends {@link RequestModel}
 *
 * <p>GetInterceptionTargetDetailRequest</p>
 */
public class GetInterceptionTargetDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long targetId;

    private GetInterceptionTargetDetailRequest(Builder builder) {
        super(builder);
        this.targetId = builder.targetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInterceptionTargetDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return targetId
     */
    public Long getTargetId() {
        return this.targetId;
    }

    public static final class Builder extends Request.Builder<GetInterceptionTargetDetailRequest, Builder> {
        private Long targetId; 

        private Builder() {
            super();
        } 

        private Builder(GetInterceptionTargetDetailRequest request) {
            super(request);
            this.targetId = request.targetId;
        } 

        /**
         * <p>The ID of the network object.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListInterceptionTargetPage~~">ListInterceptionTargetPage</a> operation to query the IDs of network objects.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>402008</p>
         */
        public Builder targetId(Long targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        @Override
        public GetInterceptionTargetDetailRequest build() {
            return new GetInterceptionTargetDetailRequest(this);
        } 

    } 

}
