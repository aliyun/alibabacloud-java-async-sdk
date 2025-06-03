// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331.models;

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
 * {@link DescribeMigrationJobConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeMigrationJobConfigRequest</p>
 */
public class DescribeMigrationJobConfigRequest extends Request {
    private DescribeMigrationJobConfigRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMigrationJobConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeMigrationJobConfigRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeMigrationJobConfigRequest request) {
            super(request);
        } 

        @Override
        public DescribeMigrationJobConfigRequest build() {
            return new DescribeMigrationJobConfigRequest(this);
        } 

    } 

}
