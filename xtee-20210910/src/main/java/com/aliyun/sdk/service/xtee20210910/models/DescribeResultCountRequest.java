// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResultCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeResultCountRequest</p>
 */
public class DescribeResultCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("beginTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DescribeResultCountRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResultCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeResultCountRequest, Builder> {
        private String lang; 
        private Long beginTime; 
        private Long endTime; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResultCountRequest request) {
            super(request);
            this.lang = request.lang;
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.regId = request.regId;
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
         * beginTime.
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("beginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public DescribeResultCountRequest build() {
            return new DescribeResultCountRequest(this);
        } 

    } 

}
