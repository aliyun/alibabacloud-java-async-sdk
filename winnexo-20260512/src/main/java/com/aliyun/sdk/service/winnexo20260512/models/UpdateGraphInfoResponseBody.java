// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link UpdateGraphInfoResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateGraphInfoResponseBody</p>
 */
public class UpdateGraphInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("businessProfile")
    private String businessProfile;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("graphName")
    private String graphName;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("updated")
    private Boolean updated;

    private UpdateGraphInfoResponseBody(Builder builder) {
        this.businessProfile = builder.businessProfile;
        this.code = builder.code;
        this.displayName = builder.displayName;
        this.graphName = builder.graphName;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.updated = builder.updated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGraphInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessProfile
     */
    public String getBusinessProfile() {
        return this.businessProfile;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return graphName
     */
    public String getGraphName() {
        return this.graphName;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return updated
     */
    public Boolean getUpdated() {
        return this.updated;
    }

    public static final class Builder {
        private String businessProfile; 
        private String code; 
        private String displayName; 
        private String graphName; 
        private String message; 
        private String requestId; 
        private Boolean updated; 

        private Builder() {
        } 

        private Builder(UpdateGraphInfoResponseBody model) {
            this.businessProfile = model.businessProfile;
            this.code = model.code;
            this.displayName = model.displayName;
            this.graphName = model.graphName;
            this.message = model.message;
            this.requestId = model.requestId;
            this.updated = model.updated;
        } 

        /**
         * <p>The business description of the knowledge graph. If not configured, the value is an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>Customer domain knowledge graph</p>
         */
        public Builder businessProfile(String businessProfile) {
            this.businessProfile = businessProfile;
            return this;
        }

        /**
         * <p>SUCCESS indicates success. In failure cases, the corresponding error type is returned, such as ERR_BAD_REQUEST, ERR_VALIDATION_FAILED, or ERR_INTERNAL_SERVER_ERROR.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The display name of the knowledge graph.</p>
         * 
         * <strong>example:</strong>
         * <p>CRM Graph</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The name of the knowledge graph.</p>
         * 
         * <strong>example:</strong>
         * <p>crm_graph</p>
         */
        public Builder graphName(String graphName) {
            this.graphName = graphName;
            return this;
        }

        /**
         * <p>The description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The updated items.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder updated(Boolean updated) {
            this.updated = updated;
            return this;
        }

        public UpdateGraphInfoResponseBody build() {
            return new UpdateGraphInfoResponseBody(this);
        } 

    } 

}
