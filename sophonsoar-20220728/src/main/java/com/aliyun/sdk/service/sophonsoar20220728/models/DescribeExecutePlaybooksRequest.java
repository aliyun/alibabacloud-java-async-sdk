// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExecutePlaybooksRequest} extends {@link RequestModel}
 *
 * <p>DescribeExecutePlaybooksRequest</p>
 */
public class DescribeExecutePlaybooksRequest extends Request {
    @Query
    @NameInMap("InputMode")
    private String inputMode;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ParamType")
    private String paramType;

    @Query
    @NameInMap("PlaybookName")
    private String playbookName;

    @Query
    @NameInMap("Uuid")
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
         * The entity type of the script input parameter. When you want to query multiple entity types, separate them with commas.
         * <p>
         * - **ip**: IP entity.
         * - **file**: file entity.
         * - **process**: process entity.
         * - **incident**: incident entity.
         */
        public Builder inputMode(String inputMode) {
            this.putQueryParameter("InputMode", inputMode);
            this.inputMode = inputMode;
            return this;
        }

        /**
         * The language of the content within the request and the response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The input parameter type of the playbook.
         * <p>
         * 
         * *   **template-ip**
         * *   **template-file**
         * *   **template-process**
         * *   **custom**
         */
        public Builder paramType(String paramType) {
            this.putQueryParameter("ParamType", paramType);
            this.paramType = paramType;
            return this;
        }

        /**
         * The playbook name. Fuzzy search is supported.
         */
        public Builder playbookName(String playbookName) {
            this.putQueryParameter("PlaybookName", playbookName);
            this.playbookName = playbookName;
            return this;
        }

        /**
         * The playbook UUID.
         * <p>
         * 
         * >  You can call the [DescribePlaybooks](~~DescribePlaybooks~~) operation to query the playbook UUID.
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
