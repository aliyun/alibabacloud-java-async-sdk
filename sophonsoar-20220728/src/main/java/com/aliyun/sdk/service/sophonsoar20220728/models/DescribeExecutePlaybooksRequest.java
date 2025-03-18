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
 * {@link DescribeExecutePlaybooksRequest} extends {@link RequestModel}
 *
 * <p>DescribeExecutePlaybooksRequest</p>
 */
public class DescribeExecutePlaybooksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputMode")
    private String inputMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamType")
    private String paramType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlaybookName")
    private String playbookName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private DescribeExecutePlaybooksRequest(Builder builder) {
        super(builder);
        this.inputMode = builder.inputMode;
        this.lang = builder.lang;
        this.paramType = builder.paramType;
        this.playbookName = builder.playbookName;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExecutePlaybooksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inputMode
     */
    public String getInputMode() {
        return this.inputMode;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return paramType
     */
    public String getParamType() {
        return this.paramType;
    }

    /**
     * @return playbookName
     */
    public String getPlaybookName() {
        return this.playbookName;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<DescribeExecutePlaybooksRequest, Builder> {
        private String inputMode; 
        private String lang; 
        private String paramType; 
        private String playbookName; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExecutePlaybooksRequest request) {
            super(request);
            this.inputMode = request.inputMode;
            this.lang = request.lang;
            this.paramType = request.paramType;
            this.playbookName = request.playbookName;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The entity type of the script input parameter. When you want to query multiple entity types, separate them with commas.</p>
         * <ul>
         * <li><strong>ip</strong>: IP entity.</li>
         * <li><strong>file</strong>: file entity.</li>
         * <li><strong>process</strong>: process entity.</li>
         * <li><strong>incident</strong>: incident entity.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip,file,process,host</p>
         */
        public Builder inputMode(String inputMode) {
            this.putQueryParameter("InputMode", inputMode);
            this.inputMode = inputMode;
            return this;
        }

        /**
         * <p>The language of the content within the request and the response. Valid values:</p>
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
         * <p>The input parameter type of the playbook.</p>
         * <ul>
         * <li><strong>template-ip</strong></li>
         * <li><strong>template-file</strong></li>
         * <li><strong>template-process</strong></li>
         * <li><strong>custom</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder paramType(String paramType) {
            this.putQueryParameter("ParamType", paramType);
            this.paramType = paramType;
            return this;
        }

        /**
         * <p>The playbook name. Fuzzy search is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_test</p>
         */
        public Builder playbookName(String playbookName) {
            this.putQueryParameter("PlaybookName", playbookName);
            this.playbookName = playbookName;
            return this;
        }

        /**
         * <p>The playbook UUID.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a> operation to query the playbook UUID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>f916b93e-e814-459f-9662-xxxxxx</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DescribeExecutePlaybooksRequest build() {
            return new DescribeExecutePlaybooksRequest(this);
        } 

    } 

}
