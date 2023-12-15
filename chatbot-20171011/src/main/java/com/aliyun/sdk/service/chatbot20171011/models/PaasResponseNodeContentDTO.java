// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PaasResponseNodeContentDTO} extends {@link TeaModel}
 *
 * <p>PaasResponseNodeContentDTO</p>
 */
public class PaasResponseNodeContentDTO extends TeaModel {
    @NameInMap("ButtonList")
    private PaasButtonListDTO buttonList;

    @NameInMap("Image")
    private String image;

    @NameInMap("Text")
    private String text;

    @NameInMap("Type")
    private String type;

    private PaasResponseNodeContentDTO(Builder builder) {
        this.buttonList = builder.buttonList;
        this.image = builder.image;
        this.text = builder.text;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaasResponseNodeContentDTO create() {
        return builder().build();
    }

    /**
     * @return buttonList
     */
    public PaasButtonListDTO getButtonList() {
        return this.buttonList;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private PaasButtonListDTO buttonList; 
        private String image; 
        private String text; 
        private String type; 

        /**
         * ButtonList.
         */
        public Builder buttonList(PaasButtonListDTO buttonList) {
            this.buttonList = buttonList;
            return this;
        }

        /**
         * Image.
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * Text.
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public PaasResponseNodeContentDTO build() {
            return new PaasResponseNodeContentDTO(this);
        } 

    } 

}
