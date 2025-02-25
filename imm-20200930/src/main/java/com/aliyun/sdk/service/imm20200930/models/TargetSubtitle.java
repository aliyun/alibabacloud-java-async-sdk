// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link TargetSubtitle} extends {@link TeaModel}
 *
 * <p>TargetSubtitle</p>
 */
public class TargetSubtitle extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DisableSubtitle")
    private Boolean disableSubtitle;

    @com.aliyun.core.annotation.NameInMap("ExtractSubtitle")
    private ExtractSubtitle extractSubtitle;

    @com.aliyun.core.annotation.NameInMap("Stream")
    private java.util.List<Integer> stream;

    private TargetSubtitle(Builder builder) {
        this.disableSubtitle = builder.disableSubtitle;
        this.extractSubtitle = builder.extractSubtitle;
        this.stream = builder.stream;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TargetSubtitle create() {
        return builder().build();
    }

    /**
     * @return disableSubtitle
     */
    public Boolean getDisableSubtitle() {
        return this.disableSubtitle;
    }

    /**
     * @return extractSubtitle
     */
    public ExtractSubtitle getExtractSubtitle() {
        return this.extractSubtitle;
    }

    /**
     * @return stream
     */
    public java.util.List<Integer> getStream() {
        return this.stream;
    }

    public static final class Builder {
        private Boolean disableSubtitle; 
        private ExtractSubtitle extractSubtitle; 
        private java.util.List<Integer> stream; 

        /**
         * DisableSubtitle.
         */
        public Builder disableSubtitle(Boolean disableSubtitle) {
            this.disableSubtitle = disableSubtitle;
            return this;
        }

        /**
         * ExtractSubtitle.
         */
        public Builder extractSubtitle(ExtractSubtitle extractSubtitle) {
            this.extractSubtitle = extractSubtitle;
            return this;
        }

        /**
         * Stream.
         */
        public Builder stream(java.util.List<Integer> stream) {
            this.stream = stream;
            return this;
        }

        public TargetSubtitle build() {
            return new TargetSubtitle(this);
        } 

    } 

    /**
     * 
     * {@link TargetSubtitle} extends {@link TeaModel}
     *
     * <p>TargetSubtitle</p>
     */
    public static class ExtractSubtitle extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("URI")
        private String URI;

        private ExtractSubtitle(Builder builder) {
            this.format = builder.format;
            this.URI = builder.URI;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtractSubtitle create() {
            return builder().build();
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        public static final class Builder {
            private String format; 
            private String URI; 

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * URI.
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            public ExtractSubtitle build() {
                return new ExtractSubtitle(this);
            } 

        } 

    }
}
