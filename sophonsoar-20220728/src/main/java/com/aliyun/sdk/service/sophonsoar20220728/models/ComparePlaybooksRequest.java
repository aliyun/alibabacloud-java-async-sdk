// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ComparePlaybooksRequest} extends {@link RequestModel}
 *
 * <p>ComparePlaybooksRequest</p>
 */
public class ComparePlaybooksRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("NewPlaybookReleaseId")
    @Validation(required = true)
    private Integer newPlaybookReleaseId;

    @Query
    @NameInMap("OldPlaybookReleaseId")
    @Validation(required = true)
    private Integer oldPlaybookReleaseId;

    @Query
    @NameInMap("PlaybookUuid")
    @Validation(required = true)
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
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh** (default): Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The UUID of the second version.
         * <p>
         * 
         * >  You can call the [DescribePopApiVersionList](~~DescribePopApiVersionList~~) operation to query the UUIDs of versions.
         */
        public Builder newPlaybookReleaseId(Integer newPlaybookReleaseId) {
            this.putQueryParameter("NewPlaybookReleaseId", newPlaybookReleaseId);
            this.newPlaybookReleaseId = newPlaybookReleaseId;
            return this;
        }

        /**
         * The UUID of the first version.
         * <p>
         * 
         * >  You can call the [DescribePopApiVersionList](~~DescribePopApiVersionList~~) operation to query the UUIDs of versions.
         */
        public Builder oldPlaybookReleaseId(Integer oldPlaybookReleaseId) {
            this.putQueryParameter("OldPlaybookReleaseId", oldPlaybookReleaseId);
            this.oldPlaybookReleaseId = oldPlaybookReleaseId;
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

        @Override
        public ComparePlaybooksRequest build() {
            return new ComparePlaybooksRequest(this);
        } 

    } 

}
