// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileDetectReportRequest} extends {@link RequestModel}
 *
 * <p>GetFileDetectReportRequest</p>
 */
public class GetFileDetectReportRequest extends Request {
    @Query
    @NameInMap("EventId")
    private Long eventId;

    @Query
    @NameInMap("Field")
    private String field;

    @Query
    @NameInMap("FileHash")
    private String fileHash;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SourceType")
    private String sourceType;

    private GetFileDetectReportRequest(Builder builder) {
        super(builder);
        this.eventId = builder.eventId;
        this.field = builder.field;
        this.fileHash = builder.fileHash;
        this.lang = builder.lang;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileDetectReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventId
     */
    public Long getEventId() {
        return this.eventId;
    }

    /**
     * @return field
     */
    public String getField() {
        return this.field;
    }

    /**
     * @return fileHash
     */
    public String getFileHash() {
        return this.fileHash;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<GetFileDetectReportRequest, Builder> {
        private Long eventId; 
        private String field; 
        private String fileHash; 
        private String lang; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetFileDetectReportRequest request) {
            super(request);
            this.eventId = request.eventId;
            this.field = request.field;
            this.fileHash = request.fileHash;
            this.lang = request.lang;
            this.sourceType = request.sourceType;
        } 

        /**
         * EventId.
         */
        public Builder eventId(Long eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * Field.
         */
        public Builder field(String field) {
            this.putQueryParameter("Field", field);
            this.field = field;
            return this;
        }

        /**
         * FileHash.
         */
        public Builder fileHash(String fileHash) {
            this.putQueryParameter("FileHash", fileHash);
            this.fileHash = fileHash;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public GetFileDetectReportRequest build() {
            return new GetFileDetectReportRequest(this);
        } 

    } 

}
