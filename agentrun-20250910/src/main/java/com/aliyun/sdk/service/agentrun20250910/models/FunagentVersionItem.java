// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link FunagentVersionItem} extends {@link TeaModel}
 *
 * <p>FunagentVersionItem</p>
 */
public class FunagentVersionItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("publishContent")
    private java.util.List<String> publishContent;

    @com.aliyun.core.annotation.NameInMap("publishTime")
    private String publishTime;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private FunagentVersionItem(Builder builder) {
        this.description = builder.description;
        this.publishContent = builder.publishContent;
        this.publishTime = builder.publishTime;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FunagentVersionItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return publishContent
     */
    public java.util.List<String> getPublishContent() {
        return this.publishContent;
    }

    /**
     * @return publishTime
     */
    public String getPublishTime() {
        return this.publishTime;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String description; 
        private java.util.List<String> publishContent; 
        private String publishTime; 
        private String version; 

        private Builder() {
        } 

        private Builder(FunagentVersionItem model) {
            this.description = model.description;
            this.publishContent = model.publishContent;
            this.publishTime = model.publishTime;
            this.version = model.version;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>多条更新说明</p>
         */
        public Builder publishContent(java.util.List<String> publishContent) {
            this.publishContent = publishContent;
            return this;
        }

        /**
         * <p>日期或 ISO 8601 字符串</p>
         */
        public Builder publishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public FunagentVersionItem build() {
            return new FunagentVersionItem(this);
        } 

    } 

}
