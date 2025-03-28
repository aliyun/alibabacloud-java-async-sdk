// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link ProjectSpec} extends {@link TeaModel}
 *
 * <p>ProjectSpec</p>
 */
public class ProjectSpec extends TeaModel {
    private ProjectSpec(Builder builder) {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProjectSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder {

        private Builder() {
        } 

        private Builder(ProjectSpec model) {
        } 

        public ProjectSpec build() {
            return new ProjectSpec(this);
        } 

    } 

}
