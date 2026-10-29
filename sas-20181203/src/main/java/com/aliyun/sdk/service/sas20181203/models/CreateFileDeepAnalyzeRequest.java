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
 * {@link CreateFileDeepAnalyzeRequest} extends {@link RequestModel}
 *
 * <p>CreateFileDeepAnalyzeRequest</p>
 */
public class CreateFileDeepAnalyzeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Context")
    private String context;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    private Long eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hash")
    private String hash;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private CreateFileDeepAnalyzeRequest(Builder builder) {
        super(builder);
        this.context = builder.context;
        this.eventId = builder.eventId;
        this.hash = builder.hash;
        this.source = builder.source;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFileDeepAnalyzeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return context
     */
    public String getContext() {
        return this.context;
    }

    /**
     * @return eventId
     */
    public Long getEventId() {
        return this.eventId;
    }

    /**
     * @return hash
     */
    public String getHash() {
        return this.hash;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<CreateFileDeepAnalyzeRequest, Builder> {
        private String context; 
        private Long eventId; 
        private String hash; 
        private String source; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(CreateFileDeepAnalyzeRequest request) {
            super(request);
            this.context = request.context;
            this.eventId = request.eventId;
            this.hash = request.hash;
            this.source = request.source;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The request context information.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder context(String context) {
            this.putQueryParameter("Context", context);
            this.context = context;
            return this;
        }

        /**
         * <p>The event ID. If a file-related alert event already exists, you can use this parameter to trigger deep analysis.</p>
         * 
         * <strong>example:</strong>
         * <p>100000001</p>
         */
        public Builder eventId(Long eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The file hash. If the file already exists in the cloud, you can use this parameter to trigger deep analysis.</p>
         * 
         * <strong>example:</strong>
         * <p>d41d8cd98f00b204e9800998ecf8427e</p>
         */
        public Builder hash(String hash) {
            this.putQueryParameter("Hash", hash);
            this.hash = hash;
            return this;
        }

        /**
         * <p>The request source. The system verifies the purchased edition based on the request source. Valid values:</p>
         * <ul>
         * <li><p><strong>edr</strong>: AgenticEDR.</p>
         * </li>
         * <li><p><strong>secOpsAgent</strong>: Security operations agent.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>edr</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The IP address of the access source.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public CreateFileDeepAnalyzeRequest build() {
            return new CreateFileDeepAnalyzeRequest(this);
        } 

    } 

}
