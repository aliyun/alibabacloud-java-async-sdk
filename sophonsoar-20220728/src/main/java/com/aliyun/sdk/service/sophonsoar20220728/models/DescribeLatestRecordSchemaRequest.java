// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLatestRecordSchemaRequest} extends {@link RequestModel}
 *
 * <p>DescribeLatestRecordSchemaRequest</p>
 */
public class DescribeLatestRecordSchemaRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PlaybookUuid")
    @Validation(required = true)
    private String playbookUuid;

    private DescribeLatestRecordSchemaRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.playbookUuid = builder.playbookUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLatestRecordSchemaRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeLatestRecordSchemaRequest, Builder> {
        private String lang; 
        private String playbookUuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLatestRecordSchemaRequest request) {
            super(request);
            this.lang = request.lang;
            this.playbookUuid = request.playbookUuid;
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

        @Override
        public DescribeLatestRecordSchemaRequest build() {
            return new DescribeLatestRecordSchemaRequest(this);
        } 

    } 

}
