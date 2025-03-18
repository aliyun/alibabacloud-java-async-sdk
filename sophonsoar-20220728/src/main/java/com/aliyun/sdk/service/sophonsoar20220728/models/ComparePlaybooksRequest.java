// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ComparePlaybooksRequest} extends {@link RequestModel}
 *
 * <p>ComparePlaybooksRequest</p>
 */
public class ComparePlaybooksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewPlaybookReleaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer newPlaybookReleaseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OldPlaybookReleaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer oldPlaybookReleaseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String playbookUuid;

    private ComparePlaybooksRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.newPlaybookReleaseId = builder.newPlaybookReleaseId;
        this.oldPlaybookReleaseId = builder.oldPlaybookReleaseId;
        this.playbookUuid = builder.playbookUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ComparePlaybooksRequest create() {
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
     * @return newPlaybookReleaseId
     */
    public Integer getNewPlaybookReleaseId() {
        return this.newPlaybookReleaseId;
    }

    /**
     * @return oldPlaybookReleaseId
     */
    public Integer getOldPlaybookReleaseId() {
        return this.oldPlaybookReleaseId;
    }

    /**
     * @return playbookUuid
     */
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public static final class Builder extends Request.Builder<ComparePlaybooksRequest, Builder> {
        private String lang; 
        private Integer newPlaybookReleaseId; 
        private Integer oldPlaybookReleaseId; 
        private String playbookUuid; 

        private Builder() {
            super();
        } 

        private Builder(ComparePlaybooksRequest request) {
            super(request);
            this.lang = request.lang;
            this.newPlaybookReleaseId = request.newPlaybookReleaseId;
            this.oldPlaybookReleaseId = request.oldPlaybookReleaseId;
            this.playbookUuid = request.playbookUuid;
        } 

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
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
         * <p>The ID of the second version.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribePlaybookReleases~~">DescribePlaybookReleases</a> operation to query the IDs of versions. The system automatically generates IDs for new versions.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sfdf2395-e814-459f-9662-xxxxx</p>
         */
        public Builder newPlaybookReleaseId(Integer newPlaybookReleaseId) {
            this.putQueryParameter("NewPlaybookReleaseId", newPlaybookReleaseId);
            this.newPlaybookReleaseId = newPlaybookReleaseId;
            return this;
        }

        /**
         * <p>The ID of the first version.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribePlaybookReleases~~">DescribePlaybookReleases</a> operation to query the IDs of versions. The system automatically generates IDs for new versions.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sflk23423-e814-459f-9662-xxxxx</p>
         */
        public Builder oldPlaybookReleaseId(Integer oldPlaybookReleaseId) {
            this.putQueryParameter("OldPlaybookReleaseId", oldPlaybookReleaseId);
            this.oldPlaybookReleaseId = oldPlaybookReleaseId;
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
         * <p>f916b93e-e814-459f-9662-xxxxx</p>
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putQueryParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        @Override
        public ComparePlaybooksRequest build() {
            return new ComparePlaybooksRequest(this);
        } 

    } 

}
