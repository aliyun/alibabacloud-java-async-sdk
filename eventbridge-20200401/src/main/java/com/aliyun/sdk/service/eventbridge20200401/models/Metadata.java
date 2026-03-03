// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link Metadata} extends {@link TeaModel}
 *
 * <p>Metadata</p>
 */
public class Metadata extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Attachments")
    private java.util.List<Attachments> attachments;

    private Metadata(Builder builder) {
        this.attachments = builder.attachments;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Metadata create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attachments
     */
    public java.util.List<Attachments> getAttachments() {
        return this.attachments;
    }

    public static final class Builder {
        private java.util.List<Attachments> attachments; 

        private Builder() {
        } 

        private Builder(Metadata model) {
            this.attachments = model.attachments;
        } 

        /**
         * Attachments.
         */
        public Builder attachments(java.util.List<Attachments> attachments) {
            this.attachments = attachments;
            return this;
        }

        public Metadata build() {
            return new Metadata(this);
        } 

    } 

    /**
     * 
     * {@link Metadata} extends {@link TeaModel}
     *
     * <p>Metadata</p>
     */
    public static class Attachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("MimeType")
        private String mimeType;

        private Attachments(Builder builder) {
            this.arn = builder.arn;
            this.mimeType = builder.mimeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attachments create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        /**
         * @return mimeType
         */
        public String getMimeType() {
            return this.mimeType;
        }

        public static final class Builder {
            private String arn; 
            private String mimeType; 

            private Builder() {
            } 

            private Builder(Attachments model) {
                this.arn = model.arn;
                this.mimeType = model.mimeType;
            } 

            /**
             * Arn.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * MimeType.
             */
            public Builder mimeType(String mimeType) {
                this.mimeType = mimeType;
                return this;
            }

            public Attachments build() {
                return new Attachments(this);
            } 

        } 

    }
}
