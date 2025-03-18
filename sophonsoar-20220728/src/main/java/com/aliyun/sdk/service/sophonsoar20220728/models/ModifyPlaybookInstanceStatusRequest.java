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
 * {@link ModifyPlaybookInstanceStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyPlaybookInstanceStatusRequest</p>
 */
public class ModifyPlaybookInstanceStatusRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Active")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer active;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String playbookUuid;

    private ModifyPlaybookInstanceStatusRequest(Builder builder) {
        super(builder);
        this.active = builder.active;
        this.lang = builder.lang;
        this.playbookUuid = builder.playbookUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPlaybookInstanceStatusRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyPlaybookInstanceStatusRequest, Builder> {
        private Integer active; 
        private String lang; 
        private String playbookUuid; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPlaybookInstanceStatusRequest request) {
            super(request);
            this.active = request.active;
            this.lang = request.lang;
            this.playbookUuid = request.playbookUuid;
        } 

        /**
         * <p>The playbook status. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: starts the playbook.</li>
         * <li><strong>0</strong>: stops the playbook.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder active(Integer active) {
            this.putBodyParameter("Active", active);
            this.active = active;
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
         * <p>The playbook UUID.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a> operation to query the playbook UUID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9fcd3829-80ff-4681-be1e-xxxxxxxx</p>
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        @Override
        public ModifyPlaybookInstanceStatusRequest build() {
            return new ModifyPlaybookInstanceStatusRequest(this);
        } 

    } 

}
