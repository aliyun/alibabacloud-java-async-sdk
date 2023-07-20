// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSuspEventDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeSuspEventDetailRequest</p>
 */
public class DescribeSuspEventDetailRequest extends Request {
    @Query
    @NameInMap("From")
    @Validation(required = true)
    private String from;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("SuspiciousEventId")
    @Validation(required = true)
    private Integer suspiciousEventId;

    private DescribeSuspEventDetailRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.lang = builder.lang;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.sourceIp = builder.sourceIp;
        this.suspiciousEventId = builder.suspiciousEventId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSuspEventDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return suspiciousEventId
     */
    public Integer getSuspiciousEventId() {
        return this.suspiciousEventId;
    }

    public static final class Builder extends Request.Builder<DescribeSuspEventDetailRequest, Builder> {
        private String from; 
        private String lang; 
        private Long resourceDirectoryAccountId; 
        private String sourceIp; 
        private Integer suspiciousEventId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSuspEventDetailRequest request) {
            super(request);
            this.from = request.from;
            this.lang = request.lang;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.sourceIp = request.sourceIp;
            this.suspiciousEventId = request.suspiciousEventId;
        } 

        /**
         * The data source of the exception. Set the value to sas.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * ResourceDirectoryAccountId.
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The ID of the exception.
         */
        public Builder suspiciousEventId(Integer suspiciousEventId) {
            this.putQueryParameter("SuspiciousEventId", suspiciousEventId);
            this.suspiciousEventId = suspiciousEventId;
            return this;
        }

        @Override
        public DescribeSuspEventDetailRequest build() {
            return new DescribeSuspEventDetailRequest(this);
        } 

    } 

}
