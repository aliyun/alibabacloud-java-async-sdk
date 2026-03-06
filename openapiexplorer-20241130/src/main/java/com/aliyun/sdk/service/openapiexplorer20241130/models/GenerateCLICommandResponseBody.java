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

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GenerateCLICommandResponseBody(Builder builder) {
        this.cli = builder.cli;
        this.requestId = builder.requestId;
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String cli; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GenerateCLICommandResponseBody model) {
            this.cli = model.cli;
            this.requestId = model.requestId;
        } 

        /**
         * cli.
         */
        public Builder cli(String cli) {
            this.cli = cli;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateCLICommandResponseBody build() {
            return new GenerateCLICommandResponseBody(this);
        } 

    } 

}
