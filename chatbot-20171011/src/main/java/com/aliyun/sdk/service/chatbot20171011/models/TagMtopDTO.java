// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TagMtopDTO} extends {@link TeaModel}
 *
 * <p>TagMtopDTO</p>
 */
public class TagMtopDTO extends TeaModel {
    @NameInMap("UserSayId")
    private String userSayId;

    @NameInMap("Value")
    private String value;

    private TagMtopDTO(Builder builder) {
        this.userSayId = builder.userSayId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TagMtopDTO create() {
        return builder().build();
    }

    /**
     * @return userSayId
     */
    public String getUserSayId() {
        return this.userSayId;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String userSayId; 
        private String value; 

        /**
         * UserSayId
         */
        public Builder userSayId(String userSayId) {
            this.userSayId = userSayId;
            return this;
        }

        /**
         * Value
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public TagMtopDTO build() {
            return new TagMtopDTO(this);
        } 

    } 

}
