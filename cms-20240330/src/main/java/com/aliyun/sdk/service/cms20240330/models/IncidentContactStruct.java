// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link IncidentContactStruct} extends {@link TeaModel}
 *
 * <p>IncidentContactStruct</p>
 */
public class IncidentContactStruct extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("channel")
    private java.util.List<String> channel;

    @com.aliyun.core.annotation.NameInMap("contactId")
    private String contactId;

    @com.aliyun.core.annotation.NameInMap("contactType")
    private String contactType;

    private IncidentContactStruct(Builder builder) {
        this.channel = builder.channel;
        this.contactId = builder.contactId;
        this.contactType = builder.contactType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncidentContactStruct create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channel
     */
    public java.util.List<String> getChannel() {
        return this.channel;
    }

    /**
     * @return contactId
     */
    public String getContactId() {
        return this.contactId;
    }

    /**
     * @return contactType
     */
    public String getContactType() {
        return this.contactType;
    }

    public static final class Builder {
        private java.util.List<String> channel; 
        private String contactId; 
        private String contactType; 

        private Builder() {
        } 

        private Builder(IncidentContactStruct model) {
            this.channel = model.channel;
            this.contactId = model.contactId;
            this.contactType = model.contactType;
        } 

        /**
         * channel.
         */
        public Builder channel(java.util.List<String> channel) {
            this.channel = channel;
            return this;
        }

        /**
         * contactId.
         */
        public Builder contactId(String contactId) {
            this.contactId = contactId;
            return this;
        }

        /**
         * contactType.
         */
        public Builder contactType(String contactType) {
            this.contactType = contactType;
            return this;
        }

        public IncidentContactStruct build() {
            return new IncidentContactStruct(this);
        } 

    } 

}
