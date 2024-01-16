// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchModifyInstanceStatusRequest} extends {@link RequestModel}
 *
 * <p>BatchModifyInstanceStatusRequest</p>
 */
public class BatchModifyInstanceStatusRequest extends Request {
    @Body
    @NameInMap("Active")
    @Validation(required = true)
    private Integer active;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Body
    @NameInMap("PlaybookUuid")
    @Validation(required = true)
    private String playbookUuid;

    private BatchModifyInstanceStatusRequest(Builder builder) {
        super(builder);
        this.active = builder.active;
        this.lang = builder.lang;
        this.playbookUuid = builder.playbookUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchModifyInstanceStatusRequest create() {
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

    public static final class Builder extends Request.Builder<BatchModifyInstanceStatusRequest, Builder> {
        private Integer active; 
        private String lang; 
        private String playbookUuid; 

        private Builder() {
            super();
        } 

        private Builder(BatchModifyInstanceStatusRequest request) {
            super(request);
            this.active = request.active;
            this.lang = request.lang;
            this.playbookUuid = request.playbookUuid;
        } 

        /**
         * Specifies whether to start or stop the playbook.
         * <p>
         * 
         * *   **0**: stops the playbook.
         * *   **1**: starts the playbook.
         */
        public Builder active(Integer active) {
            this.putBodyParameter("Active", active);
            this.active = active;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The playbook UUID. If you want to specify multiple playbooks, separate the playbook UUIDs with commas (,).
         * <p>
         * 
         * >  You can call the [DescribePlaybooks](~~DescribePlaybooks~~)operation to query the playbook UUID.
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        @Override
        public BatchModifyInstanceStatusRequest build() {
            return new BatchModifyInstanceStatusRequest(this);
        } 

    } 

}
