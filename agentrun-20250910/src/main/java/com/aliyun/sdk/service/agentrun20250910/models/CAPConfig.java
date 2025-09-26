// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link CAPConfig} extends {@link TeaModel}
 *
 * <p>CAPConfig</p>
 */
public class CAPConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("functionName")
    private String functionName;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("templateId")
    private Integer templateId;

    private CAPConfig(Builder builder) {
        this.functionName = builder.functionName;
        this.name = builder.name;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CAPConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return templateId
     */
    public Integer getTemplateId() {
        return this.templateId;
    }

    public static final class Builder {
        private String functionName; 
        private String name; 
        private Integer templateId; 

        private Builder() {
        } 

        private Builder(CAPConfig model) {
            this.functionName = model.functionName;
            this.name = model.name;
            this.templateId = model.templateId;
        } 

        /**
         * functionName.
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * templateId.
         */
        public Builder templateId(Integer templateId) {
            this.templateId = templateId;
            return this;
        }

        public CAPConfig build() {
            return new CAPConfig(this);
        } 

    } 

}
