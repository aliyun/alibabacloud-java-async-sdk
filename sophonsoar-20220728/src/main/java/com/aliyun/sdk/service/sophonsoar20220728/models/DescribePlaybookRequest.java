// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlaybookRequest} extends {@link RequestModel}
 *
 * <p>DescribePlaybookRequest</p>
 */
public class DescribePlaybookRequest extends Request {
    @Query
    @NameInMap("DebugFlag")
    private Integer debugFlag;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PlaybookUuid")
    @Validation(required = true)
    private String playbookUuid;

    @Query
    @NameInMap("TaskflowMd5")
    private String taskflowMd5;

    private DescribePlaybookRequest(Builder builder) {
        super(builder);
        this.debugFlag = builder.debugFlag;
        this.lang = builder.lang;
        this.playbookUuid = builder.playbookUuid;
        this.taskflowMd5 = builder.taskflowMd5;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlaybookRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return debugFlag
     */
    public Integer getDebugFlag() {
        return this.debugFlag;
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
     * @return taskflowMd5
     */
    public String getTaskflowMd5() {
        return this.taskflowMd5;
    }

    public static final class Builder extends Request.Builder<DescribePlaybookRequest, Builder> {
        private Integer debugFlag; 
        private String lang; 
        private String playbookUuid; 
        private String taskflowMd5; 

        private Builder() {
            super();
        } 

        private Builder(DescribePlaybookRequest request) {
            super(request);
            this.debugFlag = request.debugFlag;
            this.lang = request.lang;
            this.playbookUuid = request.playbookUuid;
            this.taskflowMd5 = request.taskflowMd5;
        } 

        /**
         * The flag that indicates whether the playbook is of the debugging or published version. Valid values:
         * <p>
         * 
         * *   **1**: playbook of the debugging version
         * *   **0**: playbook of the published version
         */
        public Builder debugFlag(Integer debugFlag) {
            this.putQueryParameter("DebugFlag", debugFlag);
            this.debugFlag = debugFlag;
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
         * The UUID of the playbook.
         * <p>
         * 
         * >  You can call the [DescribePlaybooks](~~DescribePlaybooks~~)operation to query the UUIDs of playbooks.
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putQueryParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        /**
         * The MD5 hash value of the playbook.
         */
        public Builder taskflowMd5(String taskflowMd5) {
            this.putQueryParameter("TaskflowMd5", taskflowMd5);
            this.taskflowMd5 = taskflowMd5;
            return this;
        }

        @Override
        public DescribePlaybookRequest build() {
            return new DescribePlaybookRequest(this);
        } 

    } 

}
