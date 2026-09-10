// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link GenerateModuleResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateModuleResponseBody</p>
 */
public class GenerateModuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("module")
    private String module;

    @com.aliyun.core.annotation.NameInMap("properties")
    private java.util.Map<String, ?> properties;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GenerateModuleResponseBody(Builder builder) {
        this.module = builder.module;
        this.properties = builder.properties;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateModuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return module
     */
    public String getModule() {
        return this.module;
    }

    /**
     * @return properties
     */
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String module; 
        private java.util.Map<String, ?> properties; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GenerateModuleResponseBody model) {
            this.module = model.module;
            this.properties = model.properties;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The generated Terraform HCL template code content.</p>
         * 
         * <strong>example:</strong>
         * <p>terraform {
         *   required_providers {
         *     alicloud = {
         *       source   = &quot;aliyun/alicloud&quot;
         *       version  = &quot;1.260.0&quot;
         *     }
         *   }
         * }</p>
         * <p>resource &quot;alicloud_vpc&quot; &quot;default&quot; {
         *  vpc_name = &quot;vpc-test&quot;
         * }</p>
         */
        public Builder module(String module) {
            this.module = module;
            return this;
        }

        /**
         * <p>The variables and resource properties in the generated template code.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;vpc_name&quot;:&quot;vpc-test&quot;}</p>
         */
        public Builder properties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6B40D088-E929-504B-8802-C1759A993FA2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateModuleResponseBody build() {
            return new GenerateModuleResponseBody(this);
        } 

    } 

}
