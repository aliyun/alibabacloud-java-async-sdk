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
 * {@link DescribeCustomLineRequest} extends {@link RequestModel}
 *
 * <p>DescribeCustomLineRequest</p>
 */
public class DescribeCustomLineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LineId")
    private Long lineId;

    private DescribeCustomLineRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.lineId = builder.lineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomLineRequest create() {
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
     * @return lineId
     */
    public Long getLineId() {
        return this.lineId;
    }

    public static final class Builder extends Request.Builder<DescribeCustomLineRequest, Builder> {
        private String lang; 
        private Long lineId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCustomLineRequest request) {
            super(request);
            this.lang = request.lang;
            this.lineId = request.lineId;
        } 

        /**
         * <p>The language.</p>
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
         * <p>The unique ID of the custom line.</p>
         * 
         * <strong>example:</strong>
         * <p>597</p>
         */
        public Builder lineId(Long lineId) {
            this.putQueryParameter("LineId", lineId);
            this.lineId = lineId;
            return this;
        }

        @Override
        public DescribeCustomLineRequest build() {
            return new DescribeCustomLineRequest(this);
        } 

    } 

}
