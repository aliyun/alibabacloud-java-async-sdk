// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link CorpAuthLinkInfoQueryRequest} extends {@link RequestModel}
 *
 * <p>CorpAuthLinkInfoQueryRequest</p>
 */
public class CorpAuthLinkInfoQueryRequest extends Request {
    private CorpAuthLinkInfoQueryRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CorpAuthLinkInfoQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<CorpAuthLinkInfoQueryRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(CorpAuthLinkInfoQueryRequest request) {
            super(request);
        } 

        @Override
        public CorpAuthLinkInfoQueryRequest build() {
            return new CorpAuthLinkInfoQueryRequest(this);
        } 

    } 

}
