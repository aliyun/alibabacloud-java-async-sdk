// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DebugPlaybookRequest} extends {@link RequestModel}
 *
 * <p>DebugPlaybookRequest</p>
 */
public class DebugPlaybookRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String playbookUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Record")
    private String record;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Taskflow")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskflow;

    private DebugPlaybookRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.playbookUuid = builder.playbookUuid;
        this.record = builder.record;
        this.taskflow = builder.taskflow;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DebugPlaybookRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return record
     */
    public String getRecord() {
        return this.record;
    }

    /**
     * @return taskflow
     */
    public String getTaskflow() {
        return this.taskflow;
    }

    public static final class Builder extends Request.Builder<DebugPlaybookRequest, Builder> {
        private String lang; 
        private String playbookUuid; 
        private String record; 
        private String taskflow; 

        private Builder() {
            super();
        } 

        private Builder(DebugPlaybookRequest request) {
            super(request);
            this.lang = request.lang;
            this.playbookUuid = request.playbookUuid;
            this.record = request.record;
            this.taskflow = request.taskflow;
        } 

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The playbook UUID.
         * <p>
         * 
         * >  You can call the [DescribePlaybooks](~~DescribePlaybooks~~)operation to query the playbook UUID.
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        /**
         * The input parameters that you use to debug the playbook. You can define the parameters based on your business requirements.
         */
        public Builder record(String record) {
            this.putBodyParameter("Record", record);
            this.record = record;
            return this;
        }

        /**
         * The XML configuration of the playbook.
         * <p>
         * 
         * >  You can call the [DescribePlaybook](~~DescribePlaybook~~) operation to query the XML configuration of the playbook.
         */
        public Builder taskflow(String taskflow) {
            this.putBodyParameter("Taskflow", taskflow);
            this.taskflow = taskflow;
            return this;
        }

        @Override
        public DebugPlaybookRequest build() {
            return new DebugPlaybookRequest(this);
        } 

    } 

}
