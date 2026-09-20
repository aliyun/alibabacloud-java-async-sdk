// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link DataI18nValue} extends {@link TeaModel}
 *
 * <p>DataI18nValue</p>
 */
public class DataI18nValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("readme")
    private String readme;

    private DataI18nValue(Builder builder) {
        this.description = builder.description;
        this.name = builder.name;
        this.readme = builder.readme;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataI18nValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return readme
     */
    public String getReadme() {
        return this.readme;
    }

    public static final class Builder {
        private String description; 
        private String name; 
        private String readme; 

        private Builder() {
        } 

        private Builder(DataI18nValue model) {
            this.description = model.description;
            this.name = model.name;
            this.readme = model.readme;
        } 

        /**
         * <p>The MCP service description in the corresponding language.</p>
         * 
         * <strong>example:</strong>
         * <p>An MCP service for querying knowledge bases</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The MCP marketplace template name in the corresponding language.</p>
         * 
         * <strong>example:</strong>
         * <p>Knowledge Base</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The MCP marketplace template usage instructions in the corresponding language.</p>
         * 
         * <strong>example:</strong>
         * <h1>Knowledge Base\nKnowledge base query service</h1>
         */
        public Builder readme(String readme) {
            this.readme = readme;
            return this;
        }

        public DataI18nValue build() {
            return new DataI18nValue(this);
        } 

    } 

}
