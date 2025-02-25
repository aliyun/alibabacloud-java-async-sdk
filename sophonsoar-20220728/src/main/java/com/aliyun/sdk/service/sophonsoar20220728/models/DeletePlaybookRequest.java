// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeletePlaybookRequest} extends {@link RequestModel}
 *
 * <p>DeletePlaybookRequest</p>
 */
public class DeletePlaybookRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String playbookUuid;

    private DeletePlaybookRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.playbookUuid = builder.playbookUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePlaybookRequest create() {
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

    public static final class Builder extends Request.Builder<DeletePlaybookRequest, Builder> {
        private String lang; 
        private String playbookUuid; 

        private Builder() {
            super();
        } 

        private Builder(DeletePlaybookRequest request) {
            super(request);
            this.lang = request.lang;
            this.playbookUuid = request.playbookUuid;
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
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The UUID of the playbook.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a>operation to query the playbook UUID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e99dab31-499b-4307-9248-xxxxxx</p>
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        @Override
        public DeletePlaybookRequest build() {
            return new DeletePlaybookRequest(this);
        } 

    } 

}
