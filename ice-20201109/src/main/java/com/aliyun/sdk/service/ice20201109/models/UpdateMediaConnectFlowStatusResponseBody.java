// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link UpdateMediaConnectFlowStatusResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateMediaConnectFlowStatusResponseBody</p>
 */
public class UpdateMediaConnectFlowStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RetCode")
    private Integer retCode;

    private UpdateMediaConnectFlowStatusResponseBody(Builder builder) {
        this.content = builder.content;
        this.description = builder.description;
        this.requestId = builder.requestId;
        this.retCode = builder.retCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMediaConnectFlowStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retCode
     */
    public Integer getRetCode() {
        return this.retCode;
    }

    public static final class Builder {
        private String content; 
        private String description; 
        private String requestId; 
        private Integer retCode; 

        private Builder() {
        } 

        private Builder(UpdateMediaConnectFlowStatusResponseBody model) {
            this.content = model.content;
            this.description = model.description;
            this.requestId = model.requestId;
            this.retCode = model.retCode;
        } 

        /**
         * <p>The response body.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The call description.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>20B3A1B6-4BD2-5DE6-BCBC-098C9B4F4E91</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned error code. A value of 0 indicates that the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder retCode(Integer retCode) {
            this.retCode = retCode;
            return this;
        }

        public UpdateMediaConnectFlowStatusResponseBody build() {
            return new UpdateMediaConnectFlowStatusResponseBody(this);
        } 

    } 

}
