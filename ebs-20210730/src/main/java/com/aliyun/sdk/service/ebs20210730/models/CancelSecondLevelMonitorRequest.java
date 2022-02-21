// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelSecondLevelMonitorRequest} extends {@link RequestModel}
 *
 * <p>CancelSecondLevelMonitorRequest</p>
 */
public class CancelSecondLevelMonitorRequest extends Request {
    private CancelSecondLevelMonitorRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelSecondLevelMonitorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<CancelSecondLevelMonitorRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(CancelSecondLevelMonitorRequest response) {
            super(response);
        } 

        @Override
        public CancelSecondLevelMonitorRequest build() {
            return new CancelSecondLevelMonitorRequest(this);
        } 

    } 

}
