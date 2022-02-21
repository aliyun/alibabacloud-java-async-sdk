// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplySecondLevelMonitorRequest} extends {@link RequestModel}
 *
 * <p>ApplySecondLevelMonitorRequest</p>
 */
public class ApplySecondLevelMonitorRequest extends Request {
    private ApplySecondLevelMonitorRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplySecondLevelMonitorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ApplySecondLevelMonitorRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ApplySecondLevelMonitorRequest response) {
            super(response);
        } 

        @Override
        public ApplySecondLevelMonitorRequest build() {
            return new ApplySecondLevelMonitorRequest(this);
        } 

    } 

}
