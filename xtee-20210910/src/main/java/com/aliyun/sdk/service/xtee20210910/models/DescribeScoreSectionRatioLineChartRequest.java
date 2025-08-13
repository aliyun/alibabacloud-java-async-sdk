// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeScoreSectionRatioLineChartRequest} extends {@link RequestModel}
 *
 * <p>DescribeScoreSectionRatioLineChartRequest</p>
 */
public class DescribeScoreSectionRatioLineChartRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("beginTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("byPassEventCodes")
    private String byPassEventCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("mainEventCodes")
    private String mainEventCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("shuntEventCodes")
    private String shuntEventCodes;

    private DescribeScoreSectionRatioLineChartRequest(Builder builder) {
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

    public static DescribeScoreSectionRatioLineChartRequest create() {
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
    public String getBeginTime() {
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
    public String getEndTime() {
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

    public static final class Builder extends Request.Builder<DescribeScoreSectionRatioLineChartRequest, Builder> {
        private String lang; 
        private String beginTime; 
        private String byPassEventCodes; 
        private String endTime; 
        private String mainEventCodes; 
        private String regId; 
        private String shuntEventCodes; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScoreSectionRatioLineChartRequest request) {
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
         * <p>Sets the language type for request and response messages, with a default value of <strong>zh</strong>. Values: </p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Start time, accurate to milliseconds (ms).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1751249559000</p>
         */
        public Builder beginTime(String beginTime) {
            this.putQueryParameter("beginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>Bypass event code</p>
         * 
         * <strong>example:</strong>
         * <p>de_amnhke2482</p>
         */
        public Builder byPassEventCodes(String byPassEventCodes) {
            this.putQueryParameter("byPassEventCodes", byPassEventCodes);
            this.byPassEventCodes = byPassEventCodes;
            return this;
        }

        /**
         * <p>End time, accurate to milliseconds (ms).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1748491200000</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Main event code</p>
         * 
         * <strong>example:</strong>
         * <p>de_avcqzc3714</p>
         */
        public Builder mainEventCodes(String mainEventCodes) {
            this.putQueryParameter("mainEventCodes", mainEventCodes);
            this.mainEventCodes = mainEventCodes;
            return this;
        }

        /**
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Shunt event code</p>
         * 
         * <strong>example:</strong>
         * <p>de_amnhke2488</p>
         */
        public Builder shuntEventCodes(String shuntEventCodes) {
            this.putQueryParameter("shuntEventCodes", shuntEventCodes);
            this.shuntEventCodes = shuntEventCodes;
            return this;
        }

        @Override
        public DescribeScoreSectionRatioLineChartRequest build() {
            return new DescribeScoreSectionRatioLineChartRequest(this);
        } 

    } 

}
