// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePlaybookRequest} extends {@link RequestModel}
 *
 * <p>CreatePlaybookRequest</p>
 */
public class CreatePlaybookRequest extends Request {
    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("DisplayName")
    @Validation(required = true)
    private String displayName;

    @Body
    @NameInMap("Lang")
    private String lang;

    private CreatePlaybookRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePlaybookRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<CreatePlaybookRequest, Builder> {
        private String description; 
        private String displayName; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(CreatePlaybookRequest request) {
            super(request);
            this.description = request.description;
            this.displayName = request.displayName;
            this.lang = request.lang;
        } 

        /**
         * The description of the playbook.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the playbook.
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * The language of the content within the response. Valid values:
         * <p>
         * 
         * *   **zh** (default): Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public CreatePlaybookRequest build() {
            return new CreatePlaybookRequest(this);
        } 

    } 

}
