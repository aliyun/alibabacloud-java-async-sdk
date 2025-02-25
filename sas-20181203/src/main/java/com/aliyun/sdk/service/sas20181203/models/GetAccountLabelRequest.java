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
 * {@link GetAccountLabelRequest} extends {@link RequestModel}
 *
 * <p>GetAccountLabelRequest</p>
 */
public class GetAccountLabelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabelList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> labelList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private GetAccountLabelRequest(Builder builder) {
        super(builder);
        this.labelList = builder.labelList;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountLabelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return labelList
     */
    public java.util.List<String> getLabelList() {
        return this.labelList;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<GetAccountLabelRequest, Builder> {
        private java.util.List<String> labelList; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(GetAccountLabelRequest request) {
            super(request);
            this.labelList = request.labelList;
            this.lang = request.lang;
        } 

        /**
         * <p>The tags.</p>
         * <p>This parameter is required.</p>
         */
        public Builder labelList(java.util.List<String> labelList) {
            this.putQueryParameter("LabelList", labelList);
            this.labelList = labelList;
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

        @Override
        public GetAccountLabelRequest build() {
            return new GetAccountLabelRequest(this);
        } 

    } 

}
