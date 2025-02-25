// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDistinctReleasesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDistinctReleasesRequest</p>
 */
public class DescribeDistinctReleasesRequest extends Request {
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

    private DescribeDistinctReleasesRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.playbookUuid = builder.playbookUuid;
        this.taskflowMd5 = builder.taskflowMd5;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDistinctReleasesRequest create() {
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
     * @return taskflowMd5
     */
    public String getTaskflowMd5() {
        return this.taskflowMd5;
    }

    public static final class Builder extends Request.Builder<DescribeDistinctReleasesRequest, Builder> {
        private String lang; 
        private String playbookUuid; 
        private String taskflowMd5; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDistinctReleasesRequest request) {
            super(request);
            this.lang = request.lang;
            this.playbookUuid = request.playbookUuid;
            this.taskflowMd5 = request.taskflowMd5;
        } 

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese (default)</li>
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
         * <p>The playbook UUID.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a>operation to query the playbook UUID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bc0b8424-535c-4ed5-bd94-xxxxxx</p>
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putQueryParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        /**
         * <p>The MD5 value of the playbook XML configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>be0a4ef084dd174abe47xxxxx</p>
         */
        public Builder taskflowMd5(String taskflowMd5) {
            this.putQueryParameter("TaskflowMd5", taskflowMd5);
            this.taskflowMd5 = taskflowMd5;
            return this;
        }

        @Override
        public DescribeDistinctReleasesRequest build() {
            return new DescribeDistinctReleasesRequest(this);
        } 

    } 

}
