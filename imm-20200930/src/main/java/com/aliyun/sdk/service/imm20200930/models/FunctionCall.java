// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link FunctionCall} extends {@link TeaModel}
 *
 * <p>FunctionCall</p>
 */
public class FunctionCall extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Arguments")
    private String arguments;

    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private FunctionCall(Builder builder) {
        this.arguments = builder.arguments;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FunctionCall create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arguments
     */
    public String getArguments() {
        return this.arguments;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String arguments; 
        private String name; 

        private Builder() {
        } 

        private Builder(FunctionCall model) {
            this.arguments = model.arguments;
            this.name = model.name;
        } 

        /**
         * <p>The parameters detected by the large language model.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *                     &quot;type&quot;: &quot;object&quot;,
         *                         &quot;name&quot;: {
         *                             &quot;type&quot;: &quot;string&quot;, 
         *                             &quot;description&quot;: &quot;需要检索的文件的文件名。可以为空 null&quot;
         *                         }, 
         *                     &quot;required&quot;: [
         *                         &quot;category&quot;
         *                     ]
         * }</p>
         */
        public Builder arguments(String arguments) {
            this.arguments = arguments;
            return this;
        }

        /**
         * <p>The function name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>search_file</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public FunctionCall build() {
            return new FunctionCall(this);
        } 

    } 

}
