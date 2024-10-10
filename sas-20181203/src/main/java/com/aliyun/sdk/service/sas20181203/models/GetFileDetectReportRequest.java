// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetFileDetectReportRequest} extends {@link RequestModel}
 *
 * <p>GetFileDetectReportRequest</p>
 */
public class GetFileDetectReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    private Long eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Field")
    private String field;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileHash")
    private String fileHash;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
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
         * <p>The event ID that corresponds to the file to be detected.</p>
         * 
         * <strong>example:</strong>
         * <p>81****</p>
         */
        public Builder eventId(Long eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The field that you want to query. You can enter multiple fields and separate them with commas (,).</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>ThreatTypes</strong>: the type of the threat intelligence event</li>
         * <li><strong>Intelligences</strong>: the threat intelligence event</li>
         * <li><strong>ThreatLevel</strong>: the level of the threat intelligence event</li>
         * <li><strong>Basic</strong>: the basic information about the report (the scan result)</li>
         * <li><strong>Sandbox</strong>: the cloud sandbox check report</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Basic,,ThreatTypes,Intelligences,Sandbox</p>
         */
        public Builder field(String field) {
            this.putQueryParameter("Field", field);
            this.field = field;
            return this;
        }

        /**
         * <p>The hash value of the file to be detected.</p>
         * 
         * <strong>example:</strong>
         * <p>b63917332950e5d219d0737ffe31****</p>
         */
        public Builder fileHash(String fileHash) {
            this.putQueryParameter("FileHash", fileHash);
            this.fileHash = fileHash;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The data source type. Valid values:</p>
         * <ul>
         * <li><strong>machine</strong>: host alerts</li>
         * <li><strong>object_scan</strong>: file detection alerts</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>object_scan</p>
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
