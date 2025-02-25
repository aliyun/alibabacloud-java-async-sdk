// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ManualEventPayload} extends {@link TeaModel}
 *
 * <p>ManualEventPayload</p>
 */
public class ManualEventPayload extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("branch")
    private String branch;

    @com.aliyun.core.annotation.NameInMap("commitID")
    private String commitID;

    @com.aliyun.core.annotation.NameInMap("tag")
    private String tag;

    @com.aliyun.core.annotation.NameInMap("templateConfig")
    private TemplateConfig templateConfig;

    private ManualEventPayload(Builder builder) {
        this.branch = builder.branch;
        this.commitID = builder.commitID;
        this.tag = builder.tag;
        this.templateConfig = builder.templateConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManualEventPayload create() {
        return builder().build();
    }

    /**
     * @return branch
     */
    public String getBranch() {
        return this.branch;
    }

    /**
     * @return commitID
     */
    public String getCommitID() {
        return this.commitID;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * @return templateConfig
     */
    public TemplateConfig getTemplateConfig() {
        return this.templateConfig;
    }

    public static final class Builder {
        private String branch; 
        private String commitID; 
        private String tag; 
        private TemplateConfig templateConfig; 

        /**
         * branch.
         */
        public Builder branch(String branch) {
            this.branch = branch;
            return this;
        }

        /**
         * commitID.
         */
        public Builder commitID(String commitID) {
            this.commitID = commitID;
            return this;
        }

        /**
         * tag.
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        /**
         * templateConfig.
         */
        public Builder templateConfig(TemplateConfig templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }

        public ManualEventPayload build() {
            return new ManualEventPayload(this);
        } 

    } 

}
