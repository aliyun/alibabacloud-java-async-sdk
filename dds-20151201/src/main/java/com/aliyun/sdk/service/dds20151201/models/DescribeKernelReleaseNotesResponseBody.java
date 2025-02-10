// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeKernelReleaseNotesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKernelReleaseNotesResponseBody</p>
 */
public class DescribeKernelReleaseNotesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ReleaseNotes")
    private ReleaseNotes releaseNotes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeKernelReleaseNotesResponseBody(Builder builder) {
        this.releaseNotes = builder.releaseNotes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKernelReleaseNotesResponseBody create() {
        return builder().build();
    }

    /**
     * @return releaseNotes
     */
    public ReleaseNotes getReleaseNotes() {
        return this.releaseNotes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ReleaseNotes releaseNotes; 
        private String requestId; 

        /**
         * <p>The list of the version release notes.</p>
         */
        public Builder releaseNotes(ReleaseNotes releaseNotes) {
            this.releaseNotes = releaseNotes;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F01D4DDA-CB72-4083-B399-AF4642294FE6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeKernelReleaseNotesResponseBody build() {
            return new DescribeKernelReleaseNotesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeKernelReleaseNotesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKernelReleaseNotesResponseBody</p>
     */
    public static class ReleaseNote extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KernelVersion")
        private String kernelVersion;

        @com.aliyun.core.annotation.NameInMap("ReleaseNote")
        private String releaseNote;

        private ReleaseNote(Builder builder) {
            this.kernelVersion = builder.kernelVersion;
            this.releaseNote = builder.releaseNote;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReleaseNote create() {
            return builder().build();
        }

        /**
         * @return kernelVersion
         */
        public String getKernelVersion() {
            return this.kernelVersion;
        }

        /**
         * @return releaseNote
         */
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public static final class Builder {
            private String kernelVersion; 
            private String releaseNote; 

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>mongodb_20180619_0.4.9</p>
             */
            public Builder kernelVersion(String kernelVersion) {
                this.kernelVersion = kernelVersion;
                return this;
            }

            /**
             * <p>The release notes.</p>
             * 
             * <strong>example:</strong>
             * <p>test release note.</p>
             */
            public Builder releaseNote(String releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            public ReleaseNote build() {
                return new ReleaseNote(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeKernelReleaseNotesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKernelReleaseNotesResponseBody</p>
     */
    public static class ReleaseNotes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReleaseNote")
        private java.util.List<ReleaseNote> releaseNote;

        private ReleaseNotes(Builder builder) {
            this.releaseNote = builder.releaseNote;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReleaseNotes create() {
            return builder().build();
        }

        /**
         * @return releaseNote
         */
        public java.util.List<ReleaseNote> getReleaseNote() {
            return this.releaseNote;
        }

        public static final class Builder {
            private java.util.List<ReleaseNote> releaseNote; 

            /**
             * <p>The release notes.</p>
             * 
             * <strong>example:</strong>
             * <p>test release note.</p>
             */
            public Builder releaseNote(java.util.List<ReleaseNote> releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            public ReleaseNotes build() {
                return new ReleaseNotes(this);
            } 

        } 

    }
}
