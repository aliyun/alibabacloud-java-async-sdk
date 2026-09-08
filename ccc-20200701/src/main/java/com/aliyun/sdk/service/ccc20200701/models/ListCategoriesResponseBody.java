// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListCategoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCategoriesResponseBody</p>
 */
public class ListCategoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<String> params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListCategoriesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCategoriesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return params
     */
    public java.util.List<String> getParams() {
        return this.params;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String data; 
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List<String> params; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListCategoriesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data. The category node information, in the format of a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;categoryId\&quot;:\&quot;43c2671b-8939-4223-<strong><strong>-6bd187905cc8\&quot;,\&quot;childCategoryList\&quot;:[{\&quot;categoryId\&quot;:\&quot;120816ad-4392-4edf-</strong></strong>-6d053d5cfa5a\&quot;,\&quot;childCategoryList\&quot;:[],\&quot;deleted\&quot;:0,\&quot;editor\&quot;:\&quot;283277706217028904\&quot;,\&quot;editorName\&quot;:\&quot;283277706217028904\&quot;,\&quot;instanceId\&quot;:\&quot;cccV2-kmz\&quot;,\&quot;itemCount\&quot;:0,\&quot;level\&quot;:2,\&quot;name\&quot;:\&quot;客户反馈\&quot;,\&quot;parentCategoryId\&quot;:\&quot;43c2671b-8939-<strong><strong>-86d0-6bd187905cc8\&quot;,\&quot;type\&quot;:\&quot;Ticket\&quot;}],\&quot;deleted\&quot;:0,\&quot;editor\&quot;:\&quot;283277706217028904\&quot;,\&quot;editorName\&quot;:\&quot;283277706217028904\&quot;,\&quot;instanceId\&quot;:\&quot;cccV2-kmz\&quot;,\&quot;itemCount\&quot;:10,\&quot;level\&quot;:1,\&quot;name\&quot;:\&quot;测试一01类目\&quot;,\&quot;type\&quot;:\&quot;Ticket\&quot;},{\&quot;categoryId\&quot;:\&quot;4948fcd0-2972-</strong></strong>-81c6-1a00927e1802\&quot;,\&quot;childCategoryList\&quot;:[],\&quot;deleted\&quot;:0,\&quot;editor\&quot;:\&quot;283277706217028904\&quot;,\&quot;editorName\&quot;:\&quot;283277706217028904\&quot;,\&quot;instanceId\&quot;:\&quot;cccV2-kmz\&quot;,\&quot;itemCount\&quot;:0,\&quot;level\&quot;:1,\&quot;name\&quot;:\&quot;生产环境验证\&quot;,\&quot;type\&quot;:\&quot;Ticket\&quot;},{\&quot;categoryId\&quot;:\&quot;c426bd7f-9661-47c3-****-2508f1a32f66\&quot;,\&quot;childCategoryList\&quot;:[],\&quot;deleted\&quot;:0,\&quot;editor\&quot;:\&quot;269801834095770945\&quot;,\&quot;editorName\&quot;:\&quot;269801834095770945\&quot;,\&quot;instanceId\&quot;:\&quot;cccV2-kmz\&quot;,\&quot;itemCount\&quot;:4,\&quot;level\&quot;:1,\&quot;name\&quot;:\&quot;测试环境测试\&quot;,\&quot;type\&quot;:\&quot;Ticket\&quot;}]</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The list of incorrect parameters.</p>
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DE803553-8AA9-4B9D-9E4E-A82BC69EDCEE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCategoriesResponseBody build() {
            return new ListCategoriesResponseBody(this);
        } 

    } 

}
