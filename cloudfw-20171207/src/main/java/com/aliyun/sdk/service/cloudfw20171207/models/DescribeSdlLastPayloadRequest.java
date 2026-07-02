// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeSdlLastPayloadRequest} extends {@link RequestModel}
 *
 * <p>DescribeSdlLastPayloadRequest</p>
 */
public class DescribeSdlLastPayloadRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstIp")
    private String dstIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SensitiveCategory")
    private String sensitiveCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcIp")
    private String srcIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private DescribeSdlLastPayloadRequest(Builder builder) {
        super(builder);
        this.dstIp = builder.dstIp;
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.sensitiveCategory = builder.sensitiveCategory;
        this.srcIp = builder.srcIp;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSdlLastPayloadRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dstIp
     */
    public String getDstIp() {
        return this.dstIp;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sensitiveCategory
     */
    public String getSensitiveCategory() {
        return this.sensitiveCategory;
    }

    /**
     * @return srcIp
     */
    public String getSrcIp() {
        return this.srcIp;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeSdlLastPayloadRequest, Builder> {
        private String dstIp; 
        private Long endTime; 
        private String lang; 
        private String sensitiveCategory; 
        private String srcIp; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSdlLastPayloadRequest request) {
            super(request);
            this.dstIp = request.dstIp;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.sensitiveCategory = request.sensitiveCategory;
            this.srcIp = request.srcIp;
            this.startTime = request.startTime;
        } 

        /**
         * DstIp.
         */
        public Builder dstIp(String dstIp) {
            this.putQueryParameter("DstIp", dstIp);
            this.dstIp = dstIp;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * SensitiveCategory.
         */
        public Builder sensitiveCategory(String sensitiveCategory) {
            this.putQueryParameter("SensitiveCategory", sensitiveCategory);
            this.sensitiveCategory = sensitiveCategory;
            return this;
        }

        /**
         * SrcIp.
         */
        public Builder srcIp(String srcIp) {
            this.putQueryParameter("SrcIp", srcIp);
            this.srcIp = srcIp;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeSdlLastPayloadRequest build() {
            return new DescribeSdlLastPayloadRequest(this);
        } 

    } 

}
