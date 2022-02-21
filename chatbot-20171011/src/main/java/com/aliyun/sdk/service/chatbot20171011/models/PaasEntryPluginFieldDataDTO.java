// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PaasEntryPluginFieldDataDTO} extends {@link TeaModel}
 *
 * <p>PaasEntryPluginFieldDataDTO</p>
 */
public class PaasEntryPluginFieldDataDTO extends TeaModel {
    @NameInMap("ContentEntry")
    private java.util.List < PaasConditionSetDTO > contentEntry;

    @NameInMap("LifeSpan")
    private Long lifeSpan;

    @NameInMap("Name")
    private String name;

    private PaasEntryPluginFieldDataDTO(Builder builder) {
        this.contentEntry = builder.contentEntry;
        this.lifeSpan = builder.lifeSpan;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaasEntryPluginFieldDataDTO create() {
        return builder().build();
    }

    /**
     * @return contentEntry
     */
    public java.util.List < PaasConditionSetDTO > getContentEntry() {
        return this.contentEntry;
    }

    /**
     * @return lifeSpan
     */
    public Long getLifeSpan() {
        return this.lifeSpan;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private java.util.List < PaasConditionSetDTO > contentEntry; 
        private Long lifeSpan; 
        private String name; 

        /**
         * ContentEntry
         */
        public Builder contentEntry(java.util.List < PaasConditionSetDTO > contentEntry) {
            this.contentEntry = contentEntry;
            return this;
        }

        /**
         * LifeSpan
         */
        public Builder lifeSpan(Long lifeSpan) {
            this.lifeSpan = lifeSpan;
            return this;
        }

        /**
         * Name
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public PaasEntryPluginFieldDataDTO build() {
            return new PaasEntryPluginFieldDataDTO(this);
        } 

    } 

}
