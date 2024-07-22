// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * ExportTaskId.
         */
        public Builder exportTaskId(String exportTaskId) {
            this.exportTaskId = exportTaskId;
            return this;
        }

        /**
         * RequestId.
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
