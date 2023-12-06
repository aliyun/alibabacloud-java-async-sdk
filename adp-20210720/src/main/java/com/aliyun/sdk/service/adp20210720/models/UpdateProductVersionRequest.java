// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProductVersionRequest} extends {@link RequestModel}
 *
 * <p>UpdateProductVersionRequest</p>
 */
public class UpdateProductVersionRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Query
    @NameInMap("action")
    private String action;

    @Body
    @NameInMap("continuousIntegration")
    private Boolean continuousIntegration;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("entry")
    private String entry;

    @Body
    @NameInMap("timeout")
    private Long timeout;

    @Body
    @NameInMap("version")
    private String version;

    private UpdateProductVersionRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.action = builder.action;
        this.continuousIntegration = builder.continuousIntegration;
        this.description = builder.description;
        this.entry = builder.entry;
        this.timeout = builder.timeout;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProductVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return continuousIntegration
     */
    public Boolean getContinuousIntegration() {
        return this.continuousIntegration;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return entry
     */
    public String getEntry() {
        return this.entry;
    }

    /**
     * @return timeout
     */
    public Long getTimeout() {
        return this.timeout;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<UpdateProductVersionRequest, Builder> {
        private String uid; 
        private String action; 
        private Boolean continuousIntegration; 
        private String description; 
        private String entry; 
        private Long timeout; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProductVersionRequest request) {
            super(request);
            this.uid = request.uid;
            this.action = request.action;
            this.continuousIntegration = request.continuousIntegration;
            this.description = request.description;
            this.entry = request.entry;
            this.timeout = request.timeout;
            this.version = request.version;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * action.
         */
        public Builder action(String action) {
            this.putQueryParameter("action", action);
            this.action = action;
            return this;
        }

        /**
         * continuousIntegration.
         */
        public Builder continuousIntegration(Boolean continuousIntegration) {
            this.putBodyParameter("continuousIntegration", continuousIntegration);
            this.continuousIntegration = continuousIntegration;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * entry.
         */
        public Builder entry(String entry) {
            this.putBodyParameter("entry", entry);
            this.entry = entry;
            return this;
        }

        /**
         * timeout.
         */
        public Builder timeout(Long timeout) {
            this.putBodyParameter("timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public UpdateProductVersionRequest build() {
            return new UpdateProductVersionRequest(this);
        } 

    } 

}
