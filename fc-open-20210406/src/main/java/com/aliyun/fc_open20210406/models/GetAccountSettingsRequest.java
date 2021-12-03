// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetAccountSettingsRequest} extends {@link RequestModel}
 *
 * <p>GetAccountSettingsRequest</p>
 */
public class GetAccountSettingsRequest extends Request {

    private GetAccountSettingsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountSettingsRequest create() {
        return builder().build();
    }

    public static final class Builder extends Request.Builder {

        public GetAccountSettingsRequest build() {
            return new GetAccountSettingsRequest(this);
        } 

    } 

}
