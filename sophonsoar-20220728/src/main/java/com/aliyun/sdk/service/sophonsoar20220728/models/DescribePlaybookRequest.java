// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePlaybookRequest} extends {@link RequestModel}
 *
 * <p>DescribePlaybookRequest</p>
 */
public class DescribePlaybookRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DebugFlag")
    private Integer debugFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String playbookUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskflowMd5")
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
         * <p>The flag that indicates whether the playbook is of the debugging or published version. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: playbook of the debugging version</li>
         * <li><strong>0</strong>: playbook of the published version</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder debugFlag(Integer debugFlag) {
            this.putQueryParameter("DebugFlag", debugFlag);
            this.debugFlag = debugFlag;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The UUID of the playbook.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a>operation to query the UUIDs of playbooks.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9030076b-6733-4842-b05a-xxxxx</p>
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putQueryParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        /**
         * <p>The MD5 hash value of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>7a8f608dc64c242632aa578xxxxx</p>
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
