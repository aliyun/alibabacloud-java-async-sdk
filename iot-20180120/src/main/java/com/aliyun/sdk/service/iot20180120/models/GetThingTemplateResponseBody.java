// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link GetThingTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetThingTemplateResponseBody</p>
 */
public class GetThingTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("ThingModelJSON")
    private String thingModelJSON;

    private GetThingTemplateResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.thingModelJSON = builder.thingModelJSON;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetThingTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return thingModelJSON
     */
    public String getThingModelJSON() {
        return this.thingModelJSON;
    }

    public static final class Builder {
        private String code; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private String thingModelJSON; 

        private Builder() {
        } 

        private Builder(GetThingTemplateResponseBody model) {
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
            this.thingModelJSON = model.thingModelJSON;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The TSL features returned if the call is successful. Format:</p>
         * <pre><code>
         * {
         *   &quot;properties&quot;: [], //The list of properties
         *   &quot;services&quot;: [], //The list of services
         *   &quot;events&quot;: [], //The list of events
         * }
         *                                 
         * </code></pre>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/73727.html">TSL formats</a>.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * ThingModelJSON.
         */
        public Builder thingModelJSON(String thingModelJSON) {
            this.thingModelJSON = thingModelJSON;
            return this;
        }

        public GetThingTemplateResponseBody build() {
            return new GetThingTemplateResponseBody(this);
        } 

    } 

}
