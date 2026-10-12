// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

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
 * {@link ExportConversationDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ExportConversationDetailsResponseBody</p>
 */
public class ExportConversationDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExportTaskId")
    private String exportTaskId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ExportConversationDetailsResponseBody(Builder builder) {
        this.exportTaskId = builder.exportTaskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportConversationDetailsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exportTaskId
     */
    public String getExportTaskId() {
        return this.exportTaskId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String exportTaskId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ExportConversationDetailsResponseBody model) {
            this.exportTaskId = model.exportTaskId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the asynchronous export task.</p>
         * 
         * <strong>example:</strong>
         * <p>6203fc87271a420c98eab6c2bbc2d856</p>
         */
        public Builder exportTaskId(String exportTaskId) {
            this.exportTaskId = exportTaskId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75BAAB9B-40B2-5FF5-A59A-7BCF8154C6EE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExportConversationDetailsResponseBody build() {
            return new ExportConversationDetailsResponseBody(this);
        } 

    } 

}
