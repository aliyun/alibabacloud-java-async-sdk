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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(TargetSubtitle model) {
            this.disableSubtitle = model.disableSubtitle;
            this.extractSubtitle = model.extractSubtitle;
            this.stream = model.stream;
        } 

        /**
         * <p>Specifies whether to disable subtitle generation. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
         * </ul>
         * <blockquote>
         * <p> If you call the GenerateVideoPlaylist operation and subtitles are required, you must set this parameter to false.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableSubtitle(Boolean disableSubtitle) {
            this.disableSubtitle = disableSubtitle;
            return this;
        }

        /**
         * <p>The subtitle extraction settings.</p>
         * <blockquote>
         * <p> The GenerateVideoPlaylist operation does not support this parameter.</p>
         * </blockquote>
         */
        public Builder extractSubtitle(ExtractSubtitle extractSubtitle) {
            this.extractSubtitle = extractSubtitle;
            return this;
        }

        /**
         * <p>The index numbers of subtitle streams that need to be processed. If you set this parameter to null (default) or a value greater than 100, all subtitle streams are processed.</p>
         * <ul>
         * <li>For example, you can set the parameter to <code>[0,1]</code> to process subtitle streams with index numbers 0 and 1, <code>[1]</code> to process only the subtitle stream with the index number 1, and <code>[101]</code> to process all subtitle streams.</li>
         * </ul>
         * <blockquote>
         * <p> If you specify an index number but no subtitle stream with the index number is found, the index number is ignored.</p>
         * </blockquote>
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

            private Builder() {
            } 

            private Builder(ExtractSubtitle model) {
                this.format = model.format;
                this.URI = model.URI;
            } 

            /**
             * <p>The format of the extracted subtitle file. Valid values:</p>
             * <ul>
             * <li>ass</li>
             * <li>srt</li>
             * <li>webvtt</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>webvtt</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The prefix of the OSS URI where the extracted subtitles are stored. The OSS URI is in the oss://bucket/object format, where bucket specifies the name of the OSS bucket that is in the same region as the current project and object specifies the full file path that includes the file name extension.</p>
             * <ul>
             * <li>Example: If the prefix is oss://examplebucket/outputSubtitle, an output subtitle file has a URI in the format of oss://examplebucket/outputSubitile_${index}.${ext}. In the URI format, ${ext} is the file name extension of the output subtitle file, and ${index} is the same 0-based index number as that of the corresponding source subtitle stream file.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oss://test-bucket/extractsubtitle</p>
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
