// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiTrafficResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiTrafficResponseBody</p>
 */
public class DescribeApiTrafficResponseBody extends TeaModel {
    @NameInMap("Downloads")
    private Downloads downloads;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Uploads")
    private Uploads uploads;

    private DescribeApiTrafficResponseBody(Builder builder) {
        this.downloads = builder.downloads;
        this.requestId = builder.requestId;
        this.uploads = builder.uploads;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiTrafficResponseBody create() {
        return builder().build();
    }

    /**
     * @return downloads
     */
    public Downloads getDownloads() {
        return this.downloads;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uploads
     */
    public Uploads getUploads() {
        return this.uploads;
    }

    public static final class Builder {
        private Downloads downloads; 
        private String requestId; 
        private Uploads uploads; 

        /**
         * Downloads.
         */
        public Builder downloads(Downloads downloads) {
            this.downloads = downloads;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Uploads.
         */
        public Builder uploads(Uploads uploads) {
            this.uploads = uploads;
            return this;
        }

        public DescribeApiTrafficResponseBody build() {
            return new DescribeApiTrafficResponseBody(this);
        } 

    } 

    public static class Download extends TeaModel {
        @NameInMap("Time")
        private String time;

        @NameInMap("Value")
        private String value;

        private Download(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Download create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String time; 
            private String value; 

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Download build() {
                return new Download(this);
            } 

        } 

    }
    public static class Downloads extends TeaModel {
        @NameInMap("Download")
        private java.util.List < Download> download;

        private Downloads(Builder builder) {
            this.download = builder.download;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Downloads create() {
            return builder().build();
        }

        /**
         * @return download
         */
        public java.util.List < Download> getDownload() {
            return this.download;
        }

        public static final class Builder {
            private java.util.List < Download> download; 

            /**
             * Download.
             */
            public Builder download(java.util.List < Download> download) {
                this.download = download;
                return this;
            }

            public Downloads build() {
                return new Downloads(this);
            } 

        } 

    }
    public static class Upload extends TeaModel {
        @NameInMap("Time")
        private String time;

        @NameInMap("Value")
        private String value;

        private Upload(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Upload create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String time; 
            private String value; 

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Upload build() {
                return new Upload(this);
            } 

        } 

    }
    public static class Uploads extends TeaModel {
        @NameInMap("Upload")
        private java.util.List < Upload> upload;

        private Uploads(Builder builder) {
            this.upload = builder.upload;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Uploads create() {
            return builder().build();
        }

        /**
         * @return upload
         */
        public java.util.List < Upload> getUpload() {
            return this.upload;
        }

        public static final class Builder {
            private java.util.List < Upload> upload; 

            /**
             * Upload.
             */
            public Builder upload(java.util.List < Upload> upload) {
                this.upload = upload;
                return this;
            }

            public Uploads build() {
                return new Uploads(this);
            } 

        } 

    }
}
