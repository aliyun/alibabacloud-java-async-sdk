// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AIAssistantChatTool} extends {@link TeaModel}
 *
 * <p>AIAssistantChatTool</p>
 */
public class AIAssistantChatTool extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private AIAssistantChatTool(Builder builder) {
        this.description = builder.description;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AIAssistantChatTool create() {
        return builder().build();
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

    public static final class Builder {
        private String description; 
        private String name; 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public AIAssistantChatTool build() {
            return new AIAssistantChatTool(this);
        } 

    } 

}
