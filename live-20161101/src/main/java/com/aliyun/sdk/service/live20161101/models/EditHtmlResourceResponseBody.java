// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditHtmlResourceResponseBody} extends {@link TeaModel}
 *
 * <p>EditHtmlResourceResponseBody</p>
 */
public class EditHtmlResourceResponseBody extends TeaModel {
    @NameInMap("HtmlResourceId")
    private String htmlResourceId;

    @NameInMap("RequestId")
    private String requestId;

    private EditHtmlResourceResponseBody(Builder builder) {
        this.htmlResourceId = builder.htmlResourceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditHtmlResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return htmlResourceId
     */
    public String getHtmlResourceId() {
        return this.htmlResourceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String htmlResourceId; 
        private String requestId; 

        /**
         * HtmlResourceId.
         */
        public Builder htmlResourceId(String htmlResourceId) {
            this.htmlResourceId = htmlResourceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EditHtmlResourceResponseBody build() {
            return new EditHtmlResourceResponseBody(this);
        } 

    } 

}
