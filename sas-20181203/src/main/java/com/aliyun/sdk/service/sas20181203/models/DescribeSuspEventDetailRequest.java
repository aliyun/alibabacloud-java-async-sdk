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
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("SuspiciousEventId")
    private Integer suspiciousEventId;

    private DescribeSuspEventDetailRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.lang = builder.lang;
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
        private String sourceIp; 
        private Integer suspiciousEventId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSuspEventDetailRequest response) {
            super(response);
            this.from = response.from;
            this.lang = response.lang;
            this.sourceIp = response.sourceIp;
            this.suspiciousEventId = response.suspiciousEventId;
        } 

        /**
         * From.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
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
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * SuspiciousEventId.
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
