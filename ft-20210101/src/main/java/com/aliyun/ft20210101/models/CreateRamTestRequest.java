// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateRamTestRequest} extends {@link RequestModel}
 *
 * <p>CreateRamTestRequest</p>
 */
public class CreateRamTestRequest extends Request {

    private CreateRamTestRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRamTestRequest create() {
        return builder().build();
    }

    public static final class Builder extends Request.Builder<Builder> {

        public CreateRamTestRequest build() {
            return new CreateRamTestRequest(this);
        } 

    } 

}
