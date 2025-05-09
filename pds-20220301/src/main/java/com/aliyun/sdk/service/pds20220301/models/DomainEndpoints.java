// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link DomainEndpoints} extends {@link TeaModel}
 *
 * <p>DomainEndpoints</p>
 */
public class DomainEndpoints extends TeaModel {
    private DomainEndpoints(Builder builder) {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DomainEndpoints create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder {

        private Builder() {
        } 

        private Builder(DomainEndpoints model) {
        } 

        public DomainEndpoints build() {
            return new DomainEndpoints(this);
        } 

    } 

}
