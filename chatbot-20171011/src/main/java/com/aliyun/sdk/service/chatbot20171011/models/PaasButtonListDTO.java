// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PaasButtonListDTO} extends {@link TeaModel}
 *
 * <p>PaasButtonListDTO</p>
 */
public class PaasButtonListDTO extends TeaModel {
    @NameInMap("Button")
    private java.util.List < PaasButtonDTO > button;

    @NameInMap("Intro")
    private String intro;

    private PaasButtonListDTO(Builder builder) {
        this.button = builder.button;
        this.intro = builder.intro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaasButtonListDTO create() {
        return builder().build();
    }

    /**
     * @return button
     */
    public java.util.List < PaasButtonDTO > getButton() {
        return this.button;
    }

    /**
     * @return intro
     */
    public String getIntro() {
        return this.intro;
    }

    public static final class Builder {
        private java.util.List < PaasButtonDTO > button; 
        private String intro; 

        /**
         * Button.
         */
        public Builder button(java.util.List < PaasButtonDTO > button) {
            this.button = button;
            return this;
        }

        /**
         * Intro.
         */
        public Builder intro(String intro) {
            this.intro = intro;
            return this;
        }

        public PaasButtonListDTO build() {
            return new PaasButtonListDTO(this);
        } 

    } 

}
