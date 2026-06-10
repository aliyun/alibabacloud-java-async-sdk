// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link GetSkillHubConfigRequest} extends {@link RequestModel}
 *
 * <p>GetSkillHubConfigRequest</p>
 */
public class GetSkillHubConfigRequest extends Request {
    private GetSkillHubConfigRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSkillHubConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetSkillHubConfigRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetSkillHubConfigRequest request) {
            super(request);
        } 

        @Override
        public GetSkillHubConfigRequest build() {
            return new GetSkillHubConfigRequest(this);
        } 

    } 

}
