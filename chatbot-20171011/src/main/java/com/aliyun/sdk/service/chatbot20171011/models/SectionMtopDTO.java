// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SectionMtopDTO} extends {@link TeaModel}
 *
 * <p>SectionMtopDTO</p>
 */
public class SectionMtopDTO extends TeaModel {
    @NameInMap("SlotId")
    private String slotId;

    @NameInMap("Text")
    private String text;

    private SectionMtopDTO(Builder builder) {
        this.slotId = builder.slotId;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SectionMtopDTO create() {
        return builder().build();
    }

    /**
     * @return slotId
     */
    public String getSlotId() {
        return this.slotId;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder {
        private String slotId; 
        private String text; 

        /**
         * SlotId.
         */
        public Builder slotId(String slotId) {
            this.slotId = slotId;
            return this;
        }

        /**
         * Text.
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public SectionMtopDTO build() {
            return new SectionMtopDTO(this);
        } 

    } 

}
