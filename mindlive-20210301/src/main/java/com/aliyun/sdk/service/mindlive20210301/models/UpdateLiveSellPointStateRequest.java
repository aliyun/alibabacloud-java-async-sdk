// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLiveSellPointStateRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveSellPointStateRequest</p>
 */
public class UpdateLiveSellPointStateRequest extends Request {
    @Query
    @NameInMap("Display")
    private Boolean display;

    private UpdateLiveSellPointStateRequest(Builder builder) {
        super(builder);
        this.display = builder.display;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLiveSellPointStateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return display
     */
    public Boolean getDisplay() {
        return this.display;
    }

    public static final class Builder extends Request.Builder<UpdateLiveSellPointStateRequest, Builder> {
        private Boolean display; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLiveSellPointStateRequest request) {
            super(request);
            this.display = request.display;
        } 

        /**
         * Display.
         */
        public Builder display(Boolean display) {
            this.putQueryParameter("Display", display);
            this.display = display;
            return this;
        }

        @Override
        public UpdateLiveSellPointStateRequest build() {
            return new UpdateLiveSellPointStateRequest(this);
        } 

    } 

}
