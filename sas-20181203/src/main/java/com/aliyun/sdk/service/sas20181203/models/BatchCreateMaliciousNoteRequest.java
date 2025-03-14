// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link BatchCreateMaliciousNoteRequest} extends {@link RequestModel}
 *
 * <p>BatchCreateMaliciousNoteRequest</p>
 */
public class BatchCreateMaliciousNoteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageMaliciousFileList")
    private java.util.List<ImageMaliciousFileList> imageMaliciousFileList;

    private BatchCreateMaliciousNoteRequest(Builder builder) {
        super(builder);
        this.imageMaliciousFileList = builder.imageMaliciousFileList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateMaliciousNoteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageMaliciousFileList
     */
    public java.util.List<ImageMaliciousFileList> getImageMaliciousFileList() {
        return this.imageMaliciousFileList;
    }

    public static final class Builder extends Request.Builder<BatchCreateMaliciousNoteRequest, Builder> {
        private java.util.List<ImageMaliciousFileList> imageMaliciousFileList; 

        private Builder() {
            super();
        } 

        private Builder(BatchCreateMaliciousNoteRequest request) {
            super(request);
            this.imageMaliciousFileList = request.imageMaliciousFileList;
        } 

        /**
         * <p>The batches.</p>
         */
        public Builder imageMaliciousFileList(java.util.List<ImageMaliciousFileList> imageMaliciousFileList) {
            this.putQueryParameter("ImageMaliciousFileList", imageMaliciousFileList);
            this.imageMaliciousFileList = imageMaliciousFileList;
            return this;
        }

        @Override
        public BatchCreateMaliciousNoteRequest build() {
            return new BatchCreateMaliciousNoteRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchCreateMaliciousNoteRequest} extends {@link TeaModel}
     *
     * <p>BatchCreateMaliciousNoteRequest</p>
     */
    public static class ImageMaliciousFileList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventId")
        private Long eventId;

        @com.aliyun.core.annotation.NameInMap("Note")
        private String note;

        private ImageMaliciousFileList(Builder builder) {
            this.eventId = builder.eventId;
            this.note = builder.note;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageMaliciousFileList create() {
            return builder().build();
        }

        /**
         * @return eventId
         */
        public Long getEventId() {
            return this.eventId;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        public static final class Builder {
            private Long eventId; 
            private String note; 

            private Builder() {
            } 

            private Builder(ImageMaliciousFileList model) {
                this.eventId = model.eventId;
                this.note = model.note;
            } 

            /**
             * <p>The ID of the alert.</p>
             * <blockquote>
             * <p> You can call the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation to query the alert IDs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder eventId(Long eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Malware sample</p>
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            public ImageMaliciousFileList build() {
                return new ImageMaliciousFileList(this);
            } 

        } 

    }
}
