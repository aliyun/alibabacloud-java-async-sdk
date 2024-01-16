// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPlaybookRequest} extends {@link RequestModel}
 *
 * <p>ModifyPlaybookRequest</p>
 */
public class ModifyPlaybookRequest extends Request {
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

    @Body
    @NameInMap("PlaybookUuid")
    @Validation(required = true)
    private String playbookUuid;

    @Body
    @NameInMap("Taskflow")
    private String taskflow;

    private ModifyPlaybookRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.lang = builder.lang;
        this.playbookUuid = builder.playbookUuid;
        this.taskflow = builder.taskflow;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPlaybookRequest create() {
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

    /**
     * @return playbookUuid
     */
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    /**
     * @return taskflow
     */
    public String getTaskflow() {
        return this.taskflow;
    }

    public static final class Builder extends Request.Builder<ModifyPlaybookRequest, Builder> {
        private String description; 
        private String displayName; 
        private String lang; 
        private String playbookUuid; 
        private String taskflow; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPlaybookRequest request) {
            super(request);
            this.description = request.description;
            this.displayName = request.displayName;
            this.lang = request.lang;
            this.playbookUuid = request.playbookUuid;
            this.taskflow = request.taskflow;
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
         * The display name of the playbook.
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
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

        /**
         * The UUID of the playbook.
         * <p>
         * 
         * >  You can call the [DescribePlaybooks](~~DescribePlaybooks~~)operation to query the UUIDs of playbooks.
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        /**
         * The XML configuration of the playbook.
         */
        public Builder taskflow(String taskflow) {
            this.putBodyParameter("Taskflow", taskflow);
            this.taskflow = taskflow;
            return this;
        }

        @Override
        public ModifyPlaybookRequest build() {
            return new ModifyPlaybookRequest(this);
        } 

    } 

}
