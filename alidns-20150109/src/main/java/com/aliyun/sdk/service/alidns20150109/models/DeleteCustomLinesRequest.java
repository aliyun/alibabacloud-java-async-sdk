// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DeleteCustomLinesRequest} extends {@link RequestModel}
 *
 * <p>DeleteCustomLinesRequest</p>
 */
public class DeleteCustomLinesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LineIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String lineIds;

    private DeleteCustomLinesRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.lineIds = builder.lineIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustomLinesRequest create() {
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
     * @return lineIds
     */
    public String getLineIds() {
        return this.lineIds;
    }

    public static final class Builder extends Request.Builder<DeleteCustomLinesRequest, Builder> {
        private String lang; 
        private String lineIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCustomLinesRequest request) {
            super(request);
            this.lang = request.lang;
            this.lineIds = request.lineIds;
        } 

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The unique IDs of the custom lines that you want to delete. Separate the unique IDs with commas (,). You can call the <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-describecustomlines?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeCustomLines</a> operation to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234,1235</p>
         */
        public Builder lineIds(String lineIds) {
            this.putQueryParameter("LineIds", lineIds);
            this.lineIds = lineIds;
            return this;
        }

        @Override
        public DeleteCustomLinesRequest build() {
            return new DeleteCustomLinesRequest(this);
        } 

    } 

}
