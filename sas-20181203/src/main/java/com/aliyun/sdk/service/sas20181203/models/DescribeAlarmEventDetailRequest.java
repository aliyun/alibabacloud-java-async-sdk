// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAlarmEventDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlarmEventDetailRequest</p>
 */
public class DescribeAlarmEventDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmUniqueInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alarmUniqueInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    @com.aliyun.core.annotation.Validation(required = true)
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private DescribeAlarmEventDetailRequest(Builder builder) {
        super(builder);
        this.alarmUniqueInfo = builder.alarmUniqueInfo;
        this.from = builder.from;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlarmEventDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmUniqueInfo
     */
    public String getAlarmUniqueInfo() {
        return this.alarmUniqueInfo;
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

    public static final class Builder extends Request.Builder<DescribeAlarmEventDetailRequest, Builder> {
        private String alarmUniqueInfo; 
        private String from; 
        private String lang; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlarmEventDetailRequest request) {
            super(request);
            this.alarmUniqueInfo = request.alarmUniqueInfo;
            this.from = request.from;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The unique identifier of the alert event.</p>
         * <blockquote>
         * <p>To query the details of an alert event, you must provide the unique identifier of the alert event. You can call the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation to obtain the identifier.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9f62555666f177aa84ee1eaf465a****</p>
         */
        public Builder alarmUniqueInfo(String alarmUniqueInfo) {
            this.putQueryParameter("AlarmUniqueInfo", alarmUniqueInfo);
            this.alarmUniqueInfo = alarmUniqueInfo;
            return this;
        }

        /**
         * <p>The ID of the request source. Set the value to <strong>sas</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
         * <p>The source IP address of the request.</p>
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
        public DescribeAlarmEventDetailRequest build() {
            return new DescribeAlarmEventDetailRequest(this);
        } 

    } 

}
