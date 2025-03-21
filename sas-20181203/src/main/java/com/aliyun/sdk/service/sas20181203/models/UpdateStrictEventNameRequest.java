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
 * {@link UpdateStrictEventNameRequest} extends {@link RequestModel}
 *
 * <p>UpdateStrictEventNameRequest</p>
 */
public class UpdateStrictEventNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventNameList")
    private java.util.List<String> eventNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operator")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operator;

    private UpdateStrictEventNameRequest(Builder builder) {
        super(builder);
        this.eventNameList = builder.eventNameList;
        this.lang = builder.lang;
        this.operator = builder.operator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStrictEventNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventNameList
     */
    public java.util.List<String> getEventNameList() {
        return this.eventNameList;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    public static final class Builder extends Request.Builder<UpdateStrictEventNameRequest, Builder> {
        private java.util.List<String> eventNameList; 
        private String lang; 
        private String operator; 

        private Builder() {
            super();
        } 

        private Builder(UpdateStrictEventNameRequest request) {
            super(request);
            this.eventNameList = request.eventNameList;
            this.lang = request.lang;
            this.operator = request.operator;
        } 

        /**
         * <p>List of strict alarms to be operated on. This list is a complete list, and any strict alarms not included in this list will have the opposite operation performed.</p>
         * <blockquote>
         * <h2>You can call <a href="~~DescribeStrictEventName~~">DescribeStrictEventName</a> to get the list of all strict mode alarms.</h2>
         * </blockquote>
         */
        public Builder eventNameList(java.util.List<String> eventNameList) {
            this.putQueryParameter("EventNameList", eventNameList);
            this.eventNameList = eventNameList;
            return this;
        }

        /**
         * <p>Sets the language type for requests and received messages, default is <strong>zh</strong>. Values:</p>
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
         * <p>Operation rule determination operator:</p>
         * <ul>
         * <li><em>on</em>: Turn on the alarm</li>
         * <li><em>off</em>: Turn off the alarm</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder operator(String operator) {
            this.putQueryParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        @Override
        public UpdateStrictEventNameRequest build() {
            return new UpdateStrictEventNameRequest(this);
        } 

    } 

}
