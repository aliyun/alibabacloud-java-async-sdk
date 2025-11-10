// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openapiexplorer20241130.models;

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
 * {@link GenerateCLICommandResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateCLICommandResponseBody</p>
 */
public class GenerateCLICommandResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cli")
    private String cli;

    private GenerateCLICommandResponseBody(Builder builder) {
        this.cli = builder.cli;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateCLICommandResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cli
     */
    public String getCli() {
        return this.cli;
    }

    public static final class Builder {
        private String cli; 

        private Builder() {
        } 

        private Builder(GenerateCLICommandResponseBody model) {
            this.cli = model.cli;
        } 

        /**
         * cli.
         */
        public Builder cli(String cli) {
            this.cli = cli;
            return this;
        }

        public GenerateCLICommandResponseBody build() {
            return new GenerateCLICommandResponseBody(this);
        } 

    } 

}
