// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClientAlertModeRequest} extends {@link RequestModel}
 *
 * <p>ListClientAlertModeRequest</p>
 */
public class ListClientAlertModeRequest extends Request {
    @Query
    @NameInMap("Mode")
    private String mode;

    private ListClientAlertModeRequest(Builder builder) {
        super(builder);
        this.mode = builder.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClientAlertModeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    public static final class Builder extends Request.Builder<ListClientAlertModeRequest, Builder> {
        private String mode; 

        private Builder() {
            super();
        } 

        private Builder(ListClientAlertModeRequest request) {
            super(request);
            this.mode = request.mode;
        } 

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        @Override
        public ListClientAlertModeRequest build() {
            return new ListClientAlertModeRequest(this);
        } 

    } 

}
