// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPlaybookInstanceStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyPlaybookInstanceStatusRequest</p>
 */
public class ModifyPlaybookInstanceStatusRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Active")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer active;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String playbookUuid;

    private ModifyPlaybookInstanceStatusRequest(Builder builder) {
        super(builder);
        this.active = builder.active;
        this.lang = builder.lang;
        this.playbookUuid = builder.playbookUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPlaybookInstanceStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return active
     */
    public Integer getActive() {
        return this.active;
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

    public static final class Builder extends Request.Builder<ModifyPlaybookInstanceStatusRequest, Builder> {
        private Integer active; 
        private String lang; 
        private String playbookUuid; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPlaybookInstanceStatusRequest request) {
            super(request);
            this.active = request.active;
            this.lang = request.lang;
            this.playbookUuid = request.playbookUuid;
        } 

        /**
         * The playbook status. Valid values:
         * <p>
         * 
         * *   **1**: starts the playbook.
         * *   **0**: stops the playbook.
         */
        public Builder active(Integer active) {
            this.putBodyParameter("Active", active);
            this.active = active;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The playbook UUID.
         * <p>
         * 
         * >  You can call the [DescribePlaybooks](~~DescribePlaybooks~~) operation to query the playbook UUID.
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        @Override
        public ModifyPlaybookInstanceStatusRequest build() {
            return new ModifyPlaybookInstanceStatusRequest(this);
        } 

    } 

}
