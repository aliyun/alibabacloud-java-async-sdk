// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link ResourceInfo} extends {@link TeaModel}
 *
 * <p>ResourceInfo</p>
 */
public class ResourceInfo extends TeaModel {
    private ResourceInfo(Builder builder) {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder {

        private Builder() {
        } 

        private Builder(ResourceInfo model) {
        } 

        public ResourceInfo build() {
            return new ResourceInfo(this);
        } 

    } 

}
