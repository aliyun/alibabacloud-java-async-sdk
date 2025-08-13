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
 * {@link DescribeAdvanceSearchPageListRequest} extends {@link RequestModel}
 *
 * <p>DescribeAdvanceSearchPageListRequest</p>
 */
public class DescribeAdvanceSearchPageListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("condition")
    private String condition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventBeginTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long eventBeginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCodes")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventEndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long eventEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fieldName")
    private String fieldName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fieldValue")
    private String fieldValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regId;

    private DescribeAdvanceSearchPageListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.condition = builder.condition;
        this.currentPage = builder.currentPage;
        this.eventBeginTime = builder.eventBeginTime;
        this.eventCodes = builder.eventCodes;
        this.eventEndTime = builder.eventEndTime;
        this.fieldName = builder.fieldName;
        this.fieldValue = builder.fieldValue;
        this.pageSize = builder.pageSize;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAdvanceSearchPageListRequest create() {
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
     * @return condition
     */
    public String getCondition() {
        return this.condition;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return eventBeginTime
     */
    public Long getEventBeginTime() {
        return this.eventBeginTime;
    }

    /**
     * @return eventCodes
     */
    public String getEventCodes() {
        return this.eventCodes;
    }

    /**
     * @return eventEndTime
     */
    public Long getEventEndTime() {
        return this.eventEndTime;
    }

    /**
     * @return fieldName
     */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * @return fieldValue
     */
    public String getFieldValue() {
        return this.fieldValue;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeAdvanceSearchPageListRequest, Builder> {
        private String lang; 
        private String condition; 
        private Long currentPage; 
        private Long eventBeginTime; 
        private String eventCodes; 
        private Long eventEndTime; 
        private String fieldName; 
        private String fieldValue; 
        private Long pageSize; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAdvanceSearchPageListRequest request) {
            super(request);
            this.lang = request.lang;
            this.condition = request.condition;
            this.currentPage = request.currentPage;
            this.eventBeginTime = request.eventBeginTime;
            this.eventCodes = request.eventCodes;
            this.eventEndTime = request.eventEndTime;
            this.fieldName = request.fieldName;
            this.fieldValue = request.fieldValue;
            this.pageSize = request.pageSize;
            this.regId = request.regId;
        } 

        /**
         * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
         * <p>Condition value.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;relationship&quot;: &quot;and&quot;,
         *     &quot;list&quot;: [
         *         {
         *             &quot;deepCount&quot;: 1,
         *             &quot;left&quot;: {
         *                 &quot;hasRightVariable&quot;: true,
         *                 &quot;fieldType&quot;: &quot;STRING&quot;,
         *                 &quot;functionName&quot;: &quot;&quot;,
         *                 &quot;leftVariableType&quot;: &quot;NATIVE&quot;,
         *                 &quot;name&quot;: &quot;accountId&quot;,
         *                 &quot;operatorCode&quot;: &quot;equals&quot;
         *             },
         *             &quot;right&quot;: {
         *                 &quot;rightVariableType&quot;: &quot;constant&quot;,
         *                 &quot;name&quot;: &quot;10000&quot;,
         *                 &quot;functionName&quot;: &quot;&quot;
         *             },
         *             &quot;operatorCode&quot;: &quot;equals&quot;
         *         }
         *     ]
         * }</p>
         */
        public Builder condition(String condition) {
            this.putQueryParameter("condition", condition);
            this.condition = condition;
            return this;
        }

        /**
         * <p>Current page number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Query start time, accurate to milliseconds (ms).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1753372800000</p>
         */
        public Builder eventBeginTime(Long eventBeginTime) {
            this.putQueryParameter("eventBeginTime", eventBeginTime);
            this.eventBeginTime = eventBeginTime;
            return this;
        }

        /**
         * <p>Event code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;de_ahqhsw7665&quot;]</p>
         */
        public Builder eventCodes(String eventCodes) {
            this.putQueryParameter("eventCodes", eventCodes);
            this.eventCodes = eventCodes;
            return this;
        }

        /**
         * <p>End time, accurate to milliseconds (ms).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1753459199059</p>
         */
        public Builder eventEndTime(Long eventEndTime) {
            this.putQueryParameter("eventEndTime", eventEndTime);
            this.eventEndTime = eventEndTime;
            return this;
        }

        /**
         * <p>Field name</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        public Builder fieldName(String fieldName) {
            this.putQueryParameter("fieldName", fieldName);
            this.fieldName = fieldName;
            return this;
        }

        /**
         * <p>Field value</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder fieldValue(String fieldValue) {
            this.putQueryParameter("fieldValue", fieldValue);
            this.fieldValue = fieldValue;
            return this;
        }

        /**
         * <p>Page size, default value is 10</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Region code</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public DescribeAdvanceSearchPageListRequest build() {
            return new DescribeAdvanceSearchPageListRequest(this);
        } 

    } 

}
