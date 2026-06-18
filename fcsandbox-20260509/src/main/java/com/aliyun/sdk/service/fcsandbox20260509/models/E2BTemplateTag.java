// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link E2BTemplateTag} extends {@link TeaModel}
 *
 * <p>E2BTemplateTag</p>
 */
public class E2BTemplateTag extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("buildID")
    private String buildID;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("tag")
    private String tag;

    private E2BTemplateTag(Builder builder) {
        this.buildID = builder.buildID;
        this.createdAt = builder.createdAt;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static E2BTemplateTag create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buildID
     */
    public String getBuildID() {
        return this.buildID;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder {
        private String buildID; 
        private String createdAt; 
        private String tag; 

        private Builder() {
        } 

        private Builder(E2BTemplateTag model) {
            this.buildID = model.buildID;
            this.createdAt = model.createdAt;
            this.tag = model.tag;
        } 

        /**
         * buildID.
         */
        public Builder buildID(String buildID) {
            this.buildID = buildID;
            return this;
        }

        /**
         * createdAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * tag.
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        public E2BTemplateTag build() {
            return new E2BTemplateTag(this);
        } 

    } 

}
