// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link NormalRpcHttpApiRequest} extends {@link RequestModel}
 *
 * <p>NormalRpcHttpApiRequest</p>
 */
public class NormalRpcHttpApiRequest extends Request {

    private NormalRpcHttpApiRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NormalRpcHttpApiRequest create() {
        return builder().build();
    }

    public static final class Builder extends Request.Builder<Builder> {

        public NormalRpcHttpApiRequest build() {
            return new NormalRpcHttpApiRequest(this);
        } 

    } 

}
