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
 * {@link UpdateMediaConnectFlowOutputResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateMediaConnectFlowOutputResponseBody</p>
 */
public class UpdateMediaConnectFlowOutputResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RetCode")
    private Integer retCode;

    private UpdateMediaConnectFlowOutputResponseBody(Builder builder) {
        this.content = builder.content;
        this.description = builder.description;
        this.requestId = builder.requestId;
        this.retCode = builder.retCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMediaConnectFlowOutputResponseBody create() {
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

        private Builder(UpdateMediaConnectFlowOutputResponseBody model) {
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
         * <p>OK</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D737D0BC-4CB5-55AA-8119-B540C95DFE6A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned error code. A value of 0 indicates the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder retCode(Integer retCode) {
            this.retCode = retCode;
            return this;
        }

        public UpdateMediaConnectFlowOutputResponseBody build() {
            return new UpdateMediaConnectFlowOutputResponseBody(this);
        } 

    } 

}
