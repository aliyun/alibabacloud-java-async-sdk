// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAgentlessRegionRequest} extends {@link RequestModel}
 *
 * <p>ListAgentlessRegionRequest</p>
 */
public class ListAgentlessRegionRequest extends Request {
    private ListAgentlessRegionRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentlessRegionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListAgentlessRegionRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListAgentlessRegionRequest request) {
            super(request);
        } 

        @Override
        public ListAgentlessRegionRequest build() {
            return new ListAgentlessRegionRequest(this);
        } 

    } 

}
