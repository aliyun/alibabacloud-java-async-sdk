// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHttpTriggerConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeHttpTriggerConfigRequest</p>
 */
public class DescribeHttpTriggerConfigRequest extends Request {
    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private DescribeHttpTriggerConfigRequest(Builder builder) {
        super(builder);
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHttpTriggerConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<DescribeHttpTriggerConfigRequest, Builder> {
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHttpTriggerConfigRequest request) {
            super(request);
            this.spaceId = request.spaceId;
        } 

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public DescribeHttpTriggerConfigRequest build() {
            return new DescribeHttpTriggerConfigRequest(this);
        } 

    } 

}
