// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DebugPlaybookRequest} extends {@link RequestModel}
 *
 * <p>DebugPlaybookRequest</p>
 */
public class DebugPlaybookRequest extends Request {
    @Body
    @NameInMap("Lang")
    private String lang;

    @Body
    @NameInMap("PlaybookUuid")
    @Validation(required = true)
    private String playbookUuid;

    @Body
    @NameInMap("Record")
    private String record;

    @Body
    @NameInMap("Taskflow")
    @Validation(required = true)
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
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PlaybookUuid.
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        /**
         * Record.
         */
        public Builder record(String record) {
            this.putBodyParameter("Record", record);
            this.record = record;
            return this;
        }

        /**
         * Taskflow.
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
