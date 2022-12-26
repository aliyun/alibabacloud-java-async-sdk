// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlarmMachineCountRequest} extends {@link RequestModel}
 *
 * <p>GetAlarmMachineCountRequest</p>
 */
public class GetAlarmMachineCountRequest extends Request {
    @Query
    @NameInMap("From")
    private String from;

    private GetAlarmMachineCountRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlarmMachineCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    public static final class Builder extends Request.Builder<GetAlarmMachineCountRequest, Builder> {
        private String from; 

        private Builder() {
            super();
        } 

        private Builder(GetAlarmMachineCountRequest request) {
            super(request);
            this.from = request.from;
        } 

        /**
         * From.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        @Override
        public GetAlarmMachineCountRequest build() {
            return new GetAlarmMachineCountRequest(this);
        } 

    } 

}
