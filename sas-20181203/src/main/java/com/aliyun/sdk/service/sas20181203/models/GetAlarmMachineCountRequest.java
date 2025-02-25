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
 * {@link GetAlarmMachineCountRequest} extends {@link RequestModel}
 *
 * <p>GetAlarmMachineCountRequest</p>
 */
public class GetAlarmMachineCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
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
         * <p>The ID of the request source. Set the value to sas.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
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
