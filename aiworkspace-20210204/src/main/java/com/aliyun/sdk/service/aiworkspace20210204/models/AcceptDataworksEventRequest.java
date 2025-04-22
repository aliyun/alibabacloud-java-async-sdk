// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link AcceptDataworksEventRequest} extends {@link RequestModel}
 *
 * <p>AcceptDataworksEventRequest</p>
 */
public class AcceptDataworksEventRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.Map<String, ?> data;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    private AcceptDataworksEventRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.messageId = builder.messageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AcceptDataworksEventRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    public static final class Builder extends Request.Builder<AcceptDataworksEventRequest, Builder> {
        private java.util.Map<String, ?> data; 
        private String messageId; 

        private Builder() {
            super();
        } 

        private Builder(AcceptDataworksEventRequest request) {
            super(request);
            this.data = request.data;
            this.messageId = request.messageId;
        } 

        /**
         * <p>The event content in the message.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;eventCode&quot;:&quot;d<em><em><strong>ct&quot;,&quot;projectId&quot;:&quot;8</strong></em>6&quot;,&quot;tenantId&quot;:4</em>*<em><strong><strong>8,&quot;operator&quot;:&quot;115</strong></strong></em>901&quot;}</p>
         */
        public Builder data(java.util.Map<String, ?> data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * <p>The message ID. You can obtain the ID from the message received when an extension point event is triggered. For more information about the message format, see <a href="https://help.aliyun.com/document_detail/436911.html">Message formats</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>539306ba-*****-41a0-****-6dc81060985c</p>
         */
        public Builder messageId(String messageId) {
            this.putBodyParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        @Override
        public AcceptDataworksEventRequest build() {
            return new AcceptDataworksEventRequest(this);
        } 

    } 

}
