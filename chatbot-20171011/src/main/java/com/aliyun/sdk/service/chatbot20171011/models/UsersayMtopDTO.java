// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UsersayMtopDTO} extends {@link TeaModel}
 *
 * <p>UsersayMtopDTO</p>
 */
public class UsersayMtopDTO extends TeaModel {
    @NameInMap("Data")
    private java.util.List < SectionMtopDTO > data;

    @NameInMap("Id")
    private String id;

    @NameInMap("Strict")
    private Boolean strict;

    private UsersayMtopDTO(Builder builder) {
        this.data = builder.data;
        this.id = builder.id;
        this.strict = builder.strict;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UsersayMtopDTO create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < SectionMtopDTO > getData() {
        return this.data;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return strict
     */
    public Boolean getStrict() {
        return this.strict;
    }

    public static final class Builder {
        private java.util.List < SectionMtopDTO > data; 
        private String id; 
        private Boolean strict; 

        /**
         * Data
         */
        public Builder data(java.util.List < SectionMtopDTO > data) {
            this.data = data;
            return this;
        }

        /**
         * Id
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Strict
         */
        public Builder strict(Boolean strict) {
            this.strict = strict;
            return this;
        }

        public UsersayMtopDTO build() {
            return new UsersayMtopDTO(this);
        } 

    } 

}
