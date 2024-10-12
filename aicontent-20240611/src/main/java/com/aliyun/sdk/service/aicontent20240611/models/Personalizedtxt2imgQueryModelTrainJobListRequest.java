// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Personalizedtxt2imgQueryModelTrainJobListRequest} extends {@link RequestModel}
 *
 * <p>Personalizedtxt2imgQueryModelTrainJobListRequest</p>
 */
public class Personalizedtxt2imgQueryModelTrainJobListRequest extends Request {
    private Personalizedtxt2imgQueryModelTrainJobListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Personalizedtxt2imgQueryModelTrainJobListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<Personalizedtxt2imgQueryModelTrainJobListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(Personalizedtxt2imgQueryModelTrainJobListRequest request) {
            super(request);
        } 

        @Override
        public Personalizedtxt2imgQueryModelTrainJobListRequest build() {
            return new Personalizedtxt2imgQueryModelTrainJobListRequest(this);
        } 

    } 

}
