// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTagsRatioLineChartRequest} extends {@link RequestModel}
 *
 * <p>DescribeTagsRatioLineChartRequest</p>
 */
public class DescribeTagsRatioLineChartRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("beginTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("byPassEventCodes")
    private String byPassEventCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("mainEventCodes")
    private String mainEventCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("shuntEventCodes")
    private String shuntEventCodes;

    private DescribeTagsRatioLineChartRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.beginTime = builder.beginTime;
        this.byPassEventCodes = builder.byPassEventCodes;
        this.endTime = builder.endTime;
        this.mainEventCodes = builder.mainEventCodes;
        this.regId = builder.regId;
        this.shuntEventCodes = builder.shuntEventCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTagsRatioLineChartRequest create() {
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
     * @return byPassEventCodes
     */
    public String getByPassEventCodes() {
        return this.byPassEventCodes;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return mainEventCodes
     */
    public String getMainEventCodes() {
        return this.mainEventCodes;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return shuntEventCodes
     */
    public String getShuntEventCodes() {
        return this.shuntEventCodes;
    }

    public static final class Builder extends Request.Builder<DescribeTagsRatioLineChartRequest, Builder> {
        private String lang; 
        private Long beginTime; 
        private String byPassEventCodes; 
        private Long endTime; 
        private String mainEventCodes; 
        private String regId; 
        private String shuntEventCodes; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTagsRatioLineChartRequest request) {
            super(request);
            this.lang = request.lang;
            this.beginTime = request.beginTime;
            this.byPassEventCodes = request.byPassEventCodes;
            this.endTime = request.endTime;
            this.mainEventCodes = request.mainEventCodes;
            this.regId = request.regId;
            this.shuntEventCodes = request.shuntEventCodes;
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
         * byPassEventCodes.
         */
        public Builder byPassEventCodes(String byPassEventCodes) {
            this.putQueryParameter("byPassEventCodes", byPassEventCodes);
            this.byPassEventCodes = byPassEventCodes;
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
         * mainEventCodes.
         */
        public Builder mainEventCodes(String mainEventCodes) {
            this.putQueryParameter("mainEventCodes", mainEventCodes);
            this.mainEventCodes = mainEventCodes;
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

        /**
         * shuntEventCodes.
         */
        public Builder shuntEventCodes(String shuntEventCodes) {
            this.putQueryParameter("shuntEventCodes", shuntEventCodes);
            this.shuntEventCodes = shuntEventCodes;
            return this;
        }

        @Override
        public DescribeTagsRatioLineChartRequest build() {
            return new DescribeTagsRatioLineChartRequest(this);
        } 

    } 

}
