// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKernelReleaseNotesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKernelReleaseNotesResponseBody</p>
 */
public class DescribeKernelReleaseNotesResponseBody extends TeaModel {
    @NameInMap("ReleaseNotes")
    private ReleaseNotes releaseNotes;

    @NameInMap("RequestId")
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
         * ReleaseNotes.
         */
        public Builder releaseNotes(ReleaseNotes releaseNotes) {
            this.releaseNotes = releaseNotes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeKernelReleaseNotesResponseBody build() {
            return new DescribeKernelReleaseNotesResponseBody(this);
        } 

    } 

    public static class ReleaseNote extends TeaModel {
        @NameInMap("KernelVersion")
        private String kernelVersion;

        @NameInMap("ReleaseNote")
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
             * KernelVersion.
             */
            public Builder kernelVersion(String kernelVersion) {
                this.kernelVersion = kernelVersion;
                return this;
            }

            /**
             * ReleaseNote.
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
    public static class ReleaseNotes extends TeaModel {
        @NameInMap("ReleaseNote")
        private java.util.List < ReleaseNote> releaseNote;

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
        public java.util.List < ReleaseNote> getReleaseNote() {
            return this.releaseNote;
        }

        public static final class Builder {
            private java.util.List < ReleaseNote> releaseNote; 

            /**
             * ReleaseNote.
             */
            public Builder releaseNote(java.util.List < ReleaseNote> releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            public ReleaseNotes build() {
                return new ReleaseNotes(this);
            } 

        } 

    }
}
