// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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
 * {@link GetJobRecordDurationRequest} extends {@link RequestModel}
 *
 * <p>GetJobRecordDurationRequest</p>
 */
public class GetJobRecordDurationRequest extends Request {
    private GetJobRecordDurationRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobRecordDurationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetJobRecordDurationRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetJobRecordDurationRequest request) {
            super(request);
        } 

        @Override
        public GetJobRecordDurationRequest build() {
            return new GetJobRecordDurationRequest(this);
        } 

    } 

}
